package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.settings.presentation.AccountSettingsBottomSheetDialog$initListeners$1$1", f = "AccountSettingsBottomSheetDialog.kt", l = {}, m = "invokeSuspend", v = 2)
public final class r6 extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
    public final /* synthetic */ q6 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(q6 q6Var, r02<? super r6> r02Var) {
        super(3, r02Var);
        this.t = q6Var;
    }

    @Override // defpackage.ei4
    public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
        return new r6(this.t, r02Var).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        q6.a aVar = q6.Companion;
        r7 r7VarW = this.t.w();
        oy0.d(rhb.b(r7VarW), null, null, new q7(r7VarW, null), 3);
        return g2b.a;
    }
}
