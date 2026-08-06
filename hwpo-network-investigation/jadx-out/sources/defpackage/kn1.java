package defpackage;

import com.intercom.twig.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kn1 {
    public static final w60 a(m89 m89Var) {
        m89Var.getClass();
        xc9 xc9Var = m89Var.m;
        int iOrdinal = m89Var.j.ordinal();
        xc9 xc9Var2 = xc9.u;
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            long j = m89Var.a;
            String str = BuildConfig.FLAVOR;
            u60 u60Var = m89Var.j;
            String str2 = m89Var.d;
            if (str2 == null) {
                str2 = str;
            }
            String str3 = m89Var.e;
            if (str3 != null) {
                str = str3;
            }
            return new w60.b(j, u60Var, str2, str, m89Var.c, m89Var.g, m89Var.h, xc9Var == null ? xc9Var2 : xc9Var);
        }
        if (iOrdinal != 3) {
            u.b();
            return null;
        }
        long j2 = m89Var.a;
        String str4 = m89Var.b;
        String str5 = m89Var.k;
        String str6 = str5 == null ? BuildConfig.FLAVOR : str5;
        Long l = m89Var.l;
        long jLongValue = l != null ? l.longValue() : Long.MIN_VALUE;
        String str7 = m89Var.c;
        String strL = z2a.L(str7, "://", str7);
        String str8 = m89Var.f;
        s60 s60Var = m89Var.n;
        if (s60Var == null) {
            s60Var = s60.t;
        }
        return new w60.a(j2, str4, BuildConfig.FLAVOR, str6, str7, strL, jLongValue, str8, s60Var, xc9Var == null ? xc9Var2 : xc9Var);
    }

    public static final List b(int i, List list) {
        if (list.isEmpty()) {
            return hf3.t;
        }
        ArrayList arrayList = new ArrayList(ph1.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            gr6 gr6Var = (gr6) it.next();
            int i2 = gr6Var.a;
            arrayList.add(new hr6(i2, gr6Var.b, i == i2));
        }
        return arrayList;
    }
}
