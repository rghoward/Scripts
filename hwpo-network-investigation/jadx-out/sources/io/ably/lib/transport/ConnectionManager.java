package io.ably.lib.transport;

import defpackage.jl;
import defpackage.z97;
import io.ably.lib.debug.DebugOptions;
import io.ably.lib.http.HttpHelpers;
import io.ably.lib.objects.LiveObjectsPlugin;
import io.ably.lib.realtime.AblyRealtime;
import io.ably.lib.realtime.Channel;
import io.ably.lib.realtime.ChannelState;
import io.ably.lib.realtime.CompletionListener;
import io.ably.lib.realtime.Connection;
import io.ably.lib.realtime.ConnectionState;
import io.ably.lib.realtime.ConnectionStateListener;
import io.ably.lib.rest.Auth;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.Callback;
import io.ably.lib.types.ClientOptions;
import io.ably.lib.types.ConnectionDetails;
import io.ably.lib.types.ErrorInfo;
import io.ably.lib.types.Param;
import io.ably.lib.types.ProtocolMessage;
import io.ably.lib.types.ProtocolSerializer;
import io.ably.lib.types.PublishResult;
import io.ably.lib.util.Log;
import io.ably.lib.util.PlatformAgentProvider;
import io.ably.lib.util.ReconnectionStrategy;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class ConnectionManager implements ITransport.ConnectListener {
    private static final long HEARTBEAT_TIMEOUT = 5000;
    private static final String INTERNET_CHECK_OK = "yes";
    private static final String INTERNET_CHECK_URL = "https://internet-up.ably-realtime.com/is-the-internet-up.txt";
    private static final String TAG = "io.ably.lib.transport.ConnectionManager";
    final AblyRealtime ably;
    private final Channels channels;
    private final Connection connection;
    private long connectionStateTtl;
    private CMConnectivityListener connectivityListener;
    private State currentState;
    private int disconnectedRetryAttempt;
    private Thread handlerThread;
    private final Hosts hosts;
    private long lastActivity;
    private String lastUsedHost;
    private final LiveObjectsPlugin liveObjectsPlugin;
    long maxIdleInterval;
    public int maxMessageSize;
    public long msgSerial;
    private ConnectParams pendingConnect;
    private final PlatformAgentProvider platformAgentProvider;
    private final DebugOptions.RawProtocolListener protocolListener;
    public String siteCode;
    private ErrorInfo stateError;
    private final Map<ConnectionState, State> states;
    private boolean suppressRetry;
    private long suspendTime;
    private volatile ITransport transport;
    private final ITransport.Factory transportFactory;
    static ErrorInfo REASON_CLOSED = new ErrorInfo("Can't attach when not in an active state", 200, 10000);
    static ErrorInfo REASON_DISCONNECTED = new ErrorInfo("Connection temporarily unavailable", 503, 80003);
    static ErrorInfo REASON_SUSPENDED = new ErrorInfo("Connection unavailable", 503, 80002);
    static ErrorInfo REASON_FAILED = new ErrorInfo("Connection failed", CarouselScreenFragment.CAROUSEL_ANIMATION_MS, 80000);
    static ErrorInfo REASON_REFUSED = new ErrorInfo("Access refused", 401, 40100);
    static ErrorInfo REASON_TOO_BIG = new ErrorInfo("Connection closed; message too large", CarouselScreenFragment.CAROUSEL_ANIMATION_MS, 40000);
    final ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
    private boolean cleaningUpAfterEnteringTerminalState = false;
    private volatile boolean closeRequested = false;
    public Long objectsGCGracePeriod = null;
    private final List<QueuedMessage> queuedMessages = new ArrayList();
    private final PendingMessageQueue pendingMessages = new PendingMessageQueue(0 == true ? 1 : 0);
    private final HashSet<Object> heartbeatWaiters = new HashSet<>();
    private final ActionQueue actionQueue = new ActionQueue(0 == true ? 1 : 0);

    /* JADX INFO: renamed from: io.ably.lib.transport.ConnectionManager$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$ably$lib$realtime$ConnectionState;
        static final /* synthetic */ int[] $SwitchMap$io$ably$lib$types$ProtocolMessage$Action;

        static {
            int[] iArr = new int[ProtocolMessage.Action.values().length];
            $SwitchMap$io$ably$lib$types$ProtocolMessage$Action = iArr;
            try {
                iArr[ProtocolMessage.Action.heartbeat.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$ably$lib$types$ProtocolMessage$Action[ProtocolMessage.Action.error.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$ably$lib$types$ProtocolMessage$Action[ProtocolMessage.Action.connected.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$ably$lib$types$ProtocolMessage$Action[ProtocolMessage.Action.disconnect.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$ably$lib$types$ProtocolMessage$Action[ProtocolMessage.Action.disconnected.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$ably$lib$types$ProtocolMessage$Action[ProtocolMessage.Action.closed.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$io$ably$lib$types$ProtocolMessage$Action[ProtocolMessage.Action.ack.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$io$ably$lib$types$ProtocolMessage$Action[ProtocolMessage.Action.nack.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$io$ably$lib$types$ProtocolMessage$Action[ProtocolMessage.Action.auth.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$io$ably$lib$types$ProtocolMessage$Action[ProtocolMessage.Action.object.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$io$ably$lib$types$ProtocolMessage$Action[ProtocolMessage.Action.object_sync.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            int[] iArr2 = new int[ConnectionState.values().length];
            $SwitchMap$io$ably$lib$realtime$ConnectionState = iArr2;
            try {
                iArr2[ConnectionState.connected.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$io$ably$lib$realtime$ConnectionState[ConnectionState.connecting.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$io$ably$lib$realtime$ConnectionState[ConnectionState.disconnected.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface Action extends Runnable {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class ActionHandler implements Runnable {
        public ActionHandler() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StateIndication stateIndicationOnTimeout;
            while (true) {
                synchronized (ConnectionManager.this) {
                    while (ConnectionManager.this.actionQueue.size() == 0) {
                        try {
                            boolean z = ConnectionManager.this.currentState.terminal;
                            ConnectionManager connectionManager = ConnectionManager.this;
                            if (z) {
                                connectionManager.handlerThread = null;
                                ConnectionManager.this.stopConnectivityListener();
                                ConnectionManager.this.cleaningUpAfterEnteringTerminalState = false;
                                ConnectionManager.this.notifyAll();
                                return;
                            }
                            connectionManager.tryWait(connectionManager.currentState.timeout);
                            Action actionPeek = ConnectionManager.this.actionQueue.peek();
                            if (actionPeek != null) {
                                Log.d(ConnectionManager.TAG, "Wait ended by action: " + actionPeek.toString());
                                break;
                            }
                            if (!ConnectionManager.this.suppressRetry && (stateIndicationOnTimeout = ConnectionManager.this.currentState.onTimeout()) != null) {
                                ConnectionManager.this.requestState(stateIndicationOnTimeout);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                while (true) {
                    Action actionPoll = ConnectionManager.this.actionQueue.poll();
                    if (actionPoll != null) {
                        try {
                            actionPoll.run();
                        } catch (Exception e) {
                            Log.e(ConnectionManager.TAG, "Action invocation failed with exception: action = " + actionPoll.toString(), e);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface Channels {
        void onMessage(ProtocolMessage protocolMessage);

        void suspendAll(ErrorInfo errorInfo, boolean z);

        void transferToChannelQueue(List<QueuedMessage> list);

        Iterable<Channel> values();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class Closed extends State {
        public Closed() {
            super(ConnectionState.closed, false, false, true, 0L, ConnectionManager.REASON_CLOSED);
        }

        @Override // io.ably.lib.transport.ConnectionManager.State
        public void enactForChannel(StateIndication stateIndication, ConnectionStateListener.ConnectionStateChange connectionStateChange, Channel channel) {
            channel.setConnectionClosed(ConnectionManager.REASON_CLOSED);
        }

        @Override // io.ably.lib.transport.ConnectionManager.State
        public StateIndication validateTransition(StateIndication stateIndication) {
            if (stateIndication.state == ConnectionState.connecting) {
                return stateIndication;
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class Closing extends State {
        public Closing() {
            super(ConnectionState.closing, false, false, false, Defaults.TIMEOUT_CONNECT, ConnectionManager.REASON_CLOSED);
        }

        @Override // io.ably.lib.transport.ConnectionManager.State
        public void enact(StateIndication stateIndication, ConnectionStateListener.ConnectionStateChange connectionStateChange) {
            super.enact(stateIndication, connectionStateChange);
            if (ConnectionManager.this.closeImpl(connectionStateChange.previous == ConnectionState.connecting)) {
                ConnectionManager connectionManager = ConnectionManager.this;
                connectionManager.addAction(connectionManager.new AsynchronousStateChangeAction(ConnectionState.closed));
            }
        }

        @Override // io.ably.lib.transport.ConnectionManager.State
        public StateIndication onTimeout() {
            return new StateIndication(ConnectionState.closed);
        }

        @Override // io.ably.lib.transport.ConnectionManager.State
        public StateIndication validateTransition(StateIndication stateIndication) {
            ConnectionState connectionState = stateIndication.state;
            if (connectionState == this.state) {
                return null;
            }
            return (connectionState == ConnectionState.disconnected || connectionState == ConnectionState.suspended) ? new StateIndication(ConnectionState.closed) : stateIndication;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class ConnectParams extends ITransport.TransportParams {
        public ConnectParams(ClientOptions clientOptions, PlatformAgentProvider platformAgentProvider) {
            super(clientOptions, platformAgentProvider);
            this.connectionKey = ConnectionManager.this.connection.key;
            this.port = Defaults.getPort(clientOptions);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class Connected extends State {
        public Connected() {
            super(ConnectionState.connected, false, true, false, 0L, null);
        }

        @Override // io.ably.lib.transport.ConnectionManager.State
        public void enact(StateIndication stateIndication, ConnectionStateListener.ConnectionStateChange connectionStateChange) {
            super.enact(stateIndication, connectionStateChange);
            ConnectionManager.this.pendingConnect = null;
        }

        @Override // io.ably.lib.transport.ConnectionManager.State
        public void enactForChannel(StateIndication stateIndication, ConnectionStateListener.ConnectionStateChange connectionStateChange, Channel channel) {
            channel.setConnected();
        }

        @Override // io.ably.lib.transport.ConnectionManager.State
        public StateIndication validateTransition(StateIndication stateIndication) {
            if (stateIndication.state != this.state) {
                return stateIndication;
            }
            ConnectionManager connectionManager = ConnectionManager.this;
            connectionManager.addAction(connectionManager.new UpdateAction(null));
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class Failed extends State {
        public Failed() {
            super(ConnectionState.failed, false, false, true, 0L, ConnectionManager.REASON_FAILED);
        }

        @Override // io.ably.lib.transport.ConnectionManager.State
        public void enact(StateIndication stateIndication, ConnectionStateListener.ConnectionStateChange connectionStateChange) {
            super.enact(stateIndication, connectionStateChange);
            ConnectionManager.this.clearTransport();
        }

        @Override // io.ably.lib.transport.ConnectionManager.State
        public void enactForChannel(StateIndication stateIndication, ConnectionStateListener.ConnectionStateChange connectionStateChange, Channel channel) {
            channel.setConnectionFailed(stateIndication.reason);
        }

        @Override // io.ably.lib.transport.ConnectionManager.State
        public StateIndication validateTransition(StateIndication stateIndication) {
            if (stateIndication.state == ConnectionState.connecting) {
                return stateIndication;
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class HeartbeatWaiter extends Thread {
        private final CompletionListener listener;

        public HeartbeatWaiter(CompletionListener completionListener) {
            this.listener = completionListener;
        }

        private boolean clear() {
            boolean zRemove = ConnectionManager.this.heartbeatWaiters.remove(this);
            if (zRemove) {
                interrupt();
            }
            return zRemove;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onError(ErrorInfo errorInfo) {
            clear();
            CompletionListener completionListener = this.listener;
            if (completionListener != null) {
                completionListener.onError(errorInfo);
            }
        }

        private void onSuccess() {
            clear();
            CompletionListener completionListener = this.listener;
            if (completionListener != null) {
                completionListener.onSuccess();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            boolean zClear;
            synchronized (ConnectionManager.this.heartbeatWaiters) {
                try {
                    ConnectionManager.this.heartbeatWaiters.wait(ConnectionManager.HEARTBEAT_TIMEOUT);
                } catch (InterruptedException unused) {
                }
                zClear = clear();
            }
            if (zClear) {
                onError(new ErrorInfo("Timed out waiting for heartbeat response", 50000, 500));
            } else {
                onSuccess();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class Initialized extends State {
        public Initialized() {
            super(ConnectionState.initialized, true, false, false, 0L, null);
        }

        @Override // io.ably.lib.transport.ConnectionManager.State
        public StateIndication validateTransition(StateIndication stateIndication) {
            if (stateIndication.state == this.state) {
                return null;
            }
            return stateIndication;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class QueuedMessage {
        public final Callback<PublishResult> listener;
        public final ProtocolMessage msg;

        public QueuedMessage(ProtocolMessage protocolMessage, Callback<PublishResult> callback) {
            this.msg = protocolMessage;
            this.listener = callback;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public abstract class StateChangeAction {
        protected ConnectionStateListener.ConnectionStateChange change;
        protected final StateIndication stateIndication;
        protected final ITransport transport;

        public StateChangeAction(ITransport iTransport, StateIndication stateIndication) {
            this.transport = iTransport;
            this.stateIndication = stateIndication;
        }

        public void enactState() {
            if (this.change != null) {
                ((State) ConnectionManager.this.states.get(this.stateIndication.state)).enact(this.stateIndication, this.change);
                ConnectionStateListener.ConnectionStateChange connectionStateChange = this.change;
                if (connectionStateChange.current != connectionStateChange.previous) {
                    ConnectionManager.this.connection.onConnectionStateChange(this.change);
                }
                if (ConnectionManager.this.currentState.terminal) {
                    ConnectionManager.this.clearTransport();
                }
            }
        }

        public void setState() {
            this.change = ConnectionManager.this.setState(this.transport, this.stateIndication);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class Suspended extends State {
        public Suspended() {
            super(ConnectionState.suspended, false, false, false, ConnectionManager.this.ably.options.suspendedRetryTimeout, ConnectionManager.REASON_SUSPENDED);
        }

        @Override // io.ably.lib.transport.ConnectionManager.State
        public void enactForChannel(StateIndication stateIndication, ConnectionStateListener.ConnectionStateChange connectionStateChange, Channel channel) {
            channel.setSuspended(this.defaultErrorInfo, true);
        }

        @Override // io.ably.lib.transport.ConnectionManager.State
        public StateIndication onTimeout() {
            return new StateIndication(ConnectionState.connecting);
        }

        @Override // io.ably.lib.transport.ConnectionManager.State
        public StateIndication validateTransition(StateIndication stateIndication) {
            ConnectionState connectionState = stateIndication.state;
            if (connectionState == this.state) {
                return null;
            }
            return connectionState == ConnectionState.closing ? new StateIndication(ConnectionState.closed) : stateIndication;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class SynchronousStateChangeAction extends StateChangeAction implements Action {
        public SynchronousStateChangeAction(ITransport iTransport, StateIndication stateIndication) {
            super(iTransport, stateIndication);
            setState();
        }

        @Override // java.lang.Runnable
        public void run() {
            enactState();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class UpdateAction implements Action {
        private final ErrorInfo reason;

        public UpdateAction(ErrorInfo errorInfo) {
            this.reason = errorInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            ConnectionManager.this.connection.emitUpdate(this.reason);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConnectionManager(AblyRealtime ablyRealtime, Connection connection, Channels channels, PlatformAgentProvider platformAgentProvider, LiveObjectsPlugin liveObjectsPlugin) {
        ITransport.Factory factory;
        DebugOptions.RawProtocolListener rawProtocolListener = null;
        HashMap map = new HashMap();
        this.states = map;
        this.connectionStateTtl = Defaults.connectionStateTtl;
        this.maxMessageSize = Defaults.maxMessageSize;
        this.maxIdleInterval = Defaults.maxIdleInterval;
        this.disconnectedRetryAttempt = 0;
        this.ably = ablyRealtime;
        this.connection = connection;
        this.channels = channels;
        this.platformAgentProvider = platformAgentProvider;
        this.liveObjectsPlugin = liveObjectsPlugin;
        ClientOptions clientOptions = ablyRealtime.options;
        this.hosts = new Hosts(clientOptions.realtimeHost, Defaults.HOST_REALTIME, clientOptions);
        if (clientOptions instanceof DebugOptions) {
            DebugOptions debugOptions = (DebugOptions) clientOptions;
            rawProtocolListener = debugOptions.protocolListener;
            factory = debugOptions.transportFactory;
        } else {
            factory = null;
        }
        this.protocolListener = rawProtocolListener;
        this.transportFactory = factory == null ? Defaults.TRANSPORT : factory;
        ConnectionState connectionState = ConnectionState.initialized;
        map.put(connectionState, new Initialized());
        map.put(ConnectionState.connecting, new Connecting());
        map.put(ConnectionState.connected, new Connected());
        map.put(ConnectionState.disconnected, new Disconnected());
        map.put(ConnectionState.suspended, new Suspended());
        map.put(ConnectionState.closing, new Closing());
        map.put(ConnectionState.closed, new Closed());
        map.put(ConnectionState.failed, new Failed());
        this.currentState = (State) map.get(connectionState);
        setSuspendTime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void addAction(Action action) {
        this.actionQueue.add(action);
        notifyAll();
    }

    private void addPendingMessagesToQueuedMessages(boolean z) {
        synchronized (this) {
            try {
                List<QueuedMessage> listPopAll = this.pendingMessages.popAll();
                if (z) {
                    this.msgSerial = 0L;
                } else if (!listPopAll.isEmpty()) {
                    this.msgSerial = listPopAll.get(0).msg.msgSerial.longValue();
                }
                this.queuedMessages.addAll(0, listPopAll);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean checkConnectionStale() {
        if (this.lastActivity == 0 || System.currentTimeMillis() - this.lastActivity <= this.maxIdleInterval + this.connectionStateTtl) {
            return false;
        }
        if (this.connection.key == null) {
            return true;
        }
        Log.v(TAG, "Clearing stale connection key to suppress resume");
        Connection connection = this.connection;
        connection.key = null;
        connection.recoveryKey = null;
        return true;
    }

    private StateIndication checkFallback(ErrorInfo errorInfo) {
        String fallback;
        if (this.pendingConnect == null || ((errorInfo != null && errorInfo.statusCode < 500) || !checkConnectivity() || (fallback = this.hosts.getFallback(this.pendingConnect.host)) == null)) {
            this.pendingConnect = null;
            return null;
        }
        Log.v(TAG, "checkFallback: fallback to ".concat(fallback));
        return new StateIndication(ConnectionState.connecting, null, fallback, this.pendingConnect.host);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized StateIndication checkSuspended(ErrorInfo errorInfo) {
        boolean z;
        try {
            long jCurrentTimeMillis = this.suspendTime - System.currentTimeMillis();
            z = jCurrentTimeMillis <= 0;
            Log.v(TAG, "checkSuspended: timeToSuspend = " + jCurrentTimeMillis + "ms; suspendMode = " + z);
        } catch (Throwable th) {
            throw th;
        }
        return new StateIndication(z ? ConnectionState.suspended : ConnectionState.disconnected, errorInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cleanMsgSerialAndErrorReason() {
        this.msgSerial = 0L;
        this.connection.reason = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTransport() {
        if (this.transport != null) {
            this.transport.close();
            this.transport = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean closeImpl(boolean z) {
        if (this.transport == null) {
            return true;
        }
        if (z) {
            return false;
        }
        return !trySendCloseProtocolMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void connectImpl(StateIndication stateIndication) {
        ITransport iTransport;
        String preferredHost = stateIndication.fallback;
        if (preferredHost == null) {
            preferredHost = this.hosts.getPreferredHost();
        }
        checkConnectionStale();
        ConnectParams connectParams = new ConnectParams(this.ably.options, this.platformAgentProvider);
        this.pendingConnect = connectParams;
        connectParams.host = preferredHost;
        this.lastUsedHost = preferredHost;
        try {
            ITransport transport = this.transportFactory.getTransport(connectParams, this);
            synchronized (this) {
                iTransport = this.transport;
                this.transport = transport;
            }
            if (iTransport != null) {
                iTransport.close();
            }
            transport.connect(this);
            DebugOptions.RawProtocolListener rawProtocolListener = this.protocolListener;
            if (rawProtocolListener != null) {
                rawProtocolListener.onRawConnectRequested(transport.getURL());
            }
        } catch (Exception e) {
            Log.e(getClass().getName(), "Unable to instance transport class", e);
            jl.a("Unable to instance transport class", e);
        }
    }

    private synchronized List<QueuedMessage> extractConnectionQueuePresenceMessages() {
        ArrayList arrayList;
        Iterator<QueuedMessage> it = this.queuedMessages.iterator();
        arrayList = new ArrayList();
        while (it.hasNext()) {
            QueuedMessage next = it.next();
            if (next.msg.presence != null) {
                arrayList.add(next);
                it.remove();
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void failQueuedMessages(ErrorInfo errorInfo) {
        synchronized (this) {
            try {
                Iterator<QueuedMessage> it = this.queuedMessages.iterator();
                while (it.hasNext()) {
                    Callback<PublishResult> callback = it.next().listener;
                    if (callback != null) {
                        try {
                            callback.onError(errorInfo);
                        } catch (Throwable th) {
                            Log.e(TAG, "failQueuedMessages(): Unexpected error calling listener", th);
                        }
                    }
                }
                this.queuedMessages.clear();
                this.pendingMessages.fail(errorInfo);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleReauth() {
        ErrorInfo errorInfo;
        if (this.currentState.state == ConnectionState.connected) {
            Log.v(TAG, "Server initiated reauth");
            try {
                this.ably.auth.renew();
                errorInfo = null;
            } catch (AblyException e) {
                errorInfo = e.errorInfo;
            }
            if (this.currentState.state == ConnectionState.connected) {
                this.connection.emitUpdate(errorInfo);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasConnectBeenInvokeOnClosedOrFailedState(ConnectionStateListener.ConnectionStateChange connectionStateChange) {
        ConnectionState connectionState = connectionStateChange.previous;
        return connectionState == ConnectionState.failed || connectionState == ConnectionState.closed || connectionState == ConnectionState.closing;
    }

    private boolean isFatalError(ErrorInfo errorInfo) {
        if (errorInfo.code != 0) {
            if (isTokenError(errorInfo)) {
                return false;
            }
            int i = errorInfo.code;
            if (i >= 40000 && i < 50000) {
                return true;
            }
        }
        int i2 = errorInfo.statusCode;
        return i2 != 0 && i2 < 500;
    }

    private boolean isTokenError(ErrorInfo errorInfo) {
        int i = errorInfo.code;
        if (i < 40140 || i >= 40150) {
            return i == 80019 && errorInfo.statusCode == 401;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAuthUpdatedAsync$0(ConnectionWaiter connectionWaiter, Auth.AuthUpdateResult authUpdateResult) {
        boolean z = true;
        while (z) {
            ErrorInfo errorInfoWaitForChange = connectionWaiter.waitForChange();
            ConnectionState connectionState = this.currentState.state;
            int i = AnonymousClass1.$SwitchMap$io$ably$lib$realtime$ConnectionState[connectionState.ordinal()];
            if (i == 1) {
                authUpdateResult.onUpdate(true, null);
                Log.v(TAG, "onAuthUpdated: got connected");
            } else if (i == 2 || i == 3) {
                Log.v(TAG, "onAuthUpdated: " + connectionState);
            } else {
                Log.v(TAG, "onAuthUpdated: throwing exception");
                authUpdateResult.onUpdate(false, errorInfoWaitForChange);
            }
            z = false;
        }
        connectionWaiter.close();
    }

    private void onAck(ProtocolMessage protocolMessage) {
        this.pendingMessages.ack(protocolMessage.msgSerial.longValue(), protocolMessage.count, protocolMessage.res, protocolMessage.error);
    }

    private void onChannelMessage(ProtocolMessage protocolMessage) {
        this.channels.onMessage(protocolMessage);
        Connection connection = this.connection;
        connection.recoveryKey = connection.createRecoveryKey();
    }

    private synchronized void onClosed(ProtocolMessage protocolMessage) {
        try {
            if (protocolMessage.error != null) {
                onError(protocolMessage);
            } else {
                this.connection.key = null;
                requestState(new StateIndication(ConnectionState.closed, null));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void onConnected(ProtocolMessage protocolMessage) {
        try {
            this.ably.options.recover = null;
            Connection connection = this.connection;
            connection.reason = protocolMessage.error;
            if (connection.id != null) {
                String str = TAG;
                Log.d(str, "There was a connection resume");
                boolean zEquals = protocolMessage.connectionId.equals(this.connection.id);
                ErrorInfo errorInfo = protocolMessage.error;
                if (zEquals) {
                    if (errorInfo == null) {
                        Log.d(str, "connection has reconnected and resumed successfully");
                    } else {
                        Log.d(str, "connection resume success with non-fatal error: " + protocolMessage.error.message);
                    }
                    addPendingMessagesToQueuedMessages(false);
                } else {
                    if (errorInfo != null) {
                        Log.d(str, "connection resume failed with error: " + protocolMessage.error.message);
                    } else {
                        Log.d(str, "connection resume failed without error");
                    }
                    addPendingMessagesToQueuedMessages(true);
                    this.channels.transferToChannelQueue(extractConnectionQueuePresenceMessages());
                }
            } else {
                this.msgSerial = 0L;
            }
            Connection connection2 = this.connection;
            connection2.id = protocolMessage.connectionId;
            ConnectionDetails connectionDetails = protocolMessage.connectionDetails;
            connection2.key = connectionDetails.connectionKey;
            this.maxIdleInterval = connectionDetails.maxIdleInterval.longValue();
            this.connectionStateTtl = connectionDetails.connectionStateTtl.longValue();
            this.maxMessageSize = connectionDetails.maxMessageSize;
            this.siteCode = connectionDetails.siteCode;
            this.objectsGCGracePeriod = connectionDetails.objectsGCGracePeriod;
            try {
                this.ably.auth.setClientId(connectionDetails.clientId);
                Connection connection3 = this.connection;
                connection3.recoveryKey = connection3.createRecoveryKey();
                requestState(new StateIndication(ConnectionState.connected, protocolMessage.error, null, null));
            } catch (AblyException e) {
                requestState(this.transport, new StateIndication(ConnectionState.failed, e.errorInfo));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void onDisconnected(ProtocolMessage protocolMessage) {
        try {
            ErrorInfo errorInfo = protocolMessage.error;
            if (errorInfo != null && isTokenError(errorInfo)) {
                this.ably.auth.onAuthError(errorInfo);
            }
            requestState(new StateIndication(ConnectionState.disconnected, errorInfo));
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void onError(ProtocolMessage protocolMessage) {
        try {
            this.connection.key = null;
            ErrorInfo errorInfo = protocolMessage.error;
            if (isTokenError(errorInfo)) {
                this.ably.auth.onAuthError(errorInfo);
            }
            requestState(this.transport, new StateIndication(isFatalError(errorInfo) ? ConnectionState.failed : ConnectionState.disconnected, errorInfo));
        } catch (Throwable th) {
            throw th;
        }
    }

    private void onHeartbeat(ProtocolMessage protocolMessage) {
        synchronized (this.heartbeatWaiters) {
            this.heartbeatWaiters.clear();
            this.heartbeatWaiters.notifyAll();
        }
    }

    private void onNack(ProtocolMessage protocolMessage) {
        this.pendingMessages.nack(protocolMessage.msgSerial.longValue(), protocolMessage.count, protocolMessage.error);
    }

    private void reinitializeChannelsAfterReconnect() {
        for (Channel channel : this.channels.values()) {
            ChannelState channelState = channel.state;
            if (channelState == ChannelState.attached || channelState == ChannelState.attaching) {
                channel.setConnectionClosed(REASON_CLOSED);
            }
            channel.setReinitialized();
        }
    }

    private synchronized void requestState(ITransport iTransport, StateIndication stateIndication) {
        Log.v(TAG, "requestState(): requesting " + stateIndication.state + "; id = " + this.connection.id);
        addAction(new AsynchronousStateChangeAction(iTransport, stateIndication));
    }

    private void sendImpl(ProtocolMessage protocolMessage, Callback<PublishResult> callback) {
        if (this.transport == null) {
            Log.v(TAG, "sendImpl(): Discarding message; transport unavailable");
            return;
        }
        if (ProtocolMessage.ackRequired(protocolMessage)) {
            long j = this.msgSerial;
            this.msgSerial = 1 + j;
            protocolMessage.msgSerial = Long.valueOf(j);
            this.pendingMessages.push(new QueuedMessage(protocolMessage, callback));
        }
        DebugOptions.RawProtocolListener rawProtocolListener = this.protocolListener;
        if (rawProtocolListener != null) {
            rawProtocolListener.onRawMessageSend(protocolMessage);
        }
        this.transport.send(protocolMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendQueuedMessages() {
        synchronized (this) {
            while (!this.queuedMessages.isEmpty()) {
                try {
                    try {
                        QueuedMessage queuedMessage = this.queuedMessages.get(0);
                        if (queuedMessage.msg.action != ProtocolMessage.Action.attach) {
                            sendImpl(queuedMessage);
                        }
                    } catch (AblyException e) {
                        Log.e(TAG, "sendQueuedMessages(): Unexpected error sending queued messages", e);
                    }
                    this.queuedMessages.remove(0);
                } catch (Throwable th) {
                    this.queuedMessages.remove(0);
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized ConnectionStateListener.ConnectionStateChange setState(ITransport iTransport, StateIndication stateIndication) {
        if (iTransport != null) {
            if (iTransport != this.transport) {
                Log.v(TAG, "setState: action received for superseded transport; discarding");
                return null;
            }
        }
        StateIndication stateIndicationValidateTransition = this.currentState.validateTransition(stateIndication);
        if (stateIndicationValidateTransition == null) {
            Log.v(TAG, "setState(): not transitioning; not a valid transition " + stateIndication.state);
            return null;
        }
        ConnectionState connectionState = stateIndication.state;
        if (connectionState == ConnectionState.connected || connectionState == ConnectionState.suspended) {
            this.disconnectedRetryAttempt = 0;
        }
        ConnectionState connectionState2 = ConnectionState.disconnected;
        if (connectionState == connectionState2) {
            State state = this.states.get(connectionState2);
            long j = this.ably.options.disconnectedRetryTimeout;
            int i = this.disconnectedRetryAttempt + 1;
            this.disconnectedRetryAttempt = i;
            state.timeout = ReconnectionStrategy.getRetryTime(j, i);
        }
        ConnectionState connectionState3 = stateIndication.state;
        if (connectionState3 == ConnectionState.closing || connectionState3 == ConnectionState.closed || connectionState3 == ConnectionState.suspended || connectionState3 == ConnectionState.failed) {
            Connection connection = this.connection;
            connection.id = null;
            connection.key = null;
        }
        ConnectionState connectionState4 = stateIndicationValidateTransition.state;
        State state2 = this.states.get(connectionState4);
        ErrorInfo errorInfo = stateIndicationValidateTransition.reason;
        if (errorInfo == null) {
            errorInfo = state2.defaultErrorInfo;
        }
        ErrorInfo errorInfo2 = errorInfo;
        Log.v(TAG, "setState(): setting " + state2.state + "; reason " + errorInfo2);
        ConnectionStateListener.ConnectionStateChange connectionStateChange = new ConnectionStateListener.ConnectionStateChange(this.currentState.state, connectionState4, state2.timeout, errorInfo2);
        this.currentState = state2;
        this.cleaningUpAfterEnteringTerminalState = state2.terminal;
        this.stateError = errorInfo2;
        return connectionStateChange;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void setSuspendTime() {
        this.suspendTime = System.currentTimeMillis() + this.connectionStateTtl;
    }

    private void startConnectivityListener() {
        this.connectivityListener = new CMConnectivityListener(this, null);
        this.ably.platform.getNetworkConnectivity().addListener(this.connectivityListener);
    }

    private synchronized void startup() {
        while (this.cleaningUpAfterEnteringTerminalState) {
            try {
                Log.v(TAG, "Waiting for termination action to clean up handler thread");
                wait();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.handlerThread == null) {
            Thread thread = new Thread(new ActionHandler());
            this.handlerThread = thread;
            thread.start();
            startConnectivityListener();
        } else {
            Log.v(TAG, "`connect()` has been called twice on uninitialized or terminal state");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopConnectivityListener() {
        this.ably.platform.getNetworkConnectivity().removeListener(this.connectivityListener);
        this.connectivityListener = null;
    }

    private boolean trySendCloseProtocolMessage() {
        try {
            Log.v(TAG, "Requesting connection close");
            this.transport.send(new ProtocolMessage(ProtocolMessage.Action.close));
            return true;
        } catch (AblyException unused) {
            Log.v(TAG, "Closing incomplete transport");
            clearTransport();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tryWait(long j) {
        try {
            if (j == 0) {
                wait();
            } else {
                wait(j);
            }
        } catch (InterruptedException unused) {
        }
    }

    public boolean checkConnectivity() {
        try {
            return HttpHelpers.getUrlString(this.ably.httpCore, INTERNET_CHECK_URL).contains(INTERNET_CHECK_OK);
        } catch (AblyException e) {
            Log.d(TAG, "Exception whilst checking connectivity", e);
            return false;
        }
    }

    public void close() {
        this.closeRequested = true;
        requestState(ConnectionState.closing);
    }

    public synchronized void connect() {
        State state = this.currentState;
        if (state.terminal || state.state == ConnectionState.initialized) {
            try {
                startup();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                Log.e(TAG, "Failed to start up connection", e);
                return;
            }
        }
        if (this.closeRequested || this.currentState.terminal) {
            reinitializeChannelsAfterReconnect();
            this.closeRequested = false;
        }
        requestState(ConnectionState.connecting);
    }

    public void disconnectAndSuppressRetries() {
        if (this.transport != null) {
            this.transport.close();
        }
        this.suppressRetry = true;
    }

    public Param[] getAuthParams() {
        return this.ably.auth.getAuthParams();
    }

    public synchronized State getConnectionState() {
        return this.currentState;
    }

    public String getHost() {
        return this.lastUsedHost;
    }

    public List<QueuedMessage> getPendingMessages() {
        return this.pendingMessages.queue;
    }

    public ErrorInfo getStateErrorInfo() {
        ErrorInfo errorInfo = this.stateError;
        return errorInfo != null ? errorInfo : this.currentState.defaultErrorInfo;
    }

    public boolean isActive() {
        State state = this.currentState;
        return state.queueEvents || state.sendEvents;
    }

    public boolean isActiveTransport(WebSocketTransport webSocketTransport) {
        return webSocketTransport == this.transport;
    }

    public void onAuthError(ErrorInfo errorInfo) {
        String str = TAG;
        Locale locale = Locale.ROOT;
        Log.i(str, "onAuthError: (" + errorInfo.code + ") " + errorInfo.message);
        if (errorInfo.statusCode == 403) {
            this.connection.onConnectionStateChange(new ConnectionStateListener.ConnectionStateChange(this.connection.state, ConnectionState.failed, 0L, errorInfo));
            return;
        }
        int i = AnonymousClass1.$SwitchMap$io$ably$lib$realtime$ConnectionState[this.currentState.state.ordinal()];
        if (i == 1) {
            addAction(new UpdateAction(errorInfo));
        } else if (i == 2 && this.transport != null) {
            requestState(new StateIndication(ConnectionState.disconnected, errorInfo));
        }
    }

    public void onAuthUpdated(String str, boolean z) {
        ConnectionWaiter connectionWaiter = new ConnectionWaiter(this, null);
        try {
            int i = AnonymousClass1.$SwitchMap$io$ably$lib$realtime$ConnectionState[this.currentState.state.ordinal()];
            if (i == 1) {
                try {
                    ProtocolMessage protocolMessage = new ProtocolMessage(ProtocolMessage.Action.auth);
                    protocolMessage.auth = new ProtocolMessage.AuthDetails(str);
                    send(protocolMessage, false, null);
                } catch (AblyException unused) {
                    Log.v(TAG, "onAuthUpdated: closing transport after send failure");
                    this.transport.close();
                }
            } else if (i != 2) {
                connect();
            } else {
                Log.v(TAG, "onAuthUpdated: closing connecting transport");
                requestState(new StateIndication(ConnectionState.disconnected, new ErrorInfo("Aborting incomplete connection with superseded auth params", 503, 80003), null, null));
                connect();
            }
            if (!z) {
                connectionWaiter.close();
                return;
            }
            boolean z2 = true;
            while (z2) {
                ErrorInfo errorInfoWaitForChange = connectionWaiter.waitForChange();
                ConnectionState connectionState = this.currentState.state;
                int i2 = AnonymousClass1.$SwitchMap$io$ably$lib$realtime$ConnectionState[connectionState.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2 && i2 != 3) {
                        Log.v(TAG, "onAuthUpdated: throwing exception");
                        throw AblyException.fromErrorInfo(errorInfoWaitForChange);
                    }
                    Log.v(TAG, "onAuthUpdated: " + connectionState);
                } else {
                    Log.v(TAG, "onAuthUpdated: got connected");
                    z2 = false;
                }
            }
            connectionWaiter.close();
        } catch (Throwable th) {
            connectionWaiter.close();
            throw th;
        }
    }

    public void onAuthUpdatedAsync(String str, final Auth.AuthUpdateResult authUpdateResult) {
        final ConnectionWaiter connectionWaiter = new ConnectionWaiter(this, null);
        int i = AnonymousClass1.$SwitchMap$io$ably$lib$realtime$ConnectionState[this.currentState.state.ordinal()];
        if (i == 1) {
            try {
                ProtocolMessage protocolMessage = new ProtocolMessage(ProtocolMessage.Action.auth);
                protocolMessage.auth = new ProtocolMessage.AuthDetails(str);
                send(protocolMessage, false, null);
            } catch (AblyException unused) {
                Log.v(TAG, "onAuthUpdated: closing transport after send failure");
                this.transport.close();
            }
        } else if (i != 2) {
            connect();
        } else {
            Log.v(TAG, "onAuthUpdated: closing connecting transport");
            requestState(new StateIndication(ConnectionState.disconnected, new ErrorInfo("Aborting incomplete connection with superseded auth params", 503, 80003), null, null));
            connect();
        }
        this.singleThreadExecutor.execute(new Runnable() { // from class: io.ably.lib.transport.a
            @Override // java.lang.Runnable
            public final void run() {
                this.t.lambda$onAuthUpdatedAsync$0(connectionWaiter, authUpdateResult);
            }
        });
    }

    public void onMessage(ITransport iTransport, ProtocolMessage protocolMessage) {
        if (iTransport == null || this.transport == iTransport) {
            if (Log.level <= 2) {
                Log.v(TAG, "onMessage() (transport = " + iTransport + "): " + protocolMessage.action + ": " + new String(ProtocolSerializer.writeJSON(protocolMessage)));
            }
            try {
                DebugOptions.RawProtocolListener rawProtocolListener = this.protocolListener;
                if (rawProtocolListener != null) {
                    rawProtocolListener.onRawMessageRecv(protocolMessage);
                }
                switch (AnonymousClass1.$SwitchMap$io$ably$lib$types$ProtocolMessage$Action[protocolMessage.action.ordinal()]) {
                    case 1:
                        onHeartbeat(protocolMessage);
                        return;
                    case 2:
                        ErrorInfo errorInfo = protocolMessage.error;
                        if (errorInfo == null) {
                            Log.e(TAG, "onMessage(): ERROR message received (no error detail)");
                        } else {
                            Log.e(TAG, "onMessage(): ERROR message received; message = " + errorInfo.message + "; code = " + errorInfo.code);
                        }
                        if (protocolMessage.channel != null) {
                            onChannelMessage(protocolMessage);
                            return;
                        } else {
                            onError(protocolMessage);
                            return;
                        }
                    case 3:
                        if (this.currentState.state != ConnectionState.closing) {
                            onConnected(protocolMessage);
                            return;
                        } else {
                            if (trySendCloseProtocolMessage()) {
                                return;
                            }
                            requestState(ConnectionState.closed);
                            return;
                        }
                    case 4:
                    case 5:
                        onDisconnected(protocolMessage);
                        return;
                    case 6:
                        onClosed(protocolMessage);
                        return;
                    case 7:
                        onAck(protocolMessage);
                        return;
                    case 8:
                        onNack(protocolMessage);
                        return;
                    case 9:
                        addAction(new ReauthAction(this, null));
                        return;
                    case 10:
                    case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                        LiveObjectsPlugin liveObjectsPlugin = this.liveObjectsPlugin;
                        if (liveObjectsPlugin != null) {
                            try {
                                liveObjectsPlugin.handle(protocolMessage);
                                return;
                            } catch (Throwable th) {
                                Log.e(TAG, "objectsPlugin threw while handling message", th);
                                return;
                            }
                        }
                        return;
                    default:
                        onChannelMessage(protocolMessage);
                        return;
                }
            } catch (Exception e) {
                throw AblyException.fromThrowable(e);
            }
            throw AblyException.fromThrowable(e);
        }
    }

    @Override // io.ably.lib.transport.ITransport.ConnectListener
    public synchronized void onTransportAvailable(ITransport iTransport) {
        if (this.transport != iTransport) {
            Log.v(TAG, "onTransportAvailable: ignoring connection event from superseded transport");
            return;
        }
        DebugOptions.RawProtocolListener rawProtocolListener = this.protocolListener;
        if (rawProtocolListener != null) {
            rawProtocolListener.onRawConnect(iTransport.getURL());
        }
    }

    @Override // io.ably.lib.transport.ITransport.ConnectListener
    public synchronized void onTransportUnavailable(ITransport iTransport, ErrorInfo errorInfo) {
        StateIndication stateIndicationCheckSuspended;
        String str = TAG;
        Log.v(str, "onTransportUnavailable()");
        if (this.transport != iTransport) {
            Log.v(str, "onTransportUnavailable: ignoring disconnection event from superseded transport");
            return;
        }
        if (this.currentState.state == ConnectionState.connected) {
            setSuspendTime();
        }
        if (this.currentState.state == ConnectionState.closing) {
            requestState(ConnectionState.closed);
            return;
        }
        StateIndication stateIndicationCheckFallback = checkFallback(errorInfo);
        if (stateIndicationCheckFallback != null) {
            requestState(stateIndicationCheckFallback);
            return;
        }
        if (errorInfo == null) {
            stateIndicationCheckSuspended = null;
        } else if (isFatalError(errorInfo)) {
            Log.e(str, "onTransportUnavailable: unexpected transport error: " + errorInfo.message);
            stateIndicationCheckSuspended = new StateIndication(ConnectionState.failed, errorInfo);
        } else {
            if (isTokenError(errorInfo)) {
                this.ably.auth.onAuthError(errorInfo);
            }
            stateIndicationCheckSuspended = null;
        }
        if (stateIndicationCheckSuspended == null) {
            stateIndicationCheckSuspended = checkSuspended(errorInfo);
        }
        addAction(new SynchronousStateChangeAction(iTransport, stateIndicationCheckSuspended));
    }

    public void ping(CompletionListener completionListener) {
        HeartbeatWaiter heartbeatWaiter = new HeartbeatWaiter(completionListener);
        if (this.currentState.state != ConnectionState.connected) {
            heartbeatWaiter.onError(new ErrorInfo("Unable to ping service; not connected", 40000, CarouselScreenFragment.CAROUSEL_ANIMATION_MS));
            return;
        }
        synchronized (this.heartbeatWaiters) {
            this.heartbeatWaiters.add(heartbeatWaiter);
            heartbeatWaiter.start();
        }
        try {
            send(new ProtocolMessage(ProtocolMessage.Action.heartbeat), false, null);
        } catch (AblyException e) {
            heartbeatWaiter.onError(e.errorInfo);
        }
    }

    public void send(ProtocolMessage protocolMessage, boolean z, Callback<PublishResult> callback) {
        synchronized (this) {
            try {
                State state = this.currentState;
                if (state.sendEvents) {
                    sendImpl(protocolMessage, callback);
                } else {
                    if (!state.queueEvents || !z) {
                        throw AblyException.fromErrorInfo(state.defaultErrorInfo);
                    }
                    this.queuedMessages.add(new QueuedMessage(protocolMessage, callback));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setLastActivity(long j) {
        this.lastActivity = j;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class ActionQueue extends ArrayDeque<Action> {
        private ActionQueue() {
        }

        @Override // java.util.ArrayDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque, java.util.Queue
        public synchronized boolean add(Action action) {
            return super.add(action);
        }

        @Override // java.util.ArrayDeque, java.util.Deque, java.util.Queue
        public synchronized Action peek() {
            return (Action) super.peek();
        }

        @Override // java.util.ArrayDeque, java.util.Deque, java.util.Queue
        public synchronized Action poll() {
            return (Action) super.poll();
        }

        @Override // java.util.ArrayDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque
        public synchronized int size() {
            return super.size();
        }

        public /* synthetic */ ActionQueue(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class CMConnectivityListener implements NetworkConnectivity.NetworkConnectivityListener {
        private CMConnectivityListener() {
        }

        @Override // io.ably.lib.transport.NetworkConnectivity.NetworkConnectivityListener
        public void onNetworkAvailable() {
            ConnectionManager connectionManager = ConnectionManager.this;
            ConnectionState connectionState = connectionManager.getConnectionState().state;
            Log.i(ConnectionManager.TAG, "onNetworkAvailable(): currentState = " + connectionState.name());
            if (connectionState == ConnectionState.disconnected || connectionState == ConnectionState.suspended) {
                Log.i(ConnectionManager.TAG, "onNetworkAvailable(): initiating reconnect");
                connectionManager.connect();
            }
        }

        @Override // io.ably.lib.transport.NetworkConnectivity.NetworkConnectivityListener
        public void onNetworkUnavailable(ErrorInfo errorInfo) {
            ConnectionManager connectionManager = ConnectionManager.this;
            ConnectionState connectionState = connectionManager.getConnectionState().state;
            Log.i(ConnectionManager.TAG, "onNetworkUnavailable(); currentState = " + connectionState.name() + "; reason = " + errorInfo.toString());
            if (connectionState == ConnectionState.connected || connectionState == ConnectionState.connecting) {
                Log.i(ConnectionManager.TAG, "onNetworkUnavailable(): closing connected transport");
                connectionManager.requestState(new StateIndication(ConnectionState.disconnected, errorInfo));
            }
        }

        public /* synthetic */ CMConnectivityListener(ConnectionManager connectionManager, AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class ReauthAction implements Action {
        private ReauthAction() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ConnectionManager.this.handleReauth();
        }

        public /* synthetic */ ReauthAction(ConnectionManager connectionManager, AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class PendingMessageQueue {
        private final List<QueuedMessage> queue;

        private PendingMessageQueue() {
            this.queue = new ArrayList();
        }

        public void ack(long j, int i, PublishResult[] publishResultArr, ErrorInfo errorInfo) {
            QueuedMessage[] queuedMessageArr;
            QueuedMessage[] queuedMessageArr2;
            synchronized (this) {
                try {
                    if (this.queue.isEmpty()) {
                        return;
                    }
                    int i2 = 0;
                    long jLongValue = this.queue.get(0).msg.msgSerial.longValue();
                    if (j < jLongValue) {
                        i -= (int) (jLongValue - j);
                        if (i < 0) {
                            i = 0;
                        }
                        j = jLongValue;
                    }
                    if (j > jLongValue) {
                        int i3 = (int) (j - jLongValue);
                        List<QueuedMessage> listSubList = this.queue.subList(0, i3);
                        queuedMessageArr = (QueuedMessage[]) listSubList.toArray(new QueuedMessage[i3]);
                        listSubList.clear();
                        jLongValue = j;
                    } else {
                        queuedMessageArr = null;
                    }
                    if (j == jLongValue) {
                        List<QueuedMessage> listSubList2 = this.queue.subList(0, i);
                        queuedMessageArr2 = (QueuedMessage[]) listSubList2.toArray(new QueuedMessage[i]);
                        listSubList2.clear();
                    } else {
                        queuedMessageArr2 = null;
                    }
                    if (queuedMessageArr != null) {
                        if (errorInfo == null) {
                            errorInfo = new ErrorInfo("Unknown error", 500, 50000);
                        }
                        for (QueuedMessage queuedMessage : queuedMessageArr) {
                            try {
                                Callback<PublishResult> callback = queuedMessage.listener;
                                if (callback != null) {
                                    callback.onError(errorInfo);
                                }
                            } catch (Throwable th) {
                                Log.e(ConnectionManager.TAG, "ack(): listener exception", th);
                            }
                        }
                    }
                    if (queuedMessageArr2 != null) {
                        while (i2 < queuedMessageArr2.length) {
                            try {
                                Callback<PublishResult> callback2 = queuedMessageArr2[i2].listener;
                                if (callback2 != null) {
                                    callback2.onSuccess((publishResultArr == null || publishResultArr.length <= i2) ? null : publishResultArr[i2]);
                                }
                            } catch (Throwable th2) {
                                Log.e(ConnectionManager.TAG, "ack(): listener exception", th2);
                            }
                            i2++;
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        public synchronized void fail(ErrorInfo errorInfo) {
            try {
                Iterator<QueuedMessage> it = this.queue.iterator();
                while (it.hasNext()) {
                    Callback<PublishResult> callback = it.next().listener;
                    if (callback != null) {
                        callback.onError(errorInfo);
                    }
                }
                this.queue.clear();
            } catch (Throwable th) {
                throw th;
            }
        }

        public synchronized void nack(long j, int i, ErrorInfo errorInfo) {
            try {
                synchronized (this) {
                    if (this.queue.isEmpty()) {
                        return;
                    }
                    long jLongValue = this.queue.get(0).msg.msgSerial.longValue();
                    if (j != jLongValue) {
                        i -= (int) (jLongValue - j);
                    }
                    List<QueuedMessage> listSubList = this.queue.subList(0, i);
                    QueuedMessage[] queuedMessageArr = (QueuedMessage[]) listSubList.toArray(new QueuedMessage[i]);
                    listSubList.clear();
                    if (queuedMessageArr != null) {
                        if (errorInfo == null) {
                            errorInfo = new ErrorInfo("Unknown error", 500, 50000);
                        }
                        for (QueuedMessage queuedMessage : queuedMessageArr) {
                            try {
                                Callback<PublishResult> callback = queuedMessage.listener;
                                if (callback != null) {
                                    callback.onError(errorInfo);
                                }
                            } catch (Throwable th) {
                                Log.e(ConnectionManager.TAG, "nack(): listener exception", th);
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        public synchronized List<QueuedMessage> popAll() {
            ArrayList arrayList;
            arrayList = new ArrayList(this.queue);
            this.queue.clear();
            return arrayList;
        }

        public synchronized void push(QueuedMessage queuedMessage) {
            this.queue.add(queuedMessage);
        }

        public /* synthetic */ PendingMessageQueue(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class AsynchronousStateChangeAction extends StateChangeAction implements Action {
        public AsynchronousStateChangeAction(ConnectionState connectionState) {
            super(null, new StateIndication(connectionState, null));
        }

        @Override // java.lang.Runnable
        public void run() {
            setState();
            enactState();
        }

        public AsynchronousStateChangeAction(ITransport iTransport, StateIndication stateIndication) {
            super(iTransport, stateIndication);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class StateIndication {
        final String currentHost;
        final String fallback;
        final ErrorInfo reason;
        final ConnectionState state;

        public StateIndication(ConnectionState connectionState, ErrorInfo errorInfo, String str, String str2) {
            this.state = connectionState;
            this.reason = errorInfo;
            this.fallback = str;
            this.currentHost = str2;
        }

        public StateIndication(ConnectionState connectionState, ErrorInfo errorInfo) {
            this(connectionState, errorInfo, null, null);
        }

        public StateIndication(ConnectionState connectionState) {
            this(connectionState, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class ConnectionWaiter implements ConnectionStateListener {
        private ConnectionStateListener.ConnectionStateChange change;
        private boolean closed;

        private ConnectionWaiter() {
            this.closed = false;
            ConnectionManager.this.connection.on(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            ConnectionManager.this.connection.off(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized ErrorInfo waitForChange() {
            ErrorInfo errorInfo;
            if (this.closed) {
                throw new IllegalStateException("Already closed.");
            }
            Log.d(ConnectionManager.TAG, "ConnectionWaiter.waitFor()");
            if (this.change == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
            Log.d(ConnectionManager.TAG, "ConnectionWaiter.waitFor done: currentState=" + ConnectionManager.this.currentState + ")");
            errorInfo = this.change.reason;
            this.change = null;
            return errorInfo;
        }

        @Override // io.ably.lib.realtime.ConnectionStateListener
        public synchronized void onConnectionStateChanged(ConnectionStateListener.ConnectionStateChange connectionStateChange) {
            this.change = connectionStateChange;
            notify();
        }

        public /* synthetic */ ConnectionWaiter(ConnectionManager connectionManager, AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class Connecting extends State {
        public Connecting() {
            super(ConnectionState.connecting, true, false, false, Defaults.TIMEOUT_CONNECT, null);
        }

        @Override // io.ably.lib.transport.ConnectionManager.State
        public void enact(StateIndication stateIndication, ConnectionStateListener.ConnectionStateChange connectionStateChange) {
            super.enact(stateIndication, connectionStateChange);
            if (ConnectionManager.this.hasConnectBeenInvokeOnClosedOrFailedState(connectionStateChange)) {
                ConnectionManager.this.cleanMsgSerialAndErrorReason();
            }
            ConnectionManager.this.connectImpl(stateIndication);
        }

        @Override // io.ably.lib.transport.ConnectionManager.State
        public StateIndication onTimeout() {
            return ConnectionManager.this.checkSuspended(null);
        }

        @Override // io.ably.lib.transport.ConnectionManager.State
        public StateIndication validateTransition(StateIndication stateIndication) {
            return stateIndication;
        }
    }

    public void requestState(StateIndication stateIndication) {
        requestState(null, stateIndication);
    }

    public void requestState(ConnectionState connectionState) {
        requestState(new StateIndication(connectionState, null));
    }

    private void sendImpl(QueuedMessage queuedMessage) {
        if (this.transport == null) {
            Log.v(TAG, "sendImpl(): Discarding message; transport unavailable");
            return;
        }
        ProtocolMessage protocolMessage = queuedMessage.msg;
        if (ProtocolMessage.ackRequired(protocolMessage)) {
            long j = this.msgSerial;
            this.msgSerial = 1 + j;
            protocolMessage.msgSerial = Long.valueOf(j);
            this.pendingMessages.push(queuedMessage);
        }
        DebugOptions.RawProtocolListener rawProtocolListener = this.protocolListener;
        if (rawProtocolListener != null) {
            rawProtocolListener.onRawMessageSend(protocolMessage);
        }
        this.transport.send(protocolMessage);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class Disconnected extends State {
        public Disconnected() {
            super(ConnectionState.disconnected, true, false, false, ConnectionManager.this.ably.options.disconnectedRetryTimeout, ConnectionManager.REASON_DISCONNECTED);
        }

        @Override // io.ably.lib.transport.ConnectionManager.State
        public void enact(StateIndication stateIndication, ConnectionStateListener.ConnectionStateChange connectionStateChange) {
            super.enact(stateIndication, connectionStateChange);
            ConnectionManager.this.clearTransport();
            if (connectionStateChange.previous == ConnectionState.connected) {
                ConnectionManager.this.setSuspendTime();
                if (ConnectionManager.this.suppressRetry) {
                    return;
                }
                Log.v(ConnectionManager.TAG, "Was previously connected, retrying immediately");
                ConnectionManager.this.requestState(ConnectionState.connecting);
            }
        }

        @Override // io.ably.lib.transport.ConnectionManager.State
        public StateIndication onTimeout() {
            return new StateIndication(ConnectionState.connecting);
        }

        @Override // io.ably.lib.transport.ConnectionManager.State
        public StateIndication validateTransition(StateIndication stateIndication) {
            ConnectionState connectionState = stateIndication.state;
            if (connectionState == this.state) {
                return null;
            }
            return connectionState == ConnectionState.closing ? new StateIndication(ConnectionState.closed) : stateIndication;
        }

        @Override // io.ably.lib.transport.ConnectionManager.State
        public void enactForChannel(StateIndication stateIndication, ConnectionStateListener.ConnectionStateChange connectionStateChange, Channel channel) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public abstract class State {
        public final ErrorInfo defaultErrorInfo;
        public final boolean queueEvents;
        public final boolean sendEvents;
        public final ConnectionState state;
        final boolean terminal;
        public long timeout;

        public State(ConnectionState connectionState, boolean z, boolean z2, boolean z3, long j, ErrorInfo errorInfo) {
            this.state = connectionState;
            this.queueEvents = z;
            this.sendEvents = z2;
            this.terminal = z3;
            this.timeout = j;
            this.defaultErrorInfo = errorInfo;
        }

        public void enact(StateIndication stateIndication, ConnectionStateListener.ConnectionStateChange connectionStateChange) {
            if (connectionStateChange != null) {
                if (this.sendEvents) {
                    ConnectionManager.this.sendQueuedMessages();
                } else if (!this.queueEvents) {
                    ConnectionManager.this.failQueuedMessages(stateIndication.reason);
                }
                Iterator<Channel> it = ConnectionManager.this.channels.values().iterator();
                while (it.hasNext()) {
                    enactForChannel(stateIndication, connectionStateChange, it.next());
                }
            }
        }

        public StateIndication onTimeout() {
            return null;
        }

        public abstract StateIndication validateTransition(StateIndication stateIndication);

        public void enactForChannel(StateIndication stateIndication, ConnectionStateListener.ConnectionStateChange connectionStateChange, Channel channel) {
        }
    }
}
