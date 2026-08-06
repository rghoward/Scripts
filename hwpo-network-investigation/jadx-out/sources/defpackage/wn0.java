package defpackage;

import com.intercom.twig.BuildConfig;
import io.ably.lib.util.AgentHeaderCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wn0 {
    /* JADX WARN: Code duplicated, block: B:10:0x001c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x001e A[RETURN] */
    public static final boolean a(List<vn0> list) {
        list.getClass();
        for (Object obj : list) {
            if (!((vn0) obj).A) {
                if (obj == null) {
                    return true;
                }
                return false;
            }
        }
        obj = null;
        if (obj == null) {
            return true;
        }
        return false;
    }

    public static final Number b(xn0 xn0Var, String str, m2b m2bVar) {
        xn0Var.getClass();
        str.getClass();
        m2bVar.getClass();
        if (xn0Var != xn0.u || m2bVar == m2b.u) {
            return (xn0Var == xn0.t || xn0Var == xn0.x) ? Double.valueOf(Double.parseDouble(str)) : Integer.valueOf(Integer.parseInt(str));
        }
        return Long.valueOf(d(str));
    }

    public static final String c(long j) {
        long j2 = j / 3600;
        TimeUnit timeUnit = TimeUnit.HOURS;
        long seconds = timeUnit.toSeconds(j2);
        long minutes = timeUnit.toMinutes(j2);
        long j3 = j - seconds;
        long j4 = j3 / 60;
        return cj2.a(String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(minutes + j4)}, 1)), ":", String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(j3 - TimeUnit.MINUTES.toSeconds(j4))}, 1)));
    }

    public static final long d(String str) {
        str.getClass();
        List listI = z2a.I(str, new String[]{":"}, 6);
        return Long.parseLong((String) listI.get(1)) + ((long) (Integer.parseInt((String) th1.y(listI)) * 60));
    }

    public static final String e(vn0 vn0Var) {
        vn0Var.getClass();
        double d = vn0Var.v;
        int iOrdinal = vn0Var.z.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return c((long) d);
            }
            if (iOrdinal != 4) {
                if (iOrdinal != 10) {
                    return String.valueOf((int) d);
                }
                Double d2 = vn0Var.w;
                if (d2 == null) {
                    return BuildConfig.FLAVOR;
                }
                return ((int) d) + AgentHeaderCreator.AGENT_DIVIDER + ((int) d2.doubleValue());
            }
        }
        return String.valueOf(d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    public static final ArrayList f(HashMap map, List list, List list2) {
        int i;
        Object next;
        ?? H;
        map.getClass();
        list2.getClass();
        ArrayList arrayList = new ArrayList(map.size());
        Iterator it = map.entrySet().iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            Iterator it2 = list.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (((vn0) next).t != ((Number) entry.getKey()).intValue());
            vn0 vn0Var = (vn0) next;
            if (vn0Var != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list2) {
                    if (((q7b) obj).a() == vn0Var.t) {
                        arrayList2.add(obj);
                    }
                }
                H = new ArrayList(ph1.n(arrayList2, 10));
                int size = arrayList2.size();
                while (i < size) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    H.add(((q7b) obj2).b((String) entry.getValue(), vn0Var));
                }
            } else {
                H = ws0.h(new p7b.a(((Number) entry.getKey()).intValue(), null));
            }
            arrayList.add(H);
        }
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj3 = arrayList.get(i);
            i++;
            rh1.o((Iterable) obj3, arrayList3);
        }
        return arrayList3;
    }

    public static final js7<Integer, Integer> g(String str) {
        str.getClass();
        js7<String, String> js7VarH = h(str);
        return new js7<>(Integer.valueOf(Integer.parseInt(js7VarH.t)), Integer.valueOf(Integer.parseInt(js7VarH.u)));
    }

    public static final js7<String, String> h(String str) {
        str.getClass();
        List listI = z2a.I(str, new String[]{AgentHeaderCreator.AGENT_DIVIDER}, 6);
        return new js7<>(listI.get(0), listI.get(1));
    }
}
