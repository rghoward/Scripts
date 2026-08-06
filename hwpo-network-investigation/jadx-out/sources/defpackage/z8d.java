package defpackage;

import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class z8d implements Runnable {
    public final /* synthetic */ y8d t;
    public final /* synthetic */ l4c u;

    public z8d(l4c l4cVar, y8d y8dVar) {
        this.t = y8dVar;
        Objects.requireNonNull(l4cVar);
        this.u = l4cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((ConcurrentHashMap) this.u.a).remove(this.t);
    }
}
