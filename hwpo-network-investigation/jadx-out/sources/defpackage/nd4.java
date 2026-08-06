package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class nd4<V> extends ln4 implements Future<V> {
    public boolean cancel(boolean z) {
        return ((od4.a) this).x.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        return ((od4.a) this).x.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return ((od4.a) this).x.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return ((od4.a) this).x.isDone();
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) {
        return ((od4.a) this).x.get(j, timeUnit);
    }
}
