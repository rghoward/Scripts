package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import com.hwpo_training_app.sessions.presentation.widget.PerformanceExpandableLayout;
import net.cachapa.expandablelayout.ExpandableLayout;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class of implements pf4, ExpandableLayout.b {
    public final /* synthetic */ bk4 t;

    public /* synthetic */ of(bk4 bk4Var) {
        this.t = bk4Var;
    }

    @Override // net.cachapa.expandablelayout.ExpandableLayout.b
    public void a(int i) {
        PerformanceExpandableLayout performanceExpandableLayout = (PerformanceExpandableLayout) this.t;
        int i2 = PerformanceExpandableLayout.P;
        if (i == 0) {
            performanceExpandableLayout.f(false);
            return;
        }
        if (i == 2) {
            performanceExpandableLayout.f(true);
            return;
        }
        if (i != 3) {
            return;
        }
        Rect rect = new Rect();
        performanceExpandableLayout.O.a.getGlobalVisibleRect(rect);
        oh4<? super Integer, g2b> oh4Var = performanceExpandableLayout.M;
        if (oh4Var != null) {
            oh4Var.invoke(Integer.valueOf(rect.bottom));
        }
    }

    @Override // defpackage.pf4
    public void d(Bundle bundle, String str) {
        qf.p((qf) this.t, str, bundle);
    }
}
