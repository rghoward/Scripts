package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1", f = "AnimatedVisibility.kt", l = {746}, m = "invokeSuspend", v = 1)
public final class cv extends p6a implements ci4<ra8<Boolean>, r02<? super g2b>, Object> {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ tva<wg3> v;
    public final /* synthetic */ h37 w;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends wp5 implements mh4<Boolean> {
        public final /* synthetic */ tva<wg3> u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(tva<wg3> tvaVar) {
            super(0);
            this.u = tvaVar;
        }

        @Override // defpackage.mh4
        public final Boolean invoke() {
            tva<wg3> tvaVar = this.u;
            Object objB = tvaVar.a.b();
            wg3 wg3Var = wg3.v;
            return Boolean.valueOf(objB == wg3Var && tvaVar.d.getValue() == wg3Var);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b<T> implements s54 {
        public final /* synthetic */ ra8<Boolean> t;
        public final /* synthetic */ tva<wg3> u;
        public final /* synthetic */ h37 v;

        public b(ra8 ra8Var, tva tvaVar, h37 h37Var) {
            this.t = ra8Var;
            this.u = tvaVar;
            this.v = h37Var;
        }

        @Override // defpackage.s54
        public final Object emit(Object obj, r02 r02Var) {
            boolean zBooleanValue;
            if (((Boolean) obj).booleanValue()) {
                ci4 ci4Var = (ci4) this.v.getValue();
                tva<wg3> tvaVar = this.u;
                zBooleanValue = ((Boolean) ci4Var.invoke(tvaVar.a.b(), tvaVar.d.getValue())).booleanValue();
            } else {
                zBooleanValue = false;
            }
            this.t.setValue(Boolean.valueOf(zBooleanValue));
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv(tva tvaVar, h37 h37Var, r02 r02Var) {
        super(2, r02Var);
        this.v = tvaVar;
        this.w = h37Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        cv cvVar = new cv(this.v, this.w, r02Var);
        cvVar.u = obj;
        return cvVar;
    }

    @Override // defpackage.ci4
    public final Object invoke(ra8<Boolean> ra8Var, r02<? super g2b> r02Var) {
        return ((cv) create(ra8Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            ra8 ra8Var = (ra8) this.u;
            tva<wg3> tvaVar = this.v;
            oz8 oz8VarK = bl7.k(new a(tvaVar));
            b bVar = new b(ra8Var, tvaVar, this.w);
            this.t = 1;
            Object objCollect = oz8VarK.collect(bVar, this);
            v72 v72Var = v72.t;
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
