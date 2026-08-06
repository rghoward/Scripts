package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface r7c {
    static a8c l(r7c r7cVar, i8c i8cVar, cgc cgcVar, ArrayList arrayList) {
        String str = i8cVar.t;
        if (r7cVar.o(str)) {
            a8c a8cVarI = r7cVar.i(str);
            if (a8cVarI instanceof g6c) {
                return ((g6c) a8cVarI).a(cgcVar, arrayList);
            }
            z90.a(al.d(str, " is not a function"));
            return null;
        }
        if ("hasOwnProperty".equals(str)) {
            gic.a(1, "hasOwnProperty", arrayList);
            return r7cVar.o(cgcVar.b.b(cgcVar, (a8c) arrayList.get(0)).c()) ? a8c.q : a8c.r;
        }
        z90.a(ct1.a("Object has no function ", str));
        return null;
    }

    a8c i(String str);

    void k(String str, a8c a8cVar);

    boolean o(String str);
}
