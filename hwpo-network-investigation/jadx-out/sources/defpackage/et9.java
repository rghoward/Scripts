package defpackage;

import io.intercom.android.sdk.models.AttributeType;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class et9 implements fl6 {
    /* JADX WARN: Code duplicated, block: B:63:0x0105 A[PHI: r4 r6
      0x0105: PHI (r4v5 int) = (r4v4 int), (r4v9 int), (r4v9 int) binds: [B:66:0x011f, B:59:0x00fa, B:61:0x0100] A[DONT_GENERATE, DONT_INLINE]
      0x0105: PHI (r6v5 int) = (r6v4 int), (r6v10 int), (r6v10 int) binds: [B:66:0x011f, B:59:0x00fa, B:61:0x0100] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.fl6
    public final gl6 d(hl6 hl6Var, List<? extends cl6> list, long j) {
        cl6 cl6Var;
        cl6 cl6Var2;
        int iN1;
        int iMax;
        int i;
        int iR;
        List<? extends cl6> list2 = list;
        long j2 = j;
        int iMin = Math.min(xx1.h(j2), hl6Var.n1(600.0f));
        int size = list2.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                cl6Var = null;
                break;
            }
            cl6Var = list2.get(i2);
            if (xj5.a(yq5.c(cl6Var), "action")) {
                break;
            }
            i2++;
        }
        cl6 cl6Var3 = cl6Var;
        jz7 jz7VarE = cl6Var3 != null ? cl6Var3.E(j2) : null;
        int size2 = list2.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size2) {
                cl6Var2 = null;
                break;
            }
            cl6Var2 = list2.get(i3);
            if (xj5.a(yq5.c(cl6Var2), "dismissAction")) {
                break;
            }
            i3++;
        }
        cl6 cl6Var4 = cl6Var2;
        final jz7 jz7VarE2 = cl6Var4 != null ? cl6Var4.E(j2) : null;
        int i4 = jz7VarE != null ? jz7VarE.t : 0;
        int i5 = jz7VarE != null ? jz7VarE.u : 0;
        int i6 = jz7VarE2 != null ? jz7VarE2.t : 0;
        int i7 = jz7VarE2 != null ? jz7VarE2.u : 0;
        int iN2 = ((iMin - i4) - i6) - (i6 == 0 ? hl6Var.n1(8.0f) : 0);
        int iJ = xx1.j(j2);
        if (iN2 >= iJ) {
            iJ = iN2;
        }
        int size3 = list2.size();
        int i8 = 0;
        while (i8 < size3) {
            cl6 cl6Var5 = list2.get(i8);
            if (xj5.a(yq5.c(cl6Var5), AttributeType.TEXT)) {
                final jz7 jz7VarE3 = cl6Var5.E(xx1.a(0, iJ, 0, 0, 9, j2));
                e15 e15Var = fi.a;
                int iR2 = jz7VarE3.R(e15Var);
                int iR3 = jz7VarE3.R(fi.b);
                boolean z = true;
                boolean z2 = (iR2 == Integer.MIN_VALUE || iR3 == Integer.MIN_VALUE) ? false : true;
                if (iR2 != iR3 && z2) {
                    z = false;
                }
                final int i9 = iMin - i6;
                final int i10 = i9 - i4;
                if (z) {
                    iMax = Math.max(hl6Var.n1(pt9.B), Math.max(i5, i7));
                    iN1 = (iMax - jz7VarE3.u) / 2;
                    if (jz7VarE == null || (iR = jz7VarE.R(e15Var)) == Integer.MIN_VALUE) {
                        i = 0;
                    } else {
                        i = (iR2 + iN1) - iR;
                    }
                } else {
                    iN1 = hl6Var.n1(30.0f) - iR2;
                    iMax = Math.max(hl6Var.n1(pt9.C), jz7VarE3.u + iN1);
                    if (jz7VarE != null) {
                        i = (iMax - jz7VarE.u) / 2;
                    } else {
                        i = 0;
                    }
                }
                final int i11 = i;
                final int i12 = iN1;
                final int i13 = jz7VarE2 != null ? (iMax - jz7VarE2.u) / 2 : 0;
                final jz7 jz7Var = jz7VarE;
                return hl6Var.y0(iMin, iMax, if3.t, new oh4() { // from class: dt9
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        jz7.a aVar = (jz7.a) obj;
                        jz7.a.t(aVar, jz7VarE3, 0, i12);
                        jz7 jz7Var2 = jz7VarE2;
                        if (jz7Var2 != null) {
                            jz7.a.t(aVar, jz7Var2, i9, i13);
                        }
                        jz7 jz7Var3 = jz7Var;
                        if (jz7Var3 != null) {
                            jz7.a.t(aVar, jz7Var3, i10, i11);
                        }
                        return g2b.a;
                    }
                });
            }
            i8++;
            j2 = j;
            iJ = iJ;
            list2 = list;
        }
        ab6.b("Collection contains no element matching the predicate.");
        fl.a();
        return null;
    }
}
