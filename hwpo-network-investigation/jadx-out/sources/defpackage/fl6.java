package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface fl6 {
    default int a(qj5 qj5Var, List<? extends pj5> list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new vr2(list.get(i2), rj5.u, vj5.t));
        }
        return d(new ck5(qj5Var, qj5Var.getLayoutDirection()), arrayList, zx1.b(0, 0, 0, i, 7)).j();
    }

    gl6 d(hl6 hl6Var, List<? extends cl6> list, long j);

    default int e(qj5 qj5Var, List<? extends pj5> list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new vr2(list.get(i2), rj5.t, vj5.t));
        }
        return d(new ck5(qj5Var, qj5Var.getLayoutDirection()), arrayList, zx1.b(0, 0, 0, i, 7)).j();
    }

    default int g(qj5 qj5Var, List<? extends pj5> list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new vr2(list.get(i2), rj5.u, vj5.u));
        }
        return d(new ck5(qj5Var, qj5Var.getLayoutDirection()), arrayList, zx1.b(0, i, 0, 0, 13)).h();
    }

    default int i(qj5 qj5Var, List<? extends pj5> list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new vr2(list.get(i2), rj5.t, vj5.u));
        }
        return d(new ck5(qj5Var, qj5Var.getLayoutDirection()), arrayList, zx1.b(0, i, 0, 0, 13)).h();
    }
}
