package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.forgotpassword.presentation.ForgotPasswordViewModel$onRestorePasswordClick$1", f = "ForgotPasswordViewModel.kt", l = {42}, m = "invokeSuspend", v = 2)
public final class wc4 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ cd4 u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class a extends pi4 implements oh4<String, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(String str) {
            String str2 = str;
            str2.getClass();
            cd4 cd4Var = (cd4) this.receiver;
            int i = cd4.B;
            cd4Var.getClass();
            cd4Var.f(new mc4.a(str2));
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class b extends pi4 implements oh4<Exception, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(Exception exc) {
            Exception exc2 = exc;
            exc2.getClass();
            cd4 cd4Var = (cd4) this.receiver;
            int i = cd4.B;
            cd4Var.getClass();
            rma.a.b(exc2);
            cd4Var.f(new mc4.b(cd4Var.x.a(exc2)));
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wc4(cd4 cd4Var, r02<? super wc4> r02Var) {
        super(2, r02Var);
        this.u = cd4Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new wc4(this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((wc4) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        cd4 cd4Var = this.u;
        if (i == 0) {
            dv8.b(obj);
            vu8 vu8Var = cd4Var.y;
            vu8.a aVar = new vu8.a(cd4Var.b().a);
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
        int i2 = cd4.B;
        cd4Var.e(ec4.c.a);
        g2b g2bVar = g2b.a;
        xd3Var.a(new a(1, cd4Var, cd4.class, "onRestorePasswordSuccess", "onRestorePasswordSuccess(Ljava/lang/String;)V", 0), new b(1, cd4Var, cd4.class, "onError", "onError(Ljava/lang/Exception;)V", 0));
        return g2b.a;
    }
}
