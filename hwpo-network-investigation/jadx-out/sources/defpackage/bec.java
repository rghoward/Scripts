package defpackage;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bec implements Runnable {
    public final long t;
    public final long u;
    public final boolean v;
    public final /* synthetic */ mec w;

    public bec(mec mecVar, boolean z) {
        Objects.requireNonNull(mecVar);
        this.w = mecVar;
        this.t = System.currentTimeMillis();
        this.u = SystemClock.elapsedRealtime();
        this.v = z;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        mec mecVar = this.w;
        if (mecVar.e) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e) {
            mecVar.d(e, false, this.v);
            b();
        }
    }

    public void b() {
    }
}
