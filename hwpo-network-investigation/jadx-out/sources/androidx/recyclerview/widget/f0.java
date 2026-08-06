package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f0 extends RecyclerView.l {
    public final boolean g = true;

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean a(RecyclerView.e0 e0Var, RecyclerView.l.b bVar, RecyclerView.l.b bVar2) {
        int i;
        int i2;
        return (bVar == null || ((i = bVar.a) == (i2 = bVar2.a) && bVar.b == bVar2.b)) ? m(e0Var) : o(e0Var, i, bVar.b, i2, bVar2.b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean b(RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2, RecyclerView.l.b bVar, RecyclerView.l.b bVar2) {
        int i;
        int i2 = bVar.a;
        int i3 = bVar.b;
        if (e0Var2.q()) {
            i = bVar.a;
        } else {
            i = bVar2.a;
            bVar = bVar2;
        }
        return n(e0Var, e0Var2, i2, i3, i, bVar.b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean c(RecyclerView.e0 e0Var, RecyclerView.l.b bVar, RecyclerView.l.b bVar2) {
        int i = bVar.a;
        int i2 = bVar.b;
        View view = e0Var.a;
        int left = bVar2 == null ? view.getLeft() : bVar2.a;
        int top = bVar2 == null ? view.getTop() : bVar2.b;
        if (e0Var.j() || (i == left && i2 == top)) {
            return p(e0Var);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return o(e0Var, i, i2, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean d(RecyclerView.e0 e0Var, RecyclerView.l.b bVar, RecyclerView.l.b bVar2) {
        int i = bVar.a;
        int i2 = bVar2.a;
        if (i != i2 || bVar.b != bVar2.b) {
            return o(e0Var, i, bVar.b, i2, bVar2.b);
        }
        h(e0Var);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean f(RecyclerView.e0 e0Var) {
        return !this.g || e0Var.h();
    }

    public abstract boolean m(RecyclerView.e0 e0Var);

    public abstract boolean n(RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2, int i, int i2, int i3, int i4);

    public abstract boolean o(RecyclerView.e0 e0Var, int i, int i2, int i3, int i4);

    public abstract boolean p(RecyclerView.e0 e0Var);
}
