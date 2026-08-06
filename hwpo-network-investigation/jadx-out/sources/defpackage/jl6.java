package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jl6 {
    public static final ArrayList a(qj5 qj5Var) {
        qj5Var.getClass();
        qr5 qr5VarX1 = ((il6) qj5Var).x1();
        boolean zB = b(qr5VarX1);
        k37.a aVar = (k37.a) qr5VarX1.C();
        k37<T> k37Var = aVar.t;
        ArrayList arrayList = new ArrayList(k37Var.v);
        int i = k37Var.v;
        for (int i2 = 0; i2 < i; i2++) {
            qr5 qr5Var = (qr5) aVar.get(i2);
            arrayList.add(zB ? qr5Var.z() : qr5Var.A());
        }
        return arrayList;
    }

    public static final boolean b(qr5 qr5Var) {
        int iOrdinal = qr5Var.Z.d.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            u.b();
                            return false;
                        }
                        qr5 qr5VarI = qr5Var.I();
                        if (qr5VarI != null) {
                            return b(qr5VarI);
                        }
                        z90.a("no parent for idle node");
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }
}
