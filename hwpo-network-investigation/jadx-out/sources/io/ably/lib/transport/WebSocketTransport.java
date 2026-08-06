package io.ably.lib.transport;

import io.ably.lib.http.HttpUtils;
import io.ably.lib.network.EngineType;
import io.ably.lib.network.NotConnectedException;
import io.ably.lib.network.WebSocketClient;
import io.ably.lib.network.WebSocketEngine;
import io.ably.lib.network.WebSocketEngineConfig;
import io.ably.lib.network.WebSocketEngineFactory;
import io.ably.lib.network.WebSocketListener;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.ErrorInfo;
import io.ably.lib.types.Param;
import io.ably.lib.types.ProtocolMessage;
import io.ably.lib.types.ProtocolSerializer;
import io.ably.lib.util.AgentHeaderCreator;
import io.ably.lib.util.ClientOptionsUtils;
import io.ably.lib.util.Log;
import java.nio.ByteBuffer;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.Timer;
import java.util.TimerTask;
import javax.net.ssl.SSLContext;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class WebSocketTransport implements ITransport {
    private static final int ABNORMAL_CLOSE = 1006;
    private static final int BUGGYCLOSE = -2;
    private static final int CLOSE_NORMAL = 1000;
    private static final int CLOSE_PROTOCOL_ERROR = 1002;
    private static final int EXTENSION = 1010;
    private static final int GOING_AWAY = 1001;
    private static final int NEVER_CONNECTED = -1;
    private static final int NO_UTF8 = 1007;
    private static final int POLICY_VALIDATION = 1008;
    private static final int REFUSE = 1003;
    private static final String TAG = "io.ably.lib.transport.WebSocketTransport";
    private static final int TLS_ERROR = 1015;
    private static final int TOOBIG = 1009;
    private static final int UNEXPECTED_CONDITION = 1011;
    private final boolean channelBinaryMode;
    private ITransport.ConnectListener connectListener;
    private final ConnectionManager connectionManager;
    private final ITransport.TransportParams params;
    private WebSocketClient webSocketClient;
    private final WebSocketEngine webSocketEngine;
    private WebSocketHandler webSocketHandler;
    private String wsUri;
    private boolean activityCheckTurnedOff = false;
    private boolean connectHasBeenCalled = false;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class Factory implements ITransport.Factory {
        @Override // io.ably.lib.transport.ITransport.Factory
        public WebSocketTransport getTransport(ITransport.TransportParams transportParams, ConnectionManager connectionManager) {
            return new WebSocketTransport(transportParams, connectionManager);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface WebSocketReceiver {
        void onMessage(ProtocolMessage protocolMessage);
    }

    public WebSocketTransport(ITransport.TransportParams transportParams, ConnectionManager connectionManager) {
        this.params = transportParams;
        this.connectionManager = connectionManager;
        this.channelBinaryMode = transportParams.options.useBinaryProtocol;
        WebSocketEngine webSocketEngineCreateWebSocketEngine = createWebSocketEngine(transportParams);
        this.webSocketEngine = webSocketEngineCreateWebSocketEngine;
        transportParams.heartbeats = !webSocketEngineCreateWebSocketEngine.isPingListenerSupported();
    }

    private static WebSocketEngine createWebSocketEngine(ITransport.TransportParams transportParams) {
        WebSocketEngineFactory firstAvailable = WebSocketEngineFactory.getFirstAvailable();
        Log.v(TAG, "Using " + firstAvailable.getEngineType().name() + " WebSocket Engine");
        WebSocketEngineConfig.WebSocketEngineConfigBuilder webSocketEngineConfigBuilderBuilder = WebSocketEngineConfig.builder();
        webSocketEngineConfigBuilderBuilder.tls(transportParams.options.tls).host(transportParams.host).proxy(ClientOptionsUtils.convertToProxyConfig(transportParams.getClientOptions()));
        if (transportParams.options.tls && firstAvailable.getEngineType() != EngineType.OKHTTP) {
            try {
                SSLContext sSLContext = SSLContext.getInstance("TLS");
                sSLContext.init(null, null, null);
                webSocketEngineConfigBuilderBuilder.sslSocketFactory(new SafeSSLSocketFactory(sSLContext.getSocketFactory()));
            } catch (KeyManagementException | NoSuchAlgorithmException e) {
                throw new IllegalStateException("Can't get safe tls algorithms", e);
            }
        }
        return firstAvailable.create(webSocketEngineConfigBuilderBuilder.build());
    }

    private synchronized void ensureConnectCalledOnce() {
        if (this.connectHasBeenCalled) {
            throw new IllegalStateException("WebSocketTransport is already initialized");
        }
        this.connectHasBeenCalled = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isActiveTransport() {
        return this.connectionManager.isActiveTransport(this);
    }

    @Override // io.ably.lib.transport.ITransport
    public void close() {
        String str = TAG;
        Log.d(str, "close()");
        WebSocketClient webSocketClient = this.webSocketClient;
        WebSocketHandler webSocketHandler = this.webSocketHandler;
        if (webSocketClient == null || webSocketHandler == null) {
            Log.w(str, "close() called on uninitialized or already closed transport");
        } else {
            webSocketHandler.flagActivity();
            webSocketClient.close();
        }
    }

    @Override // io.ably.lib.transport.ITransport
    public void connect(ITransport.ConnectListener connectListener) {
        ensureConnectCalledOnce();
        this.connectListener = connectListener;
        try {
            this.wsUri = (this.params.options.tls ? "wss://" : "ws://") + this.params.host + ':' + this.params.port + AgentHeaderCreator.AGENT_DIVIDER;
            Param[] connectParams = this.params.getConnectParams(this.connectionManager.getAuthParams());
            if (connectParams.length > 0) {
                this.wsUri = HttpUtils.encodeParams(this.wsUri, connectParams);
            }
            Log.d(TAG, "connect(); wsUri = " + this.wsUri);
            WebSocketHandler webSocketHandler = new WebSocketHandler(new WebSocketReceiver() { // from class: io.ably.lib.transport.b
                @Override // io.ably.lib.transport.WebSocketTransport.WebSocketReceiver
                public final void onMessage(ProtocolMessage protocolMessage) {
                    this.a.receive(protocolMessage);
                }
            });
            this.webSocketHandler = webSocketHandler;
            WebSocketClient webSocketClientCreate = this.webSocketEngine.create(this.wsUri, webSocketHandler);
            this.webSocketClient = webSocketClientCreate;
            webSocketClientCreate.connect();
        } catch (AblyException e) {
            Log.e(TAG, "Unexpected exception attempting connection; wsUri = " + this.wsUri, e);
            connectListener.onTransportUnavailable(this, e.errorInfo);
        } catch (Throwable th) {
            Log.e(TAG, "Unexpected exception attempting connection; wsUri = " + this.wsUri, th);
            connectListener.onTransportUnavailable(this, AblyException.fromThrowable(th).errorInfo);
        }
    }

    @Override // io.ably.lib.transport.ITransport
    public String getHost() {
        return this.params.host;
    }

    @Override // io.ably.lib.transport.ITransport
    public String getURL() {
        return this.wsUri;
    }

    @Override // io.ably.lib.transport.ITransport
    public void receive(ProtocolMessage protocolMessage) {
        this.connectionManager.onMessage(this, protocolMessage);
    }

    @Override // io.ably.lib.transport.ITransport
    public void send(ProtocolMessage protocolMessage) throws AblyException {
        String str = TAG;
        Log.d(str, "send(); action = " + protocolMessage.action);
        try {
            if (!this.channelBinaryMode) {
                if (Log.level <= 2) {
                    Log.v(str, "send(): ".concat(new String(ProtocolSerializer.writeJSON(protocolMessage))));
                }
                this.webSocketClient.send(ProtocolSerializer.writeJSON(protocolMessage));
                return;
            }
            byte[] bArrWriteMsgpack = ProtocolSerializer.writeMsgpack(protocolMessage);
            if (Log.level <= 2) {
                ProtocolMessage msgpack = ProtocolSerializer.readMsgpack(bArrWriteMsgpack);
                Log.v(str, "send(): " + msgpack.action + ": " + new String(ProtocolSerializer.writeJSON(msgpack)));
            }
            this.webSocketClient.send(bArrWriteMsgpack);
        } catch (NotConnectedException e) {
            ITransport.ConnectListener connectListener = this.connectListener;
            if (connectListener == null) {
                throw AblyException.fromThrowable(e);
            }
            connectListener.onTransportUnavailable(this, AblyException.fromThrowable(e).errorInfo);
        } catch (Exception e2) {
            throw AblyException.fromThrowable(e2);
        }
    }

    public String toString() {
        return WebSocketTransport.class.getName() + " {" + getURL() + "}";
    }

    public void turnOffActivityCheckIfPingListenerIsNotSupported() {
        if (this.webSocketEngine.isPingListenerSupported()) {
            return;
        }
        this.activityCheckTurnedOff = true;
    }

    public void preProcessReceivedMessage(ProtocolMessage protocolMessage) {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class WebSocketHandler implements WebSocketListener {
        private volatile long lastActivityTime;
        private final WebSocketReceiver receiver;
        private final Timer timer = new Timer();
        private volatile TimerTask activityTimerTask = null;
        private final Object activityTimerMonitor = new Object();

        public WebSocketHandler(WebSocketReceiver webSocketReceiver) {
            this.receiver = webSocketReceiver;
        }

        private void checkActivity() {
            long activityTimeout = getActivityTimeout();
            if (activityTimeout == 0) {
                Log.v(WebSocketTransport.TAG, "checkActivity: infinite timeout");
                return;
            }
            if (this.activityTimerTask != null) {
                return;
            }
            synchronized (this.activityTimerMonitor) {
                try {
                    if (this.activityTimerTask == null) {
                        startActivityTimer(activityTimeout + 100);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private void dispose() {
            this.timer.cancel();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void flagActivity() {
            if (WebSocketTransport.this.isActiveTransport()) {
                this.lastActivityTime = System.currentTimeMillis();
                WebSocketTransport.this.connectionManager.setLastActivity(this.lastActivityTime);
            }
            if (WebSocketTransport.this.connectionManager.maxIdleInterval == 0) {
                Log.v(WebSocketTransport.TAG, "checkActivity: turned off because maxIdleInterval is 0");
            } else if (WebSocketTransport.this.activityCheckTurnedOff) {
                Log.v(WebSocketTransport.TAG, "checkActivity: turned off for test purpose");
            } else {
                checkActivity();
            }
        }

        private long getActivityTimeout() {
            return WebSocketTransport.this.connectionManager.maxIdleInterval + WebSocketTransport.this.params.options.realtimeRequestTimeout;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onActivityTimerExpiry() {
            long activityTimeout = getActivityTimeout() - (System.currentTimeMillis() - this.lastActivityTime);
            if (activityTimeout > 0) {
                synchronized (this.activityTimerMonitor) {
                    this.activityTimerTask = null;
                    Log.v(WebSocketTransport.TAG, "onActivityTimerExpiry: ok");
                    startActivityTimer(activityTimeout + 100);
                }
                return;
            }
            Log.e(WebSocketTransport.TAG, "No activity for " + getActivityTimeout() + "ms, closing connection");
            WebSocketTransport.this.webSocketClient.cancel(WebSocketTransport.ABNORMAL_CLOSE, "timed out");
        }

        private void schedule(TimerTask timerTask, long j) {
            try {
                this.timer.schedule(timerTask, j);
            } catch (IllegalStateException e) {
                Log.w(WebSocketTransport.TAG, "Timer has already has been canceled", e);
            }
        }

        private void startActivityTimer(long j) {
            this.activityTimerTask = new TimerTask() { // from class: io.ably.lib.transport.WebSocketTransport.WebSocketHandler.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    try {
                        WebSocketHandler.this.onActivityTimerExpiry();
                    } catch (Exception e) {
                        Log.e(WebSocketTransport.TAG, "Unexpected exception in activity timer handler", e);
                        WebSocketTransport.this.webSocketClient.cancel(WebSocketTransport.ABNORMAL_CLOSE, "Activity timer closed unexpectedly");
                    }
                }
            };
            schedule(this.activityTimerTask, j);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0046  */
        /* JADX WARN: Code duplicated, block: B:21:0x0049  */
        @Override // io.ably.lib.network.WebSocketListener
        public void onClose(int i, String str) {
            ErrorInfo errorInfo;
            Log.d(WebSocketTransport.TAG, "onClose(): wsCode = " + i + "; wsReason = " + str + "; remote = false");
            if (i == -2 || i == -1 || i == WebSocketTransport.CLOSE_NORMAL || i == WebSocketTransport.GOING_AWAY) {
                errorInfo = ConnectionManager.REASON_DISCONNECTED;
            } else if (i == WebSocketTransport.REFUSE) {
                errorInfo = ConnectionManager.REASON_REFUSED;
            } else if (i == WebSocketTransport.ABNORMAL_CLOSE) {
                errorInfo = ConnectionManager.REASON_DISCONNECTED;
            } else if (i != WebSocketTransport.POLICY_VALIDATION) {
                errorInfo = i != WebSocketTransport.TOOBIG ? ConnectionManager.REASON_FAILED : ConnectionManager.REASON_TOO_BIG;
            } else {
                errorInfo = ConnectionManager.REASON_REFUSED;
            }
            WebSocketTransport.this.connectListener.onTransportUnavailable(WebSocketTransport.this, errorInfo);
            dispose();
        }

        @Override // io.ably.lib.network.WebSocketListener
        public void onError(Throwable th) {
            Log.e(WebSocketTransport.TAG, "Connection error ", th);
            WebSocketTransport.this.connectListener.onTransportUnavailable(WebSocketTransport.this, new ErrorInfo(th.getMessage(), 503, 80000));
        }

        @Override // io.ably.lib.network.WebSocketListener
        public void onMessage(ByteBuffer byteBuffer) {
            try {
                ProtocolMessage msgpack = ProtocolSerializer.readMsgpack(byteBuffer.array());
                Log.d(WebSocketTransport.TAG, "onMessage(): msg (binary) = " + msgpack);
                WebSocketTransport.this.preProcessReceivedMessage(msgpack);
                this.receiver.onMessage(msgpack);
            } catch (AblyException e) {
                Log.e(WebSocketTransport.TAG, "Unexpected exception processing received binary message", e);
            }
            flagActivity();
        }

        @Override // io.ably.lib.network.WebSocketListener
        public void onOldJavaVersionDetected(Throwable th) {
            Log.w(WebSocketTransport.TAG, "Error when trying to set SSL parameters, most likely due to an old Java API version", th);
        }

        @Override // io.ably.lib.network.WebSocketListener
        public void onOpen() {
            Log.d(WebSocketTransport.TAG, "onOpen()");
            WebSocketTransport.this.connectListener.onTransportAvailable(WebSocketTransport.this);
            flagActivity();
        }

        @Override // io.ably.lib.network.WebSocketListener
        public void onWebsocketPing() {
            Log.d(WebSocketTransport.TAG, "onWebsocketPing()");
            flagActivity();
        }

        @Override // io.ably.lib.network.WebSocketListener
        public void onMessage(String str) {
            try {
                ProtocolMessage protocolMessageFromJSON = ProtocolSerializer.fromJSON(str);
                Log.d(WebSocketTransport.TAG, "onMessage(): msg (text) = " + protocolMessageFromJSON);
                WebSocketTransport.this.preProcessReceivedMessage(protocolMessageFromJSON);
                this.receiver.onMessage(protocolMessageFromJSON);
            } catch (AblyException e) {
                Log.e(WebSocketTransport.TAG, "Unexpected exception processing received text message", e);
            }
            flagActivity();
        }
    }
}
