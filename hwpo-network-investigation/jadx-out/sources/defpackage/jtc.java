package defpackage;

import android.os.RemoteException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jtc implements Runnable {
    public final /* synthetic */ AtomicReference t;
    public final /* synthetic */ q1d u;
    public final /* synthetic */ tvc v;

    public jtc(tvc tvcVar, AtomicReference atomicReference, q1d q1dVar) {
        this.t = atomicReference;
        this.u = q1dVar;
        Objects.requireNonNull(tvcVar);
        this.v = tvcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2 = this.t;
        synchronized (atomicReference2) {
            try {
                try {
                    tvc tvcVar = this.v;
                    tkc tkcVar = tvcVar.a;
                    zic zicVar = tkcVar.e;
                    tkc.k(zicVar);
                    if (zicVar.n().i(lnc.ANALYTICS_STORAGE)) {
                        jgc jgcVar = tvcVar.d;
                        if (jgcVar != null) {
                            atomicReference2.set(jgcVar.G(this.u));
                            String str = (String) atomicReference2.get();
                            if (str != null) {
                                hrc hrcVar = tvcVar.a.m;
                                tkc.l(hrcVar);
                                hrcVar.g.set(str);
                                zic zicVar2 = tkcVar.e;
                                tkc.k(zicVar2);
                                zicVar2.g.b(str);
                            }
                            tvcVar.t();
                            atomicReference = this.t;
                            atomicReference.notify();
                            return;
                        }
                        thc thcVar = tkcVar.f;
                        tkc.m(thcVar);
                        thcVar.f.a("Failed to get app instance id");
                    } else {
                        thc thcVar2 = tkcVar.f;
                        tkc.m(thcVar2);
                        thcVar2.k.a("Analytics storage consent denied; will not get app instance id");
                        hrc hrcVar2 = tvcVar.a.m;
                        tkc.l(hrcVar2);
                        hrcVar2.g.set(null);
                        zic zicVar3 = tkcVar.e;
                        tkc.k(zicVar3);
                        zicVar3.g.b(null);
                        atomicReference2.set(null);
                    }
                    atomicReference2.notify();
                } catch (RemoteException e) {
                    thc thcVar3 = this.v.a.f;
                    tkc.m(thcVar3);
                    thcVar3.f.b(e, "Failed to get app instance id");
                    atomicReference = this.t;
                }
            } catch (Throwable th) {
                this.t.notify();
                throw th;
            }
        }
    }
}
