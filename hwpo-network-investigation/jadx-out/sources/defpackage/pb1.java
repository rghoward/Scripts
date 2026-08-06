package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.core.domain.usecase.user.CheckDeviceTokenUseCase$executeOnBackground$2", f = "CheckDeviceTokenUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class pb1 extends p6a implements ci4<t72, r02<? super el5>, Object> {
    public /* synthetic */ Object t;
    public final /* synthetic */ rb1 u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.core.domain.usecase.user.CheckDeviceTokenUseCase$executeOnBackground$2$1", f = "CheckDeviceTokenUseCase.kt", l = {25}, m = "invokeSuspend", v = 2)
    public static final class a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;
        public final /* synthetic */ rb1 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(rb1 rb1Var, r02<? super a> r02Var) {
            super(2, r02Var);
            this.u = rb1Var;
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
                this.t = 1;
                rb1 rb1Var = this.u;
                Object objCollect = rb1Var.a.a().collect(new k74.a(jc7.t, new qb1(rb1Var, null)), this);
                Object obj2 = v72.t;
                if (objCollect != obj2) {
                    objCollect = g2b.a;
                }
                if (objCollect != obj2) {
                    objCollect = g2b.a;
                }
                if (objCollect != obj2) {
                    objCollect = g2b.a;
                }
                if (objCollect == obj2) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pb1(rb1 rb1Var, r02<? super pb1> r02Var) {
        super(2, r02Var);
        this.u = rb1Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        pb1 pb1Var = new pb1(this.u, r02Var);
        pb1Var.t = obj;
        return pb1Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super el5> r02Var) {
        return ((pb1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        t72 t72Var = (t72) this.t;
        dv8.b(obj);
        return oy0.d(t72Var, null, null, new a(this.u, null), 3);
    }
}
