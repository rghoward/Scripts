package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jh<OutputT> extends b1.i<OutputT> {
    public static final a C;
    public static final rz5 D = new rz5(jh.class);
    public volatile Set<Throwable> A;
    public volatile int B;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class a {
        public abstract void a(ih ihVar, Set set);

        public abstract int b(ih ihVar);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends a {
        public final AtomicReferenceFieldUpdater<? super jh<?>, ? super Set<Throwable>> a;
        public final AtomicIntegerFieldUpdater<? super jh<?>> b;

        public b(AtomicReferenceFieldUpdater<? super jh<?>, ? super Set<Throwable>> atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater<? super jh<?>> atomicIntegerFieldUpdater) {
            this.a = atomicReferenceFieldUpdater;
            this.b = atomicIntegerFieldUpdater;
        }

        @Override // jh.a
        public final void a(ih ihVar, Set set) {
            AtomicReferenceFieldUpdater<? super jh<?>, ? super Set<Throwable>> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.a;
                if (atomicReferenceFieldUpdater.compareAndSet(ihVar, null, set)) {
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(ihVar) == null);
        }

        @Override // jh.a
        public final int b(ih ihVar) {
            return this.b.decrementAndGet(ihVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c extends a {
        @Override // jh.a
        public final void a(ih ihVar, Set set) {
            synchronized (ihVar) {
                try {
                    if (ihVar.A == null) {
                        ihVar.A = set;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // jh.a
        public final int b(ih ihVar) {
            int i;
            synchronized (ihVar) {
                i = ihVar.B - 1;
                ihVar.B = i;
            }
            return i;
        }
    }

    static {
        Throwable th;
        a cVar;
        try {
            cVar = new b(AtomicReferenceFieldUpdater.newUpdater(jh.class, Set.class, "A"), AtomicIntegerFieldUpdater.newUpdater(jh.class, "B"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            cVar = new c();
        }
        C = cVar;
        if (th != null) {
            D.a().log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }
}
