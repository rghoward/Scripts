package defpackage;

import com.hwpo_training_app.R;
import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.main_tabs.presentation.tabs.MainTabsViewModel$checkToken$1", f = "MainTabsViewModel.kt", l = {132}, m = "invokeSuspend", v = 2)
public final class xg6 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ qg6 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xg6(qg6 qg6Var, r02<? super xg6> r02Var) {
        super(2, r02Var);
        this.u = qg6Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new xg6(this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((xg6) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        qg6 qg6Var = this.u;
        if (i == 0) {
            dv8.b(obj);
            rb1 rb1Var = qg6Var.y;
            g2b g2bVar = g2b.a;
            this.t = 1;
            rb1Var.getClass();
            obj = g5b.b(rb1Var, g2bVar, this);
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
        if (xd3Var instanceof xd3.a) {
            Exception exc = (Exception) ((xd3.a) xd3Var).a;
            rma.a.b(exc);
            bu8 bu8Var = qg6Var.F;
            String message = exc.getMessage();
            if (message == null) {
                message = BuildConfig.FLAVOR;
            }
            qg6Var.f(new eg6(bu8Var.b(R.string.fcm_token_error, message)));
            g2b g2bVar2 = g2b.a;
        } else {
            if (!(xd3Var instanceof xd3.b)) {
                u.b();
                return null;
            }
            g2b g2bVar3 = g2b.a;
        }
        return g2b.a;
    }
}
