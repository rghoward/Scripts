package defpackage;

import com.intercom.twig.BuildConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gic {
    public static void a(int i, String str, List list) {
        if (list.size() == i) {
            return;
        }
        hza.a(str, " operation requires ", i, " parameters found ", list.size());
    }

    public static void b(int i, String str, List list) {
        if (list.size() >= i) {
            return;
        }
        hza.a(str, " operation requires at least ", i, " parameters found ", list.size());
    }

    public static void c(String str, int i, ArrayList arrayList) {
        if (arrayList.size() <= i) {
            return;
        }
        hza.a(str, " operation requires at most ", i, " parameters found ", arrayList.size());
    }

    public static boolean d(a8c a8cVar) {
        if (a8cVar == null) {
            return false;
        }
        Double d = a8cVar.d();
        return !d.isNaN() && d.doubleValue() >= 0.0d && d.equals(Double.valueOf(Math.floor(d.doubleValue())));
    }

    public static eac e(String str) {
        eac eacVar;
        if (str == null || str.isEmpty()) {
            eacVar = null;
        } else {
            eacVar = (eac) eac.E0.get(Integer.valueOf(Integer.parseInt(str)));
        }
        if (eacVar != null) {
            return eacVar;
        }
        z90.a(ct1.a("Unsupported commandId ", str));
        return null;
    }

    public static boolean f(a8c a8cVar, a8c a8cVar2) {
        if (!a8cVar.getClass().equals(a8cVar2.getClass())) {
            return false;
        }
        if ((a8cVar instanceof k8c) || (a8cVar instanceof w7c)) {
            return true;
        }
        if (a8cVar instanceof d5c) {
            if (Double.isNaN(a8cVar.d().doubleValue()) || Double.isNaN(a8cVar2.d().doubleValue())) {
                return false;
            }
            return a8cVar.d().equals(a8cVar2.d());
        }
        if (a8cVar instanceof i8c) {
            return a8cVar.c().equals(a8cVar2.c());
        }
        if (a8cVar instanceof b3c) {
            return a8cVar.e().equals(a8cVar2.e());
        }
        return a8cVar == a8cVar2;
    }

    public static int g(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d) || d == 0.0d) {
            return 0;
        }
        return (int) ((((double) (d > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d))) % 4.294967296E9d);
    }

    public static double h(double d) {
        if (Double.isNaN(d)) {
            return 0.0d;
        }
        if (Double.isInfinite(d) || d == 0.0d || d == 0.0d) {
            return d;
        }
        return ((double) (d > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d));
    }

    public static Object i(a8c a8cVar) {
        if (a8c.m.equals(a8cVar)) {
            return null;
        }
        if (a8c.l.equals(a8cVar)) {
            return BuildConfig.FLAVOR;
        }
        if (a8cVar instanceof u7c) {
            return j((u7c) a8cVar);
        }
        if (!(a8cVar instanceof a2c)) {
            return !a8cVar.d().isNaN() ? a8cVar.d() : a8cVar.c();
        }
        ArrayList arrayList = new ArrayList();
        a2c a2cVar = (a2c) a8cVar;
        int i = 0;
        while (i < a2cVar.r()) {
            if (i >= a2cVar.r()) {
                px1.b(d43.a(i, "Out of bounds index: ", new StringBuilder(String.valueOf(i).length() + 21)));
                return null;
            }
            int i2 = i + 1;
            Object objI = i(a2cVar.t(i));
            if (objI != null) {
                arrayList.add(objI);
            }
            i = i2;
        }
        return arrayList;
    }

    public static HashMap j(u7c u7cVar) {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList(u7cVar.t.keySet());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            Object objI = i(u7cVar.i(str));
            if (objI != null) {
                map.put(str, objI);
            }
        }
        return map;
    }

    public static void k(cgc cgcVar) {
        int iG = g(cgcVar.g("runtime.counter").d().doubleValue() + 1.0d);
        if (iG <= 1000000) {
            cgcVar.e("runtime.counter", new d5c(Double.valueOf(iG)));
        } else {
            aa0.c("Instructions allowed exceeded");
        }
    }
}
