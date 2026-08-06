package defpackage;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class nl8 implements g76 {
    public final Object t;
    public final ud1.a u;

    public nl8(l76 l76Var) {
        this.t = l76Var;
        ud1 ud1Var = ud1.c;
        Class<?> cls = l76Var.getClass();
        ud1.a aVar = (ud1.a) ud1Var.a.get(cls);
        this.u = aVar == null ? ud1Var.a(cls, null) : aVar;
    }

    @Override // defpackage.g76
    public final void t(m76 m76Var, s66.a aVar) {
        HashMap map = this.u.a;
        List list = (List) map.get(aVar);
        Object obj = this.t;
        ud1.a.a(list, m76Var, aVar, obj);
        ud1.a.a((List) map.get(s66.a.ON_ANY), m76Var, aVar, obj);
    }
}
