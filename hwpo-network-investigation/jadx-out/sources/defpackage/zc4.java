package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.onboarding.presentation.forgot_password.ForgotPasswordViewModel$setFieldsValidation$1", f = "ForgotPasswordViewModel.kt", l = {57}, m = "invokeSuspend", v = 2)
public final class zc4 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ bd4 u;
    public final /* synthetic */ r54<String> v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<T> implements s54 {
        public final /* synthetic */ bd4 t;

        public a(bd4 bd4Var) {
            this.t = bd4Var;
        }

        @Override // defpackage.s54
        public final Object emit(Object obj, r02 r02Var) {
            bd4.a.c cVar = new bd4.a.c(((Boolean) obj).booleanValue());
            int i = bd4.C;
            this.t.e(cVar);
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zc4(bd4 bd4Var, r54<String> r54Var, r02<? super zc4> r02Var) {
        super(2, r02Var);
        this.u = bd4Var;
        this.v = r54Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new zc4(this.u, this.v, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((zc4) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            int i2 = bd4.C;
            a aVar = new a(this.u);
            this.t = 1;
            Object objCollect = this.v.collect(new w7b.a(new v7b.a(new t7b.a(new s7b.a(aVar)))), this);
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
