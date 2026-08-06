package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class oya implements js3 {
    public final int a;
    public final int b;
    public final List<apa> c;
    public final pt7 d;
    public final SparseIntArray e;
    public final fv2 f;
    public final z4a.a g;
    public final SparseArray<pya> h;
    public final SparseBooleanArray i;
    public final SparseBooleanArray j;
    public final nya k;
    public mya l;
    public ls3 m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public pya r;
    public int s;
    public int t;

    public oya(int i, int i2, z4a.a aVar, apa apaVar, fv2 fv2Var) {
        this.f = fv2Var;
        this.a = i;
        this.b = i2;
        this.g = aVar;
        if (i == 1 || i == 2) {
            this.c = Collections.singletonList(apaVar);
        } else {
            ArrayList arrayList = new ArrayList();
            this.c = arrayList;
            arrayList.add(apaVar);
        }
        this.d = new pt7(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.i = sparseBooleanArray;
        this.j = new SparseBooleanArray();
        SparseArray<pya> sparseArray = new SparseArray<>();
        this.h = sparseArray;
        this.e = new SparseIntArray();
        this.k = new nya();
        this.m = ls3.e;
        this.t = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i3 = 0; i3 < size; i3++) {
            sparseArray.put(sparseArray2.keyAt(i3), (pya) sparseArray2.valueAt(i3));
        }
        sparseArray.put(0, new q89(new a()));
        this.r = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [int] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [int] */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.util.SparseBooleanArray] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [pya] */
    /* JADX WARN: Type inference failed for: r8v8 */
    @Override // defpackage.js3
    public final int c(ks3 ks3Var, o68 o68Var) throws ut7 {
        ks3 ks3Var2;
        ?? r1;
        int i;
        int i2;
        int i3;
        int i4;
        pya pyaVar;
        boolean z;
        long jC;
        long jA = ks3Var.a();
        int i5 = this.a;
        boolean z2 = i5 == 2;
        if (this.o) {
            long j = -9223372036854775807L;
            nya nyaVar = this.k;
            if (jA != -1 && !z2 && !nyaVar.c) {
                int i6 = this.t;
                apa apaVar = nyaVar.a;
                pt7 pt7Var = nyaVar.b;
                if (i6 <= 0) {
                    nyaVar.a(ks3Var);
                    return 0;
                }
                if (nyaVar.e) {
                    if (nyaVar.g == -9223372036854775807L) {
                        nyaVar.a(ks3Var);
                        return 0;
                    }
                    if (nyaVar.d) {
                        long j2 = nyaVar.f;
                        if (j2 == -9223372036854775807L) {
                            nyaVar.a(ks3Var);
                            return 0;
                        }
                        nyaVar.h = apaVar.c(nyaVar.g) - apaVar.b(j2);
                        nyaVar.a(ks3Var);
                        return 0;
                    }
                    int iMin = (int) Math.min(112800L, ks3Var.a());
                    if (ks3Var.getPosition() != 0) {
                        o68Var.a = 0L;
                        return 1;
                    }
                    pt7Var.J(iMin);
                    ks3Var.l();
                    ks3Var.n(pt7Var.a, 0, iMin);
                    int i7 = pt7Var.c;
                    for (int i8 = pt7Var.b; i8 < i7; i8++) {
                        if (pt7Var.a[i8] == 71) {
                            jC = zu1.c(pt7Var, i8, i6);
                            if (jC != -9223372036854775807L) {
                                nyaVar.f = jC;
                                nyaVar.d = true;
                                return 0;
                            }
                        }
                    }
                    jC = -9223372036854775807L;
                    nyaVar.f = jC;
                    nyaVar.d = true;
                    return 0;
                }
                long jA2 = ks3Var.a();
                int iMin2 = (int) Math.min(112800L, jA2);
                long j3 = jA2 - ((long) iMin2);
                if (ks3Var.getPosition() != j3) {
                    o68Var.a = j3;
                    return 1;
                }
                pt7Var.J(iMin2);
                ks3Var.l();
                ks3Var.n(pt7Var.a, 0, iMin2);
                int i9 = pt7Var.b;
                int i10 = pt7Var.c;
                for (int i11 = i10 - 188; i11 >= i9; i11--) {
                    byte[] bArr = pt7Var.a;
                    int i12 = 0;
                    for (int i13 = -4; i13 <= 4; i13++) {
                        int i14 = (i13 * 188) + i11;
                        if (i14 >= i9 && i14 < i10 && bArr[i14] == 71) {
                            i12++;
                            if (i12 == 5) {
                                long jC2 = zu1.c(pt7Var, i11, i6);
                                if (jC2 == -9223372036854775807L) {
                                    break;
                                }
                                j = jC2;
                                break;
                            }
                        } else {
                            i12 = 0;
                        }
                    }
                }
                nyaVar.g = j;
                nyaVar.e = true;
                return 0;
            }
            if (this.p) {
                i = 1;
                z = false;
                i2 = i5;
            } else {
                this.p = true;
                long j4 = nyaVar.h;
                if (j4 != -9223372036854775807L) {
                    i = 1;
                    z = false;
                    i2 = i5;
                    mya myaVar = new mya(new bq0.b(), new mya.a(this.t, nyaVar.a), j4, j4 + 1, 0L, jA, 188L, 940);
                    this.l = myaVar;
                    this.m.t(myaVar.a);
                } else {
                    i = 1;
                    z = false;
                    i2 = i5;
                    this.m.t(new t89.b(j4));
                }
            }
            if (this.q) {
                this.q = z;
                e(0L, 0L);
                if (ks3Var.getPosition() != 0) {
                    o68Var.a = 0L;
                    return i;
                }
            }
            mya myaVar2 = this.l;
            if (myaVar2 != null && myaVar2.c != null) {
                return myaVar2.a(ks3Var, o68Var);
            }
            ks3Var2 = ks3Var;
            r1 = z;
        } else {
            ks3Var2 = ks3Var;
            r1 = 0;
            i = 1;
            i2 = i5;
        }
        pt7 pt7Var2 = this.d;
        byte[] bArr2 = pt7Var2.a;
        if (9400 - pt7Var2.b < 188) {
            int iA = pt7Var2.a();
            if (iA > 0) {
                System.arraycopy(bArr2, pt7Var2.b, bArr2, r1, iA);
            }
            pt7Var2.K(bArr2, iA);
        }
        while (true) {
            int iA2 = pt7Var2.a();
            SparseArray<pya> sparseArray = this.h;
            if (iA2 >= 188) {
                int i15 = pt7Var2.b;
                int i16 = pt7Var2.c;
                byte[] bArr3 = pt7Var2.a;
                int i17 = i15;
                while (i17 < i16 && bArr3[i17] != 71) {
                    i17++;
                }
                pt7Var2.M(i17);
                int i18 = i17 + 188;
                ?? r8 = 0;
                if (i18 > i16) {
                    int i19 = (i17 - i15) + this.s;
                    this.s = i19;
                    i3 = i2;
                    i4 = 2;
                    if (i3 == 2 && i19 > 376) {
                        throw ut7.a(null, "Cannot find sync byte. Most likely not a Transport Stream.");
                    }
                } else {
                    i3 = i2;
                    i4 = 2;
                    this.s = r1;
                }
                int i20 = pt7Var2.c;
                if (i18 > i20) {
                    return r1;
                }
                int iM = pt7Var2.m();
                if ((8388608 & iM) != 0) {
                    pt7Var2.M(i18);
                    return r1;
                }
                ?? r10 = (4194304 & iM) != 0 ? 1 : r1;
                int i21 = (2096896 & iM) >> 8;
                ?? r14 = (iM & 32) != 0 ? 1 : r1;
                if ((iM & 16) != 0) {
                    pyaVar = sparseArray.get(i21);
                }
                if (r8 == 0) {
                    r8 = pyaVar;
                    pt7Var2.M(i18);
                    return r1;
                }
                if (i3 != i4) {
                    int i22 = iM & 15;
                    SparseIntArray sparseIntArray = this.e;
                    int i23 = sparseIntArray.get(i21, i22 - 1);
                    sparseIntArray.put(i21, i22);
                    if (i23 == i22) {
                        pt7Var2.M(i18);
                        return r1;
                    }
                    if (i22 != ((i23 + 1) & 15)) {
                        r8.c();
                    }
                }
                if (r14 != 0) {
                    int iZ = pt7Var2.z();
                    r10 = (r10 == true ? 1 : 0) | ((pt7Var2.z() & 64) != 0 ? i4 : r1);
                    pt7Var2.N(iZ - 1);
                }
                boolean z3 = this.o;
                if (i3 == i4 || z3 || !this.j.get(i21, r1)) {
                    pt7Var2.L(i18);
                    r8.a(r10, pt7Var2);
                    pt7Var2.L(i20);
                }
                if (i3 != i4 && !z3 && this.o && jA != -1) {
                    this.q = true;
                }
                pt7Var2.M(i18);
                return r1;
            }
            int i24 = pt7Var2.c;
            int i25 = ks3Var2.read(bArr2, i24, 9400 - i24);
            if (i25 == -1) {
                for (?? r4 = r1; r4 < sparseArray.size(); r4++) {
                    pya pyaVarValueAt = sparseArray.valueAt(r4);
                    if (pyaVarValueAt instanceof qx7) {
                        qx7 qx7Var = (qx7) pyaVarValueAt;
                        ?? r3 = (!z2 || qx7Var.e()) ? i : r1;
                        if (qx7Var.c == 3 && qx7Var.j == -1 && ((!z2 || !(qx7Var.a instanceof ss4)) && r3 != 0)) {
                            qx7Var.a(i, new pt7());
                        }
                    }
                    i = 1;
                }
                return -1;
            }
            pt7Var2.L(i24 + i25);
            i = 1;
        }
    }

    @Override // defpackage.js3
    public final boolean d(ks3 ks3Var) {
        byte[] bArr = this.d.a;
        zq2 zq2Var = (zq2) ks3Var;
        zq2Var.f(bArr, 0, 940, false);
        for (int i = 0; i < 188; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    zq2Var.e(i, false);
                    return true;
                }
                if (bArr[(i2 * 188) + i] != 71) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    @Override // defpackage.js3
    public final void e(long j, long j2) {
        mya myaVar;
        long j3;
        SparseArray<pya> sparseArray = this.h;
        List<apa> list = this.c;
        xl7.r(this.a != 2);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            apa apaVar = list.get(i);
            synchronized (apaVar) {
                j3 = apaVar.b;
            }
            boolean z = j3 == -9223372036854775807L;
            if (!z) {
                long jD = apaVar.d();
                z = (jD == -9223372036854775807L || jD == 0 || jD == j2) ? false : true;
            }
            if (z) {
                apaVar.f(j2);
            }
        }
        if (j2 != 0 && (myaVar = this.l) != null) {
            myaVar.c(j2);
        }
        this.d.J(0);
        this.e.clear();
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            sparseArray.valueAt(i2).c();
        }
        this.s = 0;
    }

    @Override // defpackage.js3
    public final void g(ls3 ls3Var) {
        if ((this.b & 1) == 0) {
            ls3Var = new a5a(ls3Var, this.g);
        }
        this.m = ls3Var;
    }

    @Override // defpackage.js3
    public final void a() {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements p89 {
        public final ot7 a = new ot7(new byte[4], 4);

        public a() {
        }

        @Override // defpackage.p89
        public final void a(pt7 pt7Var) {
            oya oyaVar = oya.this;
            SparseArray<pya> sparseArray = oyaVar.h;
            if (pt7Var.z() == 0 && (pt7Var.z() & 128) != 0) {
                pt7Var.N(6);
                int iA = pt7Var.a() / 4;
                for (int i = 0; i < iA; i++) {
                    ot7 ot7Var = this.a;
                    pt7Var.k(ot7Var.a, 0, 4);
                    ot7Var.m(0);
                    int iG = ot7Var.g(16);
                    ot7Var.o(3);
                    if (iG == 0) {
                        ot7Var.o(13);
                    } else {
                        int iG2 = ot7Var.g(13);
                        if (sparseArray.get(iG2) == null) {
                            sparseArray.put(iG2, new q89(oyaVar.new b(iG2)));
                            oyaVar.n++;
                        }
                    }
                }
                if (oyaVar.a != 2) {
                    sparseArray.remove(0);
                }
            }
        }

        @Override // defpackage.p89
        public final void b(apa apaVar, ls3 ls3Var, pya.c cVar) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class b implements p89 {
        public final ot7 a = new ot7(new byte[5], 5);
        public final SparseArray<pya> b = new SparseArray<>();
        public final SparseIntArray c = new SparseIntArray();
        public final int d;

        public b(int i) {
            this.d = i;
        }

        /* JADX WARN: Code duplicated, block: B:41:0x0136  */
        @Override // defpackage.p89
        public final void a(pt7 pt7Var) {
            apa apaVar;
            apa apaVar2;
            SparseArray<pya> sparseArray;
            int i;
            char c;
            oya oyaVar = oya.this;
            SparseArray<pya> sparseArray2 = oyaVar.h;
            SparseBooleanArray sparseBooleanArray = oyaVar.i;
            fv2 fv2Var = oyaVar.f;
            List<apa> list = oyaVar.c;
            int i2 = oyaVar.a;
            if (pt7Var.z() != 2) {
                return;
            }
            int i3 = 0;
            if (i2 == 1 || i2 == 2 || oyaVar.n == 1) {
                apaVar = list.get(0);
            } else {
                apaVar = new apa(list.get(0).d());
                list.add(apaVar);
            }
            if ((pt7Var.z() & 128) == 0) {
                return;
            }
            pt7Var.N(1);
            int iG = pt7Var.G();
            pt7Var.N(3);
            ot7 ot7Var = this.a;
            pt7Var.k(ot7Var.a, 0, 2);
            ot7Var.m(0);
            ot7Var.o(3);
            oyaVar.t = ot7Var.g(13);
            pt7Var.k(ot7Var.a, 0, 2);
            ot7Var.m(0);
            ot7Var.o(4);
            pt7Var.N(ot7Var.g(12));
            if (i2 == 2 && oyaVar.r == null) {
                pya pyaVarA = fv2Var.a(21, new pya.b(21, null, 0, null, n6b.b));
                oyaVar.r = pyaVarA;
                if (pyaVarA != null) {
                    pyaVarA.b(apaVar, oyaVar.m, new pya.c(iG, 21, 8192));
                }
            }
            SparseArray<pya> sparseArray3 = this.b;
            sparseArray3.clear();
            SparseIntArray sparseIntArray = this.c;
            sparseIntArray.clear();
            int iA = pt7Var.a();
            while (iA > 0) {
                pt7Var.k(ot7Var.a, i3, 5);
                ot7Var.m(i3);
                int iG2 = ot7Var.g(8);
                ot7Var.o(3);
                int iG3 = ot7Var.g(13);
                ot7Var.o(4);
                int iG4 = ot7Var.g(12);
                int i4 = pt7Var.b;
                ot7 ot7Var2 = ot7Var;
                int i5 = i4 + iG4;
                int i6 = -1;
                String str = null;
                ArrayList arrayList = null;
                int iZ = 0;
                int i7 = iA;
                while (pt7Var.b < i5) {
                    int iZ2 = pt7Var.z();
                    int iZ3 = pt7Var.b + pt7Var.z();
                    if (iZ3 > i5) {
                        break;
                    }
                    SparseArray<pya> sparseArray4 = sparseArray2;
                    if (iZ2 == 5) {
                        long jB = pt7Var.B();
                        if (jB == 1094921523) {
                            i6 = 129;
                        } else if (jB == 1161904947) {
                            i6 = 135;
                        } else if (jB == 1094921524) {
                            i6 = 172;
                        } else if (jB == 1212503619) {
                            i6 = 36;
                        }
                    } else if (iZ2 == 106) {
                        iZ3 = iZ3;
                        i6 = 129;
                    } else if (iZ2 == 122) {
                        i6 = 135;
                        iZ3 = iZ3;
                    } else if (iZ2 == 127) {
                        int iZ4 = pt7Var.z();
                        if (iZ4 == 21) {
                            i6 = 172;
                        } else if (iZ4 == 14) {
                            i6 = 136;
                        } else if (iZ4 == 33) {
                            i6 = 139;
                        }
                    } else if (iZ2 == 123) {
                        i6 = 138;
                    } else if (iZ2 == 10) {
                        String strTrim = pt7Var.x(3, StandardCharsets.UTF_8).trim();
                        iZ = pt7Var.z();
                        str = strTrim;
                    } else if (iZ2 == 89) {
                        ArrayList arrayList2 = new ArrayList();
                        while (pt7Var.b < iZ3) {
                            String strTrim2 = pt7Var.x(3, StandardCharsets.UTF_8).trim();
                            pt7Var.z();
                            apa apaVar3 = apaVar;
                            byte[] bArr = new byte[4];
                            pt7Var.k(bArr, 0, 4);
                            arrayList2.add(new pya.a(strTrim2, bArr));
                            apaVar = apaVar3;
                            iZ3 = iZ3;
                            iG = iG;
                        }
                        iZ3 = iZ3;
                        iG = iG;
                        apaVar = apaVar;
                        arrayList = arrayList2;
                        i6 = 89;
                    } else {
                        iZ3 = iZ3;
                        iG = iG;
                        apaVar = apaVar;
                        if (iZ2 == 111) {
                            i6 = 257;
                        }
                    }
                    pt7Var.N(iZ3 - pt7Var.b);
                    apaVar = apaVar;
                    sparseArray2 = sparseArray4;
                    iG = iG;
                }
                SparseArray<pya> sparseArray5 = sparseArray2;
                int i8 = iG;
                apa apaVar4 = apaVar;
                pt7Var.M(i5);
                pya.b bVar = new pya.b(i6, str, iZ, arrayList, Arrays.copyOfRange(pt7Var.a, i4, i5));
                if (iG2 == 6 || iG2 == 5) {
                    iG2 = i6;
                }
                iA = i7 - (iG4 + 5);
                int i9 = i2 == 2 ? iG2 : iG3;
                if (sparseBooleanArray.get(i9)) {
                    c = 21;
                } else {
                    c = 21;
                    pya pyaVarA2 = (i2 == 2 && iG2 == 21) ? oyaVar.r : fv2Var.a(iG2, bVar);
                    if (i2 != 2 || iG3 < sparseIntArray.get(i9, 8192)) {
                        sparseIntArray.put(i9, iG3);
                        sparseArray3.put(i9, pyaVarA2);
                    }
                }
                apaVar = apaVar4;
                ot7Var = ot7Var2;
                sparseArray2 = sparseArray5;
                iG = i8;
                i3 = 0;
            }
            SparseArray<pya> sparseArray6 = sparseArray2;
            int i10 = iG;
            apa apaVar5 = apaVar;
            int size = sparseIntArray.size();
            int i11 = 0;
            while (i11 < size) {
                int iKeyAt = sparseIntArray.keyAt(i11);
                int iValueAt = sparseIntArray.valueAt(i11);
                sparseBooleanArray.put(iKeyAt, true);
                oyaVar.j.put(iValueAt, true);
                pya pyaVarValueAt = sparseArray3.valueAt(i11);
                if (pyaVarValueAt != null) {
                    if (pyaVarValueAt != oyaVar.r) {
                        ls3 ls3Var = oyaVar.m;
                        i = i10;
                        pya.c cVar = new pya.c(i, iKeyAt, 8192);
                        apaVar2 = apaVar5;
                        pyaVarValueAt.b(apaVar2, ls3Var, cVar);
                    } else {
                        apaVar2 = apaVar5;
                        i = i10;
                    }
                    sparseArray = sparseArray6;
                    sparseArray.put(iValueAt, pyaVarValueAt);
                } else {
                    apaVar2 = apaVar5;
                    sparseArray = sparseArray6;
                    i = i10;
                }
                i11++;
                apaVar5 = apaVar2;
                sparseArray6 = sparseArray;
                i10 = i;
            }
            SparseArray<pya> sparseArray7 = sparseArray6;
            if (i2 == 2) {
                if (oyaVar.o) {
                    return;
                }
                oyaVar.m.k();
                oyaVar.n = 0;
                oyaVar.o = true;
                return;
            }
            sparseArray7.remove(this.d);
            int i12 = i2 == 1 ? 0 : oyaVar.n - 1;
            oyaVar.n = i12;
            if (i12 == 0) {
                oyaVar.m.k();
                oyaVar.o = true;
            }
        }

        @Override // defpackage.p89
        public final void b(apa apaVar, ls3 ls3Var, pya.c cVar) {
        }
    }
}
