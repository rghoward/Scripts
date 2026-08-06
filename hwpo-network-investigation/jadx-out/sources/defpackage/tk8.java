package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tk8 {
    public static tk8 a;

    public static final sk8 a(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new sk8(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2));
    }

    public static a8c b(a2c a2cVar, cgc cgcVar, ArrayList arrayList, boolean z) {
        a8c a8cVarA;
        gic.b(1, "reduce", arrayList);
        gic.c("reduce", 2, arrayList);
        a8c a8cVarB = cgcVar.b.b(cgcVar, (a8c) arrayList.get(0));
        if (!(a8cVarB instanceof g6c)) {
            z90.a("Callback should be a method");
            return null;
        }
        if (arrayList.size() == 2) {
            a8cVarA = cgcVar.b.b(cgcVar, (a8c) arrayList.get(1));
            if (a8cVarA instanceof d4c) {
                z90.a("Failed to parse initial value");
                return null;
            }
        } else {
            if (a2cVar.r() == 0) {
                aa0.c("Empty array with no initial value error");
                return null;
            }
            a8cVarA = null;
        }
        g6c g6cVar = (g6c) a8cVarB;
        int iR = a2cVar.r();
        int i = z ? 0 : iR - 1;
        int i2 = z ? iR - 1 : 0;
        int i3 = true == z ? 1 : -1;
        if (a8cVarA == null) {
            a8cVarA = a2cVar.t(i);
            i += i3;
        }
        while ((i2 - i) * i3 >= 0) {
            if (a2cVar.v(i)) {
                a8cVarA = g6cVar.a(cgcVar, Arrays.asList(a8cVarA, a2cVar.t(i), new d5c(Double.valueOf(i)), a2cVar));
                if (a8cVarA instanceof d4c) {
                    aa0.c("Reduce operation failed");
                    return null;
                }
                i += i3;
            } else {
                i += i3;
            }
        }
        return a8cVarA;
    }

    public static a2c c(a2c a2cVar, cgc cgcVar, y7c y7cVar, Boolean bool, Boolean bool2) {
        a2c a2cVar2 = new a2c();
        Iterator itQ = a2cVar.q();
        while (itQ.hasNext()) {
            int iIntValue = ((Integer) itQ.next()).intValue();
            if (a2cVar.v(iIntValue)) {
                a8c a8cVarA = y7cVar.a(cgcVar, Arrays.asList(a2cVar.t(iIntValue), new d5c(Double.valueOf(iIntValue)), a2cVar));
                if (a8cVarA.e().equals(bool)) {
                    break;
                }
                if (bool2 == null || a8cVarA.e().equals(bool2)) {
                    a2cVar2.u(iIntValue, a8cVarA);
                }
            }
        }
        return a2cVar2;
    }
}
