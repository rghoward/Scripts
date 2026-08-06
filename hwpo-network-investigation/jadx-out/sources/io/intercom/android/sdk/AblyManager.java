package io.intercom.android.sdk;

import com.intercom.twig.Twig;
import defpackage.a0;
import defpackage.aa0;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.et2;
import defpackage.ff3;
import defpackage.g2b;
import defpackage.gya;
import defpackage.h72;
import defpackage.hf3;
import defpackage.i23;
import defpackage.k5a;
import defpackage.mh4;
import defpackage.od3;
import defpackage.oy0;
import defpackage.p6a;
import defpackage.qa8;
import defpackage.r02;
import defpackage.r54;
import defpackage.rh1;
import defpackage.t72;
import defpackage.th1;
import defpackage.u02;
import defpackage.u72;
import defpackage.ua8;
import defpackage.um9;
import defpackage.v72;
import defpackage.wr2;
import defpackage.ws0;
import defpackage.xj5;
import defpackage.xm2;
import defpackage.yk2;
import defpackage.z;
import defpackage.zl9;
import io.ably.lib.realtime.AblyRealtime;
import io.ably.lib.realtime.Channel;
import io.ably.lib.realtime.ChannelBase;
import io.ably.lib.realtime.ChannelEvent;
import io.ably.lib.realtime.ChannelStateListener;
import io.ably.lib.realtime.Connection;
import io.ably.lib.realtime.ConnectionState;
import io.ably.lib.realtime.ConnectionStateListener;
import io.ably.lib.rest.Auth;
import io.ably.lib.types.ClientOptions;
import io.ably.lib.types.Message;
import io.intercom.android.sdk.AblyManager;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.FeatureFlag;
import io.intercom.android.sdk.m5.conversation.data.ParsedAblyEvent;
import io.intercom.android.sdk.m5.conversation.data.ParsedAblyEventKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.AblyAuthResponse;
import io.intercom.android.sdk.models.AblyEndpoint;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class AblyManager {
    public static final int $stable = 8;
    private zl9<? extends ParsedAblyEvent> _sharedEventFlow;
    private AblyRealtime ablyRealtime;
    private ChannelStateListener channelStateListener;
    private ConnectionStateListener connectionListener;
    private Channel currentChannel;
    private boolean hasChannelBeenAttached;
    private Channel.MessageListener messageListener;
    private final MessengerApi messengerApi;
    private ChannelStateListener registeredChannelStateListener;
    private ConnectionStateListener registeredConnectionListener;
    private final t72 scope;
    private final Twig twig;

    /* JADX INFO: renamed from: io.intercom.android.sdk.AblyManager$connect$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.AblyManager$connect$1", f = "AblyManager.kt", l = {155}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        int label;

        public AnonymousClass1(r02<? super AnonymousClass1> r02Var) {
            super(2, r02Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$2(AblyManager ablyManager, ConnectionStateListener.ConnectionStateChange connectionStateChange) {
            String strName = connectionStateChange.current.name();
            if (xj5.a(strName, "connected")) {
                ablyManager.twig.d("AblyManager: Connected", new Object[0]);
            } else if (xj5.a(strName, MetricTracker.Action.FAILED)) {
                ablyManager.twig.e("AblyManager: Connection failed: " + connectionStateChange.reason, new Object[0]);
            }
            ConnectionStateListener connectionStateListener = ablyManager.connectionListener;
            if (connectionStateListener != null) {
                connectionStateListener.onConnectionStateChanged(connectionStateChange);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$3(AblyManager ablyManager, ChannelStateListener.ChannelStateChange channelStateChange) {
            ChannelStateListener channelStateListener = ablyManager.channelStateListener;
            if (channelStateListener != null) {
                channelStateListener.onChannelStateChanged(channelStateChange);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$4(AblyManager ablyManager, Message message) {
            Channel.MessageListener messageListener = ablyManager.messageListener;
            if (messageListener != null) {
                messageListener.onMessage(message);
            }
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return AblyManager.this.new AnonymousClass1(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((AnonymousClass1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            AblyRealtime.Channels channels;
            Connection connection;
            int i = this.label;
            Channel channel = null;
            try {
                if (i == 0) {
                    dv8.b(obj);
                    AblyManager.this.twig.d("AblyManager: Connecting...", new Object[0]);
                    AblyManager ablyManager = AblyManager.this;
                    this.label = 1;
                    obj = ablyManager.getAblyConfiguration(this);
                    v72 v72Var = v72.t;
                    if (obj == v72Var) {
                        return v72Var;
                    }
                } else {
                    if (i != 1) {
                        aa0.c("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dv8.b(obj);
                }
                gya gyaVar = (gya) obj;
                if (gyaVar == null) {
                    return g2b.a;
                }
                String str = (String) gyaVar.t;
                String str2 = (String) gyaVar.u;
                List<AblyEndpoint> list = (List) gyaVar.v;
                ClientOptions clientOptions = new ClientOptions();
                AblyManager ablyManager2 = AblyManager.this;
                clientOptions.token = str;
                clientOptions.authCallback = ablyManager2.createAuthCallback();
                ArrayList arrayList = new ArrayList();
                for (AblyEndpoint ablyEndpoint : list) {
                    List listH = ws0.h(ablyEndpoint.getEndpoint());
                    List<String> fallback = ablyEndpoint.getFallback();
                    if (fallback == null) {
                        fallback = hf3.t;
                    }
                    rh1.o(th1.K(listH, fallback), arrayList);
                }
                if (!arrayList.isEmpty()) {
                    clientOptions.fallbackHosts = (String[]) arrayList.toArray(new String[0]);
                }
                AblyManager.this.ablyRealtime = new AblyRealtime(clientOptions);
                final AblyManager ablyManager3 = AblyManager.this;
                ConnectionStateListener connectionStateListener = new ConnectionStateListener() { // from class: io.intercom.android.sdk.a
                    @Override // io.ably.lib.realtime.ConnectionStateListener
                    public final void onConnectionStateChanged(ConnectionStateListener.ConnectionStateChange connectionStateChange) {
                        AblyManager.AnonymousClass1.invokeSuspend$lambda$2(ablyManager3, connectionStateChange);
                    }
                };
                ablyManager3.registeredConnectionListener = connectionStateListener;
                AblyRealtime ablyRealtime = AblyManager.this.ablyRealtime;
                if (ablyRealtime != null && (connection = ablyRealtime.connection) != null) {
                    connection.on(connectionStateListener);
                }
                AblyManager ablyManager4 = AblyManager.this;
                AblyRealtime ablyRealtime2 = ablyManager4.ablyRealtime;
                if (ablyRealtime2 != null && (channels = ablyRealtime2.channels) != null) {
                    channel = channels.get(str2);
                }
                ablyManager4.currentChannel = channel;
                final AblyManager ablyManager5 = AblyManager.this;
                ChannelStateListener channelStateListener = new ChannelStateListener() { // from class: io.intercom.android.sdk.b
                    @Override // io.ably.lib.realtime.ChannelStateListener
                    public final void onChannelStateChanged(ChannelStateListener.ChannelStateChange channelStateChange) {
                        AblyManager.AnonymousClass1.invokeSuspend$lambda$3(ablyManager5, channelStateChange);
                    }
                };
                ablyManager5.registeredChannelStateListener = channelStateListener;
                Channel channel2 = AblyManager.this.currentChannel;
                if (channel2 != null) {
                    channel2.on(channelStateListener);
                }
                Channel channel3 = AblyManager.this.currentChannel;
                if (channel3 != null) {
                    final AblyManager ablyManager6 = AblyManager.this;
                    channel3.subscribe(new ChannelBase.MessageListener() { // from class: io.intercom.android.sdk.c
                        @Override // io.ably.lib.realtime.ChannelBase.MessageListener
                        public final void onMessage(Message message) {
                            AblyManager.AnonymousClass1.invokeSuspend$lambda$4(ablyManager6, message);
                        }
                    });
                }
                return g2b.a;
            } catch (Exception e) {
                AblyManager.this.twig.e(a0.a(e, new StringBuilder("AblyManager: Connection error: ")), new Object[0]);
            }
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.AblyManager$createAblyEventFlow$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.AblyManager$createAblyEventFlow$1", f = "AblyManager.kt", l = {134}, m = "invokeSuspend")
    public static final class C02991 extends p6a implements ci4<ua8<? super ParsedAblyEvent>, r02<? super g2b>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public C02991(r02<? super C02991> r02Var) {
            super(2, r02Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(AblyManager ablyManager, ua8 ua8Var, Message message) {
            ablyManager.twig.d("AblyManager: Received message: " + message.name, new Object[0]);
            ParsedAblyEvent parsedAblyEventAsAblyData = ParsedAblyEventKt.asAblyData(message);
            ablyManager.twig.d("AblyManager: Parsed event: " + parsedAblyEventAsAblyData, new Object[0]);
            ua8Var.n(parsedAblyEventAsAblyData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$1(ua8 ua8Var, AblyManager ablyManager, ConnectionStateListener.ConnectionStateChange connectionStateChange) {
            String strName = connectionStateChange.current.name();
            int iHashCode = strName.hashCode();
            if (iHashCode == -1357520532) {
                if (strName.equals(MetricTracker.Action.CLOSED)) {
                    ua8Var.n(ParsedAblyEvent.AblyClosed.INSTANCE);
                    ablyManager.twig.d("AblyManager: Connection closed", new Object[0]);
                    return;
                }
                return;
            }
            if (iHashCode != -1281977283) {
                if (iHashCode == -579210487 && strName.equals("connected")) {
                    ua8Var.n(ParsedAblyEvent.AblyConnected.INSTANCE);
                    return;
                }
                return;
            }
            if (strName.equals(MetricTracker.Action.FAILED)) {
                ua8Var.n(ParsedAblyEvent.AblyFailed.INSTANCE);
                ablyManager.twig.e("AblyManager: Connection failed", new Object[0]);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$2(AblyManager ablyManager, ua8 ua8Var, ChannelStateListener.ChannelStateChange channelStateChange) {
            String strName = channelStateChange.current.name();
            boolean z = channelStateChange.resumed;
            ablyManager.twig.d("AblyManager: Channel state changed to " + strName + ", resumed=" + z + ", hasBeenAttached=" + ablyManager.hasChannelBeenAttached, new Object[0]);
            if (!z && ablyManager.hasChannelBeenAttached && (xj5.a(strName, "attached") || channelStateChange.event == ChannelEvent.update)) {
                ablyManager.twig.d("AblyManager: Channel reconnected without resume - message continuity lost", new Object[0]);
                ua8Var.n(ParsedAblyEvent.AblyReconnectedWithoutResume.INSTANCE);
            }
            if (xj5.a(strName, "attached")) {
                ablyManager.hasChannelBeenAttached = true;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invokeSuspend$lambda$3(AblyManager ablyManager) {
            ablyManager.removeListeners();
            return g2b.a;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            C02991 c02991 = AblyManager.this.new C02991(r02Var);
            c02991.L$0 = obj;
            return c02991;
        }

        @Override // defpackage.ci4
        public final Object invoke(ua8<? super ParsedAblyEvent> ua8Var, r02<? super g2b> r02Var) {
            return ((C02991) create(ua8Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                final ua8 ua8Var = (ua8) this.L$0;
                final AblyManager ablyManager = AblyManager.this;
                Channel.MessageListener messageListener = new Channel.MessageListener() { // from class: io.intercom.android.sdk.d
                    @Override // io.ably.lib.realtime.ChannelBase.MessageListener
                    public final void onMessage(Message message) {
                        AblyManager.C02991.invokeSuspend$lambda$0(ablyManager, ua8Var, message);
                    }
                };
                ConnectionStateListener connectionStateListener = new ConnectionStateListener() { // from class: io.intercom.android.sdk.e
                    @Override // io.ably.lib.realtime.ConnectionStateListener
                    public final void onConnectionStateChanged(ConnectionStateListener.ConnectionStateChange connectionStateChange) {
                        AblyManager.C02991.invokeSuspend$lambda$1(ua8Var, ablyManager, connectionStateChange);
                    }
                };
                ChannelStateListener channelStateListener = new ChannelStateListener() { // from class: io.intercom.android.sdk.f
                    @Override // io.ably.lib.realtime.ChannelStateListener
                    public final void onChannelStateChanged(ChannelStateListener.ChannelStateChange channelStateChange) {
                        AblyManager.C02991.invokeSuspend$lambda$2(ablyManager, ua8Var, channelStateChange);
                    }
                };
                ablyManager.messageListener = messageListener;
                AblyManager.this.connectionListener = connectionStateListener;
                AblyManager.this.channelStateListener = channelStateListener;
                if (AblyManager.this.ablyRealtime == null) {
                    AblyManager.this.connect();
                }
                final AblyManager ablyManager2 = AblyManager.this;
                mh4 mh4Var = new mh4() { // from class: io.intercom.android.sdk.g
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return AblyManager.C02991.invokeSuspend$lambda$3(ablyManager2);
                    }
                };
                this.label = 1;
                Object objA = qa8.a(ua8Var, mh4Var, this);
                v72 v72Var = v72.t;
                if (objA == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.AblyManager$disconnect$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.AblyManager$disconnect$1", f = "AblyManager.kt", l = {}, m = "invokeSuspend")
    public static final class C03001 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        int label;

        public C03001(r02<? super C03001> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return AblyManager.this.new C03001(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C03001) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            Connection connection;
            AblyRealtime ablyRealtime;
            Connection connection2;
            Channel channel;
            if (this.label != 0) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
            try {
                ChannelStateListener channelStateListener = AblyManager.this.registeredChannelStateListener;
                if (channelStateListener != null && (channel = AblyManager.this.currentChannel) != null) {
                    channel.off(channelStateListener);
                }
                ConnectionStateListener connectionStateListener = AblyManager.this.registeredConnectionListener;
                if (connectionStateListener != null && (ablyRealtime = AblyManager.this.ablyRealtime) != null && (connection2 = ablyRealtime.connection) != null) {
                    connection2.off(connectionStateListener);
                }
                Channel channel2 = AblyManager.this.currentChannel;
                if (channel2 != null) {
                    channel2.unsubscribe();
                }
                AblyRealtime ablyRealtime2 = AblyManager.this.ablyRealtime;
                if (ablyRealtime2 != null && (connection = ablyRealtime2.connection) != null) {
                    connection.close();
                }
                AblyManager.this.ablyRealtime = null;
                AblyManager.this.currentChannel = null;
                AblyManager.this.messageListener = null;
                AblyManager.this.connectionListener = null;
                AblyManager.this.channelStateListener = null;
                AblyManager.this.registeredConnectionListener = null;
                AblyManager.this.registeredChannelStateListener = null;
                AblyManager.this.hasChannelBeenAttached = false;
                AblyManager.this._sharedEventFlow = null;
                AblyManager.this.twig.d("AblyManager: Disconnected from Ably", new Object[0]);
            } catch (Exception e) {
                AblyManager.this.twig.e(a0.a(e, new StringBuilder("AblyManager: Disconnect error: ")), new Object[0]);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.AblyManager$getAblyConfiguration$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.AblyManager", f = "AblyManager.kt", l = {216, 226}, m = "getAblyConfiguration")
    public static final class C03011 extends u02 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C03011(r02<? super C03011> r02Var) {
            super(r02Var);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AblyManager.this.getAblyConfiguration(this);
        }
    }

    public AblyManager(Twig twig, MessengerApi messengerApi) {
        twig.getClass();
        messengerApi.getClass();
        this.twig = twig;
        this.messengerApi = messengerApi;
        k5a k5aVarB = od3.b();
        et2 et2Var = i23.a;
        this.scope = u72.a(h72.a.C0100a.c(k5aVarB, wr2.v));
    }

    private final r54<ParsedAblyEvent> createAblyEventFlow() {
        return yk2.d(new C02991(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Auth.TokenCallback createAuthCallback() {
        return new Auth.TokenCallback() { // from class: y
            @Override // io.ably.lib.rest.Auth.TokenCallback
            public final Object getTokenRequest(Auth.TokenParams tokenParams) {
                return AblyManager.createAuthCallback$lambda$1(this.a, tokenParams);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object createAuthCallback$lambda$1(AblyManager ablyManager, Auth.TokenParams tokenParams) throws Exception {
        try {
            NetworkResponse networkResponse = (NetworkResponse) oy0.f(ff3.t, new AblyManager$createAuthCallback$1$authResponse$1(ablyManager, null));
            if (networkResponse instanceof NetworkResponse.Success) {
                ablyManager.twig.d("AblyManager: Auth callback got fresh token", new Object[0]);
                return ((AblyAuthResponse) ((NetworkResponse.Success) networkResponse).getBody()).getToken();
            }
            ablyManager.twig.e("AblyManager: Auth callback failed to get token", new Object[0]);
            throw new Exception("Failed to get auth token from server");
        } catch (Exception e) {
            ablyManager.twig.e(a0.a(e, new StringBuilder("AblyManager: Auth callback error: ")), new Object[0]);
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0078, code lost:
    
        if (r0 == r6) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getAblyConfiguration(defpackage.r02<? super defpackage.gya<java.lang.String, java.lang.String, ? extends java.util.List<io.intercom.android.sdk.models.AblyEndpoint>>> r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.AblyManager.getAblyConfiguration(r02):java.lang.Object");
    }

    public final void connect() {
        if (!((AppConfig) z.a()).hasFeature(FeatureFlag.ABLY_REALTIME_DISABLED) && this.ablyRealtime == null) {
            oy0.d(this.scope, null, null, new AnonymousClass1(null), 3);
        }
    }

    public final void disconnect() {
        oy0.d(this.scope, null, null, new C03001(null), 3);
    }

    public final zl9<ParsedAblyEvent> getSharedEventFlow() {
        this.twig.d("AblyManager: getSharedEventFlow() called", new Object[0]);
        if (this._sharedEventFlow == null) {
            synchronized (this) {
                try {
                    if (this._sharedEventFlow == null) {
                        this.twig.d("AblyManager: Creating new shared flow", new Object[0]);
                        this._sharedEventFlow = yk2.s(createAblyEventFlow(), this.scope, um9.a.a, 0);
                    }
                    g2b g2bVar = g2b.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        zl9 zl9Var = this._sharedEventFlow;
        zl9Var.getClass();
        return zl9Var;
    }

    public final boolean isConnected() {
        Connection connection;
        ConnectionState connectionState;
        AblyRealtime ablyRealtime = this.ablyRealtime;
        return xj5.a((ablyRealtime == null || (connection = ablyRealtime.connection) == null || (connectionState = connection.state) == null) ? null : connectionState.name(), "connected");
    }

    public final void removeListeners() {
        this.messageListener = null;
        this.connectionListener = null;
        this.channelStateListener = null;
    }
}
