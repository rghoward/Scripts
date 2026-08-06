package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.hwpo_library.presentation.MediaLibraryDialog$initListeners$1$2", f = "MediaLibraryDialog.kt", l = {}, m = "invokeSuspend", v = 2)
public final class xo6 extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
    public final /* synthetic */ vo6 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xo6(vo6 vo6Var, r02<? super xo6> r02Var) {
        super(3, r02Var);
        this.t = vo6Var;
    }

    @Override // defpackage.ei4
    public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
        return new xo6(this.t, r02Var).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        vo6.a aVar = vo6.Companion;
        ip6 ip6VarW = this.t.w();
        ip6VarW.f(new bp6.d(ip6VarW.b().h));
        return g2b.a;
    }
}
