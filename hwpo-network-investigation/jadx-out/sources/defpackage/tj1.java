package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.comments.presentation.dialog.CommentActionsDialogFragment$initListeners$1$3", f = "CommentActionsDialogFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class tj1 extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
    public final /* synthetic */ qj1 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tj1(qj1 qj1Var, r02<? super tj1> r02Var) {
        super(3, r02Var);
        this.t = qj1Var;
    }

    @Override // defpackage.ei4
    public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
        return new tj1(this.t, r02Var).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        this.t.i();
        return g2b.a;
    }
}
