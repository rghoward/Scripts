package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.country.presentation.PickCountryDialogFragment$initListeners$1$1", f = "PickCountryDialogFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class fy7 extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
    public final /* synthetic */ ey7 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fy7(ey7 ey7Var, r02<? super fy7> r02Var) {
        super(3, r02Var);
        this.t = ey7Var;
    }

    @Override // defpackage.ei4
    public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
        return new fy7(this.t, r02Var).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        dv8.b(obj);
        ey7.a aVar = ey7.Companion;
        ny7 ny7VarW = this.t.w();
        m82 m82Var = ny7VarW.b().c;
        if (m82Var != null && (str = m82Var.a) != null) {
            ny7VarW.f(new iy7(str));
        }
        return g2b.a;
    }
}
