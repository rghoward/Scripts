package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kk7 extends ln4 {
    public int A;
    public Object[] B;
    public int C;
    public gk7[] x;
    public int y;
    public int[] z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class a {
        public int a;
        public int b;
        public int c;

        public a() {
        }

        public final int a(int i) {
            return kk7.this.z[this.b + i];
        }

        public final <T> T b(int i) {
            return (T) kk7.this.B[this.c + i];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public static final <T> void a(kk7 kk7Var, int i, T t) {
            kk7Var.B[(kk7Var.C - kk7Var.x[kk7Var.y - 1].b) + i] = t;
        }

        public static final <T, U> void b(kk7 kk7Var, int i, T t, int i2, U u) {
            int i3 = kk7Var.C - kk7Var.x[kk7Var.y - 1].b;
            Object[] objArr = kk7Var.B;
            objArr[i + i3] = t;
            objArr[i3 + i2] = u;
        }

        public static final void c(kk7 kk7Var, Object obj, Object obj2, Object obj3) {
            int i = kk7Var.C - kk7Var.x[kk7Var.y - 1].b;
            Object[] objArr = kk7Var.B;
            objArr[i] = obj;
            objArr[i + 1] = obj2;
            objArr[i + 2] = obj3;
        }
    }

    public kk7() {
        super(17);
        this.x = new gk7[16];
        this.z = new int[16];
        this.B = new Object[16];
    }

    public final void clear() {
        this.y = 0;
        this.A = 0;
        Arrays.fill(this.B, 0, this.C, (Object) null);
        this.C = 0;
    }

    public final void h1(p20<?> p20Var, cs9 cs9Var, hm8 hm8Var, hk7 hk7Var) {
        if (this.y != 0) {
            a aVar = new a();
            while (true) {
                kk7 kk7Var = kk7.this;
                gk7 gk7Var = kk7Var.x[aVar.a];
                final vi4 vi4VarB = gk7Var.b(aVar);
                p20<?> p20Var2 = p20Var;
                final cs9 cs9Var2 = cs9Var;
                hm8 hm8Var2 = hm8Var;
                final hk7 hk7Var2 = hk7Var;
                try {
                    gk7Var.a(aVar, p20Var2, cs9Var2, hm8Var2, hk7Var2);
                    int i = aVar.a;
                    int i2 = kk7Var.y;
                    if (i < i2) {
                        gk7 gk7Var2 = kk7Var.x[i];
                        aVar.b += gk7Var2.a;
                        aVar.c += gk7Var2.b;
                        int i3 = i + 1;
                        aVar.a = i3;
                        if (i3 >= i2) {
                            break;
                        }
                        p20Var = p20Var2;
                        cs9Var = cs9Var2;
                        hm8Var = hm8Var2;
                        hk7Var = hk7Var2;
                    } else {
                        break;
                    }
                } catch (Throwable th) {
                    if (hk7Var2 == null) {
                        throw th;
                    }
                    nt3.e(th, new mh4() { // from class: ik7
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            vi4 vi4Var = vi4VarB;
                            cs9 cs9Var3 = cs9Var2;
                            if (vi4Var != null) {
                                cs9Var3.a(cs9Var3.c(vi4Var) - cs9Var3.t);
                            }
                            List listA = zs1.a(cs9Var3, null, cs9Var3.t, null);
                            at1 at1Var = (at1) th1.H(listA);
                            Integer num = at1Var != null ? at1Var.c : null;
                            hk7 hk7Var3 = hk7Var2;
                            List<at1> listA2 = hk7Var3.a(num);
                            if (num != null && !listA2.isEmpty()) {
                                at1 at1Var2 = (at1) th1.y(listA2);
                                listA2 = th1.K(ws0.h(new at1(at1Var2.a, at1Var2.b, num)), th1.v(listA2));
                            }
                            return new xs1(th1.K(listA, listA2), hk7Var3.c());
                        }
                    });
                    throw th;
                }
            }
        }
        clear();
    }

    public final void i1(gk7 gk7Var) {
        int i = this.y;
        gk7[] gk7VarArr = this.x;
        if (i == gk7VarArr.length) {
            gk7[] gk7VarArr2 = new gk7[(i > 1024 ? 1024 : i) + i];
            System.arraycopy(gk7VarArr, 0, gk7VarArr2, 0, i);
            this.x = gk7VarArr2;
        }
        int i2 = this.A;
        int i3 = gk7Var.a;
        int i4 = gk7Var.b;
        int i5 = i2 + i3;
        int[] iArr = this.z;
        int length = iArr.length;
        if (i5 > length) {
            int i6 = (length > 1024 ? 1024 : length) + length;
            if (i6 >= i5) {
                i5 = i6;
            }
            int[] iArr2 = new int[i5];
            gz3.e(0, 0, length, iArr, iArr2);
            this.z = iArr2;
        }
        int i7 = this.C + i4;
        Object[] objArr = this.B;
        int length2 = objArr.length;
        if (i7 > length2) {
            int i8 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i8 >= i7) {
                i7 = i8;
            }
            Object[] objArr2 = new Object[i7];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.B = objArr2;
        }
        gk7[] gk7VarArr3 = this.x;
        int i9 = this.y;
        this.y = i9 + 1;
        gk7VarArr3[i9] = gk7Var;
        this.A += gk7Var.a;
        this.C += i4;
    }

    public final boolean isEmpty() {
        return this.y == 0;
    }
}
