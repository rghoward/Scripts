package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gw {
    public static final int a(int i, k37 k37Var) {
        int i2 = k37Var.v - 1;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = ((i2 - i3) / 2) + i3;
            Object[] objArr = k37Var.t;
            int i5 = ((lj5) objArr[i4]).a;
            if (i5 != i) {
                if (i5 < i) {
                    i3 = i4 + 1;
                    if (i < ((lj5) objArr[i3]).a) {
                    }
                } else {
                    i2 = i4 - 1;
                }
            }
            return i4;
        }
        return i3;
    }

    public static final fw b(fw fwVar) {
        fw fwVarC = fwVar.c();
        int iB = fwVarC.b();
        for (int i = 0; i < iB; i++) {
            fwVarC.e(fwVar.a(i), i);
        }
        return fwVarC;
    }

    public static final gl6 c(jy8 jy8Var, int i, int i2, int i3, int i4, int i5, hl6 hl6Var, List list, jz7[] jz7VarArr, int i6, int i7, int[] iArr, int i8) {
        int i9;
        float f;
        int i10;
        int i11;
        int i12;
        List list2 = list;
        long j = i5;
        int i13 = i7 - i6;
        int[] iArr2 = new int[i13];
        int i14 = i6;
        int iMax = 0;
        int i15 = 0;
        int i16 = 0;
        int iMin = 0;
        float f2 = 0.0f;
        while (i14 < i7) {
            cl6 cl6Var = (cl6) list2.get(i14);
            float f3 = zv.f(zv.e(cl6Var));
            if (f3 > 0.0f) {
                f2 += f3;
                i15++;
                i10 = i14;
            } else {
                int i17 = i3 - i16;
                jz7 jz7VarE = jz7VarArr[i14];
                if (jz7VarE == null) {
                    if (i3 == Integer.MAX_VALUE) {
                        i10 = i14;
                        i11 = i15;
                        i12 = Integer.MAX_VALUE;
                    } else {
                        i10 = i14;
                        i11 = i15;
                        i12 = i17 < 0 ? 0 : i17;
                    }
                    jz7VarE = cl6Var.E(jy8Var.c(0, i12, i4, false));
                } else {
                    i10 = i14;
                    i11 = i15;
                }
                jz7 jz7Var = jz7VarE;
                int iJ = jy8Var.j(jz7Var);
                int iH = jy8Var.h(jz7Var);
                iArr2[i10 - i6] = iJ;
                int i18 = i17 - iJ;
                if (i18 < 0) {
                    i18 = 0;
                }
                iMin = Math.min(i5, i18);
                i16 += iJ + iMin;
                iMax = Math.max(iMax, iH);
                jz7VarArr[i10] = jz7Var;
                i15 = i11;
            }
            i14 = i10 + 1;
            j = j;
        }
        long j2 = j;
        int i19 = i15;
        if (i19 == 0) {
            i16 -= iMin;
            i9 = 0;
        } else {
            long j3 = ((long) (i19 - 1)) * j2;
            long jRound = ((long) ((i3 != Integer.MAX_VALUE ? i3 : i) - i16)) - j3;
            if (jRound < 0) {
                jRound = 0;
            }
            float f4 = jRound / f2;
            for (int i20 = i6; i20 < i7; i20++) {
                jRound -= (long) Math.round(zv.f(zv.e((cl6) list2.get(i20))) * f4);
            }
            int i21 = i6;
            int i22 = iMax;
            int i23 = 0;
            while (i21 < i7) {
                if (jz7VarArr[i21] == null) {
                    cl6 cl6Var2 = (cl6) list2.get(i21);
                    f = f4;
                    ky8 ky8VarE = zv.e(cl6Var2);
                    float f5 = zv.f(ky8VarE);
                    if (f5 <= 0.0f) {
                        sc5.b("All weights <= 0 should have placeables");
                    }
                    int iSignum = Long.signum(jRound);
                    long j4 = jRound - ((long) iSignum);
                    int iMax2 = Math.max(0, Math.round(f5 * f) + iSignum);
                    jz7 jz7VarE2 = cl6Var2.E(jy8Var.c((!(ky8VarE != null ? ky8VarE.b : true) || iMax2 == Integer.MAX_VALUE) ? 0 : iMax2, iMax2, i4, true));
                    int iJ2 = jy8Var.j(jz7VarE2);
                    int iH2 = jy8Var.h(jz7VarE2);
                    iArr2[i21 - i6] = iJ2;
                    i23 += iJ2;
                    int iMax3 = Math.max(i22, iH2);
                    jz7VarArr[i21] = jz7VarE2;
                    i22 = iMax3;
                    jRound = j4;
                } else {
                    f = f4;
                }
                i21++;
                list2 = list;
                f4 = f;
            }
            i9 = (int) (((long) i23) + j3);
            int i24 = i3 - i16;
            if (i9 < 0) {
                i9 = 0;
            }
            if (i9 > i24) {
                i9 = i24;
            }
            iMax = i22;
        }
        int i25 = i9 + i16;
        if (i25 < 0) {
            i25 = 0;
        }
        int iMax4 = Math.max(i25, i);
        int iMax5 = Math.max(iMax, Math.max(i2, 0));
        int[] iArr3 = new int[i13];
        jy8Var.b(iMax4, iArr2, iArr3, hl6Var);
        return jy8Var.f(jz7VarArr, hl6Var, iArr3, iMax4, iMax5, iArr, i8, i6, i7);
    }
}
