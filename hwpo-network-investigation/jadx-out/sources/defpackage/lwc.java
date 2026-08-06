package defpackage;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lwc implements Runnable {
    public final /* synthetic */ long t;
    public final /* synthetic */ cxc u;

    public lwc(cxc cxcVar, long j) {
        this.t = j;
        Objects.requireNonNull(cxcVar);
        this.u = cxcVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0055  */
    @Override // java.lang.Runnable
    public final void run() {
        cxc cxcVar = this.u;
        zwc zwcVar = cxcVar.f;
        cxcVar.g();
        cxcVar.k();
        tkc tkcVar = cxcVar.a;
        thc thcVar = tkcVar.f;
        tkc.m(thcVar);
        phc phcVar = thcVar.n;
        long j = this.t;
        phcVar.b(Long.valueOf(j), "Activity resumed, time");
        t7c t7cVar = tkcVar.d;
        if (t7cVar.r(null, wfc.S0)) {
            if (t7cVar.v() || cxcVar.d) {
                zwcVar.d.g();
                zwcVar.c.c();
                zwcVar.a = j;
                zwcVar.b = j;
            }
        } else if (t7cVar.v()) {
            zwcVar.d.g();
            zwcVar.c.c();
            zwcVar.a = j;
            zwcVar.b = j;
        } else {
            zic zicVar = tkcVar.e;
            tkc.k(zicVar);
            if (zicVar.s.a()) {
                zwcVar.d.g();
                zwcVar.c.c();
                zwcVar.a = j;
                zwcVar.b = j;
            }
        }
        swc swcVar = cxcVar.g;
        cxc cxcVar2 = swcVar.b;
        cxcVar2.g();
        qwc qwcVar = swcVar.a;
        if (qwcVar != null) {
            cxcVar2.c.removeCallbacks(qwcVar);
        }
        zic zicVar2 = cxcVar2.a.e;
        tkc.k(zicVar2);
        zicVar2.s.b(false);
        cxcVar2.g();
        cxcVar2.d = false;
        axc axcVar = cxcVar.e;
        cxc cxcVar3 = axcVar.a;
        cxcVar3.g();
        tkc tkcVar2 = cxcVar3.a;
        boolean zD = tkcVar2.d();
        mq2 mq2Var = tkcVar2.k;
        if (zD) {
            mq2Var.getClass();
            axcVar.b(System.currentTimeMillis(), tkcVar2.d.r(null, wfc.e1) ? SystemClock.elapsedRealtime() : 0L);
        }
    }
}
