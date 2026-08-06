package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lc3 implements oh4 {
    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        pc3.b bVar = pc3.Companion;
        List<l89> list = ((pc3.c) obj).c.v;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((l89) obj2).v != u60.w) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }
}
