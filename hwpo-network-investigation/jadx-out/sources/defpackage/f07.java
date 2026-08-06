package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface f07 {
    default int a(qj5 qj5Var, List<? extends List<? extends pj5>> list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new vr2((pj5) list2.get(i3), rj5.u, vj5.t));
            }
            arrayList2.add(arrayList3);
        }
        return d(new ck5(qj5Var, qj5Var.getLayoutDirection()), arrayList2, zx1.b(0, 0, 0, i, 7)).j();
    }

    gl6 d(hl6 hl6Var, List<? extends List<? extends cl6>> list, long j);

    default int e(qj5 qj5Var, List<? extends List<? extends pj5>> list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new vr2((pj5) list2.get(i3), rj5.t, vj5.t));
            }
            arrayList2.add(arrayList3);
        }
        return d(new ck5(qj5Var, qj5Var.getLayoutDirection()), arrayList2, zx1.b(0, 0, 0, i, 7)).j();
    }

    default int g(qj5 qj5Var, List<? extends List<? extends pj5>> list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new vr2((pj5) list2.get(i3), rj5.u, vj5.u));
            }
            arrayList2.add(arrayList3);
        }
        return d(new ck5(qj5Var, qj5Var.getLayoutDirection()), arrayList2, zx1.b(0, i, 0, 0, 13)).h();
    }

    default int i(qj5 qj5Var, List<? extends List<? extends pj5>> list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new vr2((pj5) list2.get(i3), rj5.t, vj5.u));
            }
            arrayList2.add(arrayList3);
        }
        return d(new ck5(qj5Var, qj5Var.getLayoutDirection()), arrayList2, zx1.b(0, i, 0, 0, 13)).h();
    }
}
