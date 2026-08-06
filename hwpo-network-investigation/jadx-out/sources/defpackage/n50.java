package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.m;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class n50<T> extends RecyclerView.f {
    public final za<List<T>> d;
    public final e<T> e;

    public n50(m.e<T> eVar, xa<List<T>>... xaVarArr) {
        this.e = new e<>(this, eVar);
        za<List<T>> zaVar = new za<>();
        zaVar.a = new fx9<>();
        for (xa<List<T>> xaVar : xaVarArr) {
            zaVar.b(xaVar);
        }
        this.d = zaVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int f() {
        return this.e.f.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int h(int i) {
        List<T> list = this.e.f;
        fx9<xa<List<T>>> fx9Var = this.d.a;
        if (list == null) {
            ac4.c("Items datasource is null!");
            return 0;
        }
        int iF = fx9Var.f();
        for (int i2 = 0; i2 < iF; i2++) {
            if (fx9Var.g(i2).a(i, list)) {
                return fx9Var.d(i2);
            }
        }
        throw new NullPointerException("No AdapterDelegate added that matches item=" + list.get(i).toString() + " at position=" + i + " in data source");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void j(RecyclerView.e0 e0Var, int i) {
        this.d.d(this.e.f, i, e0Var, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void k(RecyclerView.e0 e0Var, int i, List list) {
        this.d.d(this.e.f, i, e0Var, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.e0 l(ViewGroup viewGroup, int i) {
        xa<List<T>> xaVarC = this.d.c(i);
        if (xaVarC != null) {
            return xaVarC.c(viewGroup);
        }
        ac4.c(pp2.a(i, "No AdapterDelegate added for ViewType "));
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final boolean n(RecyclerView.e0 e0Var) {
        za<List<T>> zaVar = this.d;
        zaVar.getClass();
        xa<List<T>> xaVarC = zaVar.c(e0Var.f);
        if (xaVarC != null) {
            xaVarC.d(e0Var);
            return false;
        }
        StringBuilder sb = new StringBuilder("No delegate found for ");
        sb.append(e0Var);
        m50.a(sb, e0Var.c(), e0Var.f);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void o(RecyclerView.e0 e0Var) {
        za<List<T>> zaVar = this.d;
        zaVar.getClass();
        xa<List<T>> xaVarC = zaVar.c(e0Var.f);
        if (xaVarC != null) {
            xaVarC.e(e0Var);
            return;
        }
        StringBuilder sb = new StringBuilder("No delegate found for ");
        sb.append(e0Var);
        m50.a(sb, e0Var.c(), e0Var.f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void p(RecyclerView.e0 e0Var) {
        za<List<T>> zaVar = this.d;
        zaVar.getClass();
        xa<List<T>> xaVarC = zaVar.c(e0Var.f);
        if (xaVarC != null) {
            xaVarC.f(e0Var);
            return;
        }
        StringBuilder sb = new StringBuilder("No delegate found for ");
        sb.append(e0Var);
        m50.a(sb, e0Var.c(), e0Var.f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void q(RecyclerView.e0 e0Var) {
        za<List<T>> zaVar = this.d;
        zaVar.getClass();
        xa<List<T>> xaVarC = zaVar.c(e0Var.f);
        if (xaVarC != null) {
            xaVarC.g(e0Var);
            return;
        }
        StringBuilder sb = new StringBuilder("No delegate found for ");
        sb.append(e0Var);
        m50.a(sb, e0Var.c(), e0Var.f);
    }

    public final void u(List<T> list) {
        this.e.b(list);
    }

    public n50(m.e<T> eVar) {
        za<List<T>> zaVar = new za<>();
        zaVar.a = new fx9<>();
        this.e = new e<>(this, eVar);
        this.d = zaVar;
    }
}
