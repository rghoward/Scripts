package defpackage;

import com.intercom.twig.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class e70 {
    public static l89 a(m89 m89Var) {
        String str;
        m89Var.getClass();
        long j = m89Var.a;
        String str2 = m89Var.b;
        u60 u60Var = m89Var.j;
        String str3 = m89Var.c;
        String str4 = m89Var.g;
        if (str4 == null) {
            str4 = BuildConfig.FLAVOR;
        }
        String str5 = m89Var.d;
        if (str5 == null) {
            str5 = BuildConfig.FLAVOR;
            str = str5;
        } else {
            str = BuildConfig.FLAVOR;
        }
        String str6 = m89Var.f;
        String str7 = m89Var.k;
        if (str7 != null) {
            str = str7;
        }
        Long l = m89Var.l;
        long jLongValue = l != null ? l.longValue() : 0L;
        String strN = z2a.N(m89Var.c, ".");
        s60 s60Var = m89Var.n;
        if (s60Var == null) {
            s60Var = s60.t;
        }
        return new l89(j, str2, u60Var, str3, str4, str5, str6, str, jLongValue, strN, s60Var, z60.w, m89Var.h, m89Var.i);
    }

    public static ArrayList b(List list) {
        ArrayList arrayList = new ArrayList(ph1.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a((m89) it.next()));
        }
        return arrayList;
    }
}
