package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kf3 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ kf3(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                return g2b.a;
            case 1:
                obj.getClass();
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Object obj2 = list.get(i);
                    au3 au3Var = t29.c;
                    iw.c cVar = null;
                    if (!xj5.a(obj2, Boolean.FALSE) && obj2 != null) {
                        cVar = (iw.c) ((oh4) au3Var.u).invoke(obj2);
                    }
                    cVar.getClass();
                    arrayList.add(cVar);
                }
                return arrayList;
            default:
                lj9.a aVar = lj9.Companion;
                return ((xj9) obj).i;
        }
    }
}
