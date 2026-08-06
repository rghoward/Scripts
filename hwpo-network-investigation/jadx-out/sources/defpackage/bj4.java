package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bj4 extends dj5 {
    public int A;
    public int B;
    public boolean C;
    public final cj4 D;
    public final ArrayList<xj8> E;
    public boolean F;
    public yr9 G;
    public zr9 H;
    public cs9 I;
    public boolean J;
    public kw7 K;
    public i81 L;
    public final lt1 M;
    public vi4 N;
    public o34 O;
    public yn9 P;
    public final du1 Q;
    public final h72 R;
    public boolean S;
    public long T;
    public fj4 U;
    public final j1b a;
    public final yt1 b;
    public final zr9 c;
    public final e37 d;
    public final i81 e;
    public final i81 f;
    public final ru1 g;
    public final gu1 h;
    public ij4 j;
    public int k;
    public int l;
    public int m;
    public int[] o;
    public c27 p;
    public boolean q;
    public boolean r;
    public e27<kw7> v;
    public boolean w;
    public boolean y;
    public final ArrayList<ij4> i = new ArrayList<>();
    public final mg5 n = new mg5();
    public final ArrayList s = new ArrayList();
    public final mg5 t = new mg5();
    public kw7 u = jw7.w;
    public final mg5 x = new mg5();
    public int z = -1;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class b extends yt1 {
        public final long a;
        public final boolean b;
        public final boolean c;
        public HashSet d;
        public final d37<bj4> e = a49.a();
        public final dt7 f = new dt7(jw7.w, jl8.u);

        public b(long j, boolean z, boolean z2, ru1 ru1Var) {
            this.a = j;
            this.b = z;
            this.c = z2;
        }

        @Override // defpackage.yt1
        public final void a(x02 x02Var, ci4<? super jt1, ? super Integer, g2b> ci4Var) {
            bj4.this.b.a(x02Var, ci4Var);
        }

        @Override // defpackage.yt1
        public final d37 b(x02 x02Var, yn9 yn9Var, ci4<? super jt1, ? super Integer, g2b> ci4Var) {
            return bj4.this.b.b(x02Var, yn9Var, ci4Var);
        }

        @Override // defpackage.yt1
        public final void c(mz6 mz6Var) {
            bj4.this.b.c(mz6Var);
        }

        @Override // defpackage.yt1
        public final void d() {
            bj4.this.A--;
        }

        @Override // defpackage.yt1
        public final boolean e() {
            return bj4.this.b.e();
        }

        @Override // defpackage.yt1
        public final boolean f() {
            return this.b;
        }

        @Override // defpackage.yt1
        public final boolean g() {
            return this.c;
        }

        @Override // defpackage.yt1
        public final long h() {
            return this.a;
        }

        @Override // defpackage.yt1
        public final xt1 i() {
            return bj4.this.h;
        }

        @Override // defpackage.yt1
        public final kw7 j() {
            return (kw7) this.f.getValue();
        }

        @Override // defpackage.yt1
        public final h72 k() {
            return bj4.this.b.k();
        }

        @Override // defpackage.yt1
        public final boolean l() {
            return bj4.this.b.l();
        }

        @Override // defpackage.yt1
        public final void m(x02 x02Var) {
            bj4 bj4Var = bj4.this;
            yt1 yt1Var = bj4Var.b;
            yt1Var.m(bj4Var.h);
            yt1Var.m(x02Var);
        }

        @Override // defpackage.yt1
        public final void n(mz6 mz6Var, lz6 lz6Var, p20<?> p20Var) {
            bj4.this.b.n(mz6Var, lz6Var, p20Var);
        }

        @Override // defpackage.yt1
        public final lz6 o(mz6 mz6Var) {
            return bj4.this.b.o(mz6Var);
        }

        @Override // defpackage.yt1
        public final d37 p(x02 x02Var, yn9 yn9Var, d37 d37Var) {
            return bj4.this.b.p(x02Var, yn9Var, d37Var);
        }

        @Override // defpackage.yt1
        public final void q(Set<au1> set) {
            HashSet hashSet = this.d;
            if (hashSet == null) {
                hashSet = new HashSet();
                this.d = hashSet;
            }
            hashSet.add(set);
        }

        @Override // defpackage.yt1
        public final void r(bj4 bj4Var) {
            this.e.a(bj4Var);
        }

        @Override // defpackage.yt1
        public final void s(xj8 xj8Var) {
            bj4.this.b.s(xj8Var);
        }

        @Override // defpackage.yt1
        public final void t(x02 x02Var) {
            bj4.this.b.t(x02Var);
        }

        @Override // defpackage.yt1
        public final i41 u(t76 t76Var) {
            return bj4.this.b.u(t76Var);
        }

        @Override // defpackage.yt1
        public final void v() {
            bj4.this.A++;
        }

        @Override // defpackage.yt1
        public final void w(bj4 bj4Var) {
            HashSet<Set> hashSet = this.d;
            if (hashSet != null) {
                for (Set set : hashSet) {
                    bj4Var.getClass();
                    set.remove(bj4Var.a0());
                }
            }
            if (bj4Var != null) {
                this.e.l(bj4Var);
            }
        }

        @Override // defpackage.yt1
        public final void x(gu1 gu1Var) {
            bj4.this.b.x(gu1Var);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0061 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:22:0x0063 A[LOOP:0: B:9:0x0017->B:22:0x0063, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:26:0x0066 A[EDGE_INSN: B:26:0x0066->B:23:0x0066 BREAK  A[LOOP:0: B:9:0x0017->B:22:0x0063], SYNTHETIC] */
        public final void y() {
            d37<bj4> d37Var = this.e;
            if (d37Var.h()) {
                HashSet hashSet = this.d;
                if (hashSet != null) {
                    Object[] objArr = d37Var.b;
                    long[] jArr = d37Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i = 0;
                        while (true) {
                            long j = jArr[i];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i != length) {
                                    break;
                                    break;
                                }
                                i++;
                            } else {
                                int i2 = 8 - ((~(i - length)) >>> 31);
                                for (int i3 = 0; i3 < i2; i3++) {
                                    if ((255 & j) < 128) {
                                        bj4 bj4Var = (bj4) objArr[(i << 3) + i3];
                                        Iterator it = hashSet.iterator();
                                        while (it.hasNext()) {
                                            ((Set) it.next()).remove(bj4Var.a0());
                                        }
                                    }
                                    j >>= 8;
                                }
                                if (i2 != 8) {
                                    break;
                                } else if (i != length) {
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        }
                    }
                }
                d37Var.b();
            }
        }
    }

    public bj4(j1b j1bVar, yt1 yt1Var, zr9 zr9Var, e37 e37Var, i81 i81Var, i81 i81Var2, ru1 ru1Var, gu1 gu1Var) {
        this.a = j1bVar;
        this.b = yt1Var;
        this.c = zr9Var;
        this.d = e37Var;
        this.e = i81Var;
        this.f = i81Var2;
        this.g = ru1Var;
        this.h = gu1Var;
        this.C = yt1Var.g() || yt1Var.e();
        this.D = new cj4(this);
        this.E = new ArrayList<>();
        yr9 yr9VarL1 = zr9Var.l1();
        yr9VarL1.c();
        this.G = yr9VarL1;
        zr9 zr9Var2 = new zr9();
        if (yt1Var.g()) {
            zr9Var2.i1();
        }
        if (yt1Var.e()) {
            zr9Var2.H = new e27<>();
        }
        this.H = zr9Var2;
        cs9 cs9VarM1 = zr9Var2.m1();
        cs9VarM1.e(true);
        this.I = cs9VarM1;
        this.M = new lt1(this, i81Var);
        yr9 yr9VarL2 = this.H.l1();
        try {
            vi4 vi4VarA = yr9VarL2.a(0);
            yr9VarL2.c();
            this.N = vi4VarA;
            this.O = new o34();
            this.Q = new du1(this);
            h72 h72VarK = yt1Var.k();
            h72 h72VarD0 = d0();
            this.R = h72VarK.c0(h72VarD0 == null ? ff3.t : h72VarD0);
        } catch (Throwable th) {
            yr9VarL2.c();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    public static final mz6 p0(bj4 bj4Var, int i) {
        ArrayList arrayList;
        int i2 = bj4Var.G.i(i);
        yr9 yr9Var = bj4Var.G;
        Object objP = yr9Var.p(yr9Var.b, i);
        if (i2 != 126665345 || !(objP instanceof kz6)) {
            return null;
        }
        if (bj4Var.G.d(i)) {
            ArrayList arrayList2 = new ArrayList();
            q0(bj4Var, arrayList2, i);
            if (arrayList2.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = arrayList2;
            }
        } else {
            arrayList = null;
        }
        yr9 yr9Var2 = bj4Var.G;
        Object objP2 = yr9Var2.p(yr9Var2.b, i);
        objP2.getClass();
        kz6 kz6Var = (kz6) objP2;
        Object objH = bj4Var.G.h(i, 0);
        vi4 vi4VarA = bj4Var.G.a(i);
        int iA = bs9.a(bj4Var.G.b, i) + i;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = bj4Var.s;
        int iD = ty.d(i, arrayList4);
        if (iD < 0) {
            iD = -(iD + 1);
        }
        while (iD < arrayList4.size()) {
            kk5 kk5Var = (kk5) arrayList4.get(iD);
            if (kk5Var.b >= iA) {
                break;
            }
            arrayList3.add(new js7(kk5Var.a, kk5Var.c));
            iD++;
        }
        return new mz6(kz6Var, objH, bj4Var.h, bj4Var.c, vi4VarA, arrayList3, bj4Var.Q(i), arrayList);
    }

    public static final void q0(bj4 bj4Var, ArrayList arrayList, int i) {
        int iA = bs9.a(bj4Var.G.b, i) + i;
        int iA2 = i + 1;
        while (iA2 < iA) {
            if (bj4Var.G.j(iA2)) {
                mz6 mz6VarP0 = p0(bj4Var, iA2);
                if (mz6VarP0 != null) {
                    arrayList.add(mz6VarP0);
                }
            } else if (bj4Var.G.d(iA2)) {
                q0(bj4Var, arrayList, iA2);
            }
            iA2 += bs9.a(bj4Var.G.b, iA2);
        }
    }

    public static final int r0(bj4 bj4Var, int i, int i2, boolean z, int i3) {
        int i4;
        long[] jArr;
        Object[] objArr;
        int i5;
        Object[] objArr2;
        int i6;
        yr9 yr9Var = bj4Var.G;
        int i7 = 0;
        if (yr9Var.j(i2)) {
            int i8 = yr9Var.i(i2);
            Object objP = yr9Var.p(yr9Var.b, i2);
            if (i8 == 126665345 && (objP instanceof kz6)) {
                mz6 mz6VarP0 = p0(bj4Var, i2);
                if (mz6VarP0 != null) {
                    bj4Var.b.c(mz6VarP0);
                    bj4Var.M.e();
                    lt1 lt1Var = bj4Var.M;
                    gu1 gu1Var = bj4Var.h;
                    yt1 yt1Var = bj4Var.b;
                    kk7 kk7Var = lt1Var.b.x;
                    kk7Var.i1(gk7.u.c);
                    kk7.b.c(kk7Var, gu1Var, yt1Var, mz6VarP0);
                }
                if (!z || i2 == i) {
                    return yr9Var.o(i2);
                }
                lt1 lt1Var2 = bj4Var.M;
                lt1Var2.c();
                lt1Var2.b();
                bj4 bj4Var2 = lt1Var2.a;
                int iO = bj4Var2.G.l(i2) ? 1 : bj4Var2.G.o(i2);
                if (iO > 0) {
                    lt1Var2.f(i3, iO);
                }
                return 0;
            }
            if (i8 == 206 && xj5.a(objP, pt1.e)) {
                Object objH = yr9Var.h(i2, 0);
                jm8 jm8Var = objH instanceof jm8 ? (jm8) objH : null;
                im8 im8VarC = jm8Var != null ? jm8Var.c() : null;
                a aVar = im8VarC instanceof a ? (a) im8VarC : null;
                if (aVar != null) {
                    d37<bj4> d37Var = aVar.t.e;
                    Object[] objArr3 = d37Var.b;
                    long[] jArr2 = d37Var.a;
                    int length = jArr2.length - 2;
                    if (length >= 0) {
                        int i9 = 0;
                        while (true) {
                            long j = jArr2[i9];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i10 = 8;
                                int i11 = 8 - ((~(i9 - length)) >>> 31);
                                int i12 = i7;
                                while (i12 < i11) {
                                    if ((255 & j) < 128) {
                                        bj4 bj4Var3 = (bj4) objArr3[(i9 << 3) + i12];
                                        zr9 zr9Var = bj4Var3.c;
                                        if (zr9Var.y <= 0 || (zr9Var.x[1] & 67108864) == 0) {
                                            objArr2 = objArr3;
                                            i6 = i7;
                                        } else {
                                            gu1 gu1Var2 = bj4Var3.h;
                                            synchronized (gu1Var2.w) {
                                                gu1Var2.H();
                                                c37<Object, Object> c37Var = gu1Var2.G;
                                                gu1Var2.G = z39.b();
                                                try {
                                                    gu1Var2.O.A0(c37Var);
                                                    g2b g2bVar = g2b.a;
                                                } catch (Throwable th) {
                                                    gu1Var2.G = c37Var;
                                                    throw th;
                                                }
                                            }
                                            i81 i81Var = new i81();
                                            bj4Var3.L = i81Var;
                                            yr9 yr9VarL1 = bj4Var3.c.l1();
                                            try {
                                                bj4Var3.G = yr9VarL1;
                                                lt1 lt1Var3 = bj4Var3.M;
                                                i81 i81Var2 = lt1Var3.b;
                                                try {
                                                    lt1Var3.b = i81Var;
                                                    bj4Var3.o0(0);
                                                    lt1 lt1Var4 = bj4Var3.M;
                                                    lt1Var4.b();
                                                    if (lt1Var4.c) {
                                                        objArr2 = objArr3;
                                                        lt1Var4.b.x.i1(gk7.b0.c);
                                                        if (lt1Var4.c) {
                                                            lt1Var4.d(false);
                                                            lt1Var4.d(false);
                                                            lt1Var4.b.x.i1(gk7.j.c);
                                                            i6 = 0;
                                                            lt1Var4.c = false;
                                                        }
                                                        lt1Var3.b = i81Var2;
                                                        yr9VarL1.c();
                                                    } else {
                                                        objArr2 = objArr3;
                                                    }
                                                    i6 = 0;
                                                    lt1Var3.b = i81Var2;
                                                    yr9VarL1.c();
                                                } catch (Throwable th2) {
                                                    lt1Var3.b = i81Var2;
                                                    throw th2;
                                                }
                                            } catch (Throwable th3) {
                                                yr9VarL1.c();
                                                throw th3;
                                            }
                                        }
                                        bj4Var.b.t(bj4Var3.h);
                                    } else {
                                        jArr2 = jArr2;
                                        objArr2 = objArr3;
                                        i6 = i7;
                                        i10 = i10;
                                    }
                                    j >>= i10;
                                    i12++;
                                    i10 = i10;
                                    objArr3 = objArr2;
                                    i7 = i6;
                                    jArr2 = jArr2;
                                }
                                jArr = jArr2;
                                objArr = objArr3;
                                i5 = i7;
                                if (i11 != i10) {
                                    break;
                                }
                            } else {
                                jArr = jArr2;
                                objArr = objArr3;
                                i5 = i7;
                            }
                            if (i9 == length) {
                                break;
                            }
                            i9++;
                            objArr3 = objArr;
                            i7 = i5;
                            jArr2 = jArr;
                        }
                    }
                }
                return yr9Var.o(i2);
            }
            i4 = 1;
            if (!yr9Var.l(i2)) {
                return yr9Var.o(i2);
            }
        } else {
            i4 = 1;
            if (yr9Var.d(i2)) {
                int iA = bs9.a(yr9Var.b, i2) + i2;
                int iR0 = 0;
                for (int iA2 = i2 + 1; iA2 < iA; iA2 += bs9.a(yr9Var.b, iA2)) {
                    boolean zL = yr9Var.l(iA2);
                    if (zL) {
                        bj4Var.M.c();
                        lt1 lt1Var5 = bj4Var.M;
                        Object objN = yr9Var.n(iA2);
                        lt1Var5.c();
                        lt1Var5.h.add(objN);
                    }
                    iR0 += r0(bj4Var, i, iA2, zL || z, zL ? 0 : i3 + iR0);
                    if (zL) {
                        bj4Var.M.c();
                        bj4Var.M.a();
                    }
                }
                if (!yr9Var.l(i2)) {
                    return iR0;
                }
            } else if (!yr9Var.l(i2)) {
                return yr9Var.o(i2);
            }
        }
        return i4;
    }

    @Override // defpackage.jt1
    public final boolean A(int i, boolean z) {
        xj8 xj8VarB0;
        if ((i & 1) == 0 && (this.S || this.y)) {
            yn9 yn9Var = this.P;
            if (yn9Var != null && (xj8VarB0 = b0()) != null && yn9Var.a()) {
                int i2 = xj8VarB0.b;
                if ((i2 & 512) != 0) {
                    return true;
                }
                int i3 = i2 | 1;
                xj8VarB0.b = i3;
                xj8VarB0.b = (this.y ? i2 | 129 : i3 & (-129)) | 256;
                kk7 kk7Var = this.M.b.x;
                kk7Var.i1(gk7.w.c);
                kk7.b.a(kk7Var, 0, xj8VarB0);
                this.b.s(xj8VarB0);
                return false;
            }
        } else if (!z && r()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0093 A[LOOP:1: B:20:0x0043->B:35:0x0093, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0096 A[EDGE_INSN: B:43:0x0096->B:36:0x0096 BREAK  A[LOOP:1: B:20:0x0043->B:35:0x0093], SYNTHETIC] */
    public final void A0(c37<Object, Object> c37Var) {
        ArrayList arrayList = this.s;
        for (int iG = ws0.g(arrayList); -1 < iG; iG--) {
            kk5 kk5Var = (kk5) arrayList.get(iG);
            vi4 vi4Var = kk5Var.a.c;
            vi4 vi4VarD = vi4Var != null ? od3.d(vi4Var) : null;
            if (vi4VarD == null || !vi4VarD.a()) {
                arrayList.remove(iG);
            } else {
                int i = kk5Var.b;
                int i2 = vi4VarD.a;
                if (i != i2) {
                    kk5Var.b = i2;
                }
            }
        }
        Object[] objArr = c37Var.b;
        Object[] objArr2 = c37Var.c;
        long[] jArr = c37Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i3 != length) {
                        break;
                        break;
                    }
                    i3++;
                } else {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            int i6 = (i3 << 3) + i5;
                            Object obj = objArr[i6];
                            Object obj2 = objArr2[i6];
                            obj.getClass();
                            xj8 xj8Var = (xj8) obj;
                            vi4 vi4Var2 = xj8Var.c;
                            if (vi4Var2 != null) {
                                int i7 = od3.d(vi4Var2).a;
                                if (obj2 == zh7.a) {
                                    obj2 = null;
                                }
                                arrayList.add(new kk5(xj8Var, i7, obj2));
                            }
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    } else if (i3 != length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        rh1.t(ty.g, arrayList);
    }

    @Override // defpackage.jt1
    public final void B() {
        U(false);
    }

    public final void B0(int i, int i2) {
        if (E0(i) != i2) {
            if (i < 0) {
                c27 c27Var = this.p;
                if (c27Var == null) {
                    c27Var = new c27();
                    this.p = c27Var;
                }
                c27Var.f(i, i2);
                return;
            }
            int[] iArr = this.o;
            if (iArr == null) {
                iArr = new int[this.G.c];
                gz3.n(iArr, -1, 0, 6);
                this.o = iArr;
            }
            iArr[i] = i2;
        }
    }

    @Override // defpackage.jt1
    public final void C(Object obj) {
        if (obj instanceof im8) {
            jj4 jj4Var = new jj4((im8) obj, this.m - 1);
            if (this.S) {
                kk7 kk7Var = this.M.b.x;
                kk7Var.i1(gk7.v.c);
                kk7.b.a(kk7Var, 0, jj4Var);
            }
            this.d.add(obj);
            obj = jj4Var;
        }
        D0(obj);
    }

    public final void C0(int i, int i2) {
        int iE0 = E0(i);
        if (iE0 != i2) {
            int i3 = i2 - iE0;
            ArrayList<ij4> arrayList = this.i;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int iE1 = E0(i) + i3;
                B0(i, iE1);
                for (int i4 = size; -1 < i4; i4--) {
                    ij4 ij4Var = arrayList.get(i4);
                    if (ij4Var != null && ij4Var.a(i, iE1)) {
                        size = i4 - 1;
                        break;
                    }
                }
                yr9 yr9Var = this.G;
                if (i < 0) {
                    i = yr9Var.i;
                } else if (yr9Var.l(i)) {
                    return;
                } else {
                    i = this.G.q(i);
                }
            }
        }
    }

    public final void D0(Object obj) {
        if (this.S) {
            this.I.U(obj);
            return;
        }
        yr9 yr9Var = this.G;
        boolean z = yr9Var.n;
        lt1 lt1Var = this.M;
        if (!z) {
            vi4 vi4VarA = yr9Var.a(yr9Var.i);
            kk7 kk7Var = lt1Var.b.x;
            kk7Var.i1(gk7.b.c);
            kk7.b.b(kk7Var, 0, vi4VarA, 1, obj);
            return;
        }
        int iC = (yr9Var.l - bs9.c(yr9Var.b, yr9Var.i)) - 1;
        if (lt1Var.a.G.i - lt1Var.f >= 0) {
            lt1Var.d(true);
            kk7 kk7Var2 = lt1Var.b.x;
            kk7Var2.i1(gk7.h0.c);
            kk7.b.a(kk7Var2, 0, obj);
            kk7Var2.z[kk7Var2.A - kk7Var2.x[kk7Var2.y - 1].a] = iC;
            return;
        }
        yr9 yr9Var2 = this.G;
        vi4 vi4VarA2 = yr9Var2.a(yr9Var2.i);
        kk7 kk7Var3 = lt1Var.b.x;
        kk7Var3.i1(gk7.e0.c);
        kk7.b.b(kk7Var3, 0, obj, 1, vi4VarA2);
        kk7Var3.z[kk7Var3.A - kk7Var3.x[kk7Var3.y - 1].a] = iC;
    }

    @Override // defpackage.jt1
    public final b E() {
        bj4 bj4Var;
        w0(206, pt1.e);
        if (this.S) {
            cs9.z(this.I);
        }
        Object objG0 = g0();
        jm8 rv8Var = objG0 instanceof jm8 ? (jm8) objG0 : null;
        if (rv8Var == null) {
            bj4Var = this;
            rv8Var = new rv8(new a(bj4Var.new b(this.T, this.q, this.C, this.h.M)), -1);
            bj4Var.D0(rv8Var);
        } else {
            bj4Var = this;
        }
        im8 im8VarC = rv8Var.c();
        im8VarC.getClass();
        b bVar = ((a) im8VarC).t;
        bVar.f.setValue(bj4Var.P());
        bj4Var.U(false);
        return bVar;
    }

    public final int E0(int i) {
        int i2;
        if (i >= 0) {
            int[] iArr = this.o;
            return (iArr == null || (i2 = iArr[i]) < 0) ? this.G.o(i) : i2;
        }
        c27 c27Var = this.p;
        if (c27Var != null && c27Var.c(i) >= 0) {
            int iC = c27Var.c(i);
            if (iC >= 0) {
                return c27Var.c[iC];
            }
            px1.b(pp2.a(i, "Cannot find value for key "));
        }
        return 0;
    }

    @Override // defpackage.jt1
    public final <T> T F(hf8 hf8Var) {
        return (T) pu1.a(P(), hf8Var);
    }

    @Override // defpackage.jt1
    public final void G() {
        U(false);
    }

    @Override // defpackage.jt1
    public final void H() {
        U(false);
    }

    @Override // defpackage.jt1
    public final void I() {
        U(true);
    }

    @Override // defpackage.jt1
    public final boolean J(Object obj) {
        if (xj5.a(g0(), obj)) {
            return false;
        }
        D0(obj);
        return true;
    }

    @Override // defpackage.jt1
    public final void K(int i) {
        int i2;
        int i3;
        if (this.j != null) {
            u0(i, 0, null, null);
            return;
        }
        if (this.r) {
            pt1.a("A call to createNode(), emitNode() or useNode() expected");
        }
        this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) i), 3) ^ ((long) this.m);
        this.m++;
        yr9 yr9Var = this.G;
        boolean z = this.S;
        jt1.a.C0187a c0187a = jt1.a.a;
        if (z) {
            yr9Var.k++;
            this.I.S(i, c0187a, false, c0187a);
            Y(false, null);
            return;
        }
        if (yr9Var.g() == i && ((i3 = yr9Var.g) >= yr9Var.h || (yr9Var.b[(i3 * 5) + 1] & 536870912) == 0)) {
            yr9Var.u();
            Y(false, null);
            return;
        }
        if (yr9Var.k <= 0 && (i2 = yr9Var.g) != yr9Var.h) {
            int i4 = this.k;
            l0();
            this.M.f(i4, yr9Var.s());
            ty.a(this.s, i2, yr9Var.g);
        }
        yr9Var.k++;
        this.S = true;
        this.K = null;
        if (this.I.w) {
            cs9 cs9VarM1 = this.H.m1();
            this.I = cs9VarM1;
            cs9VarM1.O();
            this.J = false;
            this.K = null;
        }
        cs9 cs9Var = this.I;
        cs9Var.d();
        int i5 = cs9Var.t;
        cs9Var.S(i, c0187a, false, c0187a);
        this.N = cs9Var.b(i5);
        Y(false, null);
    }

    @Override // defpackage.dj5
    public final void L() {
        if (this.F || this.z != 0) {
            c78.a("Cannot disable reuse from root if it was caused by other groups");
        }
        this.z = -1;
        this.y = false;
    }

    @Override // defpackage.dj5
    public final void M() {
        this.z = 0;
        this.y = true;
    }

    public final void N() {
        O();
        this.i.clear();
        this.n.b = 0;
        this.t.b = 0;
        this.x.b = 0;
        this.v = null;
        o34 o34Var = this.O;
        o34Var.y.clear();
        o34Var.x.clear();
        this.T = 0L;
        this.A = 0;
        this.r = false;
        this.S = false;
        this.y = false;
        this.F = false;
        this.z = -1;
        yr9 yr9Var = this.G;
        if (!yr9Var.f) {
            yr9Var.c();
        }
        if (this.I.w) {
            return;
        }
        Z();
    }

    public final void O() {
        this.j = null;
        this.k = 0;
        this.l = 0;
        this.T = 0L;
        this.r = false;
        lt1 lt1Var = this.M;
        lt1Var.c = false;
        lt1Var.d.b = 0;
        lt1Var.f = 0;
        lt1Var.e = true;
        lt1Var.g = 0;
        lt1Var.h.clear();
        lt1Var.i = -1;
        lt1Var.j = -1;
        lt1Var.k = -1;
        lt1Var.l = 0;
        this.E.clear();
        this.o = null;
        this.p = null;
    }

    public final kw7 P() {
        kw7 kw7Var = this.K;
        return kw7Var != null ? kw7Var : Q(this.G.i);
    }

    public final kw7 Q(int i) {
        kw7 kw7VarB;
        boolean z = this.S;
        fk7 fk7Var = pt1.c;
        if (z && this.J) {
            int iG = this.I.v;
            while (iG > 0) {
                if (this.I.s(iG) == 202 && xj5.a(this.I.t(iG), fk7Var)) {
                    Object objQ = this.I.q(iG);
                    objQ.getClass();
                    kw7 kw7Var = (kw7) objQ;
                    this.K = kw7Var;
                    return kw7Var;
                }
                cs9 cs9Var = this.I;
                iG = cs9Var.G(cs9Var.b, iG);
            }
        }
        if (this.G.c > 0) {
            while (i > 0) {
                if (this.G.i(i) == 202) {
                    yr9 yr9Var = this.G;
                    if (xj5.a(yr9Var.p(yr9Var.b, i), fk7Var)) {
                        e27<kw7> e27Var = this.v;
                        if (e27Var == null || (kw7VarB = e27Var.b(i)) == null) {
                            yr9 yr9Var2 = this.G;
                            Object objB = yr9Var2.b(yr9Var2.b, i);
                            objB.getClass();
                            kw7VarB = (kw7) objB;
                        }
                        this.K = kw7VarB;
                        return kw7VarB;
                    }
                }
                i = this.G.q(i);
            }
        }
        kw7 kw7Var2 = this.u;
        this.K = kw7Var2;
        return kw7Var2;
    }

    public final xs1 R() {
        RandomAccess randomAccess;
        if (!this.b.l()) {
            return null;
        }
        e96 e96VarF = ws0.f();
        cs9 cs9Var = this.I;
        e96VarF.addAll(zs1.a(cs9Var, null, cs9Var.t, null));
        yr9 yr9Var = this.G;
        boolean z = yr9Var.f;
        int[] iArr = yr9Var.b;
        if (z || yr9Var.c == 0) {
            randomAccess = hf3.t;
        } else {
            ii8 ii8Var = new ii8(yr9Var);
            int iQ = yr9Var.i;
            Object objValueOf = Integer.valueOf(yr9Var.l - bs9.c(iArr, iQ));
            while (iQ >= 0) {
                ii8Var.d(yr9Var.i(iQ), yr9Var.k(iQ) ? yr9Var.p(iArr, iQ) : jt1.a.a, yr9Var.a.o1(iQ), objValueOf);
                objValueOf = yr9Var.a(iQ);
                iQ = yr9Var.q(iQ);
            }
            randomAccess = ii8Var.a;
        }
        e96VarF.addAll(randomAccess);
        e96VarF.addAll(h0());
        return new xs1(ws0.e(e96VarF), this.C);
    }

    public final void S(c37<Object, Object> c37Var, ci4<? super jt1, ? super Integer, g2b> ci4Var) {
        ArrayList arrayList = this.s;
        if (this.F) {
            pt1.a("Reentrant composition is not supported");
        }
        this.g.a();
        Trace.beginSection("Compose:recompose");
        try {
            this.B = Long.hashCode(qu9.j().g());
            this.v = null;
            A0(c37Var);
            this.k = 0;
            this.F = true;
            try {
                y0();
                Object objG0 = g0();
                if (objG0 != ci4Var && ci4Var != null) {
                    D0(ci4Var);
                }
                cj4 cj4Var = this.D;
                k37 k37VarE = bl7.e();
                try {
                    k37VarE.d(cj4Var);
                    fk7 fk7Var = pt1.a;
                    if (ci4Var != null) {
                        w0(200, fk7Var);
                        oq3.c(this, ci4Var);
                        U(false);
                    } else if (!this.w || objG0 == null || objG0.equals(jt1.a.a)) {
                        s0();
                    } else {
                        w0(200, fk7Var);
                        fza.b(2, objG0);
                        oq3.c(this, (ci4) objG0);
                        U(false);
                    }
                    k37VarE.o(k37VarE.v - 1);
                    X();
                    this.F = false;
                    arrayList.clear();
                    if (!this.I.w) {
                        pt1.a("Check failed");
                    }
                    Z();
                    g2b g2bVar = g2b.a;
                    Trace.endSection();
                } catch (Throwable th) {
                    k37VarE.o(k37VarE.v - 1);
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    nt3.e(th2, new yi4(0, this));
                    throw th2;
                } catch (Throwable th3) {
                    this.F = false;
                    arrayList.clear();
                    N();
                    if (!this.I.w) {
                        pt1.a("Check failed");
                    }
                    Z();
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            Trace.endSection();
            throw th4;
        }
    }

    public final void T(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        T(this.G.q(i), i2);
        if (this.G.l(i)) {
            Object objN = this.G.n(i);
            lt1 lt1Var = this.M;
            lt1Var.c();
            lt1Var.h.add(objN);
        }
    }

    /* JADX WARN: Code duplicated, block: B:150:0x0397  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void U(boolean z) {
        long jRotateRight;
        mg5 mg5Var;
        int i;
        ArrayList arrayList;
        int i2;
        ?? r5;
        int i3;
        mg5 mg5Var2;
        int i4;
        d37 d37Var;
        int i5;
        ArrayList arrayList2;
        ArrayList arrayList3;
        HashSet hashSet;
        int i6;
        int i7;
        int i8;
        Object[] objArr;
        long[] jArr;
        int i9;
        Object[] objArr2;
        long[] jArr2;
        int i10;
        Object[] objArr3;
        long[] jArr3;
        int i11;
        Object[] objArr4;
        long[] jArr4;
        long jRotateRight2;
        mg5 mg5Var3 = this.n;
        int i12 = mg5Var3.a[mg5Var3.b - 2] - 1;
        boolean z2 = this.S;
        jt1.a.C0187a c0187a = jt1.a.a;
        if (z2) {
            cs9 cs9Var = this.I;
            int i13 = cs9Var.v;
            int iS = cs9Var.s(i13);
            Object objT = this.I.t(i13);
            Object objQ = this.I.q(i13);
            if (objT != null) {
                jRotateRight2 = Long.rotateRight(this.T, 3) ^ ((long) (objT instanceof Enum ? ((Enum) objT).ordinal() : objT.hashCode()));
            } else if (objQ == null || iS != 207 || objQ.equals(c0187a)) {
                jRotateRight2 = Long.rotateRight(this.T ^ ((long) i12), 3) ^ ((long) iS);
            } else {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i12), 3) ^ ((long) objQ.hashCode()), 3);
            }
            this.T = Long.rotateRight(jRotateRight2, 3);
        } else {
            yr9 yr9Var = this.G;
            int i14 = yr9Var.i;
            int i15 = yr9Var.i(i14);
            yr9 yr9Var2 = this.G;
            Object objP = yr9Var2.p(yr9Var2.b, i14);
            yr9 yr9Var3 = this.G;
            Object objB = yr9Var3.b(yr9Var3.b, i14);
            if (objP != null) {
                jRotateRight = Long.rotateRight(this.T, 3) ^ ((long) (objP instanceof Enum ? ((Enum) objP).ordinal() : objP.hashCode()));
            } else if (objB == null || i15 != 207 || objB.equals(c0187a)) {
                jRotateRight = Long.rotateRight(this.T ^ ((long) i12), 3) ^ ((long) i15);
            } else {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i12), 3) ^ ((long) objB.hashCode()), 3);
            }
            this.T = Long.rotateRight(jRotateRight, 3);
        }
        int i16 = this.l;
        ij4 ij4Var = this.j;
        ArrayList arrayList4 = this.s;
        lt1 lt1Var = this.M;
        if (ij4Var != null) {
            e27<bp4> e27Var = ij4Var.e;
            int i17 = ij4Var.b;
            ArrayList arrayList5 = ij4Var.a;
            if (arrayList5.size() > 0) {
                ArrayList arrayList6 = ij4Var.d;
                HashSet hashSet2 = new HashSet(arrayList6.size());
                int size = arrayList6.size();
                for (int i18 = 0; i18 < size; i18++) {
                    hashSet2.add(arrayList6.get(i18));
                }
                i2 = -1;
                d37 d37VarA = a49.a();
                int size2 = arrayList6.size();
                int size3 = arrayList5.size();
                i = 1;
                int i19 = 0;
                int i20 = 0;
                int i21 = 0;
                while (i19 < size3) {
                    po5 po5Var = (po5) arrayList5.get(i19);
                    if (hashSet2.contains(po5Var)) {
                        mg5Var2 = mg5Var3;
                        i4 = i19;
                        if (!d37VarA.c(po5Var)) {
                            int i22 = i20;
                            if (i22 < size2) {
                                po5 po5Var2 = (po5) arrayList6.get(i22);
                                if (po5Var2 != po5Var) {
                                    bp4 bp4VarB = e27Var.b(po5Var2.c);
                                    int i23 = bp4VarB != null ? bp4VarB.b : -1;
                                    d37VarA.a(po5Var2);
                                    i7 = i21;
                                    if (i23 != i7) {
                                        bp4 bp4VarB2 = e27Var.b(po5Var2.c);
                                        int i24 = bp4VarB2 != null ? bp4VarB2.c : po5Var2.d;
                                        d37Var = d37VarA;
                                        int i25 = i23 + i17;
                                        i5 = i17;
                                        int i26 = i7 + i5;
                                        if (i24 > 0) {
                                            arrayList2 = arrayList5;
                                            int i27 = lt1Var.l;
                                            if (i27 > 0) {
                                                arrayList3 = arrayList6;
                                                if (lt1Var.j == i25 - i27 && lt1Var.k == i26 - i27) {
                                                    lt1Var.l = i27 + i24;
                                                }
                                            } else {
                                                arrayList3 = arrayList6;
                                            }
                                            lt1Var.c();
                                            lt1Var.j = i25;
                                            lt1Var.k = i26;
                                            lt1Var.l = i24;
                                        } else {
                                            arrayList2 = arrayList5;
                                            arrayList3 = arrayList6;
                                            lt1Var.getClass();
                                        }
                                        if (i23 <= i7) {
                                            int i28 = i24;
                                            arrayList4 = arrayList4;
                                            hashSet = hashSet2;
                                            i6 = size2;
                                            if (i7 > i23) {
                                                Object[] objArr5 = e27Var.c;
                                                long[] jArr5 = e27Var.a;
                                                int length = jArr5.length - 2;
                                                if (length >= 0) {
                                                    int i29 = 0;
                                                    while (true) {
                                                        long j = jArr5[i29];
                                                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i30 = 8 - ((~(i29 - length)) >>> 31);
                                                            int i31 = 0;
                                                            while (i31 < i30) {
                                                                if ((j & 255) < 128) {
                                                                    objArr2 = objArr5;
                                                                    bp4 bp4Var = (bp4) objArr5[(i29 << 3) + i31];
                                                                    jArr2 = jArr5;
                                                                    int i32 = bp4Var.b;
                                                                    i10 = i23;
                                                                    if (i23 <= i32 && i32 < i10 + i28) {
                                                                        bp4Var.b = (i32 - i10) + i7;
                                                                    } else if (i10 + 1 <= i32 && i32 < i7) {
                                                                        bp4Var.b = i32 - i28;
                                                                    }
                                                                } else {
                                                                    objArr2 = objArr5;
                                                                    jArr2 = jArr5;
                                                                    i10 = i23;
                                                                }
                                                                j >>= 8;
                                                                i31++;
                                                                jArr5 = jArr2;
                                                                objArr5 = objArr2;
                                                                i23 = i10;
                                                            }
                                                            objArr = objArr5;
                                                            jArr = jArr5;
                                                            i9 = i23;
                                                            if (i30 != 8) {
                                                                break;
                                                            }
                                                        } else {
                                                            objArr = objArr5;
                                                            jArr = jArr5;
                                                            i9 = i23;
                                                        }
                                                        if (i29 == length) {
                                                            break;
                                                        }
                                                        i29++;
                                                        jArr5 = jArr;
                                                        objArr5 = objArr;
                                                        i23 = i9;
                                                    }
                                                }
                                            }
                                        } else {
                                            Object[] objArr6 = e27Var.c;
                                            long[] jArr6 = e27Var.a;
                                            int length2 = jArr6.length - 2;
                                            if (length2 >= 0) {
                                                hashSet = hashSet2;
                                                i6 = size2;
                                                int i33 = 0;
                                                while (true) {
                                                    long j2 = jArr6[i33];
                                                    int i34 = i24;
                                                    arrayList4 = arrayList4;
                                                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i35 = 8 - ((~(i33 - length2)) >>> 31);
                                                        int i36 = 0;
                                                        while (i36 < i35) {
                                                            if ((j2 & 255) < 128) {
                                                                i11 = i36;
                                                                bp4 bp4Var2 = (bp4) objArr6[(i33 << 3) + i36];
                                                                objArr4 = objArr6;
                                                                int i37 = bp4Var2.b;
                                                                jArr4 = jArr6;
                                                                if (i23 <= i37 && i37 < i23 + i34) {
                                                                    bp4Var2.b = (i37 - i23) + i7;
                                                                } else if (i7 <= i37 && i37 < i23) {
                                                                    bp4Var2.b = i37 + i34;
                                                                }
                                                            } else {
                                                                i11 = i36;
                                                                objArr4 = objArr6;
                                                                jArr4 = jArr6;
                                                            }
                                                            j2 >>= 8;
                                                            i36 = i11 + 1;
                                                            objArr6 = objArr4;
                                                            jArr6 = jArr4;
                                                        }
                                                        objArr3 = objArr6;
                                                        jArr3 = jArr6;
                                                        if (i35 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        objArr3 = objArr6;
                                                        jArr3 = jArr6;
                                                    }
                                                    if (i33 == length2) {
                                                        break;
                                                    }
                                                    i33++;
                                                    arrayList4 = arrayList4;
                                                    i24 = i34;
                                                    objArr6 = objArr3;
                                                    jArr6 = jArr3;
                                                }
                                            }
                                        }
                                        i8 = i4;
                                    } else {
                                        d37Var = d37VarA;
                                        i5 = i17;
                                        arrayList2 = arrayList5;
                                        arrayList3 = arrayList6;
                                    }
                                    hashSet = hashSet2;
                                    i6 = size2;
                                    i8 = i4;
                                } else {
                                    arrayList4 = arrayList4;
                                    d37Var = d37VarA;
                                    i5 = i17;
                                    arrayList2 = arrayList5;
                                    arrayList3 = arrayList6;
                                    hashSet = hashSet2;
                                    i6 = size2;
                                    i7 = i21;
                                    i8 = i4 + 1;
                                }
                                i20 = i22 + 1;
                                bp4 bp4VarB3 = e27Var.b(po5Var2.c);
                                int i38 = i7 + (bp4VarB3 != null ? bp4VarB3.c : po5Var2.d);
                                i19 = i8;
                                ij4Var = ij4Var;
                                d37VarA = d37Var;
                                i17 = i5;
                                arrayList5 = arrayList2;
                                arrayList6 = arrayList3;
                                hashSet2 = hashSet;
                                size2 = i6;
                                arrayList4 = arrayList4;
                                i21 = i38;
                                mg5Var3 = mg5Var2;
                            } else {
                                i20 = i22;
                                mg5Var3 = mg5Var2;
                                i19 = i4;
                            }
                        }
                    } else {
                        mg5Var2 = mg5Var3;
                        bp4 bp4VarB4 = e27Var.b(po5Var.c);
                        int i39 = bp4VarB4 != null ? bp4VarB4.b : -1;
                        int i40 = po5Var.c;
                        i4 = i19;
                        lt1Var.f(i39 + i17, po5Var.d);
                        ij4Var.a(i40, 0);
                        lt1Var.f = (i40 - lt1Var.a.G.g) + lt1Var.f;
                        this.G.r(i40);
                        l0();
                        this.G.s();
                        ty.a(arrayList4, i40, bs9.a(this.G.b, i40) + i40);
                    }
                    i19 = i4 + 1;
                    mg5Var3 = mg5Var2;
                }
                mg5Var = mg5Var3;
                arrayList = arrayList4;
                lt1Var.c();
                if (arrayList5.size() > 0) {
                    yr9 yr9Var4 = this.G;
                    lt1Var.f = (yr9Var4.h - lt1Var.a.G.g) + lt1Var.f;
                    yr9Var4.t();
                }
            } else {
                mg5Var = mg5Var3;
                i = 1;
                arrayList = arrayList4;
                i2 = -1;
            }
        } else {
            mg5Var = mg5Var3;
            i = 1;
            arrayList = arrayList4;
            i2 = -1;
        }
        boolean z3 = this.S;
        if (!z3) {
            yr9 yr9Var5 = this.G;
            int i41 = yr9Var5.m - yr9Var5.l;
            if (i41 > 0) {
                if (i41 > 0) {
                    lt1Var.d(false);
                    lt1Var.e();
                    kk7 kk7Var = lt1Var.b.x;
                    kk7Var.i1(gk7.d0.c);
                    kk7Var.z[kk7Var.A - kk7Var.x[kk7Var.y - 1].a] = i41;
                } else {
                    lt1Var.getClass();
                }
            }
        }
        int i42 = this.k;
        while (true) {
            yr9 yr9Var6 = this.G;
            if (yr9Var6.k > 0 || (i3 = yr9Var6.g) == yr9Var6.h) {
                break;
            }
            l0();
            lt1Var.f(i42, this.G.s());
            ty.a(arrayList, i3, this.G.g);
        }
        if (z3) {
            if (z) {
                o34 o34Var = this.O;
                kk7 kk7Var2 = o34Var.y;
                if (kk7Var2.y == 0) {
                    pt1.a("Cannot end node insertion, there are no pending operations that can be realized.");
                }
                kk7 kk7Var3 = o34Var.x;
                gk7[] gk7VarArr = kk7Var2.x;
                int i43 = kk7Var2.y - 1;
                kk7Var2.y = i43;
                gk7 gk7Var = gk7VarArr[i43];
                gk7VarArr[i43] = null;
                kk7Var3.i1(gk7Var);
                Object[] objArr7 = kk7Var2.B;
                Object[] objArr8 = kk7Var3.B;
                int i44 = kk7Var3.C;
                int i45 = gk7Var.b;
                int i46 = kk7Var2.C;
                int i47 = i46 - i45;
                System.arraycopy(objArr7, i47, objArr8, i44 - i45, i46 - i47);
                Object[] objArr9 = kk7Var2.B;
                int i48 = kk7Var2.C;
                Arrays.fill(objArr9, i48 - i45, i48, (Object) null);
                int[] iArr = kk7Var2.z;
                int[] iArr2 = kk7Var3.z;
                int i49 = kk7Var3.A;
                int i50 = gk7Var.a;
                int i51 = kk7Var2.A;
                gz3.e(i49 - i50, i51 - i50, i51, iArr, iArr2);
                kk7Var2.C -= i45;
                kk7Var2.A -= i50;
                i16 = i;
            }
            yr9 yr9Var7 = this.G;
            if (yr9Var7.k <= 0) {
                c78.a("Unbalanced begin/end empty");
            }
            yr9Var7.k--;
            cs9 cs9Var2 = this.I;
            int i52 = cs9Var2.v;
            cs9Var2.j();
            if (this.G.k <= 0) {
                int i53 = (-2) - i52;
                this.I.k();
                this.I.e(i);
                vi4 vi4Var = this.N;
                boolean zIsEmpty = this.O.x.isEmpty();
                zr9 zr9Var = this.H;
                if (zIsEmpty) {
                    lt1Var.b();
                    r5 = 0;
                    lt1Var.d(false);
                    lt1Var.e();
                    lt1Var.c();
                    kk7 kk7Var4 = lt1Var.b.x;
                    kk7Var4.i1(gk7.p.c);
                    kk7.b.b(kk7Var4, 0, vi4Var, 1, zr9Var);
                } else {
                    o34 o34Var2 = this.O;
                    lt1Var.b();
                    lt1Var.d(false);
                    lt1Var.e();
                    lt1Var.c();
                    kk7 kk7Var5 = lt1Var.b.x;
                    kk7Var5.i1(gk7.q.c);
                    kk7.b.c(kk7Var5, vi4Var, zr9Var, o34Var2);
                    this.O = new o34();
                    r5 = 0;
                }
                this.S = r5;
                if (this.c.y != 0) {
                    B0(i53, r5);
                    C0(i53, i16);
                }
            }
        } else {
            if (z) {
                lt1Var.a();
            }
            int i54 = lt1Var.a.G.i;
            mg5 mg5Var4 = lt1Var.d;
            int i55 = i2;
            if (mg5Var4.a(i55) > i54) {
                pt1.a("Missed recording an endGroup");
            }
            if (mg5Var4.a(i55) == i54) {
                lt1Var.d(false);
                mg5Var4.b();
                lt1Var.b.x.i1(gk7.j.c);
            }
            int i56 = this.G.i;
            if (i16 != E0(i56)) {
                C0(i56, i16);
            }
            if (z) {
                i16 = 1;
            }
            this.G.e();
            lt1Var.c();
        }
        ArrayList<ij4> arrayList7 = this.i;
        ij4 ij4VarRemove = arrayList7.remove(arrayList7.size() - 1);
        if (ij4VarRemove != null && !z3) {
            ij4VarRemove.c++;
        }
        this.j = ij4VarRemove;
        this.k = mg5Var.b() + i16;
        this.m = mg5Var.b();
        this.l = mg5Var.b() + i16;
    }

    public final void V() {
        U(false);
        xj8 xj8VarB0 = b0();
        if (xj8VarB0 != null) {
            int i = xj8VarB0.b;
            if ((i & 1) != 0) {
                xj8VarB0.b = i | 2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x007f A[LOOP:0: B:15:0x003e->B:27:0x007f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0082 A[EDGE_INSN: B:28:0x0082->B:29:0x0083 BREAK  A[LOOP:0: B:15:0x003e->B:27:0x007f]] */
    /* JADX WARN: Code duplicated, block: B:57:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:62:0x0082 A[SYNTHETIC] */
    public final xj8 W() {
        xj8 xj8Var;
        vi4 vi4VarA;
        oh4 oh4Var;
        ArrayList<xj8> arrayList = this.E;
        final xj8 xj8VarRemove = !arrayList.isEmpty() ? arrayList.remove(arrayList.size() - 1) : null;
        if (xj8VarRemove != null) {
            xj8VarRemove.b &= -9;
            this.g.a();
            final int i = this.B;
            final s27<Object> s27Var = xj8VarRemove.f;
            if (s27Var == null || (xj8VarRemove.b & 16) != 0) {
                oh4Var = null;
                break;
            }
            Object[] objArr = s27Var.b;
            int[] iArr = s27Var.c;
            long[] jArr = s27Var.a;
            int length = jArr.length - 2;
            if (length < 0) {
                oh4Var = null;
                break;
            }
            int i2 = 0;
            loop0: while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((j & 255) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Object obj = objArr[i5];
                            if (iArr[i5] != i) {
                                oh4Var = new oh4() { // from class: wj8
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj2) {
                                        xt1 xt1Var;
                                        xt1 xt1Var2;
                                        int i6;
                                        xt1 xt1Var3 = (xt1) obj2;
                                        xj8 xj8Var2 = xj8VarRemove;
                                        int i7 = xj8Var2.e;
                                        int i8 = i;
                                        if (i7 == i8) {
                                            s27<Object> s27Var2 = xj8Var2.f;
                                            s27 s27Var3 = s27Var;
                                            if (xj5.a(s27Var3, s27Var2) && (xt1Var3 instanceof gu1)) {
                                                long[] jArr2 = s27Var3.a;
                                                int length2 = jArr2.length - 2;
                                                if (length2 >= 0) {
                                                    int i9 = 0;
                                                    while (true) {
                                                        long j2 = jArr2[i9];
                                                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i10 = 8;
                                                            int i11 = 8 - ((~(i9 - length2)) >>> 31);
                                                            int i12 = 0;
                                                            while (i12 < i11) {
                                                                if ((255 & j2) < 128) {
                                                                    int i13 = (i9 << 3) + i12;
                                                                    Object obj3 = s27Var3.b[i13];
                                                                    boolean z = s27Var3.c[i13] != i8;
                                                                    if (z) {
                                                                        gu1 gu1Var = (gu1) xt1Var3;
                                                                        i6 = i10;
                                                                        c37<Object, Object> c37Var = gu1Var.z;
                                                                        j59.b(c37Var, obj3, xj8Var2);
                                                                        xt1Var2 = xt1Var3;
                                                                        if (obj3 instanceof ny2) {
                                                                            ny2 ny2Var = (ny2) obj3;
                                                                            if (!c37Var.b(ny2Var)) {
                                                                                j59.c(gu1Var.C, ny2Var);
                                                                            }
                                                                            c37<ny2<?>, Object> c37Var2 = xj8Var2.g;
                                                                            if (c37Var2 != null) {
                                                                                c37Var2.k((ny2<?>) obj3);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        xt1Var2 = xt1Var3;
                                                                        i6 = i10;
                                                                    }
                                                                    if (z) {
                                                                        s27Var3.g(i13);
                                                                    }
                                                                } else {
                                                                    xt1Var2 = xt1Var3;
                                                                    i6 = i10;
                                                                }
                                                                j2 >>= i6;
                                                                i12++;
                                                                i10 = i6;
                                                                xt1Var3 = xt1Var2;
                                                            }
                                                            xt1Var = xt1Var3;
                                                            if (i11 != i10) {
                                                                break;
                                                            }
                                                        } else {
                                                            xt1Var = xt1Var3;
                                                        }
                                                        if (i9 == length2) {
                                                            break;
                                                        }
                                                        i9++;
                                                        xt1Var3 = xt1Var;
                                                    }
                                                }
                                            }
                                        }
                                        return g2b.a;
                                    }
                                };
                                break loop0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 == 8) {
                        if (i2 == length) {
                            i2++;
                        }
                    }
                    oh4Var = null;
                    break;
                }
                if (i2 == length) {
                    oh4Var = null;
                    break;
                }
                i2++;
            }
            lt1 lt1Var = this.M;
            if (oh4Var != null) {
                kk7 kk7Var = lt1Var.b.x;
                kk7Var.i1(gk7.i.c);
                kk7.b.b(kk7Var, 0, oh4Var, 1, this.h);
            }
            int i6 = xj8VarRemove.b;
            if ((i6 & 512) != 0) {
                xj8VarRemove.b = i6 & (-513);
                kk7 kk7Var2 = lt1Var.b.x;
                kk7Var2.i1(gk7.l.c);
                kk7.b.a(kk7Var2, 0, xj8VarRemove);
                int i7 = xj8VarRemove.b;
                xj8VarRemove.b = i7 & (-129);
                if ((i7 & 1024) != 0) {
                    xj8VarRemove.b = i7 & (-1153);
                    if (this.z == this.G.i) {
                        this.y = false;
                        this.z = -1;
                    }
                }
            }
        }
        if (xj8VarRemove != null) {
            int i8 = xj8VarRemove.b;
            if ((i8 & 16) == 0 && ((i8 & 1) != 0 || this.q)) {
                if (xj8VarRemove.c == null) {
                    if (this.S) {
                        cs9 cs9Var = this.I;
                        vi4VarA = cs9Var.b(cs9Var.v);
                    } else {
                        yr9 yr9Var = this.G;
                        vi4VarA = yr9Var.a(yr9Var.i);
                    }
                    xj8VarRemove.c = vi4VarA;
                }
                xj8VarRemove.b &= -5;
                xj8Var = xj8VarRemove;
            } else {
                xj8Var = null;
            }
        } else {
            xj8Var = null;
        }
        U(false);
        return xj8Var;
    }

    public final void X() {
        U(false);
        this.b.d();
        U(false);
        lt1 lt1Var = this.M;
        if (lt1Var.c) {
            lt1Var.d(false);
            lt1Var.d(false);
            lt1Var.b.x.i1(gk7.j.c);
            lt1Var.c = false;
        }
        lt1Var.b();
        if (lt1Var.d.b != 0) {
            pt1.a("Missed recording an endGroup()");
        }
        if (!this.i.isEmpty()) {
            pt1.a("Start/end imbalance");
        }
        O();
        this.G.c();
        this.w = this.x.b() != 0;
    }

    public final void Y(boolean z, ij4 ij4Var) {
        this.i.add(this.j);
        this.j = ij4Var;
        int i = this.l;
        mg5 mg5Var = this.n;
        mg5Var.c(i);
        mg5Var.c(this.m);
        mg5Var.c(this.k);
        if (z) {
            this.k = 0;
        }
        this.l = 0;
        this.m = 0;
    }

    public final void Z() {
        zr9 zr9Var = new zr9();
        if (this.C) {
            zr9Var.i1();
        }
        if (this.b.e()) {
            zr9Var.H = new e27<>();
        }
        this.H = zr9Var;
        cs9 cs9VarM1 = zr9Var.m1();
        cs9VarM1.e(true);
        this.I = cs9VarM1;
    }

    @Override // defpackage.jt1
    public final xj8 a() {
        return b0();
    }

    public final au1 a0() {
        fj4 fj4Var = this.U;
        if (fj4Var != null) {
            return fj4Var;
        }
        fj4 fj4Var2 = new fj4(this.h);
        this.U = fj4Var2;
        return fj4Var2;
    }

    @Override // defpackage.jt1
    public final void b(ci4 ci4Var, Object obj) {
        if (this.S) {
            kk7 kk7Var = this.O.x;
            kk7Var.i1(gk7.g0.c);
            kk7.b.a(kk7Var, 0, obj);
            ci4Var.getClass();
            fza.b(2, ci4Var);
            kk7.b.a(kk7Var, 1, ci4Var);
            return;
        }
        lt1 lt1Var = this.M;
        lt1Var.b();
        kk7 kk7Var2 = lt1Var.b.x;
        kk7Var2.i1(gk7.g0.c);
        ci4Var.getClass();
        fza.b(2, ci4Var);
        kk7.b.b(kk7Var2, 0, obj, 1, ci4Var);
    }

    public final xj8 b0() {
        if (this.A != 0) {
            return null;
        }
        ArrayList<xj8> arrayList = this.E;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (xj8) p51.b(1, arrayList);
    }

    @Override // defpackage.jt1
    public final boolean c(boolean z) {
        Object objG0 = g0();
        if ((objG0 instanceof Boolean) && z == ((Boolean) objG0).booleanValue()) {
            return false;
        }
        D0(Boolean.valueOf(z));
        return true;
    }

    public final boolean c0() {
        if (!r() || this.w) {
            return true;
        }
        xj8 xj8VarB0 = b0();
        return (xj8VarB0 == null || (xj8VarB0.b & 4) == 0) ? false : true;
    }

    @Override // defpackage.jt1
    public final void d() {
        if (this.y && this.G.i == this.z) {
            this.z = -1;
            this.y = false;
        }
        U(false);
    }

    public final du1 d0() {
        if (this.b.l()) {
            return this.Q;
        }
        return null;
    }

    @Override // defpackage.jt1
    public final void e(int i) {
        u0(i, 0, null, null);
    }

    /* JADX WARN: Code duplicated, block: B:57:0x012e A[Catch: all -> 0x00ad, TryCatch #10 {all -> 0x00ad, blocks: (B:8:0x0010, B:10:0x0021, B:12:0x0058, B:19:0x006b, B:24:0x00a3, B:82:0x0205, B:28:0x00b1, B:29:0x00b4, B:15:0x005d, B:17:0x0063, B:18:0x0068, B:30:0x00b5, B:32:0x00bb, B:35:0x00c5, B:38:0x00cf, B:40:0x00d3, B:41:0x00d8, B:45:0x00e2, B:47:0x00ef, B:53:0x010f, B:55:0x0125, B:57:0x012e, B:59:0x0139, B:61:0x014a, B:66:0x0162, B:81:0x0202, B:109:0x0248, B:110:0x024b, B:64:0x014f, B:112:0x024d, B:113:0x0250, B:52:0x010d, B:48:0x00fd, B:44:0x00dd, B:114:0x0251, B:20:0x006f, B:22:0x0095, B:23:0x00a1, B:54:0x011c), top: B:141:0x0010, inners: #1, #8 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0139 A[Catch: all -> 0x00ad, TryCatch #10 {all -> 0x00ad, blocks: (B:8:0x0010, B:10:0x0021, B:12:0x0058, B:19:0x006b, B:24:0x00a3, B:82:0x0205, B:28:0x00b1, B:29:0x00b4, B:15:0x005d, B:17:0x0063, B:18:0x0068, B:30:0x00b5, B:32:0x00bb, B:35:0x00c5, B:38:0x00cf, B:40:0x00d3, B:41:0x00d8, B:45:0x00e2, B:47:0x00ef, B:53:0x010f, B:55:0x0125, B:57:0x012e, B:59:0x0139, B:61:0x014a, B:66:0x0162, B:81:0x0202, B:109:0x0248, B:110:0x024b, B:64:0x014f, B:112:0x024d, B:113:0x0250, B:52:0x010d, B:48:0x00fd, B:44:0x00dd, B:114:0x0251, B:20:0x006f, B:22:0x0095, B:23:0x00a1, B:54:0x011c), top: B:141:0x0010, inners: #1, #8 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0148  */
    /* JADX WARN: Code duplicated, block: B:63:0x014e  */
    /* JADX WARN: Code duplicated, block: B:64:0x014f A[Catch: all -> 0x00ad, TryCatch #10 {all -> 0x00ad, blocks: (B:8:0x0010, B:10:0x0021, B:12:0x0058, B:19:0x006b, B:24:0x00a3, B:82:0x0205, B:28:0x00b1, B:29:0x00b4, B:15:0x005d, B:17:0x0063, B:18:0x0068, B:30:0x00b5, B:32:0x00bb, B:35:0x00c5, B:38:0x00cf, B:40:0x00d3, B:41:0x00d8, B:45:0x00e2, B:47:0x00ef, B:53:0x010f, B:55:0x0125, B:57:0x012e, B:59:0x0139, B:61:0x014a, B:66:0x0162, B:81:0x0202, B:109:0x0248, B:110:0x024b, B:64:0x014f, B:112:0x024d, B:113:0x0250, B:52:0x010d, B:48:0x00fd, B:44:0x00dd, B:114:0x0251, B:20:0x006f, B:22:0x0095, B:23:0x00a1, B:54:0x011c), top: B:141:0x0010, inners: #1, #8 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0160  */
    /* JADX WARN: Code duplicated, block: B:79:0x01f0 A[Catch: all -> 0x0219, TRY_LEAVE, TryCatch #5 {all -> 0x0219, blocks: (B:77:0x01e5, B:79:0x01f0, B:101:0x0236, B:102:0x0238), top: B:131:0x01e5 }] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void e0(ArrayList arrayList) {
        yt1 yt1Var;
        vi4 vi4Var;
        vi4 vi4VarD;
        ArrayList arrayList2;
        yr9 yr9VarL1;
        yr9 yr9VarL2;
        yr9 yr9Var;
        int[] iArr;
        e27<kw7> e27Var;
        int[] iArr2;
        i81 i81Var;
        i81 i81Var2;
        i81 i81Var3;
        boolean z;
        i81 i81Var4;
        zr9 zr9Var;
        yt1 yt1Var2 = this.b;
        i81 i81Var5 = this.f;
        if (i81Var5 == null) {
            i81Var5 = null;
        }
        if (i81Var5 == null) {
            pt1.b("Inconsistent composition");
            fl.a();
            return;
        }
        lt1 lt1Var = this.M;
        i81 i81Var6 = lt1Var.b;
        try {
            lt1Var.b = i81Var5;
            i81Var5.x.i1(gk7.z.c);
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                js7 js7Var = (js7) arrayList.get(i2);
                final mz6 mz6Var = (mz6) js7Var.t;
                mz6 mz6Var2 = (mz6) js7Var.u;
                vi4 vi4VarD2 = od3.d(mz6Var.e);
                zr9 zr9VarE = bs9.e(mz6Var.d);
                int iH1 = zr9VarE.h1(vi4VarD2);
                hg5 hg5Var = new hg5(i);
                lt1Var.b();
                kk7 kk7Var = lt1Var.b.x;
                kk7Var.i1(gk7.g.c);
                kk7.b.b(kk7Var, i, hg5Var, 1, vi4VarD2);
                if (mz6Var2 == null) {
                    if (zr9VarE == this.H) {
                        if (!this.I.w) {
                            pt1.a("Check failed");
                        }
                        Z();
                    }
                    final yr9 yr9VarL3 = zr9VarE.l1();
                    try {
                        yr9VarL3.r(iH1);
                        lt1Var.f = iH1;
                        final i81 i81Var7 = new i81();
                        j0(null, null, null, hf3.t, new mh4() { // from class: xi4
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                i81 i81Var8 = i81Var7;
                                yr9 yr9Var2 = yr9VarL3;
                                mz6 mz6Var3 = mz6Var;
                                bj4 bj4Var = this.t;
                                lt1 lt1Var2 = bj4Var.M;
                                i81 i81Var9 = lt1Var2.b;
                                try {
                                    lt1Var2.b = i81Var8;
                                    yr9 yr9Var3 = bj4Var.G;
                                    int[] iArr3 = bj4Var.o;
                                    e27<kw7> e27Var2 = bj4Var.v;
                                    bj4Var.o = null;
                                    bj4Var.v = null;
                                    try {
                                        bj4Var.G = yr9Var2;
                                        boolean z2 = lt1Var2.e;
                                        try {
                                            lt1Var2.e = false;
                                            bj4Var.f0(mz6Var3.a, mz6Var3.g, mz6Var3.b);
                                            lt1Var2.e = z2;
                                            g2b g2bVar = g2b.a;
                                            bj4Var.G = yr9Var3;
                                            bj4Var.o = iArr3;
                                            bj4Var.v = e27Var2;
                                            lt1Var2.b = i81Var9;
                                            return g2b.a;
                                        } catch (Throwable th) {
                                            lt1Var2.e = z2;
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        bj4Var.G = yr9Var3;
                                        bj4Var.o = iArr3;
                                        bj4Var.v = e27Var2;
                                        throw th2;
                                    }
                                } catch (Throwable th3) {
                                    lt1Var2.b = i81Var9;
                                    throw th3;
                                }
                            }
                        });
                        i81 i81Var8 = lt1Var.b;
                        i81Var8.getClass();
                        if (!i81Var7.isEmpty()) {
                            kk7 kk7Var2 = i81Var8.x;
                            kk7Var2.i1(gk7.c.c);
                            kk7.b.b(kk7Var2, i, i81Var7, 1, hg5Var);
                        }
                        g2b g2bVar = g2b.a;
                        yr9VarL3.c();
                        yt1Var = yt1Var2;
                    } catch (Throwable th) {
                        yr9VarL3.c();
                        throw th;
                    }
                } else {
                    lz6 lz6VarO = yt1Var2.o(mz6Var2);
                    zr9 zr9VarE2 = lz6VarO != null ? bs9.e(lz6VarO.a) : null;
                    zr9 zr9VarE3 = zr9VarE2 == null ? bs9.e(mz6Var2.d) : zr9VarE2;
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            if (zr9VarE2 != null) {
                                                                if (zr9VarE2.D) {
                                                                    pt1.a("use active SlotWriter to create an anchor location instead");
                                                                }
                                                                if (zr9VarE2.y <= 0) {
                                                                    c78.a("Parameter index is out of range");
                                                                }
                                                                ArrayList<vi4> arrayList3 = zr9VarE2.F;
                                                                yt1Var = yt1Var2;
                                                                int iF = bs9.f(arrayList3, 0, zr9VarE2.y);
                                                                if (iF < 0) {
                                                                    vi4Var = new vi4(0);
                                                                    arrayList3.add(-(iF + 1), vi4Var);
                                                                } else {
                                                                    vi4Var = arrayList3.get(iF);
                                                                }
                                                                if (vi4Var != null) {
                                                                }
                                                                vi4VarD = od3.d(vi4Var);
                                                                arrayList2 = new ArrayList();
                                                                yr9VarL1 = zr9VarE3.l1();
                                                                ty.c(yr9VarL1, arrayList2, zr9VarE3.h1(vi4VarD));
                                                                g2b g2bVar2 = g2b.a;
                                                                yr9VarL1.c();
                                                                if (arrayList2.isEmpty()) {
                                                                    vi4VarD = vi4VarD;
                                                                } else {
                                                                    i81Var4 = lt1Var.b;
                                                                    i81Var4.getClass();
                                                                    if (!arrayList2.isEmpty()) {
                                                                        kk7 kk7Var3 = i81Var4.x;
                                                                        kk7Var3.i1(gk7.d.c);
                                                                        kk7.b.b(kk7Var3, 1, arrayList2, 0, hg5Var);
                                                                    }
                                                                    zr9Var = this.c;
                                                                    if (zr9VarE != zr9Var) {
                                                                        int iH2 = zr9Var.h1(vi4VarD2);
                                                                        B0(iH2, E0(iH2) + arrayList2.size());
                                                                    }
                                                                }
                                                                kk7 kk7Var4 = lt1Var.b.x;
                                                                kk7Var4.i1(gk7.e.c);
                                                                int i3 = kk7Var4.C - kk7Var4.x[kk7Var4.y - 1].b;
                                                                Object[] objArr = kk7Var4.B;
                                                                objArr[i3] = lz6VarO;
                                                                objArr[i3 + 1] = yt1Var;
                                                                objArr[i3 + 3] = mz6Var;
                                                                objArr[i3 + 2] = mz6Var2;
                                                                yr9VarL2 = zr9VarE3.l1();
                                                                yr9Var = this.G;
                                                                iArr = this.o;
                                                                e27Var = this.v;
                                                                this.o = null;
                                                                this.v = null;
                                                                this.G = yr9VarL2;
                                                                int iH3 = zr9VarE3.h1(od3.d(vi4VarD));
                                                                yr9VarL2.r(iH3);
                                                                lt1Var.f = iH3;
                                                                i81Var = new i81();
                                                                i81Var2 = lt1Var.b;
                                                                lt1Var.b = i81Var;
                                                                z = lt1Var.e;
                                                                lt1Var.e = false;
                                                                x02 x02Var = mz6Var2.c;
                                                                x02 x02Var2 = mz6Var.c;
                                                                Integer numValueOf = Integer.valueOf(yr9VarL2.g);
                                                                yr9VarL2 = yr9VarL2;
                                                                i81Var3 = i81Var2;
                                                                iArr2 = iArr;
                                                                e27Var = e27Var;
                                                                j0(x02Var, x02Var2, numValueOf, mz6Var2.f, new xu3(1, this, mz6Var));
                                                                lt1Var.e = z;
                                                                lt1Var.b = i81Var3;
                                                                i81Var3.getClass();
                                                                if (!i81Var.isEmpty()) {
                                                                    kk7 kk7Var5 = i81Var3.x;
                                                                    kk7Var5.i1(gk7.c.c);
                                                                    kk7.b.b(kk7Var5, 0, i81Var, 1, hg5Var);
                                                                }
                                                                this.G = yr9Var;
                                                                this.o = iArr2;
                                                                this.v = e27Var;
                                                                yr9VarL2.c();
                                                            } else {
                                                                yt1Var = yt1Var2;
                                                                lz6VarO = lz6VarO;
                                                            }
                                                            this.G = yr9Var;
                                                            this.o = iArr2;
                                                            this.v = e27Var;
                                                            yr9VarL2.c();
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            yr9VarL2.c();
                                                            throw th;
                                                        }
                                                        lt1Var.b = i81Var3;
                                                        i81Var3.getClass();
                                                        if (!i81Var.isEmpty()) {
                                                            kk7 kk7Var6 = i81Var3.x;
                                                            kk7Var6.i1(gk7.c.c);
                                                            kk7.b.b(kk7Var6, 0, i81Var, 1, hg5Var);
                                                        }
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        this.G = yr9Var;
                                                        this.o = iArr2;
                                                        this.v = e27Var;
                                                        throw th;
                                                    }
                                                    lt1Var.e = z;
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    lt1Var.b = i81Var3;
                                                    throw th;
                                                }
                                                j0(x02Var, x02Var2, numValueOf, mz6Var2.f, new xu3(1, this, mz6Var));
                                            } catch (Throwable th5) {
                                                th = th5;
                                                lt1Var.e = z;
                                                throw th;
                                            }
                                            yr9VarL2 = yr9VarL2;
                                            i81Var3 = i81Var2;
                                            iArr2 = iArr;
                                            e27Var = e27Var;
                                        } catch (Throwable th6) {
                                            th = th6;
                                            i81Var3 = i81Var2;
                                            iArr2 = iArr;
                                            lt1Var.e = z;
                                            throw th;
                                        }
                                        lt1Var.e = false;
                                        x02 x02Var3 = mz6Var2.c;
                                        x02 x02Var4 = mz6Var.c;
                                        Integer numValueOf2 = Integer.valueOf(yr9VarL2.g);
                                    } catch (Throwable th7) {
                                        th = th7;
                                        i81Var3 = i81Var2;
                                    }
                                    lt1Var.b = i81Var;
                                    z = lt1Var.e;
                                } catch (Throwable th8) {
                                    th = th8;
                                    e27Var = e27Var;
                                    i81Var3 = i81Var2;
                                    yr9VarL2 = yr9VarL2;
                                    iArr2 = iArr;
                                }
                                this.G = yr9VarL2;
                                int iH4 = zr9VarE3.h1(od3.d(vi4VarD));
                                yr9VarL2.r(iH4);
                                lt1Var.f = iH4;
                                i81Var = new i81();
                                i81Var2 = lt1Var.b;
                            } catch (Throwable th9) {
                                th = th9;
                                e27Var = e27Var;
                                yr9VarL2 = yr9VarL2;
                                iArr2 = iArr;
                            }
                            yr9Var = this.G;
                            iArr = this.o;
                            e27Var = this.v;
                            this.o = null;
                            this.v = null;
                        } catch (Throwable th10) {
                            th = th10;
                            yr9VarL2 = yr9VarL2;
                        }
                        ty.c(yr9VarL1, arrayList2, zr9VarE3.h1(vi4VarD));
                        g2b g2bVar3 = g2b.a;
                        yr9VarL1.c();
                        if (arrayList2.isEmpty()) {
                            i81Var4 = lt1Var.b;
                            i81Var4.getClass();
                            if (!arrayList2.isEmpty()) {
                                kk7 kk7Var7 = i81Var4.x;
                                kk7Var7.i1(gk7.d.c);
                                kk7.b.b(kk7Var7, 1, arrayList2, 0, hg5Var);
                            }
                            zr9Var = this.c;
                            if (zr9VarE != zr9Var) {
                                int iH5 = zr9Var.h1(vi4VarD2);
                                B0(iH5, E0(iH5) + arrayList2.size());
                            }
                        } else {
                            vi4VarD = vi4VarD;
                        }
                        kk7 kk7Var8 = lt1Var.b.x;
                        kk7Var8.i1(gk7.e.c);
                        int i4 = kk7Var8.C - kk7Var8.x[kk7Var8.y - 1].b;
                        Object[] objArr2 = kk7Var8.B;
                        objArr2[i4] = lz6VarO;
                        objArr2[i4 + 1] = yt1Var;
                        objArr2[i4 + 3] = mz6Var;
                        objArr2[i4 + 2] = mz6Var2;
                        yr9VarL2 = zr9VarE3.l1();
                    } catch (Throwable th11) {
                        yr9VarL1.c();
                        throw th11;
                    }
                    vi4Var = mz6Var2.e;
                    vi4VarD = od3.d(vi4Var);
                    arrayList2 = new ArrayList();
                    yr9VarL1 = zr9VarE3.l1();
                }
                lt1Var.b.x.i1(gk7.b0.c);
                i2++;
                size = size;
                yt1Var2 = yt1Var;
                i = 0;
            }
            lt1Var.b();
            lt1Var.b.x.i1(gk7.k.c);
            lt1Var.f = 0;
            lt1Var.b = i81Var6;
        } catch (Throwable th12) {
            lt1Var.b = i81Var6;
            throw th12;
        }
    }

    @Override // defpackage.jt1
    public final Object f() {
        boolean z = this.S;
        jt1.a.C0187a c0187a = jt1.a.a;
        if (!z) {
            Object objM = this.G.m();
            if (!this.y || (objM instanceof rv8)) {
                return objM instanceof jm8 ? ((jm8) objM).c() : objM;
            }
        } else if (this.r) {
            pt1.a("A call to createNode(), emitNode() or useNode() expected");
            return c0187a;
        }
        return c0187a;
    }

    public final void f0(final kz6 kz6Var, kw7 kw7Var, final Object obj) {
        p(126665345, kz6Var);
        g0();
        D0(obj);
        long j = this.T;
        int i = 0;
        try {
            this.T = 126665345L;
            if (this.S) {
                cs9.z(this.I);
            }
            boolean z = (this.S || xj5.a(this.G.f(), kw7Var)) ? false : true;
            if (z) {
                m0(kw7Var);
            }
            u0(202, 0, pt1.c, kw7Var);
            this.K = null;
            boolean z2 = this.w;
            this.w = z;
            oq3.c(this, new fr1(true, -59194059, new ci4(kz6Var, obj) { // from class: zi4
                public final /* synthetic */ Object t;

                {
                    this.t = obj;
                }

                @Override // defpackage.ci4
                public final Object invoke(Object obj2, Object obj3) {
                    jt1 jt1Var = (jt1) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if (jt1Var.A(iIntValue & 1, (iIntValue & 3) != 2)) {
                        throw null;
                    }
                    jt1Var.u();
                    return g2b.a;
                }
            }));
            this.w = z2;
            U(false);
            this.K = null;
            this.T = j;
            U(false);
        } catch (Throwable th) {
            try {
                nt3.e(th, new aj4(i, this));
                throw th;
            } catch (Throwable th2) {
                U(false);
                this.K = null;
                this.T = j;
                U(false);
                throw th2;
            }
        }
    }

    @Override // defpackage.jt1
    public final boolean g(float f) {
        Object objG0 = g0();
        if ((objG0 instanceof Float) && f == ((Number) objG0).floatValue()) {
            return false;
        }
        D0(Float.valueOf(f));
        return true;
    }

    public final Object g0() {
        boolean z = this.S;
        jt1.a.C0187a c0187a = jt1.a.a;
        if (!z) {
            Object objM = this.G.m();
            if (!this.y || (objM instanceof rv8)) {
                return objM;
            }
        } else if (this.r) {
            pt1.a("A call to createNode(), emitNode() or useNode() expected");
            return c0187a;
        }
        return c0187a;
    }

    @Override // defpackage.jt1
    public final boolean h(int i) {
        Object objG0 = g0();
        if ((objG0 instanceof Integer) && i == ((Number) objG0).intValue()) {
            return false;
        }
        D0(Integer.valueOf(i));
        return true;
    }

    public final List<at1> h0() {
        yt1 yt1Var = this.b;
        xt1 xt1VarI = yt1Var.i();
        gu1 gu1Var = xt1VarI != null ? (gu1) xt1VarI : null;
        if (gu1Var != null) {
            zr9 zr9Var = gu1Var.y;
            yr9 yr9VarL1 = bs9.e(zr9Var).l1();
            try {
                Integer numB = zs1.b(yr9VarL1, yt1Var, 0, yr9VarL1.c);
                yr9VarL1.c();
                if (numB != null) {
                    yr9 yr9VarL2 = bs9.e(zr9Var).l1();
                    try {
                        return th1.K(zs1.c(yr9VarL2, numB.intValue(), 0), gu1Var.O.h0());
                    } finally {
                        yr9VarL2.c();
                    }
                }
            } catch (Throwable th) {
                yr9VarL1.c();
                throw th;
            }
        }
        return hf3.t;
    }

    @Override // defpackage.jt1
    public final boolean i(long j) {
        Object objG0 = g0();
        if ((objG0 instanceof Long) && j == ((Number) objG0).longValue()) {
            return false;
        }
        D0(Long.valueOf(j));
        return true;
    }

    public final int i0(int i) {
        int iQ = this.G.q(i) + 1;
        int i2 = 0;
        while (iQ < i) {
            if (!this.G.k(iQ)) {
                i2++;
            }
            iQ += bs9.a(this.G.b, iQ);
        }
        return i2;
    }

    @Override // defpackage.jt1
    public final boolean j(Object obj) {
        if (g0() == obj) {
            return false;
        }
        D0(obj);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003b A[Catch: all -> 0x0022, TRY_LEAVE, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0005, B:5:0x0010, B:7:0x001e, B:11:0x0028, B:10:0x0024, B:14:0x002f, B:16:0x0035, B:18:0x003b), top: B:23:0x0005 }] */
    public final <R> R j0(x02 x02Var, x02 x02Var2, Integer num, List<? extends js7<xj8, ? extends Object>> list, mh4<? extends R> mh4Var) {
        R rInvoke;
        boolean z = this.F;
        int i = this.k;
        try {
            this.F = true;
            this.k = 0;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                js7<xj8, ? extends Object> js7Var = list.get(i2);
                xj8 xj8Var = js7Var.t;
                Object obj = js7Var.u;
                if (obj != null) {
                    z0(xj8Var, obj);
                } else {
                    z0(xj8Var, null);
                }
            }
            if (x02Var == null) {
                rInvoke = mh4Var.invoke();
            } else {
                rInvoke = (R) x02Var.d(x02Var2, num != null ? num.intValue() : -1, mh4Var);
                if (rInvoke == null) {
                    rInvoke = mh4Var.invoke();
                }
            }
            return rInvoke;
        } finally {
            this.F = z;
            this.k = i;
        }
    }

    @Override // defpackage.jt1
    public final <T> void k(mh4<? extends T> mh4Var) {
        if (!this.r) {
            pt1.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (!this.S) {
            pt1.a("createNode() can only be called when inserting");
        }
        mg5 mg5Var = this.n;
        int i = mg5Var.a[mg5Var.b - 1];
        cs9 cs9Var = this.I;
        vi4 vi4VarB = cs9Var.b(cs9Var.v);
        this.l++;
        o34 o34Var = this.O;
        kk7 kk7Var = o34Var.x;
        kk7Var.i1(gk7.o.c);
        kk7.b.a(kk7Var, 0, mh4Var);
        kk7Var.z[kk7Var.A - kk7Var.x[kk7Var.y - 1].a] = i;
        kk7.b.a(kk7Var, 1, vi4VarB);
        kk7 kk7Var2 = o34Var.y;
        kk7Var2.i1(gk7.t.c);
        kk7Var2.z[kk7Var2.A - kk7Var2.x[kk7Var2.y - 1].a] = i;
        kk7.b.a(kk7Var2, 0, vi4VarB);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003c  */
    /* JADX WARN: Code duplicated, block: B:172:0x035c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0136  */
    /* JADX WARN: Code duplicated, block: B:63:0x0144  */
    /* JADX WARN: Code duplicated, block: B:70:0x016f  */
    /* JADX WARN: Code duplicated, block: B:71:0x0171  */
    /* JADX WARN: Code duplicated, block: B:74:0x0176  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:75:0x0182
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void k0() {
        /*
            Method dump skipped, instruction units count: 914
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bj4.k0():void");
    }

    @Override // defpackage.jt1
    public final boolean l() {
        return this.S;
    }

    public final void l0() {
        o0(this.G.g);
        lt1 lt1Var = this.M;
        lt1Var.d(false);
        lt1Var.e();
        lt1Var.b.x.i1(gk7.x.c);
        int i = lt1Var.f;
        yr9 yr9Var = lt1Var.a.G;
        lt1Var.f = bs9.a(yr9Var.b, yr9Var.g) + i;
    }

    @Override // defpackage.jt1
    public final void m(Object obj) {
        if (!this.S && this.G.g() == 207 && !xj5.a(this.G.f(), obj) && this.z < 0) {
            this.z = this.G.g;
            this.y = true;
        }
        u0(207, 0, null, obj);
    }

    public final void m0(kw7 kw7Var) {
        e27<kw7> e27Var = this.v;
        if (e27Var == null) {
            e27Var = new e27<>();
            this.v = e27Var;
        }
        e27Var.i(this.G.g, kw7Var);
    }

    @Override // defpackage.jt1
    public final void n(boolean z) {
        if (this.l != 0) {
            pt1.a("No nodes can be emitted before calling deactivateToEndGroup");
        }
        if (this.S) {
            return;
        }
        if (!z) {
            t0();
            return;
        }
        yr9 yr9Var = this.G;
        int i = yr9Var.g;
        int i2 = yr9Var.h;
        lt1 lt1Var = this.M;
        lt1Var.getClass();
        lt1Var.d(false);
        lt1Var.b.x.i1(gk7.f.c);
        ty.a(this.s, i, i2);
        this.G.t();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001a  */
    public final void n0(int i, int i2, int i3) {
        yr9 yr9Var = this.G;
        if (i == i2) {
            i3 = i;
        } else if (i != i3 && i2 != i3) {
            if (yr9Var.q(i) == i2) {
                i3 = i2;
            } else if (yr9Var.q(i2) == i) {
                i3 = i;
            } else if (yr9Var.q(i) == yr9Var.q(i2)) {
                i3 = yr9Var.q(i);
            } else {
                int iQ = i;
                int i4 = 0;
                while (iQ > 0 && iQ != i3) {
                    iQ = yr9Var.q(iQ);
                    i4++;
                }
                int iQ2 = i2;
                int i5 = 0;
                while (iQ2 > 0 && iQ2 != i3) {
                    iQ2 = yr9Var.q(iQ2);
                    i5++;
                }
                int i6 = i4 - i5;
                int iQ3 = i;
                for (int i7 = 0; i7 < i6; i7++) {
                    iQ3 = yr9Var.q(iQ3);
                }
                int i8 = i5 - i4;
                int iQ4 = i2;
                for (int i9 = 0; i9 < i8; i9++) {
                    iQ4 = yr9Var.q(iQ4);
                }
                i3 = iQ3;
                for (int iQ5 = iQ4; i3 != iQ5; iQ5 = yr9Var.q(iQ5)) {
                    i3 = yr9Var.q(i3);
                }
            }
        }
        while (i > 0 && i != i3) {
            if (yr9Var.l(i)) {
                this.M.a();
            }
            i = yr9Var.q(i);
        }
        T(i2, i3);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0074  */
    @Override // defpackage.jt1
    public final bj4 o(int i) {
        xj8 xj8Var;
        boolean z;
        K(i);
        boolean z2 = this.S;
        ru1 ru1Var = this.g;
        ArrayList<xj8> arrayList = this.E;
        gu1 gu1Var = this.h;
        if (z2) {
            gu1Var.getClass();
            xj8 xj8Var2 = new xj8(gu1Var);
            arrayList.add(xj8Var2);
            D0(xj8Var2);
            xj8Var2.e = this.B;
            xj8Var2.b &= -17;
            ru1Var.a();
            return this;
        }
        int i2 = this.G.i;
        ArrayList arrayList2 = this.s;
        int iD = ty.d(i2, arrayList2);
        kk5 kk5Var = iD >= 0 ? (kk5) arrayList2.remove(iD) : null;
        Object objM = this.G.m();
        if (xj5.a(objM, jt1.a.a)) {
            gu1Var.getClass();
            xj8Var = new xj8(gu1Var);
            D0(xj8Var);
        } else {
            objM.getClass();
            xj8Var = (xj8) objM;
        }
        if (kk5Var == null) {
            int i3 = xj8Var.b;
            boolean z3 = (i3 & 64) != 0;
            if (z3) {
                xj8Var.b = i3 & (-65);
            }
            if (z3) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        int i4 = xj8Var.b;
        xj8Var.b = z ? i4 | 8 : i4 & (-9);
        arrayList.add(xj8Var);
        xj8Var.e = this.B;
        xj8Var.b &= -17;
        ru1Var.a();
        int i5 = xj8Var.b;
        if ((i5 & 256) != 0) {
            xj8Var.b = (i5 & (-257)) | 512;
            kk7 kk7Var = this.M.b.x;
            kk7Var.i1(gk7.c0.c);
            kk7.b.a(kk7Var, 0, xj8Var);
            if (!this.y) {
                int i6 = xj8Var.b;
                if ((i6 & 128) != 0) {
                    this.y = true;
                    this.z = this.G.i;
                    xj8Var.b = i6 | 1024;
                }
            }
        }
        return this;
    }

    public final void o0(int i) {
        boolean zL = this.G.l(i);
        lt1 lt1Var = this.M;
        if (zL) {
            lt1Var.c();
            Object objN = this.G.n(i);
            lt1Var.c();
            lt1Var.h.add(objN);
        }
        r0(this, i, i, zL, 0);
        lt1Var.c();
        if (zL) {
            lt1Var.a();
        }
    }

    @Override // defpackage.jt1
    public final void p(int i, Object obj) {
        u0(i, 0, obj, null);
    }

    @Override // defpackage.jt1
    public final void q() {
        u0(125, 2, null, null);
        this.r = true;
    }

    @Override // defpackage.jt1
    public final boolean r() {
        xj8 xj8VarB0;
        return (this.S || this.y || this.w || (xj8VarB0 = b0()) == null || (xj8VarB0.b & 8) != 0) ? false : true;
    }

    @Override // defpackage.jt1
    public final p20<?> s() {
        return this.a;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0093  */
    /* JADX WARN: Code duplicated, block: B:30:0x009f  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ea  */
    public final void s0() {
        long jRotateLeft;
        if (this.s.isEmpty()) {
            this.l = this.G.s() + this.l;
            return;
        }
        yr9 yr9Var = this.G;
        int iG = yr9Var.g();
        int[] iArr = yr9Var.b;
        int i = yr9Var.g;
        Object objP = i < yr9Var.h ? yr9Var.p(iArr, i) : null;
        Object objF = yr9Var.f();
        int i2 = this.m;
        jt1.a.C0187a c0187a = jt1.a.a;
        if (objP == null) {
            if (objF == null || iG != 207 || objF.equals(c0187a)) {
                jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) iG), 3) ^ ((long) i2);
            } else {
                this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) objF.hashCode()), 3) ^ ((long) i2);
            }
            x0(null, (iArr[(yr9Var.g * 5) + 1] & 1073741824) != 0);
            k0();
            yr9Var.e();
            if (objP != null) {
                if (objP instanceof Enum) {
                    this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((long) ((Enum) objP).ordinal()), 3);
                } else {
                    this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((long) objP.hashCode()), 3);
                }
            }
            if (objF == null && iG == 207 && !objF.equals(c0187a)) {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i2), 3) ^ ((long) objF.hashCode()), 3);
                return;
            } else {
                this.T = Long.rotateRight(((long) iG) ^ Long.rotateRight(this.T ^ ((long) i2), 3), 3);
            }
        }
        jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) (objP instanceof Enum ? ((Enum) objP).ordinal() : objP.hashCode())), 3);
        this.T = jRotateLeft;
        x0(null, (iArr[(yr9Var.g * 5) + 1] & 1073741824) != 0);
        k0();
        yr9Var.e();
        if (objP != null) {
            if (objF == null) {
            }
            this.T = Long.rotateRight(((long) iG) ^ Long.rotateRight(this.T ^ ((long) i2), 3), 3);
        } else if (objP instanceof Enum) {
            this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((long) ((Enum) objP).ordinal()), 3);
        } else {
            this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((long) objP.hashCode()), 3);
        }
    }

    @Override // defpackage.jt1
    public final void t(vj8 vj8Var) {
        xj8 xj8Var = vj8Var instanceof xj8 ? (xj8) vj8Var : null;
        if (xj8Var != null) {
            xj8Var.b |= 1;
        }
    }

    public final void t0() {
        yr9 yr9Var = this.G;
        int i = yr9Var.i;
        this.l = i >= 0 ? yr9Var.b[(i * 5) + 1] & 67108863 : 0;
        yr9Var.t();
    }

    @Override // defpackage.jt1
    public final void u() {
        if (this.l != 0) {
            pt1.a("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.S) {
            return;
        }
        xj8 xj8VarB0 = b0();
        if (xj8VarB0 != null) {
            int i = xj8VarB0.b;
            if ((i & 128) == 0) {
                xj8VarB0.b = i | 16;
            }
        }
        if (this.s.isEmpty()) {
            t0();
        } else {
            k0();
        }
    }

    /* JADX WARN: Code duplicated, block: B:162:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:165:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:168:0x0315  */
    /* JADX WARN: Code duplicated, block: B:169:0x031b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:170:0x031d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:172:0x0321  */
    /* JADX WARN: Code duplicated, block: B:174:0x0328  */
    /* JADX WARN: Code duplicated, block: B:176:0x032b  */
    /* JADX WARN: Code duplicated, block: B:177:0x032d  */
    /* JADX WARN: Code duplicated, block: B:181:0x0359  */
    /* JADX WARN: Code duplicated, block: B:182:0x035b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:25:0x007a  */
    /* JADX WARN: Code duplicated, block: B:26:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0082  */
    /* JADX WARN: Code duplicated, block: B:31:0x008f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0097  */
    /* JADX WARN: Code duplicated, block: B:36:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x009e  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:66:0x010b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0111  */
    /* JADX WARN: Code duplicated, block: B:71:0x0125  */
    /* JADX WARN: Code duplicated, block: B:72:0x0129  */
    /* JADX WARN: Code duplicated, block: B:77:0x014d  */
    /* JADX WARN: Code duplicated, block: B:79:0x0155  */
    /* JADX WARN: Code duplicated, block: B:80:0x015f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0173  */
    /* JADX WARN: Code duplicated, block: B:84:0x0175  */
    /* JADX WARN: Code duplicated, block: B:86:0x0179  */
    /* JADX WARN: Code duplicated, block: B:88:0x0186  */
    /* JADX WARN: Code duplicated, block: B:91:0x018e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0197  */
    public final void u0(int i, int i2, Object obj, Object obj2) {
        long jRotateLeft;
        boolean z;
        boolean z2;
        boolean z3;
        ij4 ij4Var;
        ij4 ij4Var2;
        ArrayList arrayList;
        e27<bp4> e27Var;
        int i3;
        Object objValueOf;
        c37<Object, Object> c37Var;
        Object objD;
        t27 t27Var;
        cs9 cs9Var;
        int i4;
        Object obj3;
        int i5;
        int i6;
        Object[] objArr;
        Object[] objArr2;
        int i7;
        int i8;
        yr9 yr9Var;
        int[] iArr;
        ArrayList arrayList2;
        int i9;
        int i10;
        int i11;
        yr9 yr9Var2;
        int i12;
        Object objP;
        cs9 cs9Var2;
        int i13;
        ij4 ij4Var3;
        Object obj4 = obj;
        if (this.r) {
            pt1.a("A call to createNode(), emitNode() or useNode() expected");
        }
        int i14 = this.m;
        Object obj5 = jt1.a.a;
        if (obj4 == null) {
            if (obj2 == null || i != 207 || obj2.equals(obj5)) {
                jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) i), 3) ^ ((long) i14);
            } else {
                this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) obj2.hashCode()), 3) ^ ((long) i14);
            }
            if (obj4 == null) {
                this.m++;
            }
            if (i2 != 0) {
                z = true;
            } else {
                z = false;
            }
            if (this.S) {
                this.G.k++;
                cs9Var2 = this.I;
                i13 = cs9Var2.t;
                if (z) {
                    cs9Var2.S(i, obj5, true, obj5);
                } else if (obj2 != null) {
                    if (obj4 == null) {
                        obj4 = obj5;
                    }
                    cs9Var2.S(i, obj4, false, obj2);
                } else {
                    if (obj4 == null) {
                        obj4 = obj5;
                    }
                    cs9Var2.S(i, obj4, false, obj5);
                }
                ij4Var3 = this.j;
                if (ij4Var3 != null) {
                    int i15 = (-2) - i13;
                    po5 po5Var = new po5(-1, i, i15, -1);
                    ij4Var3.e.i(i15, new bp4(-1, this.k - ij4Var3.b, 0));
                    ij4Var3.d.add(po5Var);
                }
                Y(z, null);
                return;
            }
            if (i2 != 1 && this.y) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.j == null) {
                int iG = this.G.g();
                if (!z2 && iG == i) {
                    yr9Var2 = this.G;
                    i12 = yr9Var2.g;
                    if (i12 < yr9Var2.h) {
                        objP = yr9Var2.p(yr9Var2.b, i12);
                    } else {
                        objP = null;
                    }
                    if (xj5.a(obj4, objP)) {
                        x0(obj2, z);
                        z3 = z2;
                    }
                }
                yr9Var = this.G;
                iArr = yr9Var.b;
                arrayList2 = new ArrayList();
                if (yr9Var.k <= 0) {
                    i9 = yr9Var.g;
                    while (i9 < yr9Var.h) {
                        int i16 = i9 * 5;
                        int i17 = iArr[i16];
                        Object objP2 = yr9Var.p(iArr, i9);
                        i10 = iArr[i16 + 1];
                        if ((i10 & 1073741824) != 0) {
                            i11 = 1;
                        } else {
                            i11 = i10 & 67108863;
                        }
                        arrayList2.add(new po5(objP2, i17, i9, i11));
                        i9 += iArr[i16 + 3];
                        z2 = z2;
                    }
                }
                z3 = z2;
                this.j = new ij4(this.k, arrayList2);
            } else {
                z3 = z2;
            }
            ij4Var = this.j;
            if (ij4Var != null) {
                arrayList = ij4Var.d;
                e27Var = ij4Var.e;
                i3 = ij4Var.b;
                if (obj4 != null) {
                    objValueOf = new ol5(Integer.valueOf(i), obj4);
                } else {
                    objValueOf = Integer.valueOf(i);
                }
                c37Var = ((y07) ij4Var.f.getValue()).a;
                objD = c37Var.d(objValueOf);
                if (objD == null) {
                    objD = null;
                } else if (objD instanceof t27) {
                    t27Var = (t27) objD;
                    Object objL = t27Var.l(0);
                    if (t27Var.d()) {
                        c37Var.k(objValueOf);
                    }
                    if (t27Var.b == 1) {
                        c37Var.m(objValueOf, t27Var.a());
                    }
                    objD = objL;
                } else {
                    c37Var.k(objValueOf);
                }
                po5 po5Var2 = (po5) objD;
                if (!z3 || po5Var2 == null) {
                    this.G.k++;
                    this.S = true;
                    this.K = null;
                    if (this.I.w) {
                        cs9 cs9VarM1 = this.H.m1();
                        this.I = cs9VarM1;
                        cs9VarM1.O();
                        this.J = false;
                        this.K = null;
                    }
                    this.I.d();
                    cs9Var = this.I;
                    int i18 = cs9Var.t;
                    if (z) {
                        cs9Var.S(i, obj5, true, obj5);
                        i4 = 0;
                    } else if (obj2 != null) {
                        if (obj != null) {
                            obj5 = obj;
                        }
                        i4 = 0;
                        cs9Var.S(i, obj5, false, obj2);
                    } else {
                        i4 = 0;
                        if (obj == null) {
                            obj3 = obj5;
                        } else {
                            obj3 = obj;
                        }
                        cs9Var.S(i, obj3, false, obj5);
                    }
                    this.N = this.I.b(i18);
                    int i19 = (-2) - i18;
                    po5 po5Var3 = new po5(-1, i, i19, -1);
                    e27Var.i(i19, new bp4(-1, this.k - i3, i4));
                    arrayList.add(po5Var3);
                    ArrayList arrayList3 = new ArrayList();
                    if (z) {
                        i5 = i4;
                    } else {
                        i5 = this.k;
                    }
                    ij4Var2 = new ij4(i5, arrayList3);
                } else {
                    int i20 = po5Var2.c;
                    arrayList.add(po5Var2);
                    bp4 bp4VarB = e27Var.b(i20);
                    this.k = (bp4VarB != null ? bp4VarB.b : -1) + i3;
                    bp4 bp4VarB2 = e27Var.b(i20);
                    int i21 = bp4VarB2 != null ? bp4VarB2.a : -1;
                    int i22 = ij4Var.c;
                    int i23 = i21 - i22;
                    int i24 = 8;
                    if (i21 <= i22) {
                        i6 = i23;
                        if (i22 > i21) {
                            Object[] objArr3 = e27Var.c;
                            long[] jArr = e27Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i25 = 0;
                                while (true) {
                                    long j = jArr[i25];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i26 = 8 - ((~(i25 - length)) >>> 31);
                                        int i27 = 0;
                                        while (i27 < i26) {
                                            if ((j & 255) >= 128) {
                                                objArr2 = objArr3;
                                            } else {
                                                bp4 bp4Var = (bp4) objArr3[(i25 << 3) + i27];
                                                int i28 = bp4Var.a;
                                                if (i28 == i21) {
                                                    bp4Var.a = i22;
                                                    objArr2 = objArr3;
                                                } else {
                                                    objArr2 = objArr3;
                                                    if (i21 + 1 <= i28 && i28 < i22) {
                                                        bp4Var.a = i28 - 1;
                                                    }
                                                }
                                            }
                                            j >>= 8;
                                            i27++;
                                            objArr3 = objArr2;
                                        }
                                        objArr = objArr3;
                                        if (i26 != 8) {
                                            break;
                                        }
                                    } else {
                                        objArr = objArr3;
                                    }
                                    if (i25 == length) {
                                        break;
                                    }
                                    i25++;
                                    objArr3 = objArr;
                                }
                            }
                        }
                    } else {
                        Object[] objArr4 = e27Var.c;
                        long[] jArr2 = e27Var.a;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i29 = 0;
                            while (true) {
                                long j2 = jArr2[i29];
                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i30 = 8 - ((~(i29 - length2)) >>> 31);
                                    int i31 = 0;
                                    while (i31 < i30) {
                                        if ((j2 & 255) < 128) {
                                            i8 = i24;
                                            bp4 bp4Var2 = (bp4) objArr4[(i29 << 3) + i31];
                                            i7 = i23;
                                            int i32 = bp4Var2.a;
                                            if (i32 == i21) {
                                                bp4Var2.a = i22;
                                            } else if (i22 <= i32 && i32 < i21) {
                                                bp4Var2.a = i32 + 1;
                                            }
                                        } else {
                                            i7 = i23;
                                            i8 = i24;
                                        }
                                        j2 >>= i8;
                                        i31++;
                                        i23 = i7;
                                        i24 = i8;
                                    }
                                    i6 = i23;
                                    if (i30 != i24) {
                                        break;
                                    }
                                } else {
                                    i6 = i23;
                                }
                                if (i29 == length2) {
                                    break;
                                }
                                i29++;
                                i23 = i6;
                                i24 = 8;
                            }
                        } else {
                            i6 = i23;
                        }
                    }
                    lt1 lt1Var = this.M;
                    lt1Var.f = (i20 - lt1Var.a.G.g) + lt1Var.f;
                    this.G.r(i20);
                    if (i6 > 0) {
                        lt1Var.d(false);
                        lt1Var.e();
                        kk7 kk7Var = lt1Var.b.x;
                        kk7Var.i1(gk7.r.c);
                        kk7Var.z[kk7Var.A - kk7Var.x[kk7Var.y - 1].a] = i6;
                    }
                    x0(obj2, z);
                    ij4Var2 = null;
                }
            } else {
                ij4Var2 = null;
            }
            Y(z, ij4Var2);
        }
        jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) (obj4 instanceof Enum ? ((Enum) obj4).ordinal() : obj4.hashCode())), 3);
        this.T = jRotateLeft;
        if (obj4 == null) {
            this.m++;
        }
        if (i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.S) {
            this.G.k++;
            cs9Var2 = this.I;
            i13 = cs9Var2.t;
            if (z) {
                cs9Var2.S(i, obj5, true, obj5);
            } else if (obj2 != null) {
                if (obj4 == null) {
                    obj4 = obj5;
                }
                cs9Var2.S(i, obj4, false, obj2);
            } else {
                if (obj4 == null) {
                    obj4 = obj5;
                }
                cs9Var2.S(i, obj4, false, obj5);
            }
            ij4Var3 = this.j;
            if (ij4Var3 != null) {
                int i110 = (-2) - i13;
                po5 po5Var4 = new po5(-1, i, i110, -1);
                ij4Var3.e.i(i110, new bp4(-1, this.k - ij4Var3.b, 0));
                ij4Var3.d.add(po5Var4);
            }
            Y(z, null);
            return;
        }
        if (i2 != 1) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.j == null) {
            int iG2 = this.G.g();
            if (!z2) {
                yr9Var2 = this.G;
                i12 = yr9Var2.g;
                if (i12 < yr9Var2.h) {
                    objP = yr9Var2.p(yr9Var2.b, i12);
                } else {
                    objP = null;
                }
                if (xj5.a(obj4, objP)) {
                    x0(obj2, z);
                    z3 = z2;
                }
            }
            yr9Var = this.G;
            iArr = yr9Var.b;
            arrayList2 = new ArrayList();
            if (yr9Var.k <= 0) {
                i9 = yr9Var.g;
                while (i9 < yr9Var.h) {
                    int i111 = i9 * 5;
                    int i112 = iArr[i111];
                    Object objP3 = yr9Var.p(iArr, i9);
                    i10 = iArr[i111 + 1];
                    if ((i10 & 1073741824) != 0) {
                        i11 = 1;
                    } else {
                        i11 = i10 & 67108863;
                    }
                    arrayList2.add(new po5(objP3, i112, i9, i11));
                    i9 += iArr[i111 + 3];
                    z2 = z2;
                }
            }
            z3 = z2;
            this.j = new ij4(this.k, arrayList2);
        } else {
            z3 = z2;
        }
        ij4Var = this.j;
        if (ij4Var != null) {
            arrayList = ij4Var.d;
            e27Var = ij4Var.e;
            i3 = ij4Var.b;
            if (obj4 != null) {
                objValueOf = new ol5(Integer.valueOf(i), obj4);
            } else {
                objValueOf = Integer.valueOf(i);
            }
            c37Var = ((y07) ij4Var.f.getValue()).a;
            objD = c37Var.d(objValueOf);
            if (objD == null) {
                objD = null;
            } else if (objD instanceof t27) {
                t27Var = (t27) objD;
                Object objL2 = t27Var.l(0);
                if (t27Var.d()) {
                    c37Var.k(objValueOf);
                }
                if (t27Var.b == 1) {
                    c37Var.m(objValueOf, t27Var.a());
                }
                objD = objL2;
            } else {
                c37Var.k(objValueOf);
            }
            po5 po5Var5 = (po5) objD;
            if (z3) {
            }
            this.G.k++;
            this.S = true;
            this.K = null;
            if (this.I.w) {
                cs9 cs9VarM2 = this.H.m1();
                this.I = cs9VarM2;
                cs9VarM2.O();
                this.J = false;
                this.K = null;
            }
            this.I.d();
            cs9Var = this.I;
            int i113 = cs9Var.t;
            if (z) {
                cs9Var.S(i, obj5, true, obj5);
                i4 = 0;
            } else if (obj2 != null) {
                if (obj != null) {
                    obj5 = obj;
                }
                i4 = 0;
                cs9Var.S(i, obj5, false, obj2);
            } else {
                i4 = 0;
                if (obj == null) {
                    obj3 = obj5;
                } else {
                    obj3 = obj;
                }
                cs9Var.S(i, obj3, false, obj5);
            }
            this.N = this.I.b(i113);
            int i114 = (-2) - i113;
            po5 po5Var6 = new po5(-1, i, i114, -1);
            e27Var.i(i114, new bp4(-1, this.k - i3, i4));
            arrayList.add(po5Var6);
            ArrayList arrayList4 = new ArrayList();
            if (z) {
                i5 = i4;
            } else {
                i5 = this.k;
            }
            ij4Var2 = new ij4(i5, arrayList4);
        } else {
            ij4Var2 = null;
        }
        Y(z, ij4Var2);
    }

    @Override // defpackage.jt1
    public final long v() {
        return this.T;
    }

    public final void v0() {
        u0(-127, 0, null, null);
    }

    @Override // defpackage.jt1
    public final void w(mh4<g2b> mh4Var) {
        kk7 kk7Var = this.M.b.x;
        kk7Var.i1(gk7.a0.c);
        kk7.b.a(kk7Var, 0, mh4Var);
    }

    public final void w0(int i, fk7 fk7Var) {
        u0(i, 0, fk7Var, null);
    }

    @Override // defpackage.jt1
    public final h72 x() {
        return this.R;
    }

    public final void x0(Object obj, boolean z) {
        if (z) {
            yr9 yr9Var = this.G;
            if (yr9Var.k <= 0) {
                if ((yr9Var.b[(yr9Var.g * 5) + 1] & 1073741824) == 0) {
                    c78.a("Expected a node group");
                }
                yr9Var.u();
                return;
            }
            return;
        }
        if (obj != null && this.G.f() != obj) {
            lt1 lt1Var = this.M;
            lt1Var.getClass();
            lt1Var.d(false);
            kk7 kk7Var = lt1Var.b.x;
            kk7Var.i1(gk7.f0.c);
            kk7.b.a(kk7Var, 0, obj);
        }
        this.G.u();
    }

    @Override // defpackage.jt1
    public final kw7 y() {
        return P();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void y0() {
        this.m = 0;
        this.G = this.c.l1();
        u0(100, 0, null, null);
        yt1 yt1Var = this.b;
        yt1Var.v();
        kw7 kw7VarJ = yt1Var.j();
        this.x.c(this.w ? 1 : 0);
        this.w = J(kw7VarJ);
        this.K = null;
        if (!this.q) {
            this.q = yt1Var.f();
        }
        if (!this.C) {
            this.C = yt1Var.g();
        }
        if (this.C) {
            y0a y0aVar = fu1.a;
            y0aVar.getClass();
            kw7VarJ = kw7VarJ.x0(y0aVar, new b1a(d0()));
        }
        this.u = kw7VarJ;
        Set<au1> set = (Set) pu1.a(kw7VarJ, oe5.a);
        if (set != null) {
            set.add(a0());
            yt1Var.q(set);
        }
        u0(Long.hashCode(yt1Var.h()), 0, null, null);
    }

    @Override // defpackage.jt1
    public final void z() {
        if (!this.r) {
            pt1.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (this.S) {
            pt1.a("useNode() called while inserting");
        }
        yr9 yr9Var = this.G;
        Object objN = yr9Var.n(yr9Var.i);
        lt1 lt1Var = this.M;
        lt1Var.c();
        lt1Var.h.add(objN);
        if (this.y && (objN instanceof ls1)) {
            lt1Var.b();
            lt1Var.b.x.i1(gk7.j0.c);
        }
    }

    public final boolean z0(xj8 xj8Var, Object obj) {
        vi4 vi4Var = xj8Var.c;
        if (vi4Var == null) {
            return false;
        }
        int iH1 = this.G.a.h1(od3.d(vi4Var));
        if (!this.F || iH1 < this.G.g) {
            return false;
        }
        ArrayList arrayList = this.s;
        int iD = ty.d(iH1, arrayList);
        if (iD < 0) {
            int i = -(iD + 1);
            if (!(obj instanceof ny2)) {
                obj = null;
            }
            arrayList.add(i, new kk5(xj8Var, iH1, obj));
            return true;
        }
        kk5 kk5Var = (kk5) arrayList.get(iD);
        if (!(obj instanceof ny2)) {
            kk5Var.c = null;
            return true;
        }
        Object obj2 = kk5Var.c;
        if (obj2 == null) {
            kk5Var.c = obj;
            return true;
        }
        if (obj2 instanceof d37) {
            ((d37) obj2).a(obj);
            return true;
        }
        d37<Object> d37Var = a49.a;
        d37 d37Var2 = new d37(2);
        d37Var2.k(obj2);
        d37Var2.k(obj);
        kk5Var.c = d37Var2;
        return true;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements im8 {
        public final b t;

        public a(b bVar) {
            this.t = bVar;
        }

        @Override // defpackage.im8
        public final void b() {
            this.t.y();
        }

        @Override // defpackage.im8
        public final void c() {
            this.t.y();
        }

        @Override // defpackage.im8
        public final void d() {
        }
    }
}
