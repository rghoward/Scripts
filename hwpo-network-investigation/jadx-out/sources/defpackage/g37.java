package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class g37 extends hu9 {
    public static final int[] n = new int[0];
    public final oh4<Object, g2b> e;
    public final oh4<Object, g2b> f;
    public int g;
    public d37<m0a> h;
    public ArrayList i;
    public ou9 j;
    public int[] k;
    public int l;
    public boolean m;

    public g37(long j, ou9 ou9Var, oh4<Object, g2b> oh4Var, oh4<Object, g2b> oh4Var2) {
        super(j, ou9Var);
        this.e = oh4Var;
        this.f = oh4Var2;
        this.j = ou9.x;
        this.k = n;
        this.l = 1;
    }

    public final void A(long j) {
        synchronized (qu9.c) {
            this.j = this.j.j(j);
            g2b g2bVar = g2b.a;
        }
    }

    public void B(d37<m0a> d37Var) {
        this.h = d37Var;
    }

    public g37 C(oh4<Object, g2b> oh4Var, oh4<Object, g2b> oh4Var2) {
        y87 y87Var;
        if (this.c) {
            c78.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            c78.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(g());
        Object obj = qu9.c;
        synchronized (obj) {
            long j = qu9.e;
            qu9.e = j + 1;
            qu9.d = qu9.d.j(j);
            ou9 ou9VarD = d();
            r(ou9VarD.j(j));
            y87Var = new y87(j, qu9.d(ou9VarD, g() + 1, j), qu9.k(oh4Var, e(), true), qu9.l(oh4Var2, i()), this);
        }
        if (this.m || this.c) {
            return y87Var;
        }
        long jG = g();
        synchronized (obj) {
            long j2 = qu9.e;
            qu9.e = j2 + 1;
            s(j2);
            qu9.d = qu9.d.j(g());
            g2b g2bVar = g2b.a;
        }
        r(qu9.d(d(), jG + 1, g()));
        return y87Var;
    }

    @Override // defpackage.hu9
    public final void b() {
        qu9.d = qu9.d.e(g()).d(this.j);
    }

    @Override // defpackage.hu9
    public void c() {
        if (this.c) {
            return;
        }
        super.c();
        l();
    }

    @Override // defpackage.hu9
    public boolean f() {
        return false;
    }

    @Override // defpackage.hu9
    public int h() {
        return this.g;
    }

    @Override // defpackage.hu9
    public oh4<Object, g2b> i() {
        return this.f;
    }

    @Override // defpackage.hu9
    public void k() {
        this.l++;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x008e A[LOOP:0: B:18:0x0039->B:35:0x008e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x0091 A[EDGE_INSN: B:39:0x0091->B:36:0x0091 BREAK  A[LOOP:0: B:18:0x0039->B:35:0x008e], SYNTHETIC] */
    @Override // defpackage.hu9
    public void l() {
        if (this.l <= 0) {
            c78.a("no pending nested snapshots");
        }
        int i = this.l - 1;
        this.l = i;
        if (i != 0 || this.m) {
            return;
        }
        d37<m0a> d37VarX = x();
        if (d37VarX != null) {
            if (this.m) {
                c78.b("Unsupported operation on a snapshot that has been applied");
            }
            B(null);
            long jG = g();
            Object[] objArr = d37VarX.b;
            long[] jArr = d37VarX.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i2 != length) {
                            break;
                            break;
                        }
                        i2++;
                    } else {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j) < 128) {
                                for (o0a o0aVarD = ((m0a) objArr[(i2 << 3) + i4]).d(); o0aVarD != null; o0aVarD = o0aVarD.b) {
                                    long j2 = o0aVarD.a;
                                    if (j2 == jG || th1.u(this.j, Long.valueOf(j2))) {
                                        q32 q32Var = qu9.a;
                                        o0aVarD.a = 0L;
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        } else if (i2 != length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
        }
        a();
    }

    @Override // defpackage.hu9
    public void m() {
        if (this.m || this.c) {
            return;
        }
        v();
    }

    @Override // defpackage.hu9
    public void n(m0a m0aVar) {
        d37<m0a> d37VarX = x();
        if (d37VarX == null) {
            d37VarX = a49.a();
            B(d37VarX);
        }
        d37VarX.a(m0aVar);
    }

    @Override // defpackage.hu9
    public final void p() {
        int length = this.k.length;
        for (int i = 0; i < length; i++) {
            qu9.u(this.k[i]);
        }
        o();
    }

    @Override // defpackage.hu9
    public void t(int i) {
        this.g = i;
    }

    @Override // defpackage.hu9
    public hu9 u(oh4<Object, g2b> oh4Var) {
        a97 a97Var;
        if (this.c) {
            c78.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            c78.b("Unsupported operation on a disposed or applied snapshot");
        }
        long jG = g();
        A(g());
        Object obj = qu9.c;
        synchronized (obj) {
            long j = qu9.e;
            qu9.e = j + 1;
            qu9.d = qu9.d.j(j);
            a97Var = new a97(j, qu9.d(d(), jG + 1, j), qu9.k(oh4Var, e(), true), this);
        }
        if (this.m || this.c) {
            return a97Var;
        }
        long jG2 = g();
        synchronized (obj) {
            long j2 = qu9.e;
            qu9.e = j2 + 1;
            s(j2);
            qu9.d = qu9.d.j(g());
            g2b g2bVar = g2b.a;
        }
        r(qu9.d(d(), jG2 + 1, g()));
        return a97Var;
    }

    public final void v() {
        A(g());
        g2b g2bVar = g2b.a;
        if (this.m || this.c) {
            return;
        }
        long jG = g();
        synchronized (qu9.c) {
            long j = qu9.e;
            qu9.e = j + 1;
            s(j);
            qu9.d = qu9.d.j(g());
        }
        r(qu9.d(d(), jG + 1, g()));
    }

    /* JADX WARN: Code duplicated, block: B:102:0x014d A[EDGE_INSN: B:102:0x014d->B:77:0x014d BREAK  A[LOOP:4: B:66:0x011e->B:76:0x014a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0109 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x010b A[Catch: all -> 0x0100, LOOP:2: B:48:0x00d8->B:60:0x010b, LOOP_END, TryCatch #0 {all -> 0x0100, blocks: (B:43:0x00bc, B:45:0x00cc, B:48:0x00d8, B:50:0x00e4, B:52:0x00ee, B:54:0x00f4, B:57:0x0103, B:63:0x0114, B:66:0x011e, B:68:0x0128, B:70:0x0132, B:72:0x0138, B:73:0x0142, B:76:0x014a, B:77:0x014d, B:79:0x0151, B:81:0x0158, B:82:0x0164, B:60:0x010b), top: B:90:0x00bc }] */
    /* JADX WARN: Code duplicated, block: B:61:0x010e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0148 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x014a A[Catch: all -> 0x0100, LOOP:4: B:66:0x011e->B:76:0x014a, LOOP_END, TryCatch #0 {all -> 0x0100, blocks: (B:43:0x00bc, B:45:0x00cc, B:48:0x00d8, B:50:0x00e4, B:52:0x00ee, B:54:0x00f4, B:57:0x0103, B:63:0x0114, B:66:0x011e, B:68:0x0128, B:70:0x0132, B:72:0x0138, B:73:0x0142, B:76:0x014a, B:77:0x014d, B:79:0x0151, B:81:0x0158, B:82:0x0164, B:60:0x010b), top: B:90:0x00bc }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0112 A[EDGE_INSN: B:97:0x0112->B:62:0x0112 BREAK  A[LOOP:2: B:48:0x00d8->B:60:0x010b], SYNTHETIC] */
    public ju9 w() {
        HashMap mapB;
        List<? extends ci4<? super Set<? extends Object>, ? super hu9, g2b>> list;
        d37<m0a> d37Var;
        long j;
        long j2;
        d37<m0a> d37VarX = x();
        if (d37VarX != null) {
            long j3 = qu9.j.b;
            mapB = qu9.b(j3, this, qu9.d.e(j3));
        } else {
            mapB = null;
        }
        hf3 hf3Var = hf3.t;
        synchronized (qu9.c) {
            try {
                qu9.c(this);
                if (d37VarX == null || d37VarX.d == 0) {
                    b();
                    fn4 fn4Var = qu9.j;
                    d37<m0a> d37Var2 = fn4Var.h;
                    qu9.v(fn4Var, qu9.a);
                    if (d37Var2 == null || !d37Var2.h()) {
                        list = hf3Var;
                        d37Var = null;
                    } else {
                        list = qu9.h;
                        d37Var = d37Var2;
                    }
                } else {
                    fn4 fn4Var2 = qu9.j;
                    ju9 ju9VarZ = z(qu9.e, d37VarX, mapB, qu9.d.e(fn4Var2.b));
                    if (!xj5.a(ju9VarZ, ju9.b.a)) {
                        return ju9VarZ;
                    }
                    b();
                    d37Var = fn4Var2.h;
                    qu9.v(fn4Var2, qu9.a);
                    B(null);
                    fn4Var2.h = null;
                    list = qu9.h;
                }
                g2b g2bVar = g2b.a;
                this.m = true;
                if (d37Var != null) {
                    b49 b49Var = new b49(d37Var);
                    if (!d37Var.g()) {
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            list.get(i).invoke(b49Var, this);
                        }
                    }
                }
                if (d37VarX != null && d37VarX.h()) {
                    b49 b49Var2 = new b49(d37VarX);
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        list.get(i2).invoke(b49Var2, this);
                    }
                }
                synchronized (qu9.c) {
                    try {
                        p();
                        qu9.f();
                        if (d37Var != null) {
                            Object[] objArr = d37Var.b;
                            long[] jArr = d37Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i3 = 0;
                                j = 128;
                                while (true) {
                                    long j4 = jArr[i3];
                                    j2 = 255;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i3 != length) {
                                            break;
                                            break;
                                        }
                                        i3++;
                                    } else {
                                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                                        for (int i5 = 0; i5 < i4; i5++) {
                                            if ((j4 & 255) < 128) {
                                                qu9.q((m0a) objArr[(i3 << 3) + i5]);
                                            }
                                            j4 >>= 8;
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
                            } else {
                                j = 128;
                                j2 = 255;
                            }
                        } else {
                            j = 128;
                            j2 = 255;
                        }
                        if (d37VarX != null) {
                            Object[] objArr2 = d37VarX.b;
                            long[] jArr2 = d37VarX.a;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i6 = 0;
                                while (true) {
                                    long j5 = jArr2[i6];
                                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i6 != length2) {
                                            break;
                                            break;
                                        }
                                        i6++;
                                    } else {
                                        int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                        for (int i8 = 0; i8 < i7; i8++) {
                                            if ((j5 & j2) < j) {
                                                qu9.q((m0a) objArr2[(i6 << 3) + i8]);
                                            }
                                            j5 >>= 8;
                                        }
                                        if (i7 != 8) {
                                            break;
                                        }
                                        if (i6 != length2) {
                                            break;
                                        }
                                        i6++;
                                    }
                                }
                            }
                        }
                        ArrayList arrayList = this.i;
                        if (arrayList != null) {
                            int size3 = arrayList.size();
                            for (int i9 = 0; i9 < size3; i9++) {
                                qu9.q((m0a) arrayList.get(i9));
                            }
                        }
                        this.i = null;
                        g2b g2bVar2 = g2b.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return ju9.b.a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public d37<m0a> x() {
        return this.h;
    }

    @Override // defpackage.hu9
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public oh4<Object, g2b> e() {
        return this.e;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0171  */
    /* JADX WARN: Code duplicated, block: B:69:0x017b  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a9 A[LOOP:3: B:79:0x01a7->B:80:0x01a9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:88:0x018e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final ju9 z(long j, d37 d37Var, HashMap map, ou9 ou9Var) {
        ArrayList arrayList;
        ArrayList arrayListK;
        ArrayList arrayList2;
        int size;
        int i;
        ArrayList arrayList3;
        int size2;
        int i2;
        m0a m0aVar;
        o0a o0aVar;
        ou9 ou9Var2;
        Object[] objArr;
        long[] jArr;
        ou9 ou9Var3;
        Object[] objArr2;
        long[] jArr2;
        int i3;
        long j2;
        ArrayList arrayList4;
        o0a o0aVarF;
        ou9 ou9VarI = d().j(g()).i(this.j);
        Object[] objArr3 = d37Var.b;
        long[] jArr3 = d37Var.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i4 = 0;
            arrayList2 = null;
            arrayListK = null;
            while (true) {
                long j3 = jArr3[i4];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j3 & 255) < 128) {
                            objArr2 = objArr3;
                            m0a m0aVar2 = (m0a) objArr3[(i4 << 3) + i6];
                            jArr2 = jArr3;
                            o0a o0aVarD = m0aVar2.d();
                            i3 = i6;
                            ArrayList arrayList5 = arrayList2;
                            o0a o0aVarS = qu9.s(o0aVarD, j, ou9Var);
                            if (o0aVarS == null) {
                                arrayList4 = arrayListK;
                                j2 = j3;
                            } else {
                                arrayList4 = arrayListK;
                                j2 = j3;
                                o0a o0aVarS2 = qu9.s(o0aVarD, g(), ou9VarI);
                                if (o0aVarS2 != null && o0aVarS2.a != 1 && !o0aVarS.equals(o0aVarS2)) {
                                    ou9Var3 = ou9VarI;
                                    o0a o0aVarS3 = qu9.s(o0aVarD, g(), d());
                                    if (o0aVarS3 == null) {
                                        qu9.r();
                                        throw null;
                                    }
                                    if (map == null || (o0aVarF = (o0a) map.get(o0aVarS)) == null) {
                                        o0aVarF = m0aVar2.f(o0aVarS2, o0aVarS, o0aVarS3);
                                    }
                                    if (o0aVarF == null) {
                                        return new ju9.a(this);
                                    }
                                    if (!o0aVarF.equals(o0aVarS3)) {
                                        if (o0aVarF.equals(o0aVarS)) {
                                            ArrayList arrayList6 = arrayList5 == null ? new ArrayList() : arrayList5;
                                            arrayList6.add(new js7(m0aVar2, o0aVarS.c(g())));
                                            arrayListK = arrayList4 == null ? new ArrayList() : arrayList4;
                                            arrayListK.add(m0aVar2);
                                            arrayList2 = arrayList6;
                                        } else {
                                            arrayList2 = arrayList5 == null ? new ArrayList() : arrayList5;
                                            arrayList2.add(!o0aVarF.equals(o0aVarS2) ? new js7(m0aVar2, o0aVarF) : new js7(m0aVar2, o0aVarS2.c(g())));
                                        }
                                    }
                                    arrayListK = arrayList4;
                                }
                                arrayList2 = arrayList5;
                                arrayListK = arrayList4;
                            }
                            ou9Var3 = ou9VarI;
                            arrayList2 = arrayList5;
                            arrayListK = arrayList4;
                        } else {
                            ou9Var3 = ou9VarI;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i3 = i6;
                            j2 = j3;
                        }
                        j3 = j2 >> 8;
                        i6 = i3 + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        ou9VarI = ou9Var3;
                    }
                    ou9Var2 = ou9VarI;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i5 != 8) {
                        break;
                    }
                } else {
                    ou9Var2 = ou9VarI;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i4 != length) {
                    i4++;
                    jArr3 = jArr;
                    objArr3 = objArr;
                    ou9VarI = ou9Var2;
                } else {
                    arrayList = arrayList2;
                }
            }
            if (arrayList2 != null) {
                v();
                size2 = arrayList2.size();
                for (i2 = 0; i2 < size2; i2++) {
                    js7 js7Var = (js7) arrayList2.get(i2);
                    m0aVar = (m0a) js7Var.t;
                    o0aVar = (o0a) js7Var.u;
                    o0aVar.a = j;
                    synchronized (qu9.c) {
                        o0aVar.b = m0aVar.d();
                        m0aVar.q(o0aVar);
                        g2b g2bVar = g2b.a;
                    }
                }
            }
            if (arrayListK != null) {
                size = arrayListK.size();
                for (i = 0; i < size; i++) {
                    d37Var.l((m0a) arrayListK.get(i));
                }
                arrayList3 = this.i;
                if (arrayList3 != null) {
                    arrayListK = th1.K(arrayList3, arrayListK);
                }
                this.i = arrayListK;
            }
            return ju9.b.a;
        }
        arrayList = null;
        arrayListK = null;
        arrayList2 = arrayList;
        if (arrayList2 != null) {
            v();
            size2 = arrayList2.size();
            while (i2 < size2) {
                js7 js7Var2 = (js7) arrayList2.get(i2);
                m0aVar = (m0a) js7Var2.t;
                o0aVar = (o0a) js7Var2.u;
                o0aVar.a = j;
                synchronized (qu9.c) {
                    o0aVar.b = m0aVar.d();
                    m0aVar.q(o0aVar);
                    g2b g2bVar2 = g2b.a;
                }
            }
        }
        if (arrayListK != null) {
            size = arrayListK.size();
            while (i < size) {
                d37Var.l((m0a) arrayListK.get(i));
            }
            arrayList3 = this.i;
            if (arrayList3 != null) {
                arrayListK = th1.K(arrayList3, arrayListK);
            }
            this.i = arrayListK;
        }
        return ju9.b.a;
    }
}
