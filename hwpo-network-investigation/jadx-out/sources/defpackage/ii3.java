package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ii3 implements oh4<List<? extends l89>, g2b> {
    public final /* synthetic */ fi3 t;

    public ii3(fi3 fi3Var) {
        this.t = fi3Var;
    }

    @Override // defpackage.oh4
    public final g2b invoke(List<? extends l89> list) {
        List<? extends l89> list2 = list;
        fi3.a aVar = fi3.Companion;
        fi3 fi3Var = this.t;
        fi3Var.q().c.setVisibility(!list2.isEmpty() ? 0 : 8);
        ((vm6) fi3Var.I.getValue()).u(list2);
        return g2b.a;
    }
}
