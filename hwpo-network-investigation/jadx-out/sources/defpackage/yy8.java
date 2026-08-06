package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class yy8 {
    public dmb a;
    public ArrayList<dmb> b;

    public static long a(fy2 fy2Var, long j) {
        dmb dmbVar = fy2Var.d;
        ArrayList arrayList = fy2Var.k;
        if (dmbVar instanceof cw4) {
            return j;
        }
        int size = arrayList.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            by2 by2Var = (by2) arrayList.get(i);
            if (by2Var instanceof fy2) {
                fy2 fy2Var2 = (fy2) by2Var;
                if (fy2Var2.d != dmbVar) {
                    jMin = Math.min(jMin, a(fy2Var2, ((long) fy2Var2.f) + j));
                }
            }
        }
        fy2 fy2Var3 = dmbVar.i;
        fy2 fy2Var4 = dmbVar.h;
        if (fy2Var != fy2Var3) {
            return jMin;
        }
        long j2 = j - dmbVar.j();
        return Math.min(Math.min(jMin, a(fy2Var4, j2)), j2 - ((long) fy2Var4.f));
    }

    public static long b(fy2 fy2Var, long j) {
        dmb dmbVar = fy2Var.d;
        ArrayList arrayList = fy2Var.k;
        if (dmbVar instanceof cw4) {
            return j;
        }
        int size = arrayList.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            by2 by2Var = (by2) arrayList.get(i);
            if (by2Var instanceof fy2) {
                fy2 fy2Var2 = (fy2) by2Var;
                if (fy2Var2.d != dmbVar) {
                    jMax = Math.max(jMax, b(fy2Var2, ((long) fy2Var2.f) + j));
                }
            }
        }
        fy2 fy2Var3 = dmbVar.h;
        fy2 fy2Var4 = dmbVar.i;
        if (fy2Var != fy2Var3) {
            return jMax;
        }
        long j2 = dmbVar.j() + j;
        return Math.max(Math.max(jMax, b(fy2Var4, j2)), j2 - ((long) fy2Var4.f));
    }
}
