package defpackage;

import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ntc implements Runnable {
    public final /* synthetic */ q1d t;
    public final /* synthetic */ tvc u;

    public ntc(tvc tvcVar, q1d q1dVar) {
        this.t = q1dVar;
        this.u = tvcVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        tvc tvcVar = this.u;
        jgc jgcVar = tvcVar.d;
        tkc tkcVar = tvcVar.a;
        if (jgcVar == null) {
            thc thcVar = tkcVar.f;
            tkc.m(thcVar);
            thcVar.f.a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            q1d q1dVar = this.t;
            t7c t7cVar = tkcVar.d;
            ufc ufcVar = wfc.W0;
            if (t7cVar.r(null, ufcVar)) {
                tvcVar.y(jgcVar, null, q1dVar);
            }
            jgcVar.z(q1dVar);
            tkcVar.o().l();
            tkcVar.d.r(null, ufcVar);
            tvcVar.y(jgcVar, null, q1dVar);
            tvcVar.t();
        } catch (RemoteException e) {
            thc thcVar2 = tkcVar.f;
            tkc.m(thcVar2);
            thcVar2.f.b(e, "Failed to send app launch to the service");
        }
    }
}
