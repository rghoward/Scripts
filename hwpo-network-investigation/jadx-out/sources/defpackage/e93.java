package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.wfb;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class e93<I extends T, T, V extends wfb> extends d0<I, T, ya<I, V>> {
    public final ci4<LayoutInflater, ViewGroup, V> a;
    public final ei4<T, List<? extends T>, Integer, Boolean> b;
    public final oh4<ya<I, V>, g2b> c;
    public final oh4<ViewGroup, LayoutInflater> d;

    /* JADX WARN: Multi-variable type inference failed */
    public e93(ci4<? super LayoutInflater, ? super ViewGroup, ? extends V> ci4Var, ei4<? super T, ? super List<? extends T>, ? super Integer, Boolean> ei4Var, oh4<? super ya<I, V>, g2b> oh4Var, oh4<? super ViewGroup, ? extends LayoutInflater> oh4Var2) {
        oh4Var2.getClass();
        this.a = ci4Var;
        this.b = ei4Var;
        this.c = oh4Var;
        this.d = oh4Var2;
    }

    @Override // defpackage.xa
    public final ya c(ViewGroup viewGroup) {
        viewGroup.getClass();
        ya<I, V> yaVar = new ya<>(this.a.invoke(this.d.invoke(viewGroup), viewGroup));
        this.c.invoke(yaVar);
        return yaVar;
    }

    @Override // defpackage.xa
    public final void d(RecyclerView.e0 e0Var) {
    }

    @Override // defpackage.xa
    public final void e(RecyclerView.e0 e0Var) {
    }

    @Override // defpackage.xa
    public final void f(RecyclerView.e0 e0Var) {
    }

    @Override // defpackage.xa
    public final void g(RecyclerView.e0 e0Var) {
        e0Var.getClass();
    }
}
