package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class we6<E> implements Cloneable {
    public /* synthetic */ boolean t;
    public /* synthetic */ long[] u;
    public /* synthetic */ Object[] v;
    public /* synthetic */ int w;

    public we6(int i) {
        if (i == 0) {
            this.u = ty1.b;
            this.v = ty1.c;
            return;
        }
        int i2 = i * 8;
        for (int i3 = 4; i3 < 32; i3++) {
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
        }
        int i5 = i2 / 8;
        this.u = new long[i5];
        this.v = new Object[i5];
    }

    public final void a() {
        int i = this.w;
        Object[] objArr = this.v;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.w = 0;
        this.t = false;
    }

    public final E b(long j) {
        E e;
        int iE = ty1.e(this.u, this.w, j);
        if (iE < 0 || (e = (E) this.v[iE]) == i03.B) {
            return null;
        }
        return e;
    }

    public final int c(long j) {
        if (this.t) {
            int i = this.w;
            long[] jArr = this.u;
            Object[] objArr = this.v;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != i03.B) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.t = false;
            this.w = i2;
        }
        return ty1.e(this.u, this.w, j);
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        we6 we6Var = (we6) objClone;
        we6Var.u = (long[]) this.u.clone();
        we6Var.v = (Object[]) this.v.clone();
        return we6Var;
    }

    public final boolean d() {
        return h() == 0;
    }

    public final long e(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.w)) {
            z90.a(pp2.a(i, "Expected index to be within 0..size()-1, but was "));
            return 0L;
        }
        if (this.t) {
            long[] jArr = this.u;
            Object[] objArr = this.v;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != i03.B) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.t = false;
            this.w = i3;
        }
        return this.u[i];
    }

    public final void f(long j, E e) {
        Object obj = i03.B;
        int iE = ty1.e(this.u, this.w, j);
        if (iE >= 0) {
            this.v[iE] = e;
            return;
        }
        int i = ~iE;
        int i2 = this.w;
        if (i < i2) {
            Object[] objArr = this.v;
            if (objArr[i] == obj) {
                this.u[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.t) {
            long[] jArr = this.u;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.v;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj2 = objArr2[i4];
                    if (obj2 != obj) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj2;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.t = false;
                this.w = i3;
                i = ~ty1.e(this.u, i3, j);
            }
        }
        int i5 = this.w;
        if (i5 >= this.u.length) {
            int i6 = (i5 + 1) * 8;
            for (int i7 = 4; i7 < 32; i7++) {
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
            }
            int i9 = i6 / 8;
            this.u = Arrays.copyOf(this.u, i9);
            this.v = Arrays.copyOf(this.v, i9);
        }
        int i10 = this.w;
        if (i10 - i != 0) {
            long[] jArr2 = this.u;
            int i11 = i + 1;
            gz3.g(jArr2, jArr2, i11, i, i10);
            Object[] objArr3 = this.v;
            gz3.f(i11, i, this.w, objArr3, objArr3);
        }
        this.u[i] = j;
        this.v[i] = e;
        this.w++;
    }

    public final void g(long j) {
        int iE = ty1.e(this.u, this.w, j);
        if (iE >= 0) {
            Object[] objArr = this.v;
            Object obj = objArr[iE];
            Object obj2 = i03.B;
            if (obj != obj2) {
                objArr[iE] = obj2;
                this.t = true;
            }
        }
    }

    public final int h() {
        if (this.t) {
            int i = this.w;
            long[] jArr = this.u;
            Object[] objArr = this.v;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != i03.B) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.t = false;
            this.w = i2;
        }
        return this.w;
    }

    public final E i(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.w)) {
            z90.a(pp2.a(i, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        if (this.t) {
            long[] jArr = this.u;
            Object[] objArr = this.v;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != i03.B) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.t = false;
            this.w = i3;
        }
        return (E) this.v[i];
    }

    public final String toString() {
        if (h() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.w * 28);
        sb.append('{');
        int i = this.w;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(e(i2));
            sb.append('=');
            E eI = i(i2);
            if (eI != sb) {
                sb.append(eI);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public we6() {
        this((Object) null);
    }

    public /* synthetic */ we6(Object obj) {
        this(10);
    }
}
