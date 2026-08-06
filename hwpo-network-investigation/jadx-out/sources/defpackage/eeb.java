package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class eeb extends RecyclerView.n {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ eeb(int i, int i2, int i3, int i4, int i5) {
        i = (i4 & 1) != 0 ? 0 : i;
        i2 = (i4 & 2) != 0 ? 0 : i2;
        i3 = (i4 & 4) != 0 ? 0 : i3;
        this(i, i2, i3, i3);
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
        int i = this.a;
        int i2 = this.d;
        int i3 = this.b;
        if (iM == 0) {
            rect.set(i, this.c, i3, i2);
        } else if (iM == adapter.f() - 1) {
            rect.set(i, 0, i3, i2);
        } else {
            rect.set(i, 0, i3, i2);
        }
    }

    public eeb(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public eeb() {
        this(0, 0, 0, 15, 0);
    }
}
