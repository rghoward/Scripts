package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qu9 {
    public static final q32 a = new q32(2);
    public static final kv9<hu9> b = new kv9<>();
    public static final Object c = new Object();
    public static ou9 d;
    public static long e;
    public static final ku9 f;
    public static final mv9<m0a> g;
    public static List<? extends ci4<? super Set<? extends Object>, ? super hu9, g2b>> h;
    public static List<? extends oh4<Object, g2b>> i;
    public static final fn4 j;
    public static final k60 k;

    static {
        ou9 ou9Var = ou9.x;
        d = ou9Var;
        e = 2L;
        ku9 ku9Var = new ku9();
        ku9Var.b = new long[16];
        ku9Var.c = new int[16];
        int[] iArr = new int[16];
        int i2 = 0;
        int i3 = 0;
        while (i3 < 16) {
            int i4 = i3 + 1;
            iArr[i3] = i4;
            i3 = i4;
        }
        ku9Var.d = iArr;
        f = ku9Var;
        mv9<m0a> mv9Var = new mv9<>();
        mv9Var.b = new int[16];
        mv9Var.c = new okb[16];
        g = mv9Var;
        hf3 hf3Var = hf3.t;
        h = hf3Var;
        i = hf3Var;
        long j2 = e;
        e = 1 + j2;
        fn4 fn4Var = new fn4(j2, ou9Var, null, new en4(i2));
        d = d.j(fn4Var.b);
        j = fn4Var;
        k = new k60(0);
    }

    public static final void a() {
        e(a);
    }

    public static final HashMap b(long j2, g37 g37Var, ou9 ou9Var) {
        long[] jArr;
        ou9 ou9Var2;
        long[] jArr2;
        int i2;
        int i3;
        o0a o0aVarS;
        d37<m0a> d37VarX = g37Var.x();
        if (d37VarX != null) {
            long jG = g37Var.g();
            ou9 ou9VarI = g37Var.d().j(jG).i(g37Var.j);
            Object[] objArr = d37VarX.b;
            long[] jArr3 = d37VarX.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i4 = 0;
                HashMap map = null;
                while (true) {
                    long j3 = jArr3[i4];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8;
                        int i6 = 8 - ((~(i4 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((j3 & 255) < 128) {
                                m0a m0aVar = (m0a) objArr[(i4 << 3) + i7];
                                o0a o0aVarD = m0aVar.d();
                                jArr2 = jArr3;
                                i2 = i5;
                                i3 = i7;
                                o0a o0aVarS2 = s(o0aVarD, j2, ou9Var);
                                if (o0aVarS2 != null && (o0aVarS = s(o0aVarD, jG, ou9VarI)) != null && !o0aVarS2.equals(o0aVarS)) {
                                    o0a o0aVarS3 = s(o0aVarD, jG, g37Var.d());
                                    if (o0aVarS3 == null) {
                                        r();
                                        throw null;
                                    }
                                    o0a o0aVarF = m0aVar.f(o0aVarS, o0aVarS2, o0aVarS3);
                                    if (o0aVarF == null) {
                                        return null;
                                    }
                                    if (map == null) {
                                        map = new HashMap();
                                    }
                                    map.put(o0aVarS2, o0aVarF);
                                    map = map;
                                }
                            } else {
                                jArr2 = jArr3;
                                i2 = i5;
                                i3 = i7;
                            }
                            j3 >>= i2;
                            i7 = i3 + 1;
                            i5 = i2;
                            jArr3 = jArr2;
                            ou9VarI = ou9VarI;
                        }
                        jArr = jArr3;
                        ou9Var2 = ou9VarI;
                        if (i6 != i5) {
                            return map;
                        }
                    } else {
                        jArr = jArr3;
                        ou9Var2 = ou9VarI;
                    }
                    if (i4 == length) {
                        return map;
                    }
                    i4++;
                    jArr3 = jArr;
                    ou9VarI = ou9Var2;
                }
            }
        }
        return null;
    }

    public static final void c(hu9 hu9Var) {
        long j2;
        if (d.f(hu9Var.g())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: snapshotId=");
        sb.append(hu9Var.g());
        sb.append(", disposed=");
        sb.append(hu9Var.c);
        sb.append(", applied=");
        g37 g37Var = hu9Var instanceof g37 ? (g37) hu9Var : null;
        sb.append(g37Var != null ? Boolean.valueOf(g37Var.m) : "read-only");
        sb.append(", lowestPin=");
        synchronized (c) {
            ku9 ku9Var = f;
            j2 = ku9Var.a > 0 ? ku9Var.b[0] : -1L;
        }
        sb.append(j2);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final ou9 d(ou9 ou9Var, long j2, long j3) {
        while (xj5.c(j2, j3) < 0) {
            ou9Var = ou9Var.j(j2);
            j2++;
        }
        return ou9Var;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0090 A[Catch: all -> 0x0086, LOOP:1: B:30:0x0056->B:42:0x0090, LOOP_END, TryCatch #1 {all -> 0x0086, blocks: (B:25:0x0047, B:27:0x004c, B:30:0x0056, B:32:0x0066, B:34:0x0072, B:36:0x007b, B:39:0x0088, B:42:0x0090, B:43:0x0093), top: B:52:0x0047 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0093 A[EDGE_INSN: B:58:0x0093->B:43:0x0093 BREAK  A[LOOP:1: B:30:0x0056->B:42:0x0090], SYNTHETIC] */
    public static final <T> T e(oh4<? super ou9, ? extends T> oh4Var) {
        d37<m0a> d37Var;
        T t;
        fn4 fn4Var = j;
        synchronized (c) {
            try {
                d37Var = fn4Var.h;
                if (d37Var != null) {
                    k.addAndGet(1);
                }
                t = (T) v(fn4Var, oh4Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (d37Var != null) {
            try {
                List<? extends ci4<? super Set<? extends Object>, ? super hu9, g2b>> list = h;
                b49 b49Var = new b49(d37Var);
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    list.get(i2).invoke(b49Var, fn4Var);
                }
                k.addAndGet(-1);
            } catch (Throwable th2) {
                k.addAndGet(-1);
                throw th2;
            }
        }
        synchronized (c) {
            try {
                f();
                if (d37Var != null) {
                    Object[] objArr = d37Var.b;
                    long[] jArr = d37Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i3 = 0;
                        while (true) {
                            long j2 = jArr[i3];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i3 != length) {
                                    break;
                                    break;
                                }
                                i3++;
                            } else {
                                int i4 = 8 - ((~(i3 - length)) >>> 31);
                                for (int i5 = 0; i5 < i4; i5++) {
                                    if ((255 & j2) < 128) {
                                        q((m0a) objArr[(i3 << 3) + i5]);
                                    }
                                    j2 >>= 8;
                                }
                                if (i4 != 8) {
                                    break;
                                }
                                if (i3 != length) {
                                    break;
                                }
                                i3++;
                            }
                        }
                    }
                    g2b g2bVar = g2b.a;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return t;
    }

    public static final void f() {
        mv9<m0a> mv9Var = g;
        int i2 = mv9Var.a;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            okb<m0a> okbVar = mv9Var.c[i3];
            m0a m0aVar = okbVar != null ? okbVar.get() : null;
            if (m0aVar != null && p(m0aVar)) {
                if (i4 != i3) {
                    mv9Var.c[i4] = okbVar;
                    int[] iArr = mv9Var.b;
                    iArr[i4] = iArr[i3];
                }
                i4++;
            }
            i3++;
        }
        for (int i5 = i4; i5 < i2; i5++) {
            mv9Var.c[i5] = null;
            mv9Var.b[i5] = 0;
        }
        if (i4 != i2) {
            mv9Var.a = i4;
        }
    }

    public static final hu9 g(hu9 hu9Var, oh4<Object, g2b> oh4Var, boolean z) {
        boolean z2 = hu9Var instanceof g37;
        if (z2 || hu9Var == null) {
            return new zwa(z2 ? (g37) hu9Var : null, oh4Var, null, false, z);
        }
        return new axa(hu9Var, oh4Var, false, z);
    }

    public static final <T extends o0a> T h(T t) {
        T t2;
        hu9 hu9VarJ = j();
        T t3 = (T) s(t, hu9VarJ.g(), hu9VarJ.d());
        if (t3 != null) {
            return t3;
        }
        synchronized (c) {
            hu9 hu9VarJ2 = j();
            t2 = (T) s(t, hu9VarJ2.g(), hu9VarJ2.d());
        }
        if (t2 != null) {
            return t2;
        }
        r();
        throw null;
    }

    public static final <T extends o0a> T i(T t, hu9 hu9Var) {
        T t2;
        T t3 = (T) s(t, hu9Var.g(), hu9Var.d());
        if (t3 != null) {
            return t3;
        }
        synchronized (c) {
            t2 = (T) s(t, hu9Var.g(), hu9Var.d());
        }
        if (t2 != null) {
            return t2;
        }
        r();
        throw null;
    }

    public static final hu9 j() {
        hu9 hu9VarA = b.a();
        return hu9VarA == null ? j : hu9VarA;
    }

    public static final oh4<Object, g2b> k(oh4<Object, g2b> oh4Var, oh4<Object, g2b> oh4Var2, boolean z) {
        if (!z) {
            oh4Var2 = null;
        }
        if (oh4Var == null || oh4Var2 == null || oh4Var == oh4Var2) {
            return oh4Var == null ? oh4Var2 : oh4Var;
        }
        return new xj1(oh4Var, oh4Var2, 1);
    }

    public static final oh4<Object, g2b> l(oh4<Object, g2b> oh4Var, oh4<Object, g2b> oh4Var2) {
        if (oh4Var == null || oh4Var2 == null || oh4Var == oh4Var2) {
            return oh4Var == null ? oh4Var2 : oh4Var;
        }
        return new zj1(2, oh4Var, oh4Var2);
    }

    public static final <T extends o0a> T m(T t, m0a m0aVar) {
        long j2 = e;
        ku9 ku9Var = f;
        if (ku9Var.a > 0) {
            j2 = ku9Var.b[0];
        }
        long j3 = j2 - 1;
        T t2 = null;
        o0a o0aVar = null;
        for (o0a o0aVarD = m0aVar.d(); o0aVarD != null; o0aVarD = o0aVarD.b) {
            long j4 = o0aVarD.a;
            if (j4 != 0) {
                if (j4 != 0 && xj5.c(j4, j3) <= 0 && !ou9.x.f(j4)) {
                    if (o0aVar != null) {
                        if (xj5.c(o0aVarD.a, o0aVar.a) >= 0) {
                            t2 = (T) o0aVar;
                            break;
                        }
                        break;
                    }
                    o0aVar = o0aVarD;
                }
            }
            t2 = (T) o0aVarD;
            break;
        }
        if (t2 != null) {
            t2.a = Long.MAX_VALUE;
            return t2;
        }
        T t3 = (T) t.c(Long.MAX_VALUE);
        t3.b = m0aVar.d();
        m0aVar.q(t3);
        return t3;
    }

    public static final void n(hu9 hu9Var, m0a m0aVar) {
        hu9Var.t(hu9Var.h() + 1);
        oh4<Object, g2b> oh4VarI = hu9Var.i();
        if (oh4VarI != null) {
            oh4VarI.invoke(m0aVar);
        }
    }

    public static final o0a o(o0a o0aVar, n0a n0aVar, hu9 hu9Var, o0a o0aVar2) {
        o0a o0aVarM;
        if (hu9Var.f()) {
            hu9Var.n(n0aVar);
        }
        long jG = hu9Var.g();
        if (o0aVar2.a == jG) {
            return o0aVar2;
        }
        synchronized (c) {
            o0aVarM = m(o0aVar, n0aVar);
        }
        o0aVarM.a = jG;
        if (o0aVar2.a != 1) {
            hu9Var.n(n0aVar);
        }
        return o0aVarM;
    }

    public static final boolean p(m0a m0aVar) {
        o0a o0aVar;
        long j2 = e;
        ku9 ku9Var = f;
        if (ku9Var.a > 0) {
            j2 = ku9Var.b[0];
        }
        o0a o0aVar2 = null;
        o0a o0aVarD = null;
        int i2 = 0;
        for (o0a o0aVarD2 = m0aVar.d(); o0aVarD2 != null; o0aVarD2 = o0aVarD2.b) {
            long j3 = o0aVarD2.a;
            if (j3 != 0) {
                if (xj5.c(j3, j2) >= 0) {
                    i2++;
                } else if (o0aVar2 == null) {
                    i2++;
                    o0aVar2 = o0aVarD2;
                } else {
                    if (xj5.c(o0aVarD2.a, o0aVar2.a) < 0) {
                        o0aVar = o0aVar2;
                        o0aVar2 = o0aVarD2;
                    } else {
                        o0aVar = o0aVarD2;
                    }
                    if (o0aVarD == null) {
                        o0aVarD = m0aVar.d();
                        o0a o0aVar3 = o0aVarD;
                        while (true) {
                            if (o0aVarD == null) {
                                o0aVarD = o0aVar3;
                                break;
                            }
                            if (xj5.c(o0aVarD.a, j2) >= 0) {
                                break;
                            }
                            if (xj5.c(o0aVar3.a, o0aVarD.a) < 0) {
                                o0aVar3 = o0aVarD;
                            }
                            o0aVarD = o0aVarD.b;
                        }
                    }
                    o0aVar2.a = 0L;
                    o0aVar2.a(o0aVarD);
                    o0aVar2 = o0aVar;
                }
            }
        }
        return i2 > 1;
    }

    public static final void q(m0a m0aVar) {
        if (p(m0aVar)) {
            mv9<m0a> mv9Var = g;
            int i2 = mv9Var.a;
            int iIdentityHashCode = System.identityHashCode(m0aVar);
            int i3 = -1;
            if (i2 > 0) {
                int i4 = mv9Var.a - 1;
                int i5 = 0;
                while (true) {
                    if (i5 > i4) {
                        i3 = -(i5 + 1);
                        break;
                    }
                    int i6 = (i5 + i4) >>> 1;
                    int i7 = mv9Var.b[i6];
                    if (i7 < iIdentityHashCode) {
                        i5 = i6 + 1;
                    } else if (i7 > iIdentityHashCode) {
                        i4 = i6 - 1;
                    } else {
                        okb<m0a> okbVar = mv9Var.c[i6];
                        if (m0aVar == (okbVar != null ? okbVar.get() : null)) {
                            i3 = i6;
                            break;
                        }
                        int i8 = i6 - 1;
                        while (true) {
                            if (-1 >= i8 || mv9Var.b[i8] != iIdentityHashCode) {
                                i6++;
                                int i9 = mv9Var.a;
                                while (true) {
                                    if (i6 >= i9) {
                                        i3 = -(mv9Var.a + 1);
                                        break;
                                    }
                                    if (mv9Var.b[i6] != iIdentityHashCode) {
                                        i3 = -(i6 + 1);
                                        break;
                                    }
                                    okb<m0a> okbVar2 = mv9Var.c[i6];
                                    if ((okbVar2 != null ? okbVar2.get() : null) == m0aVar) {
                                        i3 = i6;
                                        break;
                                    }
                                    i6++;
                                }
                            } else {
                                okb<m0a> okbVar3 = mv9Var.c[i8];
                                if ((okbVar3 != null ? okbVar3.get() : null) == m0aVar) {
                                    i3 = i8;
                                    break;
                                }
                                i8--;
                            }
                        }
                    }
                }
                if (i3 >= 0) {
                    return;
                }
            }
            int i10 = -(i3 + 1);
            okb<m0a>[] okbVarArr = mv9Var.c;
            int length = okbVarArr.length;
            if (i2 == length) {
                int i11 = length * 2;
                okb<T>[] okbVarArr2 = new okb[i11];
                int[] iArr = new int[i11];
                int i12 = i10 + 1;
                System.arraycopy(okbVarArr, i10, okbVarArr2, i12, i2 - i10);
                System.arraycopy(mv9Var.c, 0, okbVarArr2, 0, i10);
                gz3.e(i12, i10, i2, mv9Var.b, iArr);
                gz3.h(0, i10, 6, mv9Var.b, iArr);
                mv9Var.c = okbVarArr2;
                mv9Var.b = iArr;
            } else {
                int i13 = i10 + 1;
                System.arraycopy(okbVarArr, i10, okbVarArr, i13, i2 - i10);
                int[] iArr2 = mv9Var.b;
                gz3.e(i13, i10, i2, iArr2, iArr2);
            }
            mv9Var.c[i10] = new okb<>(m0aVar);
            mv9Var.b[i10] = iIdentityHashCode;
            mv9Var.a++;
        }
    }

    public static final void r() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final <T extends o0a> T s(T t, long j2, ou9 ou9Var) {
        T t2 = null;
        while (t != null) {
            long j3 = t.a;
            if (j3 != 0 && xj5.c(j3, j2) <= 0 && !ou9Var.f(j3) && (t2 == null || xj5.c(t2.a, t.a) < 0)) {
                t2 = t;
            }
            t = (T) t.b;
        }
        if (t2 != null) {
            return t2;
        }
        return null;
    }

    public static final <T extends o0a> T t(T t, m0a m0aVar) {
        T t2;
        hu9 hu9VarJ = j();
        oh4<Object, g2b> oh4VarE = hu9VarJ.e();
        if (oh4VarE != null) {
            oh4VarE.invoke(m0aVar);
        }
        T t3 = (T) s(t, hu9VarJ.g(), hu9VarJ.d());
        if (t3 != null) {
            return t3;
        }
        synchronized (c) {
            hu9 hu9VarJ2 = j();
            o0a o0aVarD = m0aVar.d();
            o0aVarD.getClass();
            t2 = (T) s(o0aVarD, hu9VarJ2.g(), hu9VarJ2.d());
            if (t2 == null) {
                r();
                throw null;
            }
        }
        return t2;
    }

    public static final void u(int i2) {
        ku9 ku9Var = f;
        int i3 = ku9Var.d[i2];
        ku9Var.b(i3, ku9Var.a - 1);
        ku9Var.a--;
        long[] jArr = ku9Var.b;
        long j2 = jArr[i3];
        int i4 = i3;
        while (i4 > 0) {
            int i5 = ((i4 + 1) >> 1) - 1;
            if (xj5.c(jArr[i5], j2) <= 0) {
                break;
            }
            ku9Var.b(i5, i4);
            i4 = i5;
        }
        long[] jArr2 = ku9Var.b;
        int i6 = ku9Var.a >> 1;
        while (i3 < i6) {
            int i7 = (i3 + 1) << 1;
            int i8 = i7 - 1;
            if (i7 < ku9Var.a && xj5.c(jArr2[i7], jArr2[i8]) < 0) {
                if (xj5.c(jArr2[i7], jArr2[i3]) >= 0) {
                    break;
                }
                ku9Var.b(i7, i3);
                i3 = i7;
            } else {
                if (xj5.c(jArr2[i8], jArr2[i3]) >= 0) {
                    break;
                }
                ku9Var.b(i8, i3);
                i3 = i8;
            }
        }
        ku9Var.d[i2] = ku9Var.e;
        ku9Var.e = i2;
    }

    public static final <T> T v(fn4 fn4Var, oh4<? super ou9, ? extends T> oh4Var) {
        long j2 = fn4Var.b;
        T tInvoke = oh4Var.invoke(d.e(j2));
        long j3 = e;
        e = 1 + j3;
        ou9 ou9VarE = d.e(j2);
        d = ou9VarE;
        fn4Var.b = j3;
        fn4Var.a = ou9VarE;
        fn4Var.g = 0;
        fn4Var.h = null;
        fn4Var.o();
        d = d.j(j3);
        return tInvoke;
    }

    public static final <T extends o0a> T w(T t, m0a m0aVar, hu9 hu9Var) {
        T t2;
        if (hu9Var.f()) {
            hu9Var.n(m0aVar);
        }
        long jG = hu9Var.g();
        T t3 = (T) s(t, jG, hu9Var.d());
        if (t3 == null) {
            r();
            throw null;
        }
        if (t3.a == hu9Var.g()) {
            return t3;
        }
        synchronized (c) {
            t2 = (T) s(m0aVar.d(), jG, hu9Var.d());
            if (t2 == null) {
                r();
                throw null;
            }
            if (t2.a != jG) {
                o0a o0aVarM = m(t2, m0aVar);
                o0aVarM.a(t2);
                o0aVarM.a = hu9Var.g();
                t2 = (T) o0aVarM;
            }
        }
        if (t3.a != 1) {
            hu9Var.n(m0aVar);
        }
        return t2;
    }
}
