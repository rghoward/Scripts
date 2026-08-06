package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class fj9 implements oh4<js7<? extends sh9, ? extends Integer>, g2b> {
    public final /* synthetic */ cj9 t;

    public fj9(cj9 cj9Var) {
        this.t = cj9Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.oh4
    public final g2b invoke(js7<? extends sh9, ? extends Integer> js7Var) {
        js7<? extends sh9, ? extends Integer> js7Var2 = js7Var;
        cj9.a aVar = cj9.Companion;
        sh9 sh9Var = (sh9) js7Var2.t;
        int iIntValue = ((Number) js7Var2.u).intValue();
        cj9 cj9Var = this.t;
        RecyclerView.f adapter = cj9Var.p().c.getAdapter();
        aj9 aj9Var = adapter instanceof aj9 ? (aj9) adapter : null;
        if (aj9Var != null) {
            sh9Var.getClass();
            aj9Var.m = sh9Var;
            aj9Var.a.b();
            cj9Var.p().c.c(iIntValue, false);
        }
        return g2b.a;
    }
}
