package defpackage;

import android.os.Process;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rxb implements Runnable {
    public final Runnable t;

    public rxb(Runnable runnable) {
        this.t = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.t.run();
    }
}
