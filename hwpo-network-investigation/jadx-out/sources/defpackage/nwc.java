package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nwc implements Runnable {
    public final /* synthetic */ long t;
    public final /* synthetic */ cxc u;

    public nwc(cxc cxcVar, long j) {
        this.t = j;
        Objects.requireNonNull(cxcVar);
        this.u = cxcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cxc cxcVar = this.u;
        cxcVar.g();
        cxcVar.k();
        tkc tkcVar = cxcVar.a;
        thc thcVar = tkcVar.f;
        tkc.m(thcVar);
        phc phcVar = thcVar.n;
        long j = this.t;
        phcVar.b(Long.valueOf(j), "Activity paused, time");
        swc swcVar = cxcVar.g;
        cxc cxcVar2 = swcVar.b;
        cxcVar2.a.k.getClass();
        qwc qwcVar = new qwc(swcVar, System.currentTimeMillis(), j);
        swcVar.a = qwcVar;
        cxcVar2.c.postDelayed(qwcVar, 2000L);
        if (tkcVar.d.v()) {
            cxcVar.f.c.c();
        }
    }
}
