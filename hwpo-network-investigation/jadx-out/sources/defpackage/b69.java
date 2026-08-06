package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class b69 extends k8a {
    public long b;
    public long[] c;
    public long[] d;

    public static Serializable a(int i, pt7 pt7Var) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(pt7Var.t()));
        }
        if (i == 1) {
            return Boolean.valueOf(pt7Var.z() == 1);
        }
        if (i == 2) {
            return c(pt7Var);
        }
        if (i != 3) {
            if (i == 8) {
                return b(pt7Var);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(pt7Var.t()));
                pt7Var.N(2);
                return date;
            }
            int iD = pt7Var.D();
            ArrayList arrayList = new ArrayList(iD);
            for (int i2 = 0; i2 < iD; i2++) {
                Serializable serializableA = a(pt7Var.z(), pt7Var);
                if (serializableA != null) {
                    arrayList.add(serializableA);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strC = c(pt7Var);
            int iZ = pt7Var.z();
            if (iZ == 9) {
                return map;
            }
            Serializable serializableA2 = a(iZ, pt7Var);
            if (serializableA2 != null) {
                map.put(strC, serializableA2);
            }
        }
    }

    public static HashMap<String, Object> b(pt7 pt7Var) {
        int iD = pt7Var.D();
        HashMap<String, Object> map = new HashMap<>(iD);
        for (int i = 0; i < iD; i++) {
            String strC = c(pt7Var);
            Serializable serializableA = a(pt7Var.z(), pt7Var);
            if (serializableA != null) {
                map.put(strC, serializableA);
            }
        }
        return map;
    }

    public static String c(pt7 pt7Var) {
        int iG = pt7Var.G();
        int i = pt7Var.b;
        pt7Var.N(iG);
        return new String(pt7Var.a, i, iG);
    }
}
