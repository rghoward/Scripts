package defpackage;

import com.google.android.material.appbar.MaterialToolbar;
import com.hwpo_training_app.core.widget.performance_view.PerformanceView;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class z61 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ z61(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                d71 d71Var = (d71) obj;
                t61 t61Var = (t61) obj2;
                t61.a aVar = t61.Companion;
                if (d71Var != null) {
                    PerformanceView performanceView = t61Var.p().c;
                    gs5 gs5Var = performanceView.y;
                    gs5Var.h.setVisibility(d71Var.d ? 0 : 8);
                    gs5Var.f.setVisibility(d71Var.e ? 0 : 8);
                    gs5Var.e.setVisibility(d71Var.f ? 0 : 8);
                    gs5Var.c.setVisibility(d71Var.g ? 0 : 8);
                    gs5Var.b.setVisibility(d71Var.h ? 0 : 8);
                    gs5Var.e.setText(d71Var.j);
                    performanceView.e(d71Var.k);
                    if (d71Var.i) {
                        performanceView.f(d71Var.l);
                    }
                    performanceView.d(d71Var.n);
                    performanceView.c(d71Var.o);
                }
                break;
            default:
                ((MaterialToolbar) obj2).setSubtitle((CharSequence) obj);
                break;
        }
        return g2b.a;
    }
}
