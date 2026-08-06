package defpackage;

import android.view.View;
import androidx.fragment.app.l;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.edit_performance.presentation.EditPerformanceFragment$initView$8", f = "EditPerformanceFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class sb3 extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
    public final /* synthetic */ rb3 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb3(rb3 rb3Var, r02<? super sb3> r02Var) {
        super(3, r02Var);
        this.t = rb3Var;
    }

    @Override // defpackage.ei4
    public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
        return new sb3(this.t, r02Var).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        rb3 rb3Var = this.t;
        x39 x39Var = (x39) rb3Var.G.getValue();
        l childFragmentManager = rb3Var.getChildFragmentManager();
        childFragmentManager.getClass();
        x39Var.getClass();
        x39Var.o(childFragmentManager, x39.class.getName());
        return g2b.a;
    }
}
