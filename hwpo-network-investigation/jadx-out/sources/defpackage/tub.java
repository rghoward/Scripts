package defpackage;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tub implements Runnable {
    public final /* synthetic */ ax1 t;
    public final /* synthetic */ uub u;

    public tub(uub uubVar, ax1 ax1Var) {
        this.t = ax1Var;
        this.u = uubVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p55 p55Var;
        uub uubVar = this.u;
        zn4 zn4Var = uubVar.f;
        zw.e eVar = uubVar.a;
        rub rubVar = (rub) zn4Var.C.get(uubVar.b);
        if (rubVar == null) {
            return;
        }
        ax1 ax1Var = this.t;
        if (ax1Var.u != 0) {
            rubVar.p(ax1Var, null);
            return;
        }
        uubVar.e = true;
        if (eVar.o()) {
            if (!uubVar.e || (p55Var = uubVar.c) == null) {
                return;
            }
            eVar.p(p55Var, uubVar.d);
            return;
        }
        try {
            eVar.p(null, eVar.b());
        } catch (SecurityException e) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
            eVar.c("Failed to get service from broker.");
            rubVar.p(new ax1(10, null, null), null);
        }
    }
}
