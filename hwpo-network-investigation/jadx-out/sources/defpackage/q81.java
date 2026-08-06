package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.changepassword.presentation.ChangePasswordBottomSheetDialog$initListeners$1$6", f = "ChangePasswordBottomSheetDialog.kt", l = {}, m = "invokeSuspend", v = 2)
public final class q81 extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
    public final /* synthetic */ o81 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q81(o81 o81Var, r02<? super q81> r02Var) {
        super(3, r02Var);
        this.t = o81Var;
    }

    @Override // defpackage.ei4
    public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
        return new q81(this.t, r02Var).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        o81.a aVar = o81.Companion;
        m91 m91VarW = this.t.w();
        oy0.d(rhb.b(m91VarW), null, null, new j91(m91VarW, null), 3);
        return g2b.a;
    }
}
