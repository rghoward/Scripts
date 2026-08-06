package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nq7 {
    public static final ll6 a(tw5 tw5Var, int i, long j, mq7 mq7Var, long j2, di.c cVar, tq5 tq5Var, int i2, e27 e27Var) {
        List list;
        Object objF = mq7Var.f(i);
        List list2 = (List) e27Var.b(i);
        if (list2 != null) {
            list = list2;
        } else {
            List<cl6> listE = tw5Var.e(i);
            int size = listE.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList.add(listE.get(i3).E(j));
            }
            e27Var.i(i, arrayList);
            list = arrayList;
        }
        return new ll6(i, i2, list, j2, objF, cVar, tq5Var);
    }
}
