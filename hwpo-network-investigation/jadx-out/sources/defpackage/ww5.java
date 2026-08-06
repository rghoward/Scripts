package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ww5 implements jac {
    public static final vw5 t = new vw5();
    public static final /* synthetic */ ww5 u = new ww5();

    public static final List b(int i, int i2, ArrayList arrayList, List list) {
        if (arrayList.isEmpty()) {
            return hf3.t;
        }
        ArrayList arrayList2 = new ArrayList(list);
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            uw5 uw5Var = (uw5) arrayList.get(i3);
            int index = uw5Var.getIndex();
            if (i <= index && index <= i2) {
                arrayList2.add(uw5Var);
            }
        }
        rh1.t(t, arrayList2);
        return arrayList2;
    }

    @Override // defpackage.jac
    public Object a() {
        List list = wfc.a;
        return ((l5c) k5c.u.t.t).a();
    }
}
