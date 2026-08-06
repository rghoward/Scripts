package defpackage;

import android.app.ActivityManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class axc {
    public final /* synthetic */ cxc a;

    public axc(cxc cxcVar) {
        this.a = cxcVar;
    }

    public final void a() {
        cxc cxcVar = this.a;
        cxcVar.g();
        tkc tkcVar = cxcVar.a;
        zic zicVar = tkcVar.e;
        tkc.k(zicVar);
        tkcVar.k.getClass();
        if (zicVar.p(System.currentTimeMillis())) {
            zic zicVar2 = tkcVar.e;
            tkc.k(zicVar2);
            zicVar2.l.b(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                thc thcVar = tkcVar.f;
                tkc.m(thcVar);
                thcVar.n.a("Detected application was in foreground");
                c(System.currentTimeMillis(), tkcVar.d.r(null, wfc.e1) ? SystemClock.elapsedRealtime() : 0L);
            }
        }
    }

    public final void b(long j, long j2) {
        cxc cxcVar = this.a;
        cxcVar.g();
        cxcVar.k();
        tkc tkcVar = cxcVar.a;
        zic zicVar = tkcVar.e;
        tkc.k(zicVar);
        if (zicVar.p(j)) {
            tkc.k(zicVar);
            zicVar.l.b(true);
            tkcVar.r().l();
        }
        tkc.k(zicVar);
        zicVar.p.b(j);
        if (zicVar.l.a()) {
            c(j, j2);
        }
    }

    public final void c(long j, long j2) {
        cxc cxcVar = this.a;
        cxcVar.g();
        tkc tkcVar = cxcVar.a;
        if (tkcVar.d()) {
            zic zicVar = tkcVar.e;
            tkc.k(zicVar);
            zicVar.p.b(j);
            tkcVar.k.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            thc thcVar = tkcVar.f;
            tkc.m(thcVar);
            thcVar.n.b(Long.valueOf(jElapsedRealtime), "Session started, time");
            long j3 = j / 1000;
            Long lValueOf = Long.valueOf(j3);
            hrc hrcVar = tkcVar.m;
            tkc.l(hrcVar);
            hrcVar.r(j, lValueOf, "auto", "_sid");
            tkc.k(zicVar);
            zicVar.q.b(j3);
            zicVar.l.b(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j3);
            tkc.l(hrcVar);
            hrcVar.o(j, j2, bundle, "auto", "_s");
            String strA = zicVar.v.a();
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", strA);
            tkc.l(hrcVar);
            hrcVar.o(j, j2, bundle2, "auto", "_ssr");
        }
    }
}
