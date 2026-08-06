package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class y60 {
    public static final String a(m89 m89Var) {
        String strN = z2a.N(m89Var.c, ".");
        String str = m89Var.b;
        return w2a.h(str, strN, true) ? str : cj2.a(str, ".", strN);
    }

    public static final ArrayList b(List list) {
        x60 dVar;
        list.getClass();
        ArrayList arrayList = new ArrayList(ph1.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m89 m89Var = (m89) it.next();
            u60 u60Var = m89Var.j;
            String str = m89Var.c;
            String str2 = m89Var.d;
            int iOrdinal = u60Var.ordinal();
            if (iOrdinal == 0) {
                dVar = new x60.d(m89Var.a, m89Var.b, false, m89Var, str2 == null ? str : str2);
            } else if (iOrdinal == 1) {
                dVar = new x60.c(m89Var.a, a(m89Var), false, m89Var, str2 == null ? str : str2);
            } else if (iOrdinal == 2) {
                dVar = new x60.b(m89Var.a, a(m89Var), false, m89Var, str2 == null ? str : str2);
            } else {
                if (iOrdinal != 3) {
                    u.b();
                    return null;
                }
                dVar = new x60.a(m89Var.a, a(m89Var), false, m89Var);
            }
            arrayList.add(dVar);
        }
        return arrayList;
    }
}
