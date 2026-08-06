package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bc3 implements oh4<List<? extends l89>, g2b> {
    public final /* synthetic */ rb3 t;

    public bc3(rb3 rb3Var) {
        this.t = rb3Var;
    }

    @Override // defpackage.oh4
    public final g2b invoke(List<? extends l89> list) {
        List<? extends l89> list2 = list;
        rb3.a aVar = rb3.Companion;
        rb3 rb3Var = this.t;
        rb3Var.r().d.setVisibility(!list2.isEmpty() ? 0 : 8);
        ((vm6) rb3Var.H.getValue()).u(list2);
        return g2b.a;
    }
}
