package defpackage;

import android.os.Bundle;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class czc implements Runnable {
    public final /* synthetic */ String t;
    public final /* synthetic */ String u;
    public final /* synthetic */ Bundle v;
    public final /* synthetic */ qib w;

    public czc(qib qibVar, String str, String str2, Bundle bundle) {
        this.t = str;
        this.u = str2;
        this.v = bundle;
        this.w = qibVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        long jElapsedRealtime;
        lzc lzcVar = (lzc) this.w.t;
        yzc yzcVarL0 = lzcVar.l0();
        lzcVar.c().getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (lzcVar.f0().r(null, wfc.e1)) {
            lzcVar.c().getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        } else {
            jElapsedRealtime = 0;
        }
        z9c z9cVarO = yzcVarL0.O(this.u, this.v, "auto", jCurrentTimeMillis, jElapsedRealtime, false);
        a78.g(z9cVarO);
        lzcVar.h(this.t, z9cVarO);
    }
}
