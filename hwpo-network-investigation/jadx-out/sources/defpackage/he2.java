package defpackage;

import com.hwpo_training_app.core.widget.performance_view.PerformanceView;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class he2 implements bw7, qv7, zj4 {
    public final fe2 a;

    public he2(fe2 fe2Var) {
        this.a = fe2Var;
    }

    @Override // defpackage.bw7
    public final void a(PerformanceView performanceView) {
        fe2 fe2Var = this.a;
        performanceView.v = fe2Var.l.get();
        performanceView.w = fe2Var.M.get();
    }
}
