package defpackage;

import java.util.Arrays;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jx7<E> extends j2<E> {
    public final Object[] t;
    public final Object[] u;
    public final int v;
    public final int w;

    public jx7(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.t = objArr;
        this.u = objArr2;
        this.v = i;
        this.w = i2;
        if (!(d() > 32)) {
            c78.a("Trie-based persistent vector should have at least 33 elements, got " + d());
        }
        int length = objArr2.length;
    }

    public static Object[] p(Object[] objArr, int i, int i2, Object obj, pe7 pe7Var) {
        int iC = t2.c(i2, i);
        if (i == 0) {
            Object[] objArrCopyOf = iC == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            gz3.f(iC + 1, iC, 31, objArr, objArrCopyOf);
            pe7Var.a = objArr[31];
            objArrCopyOf[iC] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        Object obj2 = objArr[iC];
        obj2.getClass();
        objArrCopyOf2[iC] = p((Object[]) obj2, i3, i2, obj, pe7Var);
        while (true) {
            iC++;
            if (iC >= 32 || objArrCopyOf2[iC] == null) {
                break;
            }
            Object obj3 = objArr[iC];
            obj3.getClass();
            objArrCopyOf2[iC] = p((Object[]) obj3, i3, 0, pe7Var.a, pe7Var);
        }
        return objArrCopyOf2;
    }

    public static Object[] r(Object[] objArr, int i, int i2, pe7 pe7Var) {
        Object[] objArrR;
        int iC = t2.c(i2, i);
        if (i == 5) {
            pe7Var.a = objArr[iC];
            objArrR = null;
        } else {
            Object obj = objArr[iC];
            obj.getClass();
            objArrR = r((Object[]) obj, i - 5, i2, pe7Var);
        }
        if (objArrR == null && iC == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        objArrCopyOf[iC] = objArrR;
        return objArrCopyOf;
    }

    public static Object[] z(int i, int i2, Object obj, Object[] objArr) {
        int iC = t2.c(i2, i);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        if (i == 0) {
            objArrCopyOf[iC] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[iC];
        obj2.getClass();
        objArrCopyOf[iC] = z(i - 5, i2, obj, (Object[]) obj2);
        return objArrCopyOf;
    }

    @Override // defpackage.s0
    public final int d() {
        return this.v;
    }

    @Override // defpackage.j2
    public final j2 e(int i, E e) {
        int i2 = this.v;
        l96.b(i, i2);
        if (i == i2) {
            return f(e);
        }
        int iX = x();
        Object[] objArr = this.t;
        if (i >= iX) {
            return q(i - iX, e, objArr);
        }
        pe7 pe7Var = new pe7(null);
        return q(0, pe7Var.a, p(objArr, this.w, i, e, pe7Var));
    }

    @Override // defpackage.j2
    public final j2 f(E e) {
        int iX = x();
        int i = this.v;
        int i2 = i - iX;
        Object[] objArr = this.t;
        Object[] objArr2 = this.u;
        if (i2 < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            objArrCopyOf[i2] = e;
            return new jx7(objArr, objArrCopyOf, i + 1, this.w);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = e;
        return t(objArr, objArr2, objArr3);
    }

    @Override // java.util.List
    public final E get(int i) {
        Object[] objArr;
        l96.a(i, d());
        if (x() <= i) {
            objArr = this.u;
        } else {
            Object[] objArr2 = this.t;
            for (int i2 = this.w; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[t2.c(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return (E) objArr[i & 31];
    }

    @Override // defpackage.j2
    public final lx7 j() {
        return new lx7(this, this.t, this.u, this.w);
    }

    @Override // defpackage.j2
    public final j2 k(i2 i2Var) {
        lx7 lx7Var = new lx7(this, this.t, this.u, this.w);
        lx7Var.J(i2Var);
        return lx7Var.f();
    }

    @Override // defpackage.j2
    public final j2 l(int i) {
        l96.a(i, this.v);
        int iX = x();
        int i2 = this.w;
        Object[] objArr = this.t;
        return i >= iX ? w(objArr, iX, i2, i - iX) : w(v(objArr, i2, i, new pe7(this.u[0])), iX, i2, 0);
    }

    @Override // defpackage.m1, java.util.List
    public final ListIterator<E> listIterator(int i) {
        l96.b(i, this.v);
        return new mx7(i, this.v, (this.w / 5) + 1, this.t, this.u);
    }

    @Override // defpackage.j2
    public final j2 n(int i, E e) {
        int i2 = this.v;
        l96.a(i, i2);
        int iX = x();
        Object[] objArr = this.t;
        Object[] objArr2 = this.u;
        int i3 = this.w;
        if (iX > i) {
            return new jx7(z(i3, i, e, objArr), objArr2, i2, i3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        objArrCopyOf[i & 31] = e;
        return new jx7(objArr, objArrCopyOf, i2, i3);
    }

    public final jx7 q(int i, Object obj, Object[] objArr) {
        int iX = x();
        int i2 = this.v;
        int i3 = i2 - iX;
        Object[] objArr2 = this.u;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        if (i3 < 32) {
            gz3.f(i + 1, i, i3, objArr2, objArrCopyOf);
            objArrCopyOf[i] = obj;
            return new jx7(objArr, objArrCopyOf, i2 + 1, this.w);
        }
        Object obj2 = objArr2[31];
        gz3.f(i + 1, i, i3 - 1, objArr2, objArrCopyOf);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return t(objArr, objArrCopyOf, objArr3);
    }

    public final jx7<E> t(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.v;
        int i2 = i >> 5;
        int i3 = this.w;
        if (i2 <= (1 << i3)) {
            return new jx7<>(u(i3, objArr, objArr2), objArr3, i + 1, i3);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i4 = i3 + 5;
        return new jx7<>(u(i4, objArr4, objArr2), objArr3, i + 1, i4);
    }

    public final Object[] u(int i, Object[] objArr, Object[] objArr2) {
        int iC = t2.c(d() - 1, i);
        Object[] objArrCopyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i == 5) {
            objArrCopyOf[iC] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iC] = u(i - 5, (Object[]) objArrCopyOf[iC], objArr2);
        return objArrCopyOf;
    }

    public final Object[] v(Object[] objArr, int i, int i2, pe7 pe7Var) {
        int iC = t2.c(i2, i);
        if (i == 0) {
            Object[] objArrCopyOf = iC == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            gz3.f(iC, iC + 1, 32, objArr, objArrCopyOf);
            objArrCopyOf[31] = pe7Var.a;
            pe7Var.a = objArr[iC];
            return objArrCopyOf;
        }
        int iC2 = objArr[31] == null ? t2.c(x() - 1, i) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        int i4 = iC + 1;
        if (i4 <= iC2) {
            while (true) {
                Object obj = objArrCopyOf2[iC2];
                obj.getClass();
                objArrCopyOf2[iC2] = v((Object[]) obj, i3, 0, pe7Var);
                if (iC2 == i4) {
                    break;
                }
                iC2--;
            }
        }
        Object obj2 = objArrCopyOf2[iC];
        obj2.getClass();
        objArrCopyOf2[iC] = v((Object[]) obj2, i3, i2, pe7Var);
        return objArrCopyOf2;
    }

    public final j2 w(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.v - i;
        if (i4 != 1) {
            Object[] objArr2 = this.u;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            int i5 = i4 - 1;
            if (i3 < i5) {
                gz3.f(i3, i3 + 1, i4, objArr2, objArrCopyOf);
            }
            objArrCopyOf[i5] = null;
            return new jx7(objArr, objArrCopyOf, (i + i4) - 1, i2);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
            }
            return new es9(objArr);
        }
        pe7 pe7Var = new pe7(null);
        Object[] objArrR = r(objArr, i2, i - 1, pe7Var);
        objArrR.getClass();
        Object obj = pe7Var.a;
        obj.getClass();
        Object[] objArr3 = (Object[]) obj;
        if (objArrR[1] != null) {
            return new jx7(objArrR, objArr3, i, i2);
        }
        Object obj2 = objArrR[0];
        obj2.getClass();
        return new jx7((Object[]) obj2, objArr3, i, i2 - 5);
    }

    public final int x() {
        return (this.v - 1) & (-32);
    }
}
