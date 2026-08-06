package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tt6 extends RecyclerView.n {
    public final int a;

    public tt6(int i) {
        this.a = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void f(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        rect.getClass();
        view.getClass();
        a0Var.getClass();
        int iA = wk6.a(((double) this.a) / 2.0d);
        rect.top = iA;
        rect.left = 0;
        rect.right = 0;
        rect.bottom = iA;
    }
}
