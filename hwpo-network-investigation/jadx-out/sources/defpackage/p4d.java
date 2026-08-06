package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class p4d implements Executor {
    public final gxb t;

    public p4d() {
        gxb gxbVar = new gxb(Looper.getMainLooper());
        Looper.getMainLooper();
        this.t = gxbVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.t.post(runnable);
    }
}
