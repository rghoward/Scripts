package defpackage;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class luc implements Runnable {
    public final /* synthetic */ AtomicReference t;
    public final /* synthetic */ String u;
    public final /* synthetic */ String v;
    public final /* synthetic */ q1d w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ tvc y;

    public luc(tvc tvcVar, AtomicReference atomicReference, String str, String str2, q1d q1dVar, boolean z) {
        this.t = atomicReference;
        this.u = str;
        this.v = str2;
        this.w = q1dVar;
        this.x = z;
        this.y = tvcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2 = this.t;
        synchronized (atomicReference2) {
            try {
                try {
                    tvc tvcVar = this.y;
                    jgc jgcVar = tvcVar.d;
                    if (jgcVar == null) {
                        thc thcVar = tvcVar.a.f;
                        tkc.m(thcVar);
                        thcVar.f.d("(legacy) Failed to get user properties; not connected to service", null, this.u, this.v);
                        atomicReference2.set(Collections.EMPTY_LIST);
                        atomicReference2.notify();
                        return;
                    }
                    if (TextUtils.isEmpty(null)) {
                        atomicReference2.set(jgcVar.q(this.u, this.v, this.x, this.w));
                    } else {
                        atomicReference2.set(jgcVar.k(null, this.u, this.v, this.x));
                    }
                    tvcVar.t();
                    atomicReference = this.t;
                    atomicReference.notify();
                } catch (RemoteException e) {
                    thc thcVar2 = this.y.a.f;
                    tkc.m(thcVar2);
                    thcVar2.f.d("(legacy) Failed to get user properties; remote exception", null, this.u, e);
                    this.t.set(Collections.EMPTY_LIST);
                    atomicReference = this.t;
                }
            } catch (Throwable th) {
                this.t.notify();
                throw th;
            }
        }
    }
}
