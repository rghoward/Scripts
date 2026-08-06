package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i91 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ i91(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                int i = m91.I;
                return Boolean.valueOf(((n91) obj).h);
            default:
                obj.getClass();
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Object obj2 = list.get(i2);
                    au3 au3Var = t29.B;
                    yc6 yc6Var = null;
                    if (!xj5.a(obj2, Boolean.FALSE) && obj2 != null) {
                        yc6Var = (yc6) ((oh4) au3Var.u).invoke(obj2);
                    }
                    yc6Var.getClass();
                    arrayList.add(yc6Var);
                }
                return new ad6(arrayList);
        }
    }
}
