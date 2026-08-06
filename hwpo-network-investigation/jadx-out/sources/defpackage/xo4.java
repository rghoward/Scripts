package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xo4 extends RecyclerView.n {
    public final int a;
    public final int b;

    public xo4(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void f(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        rect.getClass();
        view.getClass();
        a0Var.getClass();
        float width = recyclerView.getWidth();
        int i = this.a;
        int i2 = this.b;
        int width2 = (recyclerView.getWidth() / i2) - ((int) ((width - (i * (i2 - 1))) / i2));
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.getClass();
        int iC = ((RecyclerView.p) layoutParams).a.c();
        rect.top = iC < i2 ? 0 : i;
        if (iC % i2 == 0) {
            rect.left = 0;
            rect.right = width2;
        } else if ((iC + 1) % i2 == 0) {
            rect.right = 0;
            rect.left = width2;
        } else if ((iC + 2) % i2 == 0) {
            rect.left = i / 2;
            rect.right = i - width2;
        } else {
            int i3 = i / 2;
            rect.left = i3;
            rect.right = i3;
        }
        rect.bottom = 0;
    }
}
