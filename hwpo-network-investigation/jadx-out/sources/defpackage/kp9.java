package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kp9 implements fl6 {
    public static final kp9 a = new kp9();

    @Override // defpackage.fl6
    public final gl6 d(hl6 hl6Var, List<? extends cl6> list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size; i++) {
            jz7 jz7VarE = list.get(i).E(j);
            iMax = Math.max(iMax, jz7VarE.t);
            iMax2 = Math.max(iMax2, jz7VarE.u);
            arrayList.add(jz7VarE);
        }
        return hl6Var.y0(iMax, iMax2, if3.t, new nv5(1, arrayList));
    }
}
