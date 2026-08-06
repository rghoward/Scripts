package defpackage;

import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.tracking.presentation.enter_value.EnterValueViewModel$onValueEntered$1", f = "EnterValueViewModel.kt", l = {285}, m = "invokeSuspend", v = 2)
public final class mj3 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ fj3 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mj3(fj3 fj3Var, r02<? super mj3> r02Var) {
        super(2, r02Var);
        this.u = fj3Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new mj3(this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((mj3) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        fj3 fj3Var = this.u;
        if (i == 0) {
            dv8.b(obj);
            q68 q68Var = fj3Var.A;
            rsa.a aVar = new rsa.a(fj3Var.J);
            this.t = 1;
            q68Var.getClass();
            Object objB = g5b.b(q68Var, aVar, this);
            v72 v72Var = v72.t;
            if (objB == v72Var) {
                return v72Var;
            }
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        fj3.a aVar2 = fj3.Companion;
        fj3Var.e(vh3.e.a);
        if (fj3Var.M == null) {
            fj3Var.f(new wh3.c(fj3Var.G.b(R.string.entry_added, new Object[0])));
        }
        boolean z = fj3Var.L;
        pta ptaVar = fj3Var.x;
        if (z) {
            ptaVar.a();
        } else {
            ptaVar.m();
        }
        return g2b.a;
    }
}
