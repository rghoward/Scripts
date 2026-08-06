package defpackage;

import android.net.Uri;
import androidx.media3.exoplayer.g;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cz4 implements up6, jz4.a {
    public final jq6.a A;
    public final ki B;
    public final IdentityHashMap<xz8, Integer> C;
    public final bpa D;
    public final nq2 E;
    public final boolean F;
    public final int G;
    public final x38 H;
    public final a I = new a();
    public up6.a J;
    public int K;
    public gsa L;
    public pz4[] M;
    public pz4[] N;
    public int O;
    public wt1 P;
    public final long Q;
    public final yy4 t;
    public final jz4 u;
    public final xy4 v;
    public final yua w;
    public final k83 x;
    public final j83.a y;
    public final qb6 z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements bd9.a {
        public a() {
        }

        @Override // bd9.a
        public final void b(bd9 bd9Var) {
            cz4 cz4Var = cz4.this;
            cz4Var.J.b(cz4Var);
        }

        public final void c() {
            cz4 cz4Var = cz4.this;
            int i = cz4Var.K - 1;
            cz4Var.K = i;
            if (i > 0) {
                return;
            }
            int i2 = 0;
            for (pz4 pz4Var : cz4Var.M) {
                pz4Var.w();
                i2 += pz4Var.b0.a;
            }
            esa[] esaVarArr = new esa[i2];
            int i3 = 0;
            for (pz4 pz4Var2 : cz4Var.M) {
                pz4Var2.w();
                int i4 = pz4Var2.b0.a;
                int i5 = 0;
                while (i5 < i4) {
                    pz4Var2.w();
                    esaVarArr[i3] = pz4Var2.b0.a(i5);
                    i5++;
                    i3++;
                }
            }
            cz4Var.L = new gsa(esaVarArr);
            cz4Var.J.a(cz4Var);
        }
    }

    public cz4(yy4 yy4Var, pr2 pr2Var, mr2 mr2Var, yua yuaVar, k83 k83Var, j83.a aVar, qb6 qb6Var, jq6.a aVar2, ki kiVar, nq2 nq2Var, boolean z, int i, x38 x38Var) {
        this.t = yy4Var;
        this.u = pr2Var;
        this.v = mr2Var;
        this.w = yuaVar;
        this.x = k83Var;
        this.y = aVar;
        this.z = qb6Var;
        this.A = aVar2;
        this.B = kiVar;
        this.E = nq2Var;
        this.F = z;
        this.G = i;
        this.H = x38Var;
        nq2Var.getClass();
        k95.b bVar = k95.u;
        ul8 ul8Var = ul8.x;
        this.P = new wt1(ul8Var, ul8Var);
        this.C = new IdentityHashMap<>();
        this.D = new bpa();
        this.M = new pz4[0];
        this.N = new pz4[0];
        this.Q = Long.MIN_VALUE;
    }

    public static id4 k(id4 id4Var, id4 id4Var2, boolean z) {
        su6 su6Var;
        int i;
        String str;
        String str2;
        k95 k95Var;
        int i2;
        int i3;
        String str3;
        k95.b bVar = k95.u;
        ul8 ul8Var = ul8.x;
        if (id4Var2 != null) {
            str2 = id4Var2.k;
            su6Var = id4Var2.l;
            i2 = id4Var2.G;
            i = id4Var2.e;
            i3 = id4Var2.f;
            str = id4Var2.d;
            str3 = id4Var2.b;
            k95Var = id4Var2.c;
        } else {
            String strU = n6b.u(1, id4Var.k);
            su6Var = id4Var.l;
            if (z) {
                i2 = id4Var.G;
                i = id4Var.e;
                i3 = id4Var.f;
                str = id4Var.d;
                str3 = id4Var.b;
                str2 = strU;
                k95Var = id4Var.c;
            } else {
                i = 0;
                str = null;
                str2 = strU;
                k95Var = ul8Var;
                i2 = -1;
                i3 = 0;
                str3 = null;
            }
        }
        String strD = fv6.d(str2);
        int i4 = z ? id4Var.h : -1;
        int i5 = z ? id4Var.i : -1;
        id4.a aVar = new id4.a();
        aVar.a = id4Var.a;
        aVar.b = str3;
        aVar.c = k95.q(k95Var);
        aVar.m = fv6.n(id4Var.n);
        aVar.n = fv6.n(strD);
        aVar.j = str2;
        aVar.k = su6Var;
        aVar.h = i4;
        aVar.i = i5;
        aVar.F = i2;
        aVar.e = i;
        aVar.f = i3;
        aVar.d = str;
        return new id4(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // jz4.a
    public final void a() {
        for (final pz4 pz4Var : this.M) {
            yb6 yb6Var = pz4Var.C;
            wy4 wy4Var = pz4Var.w;
            ArrayList<zy4> arrayList = pz4Var.G;
            if (!arrayList.isEmpty()) {
                final zy4 zy4Var = (zy4) nr1.b(arrayList);
                int iC = wy4Var.c(zy4Var);
                int i = zy4Var.o;
                if (iC == 1) {
                    if (!zy4Var.f()) {
                        xl7.r(i != -1);
                        dz4 dz4VarR = wy4Var.g.r(false, zy4Var.m);
                        dz4VarR.getClass();
                        k95 k95Var = dz4VarR.r;
                        int i2 = (int) (zy4Var.j - dz4VarR.k);
                        zy4Var.K = i2 < 0 ? 0L : ((dz4.c) (i2 < k95Var.size() ? ((dz4.e) k95Var.get(i2)).F : dz4VarR.s).get(i)).v;
                    }
                } else if (iC == 0) {
                    pz4Var.K.post(new Runnable() { // from class: nz4
                        @Override // java.lang.Runnable
                        public final void run() {
                            cz4.a aVar = pz4Var.v;
                            cz4.this.u.p(zy4Var.m);
                        }
                    });
                } else if (iC == 2 && !pz4Var.m0 && yb6Var.b()) {
                    yb6Var.a();
                }
            }
        }
        this.J.b(this);
    }

    @Override // jz4.a
    public final boolean b(Uri uri, qb6.c cVar, boolean z) {
        boolean z2;
        boolean zN;
        int iD;
        boolean z3 = false;
        for (pz4 pz4Var : this.M) {
            wy4 wy4Var = pz4Var.w;
            kz4[] kz4VarArr = wy4Var.e;
            jz4 jz4Var = wy4Var.g;
            int length = kz4VarArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (kz4VarArr[i].equals(jz4Var.q(uri))) {
                        qb6.b bVarB = !z ? pz4Var.B.b(wy4Var.a(uri), cVar) : null;
                        wy4Var.o = uri;
                        if (bVarB != null) {
                            int i2 = bVarB.a;
                            long j = bVarB.b;
                            if (i2 == 1) {
                                zN = jz4Var.n(uri, j);
                            } else {
                                if (i2 != 2) {
                                    aa0.c(pp2.a(i2, "Invalid fallback selection type: "));
                                    return false;
                                }
                                int i3 = 0;
                                while (true) {
                                    z2 = false;
                                    if (i3 >= kz4VarArr.length) {
                                        i3 = -1;
                                        break;
                                    }
                                    if (kz4VarArr[i3].equals(jz4Var.q(uri))) {
                                        break;
                                    }
                                    i3++;
                                }
                                if (i3 != -1 && (iD = wy4Var.r.d(i3)) != -1 && wy4Var.r.t(iD, j) && jz4Var.n(uri, j)) {
                                    zN = true;
                                }
                            }
                            z3 |= zN;
                        }
                        zN = z2;
                        z3 |= zN;
                    } else {
                        i++;
                    }
                }
                z2 = false;
                zN = z2;
                z3 |= zN;
            }
        }
        this.J.b(this);
        return z3;
    }

    @Override // defpackage.bd9
    public final boolean c(g gVar) {
        if (this.L != null) {
            return this.P.c(gVar);
        }
        for (pz4 pz4Var : this.M) {
            if (!pz4Var.W) {
                g.a aVar = new g.a();
                aVar.a = pz4Var.i0;
                pz4Var.c(new g(aVar));
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0277  */
    /* JADX WARN: Code duplicated, block: B:120:0x0280  */
    /* JADX WARN: Code duplicated, block: B:122:0x0284  */
    /* JADX WARN: Code duplicated, block: B:124:0x028a  */
    /* JADX WARN: Code duplicated, block: B:154:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:194:0x0286 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x0197  */
    @Override // defpackage.up6
    public final long d(fq3[] fq3VarArr, boolean[] zArr, xz8[] xz8VarArr, boolean[] zArr2, long j) throws Throwable {
        IdentityHashMap<xz8, Integer> identityHashMap;
        xz8[] xz8VarArr2;
        int[] iArr;
        boolean z;
        wy4 wy4Var;
        int i;
        int i2;
        xz8[] xz8VarArr3;
        int i3;
        int[] iArr2;
        pz4[] pz4VarArr;
        pz4 pz4Var;
        boolean z2;
        boolean z3;
        int i4;
        int i5;
        xz8[] xz8VarArr4;
        int i6;
        int i7;
        int[] iArr3 = new int[fq3VarArr.length];
        int[] iArr4 = new int[fq3VarArr.length];
        int i8 = 0;
        while (true) {
            int length = fq3VarArr.length;
            identityHashMap = this.C;
            if (i8 >= length) {
                break;
            }
            xz8 xz8Var = xz8VarArr[i8];
            iArr3[i8] = xz8Var == null ? -1 : identityHashMap.get(xz8Var).intValue();
            iArr4[i8] = -1;
            fq3 fq3Var = fq3VarArr[i8];
            if (fq3Var != null) {
                esa esaVarA = fq3Var.a();
                int i9 = 0;
                while (true) {
                    pz4[] pz4VarArr2 = this.M;
                    if (i9 >= pz4VarArr2.length) {
                        break;
                    }
                    pz4 pz4Var2 = pz4VarArr2[i9];
                    pz4Var2.w();
                    if (pz4Var2.b0.b(esaVarA) != -1) {
                        iArr4[i8] = i9;
                        break;
                    }
                    i9++;
                }
            }
            i8++;
        }
        identityHashMap.clear();
        int length2 = fq3VarArr.length;
        xz8[] xz8VarArr5 = new xz8[length2];
        int length3 = fq3VarArr.length;
        xz8[] xz8VarArr6 = new xz8[length3];
        int length4 = fq3VarArr.length;
        fq3[] fq3VarArr2 = new fq3[length4];
        pz4[] pz4VarArr3 = new pz4[this.M.length];
        int i10 = length3;
        int i11 = 0;
        int i12 = 0;
        boolean z4 = false;
        while (i11 < this.M.length) {
            int i13 = length2;
            int i14 = 0;
            while (true) {
                xz8VarArr2 = xz8VarArr5;
                if (i14 >= fq3VarArr.length) {
                    break;
                }
                xz8VarArr6[i14] = iArr3[i14] == i11 ? xz8VarArr[i14] : null;
                fq3VarArr2[i14] = iArr4[i14] == i11 ? fq3VarArr[i14] : null;
                i14++;
                xz8VarArr5 = xz8VarArr2;
            }
            pz4 pz4Var3 = this.M[i11];
            yb6 yb6Var = pz4Var3.C;
            int i15 = i11;
            wy4 wy4Var2 = pz4Var3.w;
            kz4[] kz4VarArr = wy4Var2.e;
            jz4 jz4Var = wy4Var2.g;
            ArrayList<zy4> arrayList = pz4Var3.G;
            pz4Var3.w();
            int i16 = pz4Var3.X;
            xz8[] xz8VarArr7 = xz8VarArr6;
            int i17 = 0;
            while (i17 < length4) {
                lz4 lz4Var = (lz4) xz8VarArr7[i17];
                if (lz4Var == null || (fq3VarArr2[i17] != null && zArr[i17])) {
                    i7 = i17;
                } else {
                    i7 = i17;
                    pz4Var3.X--;
                    if (lz4Var.c != -1) {
                        pz4 pz4Var4 = lz4Var.b;
                        int i18 = lz4Var.a;
                        pz4Var4.w();
                        pz4Var4.d0.getClass();
                        int i19 = pz4Var4.d0[i18];
                        if (i19 >= 0) {
                            xl7.r(pz4Var4.g0[i19]);
                            pz4Var4.g0[i19] = false;
                        }
                        lz4Var.c = -1;
                    }
                    xz8VarArr7[i7] = null;
                }
                i17 = i7 + 1;
                fq3VarArr2 = fq3VarArr2;
            }
            fq3[] fq3VarArr3 = fq3VarArr2;
            boolean z5 = true;
            if (z4) {
                iArr = iArr3;
            } else {
                if (pz4Var3.l0) {
                    if (i16 != 0) {
                        iArr = iArr3;
                    }
                    iArr = iArr3;
                } else {
                    iArr = iArr3;
                    z = j != pz4Var3.i0;
                }
            }
            fq3 fq3Var2 = wy4Var2.r;
            boolean z6 = z;
            fq3 fq3Var3 = fq3Var2;
            int i20 = 0;
            while (i20 < length4) {
                int i21 = i20;
                fq3 fq3Var4 = fq3VarArr3[i21];
                if (fq3Var4 == null) {
                    i6 = length4;
                } else {
                    i6 = length4;
                    boolean z7 = z6;
                    int iB = pz4Var3.b0.b(fq3Var4.a());
                    if (iB == pz4Var3.e0) {
                        jz4Var.e(kz4VarArr[wy4Var2.r.q()].c());
                        wy4Var2.r = fq3Var4;
                        fq3Var3 = fq3Var4;
                    }
                    if (xz8VarArr7[i21] == null) {
                        pz4Var3.X++;
                        lz4 lz4Var2 = new lz4(pz4Var3, iB);
                        xz8VarArr7[i21] = lz4Var2;
                        zArr2[i21] = z5;
                        if (pz4Var3.d0 != null) {
                            lz4Var2.e();
                            int i22 = pz4Var3.d0[iB];
                            if (z7 || i22 < 0) {
                                z6 = z7;
                            } else {
                                pz4.b bVar = pz4Var3.O[i22];
                                z6 = (bVar.p() == 0 || bVar.A(j, z5)) ? false : true;
                            }
                        } else {
                            z6 = z7;
                        }
                    } else {
                        z6 = z7;
                    }
                }
                i20 = i21 + 1;
                length4 = i6;
                z5 = true;
            }
            int i23 = length4;
            boolean z8 = z6;
            if (pz4Var3.X == 0) {
                jz4Var.e(kz4VarArr[wy4Var2.r.q()].c());
                wy4Var2.n = null;
                pz4Var3.Z = null;
                pz4Var3.k0 = true;
                arrayList.clear();
                if (yb6Var.b()) {
                    if (pz4Var3.V) {
                        for (pz4.b bVar2 : pz4Var3.O) {
                            bVar2.j();
                        }
                    }
                    yb6Var.a();
                } else {
                    pz4Var3.I();
                }
                int[] iArr5 = iArr4;
                pz4Var = pz4Var3;
                i4 = i10;
                iArr2 = iArr5;
                wy4Var = wy4Var2;
                i2 = i13;
                xz8VarArr3 = xz8VarArr2;
                i3 = i15;
                z3 = z8;
                pz4VarArr = pz4VarArr3;
            } else {
                boolean z9 = true;
                if (arrayList.isEmpty() || Objects.equals(fq3Var3, fq3Var2)) {
                    wy4Var = wy4Var2;
                    i = i10;
                    i2 = i13;
                    xz8VarArr3 = xz8VarArr2;
                    i3 = i15;
                    iArr2 = iArr4;
                    pz4VarArr = pz4VarArr3;
                    pz4Var = pz4Var3;
                } else {
                    if (pz4Var3.l0) {
                        wy4Var = wy4Var2;
                        i = i10;
                        i2 = i13;
                        xz8VarArr3 = xz8VarArr2;
                        i3 = i15;
                        iArr2 = iArr4;
                        pz4VarArr = pz4VarArr3;
                        pz4Var = pz4Var3;
                    } else {
                        long j2 = j < 0 ? -j : 0L;
                        zy4 zy4VarC = pz4Var3.C();
                        long j3 = j2;
                        ym6[] ym6VarArrB = wy4Var2.b(zy4VarC, j);
                        wy4Var = wy4Var2;
                        List<zy4> list = pz4Var3.H;
                        i = i10;
                        i2 = i13;
                        xz8VarArr3 = xz8VarArr2;
                        i3 = i15;
                        iArr2 = iArr4;
                        pz4VarArr = pz4VarArr3;
                        pz4Var = pz4Var3;
                        fq3 fq3Var5 = fq3Var3;
                        fq3Var5.k(j, j3, -9223372036854775807L, list, ym6VarArrB);
                        if (fq3Var5.q() != wy4Var.h.a(zy4VarC.d)) {
                            z9 = true;
                        } else {
                            z9 = true;
                        }
                    }
                    pz4Var.k0 = z9;
                    z2 = z9;
                    z3 = z2;
                    if (z3) {
                        pz4Var.J(j, z2);
                        i5 = 0;
                        i4 = i;
                        while (i5 < i4) {
                            if (xz8VarArr7[i5] != null) {
                                zArr2[i5] = z9;
                            }
                            i5++;
                            z9 = true;
                        }
                    } else {
                        i4 = i;
                    }
                }
                z2 = z4;
                z3 = z8;
                if (z3) {
                    pz4Var.J(j, z2);
                    i5 = 0;
                    i4 = i;
                    while (i5 < i4) {
                        if (xz8VarArr7[i5] != null) {
                            zArr2[i5] = z9;
                        }
                        i5++;
                        z9 = true;
                    }
                } else {
                    i4 = i;
                }
            }
            ArrayList<lz4> arrayList2 = pz4Var.L;
            arrayList2.clear();
            for (int i24 = 0; i24 < i4; i24++) {
                xz8 xz8Var2 = xz8VarArr7[i24];
                if (xz8Var2 != null) {
                    arrayList2.add((lz4) xz8Var2);
                }
            }
            pz4Var.l0 = true;
            boolean z10 = false;
            int i25 = 0;
            while (i25 < fq3VarArr.length) {
                xz8 xz8Var3 = xz8VarArr7[i25];
                int i26 = i3;
                if (iArr2[i25] == i26) {
                    xz8Var3.getClass();
                    xz8VarArr4 = xz8VarArr3;
                    xz8VarArr4[i25] = xz8Var3;
                    identityHashMap.put(xz8Var3, Integer.valueOf(i26));
                    z10 = true;
                } else {
                    xz8VarArr4 = xz8VarArr3;
                    if (iArr[i25] == i26) {
                        xl7.r(xz8Var3 == null);
                    }
                }
                i25++;
                xz8VarArr3 = xz8VarArr4;
                i3 = i26;
            }
            xz8[] xz8VarArr8 = xz8VarArr3;
            int i27 = i3;
            if (z10) {
                int i28 = i12;
                pz4VarArr[i28] = pz4Var;
                i12 = i28 + 1;
                if (i28 == 0) {
                    wy4Var.l = true;
                    if (z3) {
                        this.D.a.clear();
                        z4 = true;
                    } else {
                        pz4[] pz4VarArr4 = this.N;
                        if (pz4VarArr4.length == 0 || pz4Var != pz4VarArr4[0]) {
                            this.D.a.clear();
                            z4 = true;
                        }
                    }
                } else {
                    wy4Var.l = i27 < this.O;
                }
            }
            i11 = i27 + 1;
            xz8VarArr5 = xz8VarArr8;
            iArr4 = iArr2;
            iArr3 = iArr;
            pz4VarArr3 = pz4VarArr;
            xz8VarArr6 = xz8VarArr7;
            fq3VarArr2 = fq3VarArr3;
            length4 = i23;
            i10 = i4;
            length2 = i2;
        }
        System.arraycopy(xz8VarArr5, 0, xz8VarArr, 0, length2);
        pz4[] pz4VarArr5 = (pz4[]) n6b.P(i12, pz4VarArr3);
        this.N = pz4VarArr5;
        ul8 ul8VarR = k95.r(pz4VarArr5);
        AbstractList abstractListB = jb6.b(ul8VarR, new bz4());
        this.E.getClass();
        this.P = new wt1(ul8VarR, abstractListB);
        return j;
    }

    @Override // defpackage.bd9
    public final long e() {
        return this.P.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.up6
    public final long f(long j, u89 u89Var) {
        for (pz4 pz4Var : this.N) {
            if (pz4Var.T == 2) {
                wy4 wy4Var = pz4Var.w;
                jz4 jz4Var = wy4Var.g;
                int iL = wy4Var.r.l();
                kz4[] kz4VarArr = wy4Var.e;
                dz4 dz4VarR = (iL >= kz4VarArr.length || iL == -1) ? null : jz4Var.r(true, kz4VarArr[wy4Var.r.q()].c());
                if (dz4VarR == null) {
                    break;
                }
                k95 k95Var = dz4VarR.r;
                if (k95Var.isEmpty()) {
                    break;
                }
                long jK = dz4VarR.h - jz4Var.k();
                long j2 = j - jK;
                int iD = n6b.d(k95Var, true, Long.valueOf(j2));
                long j3 = ((dz4.e) k95Var.get(iD)).x;
                return u89Var.a(j2, j3, (!dz4VarR.c || iD == k95Var.size() - 1) ? j3 : ((dz4.e) k95Var.get(iD + 1)).x) + jK;
            }
        }
        return j;
    }

    @Override // defpackage.up6
    public final void g() throws ut7 {
        for (pz4 pz4Var : this.M) {
            pz4Var.G();
            if (pz4Var.m0 && !pz4Var.W) {
                throw ut7.a(null, "Loading finished before preparation is complete.");
            }
        }
    }

    public final pz4 h(String str, int i, kz4[] kz4VarArr, id4[] id4VarArr, id4 id4Var, List<id4> list, Map<String, h83> map, long j) throws Throwable {
        pz4 pz4Var = new pz4(str, i, this.I, new wy4(this.t, this.u, kz4VarArr, id4VarArr, this.v, this.w, this.D, list, this.H), map, this.B, j, id4Var, this.x, this.y, this.z, this.A, this.G, null);
        long j2 = this.Q;
        pz4Var.n0 = j2;
        if (pz4Var.V) {
            for (pz4.b bVar : pz4Var.O) {
                bVar.B(j2);
            }
        }
        return pz4Var;
    }

    @Override // defpackage.up6
    public final long i(long j) throws Throwable {
        pz4[] pz4VarArr = this.N;
        if (pz4VarArr.length > 0) {
            boolean zJ = pz4VarArr[0].J(j, false);
            int i = 1;
            while (true) {
                pz4[] pz4VarArr2 = this.N;
                if (i >= pz4VarArr2.length) {
                    break;
                }
                pz4VarArr2[i].J(j, zJ);
                i++;
            }
            if (zJ) {
                this.D.a.clear();
            }
        }
        return j;
    }

    @Override // defpackage.bd9
    public final boolean j() {
        return this.P.j();
    }

    @Override // defpackage.up6
    public final long l() {
        return -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.up6
    public final void m(up6.a aVar, long j) throws Throwable {
        String str;
        boolean z;
        Map<String, h83> map;
        k95 k95Var;
        yy4 yy4Var;
        pz4[] pz4VarArr;
        HashSet hashSet;
        int i;
        ArrayList arrayList;
        HashSet hashSet2;
        ArrayList arrayList2;
        Map<String, h83> map2;
        ArrayList arrayList3;
        int i2;
        boolean z2;
        boolean z3;
        int i3;
        List<id4> list;
        this.J = aVar;
        jz4 jz4Var = this.u;
        jz4Var.j(this);
        fz4 fz4VarM = jz4Var.m();
        fz4VarM.getClass();
        Map<String, h83> map3 = Collections.EMPTY_MAP;
        k95 k95VarG = jz4Var.g(0);
        k95VarG.getClass();
        k95 k95VarG2 = jz4Var.g(2);
        k95VarG2.getClass();
        k95 k95VarG3 = jz4Var.g(3);
        k95VarG3.getClass();
        boolean zIsEmpty = k95VarG.isEmpty();
        this.K = 0;
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        yy4 yy4Var2 = this.t;
        boolean z4 = this.F;
        if (zIsEmpty) {
            str = "ID3";
            z = z4;
            map = map3;
            k95Var = k95VarG3;
            yy4Var = yy4Var2;
        } else {
            id4 id4Var = fz4VarM.j;
            List<id4> list2 = fz4VarM.k;
            int size = k95VarG.size();
            int[] iArr = new int[size];
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < k95VarG.size(); i6++) {
                id4 id4Var2 = ((kz4) k95VarG.get(i6)).a.a;
                int i7 = id4Var2.w;
                String str2 = id4Var2.k;
                if (i7 > 0 || n6b.u(2, str2) != null) {
                    int i8 = i5;
                    iArr[i6] = 2;
                    i4++;
                    i5 = i8;
                } else if (n6b.u(1, str2) != null) {
                    iArr[i6] = 1;
                    i5++;
                } else {
                    iArr[i6] = -1;
                }
            }
            int i9 = i5;
            if (i4 > 0) {
                z3 = false;
                i3 = i4;
                z2 = true;
            } else if (i9 < size) {
                int i10 = size - i9;
                z2 = false;
                i3 = i10;
                z3 = true;
            } else {
                z2 = false;
                z3 = false;
                i3 = size;
            }
            kz4[] kz4VarArr = new kz4[i3];
            id4[] id4VarArr = new id4[i3];
            int[] iArr2 = new int[i3];
            int i11 = 0;
            boolean z5 = z2;
            int i12 = 0;
            while (i12 < k95VarG.size()) {
                if (z5) {
                    list = list2;
                    if (iArr[i12] == 2) {
                    }
                    i12++;
                    list2 = list;
                } else {
                    list = list2;
                }
                if (!z3 || iArr[i12] != 1) {
                    kz4 kz4Var = (kz4) k95VarG.get(i12);
                    kz4VarArr[i11] = kz4Var;
                    id4VarArr[i11] = kz4Var.a.a;
                    iArr2[i11] = i12;
                    i11++;
                }
                i12++;
                list2 = list;
            }
            List<id4> list3 = list2;
            String str3 = id4VarArr[0].k;
            int iT = n6b.t(2, str3);
            int i13 = 1;
            int iT2 = n6b.t(1, str3);
            boolean z6 = (iT2 == 1 || (iT2 == 0 && k95VarG2.isEmpty())) && iT <= 1 && iT2 + iT > 0;
            if (z5 || iT2 <= 0) {
                i13 = 0;
            }
            k95Var = k95VarG3;
            yy4Var = yy4Var2;
            z = z4;
            pz4 pz4VarH = h("main", i13, kz4VarArr, id4VarArr, id4Var, list3, map3, j);
            arrayList4.add(pz4VarH);
            arrayList5.add(iArr2);
            if (z && z6) {
                ArrayList arrayList6 = new ArrayList();
                if (iT > 0) {
                    id4[] id4VarArr2 = new id4[i3];
                    int i14 = 0;
                    while (i14 < i3) {
                        id4 id4Var3 = id4VarArr[i14];
                        id4[] id4VarArr3 = id4VarArr;
                        String strU = n6b.u(2, id4Var3.k);
                        String strD = fv6.d(strU);
                        id4.a aVar2 = new id4.a();
                        aVar2.a = id4Var3.a;
                        aVar2.b = id4Var3.b;
                        aVar2.c = k95.q(id4Var3.c);
                        aVar2.m = fv6.n(id4Var3.n);
                        aVar2.n = fv6.n(strD);
                        aVar2.j = strU;
                        aVar2.k = id4Var3.l;
                        aVar2.h = id4Var3.h;
                        aVar2.i = id4Var3.i;
                        aVar2.u = id4Var3.v;
                        aVar2.v = id4Var3.w;
                        aVar2.y = id4Var3.z;
                        aVar2.e = id4Var3.e;
                        aVar2.f = id4Var3.f;
                        aVar2.D = id4Var3.E;
                        id4VarArr2[i14] = new id4(aVar2);
                        i14++;
                        id4VarArr = id4VarArr3;
                        map3 = map3;
                    }
                    id4[] id4VarArr4 = id4VarArr;
                    map = map3;
                    arrayList6.add(new esa("main", id4VarArr2));
                    if (iT2 > 0 && (id4Var != null || k95VarG2.isEmpty())) {
                        id4.a aVarA = k(id4VarArr4[0], id4Var, false).a();
                        aVarA.l = "main";
                        arrayList6.add(new esa("main:audio", new id4(aVarA)));
                    }
                    if (list3 != null) {
                        for (int i15 = 0; i15 < list3.size(); i15++) {
                            String strA = pp2.a(i15, "main:cc:");
                            id4.a aVarA2 = yy4Var.b(list3.get(i15)).a();
                            aVarA2.l = "main";
                            arrayList6.add(new esa(strA, new id4(aVarA2)));
                        }
                    }
                } else {
                    map = map3;
                    id4[] id4VarArr5 = new id4[i3];
                    for (int i16 = 0; i16 < i3; i16++) {
                        id4VarArr5[i16] = k(id4VarArr[i16], id4Var, true);
                    }
                    arrayList6.add(new esa("main", id4VarArr5));
                }
                id4.a aVar3 = new id4.a();
                str = "ID3";
                aVar3.a = str;
                aVar3.n = fv6.n("application/id3");
                aVar3.l = "main";
                esa esaVar = new esa("main:id3", new id4(aVar3));
                arrayList6.add(esaVar);
                pz4VarH.H((esa[]) arrayList6.toArray(new esa[0]), arrayList6.indexOf(esaVar));
            } else {
                map = map3;
                str = "ID3";
            }
        }
        ArrayList arrayList7 = new ArrayList(k95VarG2.size());
        ArrayList arrayList8 = new ArrayList(k95VarG2.size());
        ArrayList arrayList9 = new ArrayList(k95VarG2.size());
        HashSet hashSet3 = new HashSet();
        int i17 = 0;
        while (i17 < k95VarG2.size()) {
            String str4 = ((kz4) k95VarG2.get(i17)).a.c;
            str4.getClass();
            if (hashSet3.add(str4)) {
                arrayList7.clear();
                arrayList8.clear();
                arrayList9.clear();
                boolean z7 = true;
                for (int i18 = 0; i18 < k95VarG2.size(); i18++) {
                    if (str4.equals(((kz4) k95VarG2.get(i18)).a.c)) {
                        kz4 kz4Var2 = (kz4) k95VarG2.get(i18);
                        id4 id4Var4 = kz4Var2.a.a;
                        arrayList9.add(Integer.valueOf(i18));
                        arrayList7.add(kz4Var2);
                        arrayList8.add(id4Var4);
                        z7 &= n6b.t(1, id4Var4.k) == 1;
                    }
                }
                String strConcat = "audio:".concat(str4);
                String str5 = n6b.a;
                arrayList = arrayList9;
                hashSet2 = hashSet3;
                arrayList2 = arrayList7;
                map2 = map;
                arrayList3 = arrayList8;
                i2 = i17;
                pz4 pz4VarH2 = h(strConcat, 1, (kz4[]) arrayList7.toArray(new kz4[0]), (id4[]) arrayList8.toArray(new id4[0]), null, Collections.EMPTY_LIST, map2, j);
                arrayList5.add(ek5.m1(arrayList));
                arrayList4.add(pz4VarH2);
                if (z && z7) {
                    String strConcat2 = strConcat.concat(":id3");
                    id4.a aVar4 = new id4.a();
                    aVar4.a = str;
                    aVar4.n = fv6.n("application/id3");
                    aVar4.l = strConcat;
                    pz4VarH2.H(new esa[]{new esa(strConcat, (id4[]) arrayList3.toArray(new id4[0])), new esa(strConcat2, new id4(aVar4))}, 1);
                }
            } else {
                arrayList = arrayList9;
                hashSet2 = hashSet3;
                arrayList2 = arrayList7;
                map2 = map;
                arrayList3 = arrayList8;
                i2 = i17;
            }
            i17 = i2 + 1;
            map = map2;
            arrayList8 = arrayList3;
            arrayList7 = arrayList2;
            arrayList9 = arrayList;
            hashSet3 = hashSet2;
        }
        Map<String, h83> map4 = map;
        this.O = arrayList4.size();
        ArrayList arrayList10 = new ArrayList(k95Var.size());
        ArrayList arrayList11 = new ArrayList(k95Var.size());
        ArrayList arrayList12 = new ArrayList(k95Var.size());
        HashSet hashSet4 = new HashSet();
        int i19 = 0;
        while (i19 < k95Var.size()) {
            k95Var = k95Var;
            String str6 = ((kz4) k95Var.get(i19)).a.c;
            str6.getClass();
            if (hashSet4.add(str6)) {
                arrayList10.clear();
                arrayList11.clear();
                arrayList12.clear();
                for (int i20 = 0; i20 < k95Var.size(); i20++) {
                    if (str6.equals(((kz4) k95Var.get(i20)).a.c)) {
                        kz4 kz4Var3 = (kz4) k95Var.get(i20);
                        arrayList12.add(Integer.valueOf(i20));
                        arrayList10.add(kz4Var3);
                        arrayList11.add(kz4Var3.a.a);
                    }
                }
                String strConcat3 = "subtitle:".concat(str6);
                id4[] id4VarArr6 = (id4[]) arrayList11.toArray(new id4[0]);
                String str7 = n6b.a;
                kz4[] kz4VarArr2 = (kz4[]) arrayList10.toArray(new kz4[0]);
                k95.b bVar = k95.u;
                hashSet = hashSet4;
                i = i19;
                pz4 pz4VarH3 = h(strConcat3, 3, kz4VarArr2, id4VarArr6, null, ul8.x, map4, j);
                arrayList5.add(ek5.m1(arrayList12));
                arrayList4.add(pz4VarH3);
                int length = id4VarArr6.length;
                id4[] id4VarArr7 = new id4[length];
                for (int i21 = 0; i21 < length; i21++) {
                    id4VarArr7[i21] = yy4Var.b(id4VarArr6[i21]);
                }
                pz4VarH3.H(new esa[]{new esa(strConcat3, id4VarArr7)}, new int[0]);
            } else {
                hashSet = hashSet4;
                i = i19;
            }
            i19 = i + 1;
            hashSet4 = hashSet;
        }
        this.M = (pz4[]) arrayList4.toArray(new pz4[0]);
        this.K = this.M.length;
        int i22 = 0;
        while (true) {
            int i23 = this.O;
            pz4VarArr = this.M;
            if (i22 >= i23) {
                break;
            }
            pz4VarArr[i22].w.l = true;
            i22++;
        }
        for (pz4 pz4Var : pz4VarArr) {
            if (!pz4Var.W) {
                g.a aVar5 = new g.a();
                aVar5.a = pz4Var.i0;
                pz4Var.c(new g(aVar5));
            }
        }
        this.N = this.M;
    }

    @Override // defpackage.up6
    public final gsa n() {
        gsa gsaVar = this.L;
        gsaVar.getClass();
        return gsaVar;
    }

    @Override // defpackage.bd9
    public final long q() {
        return this.P.q();
    }

    @Override // defpackage.up6
    public final void s(long j, boolean z) throws Throwable {
        for (pz4 pz4Var : this.N) {
            if (pz4Var.V && !pz4Var.E()) {
                int length = pz4Var.O.length;
                for (int i = 0; i < length; i++) {
                    pz4Var.O[i].i(j, z, pz4Var.g0[i]);
                }
            }
        }
    }

    @Override // defpackage.bd9
    public final void v(long j) {
        this.P.v(j);
    }
}
