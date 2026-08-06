package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.forgotpassword.presentation.ForgotPasswordBottomSheetDialog$initListeners$1$2", f = "ForgotPasswordBottomSheetDialog.kt", l = {}, m = "invokeSuspend", v = 2)
public final class jc4 extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
    public final /* synthetic */ ic4 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc4(ic4 ic4Var, r02<? super jc4> r02Var) {
        super(3, r02Var);
        this.t = ic4Var;
    }

    @Override // defpackage.ei4
    public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
        return new jc4(this.t, r02Var).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        ic4.a aVar = ic4.Companion;
        cd4 cd4VarW = this.t.w();
        cd4VarW.e(ec4.d.a);
        oy0.d(rhb.b(cd4VarW), null, null, new wc4(cd4VarW, null), 3);
        return g2b.a;
    }
}
