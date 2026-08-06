package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bh1 {
    public static final boolean a(ArrayList arrayList) {
        List list;
        long j;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = hf3.t;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int size = arrayList.size() - 1;
                int i = 0;
                while (i < size) {
                    i++;
                    Object obj2 = arrayList.get(i);
                    ub9 ub9Var = (ub9) obj2;
                    ub9 ub9Var2 = (ub9) obj;
                    arrayList2.add(new vf7((((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (ub9Var2.g().b() >> 32)) - Float.intBitsToFloat((int) (ub9Var.g().b() >> 32))))) << 32) | (((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (ub9Var2.g().b() & 4294967295L)) - Float.intBitsToFloat((int) (ub9Var.g().b() & 4294967295L))))) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j = ((vf7) th1.y(list)).a;
            } else {
                if (list.isEmpty()) {
                    ab6.c("Empty collection can't be reduced.");
                }
                Object objY = th1.y(list);
                int size2 = list.size() - 1;
                if (1 <= size2) {
                    int i2 = 1;
                    while (true) {
                        objY = new vf7(vf7.e(((vf7) objY).a, ((vf7) list.get(i2)).a));
                        if (i2 == size2) {
                            break;
                        }
                        i2++;
                    }
                }
                j = ((vf7) objY).a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j)) >= Float.intBitsToFloat((int) (j >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static final void b(j4 j4Var, ub9 ub9Var) {
        Object objD = ub9Var.k().t.d(ac9.g);
        if (objD == null) {
            objD = null;
        }
        if (((ch1) objD) != null) {
            Object objD2 = ub9Var.k().t.d(ac9.J);
            if (objD2 == null) {
                objD2 = Boolean.FALSE;
            }
            j4Var.l(j4.h.a(((Boolean) objD2).booleanValue(), 0, 0, 0, 0));
        }
        ub9 ub9VarL = ub9Var.l();
        if (ub9VarL == null) {
            return;
        }
        Object objD3 = ub9VarL.k().t.d(ac9.e);
        if (objD3 == null) {
            objD3 = null;
        }
        if (objD3 != null) {
            Object objD4 = ub9VarL.k().t.d(ac9.f);
            ah1 ah1Var = (ah1) (objD4 != null ? objD4 : null);
            if (ah1Var == null || (ah1Var.a >= 0 && ah1Var.b >= 0)) {
                if (ub9Var.k().t.b(ac9.J)) {
                    ArrayList arrayList = new ArrayList();
                    List listJ = ub9.j(4, ub9VarL);
                    int size = listJ.size();
                    int i = 0;
                    for (int i2 = 0; i2 < size; i2++) {
                        ub9 ub9Var2 = (ub9) listJ.get(i2);
                        if (ub9Var2.k().t.b(ac9.J)) {
                            arrayList.add(ub9Var2);
                            if (ub9Var2.c.J() < ub9Var.c.J()) {
                                i++;
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    boolean zA = a(arrayList);
                    int i3 = zA ? 0 : i;
                    int i4 = zA ? i : 0;
                    Object objD5 = ub9Var.k().t.d(ac9.J);
                    if (objD5 == null) {
                        objD5 = Boolean.FALSE;
                    }
                    j4Var.l(j4.h.a(((Boolean) objD5).booleanValue(), i3, 1, i4, 1));
                }
            }
        }
    }
}
