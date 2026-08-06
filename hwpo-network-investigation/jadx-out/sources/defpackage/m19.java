package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m19 implements oh4 {
    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        oh4 oh4Var = (oh4) t29.i.u;
        Boolean bool = Boolean.FALSE;
        ww9 ww9Var = null;
        ww9 ww9Var2 = (xj5.a(obj2, bool) || obj2 == null) ? null : (ww9) oh4Var.invoke(obj2);
        Object obj3 = list.get(1);
        ww9 ww9Var3 = (xj5.a(obj3, bool) || obj3 == null) ? null : (ww9) oh4Var.invoke(obj3);
        Object obj4 = list.get(2);
        ww9 ww9Var4 = (xj5.a(obj4, bool) || obj4 == null) ? null : (ww9) oh4Var.invoke(obj4);
        Object obj5 = list.get(3);
        if (!xj5.a(obj5, bool) && obj5 != null) {
            ww9Var = (ww9) oh4Var.invoke(obj5);
        }
        return new fja(ww9Var2, ww9Var3, ww9Var4, ww9Var);
    }
}
