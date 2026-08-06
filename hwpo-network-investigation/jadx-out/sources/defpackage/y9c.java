package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class y9c extends o8c {
    public static a8c c(u9c u9cVar, a8c a8cVar, a8c a8cVar2) {
        if (a8cVar instanceof Iterable) {
            return d(u9cVar, ((Iterable) a8cVar).iterator(), a8cVar2);
        }
        z90.a("Non-iterable type in for...of loop.");
        return null;
    }

    public static a8c d(u9c u9cVar, Iterator it, a8c a8cVar) {
        if (it != null) {
            while (it.hasNext()) {
                a8c a8cVarB = u9cVar.a((a8c) it.next()).b((a2c) a8cVar);
                if (a8cVarB instanceof d4c) {
                    d4c d4cVar = (d4c) a8cVarB;
                    String str = d4cVar.u;
                    if ("break".equals(str)) {
                        return a8c.l;
                    }
                    if ("return".equals(str)) {
                        return d4cVar;
                    }
                }
            }
        }
        return a8c.l;
    }

    @Override // defpackage.o8c
    public final a8c a(String str, cgc cgcVar, ArrayList arrayList) {
        eac eacVar = eac.ADD;
        int iOrdinal = gic.e(str).ordinal();
        if (iOrdinal == 65) {
            gic.a(4, "WHILE", arrayList);
            a8c a8cVar = (a8c) arrayList.get(0);
            a8c a8cVar2 = (a8c) arrayList.get(1);
            a8c a8cVar3 = (a8c) arrayList.get(2);
            a8c a8cVar4 = (a8c) arrayList.get(3);
            q8c q8cVar = cgcVar.b;
            q8c q8cVar2 = cgcVar.b;
            a8c a8cVarB = q8cVar.b(cgcVar, a8cVar4);
            if (q8cVar2.b(cgcVar, a8cVar3).e().booleanValue()) {
                a8c a8cVarB2 = cgcVar.b((a2c) a8cVarB);
                if (a8cVarB2 instanceof d4c) {
                    d4c d4cVar = (d4c) a8cVarB2;
                    String str2 = d4cVar.u;
                    if ("break".equals(str2)) {
                        return a8c.l;
                    }
                    if ("return".equals(str2)) {
                        return d4cVar;
                    }
                }
            }
            while (q8cVar2.b(cgcVar, a8cVar).e().booleanValue()) {
                a8c a8cVarB3 = cgcVar.b((a2c) a8cVarB);
                if (a8cVarB3 instanceof d4c) {
                    d4c d4cVar2 = (d4c) a8cVarB3;
                    String str3 = d4cVar2.u;
                    if ("break".equals(str3)) {
                        return a8c.l;
                    }
                    if ("return".equals(str3)) {
                        return d4cVar2;
                    }
                }
                cgcVar.a(a8cVar2);
            }
            return a8c.l;
        }
        switch (iOrdinal) {
            case 26:
                gic.a(3, "FOR_IN", arrayList);
                if (!(arrayList.get(0) instanceof i8c)) {
                    z90.a("Variable name in FOR_IN must be a string");
                    return null;
                }
                String strC = ((a8c) arrayList.get(0)).c();
                a8c a8cVarB4 = cgcVar.b.b(cgcVar, (a8c) arrayList.get(1));
                a8c a8cVarB5 = cgcVar.b.b(cgcVar, (a8c) arrayList.get(2));
                Iterator itF = a8cVarB4.f();
                if (itF != null) {
                    while (itF.hasNext()) {
                        cgcVar.f(strC, (a8c) itF.next());
                        a8c a8cVarB6 = cgcVar.b((a2c) a8cVarB5);
                        if (a8cVarB6 instanceof d4c) {
                            d4c d4cVar3 = (d4c) a8cVarB6;
                            String str4 = d4cVar3.u;
                            if ("break".equals(str4)) {
                                return a8c.l;
                            }
                            if ("return".equals(str4)) {
                                return d4cVar3;
                            }
                        }
                    }
                }
                return a8c.l;
            case 27:
                gic.a(3, "FOR_IN_CONST", arrayList);
                if (!(arrayList.get(0) instanceof i8c)) {
                    z90.a("Variable name in FOR_IN_CONST must be a string");
                    return null;
                }
                return d(new q9c(cgcVar, ((a8c) arrayList.get(0)).c()), cgcVar.b.b(cgcVar, (a8c) arrayList.get(1)).f(), cgcVar.b.b(cgcVar, (a8c) arrayList.get(2)));
            case 28:
                gic.a(3, "FOR_IN_LET", arrayList);
                if (!(arrayList.get(0) instanceof i8c)) {
                    z90.a("Variable name in FOR_IN_LET must be a string");
                    return null;
                }
                String strC2 = ((a8c) arrayList.get(0)).c();
                a8c a8cVarB7 = cgcVar.b.b(cgcVar, (a8c) arrayList.get(1));
                a8c a8cVarB8 = cgcVar.b.b(cgcVar, (a8c) arrayList.get(2));
                Iterator itF2 = a8cVarB7.f();
                if (itF2 != null) {
                    while (itF2.hasNext()) {
                        a8c a8cVar5 = (a8c) itF2.next();
                        cgc cgcVarC = cgcVar.c();
                        cgcVarC.f(strC2, a8cVar5);
                        a8c a8cVarB9 = cgcVarC.b((a2c) a8cVarB8);
                        if (a8cVarB9 instanceof d4c) {
                            d4c d4cVar4 = (d4c) a8cVarB9;
                            String str5 = d4cVar4.u;
                            if ("break".equals(str5)) {
                                return a8c.l;
                            }
                            if ("return".equals(str5)) {
                                return d4cVar4;
                            }
                        }
                    }
                }
                return a8c.l;
            case 29:
                gic.a(4, "FOR_LET", arrayList);
                a8c a8cVar6 = (a8c) arrayList.get(0);
                q8c q8cVar3 = cgcVar.b;
                q8c q8cVar4 = cgcVar.b;
                a8c a8cVarB10 = q8cVar3.b(cgcVar, a8cVar6);
                if (!(a8cVarB10 instanceof a2c)) {
                    z90.a("Initializer variables in FOR_LET must be an ArrayList");
                    return null;
                }
                a2c a2cVar = (a2c) a8cVarB10;
                a8c a8cVar7 = (a8c) arrayList.get(1);
                a8c a8cVar8 = (a8c) arrayList.get(2);
                a8c a8cVarB11 = q8cVar4.b(cgcVar, (a8c) arrayList.get(3));
                cgc cgcVarC2 = cgcVar.c();
                for (int i = 0; i < a2cVar.r(); i++) {
                    String strC3 = a2cVar.t(i).c();
                    cgcVarC2.e(strC3, cgcVar.g(strC3));
                }
                while (q8cVar4.b(cgcVar, a8cVar7).e().booleanValue()) {
                    a8c a8cVarB12 = cgcVar.b((a2c) a8cVarB11);
                    if (a8cVarB12 instanceof d4c) {
                        d4c d4cVar5 = (d4c) a8cVarB12;
                        String str6 = d4cVar5.u;
                        if ("break".equals(str6)) {
                            return a8c.l;
                        }
                        if ("return".equals(str6)) {
                            return d4cVar5;
                        }
                    }
                    cgc cgcVarC3 = cgcVar.c();
                    for (int i2 = 0; i2 < a2cVar.r(); i2++) {
                        String strC4 = a2cVar.t(i2).c();
                        cgcVarC3.e(strC4, cgcVarC2.g(strC4));
                    }
                    cgcVarC3.a(a8cVar8);
                    cgcVarC2 = cgcVarC3;
                }
                return a8c.l;
            case 30:
                gic.a(3, "FOR_OF", arrayList);
                if (!(arrayList.get(0) instanceof i8c)) {
                    z90.a("Variable name in FOR_OF must be a string");
                    return null;
                }
                return c(new w9c(cgcVar, ((a8c) arrayList.get(0)).c()), cgcVar.b.b(cgcVar, (a8c) arrayList.get(1)), cgcVar.b.b(cgcVar, (a8c) arrayList.get(2)));
            case 31:
                gic.a(3, "FOR_OF_CONST", arrayList);
                if (!(arrayList.get(0) instanceof i8c)) {
                    z90.a("Variable name in FOR_OF_CONST must be a string");
                    return null;
                }
                return c(new q9c(cgcVar, ((a8c) arrayList.get(0)).c()), cgcVar.b.b(cgcVar, (a8c) arrayList.get(1)), cgcVar.b.b(cgcVar, (a8c) arrayList.get(2)));
            case 32:
                gic.a(3, "FOR_OF_LET", arrayList);
                if (!(arrayList.get(0) instanceof i8c)) {
                    z90.a("Variable name in FOR_OF_LET must be a string");
                    return null;
                }
                return c(new s9c(cgcVar, ((a8c) arrayList.get(0)).c()), cgcVar.b.b(cgcVar, (a8c) arrayList.get(1)), cgcVar.b.b(cgcVar, (a8c) arrayList.get(2)));
            default:
                b(str);
                throw null;
        }
    }
}
