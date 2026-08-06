package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class wbb implements mh4<g2b> {
    public final /* synthetic */ rbb t;
    public final /* synthetic */ List<y23> u;

    /* JADX WARN: Multi-variable type inference failed */
    public wbb(rbb rbbVar, List<? extends y23> list) {
        this.t = rbbVar;
        this.u = list;
    }

    @Override // defpackage.mh4
    public final g2b invoke() {
        rbb.a aVar = rbb.Companion;
        ((ibb) this.t.C.getValue()).u(this.u);
        return g2b.a;
    }
}
