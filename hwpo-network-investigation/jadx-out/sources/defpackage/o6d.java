package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class o6d extends g6c {
    public final nmc v;
    public final HashMap w;

    public o6d(nmc nmcVar) {
        super("require");
        this.w = new HashMap();
        this.v = nmcVar;
    }

    @Override // defpackage.g6c
    public final a8c a(cgc cgcVar, List list) {
        a8c a8cVar;
        gic.a(1, "require", list);
        String strC = cgcVar.b.b(cgcVar, (a8c) list.get(0)).c();
        HashMap map = this.w;
        if (map.containsKey(strC)) {
            return (a8c) map.get(strC);
        }
        HashMap map2 = this.v.a;
        if (map2.containsKey(strC)) {
            try {
                a8cVar = (a8c) ((Callable) map2.get(strC)).call();
            } catch (Exception unused) {
                aa0.c("Failed to create API implementation: ".concat(String.valueOf(strC)));
                return null;
            }
        } else {
            a8cVar = a8c.l;
        }
        if (a8cVar instanceof g6c) {
            map.put(strC, (g6c) a8cVar);
        }
        return a8cVar;
    }
}
