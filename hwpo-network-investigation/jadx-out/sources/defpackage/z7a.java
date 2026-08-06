package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class z7a implements vf1 {
    @Override // defpackage.vf1
    public final long a() {
        return SystemClock.uptimeMillis();
    }

    @Override // defpackage.vf1
    public final b8a b(Looper looper, Handler.Callback callback) {
        return new b8a(new Handler(looper, callback));
    }

    @Override // defpackage.vf1
    public final long c() {
        return SystemClock.elapsedRealtime();
    }

    @Override // defpackage.vf1
    public final long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override // defpackage.vf1
    public final long d() {
        return System.nanoTime();
    }
}
