package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ha1<E> extends g99<ha1<E>> {
    public final /* synthetic */ AtomicReferenceArray A;
    public final zx0<E> z;

    public ha1(long j, ha1<E> ha1Var, zx0<E> zx0Var, int i) {
        super(j, ha1Var, i);
        this.z = zx0Var;
        this.A = new AtomicReferenceArray(dy0.b * 2);
    }

    @Override // defpackage.g99
    public final int l() {
        return dy0.b;
    }

    @Override // defpackage.g99
    public final void m(int i, h72 h72Var) {
        zx0<E> zx0Var;
        int i2 = dy0.b;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        this.A.get(i * 2);
        while (true) {
            Object objQ = q(i);
            boolean z2 = objQ instanceof vjb;
            zx0Var = this.z;
            if (z2 || (objQ instanceof wjb)) {
                if (p(i, objQ, z ? dy0.j : dy0.k)) {
                    s(i, null);
                    r(i, !z);
                    if (z) {
                        zx0Var.getClass();
                        return;
                    }
                    return;
                }
            } else {
                if (objQ == dy0.j || objQ == dy0.k) {
                    break;
                }
                if (objQ != dy0.g && objQ != dy0.f) {
                    if (objQ == dy0.i || objQ == dy0.d || objQ == dy0.l) {
                        return;
                    }
                    tn2.d(objQ, "unexpected state: ");
                    return;
                }
            }
        }
        s(i, null);
        if (z) {
            zx0Var.getClass();
        }
    }

    public final boolean p(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.A;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    public final Object q(int i) {
        return this.A.get((i * 2) + 1);
    }

    public final void r(int i, boolean z) {
        if (z) {
            zx0<E> zx0Var = this.z;
            zx0Var.getClass();
            zx0Var.U((this.x * ((long) dy0.b)) + ((long) i));
        }
        n();
    }

    public final void s(int i, Object obj) {
        this.A.set(i * 2, obj);
    }

    public final void t(int i, Object obj) {
        this.A.set((i * 2) + 1, obj);
    }
}
