package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class h59 {
    public static final Class<?> a;
    public static final q2b<?, ?> b;
    public static final u2b c;

    static {
        Class<?> cls;
        Class<?> cls2;
        ye8 ye8Var = ye8.c;
        q2b<?, ?> q2bVar = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            ye8 ye8Var2 = ye8.c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                q2bVar = (q2b) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        b = q2bVar;
        c = new u2b();
    }

    public static void A(int i, List<Long> list, drb drbVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof ge6;
        sg1 sg1Var = ((vg1) drbVar).a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    sg1Var.K1(i, list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            sg1Var.H1(i, 2);
            int iO1 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iO1 += sg1.o1(list.get(i3).longValue());
            }
            sg1Var.J1(iO1);
            while (i2 < list.size()) {
                sg1Var.L1(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        ge6 ge6Var = (ge6) list;
        if (!z) {
            while (i2 < ge6Var.v) {
                sg1Var.K1(i, ge6Var.i(i2));
                i2++;
            }
            return;
        }
        sg1Var.H1(i, 2);
        int iO2 = 0;
        for (int i4 = 0; i4 < ge6Var.v; i4++) {
            iO2 += sg1.o1(ge6Var.i(i4));
        }
        sg1Var.J1(iO2);
        while (i2 < ge6Var.v) {
            sg1Var.L1(ge6Var.i(i2));
            i2++;
        }
    }

    public static int a(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof of5)) {
            int iO1 = 0;
            while (i < size) {
                iO1 += sg1.o1(list.get(i).intValue());
                i++;
            }
            return iO1;
        }
        of5 of5Var = (of5) list;
        int iO2 = 0;
        while (i < size) {
            iO2 += sg1.o1(of5Var.i(i));
            i++;
        }
        return iO2;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (sg1.m1(i) + 4) * size;
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (sg1.m1(i) + 8) * size;
    }

    public static int d(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof of5)) {
            int iO1 = 0;
            while (i < size) {
                iO1 += sg1.o1(list.get(i).intValue());
                i++;
            }
            return iO1;
        }
        of5 of5Var = (of5) list;
        int iO2 = 0;
        while (i < size) {
            iO2 += sg1.o1(of5Var.i(i));
            i++;
        }
        return iO2;
    }

    public static int e(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ge6)) {
            int iO1 = 0;
            while (i < size) {
                iO1 += sg1.o1(list.get(i).longValue());
                i++;
            }
            return iO1;
        }
        ge6 ge6Var = (ge6) list;
        int iO2 = 0;
        while (i < size) {
            iO2 += sg1.o1(ge6Var.i(i));
            i++;
        }
        return iO2;
    }

    public static int f(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof of5)) {
            int iJ1 = 0;
            while (i < size) {
                iJ1 += sg1.j1(list.get(i).intValue());
                i++;
            }
            return iJ1;
        }
        of5 of5Var = (of5) list;
        int iJ2 = 0;
        while (i < size) {
            iJ2 += sg1.j1(of5Var.i(i));
            i++;
        }
        return iJ2;
    }

    public static int g(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ge6)) {
            int iK1 = 0;
            while (i < size) {
                iK1 += sg1.k1(list.get(i).longValue());
                i++;
            }
            return iK1;
        }
        ge6 ge6Var = (ge6) list;
        int iK2 = 0;
        while (i < size) {
            iK2 += sg1.k1(ge6Var.i(i));
            i++;
        }
        return iK2;
    }

    public static int h(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof of5)) {
            int iN1 = 0;
            while (i < size) {
                iN1 += sg1.n1(list.get(i).intValue());
                i++;
            }
            return iN1;
        }
        of5 of5Var = (of5) list;
        int iN2 = 0;
        while (i < size) {
            iN2 += sg1.n1(of5Var.i(i));
            i++;
        }
        return iN2;
    }

    public static int i(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ge6)) {
            int iO1 = 0;
            while (i < size) {
                iO1 += sg1.o1(list.get(i).longValue());
                i++;
            }
            return iO1;
        }
        ge6 ge6Var = (ge6) list;
        int iO2 = 0;
        while (i < size) {
            iO2 += sg1.o1(ge6Var.i(i));
            i++;
        }
        return iO2;
    }

    public static <UT, UB> UB j(Object obj, int i, List<Integer> list, xi5.b bVar, UB ub, q2b<UT, UB> q2bVar) {
        if (bVar == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (!bVar.a()) {
                    ub = (UB) m(obj, i, iIntValue, ub, q2bVar);
                    it.remove();
                }
            }
            return ub;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = list.get(i3);
            int iIntValue2 = num.intValue();
            if (bVar.a()) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                ub = (UB) m(obj, i, iIntValue2, ub, q2bVar);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return ub;
    }

    public static <T, FT extends su3.a<FT>> void k(xr3<FT> xr3Var, T t, T t2) {
        gs9 gs9Var = xr3Var.c(t2).a;
        if (gs9Var.isEmpty()) {
            return;
        }
        su3<T> su3VarD = xr3Var.d(t);
        su3VarD.getClass();
        if (gs9Var.t.size() > 0) {
            su3VarD.i(gs9Var.c(0));
            throw null;
        }
        Iterator<T> it = gs9Var.d().iterator();
        if (it.hasNext()) {
            su3VarD.i((Map.Entry) it.next());
            throw null;
        }
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static <UT, UB> UB m(Object obj, int i, int i2, UB ub, q2b<UT, UB> q2bVar) {
        if (ub == null) {
            ub = (UB) q2bVar.f(obj);
        }
        q2bVar.e(ub, i2, i);
        return ub;
    }

    public static void n(int i, List<Boolean> list, drb drbVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof wr0;
        sg1 sg1Var = ((vg1) drbVar).a;
        int i2 = 0;
        if (z2) {
            if (z) {
                sg1Var.H1(i, 2);
                sg1Var.J1(0);
                return;
            }
            return;
        }
        if (!z) {
            while (i2 < list.size()) {
                sg1Var.r1(i, list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        sg1Var.H1(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).getClass();
            Logger logger = sg1.y;
            i3++;
        }
        sg1Var.J1(i3);
        while (i2 < list.size()) {
            sg1Var.q1(list.get(i2).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void o(int i, List<Double> list, drb drbVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof g43;
        sg1 sg1Var = ((vg1) drbVar).a;
        int i2 = 0;
        if (z2) {
            if (z) {
                sg1Var.H1(i, 2);
                sg1Var.J1(0);
                return;
            }
            return;
        }
        if (!z) {
            while (i2 < list.size()) {
                double dDoubleValue = list.get(i2).doubleValue();
                sg1Var.getClass();
                sg1Var.x1(i, Double.doubleToRawLongBits(dDoubleValue));
                i2++;
            }
            return;
        }
        sg1Var.H1(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).getClass();
            Logger logger = sg1.y;
            i3 += 8;
        }
        sg1Var.J1(i3);
        while (i2 < list.size()) {
            sg1Var.y1(Double.doubleToRawLongBits(list.get(i2).doubleValue()));
            i2++;
        }
    }

    public static void p(int i, List<Integer> list, drb drbVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof of5;
        sg1 sg1Var = ((vg1) drbVar).a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    sg1Var.z1(i, list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            sg1Var.H1(i, 2);
            int iO1 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iO1 += sg1.o1(list.get(i3).intValue());
            }
            sg1Var.J1(iO1);
            while (i2 < list.size()) {
                sg1Var.A1(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        of5 of5Var = (of5) list;
        if (!z) {
            while (i2 < of5Var.v) {
                sg1Var.z1(i, of5Var.i(i2));
                i2++;
            }
            return;
        }
        sg1Var.H1(i, 2);
        int iO2 = 0;
        for (int i4 = 0; i4 < of5Var.v; i4++) {
            iO2 += sg1.o1(of5Var.i(i4));
        }
        sg1Var.J1(iO2);
        while (i2 < of5Var.v) {
            sg1Var.A1(of5Var.i(i2));
            i2++;
        }
    }

    public static void q(int i, List<Integer> list, drb drbVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof of5;
        sg1 sg1Var = ((vg1) drbVar).a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    sg1Var.v1(i, list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            sg1Var.H1(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).getClass();
                Logger logger = sg1.y;
                i3 += 4;
            }
            sg1Var.J1(i3);
            while (i2 < list.size()) {
                sg1Var.w1(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        of5 of5Var = (of5) list;
        if (!z) {
            while (i2 < of5Var.v) {
                sg1Var.v1(i, of5Var.i(i2));
                i2++;
            }
            return;
        }
        sg1Var.H1(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < of5Var.v; i6++) {
            of5Var.i(i6);
            Logger logger2 = sg1.y;
            i5 += 4;
        }
        sg1Var.J1(i5);
        while (i2 < of5Var.v) {
            sg1Var.w1(of5Var.i(i2));
            i2++;
        }
    }

    public static void r(int i, List<Long> list, drb drbVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof ge6;
        sg1 sg1Var = ((vg1) drbVar).a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    sg1Var.x1(i, list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            sg1Var.H1(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).getClass();
                Logger logger = sg1.y;
                i3 += 8;
            }
            sg1Var.J1(i3);
            while (i2 < list.size()) {
                sg1Var.y1(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        ge6 ge6Var = (ge6) list;
        if (!z) {
            while (i2 < ge6Var.v) {
                sg1Var.x1(i, ge6Var.i(i2));
                i2++;
            }
            return;
        }
        sg1Var.H1(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < ge6Var.v; i6++) {
            ge6Var.i(i6);
            Logger logger2 = sg1.y;
            i5 += 8;
        }
        sg1Var.J1(i5);
        while (i2 < ge6Var.v) {
            sg1Var.y1(ge6Var.i(i2));
            i2++;
        }
    }

    public static void s(int i, List<Float> list, drb drbVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof o44;
        sg1 sg1Var = ((vg1) drbVar).a;
        int i2 = 0;
        if (z2) {
            if (z) {
                sg1Var.H1(i, 2);
                sg1Var.J1(0);
                return;
            }
            return;
        }
        if (!z) {
            while (i2 < list.size()) {
                float fFloatValue = list.get(i2).floatValue();
                sg1Var.getClass();
                sg1Var.v1(i, Float.floatToRawIntBits(fFloatValue));
                i2++;
            }
            return;
        }
        sg1Var.H1(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).getClass();
            Logger logger = sg1.y;
            i3 += 4;
        }
        sg1Var.J1(i3);
        while (i2 < list.size()) {
            sg1Var.w1(Float.floatToRawIntBits(list.get(i2).floatValue()));
            i2++;
        }
    }

    public static void t(int i, List<Integer> list, drb drbVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof of5;
        sg1 sg1Var = ((vg1) drbVar).a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    sg1Var.z1(i, list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            sg1Var.H1(i, 2);
            int iO1 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iO1 += sg1.o1(list.get(i3).intValue());
            }
            sg1Var.J1(iO1);
            while (i2 < list.size()) {
                sg1Var.A1(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        of5 of5Var = (of5) list;
        if (!z) {
            while (i2 < of5Var.v) {
                sg1Var.z1(i, of5Var.i(i2));
                i2++;
            }
            return;
        }
        sg1Var.H1(i, 2);
        int iO2 = 0;
        for (int i4 = 0; i4 < of5Var.v; i4++) {
            iO2 += sg1.o1(of5Var.i(i4));
        }
        sg1Var.J1(iO2);
        while (i2 < of5Var.v) {
            sg1Var.A1(of5Var.i(i2));
            i2++;
        }
    }

    public static void u(int i, List<Long> list, drb drbVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof ge6;
        sg1 sg1Var = ((vg1) drbVar).a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    sg1Var.K1(i, list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            sg1Var.H1(i, 2);
            int iO1 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iO1 += sg1.o1(list.get(i3).longValue());
            }
            sg1Var.J1(iO1);
            while (i2 < list.size()) {
                sg1Var.L1(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        ge6 ge6Var = (ge6) list;
        if (!z) {
            while (i2 < ge6Var.v) {
                sg1Var.K1(i, ge6Var.i(i2));
                i2++;
            }
            return;
        }
        sg1Var.H1(i, 2);
        int iO2 = 0;
        for (int i4 = 0; i4 < ge6Var.v; i4++) {
            iO2 += sg1.o1(ge6Var.i(i4));
        }
        sg1Var.J1(iO2);
        while (i2 < ge6Var.v) {
            sg1Var.L1(ge6Var.i(i2));
            i2++;
        }
    }

    public static void v(int i, List<Integer> list, drb drbVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof of5;
        sg1 sg1Var = ((vg1) drbVar).a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    sg1Var.v1(i, list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            sg1Var.H1(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).getClass();
                Logger logger = sg1.y;
                i3 += 4;
            }
            sg1Var.J1(i3);
            while (i2 < list.size()) {
                sg1Var.w1(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        of5 of5Var = (of5) list;
        if (!z) {
            while (i2 < of5Var.v) {
                sg1Var.v1(i, of5Var.i(i2));
                i2++;
            }
            return;
        }
        sg1Var.H1(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < of5Var.v; i6++) {
            of5Var.i(i6);
            Logger logger2 = sg1.y;
            i5 += 4;
        }
        sg1Var.J1(i5);
        while (i2 < of5Var.v) {
            sg1Var.w1(of5Var.i(i2));
            i2++;
        }
    }

    public static void w(int i, List<Long> list, drb drbVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof ge6;
        sg1 sg1Var = ((vg1) drbVar).a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    sg1Var.x1(i, list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            sg1Var.H1(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).getClass();
                Logger logger = sg1.y;
                i3 += 8;
            }
            sg1Var.J1(i3);
            while (i2 < list.size()) {
                sg1Var.y1(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        ge6 ge6Var = (ge6) list;
        if (!z) {
            while (i2 < ge6Var.v) {
                sg1Var.x1(i, ge6Var.i(i2));
                i2++;
            }
            return;
        }
        sg1Var.H1(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < ge6Var.v; i6++) {
            ge6Var.i(i6);
            Logger logger2 = sg1.y;
            i5 += 8;
        }
        sg1Var.J1(i5);
        while (i2 < ge6Var.v) {
            sg1Var.y1(ge6Var.i(i2));
            i2++;
        }
    }

    public static void x(int i, List<Integer> list, drb drbVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof of5;
        sg1 sg1Var = ((vg1) drbVar).a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    int iIntValue = list.get(i2).intValue();
                    sg1Var.I1(i, (iIntValue >> 31) ^ (iIntValue << 1));
                    i2++;
                }
                return;
            }
            sg1Var.H1(i, 2);
            int iJ1 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iJ1 += sg1.j1(list.get(i3).intValue());
            }
            sg1Var.J1(iJ1);
            while (i2 < list.size()) {
                int iIntValue2 = list.get(i2).intValue();
                sg1Var.J1((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                i2++;
            }
            return;
        }
        of5 of5Var = (of5) list;
        if (!z) {
            while (i2 < of5Var.v) {
                int i4 = of5Var.i(i2);
                sg1Var.I1(i, (i4 >> 31) ^ (i4 << 1));
                i2++;
            }
            return;
        }
        sg1Var.H1(i, 2);
        int iJ2 = 0;
        for (int i5 = 0; i5 < of5Var.v; i5++) {
            iJ2 += sg1.j1(of5Var.i(i5));
        }
        sg1Var.J1(iJ2);
        while (i2 < of5Var.v) {
            int i6 = of5Var.i(i2);
            sg1Var.J1((i6 >> 31) ^ (i6 << 1));
            i2++;
        }
    }

    public static void y(int i, List<Long> list, drb drbVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof ge6;
        sg1 sg1Var = ((vg1) drbVar).a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    long jLongValue = list.get(i2).longValue();
                    sg1Var.K1(i, (jLongValue >> 63) ^ (jLongValue << 1));
                    i2++;
                }
                return;
            }
            sg1Var.H1(i, 2);
            int iK1 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iK1 += sg1.k1(list.get(i3).longValue());
            }
            sg1Var.J1(iK1);
            while (i2 < list.size()) {
                long jLongValue2 = list.get(i2).longValue();
                sg1Var.L1((jLongValue2 >> 63) ^ (jLongValue2 << 1));
                i2++;
            }
            return;
        }
        ge6 ge6Var = (ge6) list;
        if (!z) {
            while (i2 < ge6Var.v) {
                long jI = ge6Var.i(i2);
                sg1Var.K1(i, (jI >> 63) ^ (jI << 1));
                i2++;
            }
            return;
        }
        sg1Var.H1(i, 2);
        int iK2 = 0;
        for (int i4 = 0; i4 < ge6Var.v; i4++) {
            iK2 += sg1.k1(ge6Var.i(i4));
        }
        sg1Var.J1(iK2);
        while (i2 < ge6Var.v) {
            long jI2 = ge6Var.i(i2);
            sg1Var.L1((jI2 >> 63) ^ (jI2 << 1));
            i2++;
        }
    }

    public static void z(int i, List<Integer> list, drb drbVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof of5;
        sg1 sg1Var = ((vg1) drbVar).a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    sg1Var.I1(i, list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            sg1Var.H1(i, 2);
            int iN1 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iN1 += sg1.n1(list.get(i3).intValue());
            }
            sg1Var.J1(iN1);
            while (i2 < list.size()) {
                sg1Var.J1(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        of5 of5Var = (of5) list;
        if (!z) {
            while (i2 < of5Var.v) {
                sg1Var.I1(i, of5Var.i(i2));
                i2++;
            }
            return;
        }
        sg1Var.H1(i, 2);
        int iN2 = 0;
        for (int i4 = 0; i4 < of5Var.v; i4++) {
            iN2 += sg1.n1(of5Var.i(i4));
        }
        sg1Var.J1(iN2);
        while (i2 < of5Var.v) {
            sg1Var.J1(of5Var.i(i2));
            i2++;
        }
    }
}
