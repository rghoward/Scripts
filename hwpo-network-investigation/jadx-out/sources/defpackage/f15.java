package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class f15 extends RecyclerView.n {
    public final int a;
    public final int b;

    public f15(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void f(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        RecyclerView.f adapter;
        rect.getClass();
        view.getClass();
        a0Var.getClass();
        super.f(rect, view, recyclerView, a0Var);
        int iM = RecyclerView.M(view);
        if (iM == -1 || (adapter = recyclerView.getAdapter()) == null) {
            return;
        }
        int i = this.b;
        if (iM == 0) {
            rect.set(this.a, 0, i / 2, 0);
        } else if (iM == adapter.f() - 1) {
            rect.set(i / 2, 0, i, 0);
        } else {
            int i2 = i / 2;
            rect.set(i2, 0, i2, 0);
        }
    }
}
