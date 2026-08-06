package io.ably.lib.realtime;

import com.intercom.twig.BuildConfig;
import defpackage.av;
import defpackage.sk0;
import defpackage.vb0;
import io.ably.lib.http.BasePaginatedQuery;
import io.ably.lib.http.Http;
import io.ably.lib.http.HttpUtils;
import io.ably.lib.transport.ConnectionManager;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.AsyncPaginatedResult;
import io.ably.lib.types.Callback;
import io.ably.lib.types.ErrorInfo;
import io.ably.lib.types.MessageDecodeException;
import io.ably.lib.types.PaginatedResult;
import io.ably.lib.types.Param;
import io.ably.lib.types.PresenceMessage;
import io.ably.lib.types.PresenceSerializer;
import io.ably.lib.types.ProtocolMessage;
import io.ably.lib.types.PublishResult;
import io.ably.lib.util.Listeners;
import io.ably.lib.util.Log;
import io.ably.lib.util.StringUtils;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class Presence {
    public static final String GET_CLIENTID = "clientId";
    public static final String GET_CONNECTIONID = "connectionId";
    public static final String GET_WAITFORSYNC = "waitForSync";
    private static final String TAG = Channel.class.getName();
    private final Channel channel;
    private String currentSyncChannelSerial;
    private final PresenceMap internalPresence;
    private final Multicaster listeners;
    private final PresenceMap presence;
    public boolean syncComplete;
    private final EnumMap<PresenceMessage.Action, Multicaster> eventListeners = new EnumMap<>(PresenceMessage.Action.class);
    private final List<QueuedPresence> pendingPresence = new ArrayList();

    /* JADX INFO: renamed from: io.ably.lib.realtime.Presence$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$io$ably$lib$realtime$ChannelState;
        static final /* synthetic */ int[] $SwitchMap$io$ably$lib$types$PresenceMessage$Action;

        static {
            int[] iArr = new int[ChannelState.values().length];
            $SwitchMap$io$ably$lib$realtime$ChannelState = iArr;
            try {
                iArr[ChannelState.initialized.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$ably$lib$realtime$ChannelState[ChannelState.attaching.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$ably$lib$realtime$ChannelState[ChannelState.attached.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[PresenceMessage.Action.values().length];
            $SwitchMap$io$ably$lib$types$PresenceMessage$Action = iArr2;
            try {
                iArr2[PresenceMessage.Action.enter.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$ably$lib$types$PresenceMessage$Action[PresenceMessage.Action.update.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$ably$lib$types$PresenceMessage$Action[PresenceMessage.Action.present.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$io$ably$lib$types$PresenceMessage$Action[PresenceMessage.Action.leave.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$io$ably$lib$types$PresenceMessage$Action[PresenceMessage.Action.absent.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class InternalPresenceMap extends PresenceMap {
        private InternalPresenceMap() {
            super();
        }

        @Override // io.ably.lib.realtime.Presence.PresenceMap
        public String memberKey(PresenceMessage presenceMessage) {
            return presenceMessage.clientId;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class Multicaster extends io.ably.lib.util.Multicaster<PresenceListener> implements PresenceListener {
        private Multicaster() {
            super(new PresenceListener[0]);
        }

        @Override // io.ably.lib.realtime.Presence.PresenceListener
        public void onPresenceMessage(PresenceMessage presenceMessage) {
            Iterator<PresenceListener> it = getMembers().iterator();
            while (it.hasNext()) {
                try {
                    it.next().onPresenceMessage(presenceMessage);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface PresenceListener {
        void onPresenceMessage(PresenceMessage presenceMessage);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class PresenceMap {
        private final HashMap<String, PresenceMessage> members;
        private Collection<String> residualMembers;
        private boolean syncInProgress;

        private PresenceMap() {
            this.members = new HashMap<>();
        }

        public synchronized void clear() {
            this.members.clear();
            Collection<String> collection = this.residualMembers;
            if (collection != null) {
                collection.clear();
            }
        }

        public synchronized List<PresenceMessage> endSync() {
            ArrayList arrayList;
            try {
                Log.v(Presence.TAG, "endSync(); channel = " + Presence.this.channel.name + "; syncInProgress = " + this.syncInProgress);
                arrayList = new ArrayList();
                if (this.syncInProgress) {
                    Iterator<Map.Entry<String, PresenceMessage>> it = this.members.entrySet().iterator();
                    while (it.hasNext()) {
                        if (it.next().getValue().action == PresenceMessage.Action.absent) {
                            it.remove();
                        }
                    }
                    Iterator<String> it2 = this.residualMembers.iterator();
                    while (it2.hasNext()) {
                        PresenceMessage presenceMessageRemove = this.members.remove(it2.next());
                        if (presenceMessageRemove != null) {
                            arrayList.add((PresenceMessage) presenceMessageRemove.clone());
                        }
                    }
                    this.residualMembers = null;
                    this.syncInProgress = false;
                }
                Presence.this.syncComplete = true;
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
            return arrayList;
        }

        public synchronized Collection<PresenceMessage> get(Param[] paramArr) {
            HashSet hashSet;
            try {
                String str = null;
                boolean z = true;
                String str2 = null;
                for (Param param : paramArr) {
                    String str3 = param.key;
                    int iHashCode = str3.hashCode();
                    if (iHashCode != -485951537) {
                        if (iHashCode != 908408390) {
                            if (iHashCode == 1923106969 && str3.equals(Presence.GET_CONNECTIONID)) {
                                str2 = param.value;
                            }
                        } else if (str3.equals(Presence.GET_CLIENTID)) {
                            str = param.value;
                        }
                    } else if (str3.equals(Presence.GET_WAITFORSYNC)) {
                        z = Boolean.parseBoolean(param.value);
                    }
                }
                hashSet = new HashSet();
                if (z) {
                    waitForSync();
                }
                for (PresenceMessage presenceMessage : this.members.values()) {
                    if (str == null || presenceMessage.clientId.equals(str)) {
                        if (str2 == null || presenceMessage.connectionId.equals(str2)) {
                            hashSet.add(presenceMessage);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
            return hashSet;
        }

        public synchronized boolean hasNewerItem(String str, PresenceMessage presenceMessage) {
            try {
                PresenceMessage presenceMessage2 = this.members.get(str);
                boolean z = false;
                if (presenceMessage2 == null) {
                    return false;
                }
                String str2 = presenceMessage.connectionId;
                if (str2 == null || presenceMessage2.connectionId == null || (presenceMessage.id.startsWith(str2) && presenceMessage2.id.startsWith(presenceMessage2.connectionId))) {
                    String[] strArrSplit = presenceMessage.id.split(":", 3);
                    String[] strArrSplit2 = presenceMessage2.id.split(":", 3);
                    if (strArrSplit.length < 3 || strArrSplit2.length < 3) {
                        return false;
                    }
                    try {
                        long j = Long.parseLong(strArrSplit[1]);
                        long j2 = Long.parseLong(strArrSplit[2]);
                        long j3 = Long.parseLong(strArrSplit2[1]);
                        long j4 = Long.parseLong(strArrSplit2[2]);
                        if (j3 > j || (j3 == j && j4 >= j2)) {
                            z = true;
                        }
                        return z;
                    } catch (NumberFormatException unused) {
                        return false;
                    }
                }
                return presenceMessage2.timestamp >= presenceMessage.timestamp;
            } catch (Throwable th) {
                throw th;
            }
        }

        public String memberKey(PresenceMessage presenceMessage) {
            return presenceMessage.memberKey();
        }

        public synchronized boolean put(PresenceMessage presenceMessage) {
            try {
                String strMemberKey = memberKey(presenceMessage);
                Collection<String> collection = this.residualMembers;
                if (collection != null) {
                    collection.remove(strMemberKey);
                }
                if (hasNewerItem(strMemberKey, presenceMessage)) {
                    return false;
                }
                this.members.put(strMemberKey, presenceMessage);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }

        public synchronized boolean remove(PresenceMessage presenceMessage) {
            String strMemberKey = memberKey(presenceMessage);
            if (hasNewerItem(strMemberKey, presenceMessage)) {
                return false;
            }
            PresenceMessage presenceMessageRemove = this.members.remove(strMemberKey);
            return presenceMessageRemove == null || presenceMessageRemove.action != PresenceMessage.Action.absent;
        }

        public synchronized void startSync() {
            Log.v(Presence.TAG, "startSync(); channel = " + Presence.this.channel.name + "; syncInProgress = " + this.syncInProgress);
            if (!this.syncInProgress) {
                this.residualMembers = new HashSet(this.members.keySet());
                this.syncInProgress = true;
            }
        }

        public synchronized void waitForSync() {
            String str;
            int i;
            boolean z;
            while (Presence.this.channel.state == ChannelState.attaching) {
                try {
                    wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
            boolean z2 = false;
            if (Presence.this.channel.state == ChannelState.attached) {
                do {
                    z = !this.syncInProgress && Presence.this.syncComplete;
                    if (!z) {
                        wait();
                    }
                } while (!z);
                z2 = z;
            }
            if (Presence.this.channel.state == ChannelState.suspended) {
                Locale locale = Locale.ROOT;
                str = "Channel " + Presence.this.channel.name + ": presence state is out of sync due to the channel being in a SUSPENDED state";
                i = 91005;
            } else if (!z2) {
                Locale locale2 = Locale.ROOT;
                str = "Channel " + Presence.this.channel.name + ": cannot get presence state because channel is in invalid state";
                i = 90001;
            }
            Log.v(Presence.TAG, str);
            throw AblyException.fromErrorInfo(new ErrorInfo(str, i));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class QueuedPresence {
        public CompletionListener listener;
        public PresenceMessage msg;

        public QueuedPresence(PresenceMessage presenceMessage, CompletionListener completionListener) {
            this.msg = presenceMessage;
            this.listener = completionListener;
        }
    }

    public Presence(Channel channel) {
        this.listeners = new Multicaster();
        this.presence = new PresenceMap();
        this.internalPresence = new InternalPresenceMap();
        this.channel = channel;
    }

    private void broadcastPresence(List<PresenceMessage> list) {
        for (PresenceMessage presenceMessage : list) {
            this.listeners.onPresenceMessage(presenceMessage);
            Multicaster multicaster = this.eventListeners.get(presenceMessage.action);
            if (multicaster != null) {
                multicaster.onPresenceMessage(presenceMessage);
            }
        }
    }

    private void endSync() {
        List<PresenceMessage> listEndSync = this.presence.endSync();
        for (PresenceMessage presenceMessage : listEndSync) {
            presenceMessage.action = PresenceMessage.Action.leave;
            presenceMessage.id = null;
            presenceMessage.timestamp = System.currentTimeMillis();
        }
        broadcastPresence(listEndSync);
    }

    private void enterClientWithId(String str, String str2, Object obj, CompletionListener completionListener) {
        if (str2 == null) {
            Locale locale = Locale.ROOT;
            String strC = sk0.c("Channel ", this.channel.name, ": unable to enter presence channel (null clientId specified)");
            Log.v(TAG, strC);
            if (completionListener != null) {
                completionListener.onError(new ErrorInfo(strC, 40000));
                return;
            }
        }
        PresenceMessage presenceMessage = new PresenceMessage(PresenceMessage.Action.enter, str2, obj);
        presenceMessage.id = str;
        Log.v(TAG, "enterClient(); channel = " + this.channel.name + "; clientId = " + str2);
        updatePresence(presenceMessage, completionListener);
    }

    private void failQueuedMessages(ErrorInfo errorInfo) {
        Log.v(TAG, "failQueuedMessages()");
        Iterator<QueuedPresence> it = this.pendingPresence.iterator();
        while (it.hasNext()) {
            CompletionListener completionListener = it.next().listener;
            if (completionListener != null) {
                try {
                    completionListener.onError(errorInfo);
                } catch (Throwable th) {
                    Log.e(TAG, "failQueuedMessages(): Unexpected exception calling listener", th);
                }
            }
        }
        this.pendingPresence.clear();
    }

    private BasePaginatedQuery.ResultRequest<PresenceMessage> historyImpl(Http http, Param[] paramArr) {
        try {
            Param[] paramArrReplacePlaceholderParams = ChannelBase.replacePlaceholderParams(this.channel, paramArr);
            Channel channel = this.channel;
            AblyRealtime ablyRealtime = channel.ably;
            return new BasePaginatedQuery(http, av.a(new StringBuilder(), this.channel.basePath, "/presence/history"), HttpUtils.defaultAcceptHeaders(ablyRealtime.options.useBinaryProtocol), paramArrReplacePlaceholderParams, PresenceSerializer.getPresenceResponseHandler(channel.options)).get();
        } catch (AblyException e) {
            return new BasePaginatedQuery.ResultRequest.Failed(e);
        }
    }

    private void implicitAttachOnSubscribe(CompletionListener completionListener) throws AblyException {
        if (!this.channel.attachOnSubscribeEnabled()) {
            if (completionListener == null) {
                return;
            }
            String strC = sk0.c("Channel ", this.channel.name, ": attachOnSubscribe=false doesn't expect attach completion callback");
            Log.e(TAG, strC);
            throw AblyException.fromErrorInfo(new ErrorInfo(strC, CarouselScreenFragment.CAROUSEL_ANIMATION_MS, 40000));
        }
        Channel channel = this.channel;
        if (channel.state != ChannelState.failed) {
            channel.attach(completionListener);
            return;
        }
        Locale locale = Locale.ROOT;
        String strC2 = sk0.c("Channel ", channel.name, ": subscribe in FAILED channel state");
        Log.e(TAG, strC2);
        throw AblyException.fromErrorInfo(new ErrorInfo(strC2, 90001));
    }

    private void sendQueuedMessages() {
        CompletionListener completionListener;
        Log.v(TAG, "sendQueuedMessages()");
        AblyRealtime ablyRealtime = this.channel.ably;
        boolean z = ablyRealtime.options.queueMessages;
        ConnectionManager connectionManager = ablyRealtime.connection.connectionManager;
        int size = this.pendingPresence.size();
        if (size == 0) {
            return;
        }
        ProtocolMessage protocolMessage = new ProtocolMessage(ProtocolMessage.Action.presence, this.channel.name);
        Iterator<QueuedPresence> it = this.pendingPresence.iterator();
        PresenceMessage[] presenceMessageArr = new PresenceMessage[size];
        protocolMessage.presence = presenceMessageArr;
        int i = 0;
        if (size == 1) {
            QueuedPresence next = it.next();
            presenceMessageArr[0] = next.msg;
            completionListener = next.listener;
        } else {
            CompletionListener.Multicaster multicaster = new CompletionListener.Multicaster(new CompletionListener[0]);
            while (it.hasNext()) {
                QueuedPresence next2 = it.next();
                int i2 = i + 1;
                presenceMessageArr[i] = next2.msg;
                CompletionListener completionListener2 = next2.listener;
                if (completionListener2 != null) {
                    multicaster.add(completionListener2);
                }
                i = i2;
            }
            boolean zIsEmpty = multicaster.isEmpty();
            completionListener = multicaster;
            if (zIsEmpty) {
                completionListener = null;
            }
        }
        this.pendingPresence.clear();
        try {
            connectionManager.send(protocolMessage, z, Listeners.fromCompletionListener(completionListener));
        } catch (AblyException e) {
            Log.e(TAG, "sendQueuedMessages(): Unexpected exception sending message", e);
            if (completionListener != null) {
                completionListener.onError(e.errorInfo);
            }
        }
    }

    private void subscribeImpl(PresenceMessage.Action action, PresenceListener presenceListener) {
        Multicaster multicaster = this.eventListeners.get(action);
        if (multicaster == null) {
            multicaster = new Multicaster();
            this.eventListeners.put(action, multicaster);
        }
        multicaster.add(presenceListener);
    }

    private void unsubscribeImpl(PresenceMessage.Action action, PresenceListener presenceListener) {
        Multicaster multicaster = this.eventListeners.get(action);
        if (multicaster != null) {
            multicaster.remove(presenceListener);
            if (multicaster.isEmpty()) {
                this.eventListeners.remove(action);
            }
        }
    }

    private void updateInnerPresenceMessageFields(ProtocolMessage protocolMessage) {
        int i = 0;
        while (true) {
            PresenceMessage[] presenceMessageArr = protocolMessage.presence;
            if (i >= presenceMessageArr.length) {
                return;
            }
            PresenceMessage presenceMessage = presenceMessageArr[i];
            try {
                presenceMessage.decode(this.channel.options);
            } catch (MessageDecodeException e) {
                String str = TAG;
                Locale locale = Locale.ROOT;
                Log.e(str, e.errorInfo.message + " on channel " + this.channel.name);
            }
            if (presenceMessage.connectionId == null) {
                presenceMessage.connectionId = protocolMessage.connectionId;
            }
            if (presenceMessage.timestamp == 0) {
                presenceMessage.timestamp = protocolMessage.timestamp;
            }
            if (presenceMessage.id == null) {
                presenceMessage.id = protocolMessage.id + ':' + i;
            }
            i++;
        }
    }

    public void addPendingPresence(PresenceMessage presenceMessage, Callback<PublishResult> callback) {
        synchronized (this.channel) {
            this.pendingPresence.add(new QueuedPresence(presenceMessage, Listeners.unwrap(callback)));
        }
    }

    public void enter(Object obj, CompletionListener completionListener) {
        Log.v(TAG, "enter(); channel = " + this.channel.name);
        updatePresence(new PresenceMessage(PresenceMessage.Action.enter, null, obj), completionListener);
    }

    public void enterClient(String str, Object obj, CompletionListener completionListener) {
        if (str == null) {
            Locale locale = Locale.ROOT;
            String strC = sk0.c("Channel ", this.channel.name, ": unable to enter presence channel (null clientId specified)");
            Log.v(TAG, strC);
            if (completionListener != null) {
                completionListener.onError(new ErrorInfo(strC, 40000));
                return;
            }
        }
        Log.v(TAG, "enterClient(); channel = " + this.channel.name + "; clientId = " + str);
        updatePresence(new PresenceMessage(PresenceMessage.Action.enter, str, obj), completionListener);
    }

    public void enterInternalMembers() {
        for (final PresenceMessage presenceMessage : this.internalPresence.members.values()) {
            try {
                enterClientWithId(presenceMessage.id, presenceMessage.clientId, presenceMessage.data, new CompletionListener() { // from class: io.ably.lib.realtime.Presence.1
                    @Override // io.ably.lib.realtime.CompletionListener
                    public void onError(ErrorInfo errorInfo) {
                        Locale locale = Locale.ROOT;
                        String strA = av.a(vb0.a("Cannot automatically re-enter ", presenceMessage.clientId, " on channel ", Presence.this.channel.name, " ("), errorInfo == null ? BuildConfig.FLAVOR : errorInfo.message, ")");
                        Log.e(Presence.TAG, strA);
                        Presence.this.channel.emitUpdate(new ErrorInfo(strA, 91004), true);
                    }

                    @Override // io.ably.lib.realtime.CompletionListener
                    public void onSuccess() {
                    }
                });
            } catch (AblyException e) {
                Locale locale = Locale.ROOT;
                String str = presenceMessage.clientId;
                String str2 = this.channel.name;
                String strA = av.a(vb0.a("Cannot automatically re-enter ", str, " on channel ", str2, " ("), e.errorInfo.message, ")");
                Log.e(TAG, strA);
                this.channel.emitUpdate(new ErrorInfo(strA, 91004), true);
            }
        }
    }

    public synchronized PresenceMessage[] get(Param... paramArr) {
        Collection<PresenceMessage> collection;
        Channel channel = this.channel;
        if (channel.state == ChannelState.failed) {
            throw AblyException.fromErrorInfo(new ErrorInfo("channel operation failed (invalid channel state)", 90001));
        }
        channel.attach();
        try {
            collection = this.presence.get(paramArr);
        } catch (InterruptedException e) {
            String str = TAG;
            Locale locale = Locale.ROOT;
            Log.v(str, "Channel " + this.channel.name + ": get() operation interrupted");
            throw AblyException.fromThrowable(e);
        }
        return (PresenceMessage[]) collection.toArray(new PresenceMessage[collection.size()]);
    }

    public PaginatedResult<PresenceMessage> history(Param[] paramArr) {
        return history(this.channel.ably.http, paramArr);
    }

    public void historyAsync(Param[] paramArr, Callback<AsyncPaginatedResult<PresenceMessage>> callback) {
        historyImpl(this.channel.ably.http, paramArr).async(callback);
    }

    public void leave(Object obj, CompletionListener completionListener) {
        Log.v(TAG, "leave(); channel = " + this.channel.name);
        updatePresence(new PresenceMessage(PresenceMessage.Action.leave, null, obj), completionListener);
    }

    public void leaveClient(String str, Object obj, CompletionListener completionListener) {
        if (str == null) {
            Locale locale = Locale.ROOT;
            String strC = sk0.c("Channel ", this.channel.name, ": unable to leave presence channel (null clientId specified)");
            Log.v(TAG, strC);
            if (completionListener != null) {
                completionListener.onError(new ErrorInfo(strC, 40000));
                return;
            }
        }
        Log.v(TAG, "leaveClient(); channel = " + this.channel.name + "; clientId = " + str);
        updatePresence(new PresenceMessage(PresenceMessage.Action.leave, str, obj), completionListener);
    }

    public void onAttached(boolean z) {
        this.presence.startSync();
        if (!z) {
            endSync();
        }
        sendQueuedMessages();
        enterInternalMembers();
    }

    public void onChannelDetachedOrFailed(ErrorInfo errorInfo) {
        synchronized (this.presence) {
            this.presence.notifyAll();
        }
        this.presence.clear();
        this.internalPresence.clear();
        failQueuedMessages(errorInfo);
    }

    public void onChannelSuspended(ErrorInfo errorInfo) {
        synchronized (this.presence) {
            this.presence.notifyAll();
        }
        failQueuedMessages(errorInfo);
    }

    public void onPresence(ProtocolMessage protocolMessage) {
        boolean zPut;
        updateInnerPresenceMessageFields(protocolMessage);
        ArrayList arrayList = new ArrayList();
        for (PresenceMessage presenceMessage : protocolMessage.presence) {
            boolean zEquals = presenceMessage.connectionId.equals(this.channel.ably.connection.id);
            int i = AnonymousClass2.$SwitchMap$io$ably$lib$types$PresenceMessage$Action[presenceMessage.action.ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                PresenceMessage presenceMessage2 = (PresenceMessage) presenceMessage.clone();
                presenceMessage2.action = PresenceMessage.Action.present;
                zPut = this.presence.put(presenceMessage2);
                if (zEquals) {
                    this.internalPresence.put(presenceMessage);
                }
            } else if (i != 4) {
                zPut = false;
            } else {
                zPut = this.presence.remove(presenceMessage);
                if (zEquals) {
                    this.internalPresence.remove(presenceMessage);
                }
            }
            if (zPut) {
                arrayList.add(presenceMessage);
            }
        }
        broadcastPresence(arrayList);
    }

    public void onSync(ProtocolMessage protocolMessage) {
        String str;
        String str2 = protocolMessage.channelSerial;
        if (StringUtils.isNullOrEmpty(str2)) {
            str = null;
        } else {
            String[] strArrSplit = str2.split(":");
            String str3 = strArrSplit[0];
            str = strArrSplit.length > 1 ? strArrSplit[1] : BuildConfig.FLAVOR;
            if (this.presence.syncInProgress && !StringUtils.isNullOrEmpty(this.currentSyncChannelSerial) && !this.currentSyncChannelSerial.equals(str3)) {
                endSync();
            }
            this.presence.startSync();
            if (!StringUtils.isNullOrEmpty(str)) {
                this.currentSyncChannelSerial = str3;
            }
        }
        onPresence(protocolMessage);
        if (StringUtils.isNullOrEmpty(str2) || StringUtils.isNullOrEmpty(str)) {
            endSync();
            this.currentSyncChannelSerial = null;
        }
    }

    public void subscribe(EnumSet<PresenceMessage.Action> enumSet, PresenceListener presenceListener, CompletionListener completionListener) throws AblyException {
        implicitAttachOnSubscribe(completionListener);
        Iterator<PresenceMessage.Action> it = enumSet.iterator();
        while (it.hasNext()) {
            subscribeImpl(it.next(), presenceListener);
        }
    }

    public void unsubscribe(PresenceListener presenceListener) {
        this.listeners.remove(presenceListener);
        Iterator<Multicaster> it = this.eventListeners.values().iterator();
        while (it.hasNext()) {
            it.next().remove(presenceListener);
        }
    }

    public void update(Object obj, CompletionListener completionListener) {
        Log.v(TAG, "update(); channel = " + this.channel.name);
        updatePresence(new PresenceMessage(PresenceMessage.Action.update, null, obj), completionListener);
    }

    public void updateClient(String str, Object obj, CompletionListener completionListener) {
        if (str == null) {
            Locale locale = Locale.ROOT;
            String strC = sk0.c("Channel ", this.channel.name, ": unable to update presence channel (null clientId specified)");
            Log.v(TAG, strC);
            if (completionListener != null) {
                completionListener.onError(new ErrorInfo(strC, 40000));
                return;
            }
        }
        Log.v(TAG, "updateClient(); channel = " + this.channel.name + "; clientId = " + str);
        updatePresence(new PresenceMessage(PresenceMessage.Action.update, str, obj), completionListener);
    }

    public void updatePresence(PresenceMessage presenceMessage, CompletionListener completionListener) {
        String str = TAG;
        Log.v(str, "updatePresence(); channel = " + this.channel.name);
        AblyRealtime ablyRealtime = this.channel.ably;
        try {
            ablyRealtime.auth.checkClientId(presenceMessage, false, ablyRealtime.connection.state == ConnectionState.connected);
            presenceMessage.encode(null);
            synchronized (this.channel) {
                try {
                    int i = AnonymousClass2.$SwitchMap$io$ably$lib$realtime$ChannelState[this.channel.state.ordinal()];
                    if (i == 1) {
                        this.channel.attach();
                    } else if (i != 2) {
                        if (i != 3) {
                            throw AblyException.fromErrorInfo(new ErrorInfo("Unable to enter presence channel in detached or failed state", CarouselScreenFragment.CAROUSEL_ANIMATION_MS, 91001));
                        }
                        Log.v(str, "updatePresence(); send message to connection manager");
                        ProtocolMessage protocolMessage = new ProtocolMessage(ProtocolMessage.Action.presence, this.channel.name);
                        protocolMessage.presence = new PresenceMessage[]{presenceMessage};
                        ablyRealtime.connection.connectionManager.send(protocolMessage, ablyRealtime.options.queueMessages, Listeners.fromCompletionListener(completionListener));
                    }
                    Log.v(str, "updatePresence(); put message in pending presence queue");
                    this.pendingPresence.add(new QueuedPresence(presenceMessage, completionListener));
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (AblyException e) {
            if (completionListener != null) {
                completionListener.onError(e.errorInfo);
            }
        }
    }

    public PaginatedResult<PresenceMessage> history(Http http, Param[] paramArr) {
        return historyImpl(http, paramArr).sync();
    }

    public void historyAsync(Http http, Param[] paramArr, Callback<AsyncPaginatedResult<PresenceMessage>> callback) {
        historyImpl(http, paramArr).async(callback);
    }

    public void subscribe(PresenceListener presenceListener) throws AblyException {
        subscribe(presenceListener, (CompletionListener) null);
    }

    public void subscribe(PresenceMessage.Action action, PresenceListener presenceListener, CompletionListener completionListener) throws AblyException {
        implicitAttachOnSubscribe(completionListener);
        subscribeImpl(action, presenceListener);
    }

    public void subscribe(PresenceMessage.Action action, PresenceListener presenceListener) throws AblyException {
        subscribe(action, presenceListener, (CompletionListener) null);
    }

    public void subscribe(PresenceListener presenceListener, CompletionListener completionListener) throws AblyException {
        implicitAttachOnSubscribe(completionListener);
        this.listeners.add(presenceListener);
    }

    public void subscribe(EnumSet<PresenceMessage.Action> enumSet, PresenceListener presenceListener) throws AblyException {
        subscribe(enumSet, presenceListener, (CompletionListener) null);
    }

    public void unsubscribe(PresenceMessage.Action action, PresenceListener presenceListener) {
        unsubscribeImpl(action, presenceListener);
    }

    public void unsubscribe(EnumSet<PresenceMessage.Action> enumSet, PresenceListener presenceListener) {
        Iterator<PresenceMessage.Action> it = enumSet.iterator();
        while (it.hasNext()) {
            unsubscribeImpl(it.next(), presenceListener);
        }
    }

    public void leave(CompletionListener completionListener) {
        leave(null, completionListener);
    }

    public void unsubscribe() {
        this.listeners.clear();
        this.eventListeners.clear();
    }

    public void enterClient(String str, Object obj) {
        enterClient(str, obj, null);
    }

    public void leaveClient(String str, Object obj) {
        leaveClient(str, obj, null);
    }

    public void updateClient(String str, Object obj) {
        updateClient(str, obj, null);
    }

    public void enterClient(String str) {
        enterClient(str, null);
    }

    public void leaveClient(String str) {
        leaveClient(str, null);
    }

    public void updateClient(String str) {
        updateClient(str, null);
    }

    public synchronized PresenceMessage[] get(boolean z) {
        return get(new Param(GET_WAITFORSYNC, String.valueOf(z)));
    }

    public synchronized PresenceMessage[] get(String str, boolean z) {
        return get(new Param(GET_WAITFORSYNC, String.valueOf(z)), new Param(GET_CLIENTID, str));
    }
}
