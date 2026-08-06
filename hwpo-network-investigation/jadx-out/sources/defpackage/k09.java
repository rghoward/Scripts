package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class k09 implements b33 {
    public final /* synthetic */ l09 a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ p09 c;

    public k09(l09 l09Var, Object obj, p09 p09Var) {
        this.a = l09Var;
        this.b = obj;
        this.c = p09Var;
    }

    @Override // defpackage.b33
    public final void dispose() {
        l09 l09Var = this.a;
        c37<Object, m09> c37Var = l09Var.u;
        Object obj = this.b;
        m09 m09VarK = c37Var.k(obj);
        p09 p09Var = this.c;
        if (m09VarK == p09Var) {
            Map<Object, Map<String, List<Object>>> map = l09Var.t;
            Map<String, List<Object>> mapC = p09Var.c();
            if (mapC.isEmpty()) {
                map.remove(obj);
            } else {
                map.put(obj, mapC);
            }
        }
    }
}
