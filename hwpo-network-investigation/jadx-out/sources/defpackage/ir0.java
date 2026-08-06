package defpackage;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ir0 implements zi, yi {
    public final r92 t;
    public final Object u = new Object();
    public CountDownLatch v;

    public ir0(r92 r92Var) {
        this.t = r92Var;
    }

    @Override // defpackage.zi
    public final void b(Bundle bundle, String str) {
        CountDownLatch countDownLatch = this.v;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    @Override // defpackage.yi
    public final void c(Bundle bundle) {
        synchronized (this.u) {
            try {
                zd6 zd6Var = zd6.t;
                zd6Var.e("Logging event _ae to Firebase Analytics with params " + bundle);
                this.v = new CountDownLatch(1);
                this.t.c(bundle);
                zd6Var.e("Awaiting app exception callback from Analytics...");
                try {
                    if (this.v.await(500L, TimeUnit.MILLISECONDS)) {
                        zd6Var.e("App exception callback received from Analytics listener.");
                    } else {
                        zd6Var.f("Timeout exceeded while awaiting app exception callback from Analytics listener.", null);
                    }
                } catch (InterruptedException unused) {
                    Log.e("FirebaseCrashlytics", "Interrupted while awaiting app exception callback from Analytics listener.", null);
                }
                this.v = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
