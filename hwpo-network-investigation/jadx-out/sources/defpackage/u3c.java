package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class u3c {
    public static final h4c a;

    static {
        int i = h0c.a;
        a = new h4c();
    }

    public static int A(int i, Object obj, t3c t3cVar) {
        int i2 = i << 3;
        if (obj instanceof o2c) {
            int iA = b1c.a(i2);
            int iA2 = ((o2c) obj).a();
            return k3c.a(iA2, iA2, iA);
        }
        int iA3 = b1c.a(i2);
        int iH = ((f0c) obj).h(t3cVar);
        return k3c.a(iH, iH, iA3);
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void b(Object obj, Object obj2) {
        u1c u1cVar = (u1c) obj;
        g4c g4cVar = u1cVar.zzc;
        g4c g4cVar2 = ((u1c) obj2).zzc;
        g4c g4cVar3 = g4c.f;
        if (!g4cVar3.equals(g4cVar2)) {
            if (g4cVar3.equals(g4cVar)) {
                int i = g4cVar.a + g4cVar2.a;
                int[] iArrCopyOf = Arrays.copyOf(g4cVar.b, i);
                System.arraycopy(g4cVar2.b, 0, iArrCopyOf, g4cVar.a, g4cVar2.a);
                Object[] objArrCopyOf = Arrays.copyOf(g4cVar.c, i);
                System.arraycopy(g4cVar2.c, 0, objArrCopyOf, g4cVar.a, g4cVar2.a);
                g4cVar = new g4c(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                g4cVar.getClass();
                if (!g4cVar2.equals(g4cVar3)) {
                    if (!g4cVar.e) {
                        e44.b();
                        return;
                    }
                    int i2 = g4cVar.a + g4cVar2.a;
                    g4cVar.e(i2);
                    System.arraycopy(g4cVar2.b, 0, g4cVar.b, g4cVar.a, g4cVar2.a);
                    System.arraycopy(g4cVar2.c, 0, g4cVar.c, g4cVar.a, g4cVar2.a);
                    g4cVar.a = i2;
                }
            }
        }
        u1cVar.zzc = g4cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object c(Object obj, int i, i2c i2cVar, x1c x1cVar, Object obj2, h4c h4cVar) {
        if (x1cVar == null) {
            return obj2;
        }
        if (i2cVar == null) {
            Iterator<E> it = i2cVar.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!x1cVar.a(iIntValue)) {
                    if (obj2 == null) {
                        h4cVar.getClass();
                        obj2 = h4c.c(obj);
                    }
                    h4cVar.getClass();
                    ((g4c) obj2).d(i << 3, Long.valueOf(iIntValue));
                    it.remove();
                }
            }
            return obj2;
        }
        int size = i2cVar.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) i2cVar.get(i3);
            int iIntValue2 = num.intValue();
            if (x1cVar.a(iIntValue2)) {
                if (i3 != i2) {
                    i2cVar.set(i2, num);
                }
                i2++;
            } else {
                if (obj2 == null) {
                    h4cVar.getClass();
                    obj2 = h4c.c(obj);
                }
                h4cVar.getClass();
                ((g4c) obj2).d(i << 3, Long.valueOf(iIntValue2));
            }
        }
        if (i2 != size) {
            i2cVar.subList(i2, size).clear();
        }
        return obj2;
    }

    public static void d(int i, List list, c1c c1cVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b1c b1cVar = c1cVar.a;
        int i2 = 0;
        if (!(list instanceof d1c)) {
            if (!z) {
                while (i2 < list.size()) {
                    b1cVar.k(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            b1cVar.f(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).getClass();
                i3 += 8;
            }
            b1cVar.v(i3);
            while (i2 < list.size()) {
                b1cVar.y(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        d1c d1cVar = (d1c) list;
        if (!z) {
            while (i2 < d1cVar.v) {
                d1cVar.f(i2);
                b1cVar.k(i, Double.doubleToRawLongBits(d1cVar.u[i2]));
                i2++;
            }
            return;
        }
        b1cVar.f(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < d1cVar.v; i6++) {
            d1cVar.f(i6);
            double d = d1cVar.u[i6];
            i5 += 8;
        }
        b1cVar.v(i5);
        while (i2 < d1cVar.v) {
            d1cVar.f(i2);
            b1cVar.y(Double.doubleToRawLongBits(d1cVar.u[i2]));
            i2++;
        }
    }

    public static void e(int i, List list, c1c c1cVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b1c b1cVar = c1cVar.a;
        int i2 = 0;
        if (!(list instanceof m1c)) {
            if (!z) {
                while (i2 < list.size()) {
                    b1cVar.i(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            b1cVar.f(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).getClass();
                i3 += 4;
            }
            b1cVar.v(i3);
            while (i2 < list.size()) {
                b1cVar.w(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        m1c m1cVar = (m1c) list;
        if (!z) {
            while (i2 < m1cVar.v) {
                m1cVar.f(i2);
                b1cVar.i(i, Float.floatToRawIntBits(m1cVar.u[i2]));
                i2++;
            }
            return;
        }
        b1cVar.f(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < m1cVar.v; i6++) {
            m1cVar.f(i6);
            float f = m1cVar.u[i6];
            i5 += 4;
        }
        b1cVar.v(i5);
        while (i2 < m1cVar.v) {
            m1cVar.f(i2);
            b1cVar.w(Float.floatToRawIntBits(m1cVar.u[i2]));
            i2++;
        }
    }

    public static void f(int i, List list, c1c c1cVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b1c b1cVar = c1cVar.a;
        int i2 = 0;
        if (!(list instanceof r2c)) {
            if (!z) {
                while (i2 < list.size()) {
                    b1cVar.j(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            b1cVar.f(i, 2);
            int iB = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iB += b1c.b(((Long) list.get(i3)).longValue());
            }
            b1cVar.v(iB);
            while (i2 < list.size()) {
                b1cVar.x(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        r2c r2cVar = (r2c) list;
        if (!z) {
            while (i2 < r2cVar.v) {
                b1cVar.j(i, r2cVar.e(i2));
                i2++;
            }
            return;
        }
        b1cVar.f(i, 2);
        int iB2 = 0;
        for (int i4 = 0; i4 < r2cVar.v; i4++) {
            iB2 += b1c.b(r2cVar.e(i4));
        }
        b1cVar.v(iB2);
        while (i2 < r2cVar.v) {
            b1cVar.x(r2cVar.e(i2));
            i2++;
        }
    }

    public static void g(int i, List list, c1c c1cVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b1c b1cVar = c1cVar.a;
        int i2 = 0;
        if (!(list instanceof r2c)) {
            if (!z) {
                while (i2 < list.size()) {
                    b1cVar.j(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            b1cVar.f(i, 2);
            int iB = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iB += b1c.b(((Long) list.get(i3)).longValue());
            }
            b1cVar.v(iB);
            while (i2 < list.size()) {
                b1cVar.x(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        r2c r2cVar = (r2c) list;
        if (!z) {
            while (i2 < r2cVar.v) {
                b1cVar.j(i, r2cVar.e(i2));
                i2++;
            }
            return;
        }
        b1cVar.f(i, 2);
        int iB2 = 0;
        for (int i4 = 0; i4 < r2cVar.v; i4++) {
            iB2 += b1c.b(r2cVar.e(i4));
        }
        b1cVar.v(iB2);
        while (i2 < r2cVar.v) {
            b1cVar.x(r2cVar.e(i2));
            i2++;
        }
    }

    public static void h(int i, List list, c1c c1cVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b1c b1cVar = c1cVar.a;
        int i2 = 0;
        if (!(list instanceof r2c)) {
            if (!z) {
                while (i2 < list.size()) {
                    long jLongValue = ((Long) list.get(i2)).longValue();
                    b1cVar.j(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i2++;
                }
                return;
            }
            b1cVar.f(i, 2);
            int iB = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                long jLongValue2 = ((Long) list.get(i3)).longValue();
                iB += b1c.b((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            b1cVar.v(iB);
            while (i2 < list.size()) {
                long jLongValue3 = ((Long) list.get(i2)).longValue();
                b1cVar.x((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i2++;
            }
            return;
        }
        r2c r2cVar = (r2c) list;
        if (!z) {
            while (i2 < r2cVar.v) {
                long jE = r2cVar.e(i2);
                b1cVar.j(i, (jE >> 63) ^ (jE + jE));
                i2++;
            }
            return;
        }
        b1cVar.f(i, 2);
        int iB2 = 0;
        for (int i4 = 0; i4 < r2cVar.v; i4++) {
            long jE2 = r2cVar.e(i4);
            iB2 += b1c.b((jE2 >> 63) ^ (jE2 + jE2));
        }
        b1cVar.v(iB2);
        while (i2 < r2cVar.v) {
            long jE3 = r2cVar.e(i2);
            b1cVar.x((jE3 >> 63) ^ (jE3 + jE3));
            i2++;
        }
    }

    public static void i(int i, List list, c1c c1cVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b1c b1cVar = c1cVar.a;
        int i2 = 0;
        if (!(list instanceof r2c)) {
            if (!z) {
                while (i2 < list.size()) {
                    b1cVar.k(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            b1cVar.f(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            b1cVar.v(i3);
            while (i2 < list.size()) {
                b1cVar.y(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        r2c r2cVar = (r2c) list;
        if (!z) {
            while (i2 < r2cVar.v) {
                b1cVar.k(i, r2cVar.e(i2));
                i2++;
            }
            return;
        }
        b1cVar.f(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < r2cVar.v; i6++) {
            r2cVar.e(i6);
            i5 += 8;
        }
        b1cVar.v(i5);
        while (i2 < r2cVar.v) {
            b1cVar.y(r2cVar.e(i2));
            i2++;
        }
    }

    public static void j(int i, List list, c1c c1cVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b1c b1cVar = c1cVar.a;
        int i2 = 0;
        if (!(list instanceof r2c)) {
            if (!z) {
                while (i2 < list.size()) {
                    b1cVar.k(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            b1cVar.f(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            b1cVar.v(i3);
            while (i2 < list.size()) {
                b1cVar.y(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        r2c r2cVar = (r2c) list;
        if (!z) {
            while (i2 < r2cVar.v) {
                b1cVar.k(i, r2cVar.e(i2));
                i2++;
            }
            return;
        }
        b1cVar.f(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < r2cVar.v; i6++) {
            r2cVar.e(i6);
            i5 += 8;
        }
        b1cVar.v(i5);
        while (i2 < r2cVar.v) {
            b1cVar.y(r2cVar.e(i2));
            i2++;
        }
    }

    public static void k(int i, List list, c1c c1cVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b1c b1cVar = c1cVar.a;
        int i2 = 0;
        if (!(list instanceof v1c)) {
            if (!z) {
                while (i2 < list.size()) {
                    b1cVar.g(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            b1cVar.f(i, 2);
            int iB = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iB += b1c.b(((Integer) list.get(i3)).intValue());
            }
            b1cVar.v(iB);
            while (i2 < list.size()) {
                b1cVar.u(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        v1c v1cVar = (v1c) list;
        if (!z) {
            while (i2 < v1cVar.v) {
                b1cVar.g(i, v1cVar.f(i2));
                i2++;
            }
            return;
        }
        b1cVar.f(i, 2);
        int iB2 = 0;
        for (int i4 = 0; i4 < v1cVar.v; i4++) {
            iB2 += b1c.b(v1cVar.f(i4));
        }
        b1cVar.v(iB2);
        while (i2 < v1cVar.v) {
            b1cVar.u(v1cVar.f(i2));
            i2++;
        }
    }

    public static void l(int i, List list, c1c c1cVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b1c b1cVar = c1cVar.a;
        int i2 = 0;
        if (!(list instanceof v1c)) {
            if (!z) {
                while (i2 < list.size()) {
                    b1cVar.h(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            b1cVar.f(i, 2);
            int iA = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iA += b1c.a(((Integer) list.get(i3)).intValue());
            }
            b1cVar.v(iA);
            while (i2 < list.size()) {
                b1cVar.v(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        v1c v1cVar = (v1c) list;
        if (!z) {
            while (i2 < v1cVar.v) {
                b1cVar.h(i, v1cVar.f(i2));
                i2++;
            }
            return;
        }
        b1cVar.f(i, 2);
        int iA2 = 0;
        for (int i4 = 0; i4 < v1cVar.v; i4++) {
            iA2 += b1c.a(v1cVar.f(i4));
        }
        b1cVar.v(iA2);
        while (i2 < v1cVar.v) {
            b1cVar.v(v1cVar.f(i2));
            i2++;
        }
    }

    public static void m(int i, List list, c1c c1cVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b1c b1cVar = c1cVar.a;
        int i2 = 0;
        if (!(list instanceof v1c)) {
            if (!z) {
                while (i2 < list.size()) {
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    b1cVar.h(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i2++;
                }
                return;
            }
            b1cVar.f(i, 2);
            int iA = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((Integer) list.get(i3)).intValue();
                iA += b1c.a((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            b1cVar.v(iA);
            while (i2 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i2)).intValue();
                b1cVar.v((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i2++;
            }
            return;
        }
        v1c v1cVar = (v1c) list;
        if (!z) {
            while (i2 < v1cVar.v) {
                int iF = v1cVar.f(i2);
                b1cVar.h(i, (iF >> 31) ^ (iF + iF));
                i2++;
            }
            return;
        }
        b1cVar.f(i, 2);
        int iA2 = 0;
        for (int i4 = 0; i4 < v1cVar.v; i4++) {
            int iF2 = v1cVar.f(i4);
            iA2 += b1c.a((iF2 >> 31) ^ (iF2 + iF2));
        }
        b1cVar.v(iA2);
        while (i2 < v1cVar.v) {
            int iF3 = v1cVar.f(i2);
            b1cVar.v((iF3 >> 31) ^ (iF3 + iF3));
            i2++;
        }
    }

    public static void n(int i, List list, c1c c1cVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b1c b1cVar = c1cVar.a;
        int i2 = 0;
        if (!(list instanceof v1c)) {
            if (!z) {
                while (i2 < list.size()) {
                    b1cVar.i(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            b1cVar.f(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            b1cVar.v(i3);
            while (i2 < list.size()) {
                b1cVar.w(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        v1c v1cVar = (v1c) list;
        if (!z) {
            while (i2 < v1cVar.v) {
                b1cVar.i(i, v1cVar.f(i2));
                i2++;
            }
            return;
        }
        b1cVar.f(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < v1cVar.v; i6++) {
            v1cVar.f(i6);
            i5 += 4;
        }
        b1cVar.v(i5);
        while (i2 < v1cVar.v) {
            b1cVar.w(v1cVar.f(i2));
            i2++;
        }
    }

    public static void o(int i, List list, c1c c1cVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b1c b1cVar = c1cVar.a;
        int i2 = 0;
        if (!(list instanceof v1c)) {
            if (!z) {
                while (i2 < list.size()) {
                    b1cVar.i(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            b1cVar.f(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            b1cVar.v(i3);
            while (i2 < list.size()) {
                b1cVar.w(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        v1c v1cVar = (v1c) list;
        if (!z) {
            while (i2 < v1cVar.v) {
                b1cVar.i(i, v1cVar.f(i2));
                i2++;
            }
            return;
        }
        b1cVar.f(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < v1cVar.v; i6++) {
            v1cVar.f(i6);
            i5 += 4;
        }
        b1cVar.v(i5);
        while (i2 < v1cVar.v) {
            b1cVar.w(v1cVar.f(i2));
            i2++;
        }
    }

    public static void p(int i, List list, c1c c1cVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b1c b1cVar = c1cVar.a;
        int i2 = 0;
        if (!(list instanceof v1c)) {
            if (!z) {
                while (i2 < list.size()) {
                    b1cVar.g(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            b1cVar.f(i, 2);
            int iB = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iB += b1c.b(((Integer) list.get(i3)).intValue());
            }
            b1cVar.v(iB);
            while (i2 < list.size()) {
                b1cVar.u(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        v1c v1cVar = (v1c) list;
        if (!z) {
            while (i2 < v1cVar.v) {
                b1cVar.g(i, v1cVar.f(i2));
                i2++;
            }
            return;
        }
        b1cVar.f(i, 2);
        int iB2 = 0;
        for (int i4 = 0; i4 < v1cVar.v; i4++) {
            iB2 += b1c.b(v1cVar.f(i4));
        }
        b1cVar.v(iB2);
        while (i2 < v1cVar.v) {
            b1cVar.u(v1cVar.f(i2));
            i2++;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void q(int i, List list, c1c c1cVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b1c b1cVar = c1cVar.a;
        int i2 = 0;
        if (!(list instanceof k0c)) {
            if (!z) {
                while (i2 < list.size()) {
                    b1cVar.l(i, ((Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            b1cVar.f(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).getClass();
                i3++;
            }
            b1cVar.v(i3);
            while (i2 < list.size()) {
                b1cVar.t(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        k0c k0cVar = (k0c) list;
        if (!z) {
            while (i2 < k0cVar.v) {
                k0cVar.f(i2);
                b1cVar.l(i, k0cVar.u[i2]);
                i2++;
            }
            return;
        }
        b1cVar.f(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < k0cVar.v; i6++) {
            k0cVar.f(i6);
            boolean z2 = k0cVar.u[i6];
            i5++;
        }
        b1cVar.v(i5);
        while (i2 < k0cVar.v) {
            k0cVar.f(i2);
            b1cVar.t(k0cVar.u[i2] ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static int r(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof r2c)) {
            int iB = 0;
            while (i < size) {
                iB += b1c.b(((Long) list.get(i)).longValue());
                i++;
            }
            return iB;
        }
        r2c r2cVar = (r2c) list;
        int iB2 = 0;
        while (i < size) {
            iB2 += b1c.b(r2cVar.e(i));
            i++;
        }
        return iB2;
    }

    public static int s(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof r2c)) {
            int iB = 0;
            while (i < size) {
                iB += b1c.b(((Long) list.get(i)).longValue());
                i++;
            }
            return iB;
        }
        r2c r2cVar = (r2c) list;
        int iB2 = 0;
        while (i < size) {
            iB2 += b1c.b(r2cVar.e(i));
            i++;
        }
        return iB2;
    }

    public static int t(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof r2c)) {
            int iB = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iB += b1c.b((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
            return iB;
        }
        r2c r2cVar = (r2c) list;
        int iB2 = 0;
        while (i < size) {
            long jE = r2cVar.e(i);
            iB2 += b1c.b((jE >> 63) ^ (jE + jE));
            i++;
        }
        return iB2;
    }

    public static int u(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof v1c)) {
            int iB = 0;
            while (i < size) {
                iB += b1c.b(((Integer) list.get(i)).intValue());
                i++;
            }
            return iB;
        }
        v1c v1cVar = (v1c) list;
        int iB2 = 0;
        while (i < size) {
            iB2 += b1c.b(v1cVar.f(i));
            i++;
        }
        return iB2;
    }

    public static int v(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof v1c)) {
            int iB = 0;
            while (i < size) {
                iB += b1c.b(((Integer) list.get(i)).intValue());
                i++;
            }
            return iB;
        }
        v1c v1cVar = (v1c) list;
        int iB2 = 0;
        while (i < size) {
            iB2 += b1c.b(v1cVar.f(i));
            i++;
        }
        return iB2;
    }

    public static int w(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof v1c)) {
            int iA = 0;
            while (i < size) {
                iA += b1c.a(((Integer) list.get(i)).intValue());
                i++;
            }
            return iA;
        }
        v1c v1cVar = (v1c) list;
        int iA2 = 0;
        while (i < size) {
            iA2 += b1c.a(v1cVar.f(i));
            i++;
        }
        return iA2;
    }

    public static int x(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof v1c)) {
            int iA = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iA += b1c.a((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iA;
        }
        v1c v1cVar = (v1c) list;
        int iA2 = 0;
        while (i < size) {
            int iF = v1cVar.f(i);
            iA2 += b1c.a((iF >> 31) ^ (iF + iF));
            i++;
        }
        return iA2;
    }

    public static int y(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (b1c.a(i << 3) + 4) * size;
    }

    public static int z(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (b1c.a(i << 3) + 8) * size;
    }
}
