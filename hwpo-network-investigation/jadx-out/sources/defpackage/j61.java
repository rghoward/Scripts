package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3", f = "PlatformTextInputModifierNode.kt", l = {237}, m = "invokeSuspend", v = 1)
public final class j61 extends p6a implements ci4<g2b, r02<?>, Object> {
    public int t;
    public final /* synthetic */ l61 u;
    public final /* synthetic */ t18 v;
    public final /* synthetic */ a28 w;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends wp5 implements mh4<s18> {
        @Override // defpackage.mh4
        public final s18 invoke() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3$2", f = "PlatformTextInputModifierNode.kt", l = {238}, m = "invokeSuspend", v = 1)
    public static final class b extends p6a implements ci4<s18, r02<? super g2b>, Object> {
        public int t;
        public /* synthetic */ Object u;
        public final /* synthetic */ t18 v;
        public final /* synthetic */ a28 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(t18 t18Var, a28 a28Var, r02<? super b> r02Var) {
            super(2, r02Var);
            this.v = t18Var;
            this.w = a28Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            b bVar = new b(this.v, this.w, r02Var);
            bVar.u = obj;
            return bVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(s18 s18Var, r02<? super g2b> r02Var) throws Throwable {
            ((b) create(s18Var, r02Var)).invokeSuspend(g2b.a);
            return v72.t;
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                s18 s18Var = (s18) this.u;
                this.t = 1;
                Object objA = s18Var.a();
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
            fl.a();
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j61(l61 l61Var, t18 t18Var, a28 a28Var, r02<? super j61> r02Var) {
        super(2, r02Var);
        this.u = l61Var;
        this.v = t18Var;
        this.w = a28Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new j61(this.u, this.v, this.w, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(g2b g2bVar, r02<?> r02Var) throws Throwable {
        ((j61) create(g2bVar, r02Var)).invokeSuspend(g2b.a);
        return v72.t;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            oz8 oz8VarK = bl7.k(new a(0));
            b bVar = new b(this.v, this.w, null);
            this.t = 1;
            Object objF = yk2.f(oz8VarK, bVar, this);
            v72 v72Var = v72.t;
            if (objF == v72Var) {
                return v72Var;
            }
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        aa0.c("Interceptors flow should never terminate.");
        return null;
    }
}
