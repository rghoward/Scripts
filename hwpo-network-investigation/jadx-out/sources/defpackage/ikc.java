package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ikc {
    public static a8c a(Object obj) {
        if (obj == null) {
            return a8c.m;
        }
        if (obj instanceof String) {
            return new i8c((String) obj);
        }
        if (obj instanceof Double) {
            return new d5c((Double) obj);
        }
        if (obj instanceof Long) {
            return new d5c(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new d5c(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new b3c((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                z90.a("Invalid value type");
                return null;
            }
            a2c a2cVar = new a2c();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                a2cVar.u(a2cVar.r(), a(it.next()));
            }
            return a2cVar;
        }
        u7c u7cVar = new u7c();
        Map map = (Map) obj;
        for (Object string : map.keySet()) {
            a8c a8cVarA = a(map.get(string));
            if (string != null) {
                if (!(string instanceof String)) {
                    string = string.toString();
                }
                u7cVar.k((String) string, a8cVarA);
            }
        }
        return u7cVar;
    }

    public static a8c b(bnc bncVar) {
        if (bncVar == null) {
            return a8c.l;
        }
        int iF = bncVar.F() - 1;
        if (iF == 1) {
            return bncVar.z() ? new i8c(bncVar.A()) : a8c.s;
        }
        if (iF == 2) {
            return bncVar.D() ? new d5c(Double.valueOf(bncVar.E())) : new d5c(null);
        }
        if (iF == 3) {
            return bncVar.B() ? new b3c(Boolean.valueOf(bncVar.C())) : new b3c(null);
        }
        if (iF != 4) {
            z90.a("Unknown type found. Cannot convert entity");
            return null;
        }
        List listX = bncVar.x();
        ArrayList arrayList = new ArrayList();
        Iterator it = listX.iterator();
        while (it.hasNext()) {
            arrayList.add(b((bnc) it.next()));
        }
        return new c8c(bncVar.y(), arrayList);
    }
}
