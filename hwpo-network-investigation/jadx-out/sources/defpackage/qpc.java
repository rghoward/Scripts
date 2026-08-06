package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qpc implements Runnable {
    public final /* synthetic */ AtomicReference t;
    public final /* synthetic */ hrc u;

    public qpc(hrc hrcVar, AtomicReference atomicReference) {
        this.t = atomicReference;
        Objects.requireNonNull(hrcVar);
        this.u = hrcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.t;
        synchronized (atomicReference) {
            try {
                try {
                    tkc tkcVar = this.u.a;
                    atomicReference.set(Long.valueOf(tkcVar.d.o(tkcVar.r().m(), wfc.c0)));
                    this.t.notify();
                } catch (Throwable th) {
                    this.t.notify();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
