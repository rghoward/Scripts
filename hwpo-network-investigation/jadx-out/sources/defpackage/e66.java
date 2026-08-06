package defpackage;

import io.ably.lib.transport.Defaults;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.LegacyYouTubePlayerView$observeNetworkEvents$1$1", f = "LegacyYouTubePlayerView.kt", l = {Defaults.PORT}, m = "invokeSuspend", v = 2)
public final class e66 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ m76 u;
    public final /* synthetic */ g66 v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.LegacyYouTubePlayerView$observeNetworkEvents$1$1$1", f = "LegacyYouTubePlayerView.kt", l = {86}, m = "invokeSuspend", v = 2)
    public static final class a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;
        public final /* synthetic */ g66 u;

        /* JADX INFO: renamed from: e66$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.LegacyYouTubePlayerView$observeNetworkEvents$1$1$1$2", f = "LegacyYouTubePlayerView.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C0077a extends p6a implements ci4<t97.a, r02<? super g2b>, Object> {
            public final /* synthetic */ g66 t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0077a(g66 g66Var, r02<? super C0077a> r02Var) {
                super(2, r02Var);
                this.t = g66Var;
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                return new C0077a(this.t, r02Var);
            }

            @Override // defpackage.ci4
            public final Object invoke(t97.a aVar, r02<? super g2b> r02Var) {
                return ((C0077a) create(aVar, r02Var)).invokeSuspend(g2b.a);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                dv8.b(obj);
                g66 g66Var = this.t;
                if (g66Var.w) {
                    l28 l28Var = g66Var.v;
                    elb youTubePlayer$youtube_player = g66Var.getYouTubePlayer$youtube_player();
                    l28Var.getClass();
                    youTubePlayer$youtube_player.getClass();
                    String str = l28Var.d;
                    if (str != null) {
                        boolean z = l28Var.b;
                        w28 w28Var = w28.v;
                        if (z && l28Var.c == w28Var) {
                            boolean z2 = l28Var.a;
                            float f = l28Var.e;
                            if (z2) {
                                youTubePlayer$youtube_player.f(str, f);
                            } else {
                                youTubePlayer$youtube_player.c(str, f);
                            }
                        } else if (!z && l28Var.c == w28Var) {
                            youTubePlayer$youtube_player.c(str, l28Var.e);
                        }
                    }
                    l28Var.c = null;
                } else {
                    g66Var.x.invoke();
                }
                return g2b.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g66 g66Var, r02<? super a> r02Var) {
            super(2, r02Var);
            this.u = g66Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new a(this.u, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                g66 g66Var = this.u;
                x21 x21Var = g66Var.u.d;
                C0077a c0077a = new C0077a(g66Var, null);
                this.t = 1;
                Object objCollect = x21Var.collect(new f66(new k74.a(jc7.t, c0077a)), this);
                v72 v72Var = v72.t;
                if (objCollect != v72Var) {
                    objCollect = g2b.a;
                }
                if (objCollect != v72Var) {
                    objCollect = g2b.a;
                }
                if (objCollect != v72Var) {
                    objCollect = g2b.a;
                }
                if (objCollect == v72Var) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e66(m76 m76Var, g66 g66Var, r02<? super e66> r02Var) {
        super(2, r02Var);
        this.u = m76Var;
        this.v = g66Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new e66(this.u, this.v, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((e66) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            a aVar = new a(this.v, null);
            this.t = 1;
            Object objA = sn8.a(this.u.getLifecycle(), s66.b.w, aVar, this);
            Object obj2 = v72.t;
            if (objA != obj2) {
                objA = g2b.a;
            }
            if (objA == obj2) {
                return obj2;
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
