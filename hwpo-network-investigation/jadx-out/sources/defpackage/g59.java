package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class g59 {
    public static final Class<?> a;
    public static final p2b<?, ?> b;
    public static final t2b c;

    static {
        Class<?> cls;
        Class<?> cls2;
        p2b<?, ?> p2bVar = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                p2bVar = (p2b) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        b = p2bVar;
        c = new t2b();
    }

    public static int a(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof nf5)) {
            int iH1 = 0;
            while (i < size) {
                iH1 += tg1.h1(list.get(i).intValue());
                i++;
            }
            return iH1;
        }
        nf5 nf5Var = (nf5) list;
        int iH2 = 0;
        while (i < size) {
            iH2 += tg1.h1(nf5Var.i(i));
            i++;
        }
        return iH2;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (tg1.k1(i) + 4) * size;
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (tg1.k1(i) + 8) * size;
    }

    public static int d(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof nf5)) {
            int iH1 = 0;
            while (i < size) {
                iH1 += tg1.h1(list.get(i).intValue());
                i++;
            }
            return iH1;
        }
        nf5 nf5Var = (nf5) list;
        int iH2 = 0;
        while (i < size) {
            iH2 += tg1.h1(nf5Var.i(i));
            i++;
        }
        return iH2;
    }

    public static int e(List<Long> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof fe6) {
            fe6 fe6Var = (fe6) list;
            if (size <= 0) {
                return 0;
            }
            fe6Var.e(0);
            throw null;
        }
        int iM1 = 0;
        for (int i = 0; i < size; i++) {
            iM1 += tg1.m1(list.get(i).longValue());
        }
        return iM1;
    }

    public static int f(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof nf5)) {
            int iL1 = 0;
            while (i < size) {
                int iIntValue = list.get(i).intValue();
                iL1 += tg1.l1((iIntValue >> 31) ^ (iIntValue << 1));
                i++;
            }
            return iL1;
        }
        nf5 nf5Var = (nf5) list;
        int iL2 = 0;
        while (i < size) {
            int i2 = nf5Var.i(i);
            iL2 += tg1.l1((i2 >> 31) ^ (i2 << 1));
            i++;
        }
        return iL2;
    }

    public static int g(List<Long> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof fe6) {
            fe6 fe6Var = (fe6) list;
            if (size <= 0) {
                return 0;
            }
            fe6Var.e(0);
            throw null;
        }
        int iM1 = 0;
        for (int i = 0; i < size; i++) {
            long jLongValue = list.get(i).longValue();
            iM1 += tg1.m1((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iM1;
    }

    public static int h(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof nf5)) {
            int iL1 = 0;
            while (i < size) {
                iL1 += tg1.l1(list.get(i).intValue());
                i++;
            }
            return iL1;
        }
        nf5 nf5Var = (nf5) list;
        int iL2 = 0;
        while (i < size) {
            iL2 += tg1.l1(nf5Var.i(i));
            i++;
        }
        return iL2;
    }

    public static int i(List<Long> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof fe6) {
            fe6 fe6Var = (fe6) list;
            if (size <= 0) {
                return 0;
            }
            fe6Var.e(0);
            throw null;
        }
        int iM1 = 0;
        for (int i = 0; i < size; i++) {
            iM1 += tg1.m1(list.get(i).longValue());
        }
        return iM1;
    }

    public static <T, FT extends tu3.a<FT>> void j(wr3<FT> wr3Var, T t, T t2) {
        fs9 fs9Var = wr3Var.b(t2).a;
        if (fs9Var.isEmpty()) {
            return;
        }
        tu3<T> tu3VarC = wr3Var.c(t);
        tu3VarC.getClass();
        if (fs9Var.u.size() > 0) {
            tu3VarC.i(fs9Var.c(0));
            throw null;
        }
        Iterator<Map.Entry<Object, Object>> it = fs9Var.d().iterator();
        if (it.hasNext()) {
            tu3VarC.i(it.next());
            throw null;
        }
    }

    public static boolean k(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void l(int i, List<Boolean> list, crb crbVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        tg1 tg1Var = ((ug1) crbVar).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                tg1Var.o1(i, list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        tg1Var.E1(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).getClass();
            Logger logger = tg1.y;
            i3++;
        }
        tg1Var.G1(i3);
        while (i2 < list.size()) {
            tg1Var.n1(list.get(i2).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void m(int i, List<Double> list, crb crbVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        tg1 tg1Var = ((ug1) crbVar).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                double dDoubleValue = list.get(i2).doubleValue();
                tg1Var.getClass();
                tg1Var.u1(i, Double.doubleToRawLongBits(dDoubleValue));
                i2++;
            }
            return;
        }
        tg1Var.E1(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).getClass();
            Logger logger = tg1.y;
            i3 += 8;
        }
        tg1Var.G1(i3);
        while (i2 < list.size()) {
            tg1Var.v1(Double.doubleToRawLongBits(list.get(i2).doubleValue()));
            i2++;
        }
    }

    public static void n(int i, List<Integer> list, crb crbVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        tg1 tg1Var = ((ug1) crbVar).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                tg1Var.w1(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        tg1Var.E1(i, 2);
        int iH1 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iH1 += tg1.h1(list.get(i3).intValue());
        }
        tg1Var.G1(iH1);
        while (i2 < list.size()) {
            tg1Var.x1(list.get(i2).intValue());
            i2++;
        }
    }

    public static void o(int i, List<Integer> list, crb crbVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        tg1 tg1Var = ((ug1) crbVar).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                tg1Var.s1(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        tg1Var.E1(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).getClass();
            Logger logger = tg1.y;
            i3 += 4;
        }
        tg1Var.G1(i3);
        while (i2 < list.size()) {
            tg1Var.t1(list.get(i2).intValue());
            i2++;
        }
    }

    public static void p(int i, List<Long> list, crb crbVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        tg1 tg1Var = ((ug1) crbVar).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                tg1Var.u1(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        tg1Var.E1(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).getClass();
            Logger logger = tg1.y;
            i3 += 8;
        }
        tg1Var.G1(i3);
        while (i2 < list.size()) {
            tg1Var.v1(list.get(i2).longValue());
            i2++;
        }
    }

    public static void q(int i, List<Float> list, crb crbVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        tg1 tg1Var = ((ug1) crbVar).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                float fFloatValue = list.get(i2).floatValue();
                tg1Var.getClass();
                tg1Var.s1(i, Float.floatToRawIntBits(fFloatValue));
                i2++;
            }
            return;
        }
        tg1Var.E1(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).getClass();
            Logger logger = tg1.y;
            i3 += 4;
        }
        tg1Var.G1(i3);
        while (i2 < list.size()) {
            tg1Var.t1(Float.floatToRawIntBits(list.get(i2).floatValue()));
            i2++;
        }
    }

    public static void r(int i, List<Integer> list, crb crbVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        tg1 tg1Var = ((ug1) crbVar).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                tg1Var.w1(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        tg1Var.E1(i, 2);
        int iH1 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iH1 += tg1.h1(list.get(i3).intValue());
        }
        tg1Var.G1(iH1);
        while (i2 < list.size()) {
            tg1Var.x1(list.get(i2).intValue());
            i2++;
        }
    }

    public static void s(int i, List<Long> list, crb crbVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        tg1 tg1Var = ((ug1) crbVar).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                tg1Var.H1(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        tg1Var.E1(i, 2);
        int iM1 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM1 += tg1.m1(list.get(i3).longValue());
        }
        tg1Var.G1(iM1);
        while (i2 < list.size()) {
            tg1Var.I1(list.get(i2).longValue());
            i2++;
        }
    }

    public static void t(int i, List<Integer> list, crb crbVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        tg1 tg1Var = ((ug1) crbVar).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                tg1Var.s1(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        tg1Var.E1(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).getClass();
            Logger logger = tg1.y;
            i3 += 4;
        }
        tg1Var.G1(i3);
        while (i2 < list.size()) {
            tg1Var.t1(list.get(i2).intValue());
            i2++;
        }
    }

    public static void u(int i, List<Long> list, crb crbVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        tg1 tg1Var = ((ug1) crbVar).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                tg1Var.u1(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        tg1Var.E1(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).getClass();
            Logger logger = tg1.y;
            i3 += 8;
        }
        tg1Var.G1(i3);
        while (i2 < list.size()) {
            tg1Var.v1(list.get(i2).longValue());
            i2++;
        }
    }

    public static void v(int i, List<Integer> list, crb crbVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        tg1 tg1Var = ((ug1) crbVar).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = list.get(i2).intValue();
                tg1Var.F1(i, (iIntValue >> 31) ^ (iIntValue << 1));
                i2++;
            }
            return;
        }
        tg1Var.E1(i, 2);
        int iL1 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int iIntValue2 = list.get(i3).intValue();
            iL1 += tg1.l1((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        tg1Var.G1(iL1);
        while (i2 < list.size()) {
            int iIntValue3 = list.get(i2).intValue();
            tg1Var.G1((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i2++;
        }
    }

    public static void w(int i, List<Long> list, crb crbVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        tg1 tg1Var = ((ug1) crbVar).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = list.get(i2).longValue();
                tg1Var.H1(i, (jLongValue >> 63) ^ (jLongValue << 1));
                i2++;
            }
            return;
        }
        tg1Var.E1(i, 2);
        int iM1 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = list.get(i3).longValue();
            iM1 += tg1.m1((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        tg1Var.G1(iM1);
        while (i2 < list.size()) {
            long jLongValue3 = list.get(i2).longValue();
            tg1Var.I1((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i2++;
        }
    }

    public static void x(int i, List<Integer> list, crb crbVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        tg1 tg1Var = ((ug1) crbVar).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                tg1Var.F1(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        tg1Var.E1(i, 2);
        int iL1 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iL1 += tg1.l1(list.get(i3).intValue());
        }
        tg1Var.G1(iL1);
        while (i2 < list.size()) {
            tg1Var.G1(list.get(i2).intValue());
            i2++;
        }
    }

    public static void y(int i, List<Long> list, crb crbVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        tg1 tg1Var = ((ug1) crbVar).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                tg1Var.H1(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        tg1Var.E1(i, 2);
        int iM1 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM1 += tg1.m1(list.get(i3).longValue());
        }
        tg1Var.G1(iM1);
        while (i2 < list.size()) {
            tg1Var.I1(list.get(i2).longValue());
            i2++;
        }
    }
}
