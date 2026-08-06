package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class toc implements Runnable {
    public final /* synthetic */ long t;
    public final /* synthetic */ hrc u;

    public toc(hrc hrcVar, long j) {
        this.t = j;
        Objects.requireNonNull(hrcVar);
        this.u = hrcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tkc tkcVar = this.u.a;
        zic zicVar = tkcVar.e;
        tkc.k(zicVar);
        tic ticVar = zicVar.k;
        long j = this.t;
        ticVar.b(j);
        thc thcVar = tkcVar.f;
        tkc.m(thcVar);
        thcVar.m.b(Long.valueOf(j), "Session timeout duration set");
    }
}
