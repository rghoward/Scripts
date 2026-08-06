package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.account.presentation.dialog.ValueInputDialog$initListeners$1$2", f = "ValueInputDialog.kt", l = {}, m = "invokeSuspend", v = 2)
public final class uab extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
    public final /* synthetic */ sab t;
    public final /* synthetic */ j03 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uab(sab sabVar, j03 j03Var, r02<? super uab> r02Var) {
        super(3, r02Var);
        this.t = sabVar;
        this.u = j03Var;
    }

    @Override // defpackage.ei4
    public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
        return new uab(this.t, this.u, r02Var).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        sab.a aVar = sab.Companion;
        this.t.v(this.u);
        return g2b.a;
    }
}
