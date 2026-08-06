package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class i99 {
    public static final f99 a = new f99(new byte[0], 0, 0, false, false);
    public static final int b;
    public static final AtomicReference<f99>[] c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = iHighestOneBit;
        AtomicReference<f99>[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference<>();
        }
        c = atomicReferenceArr;
    }

    public static final void a(f99 f99Var) {
        f99Var.getClass();
        if (f99Var.f != null || f99Var.g != null) {
            z90.a("Failed requirement.");
            return;
        }
        if (f99Var.d) {
            return;
        }
        AtomicReference<f99> atomicReference = c[(int) (Thread.currentThread().getId() & (((long) b) - 1))];
        f99 f99Var2 = a;
        f99 andSet = atomicReference.getAndSet(f99Var2);
        if (andSet == f99Var2) {
            return;
        }
        int i = andSet != null ? andSet.c : 0;
        if (i >= 65536) {
            atomicReference.set(andSet);
            return;
        }
        f99Var.f = andSet;
        f99Var.b = 0;
        f99Var.c = i + 8192;
        atomicReference.set(f99Var);
    }

    public static final f99 b() {
        AtomicReference<f99> atomicReference = c[(int) (Thread.currentThread().getId() & (((long) b) - 1))];
        f99 f99Var = a;
        f99 andSet = atomicReference.getAndSet(f99Var);
        if (andSet == f99Var) {
            return new f99();
        }
        if (andSet == null) {
            atomicReference.set(null);
            return new f99();
        }
        atomicReference.set(andSet.f);
        andSet.f = null;
        andSet.c = 0;
        return andSet;
    }
}
