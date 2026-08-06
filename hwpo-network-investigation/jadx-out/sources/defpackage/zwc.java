package defpackage;

import android.os.Bundle;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zwc {
    public long a;
    public long b;
    public final twc c;
    public final /* synthetic */ cxc d;

    public zwc(cxc cxcVar) {
        this.d = cxcVar;
        tkc tkcVar = cxcVar.a;
        this.c = new twc(this, tkcVar);
        tkcVar.k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.a = jElapsedRealtime;
        this.b = jElapsedRealtime;
    }

    public final boolean a(long j, boolean z, boolean z2) {
        cxc cxcVar = this.d;
        cxcVar.g();
        cxcVar.h();
        tkc tkcVar = cxcVar.a;
        boolean zD = tkcVar.d();
        thc thcVar = tkcVar.f;
        if (zD) {
            zic zicVar = tkcVar.e;
            tkc.k(zicVar);
            tic ticVar = zicVar.p;
            tkcVar.k.getClass();
            ticVar.b(System.currentTimeMillis());
        }
        long j2 = j - this.a;
        if (!z && j2 < 1000) {
            tkc.m(thcVar);
            thcVar.n.b(Long.valueOf(j2), "Screen exposed for less than 1000 ms. Event not sent. time");
            return false;
        }
        if (!z2) {
            j2 = j - this.b;
            this.b = j;
        }
        tkc.m(thcVar);
        thcVar.n.b(Long.valueOf(j2), "Recording user engagement, ms");
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j2);
        boolean z3 = !tkcVar.d.v();
        xsc xscVar = tkcVar.l;
        tkc.l(xscVar);
        yzc.d0(xscVar.k(z3), bundle, true);
        if (!z2) {
            hrc hrcVar = tkcVar.m;
            tkc.l(hrcVar);
            hrcVar.n("auto", "_e", bundle);
        }
        this.a = j;
        twc twcVar = this.c;
        twcVar.c();
        twcVar.b(((Long) wfc.p0.a(null)).longValue());
        return true;
    }
}
