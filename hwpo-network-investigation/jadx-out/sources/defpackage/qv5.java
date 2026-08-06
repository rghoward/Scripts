package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qv5 {
    public static final List<Integer> a(hw5 hw5Var, kx5 kx5Var, kv5 kv5Var) {
        fg5 fg5Var;
        k37<kv5.a> k37Var = kv5Var.a;
        if (!(k37Var.v != 0) && kx5Var.t.isEmpty()) {
            return hf3.t;
        }
        ArrayList arrayList = new ArrayList();
        if (kv5Var.a.v != 0) {
            int i = k37Var.v;
            if (i == 0) {
                px1.b("MutableVector is empty.");
                return null;
            }
            kv5.a[] aVarArr = k37Var.t;
            int i2 = aVarArr[0].a;
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = aVarArr[i3].a;
                if (i4 < i2) {
                    i2 = i4;
                }
            }
            if (i2 < 0) {
                xc5.a("negative minIndex");
            }
            int i5 = k37Var.v;
            if (i5 == 0) {
                px1.b("MutableVector is empty.");
                return null;
            }
            kv5.a[] aVarArr2 = k37Var.t;
            int i6 = aVarArr2[0].b;
            for (int i7 = 0; i7 < i5; i7++) {
                int i8 = aVarArr2[i7].b;
                if (i8 > i6) {
                    i6 = i8;
                }
            }
            fg5Var = new fg5(i2, Math.min(i6, hw5Var.b() - 1), 1);
        } else {
            fg5Var = fg5.w;
        }
        int size = kx5Var.t.size();
        for (int i9 = 0; i9 < size; i9++) {
            kx5.a aVar = (kx5.a) kx5Var.get(i9);
            int iB = iw5.b(aVar.getIndex(), hw5Var, aVar.getKey());
            int i10 = fg5Var.t;
            if ((iB > fg5Var.u || i10 > iB) && iB >= 0 && iB < hw5Var.b()) {
                arrayList.add(Integer.valueOf(iB));
            }
        }
        int i11 = fg5Var.t;
        int i12 = fg5Var.u;
        if (i11 <= i12) {
            while (true) {
                arrayList.add(Integer.valueOf(i11));
                if (i11 == i12) {
                    break;
                }
                i11++;
            }
        }
        return arrayList;
    }
}
