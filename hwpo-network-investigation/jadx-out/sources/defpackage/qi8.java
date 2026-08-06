package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class qi8 extends q9a {
    public final /* synthetic */ ri8 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi8(ri8 ri8Var, String str) {
        super(str, true);
        this.e = ri8Var;
    }

    @Override // defpackage.q9a
    public final long a() {
        ri8 ri8Var = this.e;
        long jNanoTime = System.nanoTime();
        long j = (jNanoTime - ri8Var.b) + 1;
        Iterator<pi8> it = ri8Var.e.iterator();
        it.getClass();
        pi8 pi8Var = null;
        long j2 = Long.MAX_VALUE;
        int i = 0;
        pi8 pi8Var2 = null;
        pi8 pi8Var3 = null;
        int i2 = 0;
        while (it.hasNext()) {
            pi8 next = it.next();
            next.getClass();
            synchronized (next) {
                if (ri8Var.a(next, jNanoTime) > 0) {
                    i2++;
                } else {
                    long j3 = next.r;
                    if (j3 < j) {
                        pi8Var2 = next;
                        j = j3;
                    }
                    i++;
                    if (j3 < j2) {
                        pi8Var3 = next;
                        j2 = j3;
                    }
                }
                g2b g2bVar = g2b.a;
            }
        }
        if (pi8Var2 != null) {
            pi8Var = pi8Var2;
        } else if (i > 5) {
            j = j2;
            pi8Var = pi8Var3;
        } else {
            j = -1;
        }
        if (pi8Var == null) {
            if (pi8Var3 != null) {
                return (j2 + ri8Var.b) - jNanoTime;
            }
            if (i2 > 0) {
                return ri8Var.b;
            }
            return -1L;
        }
        synchronized (pi8Var) {
            if (!pi8Var.q.isEmpty()) {
                return 0L;
            }
            if (pi8Var.r != j) {
                return 0L;
            }
            pi8Var.k = true;
            ri8Var.e.remove(pi8Var);
            ytb.c(pi8Var.e);
            ri8Var.a.getClass();
            if (ri8Var.e.isEmpty()) {
                ri8Var.c.a();
            }
            return 0L;
        }
    }
}
