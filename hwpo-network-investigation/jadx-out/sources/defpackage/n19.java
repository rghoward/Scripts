package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n19 implements oh4 {
    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(1);
        List list2 = (xj5.a(obj2, Boolean.FALSE) || obj2 == null) ? null : (List) ((oh4) t29.b.u).invoke(obj2);
        Object obj3 = list.get(0);
        String str = obj3 != null ? (String) obj3 : null;
        str.getClass();
        return new iw((List<? extends iw.c<? extends iw.a>>) list2, str);
    }
}
