package defpackage;

import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.client.onboarding_settings.benchmark_input.presentation.RequiredBenchmarkInputViewModel$loadBenchmark$1", f = "RequiredBenchmarkInputViewModel.kt", l = {139}, m = "invokeSuspend", v = 2)
public final class kr8 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ jr8 u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class a extends pi4 implements oh4<ao0, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(ao0 ao0Var) {
            ao0 ao0Var2 = ao0Var;
            jr8 jr8Var = (jr8) this.receiver;
            if (ao0Var2 == null) {
                jr8Var.f(new ir8.c(jr8Var.z.b(R.string.error_cant_load_benchmark_details, new Object[0])));
                jr8Var.f(ir8.a.b);
            } else {
                jr8.a aVar = jr8.Companion;
                jr8Var.getClass();
                jr8Var.e(new br8.b(ao0Var2.b, uo0.c(ao0Var2)));
            }
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kr8(jr8 jr8Var, r02<? super kr8> r02Var) {
        super(2, r02Var);
        this.u = jr8Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new kr8(this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((kr8) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        jr8 jr8Var = this.u;
        if (i == 0) {
            dv8.b(obj);
            cl4 cl4Var = jr8Var.x;
            Integer num = new Integer(jr8Var.B);
            this.t = 1;
            cl4Var.getClass();
            obj = g5b.b(cl4Var, num, this);
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
        yd3.h((xd3) obj, new a(1, jr8Var, jr8.class, "onBenchmarkLoaded", "onBenchmarkLoaded(Lcom/hwpo_training_app/core/domain/model/program/BenchmarkModel;)V", 0));
        return g2b.a;
    }
}
