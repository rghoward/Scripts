package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fvc implements Runnable {
    public final /* synthetic */ ax1 t;
    public final /* synthetic */ hvc u;

    public fvc(hvc hvcVar, ax1 ax1Var) {
        this.t = ax1Var;
        this.u = hvcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tvc tvcVar = this.u.v;
        tvcVar.d = null;
        if (this.t.u != 7777) {
            tvcVar.v();
            return;
        }
        if (tvcVar.g == null) {
            tvcVar.g = Executors.newScheduledThreadPool(1);
        }
        tvcVar.g.schedule(new Runnable() { // from class: cvc
            @Override // java.lang.Runnable
            public final void run() {
                final tvc tvcVar2 = this.t.u.v;
                fkc fkcVar = tvcVar2.a.g;
                tkc.m(fkcVar);
                fkcVar.p(new Runnable() { // from class: dvc
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        tvcVar2.m();
                    }
                });
            }
        }, ((Long) wfc.Z.a(null)).longValue(), TimeUnit.MILLISECONDS);
    }
}
