package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pt1 {
    public static final fk7 a = new fk7("provider");
    public static final fk7 b = new fk7("provider");
    public static final fk7 c = new fk7("compositionLocalMap");
    public static final fk7 d = new fk7("providers");
    public static final fk7 e = new fk7("reference");

    public static final void a(String str) {
        throw new qs1(sk0.c("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final Void b(String str) {
        throw new qs1(sk0.c("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    /* JADX WARN: Code duplicated, block: B:82:0x01ca  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v4, types: [hf3] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.util.ArrayList] */
    public static final lz6 c(x02 x02Var, mz6 mz6Var, cs9 cs9Var, p20<?> p20Var) {
        jt1.a.C0187a c0187a;
        zr9 zr9Var;
        ?? arrayList;
        vi4 vi4Var;
        long[] jArr;
        vi4 vi4Var2;
        int i;
        int i2;
        int i3;
        boolean z;
        boolean zG;
        long[] jArr2;
        int i4;
        long j;
        long[] jArr3;
        int i5;
        int i6;
        mz6 mz6Var2 = mz6Var;
        jt1.a.C0187a c0187a2 = jt1.a.a;
        zr9 zr9Var2 = new zr9();
        if (cs9Var.e != null) {
            zr9Var2.i1();
        }
        if (cs9Var.f != null) {
            zr9Var2.H = new e27<>();
        }
        int i7 = cs9Var.t;
        if (p20Var != null && cs9Var.F(i7) > 0) {
            int iG = cs9Var.v;
            while (iG > 0 && !cs9Var.y(iG)) {
                iG = cs9Var.G(cs9Var.b, iG);
            }
            if (iG >= 0 && cs9Var.y(iG)) {
                Object objE = cs9Var.E(iG);
                int i8 = iG + 1;
                int iU = cs9Var.u(iG) + iG;
                int iF = 0;
                while (i8 < iU) {
                    int iU2 = cs9Var.u(i8) + i8;
                    if (iU2 > i7) {
                        break;
                    }
                    iF += cs9Var.y(i8) ? 1 : cs9Var.F(i8);
                    i8 = iU2;
                }
                int iF2 = cs9Var.y(i7) ? 1 : cs9Var.F(i7);
                p20Var.d(objE);
                p20Var.g(iF, iF2);
                p20Var.h();
            }
        }
        vi4 vi4Var3 = mz6Var2.e;
        if (vi4Var3.a()) {
            x02Var.getClass();
            gu1 gu1Var = (gu1) x02Var;
            if (gu1Var.G.e > 0) {
                arrayList = new ArrayList();
                c37<Object, Object> c37Var = gu1Var.G;
                long[] jArr4 = c37Var.a;
                int length = jArr4.length - 2;
                if (length >= 0) {
                    int i9 = 0;
                    while (true) {
                        long j2 = jArr4[i9];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i10 = 8;
                            int i11 = 8 - ((~(i9 - length)) >>> 31);
                            int i12 = 0;
                            while (i12 < i11) {
                                if ((j2 & 255) < 128) {
                                    int i13 = i10;
                                    int i14 = (i9 << 3) + i12;
                                    vi4Var2 = vi4Var3;
                                    Object obj = c37Var.b[i14];
                                    Object obj2 = c37Var.c[i14];
                                    obj.getClass();
                                    if (obj2 instanceof d37) {
                                        d37 d37Var = (d37) obj2;
                                        Object[] objArr = d37Var.b;
                                        long[] jArr5 = d37Var.a;
                                        int length2 = jArr5.length - 2;
                                        if (length2 >= 0) {
                                            int i15 = 0;
                                            while (true) {
                                                long j3 = jArr5[i15];
                                                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i16 = 8 - ((~(i15 - length2)) >>> 31);
                                                    int i17 = 0;
                                                    while (i17 < i16) {
                                                        if ((j3 & 255) < 128) {
                                                            i4 = i17;
                                                            int i18 = (i15 << 3) + i4;
                                                            j = j3;
                                                            Object obj3 = objArr[i18];
                                                            xj8 xj8Var = (xj8) obj;
                                                            jArr3 = jArr5;
                                                            vi4 vi4Var4 = xj8Var.c;
                                                            if (vi4Var4 != null) {
                                                                vi4 vi4VarD = od3.d(vi4Var2);
                                                                i6 = i12;
                                                                vi4 vi4VarD2 = od3.d(vi4Var4);
                                                                int iC = cs9Var.c(vi4VarD);
                                                                i5 = length;
                                                                int iA = bs9.a(cs9Var.b, iC) + iC;
                                                                int i19 = vi4VarD2.a;
                                                                if (iC <= i19 && i19 < iA) {
                                                                    arrayList.add(new js7(xj8Var, obj3));
                                                                    d37Var.m(i18);
                                                                }
                                                            }
                                                            j3 = j >> i13;
                                                            i17 = i4 + 1;
                                                            jArr5 = jArr3;
                                                            length = i5;
                                                            i12 = i6;
                                                        } else {
                                                            i4 = i17;
                                                            j = j3;
                                                            jArr3 = jArr5;
                                                        }
                                                        i5 = length;
                                                        i6 = i12;
                                                        j3 = j >> i13;
                                                        i17 = i4 + 1;
                                                        jArr5 = jArr3;
                                                        length = i5;
                                                        i12 = i6;
                                                    }
                                                    jArr2 = jArr5;
                                                    i = length;
                                                    i2 = i12;
                                                    if (i16 != i13) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr2 = jArr5;
                                                    i = length;
                                                    i2 = i12;
                                                }
                                                if (i15 == length2) {
                                                    break;
                                                }
                                                i15++;
                                                jArr5 = jArr2;
                                                length = i;
                                                i12 = i2;
                                                i13 = 8;
                                            }
                                        } else {
                                            i = length;
                                            i2 = i12;
                                        }
                                        zG = d37Var.g();
                                    } else {
                                        i = length;
                                        i2 = i12;
                                        obj2.getClass();
                                        xj8 xj8Var2 = (xj8) obj;
                                        vi4 vi4Var5 = xj8Var2.c;
                                        if (vi4Var5 != null) {
                                            vi4 vi4VarD3 = od3.d(vi4Var2);
                                            vi4 vi4VarD4 = od3.d(vi4Var5);
                                            int iC2 = cs9Var.c(vi4VarD3);
                                            int iA2 = bs9.a(cs9Var.b, iC2) + iC2;
                                            int i20 = vi4VarD4.a;
                                            if (iC2 > i20 || i20 >= iA2) {
                                                z = false;
                                            } else {
                                                arrayList.add(new js7(xj8Var2, obj2));
                                                z = true;
                                            }
                                        } else {
                                            z = false;
                                        }
                                        zG = z;
                                    }
                                    if (zG) {
                                        c37Var.l(i14);
                                    }
                                    i3 = 8;
                                } else {
                                    vi4Var2 = vi4Var3;
                                    c0187a2 = c0187a2;
                                    zr9Var2 = zr9Var2;
                                    i = length;
                                    j2 = j2;
                                    i2 = i12;
                                    i3 = i10;
                                }
                                j2 >>= i3;
                                i12 = i2 + 1;
                                i10 = i3;
                                vi4Var3 = vi4Var2;
                                jArr4 = jArr4;
                                c0187a2 = c0187a2;
                                zr9Var2 = zr9Var2;
                                length = i;
                            }
                            vi4Var = vi4Var3;
                            c0187a = c0187a2;
                            zr9Var = zr9Var2;
                            jArr = jArr4;
                            int i21 = length;
                            if (i11 != i10) {
                                break;
                            }
                            length = i21;
                        } else {
                            vi4Var = vi4Var3;
                            c0187a = c0187a2;
                            zr9Var = zr9Var2;
                            jArr = jArr4;
                        }
                        if (i9 == length) {
                            break;
                        }
                        i9++;
                        vi4Var3 = vi4Var;
                        jArr4 = jArr;
                        c0187a2 = c0187a;
                        zr9Var2 = zr9Var;
                    }
                } else {
                    c0187a = c0187a2;
                    zr9Var = zr9Var2;
                }
            } else {
                c0187a = c0187a2;
                zr9Var = zr9Var2;
                arrayList = hf3.t;
            }
            mz6Var2 = mz6Var;
            mz6Var2.f = th1.K(mz6Var2.f, arrayList);
        } else {
            c0187a = c0187a2;
            zr9Var = zr9Var2;
        }
        cs9 cs9VarM1 = zr9Var.m1();
        try {
            cs9VarM1.d();
            jt1.a.C0187a c0187a3 = c0187a;
            cs9VarM1.S(126665345, mz6Var2.a, false, c0187a3);
            cs9.z(cs9VarM1);
            cs9VarM1.U(mz6Var2.b);
            List listD = cs9Var.D(od3.d(mz6Var2.e), cs9VarM1);
            cs9VarM1.N();
            cs9VarM1.j();
            cs9VarM1.k();
            cs9VarM1.e(true);
            zr9 zr9Var3 = zr9Var;
            lz6 lz6Var = new lz6(zr9Var3);
            if (!listD.isEmpty()) {
                int size = listD.size();
                for (int i22 = 0; i22 < size; i22++) {
                    vi4 vi4Var6 = (vi4) listD.get(i22);
                    if (zr9Var3.n1(vi4Var6)) {
                        int iH1 = zr9Var3.h1(vi4Var6);
                        int iC3 = bs9.c(zr9Var3.x, iH1);
                        int i23 = iH1 + 1;
                        if (((i23 < zr9Var3.y ? zr9Var3.x[(i23 * 5) + 4] : zr9Var3.z.length) - iC3 > 0 ? zr9Var3.z[iC3] : c0187a3) instanceof xj8) {
                            a aVar = new a(x02Var, mz6Var2);
                            cs9 cs9VarM2 = zr9Var3.m1();
                            try {
                                xj8.a.a(cs9VarM2, listD, aVar);
                                g2b g2bVar = g2b.a;
                                boolean z2 = true;
                                return lz6Var;
                            } finally {
                                cs9VarM2.e(false);
                            }
                        }
                    }
                }
            }
            return lz6Var;
        } catch (Throwable th) {
            cs9VarM1.e(false);
            throw th;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements yj8 {
        public final /* synthetic */ x02 t;
        public final /* synthetic */ mz6 u;

        public a(x02 x02Var, mz6 mz6Var) {
            this.t = x02Var;
            this.u = mz6Var;
        }

        @Override // defpackage.yj8
        public final lk5 r(xj8 xj8Var, Object obj) {
            lk5 lk5VarR;
            x02 x02Var = this.t;
            yj8 yj8Var = x02Var instanceof yj8 ? (yj8) x02Var : null;
            lk5 lk5Var = lk5.t;
            if (yj8Var == null || (lk5VarR = yj8Var.r(xj8Var, obj)) == null) {
                lk5VarR = lk5Var;
            }
            if (lk5VarR != lk5Var) {
                return lk5VarR;
            }
            mz6 mz6Var = this.u;
            mz6Var.f = th1.L(mz6Var.f, new js7(xj8Var, obj));
            return lk5.u;
        }

        @Override // defpackage.yj8
        public final void h() {
        }

        @Override // defpackage.yj8
        public final void a(Object obj) {
        }
    }
}
