package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tm6 extends RecyclerView.n {
    public static final a Companion = new a();
    public final int a;
    public final int b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    public tm6(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void f(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        rect.getClass();
        view.getClass();
        a0Var.getClass();
        int iA = wk6.a(((double) this.a) / 2.0d);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.getClass();
        int iB = ((RecyclerView.p) layoutParams).a.b() + 1;
        rect.top = 0;
        rect.bottom = this.b;
        int i = (iB * 10) % 3;
        if (i == 0) {
            rect.left = iA;
            rect.right = 0;
        } else if (i == 1) {
            rect.left = 0;
            rect.right = iA;
        } else {
            if (i != 2) {
                return;
            }
            int i2 = iA / 2;
            rect.left = i2;
            rect.right = i2;
        }
    }
}
