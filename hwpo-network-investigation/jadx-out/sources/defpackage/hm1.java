package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hm1 implements mh4<g2b> {
    public final /* synthetic */ am1 t;
    public final /* synthetic */ List<v23> u;

    /* JADX WARN: Multi-variable type inference failed */
    public hm1(am1 am1Var, List<? extends v23> list) {
        this.t = am1Var;
        this.u = list;
    }

    @Override // defpackage.mh4
    public final g2b invoke() {
        am1.a aVar = am1.Companion;
        this.t.q().u(this.u);
        return g2b.a;
    }
}
