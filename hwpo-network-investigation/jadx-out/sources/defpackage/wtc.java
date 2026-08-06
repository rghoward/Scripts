package defpackage;

import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wtc implements Runnable {
    public final /* synthetic */ z9c t;
    public final /* synthetic */ String u;
    public final /* synthetic */ obc v;
    public final /* synthetic */ tvc w;

    public wtc(tvc tvcVar, z9c z9cVar, String str, obc obcVar) {
        this.t = z9cVar;
        this.u = str;
        this.v = obcVar;
        this.w = tvcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yzc yzcVar;
        obc obcVar = this.v;
        tvc tvcVar = this.w;
        byte[] bArrB = null;
        try {
            try {
                jgc jgcVar = tvcVar.d;
                if (jgcVar == null) {
                    tkc tkcVar = tvcVar.a;
                    thc thcVar = tkcVar.f;
                    tkc.m(thcVar);
                    thcVar.f.a("Discarding data. Failed to send event to service to bundle");
                    yzcVar = tkcVar.i;
                } else {
                    bArrB = jgcVar.B(this.u, this.t);
                    tvcVar.t();
                    yzcVar = tvcVar.a.i;
                }
            } catch (RemoteException e) {
                thc thcVar2 = tvcVar.a.f;
                tkc.m(thcVar2);
                thcVar2.f.b(e, "Failed to send event to the service to bundle");
            }
            tkc.k(yzcVar);
            yzcVar.X(obcVar, bArrB);
        } catch (Throwable th) {
            yzc yzcVar2 = tvcVar.a.i;
            tkc.k(yzcVar2);
            yzcVar2.X(obcVar, null);
            throw th;
        }
    }
}
