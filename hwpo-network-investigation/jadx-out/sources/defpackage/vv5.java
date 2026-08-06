package defpackage;

import defpackage.uw5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vv5<T extends uw5> {
    public kw5 b;
    public int c;
    public b j;
    public final c37<Object, vv5<T>.c> a = z39.b();
    public final d37<Object> d = a49.a();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();
    public final ox6 k = new a(this);

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends vx6<b> {
        public final vv5<?> t;

        public a(vv5<?> vv5Var) {
            this.t = vv5Var;
        }

        @Override // defpackage.vx6
        public final ox6.c a() {
            b bVar = new b();
            bVar.H = this.t;
            return bVar;
        }

        @Override // defpackage.vx6
        public final void b(ox6.c cVar) {
            b bVar = (b) cVar;
            vv5<?> vv5Var = bVar.H;
            vv5<?> vv5Var2 = this.t;
            if (xj5.a(vv5Var, vv5Var2) || !bVar.t.G) {
                return;
            }
            vv5<?> vv5Var3 = bVar.H;
            vv5Var3.e();
            vv5Var3.b = null;
            vv5Var3.c = -1;
            vv5Var2.j = bVar;
            bVar.H = vv5Var2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && xj5.a(this.t, ((a) obj).t);
        }

        public final int hashCode() {
            return this.t.hashCode();
        }

        public final String toString() {
            return "DisplayingDisappearingItemsElement(animator=" + this.t + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends ox6.c implements a73 {
        public vv5<?> H;

        public b() {
            throw null;
        }

        @Override // ox6.c
        public final void U1() {
            this.H.j = this;
        }

        @Override // ox6.c
        public final void V1() {
            vv5<?> vv5Var = this.H;
            vv5Var.e();
            vv5Var.b = null;
            vv5Var.c = -1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && xj5.a(this.H, ((b) obj).H);
        }

        public final int hashCode() {
            return this.H.hashCode();
        }

        @Override // defpackage.a73
        public final void t(tr5 tr5Var) {
            s41 s41Var = tr5Var.t;
            ArrayList arrayList = this.H.i;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                sv5 sv5Var = (sv5) arrayList.get(i);
                ko4 ko4Var = sv5Var.m;
                if (ko4Var != null) {
                    long j = sv5Var.l;
                    long j2 = ko4Var.t;
                    float f = ((int) (j >> 32)) - ((int) (j2 >> 32));
                    float f2 = ((int) (j & 4294967295L)) - ((int) (4294967295L & j2));
                    s41Var.u.a.f(f, f2);
                    try {
                        oo4.a(tr5Var, ko4Var);
                        s41Var.u.a.f(-f, -f2);
                    } catch (Throwable th) {
                        s41Var.u.a.f(-f, -f2);
                        throw th;
                    }
                }
            }
            tr5Var.K1();
        }

        public final String toString() {
            return "DisplayingDisappearingItemsNode(animator=" + this.H + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class c {
        public xx1 b;
        public int c;
        public int d;
        public int f;
        public int g;
        public sv5[] a = bw5.a;
        public int e = 1;

        public c() {
        }

        public static void b(c cVar, uw5 uw5Var, t72 t72Var, jo4 jo4Var, int i, int i2) {
            vv5.this.getClass();
            long jN = uw5Var.n(0);
            cVar.a(uw5Var, t72Var, jo4Var, i, i2, (int) (!uw5Var.l() ? jN & 4294967295L : jN >> 32));
        }

        public final void a(T t, t72 t72Var, jo4 jo4Var, int i, int i2, int i3) {
            sv5[] sv5VarArr;
            sv5[] sv5VarArr2 = this.a;
            int length = sv5VarArr2.length;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    this.f = i;
                    this.g = i2;
                    break;
                } else {
                    sv5 sv5Var = sv5VarArr2[i5];
                    if (sv5Var != null && sv5Var.f) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            int iB = t.b();
            int length2 = this.a.length;
            while (true) {
                sv5VarArr = this.a;
                if (iB >= length2) {
                    break;
                }
                sv5 sv5Var2 = sv5VarArr[iB];
                if (sv5Var2 != null) {
                    sv5Var2.d();
                }
                iB++;
            }
            if (sv5VarArr.length != t.b()) {
                this.a = (sv5[]) Arrays.copyOf(this.a, t.b());
            }
            this.b = new xx1(t.c());
            this.c = i3;
            this.d = t.d();
            this.e = t.i();
            int iB2 = t.b();
            for (int i6 = 0; i6 < iB2; i6++) {
                Object objJ = t.j(i6);
                jv5 jv5Var = objJ instanceof jv5 ? (jv5) objJ : null;
                sv5[] sv5VarArr3 = this.a;
                if (jv5Var == null) {
                    sv5 sv5Var3 = sv5VarArr3[i6];
                    if (sv5Var3 != null) {
                        sv5Var3.d();
                    }
                    this.a[i6] = null;
                } else {
                    sv5 sv5Var4 = sv5VarArr3[i6];
                    if (sv5Var4 == null) {
                        sv5Var4 = new sv5(t72Var, jo4Var, new wv5(i4, vv5.this));
                        this.a[i6] = sv5Var4;
                    }
                    sv5Var4.d = jv5Var.H;
                    sv5Var4.e = jv5Var.I;
                }
            }
        }
    }

    public static void c(uw5 uw5Var, int i, c cVar) {
        int i2 = 0;
        long jN = uw5Var.n(0);
        long jA = uw5Var.l() ? bg5.a(0, i, 1, jN) : bg5.a(i, 0, 2, jN);
        sv5[] sv5VarArr = cVar.a;
        int length = sv5VarArr.length;
        int i3 = 0;
        while (i2 < length) {
            sv5 sv5Var = sv5VarArr[i2];
            int i4 = i3 + 1;
            if (sv5Var != null) {
                sv5Var.k = bg5.d(jA, bg5.c(uw5Var.n(i3), jN));
            }
            i2++;
            i3 = i4;
        }
    }

    public static int h(int[] iArr, uw5 uw5Var) {
        int iD = uw5Var.d();
        int i = uw5Var.i() + iD;
        int iMax = 0;
        while (iD < i) {
            int iG = uw5Var.g() + iArr[iD];
            iArr[iD] = iG;
            iMax = Math.max(iMax, iG);
            iD++;
        }
        return iMax;
    }

    public final sv5 a(int i, Object obj) {
        vv5<T>.c cVarD = this.a.d(obj);
        if (cVarD != null) {
            return cVarD.a[i];
        }
        return null;
    }

    public final long b() {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            sv5 sv5Var = (sv5) arrayList.get(i);
            ko4 ko4Var = sv5Var.m;
            if (ko4Var != null) {
                int iMax = Math.max((int) (jMax >> 32), ((int) (sv5Var.k >> 32)) + ((int) (ko4Var.u >> 32)));
                jMax = (((long) Math.max((int) (jMax & 4294967295L), ((int) (sv5Var.k & 4294967295L)) + ((int) (ko4Var.u & 4294967295L)))) & 4294967295L) | (((long) iMax) << 32);
            }
        }
        return jMax;
    }

    /* JADX WARN: Code duplicated, block: B:262:0x00c9 A[EDGE_INSN: B:262:0x00c9->B:49:0x00c9 BREAK  A[LOOP:2: B:36:0x008d->B:48:0x00c4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x00c4 A[LOOP:2: B:36:0x008d->B:48:0x00c4, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v31, types: [h72, r02, x72] */
    public final void d(int i, int i2, int i3, ArrayList arrayList, kw5 kw5Var, l4c l4cVar, boolean z, boolean z2, int i4, boolean z3, int i5, int i6, t72 t72Var, jo4 jo4Var) {
        c37<Object, vv5<T>.c> c37Var;
        Object obj;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        kw5 kw5Var2;
        int[] iArr;
        ArrayList arrayList5;
        ArrayList arrayList6;
        c37<Object, vv5<T>.c> c37Var2;
        boolean z4;
        kw5 kw5Var3;
        int[] iArr2;
        c37<Object, vv5<T>.c> c37Var3;
        int i7;
        ArrayList arrayList7;
        long[] jArr;
        int[] iArr3;
        int i8;
        long[] jArr2;
        long j;
        c37<Object, vv5<T>.c> c37Var4;
        boolean z5;
        ArrayList arrayList8;
        uw5 uw5Var;
        sv5[] sv5VarArr;
        int i9;
        int i10;
        kw5 kw5Var4;
        int i11;
        sv5[] sv5VarArr2;
        kw5 kw5Var5;
        int i12;
        int i13;
        kw5 kw5Var6 = this.b;
        this.b = kw5Var;
        int size = arrayList.size();
        int i14 = 0;
        loop0: while (true) {
            c37Var = this.a;
            if (i14 >= size) {
                obj = null;
                if (!c37Var.e()) {
                    break;
                }
                e();
                return;
            }
            uw5 uw5Var2 = (uw5) arrayList.get(i14);
            int iB = uw5Var2.b();
            for (int i15 = 0; i15 < iB; i15++) {
                obj = null;
                Object objJ = uw5Var2.j(i15);
                if ((objJ instanceof jv5 ? (jv5) objJ : null) != null) {
                    break loop0;
                }
            }
            i14++;
        }
        int i16 = this.c;
        uw5 uw5Var3 = (uw5) th1.A(arrayList);
        this.c = uw5Var3 != null ? uw5Var3.getIndex() : 0;
        long j2 = z ? ((long) i) & 4294967295L : ((long) i) << 32;
        boolean z6 = z2 || !z3;
        Object[] objArr = c37Var.b;
        long[] jArr3 = c37Var.a;
        int length = jArr3.length - 2;
        d37<Object> d37Var = this.d;
        if (length >= 0) {
            int i17 = 0;
            while (true) {
                long j3 = jArr3[i17];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i17 != length) {
                        break;
                        break;
                    }
                    i17++;
                } else {
                    int i18 = 8 - ((~(i17 - length)) >>> 31);
                    for (int i19 = 0; i19 < i18; i19++) {
                        if ((j3 & 255) < 128) {
                            d37Var.a(objArr[(i17 << 3) + i19]);
                        }
                        j3 >>= 8;
                    }
                    if (i18 != 8) {
                        break;
                    } else if (i17 != length) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
        }
        int size2 = arrayList.size();
        int i20 = 0;
        while (true) {
            arrayList2 = this.i;
            arrayList3 = this.f;
            arrayList4 = this.e;
            if (i20 >= size2) {
                break;
            }
            uw5 uw5Var4 = (uw5) arrayList.get(i20);
            d37Var.l(uw5Var4.getKey());
            int iB2 = uw5Var4.b();
            int i21 = size2;
            int i22 = 0;
            while (true) {
                if (i22 >= iB2) {
                    i10 = i20;
                    kw5Var4 = kw5Var6;
                    i11 = i16;
                    f(uw5Var4.getKey());
                    g2b g2bVar = g2b.a;
                    break;
                }
                i10 = i20;
                Object objJ2 = uw5Var4.j(i22);
                int i23 = i22;
                if ((objJ2 instanceof jv5 ? (jv5) objJ2 : obj) != null) {
                    vv5<T>.c cVarD = c37Var.d(uw5Var4.getKey());
                    int iD = kw5Var6 != null ? kw5Var6.d(uw5Var4.getKey()) : -1;
                    boolean z7 = iD == -1 && kw5Var6 != null;
                    if (cVarD != null) {
                        if (z6) {
                            c.b(cVarD, uw5Var4, t72Var, jo4Var, i5, i6);
                            sv5[] sv5VarArr3 = cVarD.a;
                            int length2 = sv5VarArr3.length;
                            int i24 = 0;
                            while (i24 < length2) {
                                boolean z8 = z7;
                                sv5 sv5Var = sv5VarArr3[i24];
                                if (sv5Var != null) {
                                    i12 = i16;
                                    i13 = length2;
                                    sv5VarArr2 = sv5VarArr3;
                                    kw5Var5 = kw5Var6;
                                    if (!bg5.b(sv5Var.k, 9223372034707292159L)) {
                                        sv5Var.k = bg5.d(sv5Var.k, j2);
                                    }
                                } else {
                                    sv5VarArr2 = sv5VarArr3;
                                    kw5Var5 = kw5Var6;
                                    i12 = i16;
                                    i13 = length2;
                                }
                                i24++;
                                z7 = z8;
                                length2 = i13;
                                i16 = i12;
                                kw5Var6 = kw5Var5;
                                sv5VarArr3 = sv5VarArr2;
                            }
                            kw5Var4 = kw5Var6;
                            i11 = i16;
                            if (z7) {
                                for (sv5 sv5Var2 : cVarD.a) {
                                    if (sv5Var2 != null) {
                                        if (sv5Var2.c()) {
                                            arrayList2.remove(sv5Var2);
                                            b bVar = this.j;
                                            if (bVar != null) {
                                                b73.a(bVar);
                                                g2b g2bVar2 = g2b.a;
                                            }
                                        }
                                        sv5Var2.a();
                                    }
                                }
                            }
                            g(uw5Var4, false);
                        } else {
                            kw5Var4 = kw5Var6;
                            i11 = i16;
                        }
                        g2b g2bVar3 = g2b.a;
                        break;
                    }
                    vv5<T>.c cVar = new c();
                    c.b(cVar, uw5Var4, t72Var, jo4Var, i5, i6);
                    c37Var.m(uw5Var4.getKey(), cVar);
                    if (uw5Var4.getIndex() == iD || iD == -1) {
                        long jN = uw5Var4.n(0);
                        c(uw5Var4, (int) (uw5Var4.l() ? jN & 4294967295L : jN >> 32), cVar);
                        if (z7) {
                            sv5[] sv5VarArr4 = cVar.a;
                            for (sv5 sv5Var3 : sv5VarArr4) {
                                if (sv5Var3 != null) {
                                    sv5Var3.a();
                                    g2b g2bVar4 = g2b.a;
                                }
                            }
                        }
                        g2b g2bVar5 = g2b.a;
                    } else if (iD < i16) {
                        arrayList4.add(uw5Var4);
                    } else {
                        arrayList3.add(uw5Var4);
                    }
                    kw5Var4 = kw5Var6;
                    i11 = i16;
                    break;
                }
                i22 = i23 + 1;
                i20 = i10;
            }
            i20 = i10 + 1;
            i16 = i11;
            kw5Var6 = kw5Var4;
            size2 = i21;
        }
        int i25 = i4;
        kw5 kw5Var7 = kw5Var6;
        int[] iArr4 = new int[i25];
        if (!z6 || kw5Var7 == null) {
            kw5Var2 = kw5Var7;
        } else {
            if (arrayList4.isEmpty()) {
                kw5Var2 = kw5Var7;
            } else {
                if (arrayList4.size() > 1) {
                    kw5Var2 = kw5Var7;
                    rh1.t(new zv5(kw5Var2), arrayList4);
                } else {
                    kw5Var2 = kw5Var7;
                }
                int size3 = arrayList4.size();
                for (int i26 = 0; i26 < size3; i26++) {
                    uw5 uw5Var5 = (uw5) arrayList4.get(i26);
                    int iH = i5 - h(iArr4, uw5Var5);
                    vv5<T>.c cVarD2 = c37Var.d(uw5Var5.getKey());
                    cVarD2.getClass();
                    c(uw5Var5, iH, cVarD2);
                    g(uw5Var5, false);
                }
                gz3.n(iArr4, 0, 0, 6);
            }
            if (!arrayList3.isEmpty()) {
                if (arrayList3.size() > 1) {
                    rh1.t(new xv5(kw5Var2), arrayList3);
                }
                int size4 = arrayList3.size();
                for (int i27 = 0; i27 < size4; i27++) {
                    uw5 uw5Var6 = (uw5) arrayList3.get(i27);
                    int iH2 = (h(iArr4, uw5Var6) + i6) - uw5Var6.g();
                    vv5<T>.c cVarD3 = c37Var.d(uw5Var6.getKey());
                    cVarD3.getClass();
                    c(uw5Var6, iH2, cVarD3);
                    g(uw5Var6, false);
                }
                gz3.n(iArr4, 0, 0, 6);
            }
        }
        Object[] objArr2 = d37Var.b;
        long[] jArr4 = d37Var.a;
        int length3 = jArr4.length - 2;
        ArrayList arrayList9 = this.h;
        ArrayList arrayList10 = this.g;
        if (length3 >= 0) {
            arrayList5 = arrayList3;
            arrayList6 = arrayList4;
            int i28 = 0;
            while (true) {
                long j4 = jArr4[i28];
                Object[] objArr3 = objArr2;
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i29 = 8 - ((~(i28 - length3)) >>> 31);
                    int i30 = 0;
                    while (i30 < i29) {
                        if ((j4 & 255) < 128) {
                            i8 = i30;
                            Object obj2 = objArr3[(i28 << 3) + i30];
                            jArr2 = jArr4;
                            vv5<T>.c cVarD4 = c37Var.d(obj2);
                            if (cVarD4 == 0) {
                                iArr3 = iArr4;
                                j = j4;
                                c37Var4 = c37Var;
                                z5 = z6;
                            } else {
                                j = j4;
                                int iD2 = kw5Var.d(obj2);
                                z5 = z6;
                                int iMin = Math.min(i25, cVarD4.e);
                                cVarD4.e = iMin;
                                cVarD4.d = Math.min(i25 - iMin, cVarD4.d);
                                if (iD2 == -1) {
                                    sv5[] sv5VarArr5 = cVarD4.a;
                                    int length4 = sv5VarArr5.length;
                                    int i31 = 0;
                                    boolean z9 = false;
                                    int i32 = 0;
                                    while (i31 < length4) {
                                        int i33 = i31;
                                        sv5 sv5Var4 = sv5VarArr5[i33];
                                        int i34 = i32 + 1;
                                        if (sv5Var4 != null) {
                                            if (sv5Var4.c()) {
                                                g2b g2bVar6 = g2b.a;
                                                iArr4 = iArr4;
                                                sv5VarArr = sv5VarArr5;
                                                c37Var = c37Var;
                                                i9 = length4;
                                                z9 = true;
                                            } else {
                                                sv5VarArr = sv5VarArr5;
                                                if (((Boolean) sv5Var4.j.getValue()).booleanValue()) {
                                                    sv5Var4.d();
                                                    cVarD4.a[i32] = obj;
                                                    arrayList2.remove(sv5Var4);
                                                    b bVar2 = this.j;
                                                    if (bVar2 != null) {
                                                        b73.a(bVar2);
                                                        g2b g2bVar7 = g2b.a;
                                                    }
                                                } else {
                                                    ko4 ko4Var = sv5Var4.m;
                                                    if (ko4Var != null) {
                                                        i9 = length4;
                                                        a04<Float> a04Var = sv5Var4.e;
                                                        if (!sv5Var4.c() && a04Var != null) {
                                                            sv5Var4.f(true);
                                                            ?? r9 = obj;
                                                            oy0.d(sv5Var4.a, r9, r9, new uv5(sv5Var4, a04Var, ko4Var, r9), 3);
                                                        }
                                                    } else {
                                                        i9 = length4;
                                                    }
                                                    if (sv5Var4.c()) {
                                                        arrayList2.add(sv5Var4);
                                                        b bVar3 = this.j;
                                                        if (bVar3 != null) {
                                                            b73.a(bVar3);
                                                            g2b g2bVar8 = g2b.a;
                                                        }
                                                        obj = null;
                                                        z9 = true;
                                                    } else {
                                                        sv5Var4.d();
                                                        obj = null;
                                                        cVarD4.a[i32] = null;
                                                    }
                                                    g2b g2bVar9 = g2b.a;
                                                }
                                            }
                                            i31 = i33 + 1;
                                            i32 = i34;
                                            sv5VarArr5 = sv5VarArr;
                                            length4 = i9;
                                            iArr4 = iArr4;
                                            c37Var = c37Var;
                                        } else {
                                            sv5VarArr = sv5VarArr5;
                                        }
                                        c37Var = c37Var;
                                        i9 = length4;
                                        i31 = i33 + 1;
                                        i32 = i34;
                                        sv5VarArr5 = sv5VarArr;
                                        length4 = i9;
                                        iArr4 = iArr4;
                                        c37Var = c37Var;
                                    }
                                    iArr3 = iArr4;
                                    c37Var4 = c37Var;
                                    if (!z9) {
                                        f(obj2);
                                    }
                                    g2b g2bVar10 = g2b.a;
                                } else {
                                    iArr3 = iArr4;
                                    c37Var4 = c37Var;
                                    xx1 xx1Var = cVarD4.b;
                                    xx1Var.getClass();
                                    arrayList8 = arrayList2;
                                    uw5 uw5VarA = l4cVar.a(iD2, cVarD4.d, cVarD4.e, xx1Var.a);
                                    uw5VarA.m();
                                    sv5[] sv5VarArr6 = cVarD4.a;
                                    int length5 = sv5VarArr6.length;
                                    int i35 = 0;
                                    while (true) {
                                        if (i35 >= length5) {
                                            uw5Var = uw5VarA;
                                            if (kw5Var2 != null && iD2 == kw5Var2.d(obj2)) {
                                                f(obj2);
                                                g2b g2bVar11 = g2b.a;
                                            }
                                        } else {
                                            sv5 sv5Var5 = sv5VarArr6[i35];
                                            if (sv5Var5 != null) {
                                                uw5Var = uw5VarA;
                                                if (((Boolean) sv5Var5.g.getValue()).booleanValue()) {
                                                }
                                            } else {
                                                uw5Var = uw5VarA;
                                            }
                                            i35++;
                                            uw5VarA = uw5Var;
                                        }
                                        cVarD4.a(uw5Var, t72Var, jo4Var, i5, i6, cVarD4.c);
                                        uw5 uw5Var7 = uw5Var;
                                        if (iD2 < this.c) {
                                            arrayList10.add(uw5Var7);
                                        } else {
                                            arrayList9.add(uw5Var7);
                                        }
                                    }
                                }
                                arrayList2 = arrayList8;
                                j4 = j >> 8;
                                i30 = i8 + 1;
                                z6 = z5;
                                jArr4 = jArr2;
                                iArr4 = iArr3;
                                c37Var = c37Var4;
                                i25 = i4;
                            }
                        } else {
                            iArr3 = iArr4;
                            i8 = i30;
                            jArr2 = jArr4;
                            j = j4;
                            c37Var4 = c37Var;
                            z5 = z6;
                        }
                        arrayList8 = arrayList2;
                        arrayList2 = arrayList8;
                        j4 = j >> 8;
                        i30 = i8 + 1;
                        z6 = z5;
                        jArr4 = jArr2;
                        iArr4 = iArr3;
                        c37Var = c37Var4;
                        i25 = i4;
                    }
                    iArr = iArr4;
                    arrayList7 = arrayList2;
                    jArr = jArr4;
                    c37Var2 = c37Var;
                    z4 = z6;
                    if (i29 != 8) {
                        break;
                    }
                } else {
                    iArr = iArr4;
                    arrayList7 = arrayList2;
                    jArr = jArr4;
                    c37Var2 = c37Var;
                    z4 = z6;
                }
                if (i28 == length3) {
                    break;
                }
                i28++;
                i25 = i4;
                arrayList2 = arrayList7;
                objArr2 = objArr3;
                z6 = z4;
                jArr4 = jArr;
                iArr4 = iArr;
                c37Var = c37Var2;
            }
        } else {
            iArr = iArr4;
            arrayList5 = arrayList3;
            arrayList6 = arrayList4;
            c37Var2 = c37Var;
            z4 = z6;
        }
        if (arrayList10.isEmpty()) {
            kw5Var3 = kw5Var;
            iArr2 = iArr;
            c37Var3 = c37Var2;
        } else {
            if (arrayList10.size() > 1) {
                kw5Var3 = kw5Var;
                rh1.t(new aw5(kw5Var3), arrayList10);
            } else {
                kw5Var3 = kw5Var;
            }
            int size5 = arrayList10.size();
            int i36 = 0;
            while (i36 < size5) {
                uw5 uw5Var8 = (uw5) arrayList10.get(i36);
                c37<Object, vv5<T>.c> c37Var5 = c37Var2;
                vv5<T>.c cVarD5 = c37Var5.d(uw5Var8.getKey());
                cVarD5.getClass();
                vv5<T>.c cVar2 = cVarD5;
                int[] iArr5 = iArr;
                int iH3 = h(iArr5, uw5Var8);
                if (z2) {
                    uw5 uw5Var9 = (uw5) th1.y(arrayList);
                    long jN2 = uw5Var9.n(0);
                    i7 = (int) (uw5Var9.l() ? jN2 & 4294967295L : jN2 >> 32);
                } else {
                    i7 = cVar2.f;
                }
                uw5Var8.f(i7 - iH3, cVar2.c, i2, i3);
                if (z4) {
                    g(uw5Var8, true);
                }
                i36++;
                c37Var2 = c37Var5;
                iArr = iArr5;
            }
            iArr2 = iArr;
            c37Var3 = c37Var2;
            gz3.n(iArr2, 0, 0, 6);
        }
        if (!arrayList9.isEmpty()) {
            if (arrayList9.size() > 1) {
                rh1.t(new yv5(kw5Var3), arrayList9);
            }
            int size6 = arrayList9.size();
            for (int i37 = 0; i37 < size6; i37++) {
                uw5 uw5Var10 = (uw5) arrayList9.get(i37);
                vv5<T>.c cVarD6 = c37Var3.d(uw5Var10.getKey());
                cVarD6.getClass();
                vv5<T>.c cVar3 = cVarD6;
                uw5Var10.f((cVar3.g - uw5Var10.g()) + h(iArr2, uw5Var10), cVar3.c, i2, i3);
                if (z4) {
                    g(uw5Var10, true);
                }
            }
        }
        Collections.reverse(arrayList10);
        g2b g2bVar12 = g2b.a;
        arrayList.addAll(0, arrayList10);
        arrayList.addAll(arrayList9);
        arrayList6.clear();
        arrayList5.clear();
        arrayList10.clear();
        arrayList9.clear();
        d37Var.b();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0057 A[LOOP:0: B:7:0x0013->B:22:0x0057, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[EDGE_INSN: B:26:0x005a->B:23:0x005a BREAK  A[LOOP:0: B:7:0x0013->B:22:0x0057], SYNTHETIC] */
    public final void e() {
        c37<Object, vv5<T>.c> c37Var = this.a;
        if (c37Var.f()) {
            Object[] objArr = c37Var.c;
            long[] jArr = c37Var.a;
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
                                for (sv5 sv5Var : ((c) objArr[(i << 3) + i3]).a) {
                                    if (sv5Var != null) {
                                        sv5Var.d();
                                    }
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
            c37Var.g();
        }
    }

    public final void f(Object obj) {
        vv5<T>.c cVarK = this.a.k(obj);
        if (cVarK != null) {
            for (sv5 sv5Var : cVarK.a) {
                if (sv5Var != null) {
                    sv5Var.d();
                }
            }
        }
    }

    public final void g(T t, boolean z) {
        vv5<T>.c cVarD = this.a.d(t.getKey());
        cVarD.getClass();
        sv5[] sv5VarArr = cVarD.a;
        int length = sv5VarArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            sv5 sv5Var = sv5VarArr[i];
            int i3 = i2 + 1;
            if (sv5Var != null) {
                sv5Var.k = t.n(i2);
            }
            i++;
            i2 = i3;
        }
    }
}
