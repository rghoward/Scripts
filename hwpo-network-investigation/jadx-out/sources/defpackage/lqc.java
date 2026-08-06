package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lqc extends u7c {
    public final zyb u;

    public lqc(zyb zybVar) {
        this.u = zybVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.u7c, defpackage.a8c
    public final a8c j(String str, cgc cgcVar, ArrayList arrayList) {
        int iHashCode = str.hashCode();
        zyb zybVar = this.u;
        switch (iHashCode) {
            case 21624207:
                if (str.equals("getEventName")) {
                    gic.a(0, "getEventName", arrayList);
                    return new i8c(zybVar.b.a);
                }
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    gic.a(0, "getTimestamp", arrayList);
                    return new d5c(Double.valueOf(zybVar.b.b));
                }
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    gic.a(1, "getParamValue", arrayList);
                    String strC = cgcVar.b.b(cgcVar, (a8c) arrayList.get(0)).c();
                    HashMap map = zybVar.b.c;
                    return ikc.a(map.containsKey(strC) ? map.get(strC) : null);
                }
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    gic.a(0, "getParams", arrayList);
                    HashMap map2 = zybVar.b.c;
                    u7c u7cVar = new u7c();
                    for (String str2 : map2.keySet()) {
                        u7cVar.k(str2, ikc.a(map2.get(str2)));
                    }
                    return u7cVar;
                }
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    gic.a(2, "setParamValue", arrayList);
                    String strC2 = cgcVar.b.b(cgcVar, (a8c) arrayList.get(0)).c();
                    a8c a8cVarB = cgcVar.b.b(cgcVar, (a8c) arrayList.get(1));
                    zxb zxbVar = zybVar.b;
                    Object objI = gic.i(a8cVarB);
                    HashMap map3 = zxbVar.c;
                    if (objI == null) {
                        map3.remove(strC2);
                        return a8cVarB;
                    }
                    map3.put(strC2, zxb.b(map3.get(strC2), objI, strC2));
                    return a8cVarB;
                }
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    gic.a(1, "setEventName", arrayList);
                    a8c a8cVarB2 = cgcVar.b.b(cgcVar, (a8c) arrayList.get(0));
                    if (a8c.l.equals(a8cVarB2) || a8c.m.equals(a8cVarB2)) {
                        z90.a("Illegal event name");
                        return null;
                    }
                    zybVar.b.a = a8cVarB2.c();
                    return new i8c(a8cVarB2.c());
                }
                break;
        }
        return super.j(str, cgcVar, arrayList);
    }
}
