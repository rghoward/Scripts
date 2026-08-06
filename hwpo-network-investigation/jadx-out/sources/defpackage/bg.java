package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bg implements mh4<g2b> {
    public final /* synthetic */ qf t;
    public final /* synthetic */ List<u23> u;

    /* JADX WARN: Multi-variable type inference failed */
    public bg(qf qfVar, List<? extends u23> list) {
        this.t = qfVar;
        this.u = list;
    }

    @Override // defpackage.mh4
    public final g2b invoke() {
        qf.a aVar = qf.Companion;
        ((ff) this.t.C.getValue()).u(this.u);
        return g2b.a;
    }
}
