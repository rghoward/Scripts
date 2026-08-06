package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fx9<E> implements Cloneable {
    public /* synthetic */ boolean t;
    public /* synthetic */ int[] u;
    public /* synthetic */ Object[] v;
    public /* synthetic */ int w;

    public fx9(int i) {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 40;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (40 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.u = new int[i5];
        this.v = new Object[i5];
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fx9<E> clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        fx9<E> fx9Var = (fx9) objClone;
        fx9Var.u = (int[]) this.u.clone();
        fx9Var.v = (Object[]) this.v.clone();
        return fx9Var;
    }

    public final boolean b(int i) {
        if (this.t) {
            zb9.b(this);
        }
        return ty1.d(this.w, i, this.u) >= 0;
    }

    public final E c(int i) {
        E e;
        int iD = ty1.d(this.w, i, this.u);
        if (iD < 0 || (e = (E) this.v[iD]) == zb9.u) {
            return null;
        }
        return e;
    }

    public final int d(int i) {
        if (this.t) {
            zb9.b(this);
        }
        return this.u[i];
    }

    public final void e(int i, E e) {
        int iD = ty1.d(this.w, i, this.u);
        if (iD >= 0) {
            this.v[iD] = e;
            return;
        }
        int i2 = ~iD;
        int i3 = this.w;
        if (i2 < i3) {
            Object[] objArr = this.v;
            if (objArr[i2] == zb9.u) {
                this.u[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.t && i3 >= this.u.length) {
            zb9.b(this);
            i2 = ~ty1.d(this.w, i, this.u);
        }
        int i4 = this.w;
        if (i4 >= this.u.length) {
            int i5 = (i4 + 1) * 4;
            for (int i6 = 4; i6 < 32; i6++) {
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
            }
            int i8 = i5 / 4;
            this.u = Arrays.copyOf(this.u, i8);
            this.v = Arrays.copyOf(this.v, i8);
        }
        int i9 = this.w;
        if (i9 - i2 != 0) {
            int[] iArr = this.u;
            int i10 = i2 + 1;
            gz3.e(i10, i2, i9, iArr, iArr);
            Object[] objArr2 = this.v;
            gz3.f(i10, i2, this.w, objArr2, objArr2);
        }
        this.u[i2] = i;
        this.v[i2] = e;
        this.w++;
    }

    public final int f() {
        if (this.t) {
            zb9.b(this);
        }
        return this.w;
    }

    public final E g(int i) {
        if (this.t) {
            zb9.b(this);
        }
        Object[] objArr = this.v;
        if (i < objArr.length) {
            return (E) objArr[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        if (f() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.w * 28);
        sb.append('{');
        int i = this.w;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(d(i2));
            sb.append('=');
            E eG = g(i2);
            if (eG != this) {
                sb.append(eG);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public fx9() {
        this(0);
    }
}
