package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class o5d extends g6c {
    public final t9d v;

    public o5d(t9d t9dVar) {
        super("internal.registerCallback");
        this.v = t9dVar;
    }

    @Override // defpackage.g6c
    public final a8c a(cgc cgcVar, List list) {
        TreeMap treeMap;
        gic.a(3, this.t, list);
        cgcVar.b.b(cgcVar, (a8c) list.get(0)).c();
        a8c a8cVar = (a8c) list.get(1);
        q8c q8cVar = cgcVar.b;
        a8c a8cVarB = q8cVar.b(cgcVar, a8cVar);
        if (!(a8cVarB instanceof y7c)) {
            z90.a("Invalid callback type");
            return null;
        }
        a8c a8cVarB2 = q8cVar.b(cgcVar, (a8c) list.get(2));
        if (!(a8cVarB2 instanceof u7c)) {
            z90.a("Invalid callback params");
            return null;
        }
        u7c u7cVar = (u7c) a8cVarB2;
        HashMap map = u7cVar.t;
        if (!map.containsKey("type")) {
            z90.a("Undefined rule type");
            return null;
        }
        String strC = u7cVar.i("type").c();
        int iG = map.containsKey("priority") ? gic.g(u7cVar.i("priority").d().doubleValue()) : 1000;
        y7c y7cVar = (y7c) a8cVarB;
        t9d t9dVar = this.v;
        t9dVar.getClass();
        if ("create".equals(strC)) {
            treeMap = t9dVar.b;
        } else {
            if (!"edit".equals(strC)) {
                aa0.c("Unknown callback type: ".concat(String.valueOf(strC)));
                return null;
            }
            treeMap = t9dVar.a;
        }
        if (treeMap.containsKey(Integer.valueOf(iG))) {
            iG = ((Integer) treeMap.lastKey()).intValue() + 1;
        }
        treeMap.put(Integer.valueOf(iG), y7cVar);
        return a8c.l;
    }
}
