package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.activity.compose.ComposePredictiveBackHandler$launchNewGesture$1", f = "PredictiveBackHandler.kt", l = {231}, m = "invokeSuspend", v = 1)
public final class ps1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public cl8 t;
    public int u;
    public final /* synthetic */ os1 v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.activity.compose.ComposePredictiveBackHandler$launchNewGesture$1$1", f = "PredictiveBackHandler.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends p6a implements ei4<s54<? super gh0>, Throwable, r02<? super g2b>, Object> {
        public final /* synthetic */ cl8 t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(cl8 cl8Var, r02<? super a> r02Var) {
            super(3, r02Var);
            this.t = cl8Var;
        }

        @Override // defpackage.ei4
        public final Object invoke(s54<? super gh0> s54Var, Throwable th, r02<? super g2b> r02Var) {
            return new a(this.t, r02Var).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            this.t.t = true;
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ps1(os1 os1Var, r02<? super ps1> r02Var) {
        super(2, r02Var);
        this.v = os1Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new ps1(this.v, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((ps1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        cl8 cl8Var;
        int i = this.u;
        if (i == 0) {
            dv8.b(obj);
            os1 os1Var = this.v;
            if (os1Var.a()) {
                cl8 cl8Var2 = new cl8();
                ci4<? super r54<gh0>, ? super r02<? super g2b>, ? extends Object> ci4Var = os1Var.d;
                zx0 zx0Var = os1Var.e;
                zx0Var.getClass();
                l64 l64Var = new l64(yk2.g(zx0Var), new a(cl8Var2, null));
                this.t = cl8Var2;
                this.u = 1;
                Object objInvoke = ci4Var.invoke(l64Var, this);
                v72 v72Var = v72.t;
                if (objInvoke == v72Var) {
                    return v72Var;
                }
                cl8Var = cl8Var2;
            }
            return g2b.a;
        }
        if (i != 1) {
            aa0.c("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        cl8Var = this.t;
        dv8.b(obj);
        if (!cl8Var.t) {
            aa0.c("You must collect the progress flow");
            return null;
        }
        return g2b.a;
    }
}
