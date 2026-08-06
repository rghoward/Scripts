package defpackage;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class byb<T> implements di7, lh7, ch7 {
    public final CountDownLatch t = new CountDownLatch(1);

    @Override // defpackage.ch7
    public final void b() {
        this.t.countDown();
    }

    @Override // defpackage.lh7
    public final void d(Exception exc) {
        this.t.countDown();
    }

    @Override // defpackage.di7
    public final void onSuccess(T t) {
        this.t.countDown();
    }
}
