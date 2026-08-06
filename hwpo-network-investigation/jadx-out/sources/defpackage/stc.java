package defpackage;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class stc implements Runnable {
    public final /* synthetic */ dsc t;
    public final /* synthetic */ tvc u;

    public stc(tvc tvcVar, dsc dscVar) {
        this.t = dscVar;
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
            thcVar.f.a("Failed to send current screen to service");
            return;
        }
        try {
            dsc dscVar = this.t;
            if (dscVar == null) {
                jgcVar.n(null, 0L, null, tkcVar.a.getPackageName());
            } else {
                jgcVar.n(dscVar.a, dscVar.c, dscVar.b, tkcVar.a.getPackageName());
            }
            tvcVar.t();
        } catch (RemoteException e) {
            thc thcVar2 = tvcVar.a.f;
            tkc.m(thcVar2);
            thcVar2.f.b(e, "Failed to send current screen to the service");
        }
    }
}
