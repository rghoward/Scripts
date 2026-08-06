package defpackage;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class oj6 implements View.OnClickListener {
    public final /* synthetic */ fy6 t;
    public final /* synthetic */ rj6 u;

    public oj6(rj6 rj6Var, fy6 fy6Var) {
        this.u = rj6Var;
        this.t = fy6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        rj6 rj6Var = this.u;
        int iU0 = ((LinearLayoutManager) rj6Var.C.getLayoutManager()).U0();
        fy6 fy6Var = this.t;
        fy6Var.k = 2;
        rj6Var.k(fy6Var.u(iU0 + 1));
    }
}
