package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class a6d extends b1 {
    public c6d A;
    public final int B;

    public /* synthetic */ a6d(c6d c6dVar, int i) {
        this.A = c6dVar;
        this.B = i;
    }

    @Override // defpackage.b1
    public final void c() {
        AtomicLong atomicLong;
        long j;
        int i;
        int i2;
        boolean z;
        c6d c6dVar = this.A;
        this.A = null;
        if (c6dVar == null) {
            return;
        }
        AtomicReference atomicReference = c6dVar.c;
        do {
            atomicLong = c6dVar.b;
            j = atomicLong.get();
            i = (int) j;
            long j2 = j >>> 32;
            if (i == Integer.MIN_VALUE) {
                StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 13);
                sb.append("Refcount is: ");
                sb.append(j);
                throw new AssertionError(sb.toString());
            }
            i2 = (int) j2;
            z = i == -2147483647;
            if (z) {
                i2++;
            }
        } while (!atomicLong.compareAndSet(j, (((long) i2) << 32) | (4294967295L & ((long) (i - 1)))));
        if (z) {
            while (true) {
                b6d b6dVar = (b6d) atomicReference.get();
                if (b6dVar != null) {
                    if (b6dVar.A <= this.B) {
                        b6dVar.cancel(true);
                        while (!atomicReference.compareAndSet(b6dVar, null)) {
                            if (atomicReference.get() != b6dVar) {
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    @Override // defpackage.b1
    public final String j() {
        w40 w40Var;
        c6d c6dVar = this.A;
        if (c6dVar == null || (w40Var = c6dVar.a.t) == null) {
            return null;
        }
        String string = w40Var.toString();
        String strA = w27.a(new StringBuilder(string.length() + 11), "callable=[", string, "]");
        b6d b6dVar = (b6d) this.A.c.get();
        if (b6dVar == null) {
            return strA;
        }
        int length = strA.length();
        String string2 = b6dVar.toString();
        return ao2.a(new StringBuilder(string2.length() + length + 9 + 1), strA, ", trial=[", string2, "]");
    }
}
