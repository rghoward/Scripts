package defpackage;

import android.view.View;
import com.hwpo_training_app.benchmarks.presentation.widget.BenchmarksExpandableLayout;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.benchmarks.presentation.widget.BenchmarksExpandableLayout$initListeners$1$2", f = "BenchmarksExpandableLayout.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ko0 extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
    public final /* synthetic */ BenchmarksExpandableLayout t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ko0(BenchmarksExpandableLayout benchmarksExpandableLayout, r02<? super ko0> r02Var) {
        super(3, r02Var);
        this.t = benchmarksExpandableLayout;
    }

    @Override // defpackage.ei4
    public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
        return new ko0(this.t, r02Var).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        mh4<g2b> onEditBenchmarksClick = this.t.getOnEditBenchmarksClick();
        if (onEditBenchmarksClick != null) {
            onEditBenchmarksClick.invoke();
        }
        return g2b.a;
    }
}
