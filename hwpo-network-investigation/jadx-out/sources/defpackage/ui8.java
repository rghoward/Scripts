package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "coil.RealImageLoader$execute$2", f = "RealImageLoader.kt", l = {138}, m = "invokeSuspend")
public final class ui8 extends p6a implements ci4<t72, r02<? super l85>, Object> {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ k85 v;
    public final /* synthetic */ ti8 w;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "coil.RealImageLoader$execute$2$job$1", f = "RealImageLoader.kt", l = {133}, m = "invokeSuspend")
    public static final class a extends p6a implements ci4<t72, r02<? super l85>, Object> {
        public int t;
        public final /* synthetic */ ti8 u;
        public final /* synthetic */ k85 v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(r02 r02Var, k85 k85Var, ti8 ti8Var) {
            super(2, r02Var);
            this.u = ti8Var;
            this.v = k85Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new a(r02Var, this.v, this.u);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super l85> r02Var) {
            return ((a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i != 0) {
                if (i == 1) {
                    dv8.b(obj);
                    return obj;
                }
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
            this.t = 1;
            Object objD = ti8.d(this.u, this.v, 1, this);
            v72 v72Var = v72.t;
            return objD == v72Var ? v72Var : objD;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ui8(r02 r02Var, k85 k85Var, ti8 ti8Var) {
        super(2, r02Var);
        this.v = k85Var;
        this.w = ti8Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        ui8 ui8Var = new ui8(r02Var, this.v, this.w);
        ui8Var.u = obj;
        return ui8Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super l85> r02Var) {
        return ((ui8) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i != 0) {
            if (i == 1) {
                dv8.b(obj);
                return obj;
            }
            aa0.c("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        dv8.b(obj);
        t72 t72Var = (t72) this.u;
        et2 et2Var = i23.a;
        gt4 gt4VarX0 = ag6.a.x0();
        ti8 ti8Var = this.w;
        k85 k85Var = this.v;
        vv2 vv2VarB = oy0.b(t72Var, gt4VarX0, new a(null, k85Var, ti8Var), 2);
        v.c(((pib) k85Var.c).a()).a(vv2VarB);
        this.t = 1;
        Object objW = vv2VarB.w(this);
        v72 v72Var = v72.t;
        return objW == v72Var ? v72Var : objW;
    }
}
