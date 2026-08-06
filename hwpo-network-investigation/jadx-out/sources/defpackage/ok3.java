package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ok3 implements oh4<List<? extends l89>, g2b> {
    public final /* synthetic */ gk3 t;

    public ok3(gk3 gk3Var) {
        this.t = gk3Var;
    }

    @Override // defpackage.oh4
    public final g2b invoke(List<? extends l89> list) {
        List<? extends l89> list2 = list;
        gk3.a aVar = gk3.Companion;
        gk3 gk3Var = this.t;
        gk3Var.p().c.setVisibility(!list2.isEmpty() ? 0 : 8);
        ((jw3) gk3Var.D.getValue()).u(list2);
        return g2b.a;
    }
}
