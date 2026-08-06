package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.client.onboarding_settings.benchmark_input.presentation.RequiredBenchmarkInputViewModel$onSaveClicked$1", f = "RequiredBenchmarkInputViewModel.kt", l = {122}, m = "invokeSuspend", v = 2)
public final class nr8 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ vn0 u;
    public final /* synthetic */ String v;
    public final /* synthetic */ jr8 w;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class a extends pi4 implements oh4<Exception, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(Exception exc) {
            Exception exc2 = exc;
            exc2.getClass();
            jr8 jr8Var = (jr8) this.receiver;
            jr8.a aVar = jr8.Companion;
            jr8Var.getClass();
            rma.a.b(exc2);
            jr8Var.f(new ir8.c(jr8Var.A.a(exc2)));
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nr8(vn0 vn0Var, String str, jr8 jr8Var, r02<? super nr8> r02Var) {
        super(2, r02Var);
        this.u = vn0Var;
        this.v = str;
        this.w = jr8Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new nr8(this.u, this.v, this.w, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((nr8) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        jr8 jr8Var = this.w;
        if (i == 0) {
            dv8.b(obj);
            vn0 vn0Var = this.u;
            xn0 xn0Var = vn0Var.z;
            xn0 xn0Var2 = xn0.u;
            String strValueOf = this.v;
            if (xn0Var == xn0Var2) {
                strValueOf = String.valueOf(wn0.d(strValueOf));
            }
            c09 c09Var = jr8Var.y;
            c09.a aVar = new c09.a(jr8Var.B, strValueOf, vn0Var.y);
            this.t = 1;
            c09Var.getClass();
            obj = g5b.b(c09Var, aVar, this);
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
        jr8.a aVar2 = jr8.Companion;
        jr8Var.e(br8.a.a);
        g2b g2bVar = g2b.a;
        a aVar3 = new a(1, jr8Var, jr8.class, "onError", "onError(Ljava/lang/Exception;)V", 0);
        if (xd3Var instanceof xd3.a) {
            aVar3.invoke(((xd3.a) xd3Var).a);
        } else {
            if (!(xd3Var instanceof xd3.b)) {
                u.b();
                return null;
            }
            jr8Var.f(ir8.b.b);
        }
        return g2b.a;
    }
}
