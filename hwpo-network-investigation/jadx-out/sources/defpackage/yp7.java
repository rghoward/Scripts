package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f0;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class yp7 extends f0 {
    public static final a Companion = new a();
    public boolean h;
    public int i;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    public static void q(RecyclerView.e0 e0Var) {
        View view = e0Var.a;
        view.setAlpha(0.0f);
        view.setVisibility(0);
        view.animate().alpha(1.0f).setDuration(250L).start();
    }

    @Override // androidx.recyclerview.widget.f0, androidx.recyclerview.widget.RecyclerView.l
    public final boolean a(RecyclerView.e0 e0Var, RecyclerView.l.b bVar, RecyclerView.l.b bVar2) {
        e0Var.getClass();
        bVar2.getClass();
        q(e0Var);
        return false;
    }

    @Override // androidx.recyclerview.widget.f0, androidx.recyclerview.widget.RecyclerView.l
    public final boolean c(RecyclerView.e0 e0Var, RecyclerView.l.b bVar, RecyclerView.l.b bVar2) {
        e0Var.getClass();
        bVar.getClass();
        View view = e0Var.a;
        view.getClass();
        view.setVisibility(8);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean k() {
        return false;
    }

    @Override // androidx.recyclerview.widget.f0
    public final boolean m(RecyclerView.e0 e0Var) {
        e0Var.getClass();
        q(e0Var);
        return false;
    }

    @Override // androidx.recyclerview.widget.f0
    public final boolean n(RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2, int i, int i2, int i3, int i4) {
        if (!this.h) {
            View view = e0Var.a;
            view.getClass();
            view.setVisibility(8);
            q(e0Var2);
            return false;
        }
        int i5 = this.i + 1;
        this.i = i5;
        if (i5 == 3) {
            this.h = false;
            this.i = 0;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.f0
    public final boolean o(RecyclerView.e0 e0Var, int i, int i2, int i3, int i4) {
        e0Var.getClass();
        return false;
    }

    @Override // androidx.recyclerview.widget.f0
    public final boolean p(RecyclerView.e0 e0Var) {
        e0Var.getClass();
        View view = e0Var.a;
        view.getClass();
        view.setVisibility(8);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void j() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void l() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void i(RecyclerView.e0 e0Var) {
    }
}
