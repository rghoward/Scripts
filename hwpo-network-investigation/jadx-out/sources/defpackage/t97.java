package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class t97 {
    public final Context a;
    public final o7a b = new o7a(new r97());
    public final o7a c = new o7a(new s97(0, this));
    public final x21 d = yk2.d(new b(null));

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static final a t;
        public static final a u;
        public static final /* synthetic */ a[] v;

        static {
            a aVar = new a("AVAILABLE", 0);
            t = aVar;
            a aVar2 = new a("UNAVAILABLE", 1);
            u = aVar2;
            v = new a[]{aVar, aVar2};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) v.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils.NetworkListener$stateUpdates$1", f = "NetworkListener.kt", l = {47}, m = "invokeSuspend", v = 2)
    public static final class b extends p6a implements ci4<ua8<? super a>, r02<? super g2b>, Object> {
        public int t;
        public /* synthetic */ Object u;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class a extends ConnectivityManager.NetworkCallback {
            public boolean a;
            public final /* synthetic */ ua8<a> b;

            /* JADX INFO: renamed from: t97$b$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            @xm2(c = "com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils.NetworkListener$stateUpdates$1$networkCallback$1$onAvailable$1", f = "NetworkListener.kt", l = {25}, m = "invokeSuspend", v = 2)
            public static final class C0249a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
                public int t;
                public final /* synthetic */ ua8<a> u;
                public final /* synthetic */ a v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0249a(ua8<? super a> ua8Var, a aVar, r02<? super C0249a> r02Var) {
                    super(2, r02Var);
                    this.u = ua8Var;
                    this.v = aVar;
                }

                @Override // defpackage.ak0
                public final r02<g2b> create(Object obj, r02<?> r02Var) {
                    return new C0249a(this.u, this.v, r02Var);
                }

                @Override // defpackage.ci4
                public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
                    return ((C0249a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
                }

                @Override // defpackage.ak0
                public final Object invokeSuspend(Object obj) throws Throwable {
                    int i = this.t;
                    if (i == 0) {
                        dv8.b(obj);
                        this.t = 1;
                        Object objA = this.u.a(this, a.t);
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
                    this.v.a = true;
                    return g2b.a;
                }
            }

            /* JADX INFO: renamed from: t97$b$a$b, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            @xm2(c = "com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils.NetworkListener$stateUpdates$1$networkCallback$1$onLost$1", f = "NetworkListener.kt", l = {33}, m = "invokeSuspend", v = 2)
            public static final class C0250b extends p6a implements ci4<t72, r02<? super g2b>, Object> {
                public int t;
                public final /* synthetic */ ua8<a> u;
                public final /* synthetic */ a v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0250b(ua8<? super a> ua8Var, a aVar, r02<? super C0250b> r02Var) {
                    super(2, r02Var);
                    this.u = ua8Var;
                    this.v = aVar;
                }

                @Override // defpackage.ak0
                public final r02<g2b> create(Object obj, r02<?> r02Var) {
                    return new C0250b(this.u, this.v, r02Var);
                }

                @Override // defpackage.ci4
                public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
                    return ((C0250b) create(t72Var, r02Var)).invokeSuspend(g2b.a);
                }

                @Override // defpackage.ak0
                public final Object invokeSuspend(Object obj) throws Throwable {
                    int i = this.t;
                    if (i == 0) {
                        dv8.b(obj);
                        this.t = 1;
                        Object objA = this.u.a(this, a.u);
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
                    this.v.a = false;
                    return g2b.a;
                }
            }

            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            @xm2(c = "com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils.NetworkListener$stateUpdates$1$networkCallback$1$onUnavailable$1", f = "NetworkListener.kt", l = {41}, m = "invokeSuspend", v = 2)
            public static final class c extends p6a implements ci4<t72, r02<? super g2b>, Object> {
                public int t;
                public final /* synthetic */ ua8<a> u;
                public final /* synthetic */ a v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public c(ua8<? super a> ua8Var, a aVar, r02<? super c> r02Var) {
                    super(2, r02Var);
                    this.u = ua8Var;
                    this.v = aVar;
                }

                @Override // defpackage.ak0
                public final r02<g2b> create(Object obj, r02<?> r02Var) {
                    return new c(this.u, this.v, r02Var);
                }

                @Override // defpackage.ci4
                public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
                    return ((c) create(t72Var, r02Var)).invokeSuspend(g2b.a);
                }

                @Override // defpackage.ak0
                public final Object invokeSuspend(Object obj) throws Throwable {
                    int i = this.t;
                    if (i == 0) {
                        dv8.b(obj);
                        this.t = 1;
                        Object objA = this.u.a(this, a.u);
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
                    this.v.a = false;
                    return g2b.a;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a(ua8<? super a> ua8Var) {
                this.b = ua8Var;
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onAvailable(Network network) {
                network.getClass();
                super.onAvailable(network);
                if (this.a) {
                    return;
                }
                ua8<a> ua8Var = this.b;
                oy0.d(ua8Var, null, null, new C0249a(ua8Var, this, null), 3);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onLost(Network network) {
                network.getClass();
                super.onLost(network);
                if (this.a) {
                    ua8<a> ua8Var = this.b;
                    oy0.d(ua8Var, null, null, new C0250b(ua8Var, this, null), 3);
                }
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onUnavailable() {
                super.onUnavailable();
                if (this.a) {
                    ua8<a> ua8Var = this.b;
                    oy0.d(ua8Var, null, null, new c(ua8Var, this, null), 3);
                }
            }
        }

        public b(r02<? super b> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            b bVar = t97.this.new b(r02Var);
            bVar.u = obj;
            return bVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(ua8<? super a> ua8Var, r02<? super g2b> r02Var) {
            return ((b) create(ua8Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            ua8 ua8Var = (ua8) this.u;
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                final a aVar = new a(ua8Var);
                final t97 t97Var = t97.this;
                ((ConnectivityManager) t97Var.c.getValue()).requestNetwork((NetworkRequest) t97Var.b.getValue(), aVar);
                mh4 mh4Var = new mh4() { // from class: u97
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        ((ConnectivityManager) t97Var.c.getValue()).unregisterNetworkCallback(aVar);
                        return g2b.a;
                    }
                };
                this.u = null;
                this.t = 1;
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

    public t97(Context context) {
        this.a = context;
    }
}
