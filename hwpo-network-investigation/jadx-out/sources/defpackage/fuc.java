package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fuc implements Runnable {
    public final /* synthetic */ q1d t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ e5c v;
    public final /* synthetic */ tvc w;

    public fuc(tvc tvcVar, q1d q1dVar, boolean z, e5c e5cVar) {
        this.t = q1dVar;
        this.u = z;
        this.v = e5cVar;
        Objects.requireNonNull(tvcVar);
        this.w = tvcVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        tvc tvcVar = this.w;
        jgc jgcVar = tvcVar.d;
        if (jgcVar != null) {
            tvcVar.y(jgcVar, this.u ? null : this.v, this.t);
            tvcVar.t();
        } else {
            thc thcVar = tvcVar.a.f;
            tkc.m(thcVar);
            thcVar.f.a("Discarding data. Failed to send conditional user property to service");
        }
    }
}
