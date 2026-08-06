package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class m8c extends o8c {
    @Override // defpackage.o8c
    public final a8c a(String str, cgc cgcVar, ArrayList arrayList) {
        eac eacVar = eac.ADD;
        switch (gic.e(str).ordinal()) {
            case 4:
                gic.a(2, "BITWISE_AND", arrayList);
                return new d5c(Double.valueOf(gic.g(cgcVar.b.b(cgcVar, (a8c) arrayList.get(0)).d().doubleValue()) & gic.g(cgcVar.b.b(cgcVar, (a8c) arrayList.get(1)).d().doubleValue())));
            case 5:
                gic.a(2, "BITWISE_LEFT_SHIFT", arrayList);
                return new d5c(Double.valueOf(gic.g(cgcVar.b.b(cgcVar, (a8c) arrayList.get(0)).d().doubleValue()) << ((int) (((long) gic.g(cgcVar.b.b(cgcVar, (a8c) arrayList.get(1)).d().doubleValue())) & 31))));
            case 6:
                gic.a(1, "BITWISE_NOT", arrayList);
                return new d5c(Double.valueOf(~gic.g(cgcVar.b.b(cgcVar, (a8c) arrayList.get(0)).d().doubleValue())));
            case 7:
                gic.a(2, "BITWISE_OR", arrayList);
                return new d5c(Double.valueOf(gic.g(cgcVar.b.b(cgcVar, (a8c) arrayList.get(0)).d().doubleValue()) | gic.g(cgcVar.b.b(cgcVar, (a8c) arrayList.get(1)).d().doubleValue())));
            case 8:
                gic.a(2, "BITWISE_RIGHT_SHIFT", arrayList);
                return new d5c(Double.valueOf(gic.g(cgcVar.b.b(cgcVar, (a8c) arrayList.get(0)).d().doubleValue()) >> ((int) (((long) gic.g(cgcVar.b.b(cgcVar, (a8c) arrayList.get(1)).d().doubleValue())) & 31))));
            case 9:
                gic.a(2, "BITWISE_UNSIGNED_RIGHT_SHIFT", arrayList);
                return new d5c(Double.valueOf((((long) gic.g(cgcVar.b.b(cgcVar, (a8c) arrayList.get(0)).d().doubleValue())) & 4294967295L) >>> ((int) (((long) gic.g(cgcVar.b.b(cgcVar, (a8c) arrayList.get(1)).d().doubleValue())) & 31))));
            case 10:
                gic.a(2, "BITWISE_XOR", arrayList);
                return new d5c(Double.valueOf(gic.g(cgcVar.b.b(cgcVar, (a8c) arrayList.get(0)).d().doubleValue()) ^ gic.g(cgcVar.b.b(cgcVar, (a8c) arrayList.get(1)).d().doubleValue())));
            default:
                b(str);
                throw null;
        }
    }
}
