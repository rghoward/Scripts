package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cs9 {
    public final zr9 a;
    public int[] b;
    public Object[] c;
    public ArrayList<vi4> d;
    public HashMap<vi4, gj4> e;
    public e27<f27> f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final mg5 p;
    public final mg5 q;
    public final mg5 r;
    public e27<t27<Object>> s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public d27 x;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public static List a(cs9 cs9Var, int i, cs9 cs9Var2, boolean z, boolean z2, boolean z3) {
            List list;
            List list2;
            boolean z4;
            List list3;
            int i2;
            vi4 vi4VarT;
            List list4;
            List list5;
            int iU = cs9Var.u(i);
            int i3 = i + iU;
            int iF = cs9Var.f(i);
            int iF2 = cs9Var.f(i3);
            int i4 = iF2 - iF;
            boolean z5 = i >= 0 && (cs9Var.b[(cs9Var.r(i) * 5) + 1] & 201326592) != 0;
            cs9Var2.w(iU);
            cs9Var2.x(i4, cs9Var2.t);
            if (cs9Var.g < i3) {
                cs9Var.B(i3);
            }
            if (cs9Var.k < iF2) {
                cs9Var.C(iF2, i3);
            }
            int[] iArr = cs9Var2.b;
            int i5 = cs9Var2.t;
            int i6 = i5 * 5;
            gz3.e(i6, i * 5, i3 * 5, cs9Var.b, iArr);
            Object[] objArr = cs9Var2.c;
            int i7 = cs9Var2.i;
            System.arraycopy(cs9Var.c, iF, objArr, i7, i4);
            int i8 = cs9Var2.v;
            iArr[i6 + 2] = i8;
            int i9 = i5 - i;
            int i10 = i5 + iU;
            int iG = i7 - cs9Var2.g(iArr, i5);
            int i11 = cs9Var2.m;
            int i12 = cs9Var2.l;
            int length = objArr.length;
            boolean z6 = z5;
            int i13 = i11;
            int i14 = i5;
            while (i14 < i10) {
                if (i14 != i5) {
                    int i15 = (i14 * 5) + 2;
                    iArr[i15] = iArr[i15] + i9;
                }
                int[] iArr2 = iArr;
                iArr2[(i14 * 5) + 4] = cs9.i(cs9Var2.g(iArr, i14) + iG, i13 < i14 ? 0 : cs9Var2.k, i12, length);
                if (i14 == i13) {
                    i13++;
                }
                i14++;
                i5 = i5;
                iArr = iArr2;
            }
            int[] iArr3 = iArr;
            cs9Var2.m = i13;
            int iB = bs9.b(cs9Var.d, i, cs9Var.p());
            int iB2 = bs9.b(cs9Var.d, i3, cs9Var.p());
            if (iB < iB2) {
                ArrayList<vi4> arrayList = cs9Var.d;
                ArrayList arrayList2 = new ArrayList(iB2 - iB);
                for (int i16 = iB; i16 < iB2; i16++) {
                    vi4 vi4Var = arrayList.get(i16);
                    vi4Var.a += i9;
                    arrayList2.add(vi4Var);
                }
                cs9Var2.d.addAll(bs9.b(cs9Var2.d, cs9Var2.t, cs9Var2.p()), arrayList2);
                arrayList.subList(iB, iB2).clear();
                list = arrayList2;
            } else {
                list = hf3.t;
            }
            if (!list.isEmpty()) {
                HashMap<vi4, gj4> map = cs9Var.e;
                HashMap<vi4, gj4> map2 = cs9Var2.e;
                if (map != null && map2 != null) {
                    int size = list.size();
                    for (int i17 = 0; i17 < size; i17++) {
                        vi4 vi4Var2 = (vi4) list.get(i17);
                        gj4 gj4Var = map.get(vi4Var2);
                        if (gj4Var != null) {
                            map.remove(vi4Var2);
                            map2.put(vi4Var2, gj4Var);
                        }
                    }
                }
            }
            int i18 = cs9Var2.v;
            gj4 gj4VarQ = cs9Var2.Q(i8);
            if (gj4VarQ != null) {
                int iA = i18 + 1;
                int i19 = cs9Var2.t;
                int i20 = -1;
                while (iA < i19) {
                    i20 = iA;
                    iA = bs9.a(cs9Var2.b, iA) + iA;
                }
                ArrayList<Object> arrayList3 = gj4VarQ.a;
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList<>();
                    gj4VarQ.a = arrayList3;
                }
                if (i20 >= 0 && (vi4VarT = cs9Var2.T(i20)) != null) {
                    int size2 = arrayList3.size();
                    int i21 = 0;
                    while (true) {
                        if (i21 >= size2) {
                            list4 = list;
                            list3 = list4;
                            i2 = -1;
                            break;
                        }
                        Object obj = arrayList3.get(i21);
                        if (xj5.a(obj, vi4VarT)) {
                            list4 = list;
                            list5 = list4;
                        } else {
                            list5 = list4;
                            if ((obj instanceof gj4) && ((gj4) obj).d(vi4VarT)) {
                                list4 = list;
                            } else {
                                list4 = list;
                                i21++;
                                list4 = list5;
                            }
                        }
                        i2 = i21;
                        list3 = list5;
                        break;
                    }
                }
                list3 = list;
                i2 = 0;
                arrayList3.add(i2, cs9Var2.b(i19));
                list2 = list3;
            } else {
                list2 = list;
            }
            int iG2 = cs9Var.G(cs9Var.b, i);
            if (!z3) {
                z4 = false;
            } else if (z) {
                boolean z7 = iG2 >= 0;
                if (z7) {
                    cs9Var.R();
                    cs9Var.a(iG2 - cs9Var.t);
                    cs9Var.R();
                }
                cs9Var.a(i - cs9Var.t);
                boolean zJ = cs9Var.J();
                if (z7) {
                    cs9Var.O();
                    cs9Var.j();
                    cs9Var.O();
                    cs9Var.j();
                }
                z4 = zJ;
            } else {
                boolean zK = cs9Var.K(i, iU);
                cs9Var.L(iF, i4, i - 1);
                z4 = zK;
            }
            if (z4) {
                pt1.a("Unexpectedly removed anchors");
            }
            int i22 = cs9Var2.o;
            int i23 = iArr3[i6 + 1];
            cs9Var2.o = i22 + ((1073741824 & i23) != 0 ? 1 : i23 & 67108863);
            if (z2) {
                cs9Var2.t = i10;
                cs9Var2.i = i7 + i4;
            }
            if (z6) {
                cs9Var2.W(i8);
            }
            return list2;
        }
    }

    public cs9(zr9 zr9Var) {
        this.a = zr9Var;
        int[] iArr = zr9Var.x;
        this.b = iArr;
        Object[] objArr = zr9Var.z;
        this.c = objArr;
        this.d = zr9Var.F;
        this.e = zr9Var.G;
        this.f = zr9Var.H;
        int i = zr9Var.y;
        this.g = i;
        this.h = (iArr.length / 5) - i;
        int i2 = zr9Var.A;
        this.k = i2;
        this.l = objArr.length - i2;
        this.m = i;
        this.p = new mg5();
        this.q = new mg5();
        this.r = new mg5();
        this.u = i;
        this.v = -1;
    }

    public static int i(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    public static void z(cs9 cs9Var) {
        int i = cs9Var.v;
        int iR = cs9Var.r(i);
        int[] iArr = cs9Var.b;
        int i2 = (iR * 5) + 1;
        int i3 = iArr[i2];
        if ((i3 & 134217728) != 0) {
            return;
        }
        int i4 = (i3 & (-134217729)) | 134217728;
        iArr[i2] = i4;
        if ((67108864 & i4) != 0) {
            return;
        }
        cs9Var.W(cs9Var.G(iArr, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A(zr9 zr9Var, int i) {
        if (this.n <= 0) {
            pt1.a("Check failed");
        }
        boolean z = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (i == 0 && this.t == 0 && this.a.y == 0) {
            int iA = bs9.a(zr9Var.x, i);
            int i2 = zr9Var.y;
            if (iA == i2) {
                int[] iArr = this.b;
                Object[] objArr3 = this.c;
                ArrayList<vi4> arrayList = this.d;
                HashMap<vi4, gj4> map = this.e;
                e27<f27> e27Var = this.f;
                int[] iArr2 = zr9Var.x;
                Object[] objArr4 = zr9Var.z;
                int i3 = zr9Var.A;
                HashMap<vi4, gj4> map2 = zr9Var.G;
                e27<f27> e27Var2 = zr9Var.H;
                this.b = iArr2;
                this.c = objArr4;
                this.d = zr9Var.F;
                this.g = i2;
                this.h = (iArr2.length / 5) - i2;
                this.k = i3;
                this.l = objArr4.length - i3;
                this.m = i2;
                this.e = map2;
                this.f = e27Var2;
                zr9Var.x = iArr;
                zr9Var.y = objArr2 == true ? 1 : 0;
                zr9Var.z = objArr3;
                zr9Var.A = objArr == true ? 1 : 0;
                zr9Var.F = arrayList;
                zr9Var.G = map;
                zr9Var.H = e27Var;
                return;
            }
        }
        cs9 cs9VarM1 = zr9Var.m1();
        try {
            a.a(cs9VarM1, i, this, true, true, false);
            boolean z2 = true;
        } finally {
            cs9VarM1.e(z);
        }
    }

    public final void B(int i) {
        vi4 vi4Var;
        int i2;
        vi4 vi4Var2;
        int i3;
        int i4;
        int i5 = this.h;
        int i6 = this.g;
        if (i6 != i) {
            if (!this.d.isEmpty()) {
                int iO = o() - this.h;
                ArrayList<vi4> arrayList = this.d;
                if (i6 < i) {
                    for (int iB = bs9.b(arrayList, i6, iO); iB < this.d.size() && (i3 = (vi4Var2 = this.d.get(iB)).a) < 0 && (i4 = i3 + iO) < i; iB++) {
                        vi4Var2.a = i4;
                    }
                } else {
                    for (int iB2 = bs9.b(arrayList, i, iO); iB2 < this.d.size() && (i2 = (vi4Var = this.d.get(iB2)).a) >= 0; iB2++) {
                        vi4Var.a = -(iO - i2);
                    }
                }
            }
            if (i5 > 0) {
                int[] iArr = this.b;
                int i7 = i * 5;
                int i8 = i5 * 5;
                int i9 = i6 * 5;
                if (i < i6) {
                    gz3.e(i8 + i7, i7, i9, iArr, iArr);
                } else {
                    gz3.e(i9, i9 + i8, i7 + i8, iArr, iArr);
                }
            }
            if (i < i6) {
                i6 = i + i5;
            }
            int iO2 = o();
            if (i6 >= iO2) {
                pt1.a("Check failed");
            }
            while (i6 < iO2) {
                int i10 = (i6 * 5) + 2;
                int i11 = this.b[i10];
                int iP = i11 > -2 ? i11 : (p() + i11) - (-2);
                if (iP >= i) {
                    iP = -((p() - iP) - (-2));
                }
                if (iP != i11) {
                    this.b[i10] = iP;
                }
                i6++;
                if (i6 == i) {
                    i6 += i5;
                }
            }
        }
        this.g = i;
    }

    public final void C(int i, int i2) {
        int i3 = this.l;
        int i4 = this.k;
        int i5 = this.m;
        if (i4 != i) {
            Object[] objArr = this.c;
            if (i < i4) {
                System.arraycopy(objArr, i, objArr, i + i3, i4 - i);
            } else {
                int i6 = i4 + i3;
                System.arraycopy(objArr, i6, objArr, i4, (i + i3) - i6);
            }
        }
        int iMin = Math.min(i2 + 1, p());
        if (i5 != iMin) {
            int length = this.c.length - i3;
            if (iMin < i5) {
                int iR = r(iMin);
                int iR2 = r(i5);
                int i7 = this.g;
                while (iR < iR2) {
                    int i8 = (iR * 5) + 4;
                    int i9 = this.b[i8];
                    if (!(i9 >= 0)) {
                        pt1.a("Unexpected anchor value, expected a positive anchor");
                    }
                    this.b[i8] = -((length - i9) + 1);
                    iR++;
                    if (iR == i7) {
                        iR += this.h;
                    }
                }
            } else {
                int iR3 = r(i5);
                int iR4 = r(iMin);
                while (iR3 < iR4) {
                    int i10 = (iR3 * 5) + 4;
                    int i11 = this.b[i10];
                    if (!(i11 < 0)) {
                        pt1.a("Unexpected anchor value, expected a negative anchor");
                    }
                    this.b[i10] = i11 + length + 1;
                    iR3++;
                    if (iR3 == this.g) {
                        iR3 += this.h;
                    }
                }
            }
            this.m = iMin;
        }
        this.k = i;
    }

    public final List D(vi4 vi4Var, cs9 cs9Var) {
        if (cs9Var.n <= 0) {
            pt1.a("Check failed");
        }
        if (this.n != 0) {
            pt1.a("Check failed");
        }
        if (!vi4Var.a()) {
            pt1.a("Check failed");
        }
        int iC = c(vi4Var) + 1;
        int i = this.t;
        if (i > iC || iC >= this.u) {
            pt1.a("Check failed");
        }
        int iG = G(this.b, iC);
        int iU = u(iC);
        int iF = y(iC) ? 1 : F(iC);
        List listA = a.a(this, iC, cs9Var, false, false, true);
        W(iG);
        boolean z = iF > 0;
        while (iG >= i) {
            int iR = r(iG);
            int[] iArr = this.b;
            int i2 = iR * 5;
            iArr[i2 + 3] = bs9.a(iArr, iR) - iU;
            if (z) {
                int[] iArr2 = this.b;
                int i3 = iArr2[i2 + 1];
                if ((1073741824 & i3) != 0) {
                    z = false;
                } else {
                    bs9.d(iR, (i3 & 67108863) - iF, iArr2);
                }
            }
            iG = G(this.b, iG);
        }
        if (z) {
            if (this.o < iF) {
                pt1.a("Check failed");
            }
            this.o -= iF;
        }
        return listA;
    }

    public final Object E(int i) {
        int iR = r(i);
        int[] iArr = this.b;
        if ((iArr[(iR * 5) + 1] & 1073741824) != 0) {
            return this.c[h(g(iArr, iR))];
        }
        return null;
    }

    public final int F(int i) {
        return this.b[(r(i) * 5) + 1] & 67108863;
    }

    public final int G(int[] iArr, int i) {
        int i2 = iArr[(r(i) * 5) + 2];
        return i2 > -2 ? i2 : (p() + i2) - (-2);
    }

    public final Object H(Object obj) {
        if (this.n > 0) {
            x(1, this.v);
        }
        Object[] objArr = this.c;
        int i = this.i;
        this.i = i + 1;
        Object obj2 = objArr[h(i)];
        if (this.i > this.j) {
            pt1.a("Writing to an invalid slot");
        }
        this.c[h(this.i - 1)] = obj;
        return obj2;
    }

    public final void I() {
        int i;
        d27 d27Var = this.x;
        if (d27Var != null) {
            while (d27Var.b != 0) {
                int iB = wn2.b(d27Var);
                int iR = r(iB);
                int iU = iB + 1;
                int iU2 = u(iB) + iB;
                while (true) {
                    if (iU >= iU2) {
                        i = 0;
                        break;
                    } else {
                        if ((this.b[(r(iU) * 5) + 1] & 201326592) != 0) {
                            i = 1;
                            break;
                        }
                        iU += u(iU);
                    }
                }
                int[] iArr = this.b;
                int i2 = (iR * 5) + 1;
                int i3 = iArr[i2];
                if (((67108864 & i3) != 0 ? 1 : 0) != i) {
                    iArr[i2] = (i << 26) | ((-67108865) & i3);
                    int iG = G(iArr, iB);
                    if (iG >= 0) {
                        wn2.a(d27Var, iG);
                    }
                }
            }
        }
    }

    public final boolean J() {
        vi4 vi4VarT;
        if (!(this.n == 0)) {
            pt1.a("Cannot remove group while inserting");
        }
        int i = this.t;
        int i2 = this.i;
        int iG = g(this.b, r(i));
        int iN = N();
        gj4 gj4VarQ = Q(this.v);
        if (gj4VarQ != null && (vi4VarT = T(i)) != null) {
            gj4VarQ.f(vi4VarT);
        }
        d27 d27Var = this.x;
        if (d27Var != null) {
            while (true) {
                int i3 = d27Var.b;
                if (i3 == 0) {
                    break;
                }
                if (i3 == 0) {
                    px1.b("IntList is empty.");
                    return false;
                }
                if (d27Var.a[0] < i) {
                    break;
                }
                wn2.b(d27Var);
            }
        }
        boolean zK = K(i, this.t - i);
        L(iG, this.i - iG, i - 1);
        this.t = i;
        this.i = i2;
        this.o -= iN;
        return zK;
    }

    public final boolean K(int i, int i2) {
        boolean z = false;
        if (i2 > 0) {
            ArrayList<vi4> arrayList = this.d;
            B(i);
            if (!arrayList.isEmpty()) {
                HashMap<vi4, gj4> map = this.e;
                int i3 = i + i2;
                int iB = bs9.b(this.d, i3, o() - this.h);
                if (iB >= this.d.size()) {
                    iB--;
                }
                int i4 = iB + 1;
                int i5 = 0;
                while (iB >= 0) {
                    vi4 vi4Var = this.d.get(iB);
                    int iC = c(vi4Var);
                    if (iC < i) {
                        break;
                    }
                    if (iC < i3) {
                        vi4Var.a = Integer.MIN_VALUE;
                        if (map != null) {
                            map.remove(vi4Var);
                        }
                        if (i5 == 0) {
                            i5 = iB + 1;
                        }
                        i4 = iB;
                    }
                    iB--;
                }
                z = i4 < i5;
                if (z) {
                    this.d.subList(i4, i5).clear();
                }
            }
            this.g = i;
            this.h += i2;
            int i6 = this.m;
            if (i6 > i) {
                this.m = Math.max(i, i6 - i2);
            }
            int i7 = this.u;
            if (i7 >= this.g) {
                this.u = i7 - i2;
            }
            int i8 = this.v;
            if (i8 >= 0 && (this.b[(r(i8) * 5) + 1] & 67108864) != 0) {
                W(i8);
            }
        }
        return z;
    }

    public final void L(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.l;
            int i5 = i + i2;
            C(i5, i3);
            this.k = i;
            this.l = i4 + i2;
            gz3.m(i, i5, null, this.c);
            int i6 = this.j;
            if (i6 >= i) {
                this.j = i6 - i2;
            }
        }
    }

    public final Object M(int i, int i2, Object obj) {
        int iP = P(this.b, r(i));
        int iG = g(this.b, r(i + 1));
        int i3 = iP + i2;
        if (i3 < iP || i3 >= iG) {
            pt1.a("Write to an invalid slot index " + i2 + " for group " + i);
        }
        int iH = h(i3);
        Object[] objArr = this.c;
        Object obj2 = objArr[iH];
        objArr[iH] = obj;
        return obj2;
    }

    public final int N() {
        int iR = r(this.t);
        int iA = bs9.a(this.b, iR) + this.t;
        this.t = iA;
        this.i = g(this.b, r(iA));
        int i = this.b[(iR * 5) + 1];
        if ((1073741824 & i) != 0) {
            return 1;
        }
        return i & 67108863;
    }

    public final void O() {
        int i = this.u;
        this.t = i;
        this.i = g(this.b, r(i));
    }

    public final int P(int[] iArr, int i) {
        if (i >= o()) {
            return this.c.length - this.l;
        }
        int iC = bs9.c(iArr, i);
        return iC < 0 ? (this.c.length - this.l) + iC + 1 : iC;
    }

    public final gj4 Q(int i) {
        vi4 vi4VarT;
        HashMap<vi4, gj4> map = this.e;
        if (map == null || (vi4VarT = T(i)) == null) {
            return null;
        }
        return map.get(vi4VarT);
    }

    public final void R() {
        if (this.n != 0) {
            pt1.a("Key must be supplied when inserting");
        }
        jt1.a.C0187a c0187a = jt1.a.a;
        S(0, c0187a, false, c0187a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void S(int i, Object obj, boolean z, Object obj2) {
        int i2;
        gj4 gj4VarQ;
        int i3 = this.v;
        Object[] objArr = this.n > 0;
        this.r.c(this.o);
        jt1.a.C0187a c0187a = jt1.a.a;
        if (objArr == true) {
            int i4 = this.t;
            int iG = g(this.b, r(i4));
            w(1);
            this.i = iG;
            this.j = iG;
            int iR = r(i4);
            int i5 = obj != c0187a ? 1 : 0;
            int i6 = (z || obj2 == c0187a) ? 0 : 1;
            int i7 = i(iG, this.k, this.l, this.c.length);
            if (i7 >= 0 && this.m < i4) {
                i7 = -(((this.c.length - this.l) - i7) + 1);
            }
            int[] iArr = this.b;
            int i8 = this.v;
            int i9 = iR * 5;
            iArr[i9] = i;
            iArr[i9 + 1] = ((z ? 1 : 0) << 30) | (i5 << 29) | (i6 << 28);
            iArr[i9 + 2] = i8;
            iArr[i9 + 3] = 0;
            iArr[i9 + 4] = i7;
            int i10 = (z ? 1 : 0) + i5 + i6;
            if (i10 > 0) {
                x(i10, i4);
                Object[] objArr2 = this.c;
                int i11 = this.i;
                if (z) {
                    objArr2[i11] = obj2;
                    i11++;
                }
                if (i5 != 0) {
                    objArr2[i11] = obj;
                    i11++;
                }
                if (i6 != 0) {
                    objArr2[i11] = obj2;
                    i11++;
                }
                this.i = i11;
            }
            this.o = 0;
            i2 = i4 + 1;
            this.v = i4;
            this.t = i2;
            if (i3 >= 0 && (gj4VarQ = Q(i3)) != null) {
                gj4 gj4VarE = gj4VarQ.e();
                vi4 vi4VarB = b(i4);
                ArrayList<Object> arrayList = gj4VarE.a;
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                gj4VarE.a = arrayList;
                arrayList.add(vi4VarB);
            }
        } else {
            this.p.c(i3);
            this.q.c((o() - this.h) - this.u);
            int i12 = this.t;
            int iR2 = r(i12);
            if (!xj5.a(obj2, c0187a)) {
                if (z) {
                    X(this.t, obj2);
                } else {
                    V(obj2);
                }
            }
            this.i = P(this.b, iR2);
            this.j = g(this.b, r(this.t + 1));
            int[] iArr2 = this.b;
            int i13 = iR2 * 5;
            this.o = iArr2[i13 + 1] & 67108863;
            this.v = i12;
            this.t = i12 + 1;
            i2 = i12 + iArr2[i13 + 3];
        }
        this.u = i2;
    }

    public final vi4 T(int i) {
        ArrayList<vi4> arrayList;
        int iF;
        if (i < 0 || i >= p() || (iF = bs9.f((arrayList = this.d), i, p())) < 0) {
            return null;
        }
        return arrayList.get(iF);
    }

    public final void U(Object obj) {
        if (this.n <= 0 || this.i == this.k) {
            H(obj);
            return;
        }
        e27<t27<Object>> e27Var = this.s;
        if (e27Var == null) {
            e27Var = new e27<>();
        }
        this.s = e27Var;
        int i = this.v;
        t27<Object> t27VarB = e27Var.b(i);
        if (t27VarB == null) {
            t27VarB = new t27<>((Object) null);
            e27Var.i(i, t27VarB);
        }
        t27VarB.g(obj);
    }

    public final void V(Object obj) {
        int iR = r(this.t);
        int i = (iR * 5) + 1;
        if ((this.b[i] & 268435456) == 0) {
            pt1.a("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.c;
        int[] iArr = this.b;
        objArr[h(Integer.bitCount(iArr[i] >> 29) + g(iArr, iR))] = obj;
    }

    public final void W(int i) {
        if (i >= 0) {
            d27 d27Var = this.x;
            if (d27Var == null) {
                d27Var = new d27();
                this.x = d27Var;
            }
            wn2.a(d27Var, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final void X(int i, Object obj) {
        boolean z;
        int iR = r(i);
        int[] iArr = this.b;
        if (iR < iArr.length) {
            z = (iArr[(iR * 5) + 1] & 1073741824) != 0;
        }
        if (!z) {
            pt1.a("Updating the node of a group at " + i + " that was not created with as a node group");
        }
        this.c[h(g(this.b, iR))] = obj;
    }

    public final void a(int i) {
        boolean z = false;
        if (!(i >= 0)) {
            pt1.a("Cannot seek backwards");
        }
        if (!(this.n <= 0)) {
            c78.b("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.t + i;
        if (i2 >= this.v && i2 <= this.u) {
            z = true;
        }
        if (!z) {
            pt1.a("Cannot seek outside the current group (" + this.v + '-' + this.u + ')');
        }
        this.t = i2;
        int iG = g(this.b, r(i2));
        this.i = iG;
        this.j = iG;
    }

    public final vi4 b(int i) {
        ArrayList<vi4> arrayList = this.d;
        int iF = bs9.f(arrayList, i, p());
        if (iF >= 0) {
            return arrayList.get(iF);
        }
        if (i > this.g) {
            i = -(p() - i);
        }
        vi4 vi4Var = new vi4(i);
        arrayList.add(-(iF + 1), vi4Var);
        return vi4Var;
    }

    public final int c(vi4 vi4Var) {
        int i = vi4Var.a;
        return i < 0 ? p() + i : i;
    }

    public final void d() {
        int i = this.n;
        this.n = i + 1;
        if (i == 0) {
            this.q.c((o() - this.h) - this.u);
        }
    }

    public final void e(boolean z) {
        this.w = true;
        if (z && this.p.b == 0) {
            B(p());
            C(this.c.length - this.l, this.g);
            int i = this.k;
            gz3.m(i, this.l + i, null, this.c);
            I();
        }
        int[] iArr = this.b;
        int i2 = this.g;
        Object[] objArr = this.c;
        int i3 = this.k;
        ArrayList<vi4> arrayList = this.d;
        HashMap<vi4, gj4> map = this.e;
        e27<f27> e27Var = this.f;
        zr9 zr9Var = this.a;
        if (!zr9Var.D) {
            c78.a("Unexpected writer close()");
        }
        zr9Var.D = false;
        zr9Var.x = iArr;
        zr9Var.y = i2;
        zr9Var.z = objArr;
        zr9Var.A = i3;
        zr9Var.F = arrayList;
        zr9Var.G = map;
        zr9Var.H = e27Var;
    }

    public final int f(int i) {
        return g(this.b, r(i));
    }

    public final int g(int[] iArr, int i) {
        if (i >= o()) {
            return this.c.length - this.l;
        }
        int i2 = iArr[(i * 5) + 4];
        return i2 < 0 ? (this.c.length - this.l) + i2 + 1 : i2;
    }

    public final int h(int i) {
        return (this.l * (i < this.k ? 0 : 1)) + i;
    }

    public final void j() {
        t27<Object> t27VarB;
        boolean z = this.n > 0;
        int i = this.t;
        int i2 = this.u;
        int i3 = this.v;
        int iR = r(i3);
        int i4 = this.o;
        int i5 = i - i3;
        int i6 = iR * 5;
        int i7 = i6 + 1;
        boolean z2 = (this.b[i7] & 1073741824) != 0;
        mg5 mg5Var = this.r;
        if (z) {
            e27<t27<Object>> e27Var = this.s;
            if (e27Var != null && (t27VarB = e27Var.b(i3)) != null) {
                Object[] objArr = t27VarB.a;
                int i8 = t27VarB.b;
                for (int i9 = 0; i9 < i8; i9++) {
                    H(objArr[i9]);
                }
                e27Var.g(i3);
            }
            int[] iArr = this.b;
            iArr[i6 + 3] = i5;
            bs9.d(iR, i4, iArr);
            int iB = mg5Var.b();
            if (z2) {
                i4 = 1;
            }
            this.o = iB + i4;
            int iG = G(this.b, i3);
            this.v = iG;
            int iP = iG < 0 ? p() : r(iG + 1);
            int iG2 = iP >= 0 ? g(this.b, iP) : 0;
            this.i = iG2;
            this.j = iG2;
            return;
        }
        if (i != i2) {
            pt1.a("Expected to be at the end of a group");
        }
        int iA = bs9.a(this.b, iR);
        int[] iArr2 = this.b;
        int i10 = iArr2[i7] & 67108863;
        iArr2[i6 + 3] = i5;
        bs9.d(iR, i4, iArr2);
        int iB2 = this.p.b();
        this.u = (o() - this.h) - this.q.b();
        this.v = iB2;
        int iG3 = G(this.b, i3);
        int iB3 = mg5Var.b();
        this.o = iB3;
        if (iG3 == iB2) {
            this.o = iB3 + (z2 ? 0 : i4 - i10);
            return;
        }
        int i11 = i5 - iA;
        int i12 = z2 ? 0 : i4 - i10;
        if (i11 != 0 || i12 != 0) {
            while (iG3 != 0 && iG3 != iB2 && (i12 != 0 || i11 != 0)) {
                int iR2 = r(iG3);
                if (i11 != 0) {
                    this.b[(iR2 * 5) + 3] = bs9.a(this.b, iR2) + i11;
                }
                if (i12 != 0) {
                    int[] iArr3 = this.b;
                    bs9.d(iR2, (iArr3[(iR2 * 5) + 1] & 67108863) + i12, iArr3);
                }
                int[] iArr4 = this.b;
                if ((iArr4[(iR2 * 5) + 1] & 1073741824) != 0) {
                    i12 = 0;
                }
                iG3 = G(iArr4, iG3);
            }
        }
        this.o += i12;
    }

    public final void k() {
        if (this.n <= 0) {
            c78.b("Unbalanced begin/end insert");
        }
        int i = this.n - 1;
        this.n = i;
        if (i == 0) {
            if (this.r.b != this.p.b) {
                pt1.a("startGroup/endGroup mismatch while inserting");
            }
            this.u = (o() - this.h) - this.q.b();
        }
    }

    public final void l(int i) {
        boolean z = false;
        if (!(this.n <= 0)) {
            pt1.a("Cannot call ensureStarted() while inserting");
        }
        int i2 = this.v;
        if (i2 != i) {
            if (i >= i2 && i < this.u) {
                z = true;
            }
            if (!z) {
                pt1.a("Started group at " + i + " must be a subgroup of the group at " + i2);
            }
            int i3 = this.t;
            int i4 = this.i;
            int i5 = this.j;
            this.t = i;
            R();
            this.t = i3;
            this.i = i4;
            this.j = i5;
        }
    }

    public final void m(int i, int i2, int i3) {
        if (i >= this.g) {
            i = -((p() - i) + 2);
        }
        while (i3 < i2) {
            this.b[(r(i3) * 5) + 2] = i;
            int iA = bs9.a(this.b, r(i3)) + i3;
            m(i3, iA, i3 + 1);
            i3 = iA;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008f  */
    public final void n(int i, ci4<? super Integer, Object, g2b> ci4Var) {
        int i2;
        int i3;
        int i4;
        int iG = G(this.b, i);
        int iP = p();
        int iU = u(i) + i;
        int i5 = i;
        f27 f27VarA = null;
        d27 d27Var = null;
        while (i5 < iU) {
            int iF = f(i5);
            int i6 = i5 + 1;
            int iF2 = f(i6);
            while (iF < iF2) {
                Object obj = this.c[h(iF)];
                if (obj instanceof jm8) {
                    jm8 jm8Var = (jm8) obj;
                    jj4 jj4Var = jm8Var instanceof jj4 ? (jj4) jm8Var : null;
                    if (jj4Var == null) {
                        pt1.b("Inconsistent composition");
                        fl.a();
                        return;
                    }
                    int i7 = jj4Var.b;
                    if (i7 >= 0) {
                        int iU2 = u(i5) + i5;
                        int iA = i6;
                        int i8 = 0;
                        while (iA < iU2 && i8 < i7) {
                            int i9 = iG;
                            int iR = r(iA);
                            int i10 = iU;
                            iA += bs9.a(this.b, iR);
                            if (iA < iU2 && (this.b[(iR * 5) + 1] & 536870912) == 0) {
                                i8++;
                            }
                            iG = i9;
                            iU = i10;
                        }
                        i3 = iG;
                        i4 = iU;
                        if (f27VarA == null) {
                            f27VarA = jg5.a();
                        }
                        if (d27Var == null) {
                            d27Var = new d27();
                        }
                        f27VarA.a(iA);
                        d27Var.c(iA);
                        d27Var.c(iF);
                    } else {
                        i3 = iG;
                        i4 = iU;
                        ci4Var.invoke(Integer.valueOf(iF), obj);
                    }
                } else {
                    i3 = iG;
                    i4 = iU;
                    ci4Var.invoke(Integer.valueOf(iF), obj);
                }
                iF++;
                iG = i3;
                iU = i4;
            }
            int i11 = iG;
            int i12 = iU;
            iG = i6 < iP ? G(this.b, i6) : -1;
            if (iG != i5) {
                int iG2 = i11;
                while (true) {
                    if (d27Var != null && f27VarA != null && f27VarA.g(i5)) {
                        int i13 = d27Var.b;
                        int i14 = i13 / 2;
                        int i15 = 0;
                        int i16 = 0;
                        while (i15 < i14) {
                            int i17 = i15 * 2;
                            int iA2 = d27Var.a(i17);
                            if (iA2 == i5) {
                                int iA3 = d27Var.a(i17 + 1);
                                ci4Var.invoke(Integer.valueOf(iA3), this.c[h(iA3)]);
                            } else if (i17 != i16) {
                                int i18 = i16 + 1;
                                d27Var.g(i16, iA2);
                                i16 += 2;
                                d27Var.g(i18, d27Var.a(i17 + 1));
                            } else {
                                i16 += 2;
                            }
                            i15++;
                            ci4Var = ci4Var;
                        }
                        if (i16 != i13) {
                            if (i16 < 0 || i16 > (i2 = d27Var.b) || i13 < 0 || i13 > i2) {
                                r.b("Index must be between 0 and size");
                                return;
                            }
                            if (i13 < i16) {
                                z90.a("The end index must be < start index");
                                return;
                            } else if (i13 != i16) {
                                if (i13 < i2) {
                                    int[] iArr = d27Var.a;
                                    gz3.e(i16, i13, i2, iArr, iArr);
                                }
                                d27Var.b -= i13 - i16;
                            }
                        }
                    }
                    if (i5 == i || iG2 == iG) {
                        break;
                    }
                    i5 = iG2;
                    iG2 = G(this.b, iG2);
                    ci4Var = ci4Var;
                }
            }
            i5 = i6;
            iU = i12;
        }
    }

    public final int o() {
        return this.b.length / 5;
    }

    public final int p() {
        return o() - this.h;
    }

    public final Object q(int i) {
        int iR = r(i);
        int[] iArr = this.b;
        int i2 = (iR * 5) + 1;
        if ((iArr[i2] & 268435456) == 0) {
            return jt1.a.a;
        }
        return this.c[Integer.bitCount(iArr[i2] >> 29) + g(iArr, iR)];
    }

    public final int r(int i) {
        return (this.h * (i < this.g ? 0 : 1)) + i;
    }

    public final int s(int i) {
        return this.b[r(i) * 5];
    }

    public final Object t(int i) {
        int iR = r(i);
        int[] iArr = this.b;
        int i2 = iR * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            return null;
        }
        return this.c[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
    }

    public final String toString() {
        return "SlotWriter(current = " + this.t + " end=" + this.u + " size = " + p() + " gap=" + this.g + '-' + (this.g + this.h) + ')';
    }

    public final int u(int i) {
        return bs9.a(this.b, r(i));
    }

    public final boolean v(int i, int i2) {
        int iO;
        int iU;
        if (i2 == this.v) {
            iO = this.u;
        } else {
            mg5 mg5Var = this.p;
            if (i2 > mg5Var.a(0)) {
                iU = u(i2);
            } else {
                int[] iArr = mg5Var.a;
                int iMin = Math.min(iArr.length, mg5Var.b);
                int i3 = 0;
                while (true) {
                    if (i3 >= iMin) {
                        i3 = -1;
                        break;
                    }
                    if (iArr[i3] == i2) {
                        break;
                    }
                    i3++;
                }
                if (i3 < 0) {
                    iU = u(i2);
                } else {
                    iO = (o() - this.h) - this.q.a[i3];
                }
            }
            iO = iU + i2;
        }
        return i > i2 && i < iO;
    }

    public final void w(int i) {
        if (i > 0) {
            int i2 = this.t;
            B(i2);
            int i3 = this.g;
            int i4 = this.h;
            int[] iArr = this.b;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
                int[] iArr2 = new int[iMax * 5];
                int i6 = iMax - i5;
                gz3.e(0, 0, i3 * 5, iArr, iArr2);
                gz3.e((i3 + i6) * 5, (i4 + i3) * 5, length * 5, iArr, iArr2);
                this.b = iArr2;
                i4 = i6;
            }
            int i7 = this.u;
            if (i7 >= i3) {
                this.u = i7 + i;
            }
            int i8 = i3 + i;
            this.g = i8;
            this.h = i4 - i;
            int i9 = i(i5 > 0 ? f(i2 + i) : 0, this.m >= i3 ? this.k : 0, this.l, this.c.length);
            for (int i10 = i3; i10 < i8; i10++) {
                this.b[(i10 * 5) + 4] = i9;
            }
            int i11 = this.m;
            if (i11 >= i3) {
                this.m = i11 + i;
            }
        }
    }

    public final void x(int i, int i2) {
        if (i > 0) {
            C(this.i, i2);
            int i3 = this.k;
            int i4 = this.l;
            if (i4 < i) {
                Object[] objArr = this.c;
                int length = objArr.length;
                int i5 = length - i4;
                int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i6 = 0; i6 < iMax; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = iMax - i5;
                int i8 = i4 + i3;
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                System.arraycopy(objArr, i8, objArr2, i3 + i7, length - i8);
                this.c = objArr2;
                i4 = i7;
            }
            int i9 = this.j;
            if (i9 >= i3) {
                this.j = i9 + i;
            }
            this.k = i3 + i;
            this.l = i4 - i;
        }
    }

    public final boolean y(int i) {
        return (this.b[(r(i) * 5) + 1] & 1073741824) != 0;
    }
}
