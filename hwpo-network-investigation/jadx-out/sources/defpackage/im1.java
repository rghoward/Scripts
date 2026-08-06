package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.comments.presentation.CommentsFragment$renderInputViewState$1$2", f = "CommentsFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class im1 extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
    public final /* synthetic */ ld5 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public im1(ld5 ld5Var, r02<? super im1> r02Var) {
        super(3, r02Var);
        this.t = ld5Var;
    }

    @Override // defpackage.ei4
    public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
        return new im1(this.t, r02Var).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        this.t.d.invoke();
        return g2b.a;
    }
}
