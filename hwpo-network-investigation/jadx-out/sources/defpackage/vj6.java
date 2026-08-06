package defpackage;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.y;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vj6 extends RecyclerView.t {
    public final /* synthetic */ fy6 a;
    public final /* synthetic */ rj6 b;

    public vj6(rj6 rj6Var, fy6 fy6Var) {
        this.b = rj6Var;
        this.a = fy6Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void a(RecyclerView recyclerView, int i) {
        rj6 rj6Var;
        y yVar;
        int iM;
        if (i != 0 || (yVar = (rj6Var = this.b).J) == null) {
            return;
        }
        View viewD = yVar.d((LinearLayoutManager) rj6Var.C.getLayoutManager());
        if (viewD != null && (iM = RecyclerView.M(viewD)) != -1) {
            fy6 fy6Var = this.a;
            rj6Var.y = fy6Var.u(iM);
            rj6Var.H.setText(fy6Var.u(iM).h());
            rj6Var.o(iM);
        }
        rj6Var.n();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void b(RecyclerView recyclerView, int i, int i2) {
        rj6 rj6Var = this.b;
        RecyclerView recyclerView2 = rj6Var.C;
        int iU0 = i < 0 ? ((LinearLayoutManager) recyclerView2.getLayoutManager()).U0() : ((LinearLayoutManager) recyclerView2.getLayoutManager()).W0();
        y yVar = rj6Var.J;
        fy6 fy6Var = this.a;
        if (yVar == null) {
            rj6Var.y = fy6Var.u(iU0);
        }
        rj6Var.H.setText(fy6Var.u(iU0).h());
        rj6Var.o(iU0);
    }
}
