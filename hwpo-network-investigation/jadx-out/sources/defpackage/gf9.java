package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class gf9 implements oh4<List<? extends l89>, g2b> {
    public final /* synthetic */ bf9 t;

    public gf9(bf9 bf9Var) {
        this.t = bf9Var;
    }

    @Override // defpackage.oh4
    public final g2b invoke(List<? extends l89> list) {
        List<? extends l89> list2 = list;
        bf9.a aVar = bf9.Companion;
        bf9 bf9Var = this.t;
        bf9Var.p().g.setVisibility(!list2.isEmpty() ? 0 : 8);
        ((wm6) bf9Var.D.getValue()).u(list2);
        return g2b.a;
    }
}
