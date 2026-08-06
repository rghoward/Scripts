package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class koa implements oh4 {
    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        List list = (List) obj;
        Object obj2 = list.get(0);
        obj2.getClass();
        int iIntValue = ((Integer) obj2).intValue();
        Object obj3 = list.get(1);
        obj3.getClass();
        int iIntValue2 = ((Integer) obj3).intValue();
        Object obj4 = list.get(2);
        obj4.getClass();
        return new loa(iIntValue, ((Boolean) obj4).booleanValue(), iIntValue2);
    }
}
