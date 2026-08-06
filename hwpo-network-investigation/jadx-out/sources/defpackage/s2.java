package defpackage;

import defpackage.u2;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class s2<S extends u2<?>> {
    public S[] t;
    public int u;
    public int v;
    public n4a w;

    public final n4a g() {
        n4a n4aVar;
        synchronized (this) {
            n4aVar = this.w;
            if (n4aVar == null) {
                int i = this.u;
                n4aVar = new n4a(1, Integer.MAX_VALUE, xx0.u);
                n4aVar.f(Integer.valueOf(i));
                this.w = n4aVar;
            }
        }
        return n4aVar;
    }

    public final S h() {
        S s;
        n4a n4aVar;
        synchronized (this) {
            try {
                S[] sArr = this.t;
                if (sArr == null) {
                    sArr = (S[]) j();
                    this.t = sArr;
                } else if (this.u >= sArr.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(sArr, sArr.length * 2);
                    this.t = (S[]) ((u2[]) objArrCopyOf);
                    sArr = (S[]) ((u2[]) objArrCopyOf);
                }
                int i = this.v;
                do {
                    s = sArr[i];
                    if (s == null) {
                        s = (S) i();
                        sArr[i] = s;
                    }
                    i++;
                    if (i >= sArr.length) {
                        i = 0;
                    }
                } while (!s.a(this));
                this.v = i;
                this.u++;
                n4aVar = this.w;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (n4aVar != null) {
            n4aVar.y(1);
        }
        return s;
    }

    public abstract S i();

    public abstract u2[] j();

    public final void k(S s) {
        n4a n4aVar;
        int i;
        r02[] r02VarArrB;
        synchronized (this) {
            try {
                int i2 = this.u - 1;
                this.u = i2;
                n4aVar = this.w;
                if (i2 == 0) {
                    this.v = 0;
                }
                s.getClass();
                r02VarArrB = s.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (r02 r02Var : r02VarArrB) {
            if (r02Var != null) {
                r02Var.resumeWith(g2b.a);
            }
        }
        if (n4aVar != null) {
            n4aVar.y(-1);
        }
    }
}
