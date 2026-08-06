package defpackage;

import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ptc implements Runnable {
    public final /* synthetic */ q1d t;
    public final /* synthetic */ tvc u;

    public ptc(tvc tvcVar, q1d q1dVar) {
        this.t = q1dVar;
        this.u = tvcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tvc tvcVar = this.u;
        jgc jgcVar = tvcVar.d;
        tkc tkcVar = tvcVar.a;
        if (jgcVar == null) {
            thc thcVar = tkcVar.f;
            tkc.m(thcVar);
            thcVar.i.a("Failed to send app backgrounded");
            return;
        }
        try {
            jgcVar.C(this.t);
            tvcVar.t();
        } catch (RemoteException e) {
            thc thcVar2 = tkcVar.f;
            tkc.m(thcVar2);
            thcVar2.f.b(e, "Failed to send app backgrounded to the service");
        }
    }
}
