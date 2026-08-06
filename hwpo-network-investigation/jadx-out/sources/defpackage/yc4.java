package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.forgotpassword.presentation.ForgotPasswordViewModel$setEmailValidation$1", f = "ForgotPasswordViewModel.kt", l = {51}, m = "invokeSuspend", v = 2)
public final class yc4 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ cd4 u;
    public final /* synthetic */ r54<String> v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<T> implements s54 {
        public final /* synthetic */ cd4 t;

        public a(cd4 cd4Var) {
            this.t = cd4Var;
        }

        @Override // defpackage.s54
        public final Object emit(Object obj, r02 r02Var) {
            ec4.b bVar = new ec4.b(((Boolean) obj).booleanValue());
            int i = cd4.B;
            this.t.e(bVar);
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc4(cd4 cd4Var, r54<String> r54Var, r02<? super yc4> r02Var) {
        super(2, r02Var);
        this.u = cd4Var;
        this.v = r54Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new yc4(this.u, this.v, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((yc4) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            int i2 = cd4.B;
            cd4 cd4Var = this.u;
            ad4 ad4Var = new ad4(cd4Var, null);
            a aVar = new a(cd4Var);
            this.t = 1;
            Object objCollect = this.v.collect(new k74.a(new w7b.a(new v7b.a(new t7b.a(new s7b.a(aVar)))), ad4Var), this);
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
