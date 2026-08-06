package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fb5<T> implements s54 {
    public final /* synthetic */ ArrayList t;
    public final /* synthetic */ eb5 u;

    public fb5(ArrayList arrayList, eb5 eb5Var) {
        this.t = arrayList;
        this.u = eb5Var;
    }

    @Override // defpackage.s54
    public final Object emit(Object obj, r02 r02Var) {
        qg5 qg5Var = (qg5) obj;
        boolean z = qg5Var instanceof v84;
        ArrayList arrayList = this.t;
        if (z) {
            arrayList.add(qg5Var);
        } else if (qg5Var instanceof w84) {
            arrayList.remove(((w84) qg5Var).a);
        }
        boolean z2 = !arrayList.isEmpty();
        eb5 eb5Var = this.u;
        if (z2 != eb5Var.O) {
            eb5Var.O = z2;
            eb5Var.g2();
        }
        return g2b.a;
    }
}
