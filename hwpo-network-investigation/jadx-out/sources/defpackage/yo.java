package defpackage;

import android.os.Build;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2", f = "LegacyPlatformTextInputServiceAdapter.android.kt", l = {125}, m = "invokeSuspend", v = 1)
public final class yo extends p6a implements ci4<z18, r02<?>, Object> {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ oh4<x56, g2b> v;
    public final /* synthetic */ zo w;
    public final /* synthetic */ n56.a x;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1", f = "LegacyPlatformTextInputServiceAdapter.android.kt", l = {149}, m = "invokeSuspend", v = 1)
    public static final class a extends p6a implements ci4<t72, r02<?>, Object> {
        public int t;
        public /* synthetic */ Object u;
        public final /* synthetic */ z18 v;
        public final /* synthetic */ oh4<x56, g2b> w;
        public final /* synthetic */ zo x;
        public final /* synthetic */ n56.a y;

        /* JADX INFO: renamed from: yo$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1", f = "LegacyPlatformTextInputServiceAdapter.android.kt", l = {140, 141}, m = "invokeSuspend", v = 1)
        public static final class C0285a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
            public int t;
            public final /* synthetic */ zo u;
            public final /* synthetic */ nd5 v;

            /* JADX INFO: renamed from: yo$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            public static final class C0286a<T> implements s54 {
                public final /* synthetic */ nd5 t;

                public C0286a(nd5 nd5Var) {
                    this.t = nd5Var;
                }

                @Override // defpackage.s54
                public final Object emit(Object obj, r02 r02Var) {
                    if (Build.VERSION.SDK_INT >= 34) {
                        nd5 nd5Var = this.t;
                        nx.a(nd5Var.a(), nd5Var.a);
                    }
                    return g2b.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0285a(zo zoVar, nd5 nd5Var, r02 r02Var) {
                super(2, r02Var);
                this.u = zoVar;
                this.v = nd5Var;
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                return new C0285a(this.u, this.v, r02Var);
            }

            @Override // defpackage.ci4
            public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
                return ((C0285a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                int i = this.t;
                v72 v72Var = v72.t;
                if (i == 0) {
                    dv8.b(obj);
                    xo xoVar = new xo(0);
                    this.t = 1;
                    if (zx6.a(getContext()).u(new yx6(0, xoVar), this) == v72Var) {
                        return v72Var;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            aa0.c("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        dv8.b(obj);
                        fl.a();
                        return null;
                    }
                    dv8.b(obj);
                }
                f37<g2b> f37VarK = this.u.k();
                if (f37VarK == null) {
                    return g2b.a;
                }
                C0286a c0286a = new C0286a(this.v);
                this.t = 2;
                am9.n((am9) f37VarK, c0286a, this);
                return v72Var;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final /* synthetic */ class b extends pi4 implements oh4<xk6, g2b> {
            public final /* synthetic */ n56.a t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(n56.a aVar) {
                super(1, xj5.a.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
                this.t = aVar;
            }

            @Override // defpackage.oh4
            public final g2b invoke(xk6 xk6Var) {
                float[] fArr = xk6Var.a;
                qq5 qq5VarS = this.t.S();
                if (qq5VarS != null) {
                    if (!qq5VarS.e()) {
                        qq5VarS = null;
                    }
                    if (qq5VarS != null) {
                        qq5VarS.y(fArr);
                    }
                }
                return g2b.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(z18 z18Var, oh4<? super x56, g2b> oh4Var, zo zoVar, n56.a aVar, r02<? super a> r02Var) {
            super(2, r02Var);
            this.v = z18Var;
            this.w = oh4Var;
            this.x = zoVar;
            this.y = aVar;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            a aVar = new a(this.v, this.w, this.x, this.y, r02Var);
            aVar.u = obj;
            return aVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<?> r02Var) throws Throwable {
            ((a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
            return v72.t;
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            zo zoVar = this.x;
            try {
                if (i != 0) {
                    if (i != 1) {
                        aa0.c("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dv8.b(obj);
                    throw new qp5();
                }
                dv8.b(obj);
                t72 t72Var = (t72) this.u;
                o56.a aVar = o56.a;
                z18 z18Var = this.v;
                View viewA = z18Var.a();
                aVar.getClass();
                nd5 nd5Var = new nd5(viewA);
                x56 x56Var = new x56(z18Var.a(), new b(this.y), nd5Var);
                if (p3a.a) {
                    oy0.d(t72Var, null, null, new C0285a(zoVar, nd5Var, null), 3);
                }
                oh4<x56, g2b> oh4Var = this.w;
                if (oh4Var != null) {
                    oh4Var.invoke(x56Var);
                }
                zoVar.c = x56Var;
                this.t = 1;
                z18Var.b(x56Var, this);
                return v72.t;
            } catch (Throwable th) {
                zoVar.c = null;
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public yo(oh4<? super x56, g2b> oh4Var, zo zoVar, n56.a aVar, r02<? super yo> r02Var) {
        super(2, r02Var);
        this.v = oh4Var;
        this.w = zoVar;
        this.x = aVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        yo yoVar = new yo(this.v, this.w, this.x, r02Var);
        yoVar.u = obj;
        return yoVar;
    }

    @Override // defpackage.ci4
    public final Object invoke(z18 z18Var, r02<?> r02Var) throws Throwable {
        ((yo) create(z18Var, r02Var)).invokeSuspend(g2b.a);
        return v72.t;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            a aVar = new a((z18) this.u, this.v, this.w, this.x, null);
            this.t = 1;
            Object objD = u72.d(aVar, this);
            v72 v72Var = v72.t;
            if (objD == v72Var) {
                return v72Var;
            }
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        fl.a();
        return null;
    }
}
