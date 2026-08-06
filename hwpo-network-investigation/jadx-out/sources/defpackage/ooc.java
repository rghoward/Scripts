package defpackage;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ooc extends g6c {
    public final zyb v;

    public ooc(zyb zybVar) {
        super("internal.eventLogger");
        this.v = zybVar;
    }

    @Override // defpackage.g6c
    public final a8c a(cgc cgcVar, List list) {
        gic.a(3, this.t, list);
        String strC = cgcVar.b.b(cgcVar, (a8c) list.get(0)).c();
        a8c a8cVar = (a8c) list.get(1);
        q8c q8cVar = cgcVar.b;
        long jH = (long) gic.h(q8cVar.b(cgcVar, a8cVar).d().doubleValue());
        a8c a8cVarB = q8cVar.b(cgcVar, (a8c) list.get(2));
        HashMap mapJ = a8cVarB instanceof u7c ? gic.j((u7c) a8cVarB) : new HashMap();
        zyb zybVar = this.v;
        zybVar.getClass();
        HashMap map = new HashMap();
        for (String str : mapJ.keySet()) {
            HashMap map2 = zybVar.a.c;
            map.put(str, zxb.b(map2.containsKey(str) ? map2.get(str) : null, mapJ.get(str), str));
        }
        zybVar.c.add(new zxb(strC, jH, map));
        return a8c.l;
    }
}
