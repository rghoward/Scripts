package defpackage;

import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ltc implements Runnable {
    public final /* synthetic */ q1d t;
    public final /* synthetic */ obc u;
    public final /* synthetic */ tvc v;

    public ltc(tvc tvcVar, q1d q1dVar, obc obcVar) {
        this.t = q1dVar;
        this.u = obcVar;
        this.v = tvcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yzc yzcVar;
        obc obcVar = this.u;
        tvc tvcVar = this.v;
        String strG = null;
        try {
            try {
                tkc tkcVar = tvcVar.a;
                zic zicVar = tkcVar.e;
                thc thcVar = tkcVar.f;
                tkc.k(zicVar);
                if (zicVar.n().i(lnc.ANALYTICS_STORAGE)) {
                    jgc jgcVar = tvcVar.d;
                    if (jgcVar != null) {
                        strG = jgcVar.G(this.t);
                        if (strG != null) {
                            hrc hrcVar = tkcVar.m;
                            tkc.l(hrcVar);
                            hrcVar.g.set(strG);
                            tkc.k(zicVar);
                            zicVar.g.b(strG);
                        }
                        tvcVar.t();
                        yzcVar = tvcVar.a.i;
                        tkc.k(yzcVar);
                        yzcVar.U(strG, obcVar);
                    }
                    tkc.m(thcVar);
                    thcVar.f.a("Failed to get app instance id");
                } else {
                    tkc.m(thcVar);
                    thcVar.k.a("Analytics storage consent denied; will not get app instance id");
                    hrc hrcVar2 = tkcVar.m;
                    tkc.l(hrcVar2);
                    hrcVar2.g.set(null);
                    tkc.k(zicVar);
                    zicVar.g.b(null);
                }
                yzcVar = tkcVar.i;
            } catch (RemoteException e) {
                thc thcVar2 = tvcVar.a.f;
                tkc.m(thcVar2);
                thcVar2.f.b(e, "Failed to get app instance id");
            }
            tkc.k(yzcVar);
            yzcVar.U(strG, obcVar);
        } catch (Throwable th) {
            yzc yzcVar2 = tvcVar.a.i;
            tkc.k(yzcVar2);
            yzcVar2.U(null, obcVar);
            throw th;
        }
    }
}
