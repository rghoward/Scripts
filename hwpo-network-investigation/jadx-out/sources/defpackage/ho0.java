package defpackage;

import android.view.View;
import com.hwpo_training_app.benchmarks.presentation.widget.BenchmarksExpandableLayout;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.benchmarks.presentation.widget.BenchmarksExpandableLayout$generateBenchmarkLayout$1$1", f = "BenchmarksExpandableLayout.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ho0 extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
    public final /* synthetic */ BenchmarksExpandableLayout t;
    public final /* synthetic */ vn0 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ho0(BenchmarksExpandableLayout benchmarksExpandableLayout, vn0 vn0Var, r02<? super ho0> r02Var) {
        super(3, r02Var);
        this.t = benchmarksExpandableLayout;
        this.u = vn0Var;
    }

    @Override // defpackage.ei4
    public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
        return new ho0(this.t, this.u, r02Var).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        oh4<vn0, g2b> onOpenPersonalRecordsClick = this.t.getOnOpenPersonalRecordsClick();
        if (onOpenPersonalRecordsClick != null) {
            onOpenPersonalRecordsClick.invoke(this.u);
        }
        return g2b.a;
    }
}
