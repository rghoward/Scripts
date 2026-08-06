package defpackage;

import io.intercom.android.sdk.models.carousel.Carousel;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class aac extends o8c {
    @Override // defpackage.o8c
    public final a8c a(String str, cgc cgcVar, ArrayList arrayList) {
        eac eacVar = eac.ADD;
        int iOrdinal = gic.e(str).ordinal();
        if (iOrdinal == 0) {
            gic.a(2, "ADD", arrayList);
            a8c a8cVarB = cgcVar.b.b(cgcVar, (a8c) arrayList.get(0));
            a8c a8cVarB2 = cgcVar.b.b(cgcVar, (a8c) arrayList.get(1));
            if (!(a8cVarB instanceof r7c) && !(a8cVarB instanceof i8c) && !(a8cVarB2 instanceof r7c) && !(a8cVarB2 instanceof i8c)) {
                return new d5c(Double.valueOf(a8cVarB2.d().doubleValue() + a8cVarB.d().doubleValue()));
            }
            return new i8c(String.valueOf(a8cVarB.c()).concat(String.valueOf(a8cVarB2.c())));
        }
        if (iOrdinal == 21) {
            gic.a(2, "DIVIDE", arrayList);
            return new d5c(Double.valueOf(cgcVar.b.b(cgcVar, (a8c) arrayList.get(0)).d().doubleValue() / cgcVar.b.b(cgcVar, (a8c) arrayList.get(1)).d().doubleValue()));
        }
        if (iOrdinal == 59) {
            gic.a(2, "SUBTRACT", arrayList);
            a8c a8cVarB3 = cgcVar.b.b(cgcVar, (a8c) arrayList.get(0));
            return new d5c(Double.valueOf(a8cVarB3.d().doubleValue() + (-cgcVar.b.b(cgcVar, (a8c) arrayList.get(1)).d().doubleValue())));
        }
        if (iOrdinal == 52 || iOrdinal == 53) {
            gic.a(2, str, arrayList);
            a8c a8cVarB4 = cgcVar.b.b(cgcVar, (a8c) arrayList.get(0));
            cgcVar.a((a8c) arrayList.get(1));
            return a8cVarB4;
        }
        if (iOrdinal == 55 || iOrdinal == 56) {
            gic.a(1, str, arrayList);
            return cgcVar.b.b(cgcVar, (a8c) arrayList.get(0));
        }
        switch (iOrdinal) {
            case Carousel.ENTITY_TYPE /* 44 */:
                gic.a(2, "MODULUS", arrayList);
                return new d5c(Double.valueOf(cgcVar.b.b(cgcVar, (a8c) arrayList.get(0)).d().doubleValue() % cgcVar.b.b(cgcVar, (a8c) arrayList.get(1)).d().doubleValue()));
            case 45:
                gic.a(2, "MULTIPLY", arrayList);
                return new d5c(Double.valueOf(cgcVar.b.b(cgcVar, (a8c) arrayList.get(1)).d().doubleValue() * cgcVar.b.b(cgcVar, (a8c) arrayList.get(0)).d().doubleValue()));
            case 46:
                gic.a(1, "NEGATE", arrayList);
                return new d5c(Double.valueOf(-cgcVar.b.b(cgcVar, (a8c) arrayList.get(0)).d().doubleValue()));
            default:
                b(str);
                throw null;
        }
    }
}
