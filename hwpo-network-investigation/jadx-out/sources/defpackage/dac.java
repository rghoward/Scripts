package defpackage;

import io.ably.lib.http.HttpConstants;
import io.ably.lib.transport.Defaults;
import io.intercom.android.sdk.models.AttributeType;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class dac extends o8c {
    @Override // defpackage.o8c
    public final a8c a(String str, cgc cgcVar, ArrayList arrayList) {
        String str2;
        eac eacVar = eac.ADD;
        int iOrdinal = gic.e(str).ordinal();
        int i = 0;
        if (iOrdinal == 3) {
            gic.a(2, "ASSIGN", arrayList);
            a8c a8cVarB = cgcVar.b.b(cgcVar, (a8c) arrayList.get(0));
            if (!(a8cVarB instanceof i8c)) {
                z90.a(ct1.a("Expected string for assign var. got ", a8cVarB.getClass().getCanonicalName()));
                return null;
            }
            String str3 = ((i8c) a8cVarB).t;
            if (!cgcVar.d(str3)) {
                z90.a(ct1.a("Attempting to assign undefined value ", str3));
                return null;
            }
            a8c a8cVarB2 = cgcVar.b.b(cgcVar, (a8c) arrayList.get(1));
            cgcVar.e(str3, a8cVarB2);
            return a8cVarB2;
        }
        if (iOrdinal == 14) {
            gic.b(2, "CONST", arrayList);
            if (arrayList.size() % 2 != 0) {
                z90.a(pp2.a(arrayList.size(), "CONST requires an even number of arguments, found "));
                return null;
            }
            while (i < arrayList.size() - 1) {
                a8c a8cVarB3 = cgcVar.b.b(cgcVar, (a8c) arrayList.get(i));
                if (!(a8cVarB3 instanceof i8c)) {
                    z90.a(ct1.a("Expected string for const name. got ", a8cVarB3.getClass().getCanonicalName()));
                    return null;
                }
                String str4 = ((i8c) a8cVarB3).t;
                cgcVar.f(str4, cgcVar.b.b(cgcVar, (a8c) arrayList.get(i + 1)));
                cgcVar.d.put(str4, Boolean.TRUE);
                i += 2;
            }
            return a8c.l;
        }
        if (iOrdinal == 24) {
            gic.b(1, "EXPRESSION_LIST", arrayList);
            a8c a8cVarB4 = a8c.l;
            while (i < arrayList.size()) {
                a8cVarB4 = cgcVar.b.b(cgcVar, (a8c) arrayList.get(i));
                if (a8cVarB4 instanceof d4c) {
                    aa0.c("ControlValue cannot be in an expression list");
                    return null;
                }
                i++;
            }
            return a8cVarB4;
        }
        if (iOrdinal == 33) {
            gic.a(1, HttpConstants.Methods.GET, arrayList);
            a8c a8cVarB5 = cgcVar.b.b(cgcVar, (a8c) arrayList.get(0));
            if (a8cVarB5 instanceof i8c) {
                return cgcVar.g(((i8c) a8cVarB5).t);
            }
            z90.a(ct1.a("Expected string for get var. got ", a8cVarB5.getClass().getCanonicalName()));
            return null;
        }
        if (iOrdinal == 49) {
            gic.a(0, "NULL", arrayList);
            return a8c.m;
        }
        if (iOrdinal == 58) {
            gic.a(3, "SET_PROPERTY", arrayList);
            a8c a8cVar = (a8c) arrayList.get(0);
            q8c q8cVar = cgcVar.b;
            q8c q8cVar2 = cgcVar.b;
            a8c a8cVarB6 = q8cVar.b(cgcVar, a8cVar);
            a8c a8cVarB7 = q8cVar2.b(cgcVar, (a8c) arrayList.get(1));
            a8c a8cVarB8 = q8cVar2.b(cgcVar, (a8c) arrayList.get(2));
            if (a8cVarB6 == a8c.l || a8cVarB6 == a8c.m) {
                f04.b("Can't set property ", a8cVarB7.c(), " of ", a8cVarB6.c());
                return null;
            }
            if ((a8cVarB6 instanceof a2c) && (a8cVarB7 instanceof d5c)) {
                ((a2c) a8cVarB6).u(((d5c) a8cVarB7).t.intValue(), a8cVarB8);
                return a8cVarB8;
            }
            if (!(a8cVarB6 instanceof r7c)) {
                return a8cVarB8;
            }
            ((r7c) a8cVarB6).k(a8cVarB7.c(), a8cVarB8);
            return a8cVarB8;
        }
        if (iOrdinal == 17) {
            if (arrayList.isEmpty()) {
                return new a2c();
            }
            a2c a2cVar = new a2c();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                a8c a8cVarB9 = cgcVar.b.b(cgcVar, (a8c) obj);
                if (a8cVarB9 instanceof d4c) {
                    aa0.c("Failed to evaluate array element");
                    return null;
                }
                a2cVar.u(i, a8cVarB9);
                i++;
            }
            return a2cVar;
        }
        if (iOrdinal == 18) {
            if (arrayList.isEmpty()) {
                return new u7c();
            }
            if (arrayList.size() % 2 != 0) {
                z90.a(pp2.a(arrayList.size(), "CREATE_OBJECT requires an even number of arguments, found "));
                return null;
            }
            u7c u7cVar = new u7c();
            while (i < arrayList.size() - 1) {
                a8c a8cVarB10 = cgcVar.b.b(cgcVar, (a8c) arrayList.get(i));
                a8c a8cVarB11 = cgcVar.b.b(cgcVar, (a8c) arrayList.get(i + 1));
                if ((a8cVarB10 instanceof d4c) || (a8cVarB11 instanceof d4c)) {
                    aa0.c("Failed to evaluate map entry");
                    return null;
                }
                u7cVar.k(a8cVarB10.c(), a8cVarB11);
                i += 2;
            }
            return u7cVar;
        }
        if (iOrdinal == 35 || iOrdinal == 36) {
            gic.a(2, "GET_PROPERTY", arrayList);
            a8c a8cVarB12 = cgcVar.b.b(cgcVar, (a8c) arrayList.get(0));
            a8c a8cVarB13 = cgcVar.b.b(cgcVar, (a8c) arrayList.get(1));
            if ((a8cVarB12 instanceof a2c) && gic.d(a8cVarB13)) {
                return ((a2c) a8cVarB12).t(a8cVarB13.d().intValue());
            }
            if (a8cVarB12 instanceof r7c) {
                return ((r7c) a8cVarB12).i(a8cVarB13.c());
            }
            if (a8cVarB12 instanceof i8c) {
                if ("length".equals(a8cVarB13.c())) {
                    return new d5c(Double.valueOf(((i8c) a8cVarB12).t.length()));
                }
                if (gic.d(a8cVarB13)) {
                    double dDoubleValue = a8cVarB13.d().doubleValue();
                    String str5 = ((i8c) a8cVarB12).t;
                    if (dDoubleValue < str5.length()) {
                        return new i8c(String.valueOf(str5.charAt(a8cVarB13.d().intValue())));
                    }
                }
            }
            return a8c.l;
        }
        switch (iOrdinal) {
            case 62:
                gic.a(1, "TYPEOF", arrayList);
                a8c a8cVarB14 = cgcVar.b.b(cgcVar, (a8c) arrayList.get(0));
                if (a8cVarB14 instanceof k8c) {
                    str2 = "undefined";
                } else if (a8cVarB14 instanceof b3c) {
                    str2 = AttributeType.BOOLEAN;
                } else if (a8cVarB14 instanceof d5c) {
                    str2 = AttributeType.NUMBER;
                } else if (a8cVarB14 instanceof i8c) {
                    str2 = "string";
                } else if (a8cVarB14 instanceof y7c) {
                    str2 = "function";
                } else {
                    if ((a8cVarB14 instanceof c8c) || (a8cVarB14 instanceof d4c)) {
                        throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", a8cVarB14));
                    }
                    str2 = "object";
                }
                return new i8c(str2);
            case 63:
                gic.a(0, "UNDEFINED", arrayList);
                return a8c.l;
            case Defaults.HTTP_ASYNC_THREADPOOL_SIZE /* 64 */:
                gic.b(1, "VAR", arrayList);
                int size2 = arrayList.size();
                while (i < size2) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    a8c a8cVarB15 = cgcVar.b.b(cgcVar, (a8c) obj2);
                    if (!(a8cVarB15 instanceof i8c)) {
                        z90.a(ct1.a("Expected string for var name. got ", a8cVarB15.getClass().getCanonicalName()));
                        return null;
                    }
                    cgcVar.f(((i8c) a8cVarB15).t, a8c.l);
                }
                return a8c.l;
            default:
                b(str);
                throw null;
        }
    }
}
