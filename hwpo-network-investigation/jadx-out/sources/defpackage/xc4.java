package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.onboarding.presentation.forgot_password.ForgotPasswordViewModel$onRestorePasswordClick$1", f = "ForgotPasswordViewModel.kt", l = {42}, m = "invokeSuspend", v = 2)
public final class xc4 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ bd4 u;
    public final /* synthetic */ String v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc4(bd4 bd4Var, String str, r02<? super xc4> r02Var) {
        super(2, r02Var);
        this.u = bd4Var;
        this.v = str;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new xc4(this.u, this.v, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((xc4) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        bd4 bd4Var = this.u;
        if (i == 0) {
            dv8.b(obj);
            int i2 = bd4.C;
            bd4Var.e(bd4.a.b.a);
            vu8 vu8Var = bd4Var.z;
            vu8.a aVar = new vu8.a(this.v);
            this.t = 1;
            vu8Var.getClass();
            obj = g5b.b(vu8Var, aVar, this);
            v72 v72Var = v72.t;
            if (obj == v72Var) {
                return v72Var;
            }
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        xd3 xd3Var = (xd3) obj;
        xd3Var.getClass();
        boolean z = xd3Var instanceof xd3.a;
        bd4.a.C0031a c0031a = bd4.a.C0031a.a;
        if (z) {
            Exception exc = (Exception) ((xd3.a) xd3Var).a;
            int i3 = bd4.C;
            bd4Var.e(c0031a);
            bd4Var.f(new uc4(bd4Var.y.a(exc)));
            g2b g2bVar = g2b.a;
        } else {
            if (!(xd3Var instanceof xd3.b)) {
                u.b();
                return null;
            }
            String str = (String) ((xd3.b) xd3Var).a;
            int i4 = bd4.C;
            bd4Var.e(c0031a);
            bd4Var.f(new vc4(str));
            bd4Var.x.d();
            g2b g2bVar2 = g2b.a;
        }
        return g2b.a;
    }
}
