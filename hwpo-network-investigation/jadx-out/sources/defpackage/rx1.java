package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rx1<T> implements yc9<T> {
    public final AtomicReference<yc9<T>> a;

    public rx1(yc9<? extends T> yc9Var) {
        this.a = new AtomicReference<>(yc9Var);
    }

    @Override // defpackage.yc9
    public final Iterator<T> iterator() {
        yc9<T> andSet = this.a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        aa0.c("This sequence can be consumed only once.");
        return null;
    }
}
