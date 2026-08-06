package defpackage;

import com.intercom.twig.BuildConfig;
import io.intercom.android.sdk.models.carousel.ActionType;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class u8c extends o8c {
    public static y7c c(cgc cgcVar, List list) {
        eac eacVar = eac.ADD;
        gic.b(2, "FN", list);
        a8c a8cVarB = cgcVar.b.b(cgcVar, (a8c) list.get(0));
        a8c a8cVarB2 = cgcVar.b.b(cgcVar, (a8c) list.get(1));
        if (!(a8cVarB2 instanceof a2c)) {
            z90.a(ct1.a("FN requires an ArrayValue of parameter names found ", a8cVarB2.getClass().getCanonicalName()));
            return null;
        }
        List listP = ((a2c) a8cVarB2).p();
        List arrayList = new ArrayList();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new y7c(a8cVarB.c(), (ArrayList) listP, arrayList, cgcVar);
    }

    @Override // defpackage.o8c
    public final a8c a(String str, cgc cgcVar, ArrayList arrayList) {
        eac eacVar = eac.ADD;
        int iOrdinal = gic.e(str).ordinal();
        if (iOrdinal == 2) {
            gic.a(3, "APPLY", arrayList);
            a8c a8cVar = (a8c) arrayList.get(0);
            q8c q8cVar = cgcVar.b;
            q8c q8cVar2 = cgcVar.b;
            a8c a8cVarB = q8cVar.b(cgcVar, a8cVar);
            String strC = q8cVar2.b(cgcVar, (a8c) arrayList.get(1)).c();
            a8c a8cVarB2 = q8cVar2.b(cgcVar, (a8c) arrayList.get(2));
            if (!(a8cVarB2 instanceof a2c)) {
                z90.a(ct1.a("Function arguments for Apply are not a list found ", a8cVarB2.getClass().getCanonicalName()));
                return null;
            }
            if (!strC.isEmpty()) {
                return a8cVarB.j(strC, cgcVar, (ArrayList) ((a2c) a8cVarB2).p());
            }
            z90.a("Function name for apply is undefined");
            return null;
        }
        if (iOrdinal == 15) {
            gic.a(0, "BREAK", arrayList);
            return a8c.n;
        }
        if (iOrdinal == 25) {
            return c(cgcVar, arrayList);
        }
        if (iOrdinal == 41) {
            gic.b(2, "IF", arrayList);
            a8c a8cVar2 = (a8c) arrayList.get(0);
            q8c q8cVar3 = cgcVar.b;
            q8c q8cVar4 = cgcVar.b;
            a8c a8cVarB3 = q8cVar3.b(cgcVar, a8cVar2);
            a8c a8cVarB4 = q8cVar4.b(cgcVar, (a8c) arrayList.get(1));
            a8c a8cVarB5 = arrayList.size() > 2 ? q8cVar4.b(cgcVar, (a8c) arrayList.get(2)) : null;
            a8c a8cVar3 = a8c.l;
            a8c a8cVarB6 = a8cVarB3.e().booleanValue() ? cgcVar.b((a2c) a8cVarB4) : a8cVarB5 != null ? cgcVar.b((a2c) a8cVarB5) : a8cVar3;
            return true != (a8cVarB6 instanceof d4c) ? a8cVar3 : a8cVarB6;
        }
        if (iOrdinal == 54) {
            return new a2c(arrayList);
        }
        if (iOrdinal == 57) {
            if (arrayList.isEmpty()) {
                return a8c.p;
            }
            gic.a(1, "RETURN", arrayList);
            return new d4c("return", cgcVar.b.b(cgcVar, (a8c) arrayList.get(0)));
        }
        if (iOrdinal != 19) {
            if (iOrdinal == 20) {
                gic.b(2, "DEFINE_FUNCTION", arrayList);
                y7c y7cVarC = c(cgcVar, arrayList);
                String str2 = y7cVarC.t;
                if (str2 == null) {
                    cgcVar.e(BuildConfig.FLAVOR, y7cVarC);
                    return y7cVarC;
                }
                cgcVar.e(str2, y7cVarC);
                return y7cVarC;
            }
            if (iOrdinal == 60) {
                gic.a(3, "SWITCH", arrayList);
                a8c a8cVar4 = (a8c) arrayList.get(0);
                q8c q8cVar5 = cgcVar.b;
                q8c q8cVar6 = cgcVar.b;
                a8c a8cVarB7 = q8cVar5.b(cgcVar, a8cVar4);
                a8c a8cVarB8 = q8cVar6.b(cgcVar, (a8c) arrayList.get(1));
                a8c a8cVarB9 = q8cVar6.b(cgcVar, (a8c) arrayList.get(2));
                if (!(a8cVarB8 instanceof a2c)) {
                    z90.a("Malformed SWITCH statement, cases are not a list");
                    return null;
                }
                if (!(a8cVarB9 instanceof a2c)) {
                    z90.a("Malformed SWITCH statement, case statements are not a list");
                    return null;
                }
                a2c a2cVar = (a2c) a8cVarB8;
                a2c a2cVar2 = (a2c) a8cVarB9;
                boolean z = false;
                for (int i = 0; i < a2cVar.r(); i++) {
                    if (z || a8cVarB7.equals(q8cVar6.b(cgcVar, a2cVar.t(i)))) {
                        a8c a8cVarB10 = q8cVar6.b(cgcVar, a2cVar2.t(i));
                        if (a8cVarB10 instanceof d4c) {
                            return ((d4c) a8cVarB10).u.equals("break") ? a8c.l : a8cVarB10;
                        }
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (a2cVar.r() + 1 == a2cVar2.r()) {
                    a8c a8cVarB11 = q8cVar6.b(cgcVar, a2cVar2.t(a2cVar.r()));
                    if (a8cVarB11 instanceof d4c) {
                        String str3 = ((d4c) a8cVarB11).u;
                        if (str3.equals("return") || str3.equals(ActionType.CONTINUE)) {
                            return a8cVarB11;
                        }
                    }
                }
                return a8c.l;
            }
            if (iOrdinal == 61) {
                gic.a(3, "TERNARY", arrayList);
                a8c a8cVar5 = (a8c) arrayList.get(0);
                q8c q8cVar7 = cgcVar.b;
                q8c q8cVar8 = cgcVar.b;
                return q8cVar7.b(cgcVar, a8cVar5).e().booleanValue() ? q8cVar8.b(cgcVar, (a8c) arrayList.get(1)) : q8cVar8.b(cgcVar, (a8c) arrayList.get(2));
            }
            switch (iOrdinal) {
                case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    return cgcVar.c().b(new a2c(arrayList));
                case 12:
                    gic.a(0, "BREAK", arrayList);
                    return a8c.o;
                case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    break;
                default:
                    b(str);
                    throw null;
            }
        }
        if (arrayList.isEmpty()) {
            return a8c.l;
        }
        a8c a8cVarB12 = cgcVar.b.b(cgcVar, (a8c) arrayList.get(0));
        return a8cVarB12 instanceof a2c ? cgcVar.b((a2c) a8cVarB12) : a8c.l;
    }
}
