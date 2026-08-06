package io.intercom.android.sdk.m5.conversation.usecase;

import defpackage.aa0;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.mh4;
import defpackage.p6a;
import defpackage.qa8;
import defpackage.r02;
import defpackage.r54;
import defpackage.ua8;
import defpackage.v72;
import defpackage.xm2;
import defpackage.yk2;
import io.intercom.android.sdk.m5.conversation.states.NetworkState;
import io.intercom.android.sdk.utilities.connectivity.NetworkConnectivityMonitor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class GetNetworkState {
    public static final int $stable = 8;
    private final NetworkConnectivityMonitor networkConnectivityMonitor;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.usecase.GetNetworkState$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.conversation.usecase.GetNetworkState$invoke$1", f = "GetNetworkState.kt", l = {24}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends p6a implements ci4<ua8<? super NetworkState>, r02<? super g2b>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(r02<? super AnonymousClass1> r02Var) {
            super(2, r02Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invokeSuspend$lambda$0(GetNetworkState getNetworkState) {
            getNetworkState.networkConnectivityMonitor.setListener(null);
            return g2b.a;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            AnonymousClass1 anonymousClass1 = GetNetworkState.this.new AnonymousClass1(r02Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.ci4
        public final Object invoke(ua8<? super NetworkState> ua8Var, r02<? super g2b> r02Var) {
            return ((AnonymousClass1) create(ua8Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                final ua8 ua8Var = (ua8) this.L$0;
                GetNetworkState.this.networkConnectivityMonitor.setListener(new NetworkConnectivityMonitor.ConnectivityEventListener() { // from class: io.intercom.android.sdk.m5.conversation.usecase.GetNetworkState.invoke.1.1
                    @Override // io.intercom.android.sdk.utilities.connectivity.NetworkConnectivityMonitor.ConnectivityEventListener
                    public void onDisconnect() {
                        ua8Var.n(NetworkState.Disconnected.INSTANCE);
                    }

                    @Override // io.intercom.android.sdk.utilities.connectivity.NetworkConnectivityMonitor.ConnectivityEventListener
                    public void onReconnect() {
                        ua8Var.n(NetworkState.Reconnected.INSTANCE);
                    }
                });
                final GetNetworkState getNetworkState = GetNetworkState.this;
                mh4 mh4Var = new mh4() { // from class: io.intercom.android.sdk.m5.conversation.usecase.a
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return GetNetworkState.AnonymousClass1.invokeSuspend$lambda$0(getNetworkState);
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

    public GetNetworkState(NetworkConnectivityMonitor networkConnectivityMonitor) {
        networkConnectivityMonitor.getClass();
        this.networkConnectivityMonitor = networkConnectivityMonitor;
    }

    public final r54<NetworkState> invoke() {
        return yk2.d(new AnonymousClass1(null));
    }
}
