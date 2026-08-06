package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class l9c extends Thread {
    public final WeakReference<be> t;
    public final long u;
    public final CountDownLatch v = new CountDownLatch(1);
    public boolean w = false;

    public l9c(be beVar, long j) {
        this.t = new WeakReference<>(beVar);
        this.u = j;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        be beVar;
        WeakReference<be> weakReference = this.t;
        try {
            if (this.v.await(this.u, TimeUnit.MILLISECONDS) || (beVar = weakReference.get()) == null) {
                return;
            }
            beVar.b();
            this.w = true;
        } catch (InterruptedException unused) {
            be beVar2 = weakReference.get();
            if (beVar2 != null) {
                beVar2.b();
                this.w = true;
            }
        }
    }
}
