package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t19 implements ci4 {
    @Override // defpackage.ci4
    public final Object invoke(Object obj, Object obj2) {
        k19 k19Var = (k19) obj;
        List list = (List) obj2;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(t29.a((iw.c) list.get(i), t29.c, k19Var));
        }
        return arrayList;
    }
}
