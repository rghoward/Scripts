package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class gbb extends RecyclerView.n {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public gbb(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
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
        int i = iM == 0 ? this.c : this.b;
        int i2 = iM == adapter.f() + (-1) ? this.d : 0;
        int i3 = this.a;
        rect.set(i3, i, i3, i2);
    }
}
