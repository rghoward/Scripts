package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class b43 {
    public static final /* synthetic */ int a = 0;

    public static final ArrayList a(List list) {
        ArrayList arrayList = new ArrayList(ph1.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cq5 cq5Var = (cq5) it.next();
            arrayList.add(new hq5(cq5Var.a, cq5Var.c));
        }
        return arrayList;
    }
}
