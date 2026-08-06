package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hj4 implements mh4<y07<Object, po5>> {
    public final /* synthetic */ ij4 t;

    public hj4(ij4 ij4Var) {
        this.t = ij4Var;
    }

    @Override // defpackage.mh4
    public final y07<Object, po5> invoke() {
        ArrayList arrayList = this.t.a;
        c37 c37Var = new c37(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            po5 po5Var = (po5) arrayList.get(i);
            Object obj = po5Var.b;
            int i2 = po5Var.a;
            y07.a(c37Var, obj != null ? new ol5(Integer.valueOf(i2), po5Var.b) : Integer.valueOf(i2), po5Var);
        }
        return new y07<>(c37Var);
    }
}
