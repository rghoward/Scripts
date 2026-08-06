package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ksc implements Runnable {
    public final /* synthetic */ long t;
    public final /* synthetic */ xsc u;

    public ksc(xsc xscVar, long j) {
        this.t = j;
        Objects.requireNonNull(xscVar);
        this.u = xscVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xsc xscVar = this.u;
        ecc eccVar = xscVar.a.n;
        tkc.j(eccVar);
        eccVar.j(this.t);
        xscVar.e = null;
    }
}
