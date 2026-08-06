package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class hc implements mh4<g2b> {
    public final /* synthetic */ xb t;
    public final /* synthetic */ List<t23> u;

    /* JADX WARN: Multi-variable type inference failed */
    public hc(xb xbVar, List<? extends t23> list) {
        this.t = xbVar;
        this.u = list;
    }

    @Override // defpackage.mh4
    public final g2b invoke() {
        xb.a aVar = xb.Companion;
        ((qb) this.t.C.getValue()).u(this.u);
        return g2b.a;
    }
}
