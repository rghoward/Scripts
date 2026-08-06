package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class w37 {
    public final AtomicReference<a> a = new AtomicReference<>(null);
    public final a47 b = new a47();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final o37 a;
        public final el5 b;

        public a(o37 o37Var, el5 el5Var) {
            this.a = o37Var;
            this.b = el5Var;
        }
    }

    public static final void a(w37 w37Var, a aVar) {
        AtomicReference<a> atomicReference = w37Var.a;
        while (true) {
            a aVar2 = atomicReference.get();
            if (aVar2 != null && aVar.a.compareTo(aVar2.a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            do {
                if (atomicReference.compareAndSet(aVar2, aVar)) {
                    if (aVar2 != null) {
                        aVar2.b.k(new q37("Mutation interrupted", 0));
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == aVar2);
        }
    }
}
