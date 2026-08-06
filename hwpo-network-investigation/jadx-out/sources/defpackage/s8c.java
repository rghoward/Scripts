package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class s8c extends o8c {
    public static boolean c(a8c a8cVar, a8c a8cVar2) {
        if (a8cVar instanceof r7c) {
            a8cVar = new i8c(a8cVar.c());
        }
        if (a8cVar2 instanceof r7c) {
            a8cVar2 = new i8c(a8cVar2.c());
        }
        if ((a8cVar instanceof i8c) && (a8cVar2 instanceof i8c)) {
            return ((i8c) a8cVar).t.compareTo(((i8c) a8cVar2).t) < 0;
        }
        double dDoubleValue = a8cVar.d().doubleValue();
        double dDoubleValue2 = a8cVar2.d().doubleValue();
        return (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2) || (dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || ((dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || Double.compare(dDoubleValue, dDoubleValue2) >= 0)) ? false : true;
    }

    public static boolean d(a8c a8cVar, a8c a8cVar2) {
        if (a8cVar.getClass().equals(a8cVar2.getClass())) {
            if ((a8cVar instanceof k8c) || (a8cVar instanceof w7c)) {
                return true;
            }
            if (a8cVar instanceof d5c) {
                return (Double.isNaN(a8cVar.d().doubleValue()) || Double.isNaN(a8cVar2.d().doubleValue()) || a8cVar.d().doubleValue() != a8cVar2.d().doubleValue()) ? false : true;
            }
            if (a8cVar instanceof i8c) {
                return a8cVar.c().equals(a8cVar2.c());
            }
            if (a8cVar instanceof b3c) {
                return a8cVar.e().equals(a8cVar2.e());
            }
            return a8cVar == a8cVar2;
        }
        if (((a8cVar instanceof k8c) || (a8cVar instanceof w7c)) && ((a8cVar2 instanceof k8c) || (a8cVar2 instanceof w7c))) {
            return true;
        }
        boolean z = a8cVar instanceof d5c;
        if (z && (a8cVar2 instanceof i8c)) {
            return d(a8cVar, new d5c(a8cVar2.d()));
        }
        boolean z2 = a8cVar instanceof i8c;
        if (z2 && (a8cVar2 instanceof d5c)) {
            return d(new d5c(a8cVar.d()), a8cVar2);
        }
        if (a8cVar instanceof b3c) {
            return d(new d5c(a8cVar.d()), a8cVar2);
        }
        if (a8cVar2 instanceof b3c) {
            return d(a8cVar, new d5c(a8cVar2.d()));
        }
        if ((z2 || z) && (a8cVar2 instanceof r7c)) {
            return d(a8cVar, new i8c(a8cVar2.c()));
        }
        if ((a8cVar instanceof r7c) && ((a8cVar2 instanceof i8c) || (a8cVar2 instanceof d5c))) {
            return d(new i8c(a8cVar.c()), a8cVar2);
        }
        return false;
    }

    public static boolean e(a8c a8cVar, a8c a8cVar2) {
        if (a8cVar instanceof r7c) {
            a8cVar = new i8c(a8cVar.c());
        }
        if (a8cVar2 instanceof r7c) {
            a8cVar2 = new i8c(a8cVar2.c());
        }
        return (((a8cVar instanceof i8c) && (a8cVar2 instanceof i8c)) || !(Double.isNaN(a8cVar.d().doubleValue()) || Double.isNaN(a8cVar2.d().doubleValue()))) && !c(a8cVar2, a8cVar);
    }

    @Override // defpackage.o8c
    public final a8c a(String str, cgc cgcVar, ArrayList arrayList) {
        boolean zD;
        boolean zD2;
        gic.a(2, gic.e(str).name(), arrayList);
        a8c a8cVarB = cgcVar.b.b(cgcVar, (a8c) arrayList.get(0));
        a8c a8cVarB2 = cgcVar.b.b(cgcVar, (a8c) arrayList.get(1));
        int iOrdinal = gic.e(str).ordinal();
        if (iOrdinal != 23) {
            if (iOrdinal == 48) {
                zD2 = d(a8cVarB, a8cVarB2);
            } else if (iOrdinal == 42) {
                zD = c(a8cVarB, a8cVarB2);
            } else if (iOrdinal != 43) {
                switch (iOrdinal) {
                    case 37:
                        zD = c(a8cVarB2, a8cVarB);
                        break;
                    case 38:
                        zD = e(a8cVarB2, a8cVarB);
                        break;
                    case 39:
                        zD = gic.f(a8cVarB, a8cVarB2);
                        break;
                    case 40:
                        zD2 = gic.f(a8cVarB, a8cVarB2);
                        break;
                    default:
                        b(str);
                        throw null;
                }
            } else {
                zD = e(a8cVarB, a8cVarB2);
            }
            zD = !zD2;
        } else {
            zD = d(a8cVarB, a8cVarB2);
        }
        return zD ? a8c.q : a8c.r;
    }
}
