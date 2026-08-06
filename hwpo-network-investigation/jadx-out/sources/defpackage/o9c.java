package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class o9c extends o8c {
    @Override // defpackage.o8c
    public final a8c a(String str, cgc cgcVar, ArrayList arrayList) {
        eac eacVar = eac.ADD;
        int iOrdinal = gic.e(str).ordinal();
        if (iOrdinal == 1) {
            gic.a(2, "AND", arrayList);
            a8c a8cVarB = cgcVar.b.b(cgcVar, (a8c) arrayList.get(0));
            if (!a8cVarB.e().booleanValue()) {
                return a8cVarB;
            }
            return cgcVar.b.b(cgcVar, (a8c) arrayList.get(1));
        }
        if (iOrdinal == 47) {
            gic.a(1, "NOT", arrayList);
            return new b3c(Boolean.valueOf(!cgcVar.b.b(cgcVar, (a8c) arrayList.get(0)).e().booleanValue()));
        }
        if (iOrdinal != 50) {
            b(str);
            throw null;
        }
        gic.a(2, "OR", arrayList);
        a8c a8cVarB2 = cgcVar.b.b(cgcVar, (a8c) arrayList.get(0));
        if (a8cVarB2.e().booleanValue()) {
            return a8cVarB2;
        }
        return cgcVar.b.b(cgcVar, (a8c) arrayList.get(1));
    }
}
