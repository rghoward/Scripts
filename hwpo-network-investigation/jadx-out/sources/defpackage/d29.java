package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d29 implements oh4 {
    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        Boolean bool = Boolean.FALSE;
        if (xj5.a(obj, bool)) {
            return new bka(bka.c);
        }
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        Float f = obj2 != null ? (Float) obj2 : null;
        f.getClass();
        float fFloatValue = f.floatValue();
        Object obj3 = list.get(1);
        u29 u29Var = t29.y;
        xj5.a(obj3, bool);
        dka dkaVar = obj3 != null ? (dka) u29Var.u.invoke(obj3) : null;
        dkaVar.getClass();
        return new bka(cka.c(fFloatValue, dkaVar.a));
    }
}
