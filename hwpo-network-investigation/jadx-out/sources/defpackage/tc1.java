package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.sessions.presentation.sessions_list.ChoosePlanOptionsBottomSheetDialog$createOptionsViews$1$1$1", f = "ChoosePlanOptionsBottomSheetDialog.kt", l = {}, m = "invokeSuspend", v = 2)
public final class tc1 extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
    public final /* synthetic */ sc1 t;
    public final /* synthetic */ h08 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tc1(sc1 sc1Var, h08 h08Var, r02<? super tc1> r02Var) {
        super(3, r02Var);
        this.t = sc1Var;
        this.u = h08Var;
    }

    @Override // defpackage.ei4
    public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
        return new tc1(this.t, this.u, r02Var).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        sc1 sc1Var = this.t;
        sc1Var.K.invoke(this.u);
        sc1Var.i();
        return g2b.a;
    }
}
