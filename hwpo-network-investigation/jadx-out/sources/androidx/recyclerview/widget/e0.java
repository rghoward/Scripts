package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {
    public static int a(RecyclerView.a0 a0Var, x xVar, View view, View view2, RecyclerView.o oVar, boolean z) {
        if (oVar.w() == 0 || a0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(RecyclerView.o.M(view) - RecyclerView.o.M(view2)) + 1;
        }
        return Math.min(xVar.l(), xVar.b(view2) - xVar.e(view));
    }

    public static int b(RecyclerView.a0 a0Var, x xVar, View view, View view2, RecyclerView.o oVar, boolean z, boolean z2) {
        if (oVar.w() == 0 || a0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (a0Var.b() - Math.max(RecyclerView.o.M(view), RecyclerView.o.M(view2))) - 1) : Math.max(0, Math.min(RecyclerView.o.M(view), RecyclerView.o.M(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(xVar.b(view2) - xVar.e(view)) / (Math.abs(RecyclerView.o.M(view) - RecyclerView.o.M(view2)) + 1))) + (xVar.k() - xVar.e(view)));
        }
        return iMax;
    }

    public static int c(RecyclerView.a0 a0Var, x xVar, View view, View view2, RecyclerView.o oVar, boolean z) {
        if (oVar.w() == 0 || a0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return a0Var.b();
        }
        return (int) (((xVar.b(view2) - xVar.e(view)) / (Math.abs(RecyclerView.o.M(view) - RecyclerView.o.M(view2)) + 1)) * a0Var.b());
    }
}
