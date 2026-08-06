package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class l9d extends i9d {
    public static final j9d d = new j9d(7);
    public static final k9d e = new k9d();
    public final AtomicInteger c = new AtomicInteger();

    @Override // defpackage.i9d
    public final void a() {
        this.c.decrementAndGet();
    }
}
