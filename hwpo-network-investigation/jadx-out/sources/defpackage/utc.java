package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class utc implements Runnable {
    public final /* synthetic */ q1d t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ v9c v;
    public final /* synthetic */ Bundle w;
    public final /* synthetic */ tvc x;

    public utc(tvc tvcVar, q1d q1dVar, boolean z, v9c v9cVar, Bundle bundle) {
        this.t = q1dVar;
        this.u = z;
        this.v = v9cVar;
        this.w = bundle;
        Objects.requireNonNull(tvcVar);
        this.x = tvcVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        tvc tvcVar = this.x;
        jgc jgcVar = tvcVar.d;
        tkc tkcVar = tvcVar.a;
        if (jgcVar == null) {
            thc thcVar = tkcVar.f;
            tkc.m(thcVar);
            thcVar.f.a("Failed to send default event parameters to service");
            return;
        }
        boolean zR = tkcVar.d.r(null, wfc.W0);
        q1d q1dVar = this.t;
        if (zR) {
            tvcVar.y(jgcVar, this.u ? null : this.v, q1dVar);
            return;
        }
        try {
            jgcVar.I(this.w, q1dVar);
            tvcVar.t();
        } catch (RemoteException e) {
            thc thcVar2 = tkcVar.f;
            tkc.m(thcVar2);
            thcVar2.f.b(e, "Failed to send default event parameters to service");
        }
    }
}
