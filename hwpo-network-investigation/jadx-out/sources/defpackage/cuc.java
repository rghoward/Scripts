package defpackage;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cuc implements Runnable {
    public final /* synthetic */ q1d t;
    public final /* synthetic */ tvc u;

    public cuc(tvc tvcVar, q1d q1dVar) {
        this.t = q1dVar;
        Objects.requireNonNull(tvcVar);
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
            thcVar.f.a("Failed to send consent settings to service");
            return;
        }
        try {
            jgcVar.E(this.t);
            tvcVar.t();
        } catch (RemoteException e) {
            thc thcVar2 = tkcVar.f;
            tkc.m(thcVar2);
            thcVar2.f.b(e, "Failed to send consent settings to the service");
        }
    }
}
