package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fpc implements Runnable {
    public final /* synthetic */ long t;
    public final /* synthetic */ hrc u;

    public fpc(hrc hrcVar, long j) {
        this.t = j;
        this.u = hrcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hrc hrcVar = this.u;
        hrcVar.g();
        hrcVar.h();
        tkc tkcVar = hrcVar.a;
        thc thcVar = tkcVar.f;
        tkc.m(thcVar);
        thcVar.m.a("Resetting analytics data (FE)");
        cxc cxcVar = tkcVar.h;
        tkc.l(cxcVar);
        cxcVar.g();
        zwc zwcVar = cxcVar.f;
        zwcVar.c.c();
        zwcVar.d.a.k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        zwcVar.a = jElapsedRealtime;
        zwcVar.b = jElapsedRealtime;
        tkcVar.r().l();
        boolean z = !tkcVar.d();
        zic zicVar = tkcVar.e;
        tkc.k(zicVar);
        zicVar.f.b(this.t);
        tkc tkcVar2 = zicVar.a;
        zic zicVar2 = tkcVar2.e;
        tkc.k(zicVar2);
        if (!TextUtils.isEmpty(zicVar2.v.a())) {
            zicVar.v.b(null);
        }
        zicVar.p.b(0L);
        zicVar.q.b(0L);
        if (!tkcVar2.d.u()) {
            zicVar.o(z);
        }
        zicVar.w.b(null);
        zicVar.x.b(0L);
        zicVar.y.b(null);
        tvc tvcVarP = tkcVar.p();
        tvcVarP.g();
        tvcVarP.h();
        q1d q1dVarW = tvcVarP.w(false);
        tvcVarP.s();
        tvcVarP.a.o().k();
        tvcVarP.u(new k9(tvcVarP, q1dVarW));
        tkc.l(cxcVar);
        cxcVar.e.a();
        hrcVar.r = z;
        tkcVar.p().k(new AtomicReference());
    }
}
