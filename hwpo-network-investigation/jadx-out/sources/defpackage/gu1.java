package defpackage;

import android.os.Trace;
import com.intercom.twig.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gu1 implements x02, qv8, yj8, nu7 {
    public final d37<xj8> A;
    public final d37<xj8> B;
    public final c37<Object, Object> C;
    public final i81 D;
    public final i81 E;
    public final c37<Object, Object> F;
    public c37<Object, Object> G;
    public boolean H;
    public yn9 I;
    public pu7 J;
    public gu1 K;
    public int L;
    public final ru1 M;
    public final hm8 N;
    public final bj4 O;
    public int P;
    public ci4<? super jt1, ? super Integer, g2b> Q;
    public final yt1 t;
    public final j1b u;
    public final AtomicReference<Object> v = new AtomicReference<>(null);
    public final Object w = new Object();
    public final e37 x;
    public final zr9 y;
    public final c37<Object, Object> z;

    public gu1(yt1 yt1Var, j1b j1bVar) {
        this.t = yt1Var;
        this.u = j1bVar;
        e37 e37Var = new e37(new d37((Object) null));
        this.x = e37Var;
        zr9 zr9Var = new zr9();
        if (yt1Var.e()) {
            zr9Var.H = new e27<>();
        }
        if (yt1Var.g()) {
            zr9Var.i1();
        }
        this.y = zr9Var;
        this.z = z39.b();
        this.A = new d37<>((Object) null);
        this.B = new d37<>((Object) null);
        this.C = z39.b();
        i81 i81Var = new i81();
        this.D = i81Var;
        i81 i81Var2 = new i81();
        this.E = i81Var2;
        this.F = z39.b();
        this.G = z39.b();
        ru1 ru1Var = new ru1(yt1Var);
        this.M = ru1Var;
        this.N = new hm8();
        bj4 bj4Var = new bj4(j1bVar, yt1Var, bs9.e(zr9Var), e37Var, i81Var, i81Var2, ru1Var, this);
        yt1Var.r(bj4Var);
        this.O = bj4Var;
        fr1 fr1Var = nr1.a;
    }

    @Override // defpackage.x02
    public final boolean A() {
        synchronized (this.w) {
            pu7 pu7Var = this.J;
            boolean z = false;
            if (pu7Var != null && (pu7Var.h.get() != ru7.x || pu7Var.i != e00.a())) {
                AtomicReference<ru7> atomicReference = pu7Var.h;
                ru7 ru7Var = ru7.y;
                ru7 ru7Var2 = ru7.w;
                while (!atomicReference.compareAndSet(ru7Var, ru7Var2) && atomicReference.get() == ru7Var) {
                }
                pu7Var.l.a.c(9);
                return false;
            }
            F();
            try {
                c37<Object, Object> c37Var = this.G;
                this.G = z39.b();
                try {
                    bj4 bj4Var = this.O;
                    yn9 yn9Var = this.I;
                    i81 i81Var = bj4Var.e;
                    if (!i81Var.x.isEmpty()) {
                        pt1.a("Expected applyChanges() to have been called");
                    }
                    if (c37Var.e > 0 || !bj4Var.s.isEmpty()) {
                        bj4Var.P = yn9Var;
                        try {
                            bj4Var.S(c37Var, null);
                            bj4Var.P = null;
                            z = !i81Var.isEmpty();
                        } catch (Throwable th) {
                            bj4Var.P = null;
                            throw th;
                        }
                    }
                    if (!z) {
                        G();
                    }
                    return z;
                } catch (Throwable th2) {
                    this.G = c37Var;
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    if (!this.x.t.g()) {
                        hm8 hm8Var = this.N;
                        try {
                            hm8Var.g(this.x, this.O.d0());
                            hm8Var.b();
                        } finally {
                            hm8Var.a();
                        }
                    }
                    throw th3;
                } catch (Throwable th4) {
                    x();
                    throw th4;
                }
            }
        }
    }

    @Override // defpackage.x02
    public final void B() {
        for (Object obj : this.y.z) {
            vj8 vj8Var = obj instanceof vj8 ? (vj8) obj : null;
            if (vj8Var != null) {
                vj8Var.invalidate();
            }
        }
    }

    public final void C() {
        long j;
        char c;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        int i2;
        long j4;
        char c2;
        long j5;
        long j6;
        int i3;
        boolean zG;
        int i4;
        int i5;
        c37<Object, Object> c37Var = this.C;
        long[] jArr3 = c37Var.a;
        int length = jArr3.length - 2;
        long j7 = 255;
        char c3 = 7;
        long j8 = -9187201950435737472L;
        int i6 = 8;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j9 = jArr3[i7];
                j3 = 128;
                if ((((~j9) << c3) & j9 & j8) != j8) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j9 & j7) < 128) {
                            j4 = j7;
                            int i10 = (i7 << 3) + i9;
                            Object obj = c37Var.b[i10];
                            Object obj2 = c37Var.c[i10];
                            c2 = c3;
                            boolean z = obj2 instanceof d37;
                            j5 = j8;
                            c37<Object, Object> c37Var2 = this.z;
                            if (z) {
                                d37 d37Var = (d37) obj2;
                                Object[] objArr = d37Var.b;
                                long[] jArr4 = d37Var.a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    int i11 = i6;
                                    j6 = j9;
                                    int i12 = 0;
                                    while (true) {
                                        long j10 = jArr4[i12];
                                        jArr2 = jArr3;
                                        i = length;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                            int i14 = 0;
                                            while (i14 < i13) {
                                                if ((j10 & j4) < 128) {
                                                    i4 = i14;
                                                    int i15 = (i12 << 3) + i4;
                                                    i5 = i9;
                                                    if (!c37Var2.b((ny2) objArr[i15])) {
                                                        d37Var.m(i15);
                                                    }
                                                } else {
                                                    i4 = i14;
                                                    i5 = i9;
                                                }
                                                j10 >>= i11;
                                                i14 = i4 + 1;
                                                i9 = i5;
                                            }
                                            i2 = i9;
                                            if (i13 != i11) {
                                                break;
                                            }
                                        } else {
                                            i2 = i9;
                                        }
                                        if (i12 == length2) {
                                            break;
                                        }
                                        i12++;
                                        jArr3 = jArr2;
                                        length = i;
                                        i9 = i2;
                                        i11 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i = length;
                                    i2 = i9;
                                    j6 = j9;
                                }
                                zG = d37Var.g();
                            } else {
                                jArr2 = jArr3;
                                i = length;
                                i2 = i9;
                                j6 = j9;
                                obj2.getClass();
                                zG = !c37Var2.b((ny2) obj2);
                            }
                            if (zG) {
                                c37Var.l(i10);
                            }
                            i3 = 8;
                        } else {
                            jArr2 = jArr3;
                            i = length;
                            i2 = i9;
                            j4 = j7;
                            c2 = c3;
                            j5 = j8;
                            j6 = j9;
                            i3 = i6;
                        }
                        j9 = j6 >> i3;
                        i9 = i2 + 1;
                        i6 = i3;
                        c3 = c2;
                        j7 = j4;
                        j8 = j5;
                        jArr3 = jArr2;
                        length = i;
                    }
                    jArr = jArr3;
                    int i16 = length;
                    j = j7;
                    c = c3;
                    j2 = j8;
                    if (i8 != i6) {
                        break;
                    } else {
                        length = i16;
                    }
                } else {
                    jArr = jArr3;
                    j = j7;
                    c = c3;
                    j2 = j8;
                }
                if (i7 == length) {
                    break;
                }
                i7++;
                c3 = c;
                j7 = j;
                j8 = j2;
                jArr3 = jArr;
                i6 = 8;
            }
        } else {
            j = 255;
            c = 7;
            j2 = -9187201950435737472L;
            j3 = 128;
        }
        d37<xj8> d37Var2 = this.B;
        if (!d37Var2.h()) {
            return;
        }
        Object[] objArr2 = d37Var2.b;
        long[] jArr5 = d37Var2.a;
        int length3 = jArr5.length - 2;
        if (length3 < 0) {
            return;
        }
        int i17 = 0;
        while (true) {
            long j11 = jArr5[i17];
            if ((((~j11) << c) & j11 & j2) != j2) {
                int i18 = 8 - ((~(i17 - length3)) >>> 31);
                for (int i19 = 0; i19 < i18; i19++) {
                    if ((j11 & j) < j3) {
                        int i20 = (i17 << 3) + i19;
                        if (((xj8) objArr2[i20]).g == null) {
                            d37Var2.m(i20);
                        }
                    }
                    j11 >>= 8;
                }
                if (i18 != 8) {
                    return;
                }
            }
            if (i17 == length3) {
                return;
            } else {
                i17++;
            }
        }
    }

    public final boolean D() {
        boolean z;
        synchronized (this.w) {
            z = true;
            if (this.P != 1) {
                z = false;
            }
            if (z) {
                this.P = 0;
            }
        }
        return z;
    }

    public final pu7 E(ci4 ci4Var, boolean z) {
        if (this.J != null) {
            c78.b("A pausable composition is in progress");
        }
        pu7 pu7Var = new pu7(this, this.t, this.O, this.x, ci4Var, z, this.u, this.w);
        this.J = pu7Var;
        return pu7Var;
    }

    public final void F() {
        Object obj = hu1.t;
        AtomicReference<Object> atomicReference = this.v;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                pt1.b("pending composition has not been applied");
                fl.a();
                return;
            }
            if (andSet instanceof Set) {
                u((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                pt1.b("corrupt pendingModifications drain: " + atomicReference);
                fl.a();
                return;
            }
            for (Set<? extends Object> set : (Set[]) andSet) {
                u(set, true);
            }
        }
    }

    public final void G() {
        AtomicReference<Object> atomicReference = this.v;
        Object andSet = atomicReference.getAndSet(null);
        if (xj5.a(andSet, hu1.t)) {
            return;
        }
        if (andSet instanceof Set) {
            u((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set<? extends Object> set : (Set[]) andSet) {
                u(set, false);
            }
            return;
        }
        if (andSet == null) {
            if (this.J == null) {
                pt1.a("calling recordModificationsOf and applyChanges concurrently is not supported");
            }
        } else {
            pt1.b("corrupt pendingModifications drain: " + atomicReference);
            fl.a();
        }
    }

    public final void H() {
        of3 of3Var = of3.t;
        AtomicReference<Object> atomicReference = this.v;
        Object andSet = atomicReference.getAndSet(of3Var);
        if (xj5.a(andSet, hu1.t) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            u((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            pt1.b("corrupt pendingModifications drain: " + atomicReference);
            fl.a();
            return;
        }
        for (Set<? extends Object> set : (Set[]) andSet) {
            u(set, false);
        }
    }

    public final void I() {
        String str;
        int i = this.P;
        if (i != 0) {
            if (i == 1) {
                str = "The composition should be activated before setting content.";
            } else if (i != 2) {
                str = i != 3 ? BuildConfig.FLAVOR : "The composition is disposed";
            } else {
                str = "A previous pausable composition for this composition was cancelled. This composition must be disposed.";
            }
            c78.b(str);
        }
        if (this.J == null) {
            return;
        }
        c78.b("A pausable composition is in progress");
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00bf A[Catch: all -> 0x0042, LOOP:0: B:48:0x0088->B:60:0x00bf, LOOP_END, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x0009, B:6:0x000e, B:8:0x0016, B:10:0x001d, B:14:0x0027, B:16:0x0031, B:13:0x0022, B:25:0x0047, B:27:0x004d, B:32:0x0058, B:36:0x005e, B:37:0x0066, B:40:0x006c, B:41:0x0072, B:43:0x0078, B:45:0x007c, B:48:0x0088, B:50:0x0098, B:52:0x00a4, B:54:0x00ad, B:57:0x00b7, B:60:0x00bf, B:61:0x00c2, B:64:0x00c7), top: B:77:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00c7 A[Catch: all -> 0x0042, EDGE_INSN: B:64:0x00c7->B:65:0x00cc BREAK  A[LOOP:0: B:48:0x0088->B:60:0x00bf], TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x0009, B:6:0x000e, B:8:0x0016, B:10:0x001d, B:14:0x0027, B:16:0x0031, B:13:0x0022, B:25:0x0047, B:27:0x004d, B:32:0x0058, B:36:0x005e, B:37:0x0066, B:40:0x006c, B:41:0x0072, B:43:0x0078, B:45:0x007c, B:48:0x0088, B:50:0x0098, B:52:0x00a4, B:54:0x00ad, B:57:0x00b7, B:60:0x00bf, B:61:0x00c2, B:64:0x00c7), top: B:77:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x00c7 A[SYNTHETIC] */
    public final lk5 J(xj8 xj8Var, vi4 vi4Var, Object obj) {
        synchronized (this.w) {
            try {
                gu1 gu1Var = this.K;
                gu1 gu1Var2 = null;
                if (gu1Var != null) {
                    zr9 zr9Var = this.y;
                    int i = this.L;
                    if (zr9Var.D) {
                        pt1.a("Writer is active");
                    }
                    if (i < 0 || i >= zr9Var.y) {
                        pt1.a("Invalid group index");
                    }
                    vi4 vi4VarD = od3.d(vi4Var);
                    if (zr9Var.n1(vi4VarD)) {
                        int iA = bs9.a(zr9Var.x, i) + i;
                        int i2 = vi4VarD.a;
                        if (i > i2 || i2 >= iA) {
                            gu1Var = null;
                        }
                    } else {
                        gu1Var = null;
                    }
                    gu1Var2 = gu1Var;
                }
                if (gu1Var2 == null) {
                    bj4 bj4Var = this.O;
                    if (bj4Var.F && bj4Var.z0(xj8Var, obj)) {
                        return lk5.w;
                    }
                    if (obj != null) {
                        boolean z = obj instanceof ny2;
                        c37<Object, Object> c37Var = this.G;
                        if (z) {
                            Object objD = c37Var.d(xj8Var);
                            if (objD == null) {
                                j59.a(this.G, xj8Var, obj);
                                break;
                            }
                            if (objD instanceof d37) {
                                d37 d37Var = (d37) objD;
                                Object[] objArr = d37Var.b;
                                long[] jArr = d37Var.a;
                                int length = jArr.length - 2;
                                if (length < 0) {
                                    j59.a(this.G, xj8Var, obj);
                                    break;
                                }
                                int i3 = 0;
                                loop0: while (true) {
                                    long j = jArr[i3];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                                        for (int i5 = 0; i5 < i4; i5++) {
                                            if ((255 & j) < 128 && objArr[(i3 << 3) + i5] == zh7.a) {
                                                break loop0;
                                            }
                                            j >>= 8;
                                        }
                                        if (i4 == 8) {
                                            if (i3 == length) {
                                                i3++;
                                            }
                                        }
                                        j59.a(this.G, xj8Var, obj);
                                        break;
                                    }
                                    if (i3 == length) {
                                        j59.a(this.G, xj8Var, obj);
                                        break;
                                    }
                                    i3++;
                                }
                            } else {
                                if (objD != zh7.a) {
                                    j59.a(this.G, xj8Var, obj);
                                    break;
                                }
                            }
                        } else {
                            c37Var.m(xj8Var, zh7.a);
                        }
                    } else {
                        this.G.m(xj8Var, zh7.a);
                    }
                }
                if (gu1Var2 != null) {
                    return gu1Var2.J(xj8Var, vi4Var, obj);
                }
                this.t.m(this);
                return this.O.F ? lk5.v : lk5.u;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void K(Object obj) {
        Object objD = this.z.d(obj);
        if (objD == null) {
            return;
        }
        boolean z = objD instanceof d37;
        lk5 lk5Var = lk5.w;
        c37<Object, Object> c37Var = this.F;
        if (!z) {
            xj8 xj8Var = (xj8) objD;
            if (xj8Var.b(obj) == lk5Var) {
                j59.a(c37Var, obj, xj8Var);
                return;
            }
            return;
        }
        d37 d37Var = (d37) objD;
        Object[] objArr = d37Var.b;
        long[] jArr = d37Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        xj8 xj8Var2 = (xj8) objArr[(i << 3) + i3];
                        if (xj8Var2.b(obj) == lk5Var) {
                            j59.a(c37Var, obj, xj8Var2);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ca A[LOOP:0: B:30:0x0078->B:45:0x00ca, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ce A[EDGE_INSN: B:52:0x00ce->B:46:0x00ce BREAK  A[LOOP:0: B:30:0x0078->B:45:0x00ca], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x001d  */
    @Override // defpackage.x02, defpackage.yj8
    public final void a(Object obj) {
        xj8 xj8VarB0;
        int i;
        boolean z;
        bj4 bj4Var = this.O;
        if (bj4Var.A <= 0 && (xj8VarB0 = bj4Var.b0()) != null) {
            int i2 = xj8VarB0.b | 1;
            xj8VarB0.b = i2;
            if ((i2 & 32) == 0) {
                s27<Object> s27Var = xj8VarB0.f;
                if (s27Var == null) {
                    s27Var = new s27<>((Object) null);
                    xj8VarB0.f = s27Var;
                }
                int i3 = xj8VarB0.e;
                int iC = s27Var.c(obj);
                if (iC < 0) {
                    iC = ~iC;
                    i = -1;
                } else {
                    i = s27Var.c[iC];
                }
                s27Var.b[iC] = obj;
                s27Var.c[iC] = i3;
                if (i == xj8VarB0.e) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            this.M.a();
            if (z) {
                return;
            }
            if (obj instanceof n0a) {
                ((n0a) obj).y(1);
            }
            j59.a(this.z, obj, xj8VarB0);
            if (obj instanceof ny2) {
                ny2<?> ny2Var = (ny2) obj;
                my2.a aVarX = ny2Var.x();
                c37<Object, Object> c37Var = this.C;
                j59.c(c37Var, obj);
                s27 s27Var2 = aVarX.e;
                Object[] objArr = s27Var2.b;
                long[] jArr = s27Var2.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j = jArr[i4];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i4 != length) {
                                break;
                                break;
                            }
                            i4++;
                        } else {
                            int i5 = 8;
                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                            int i7 = 0;
                            while (i7 < i6) {
                                if ((j & 255) < 128) {
                                    m0a m0aVar = (m0a) objArr[(i4 << 3) + i7];
                                    if (m0aVar instanceof n0a) {
                                        ((n0a) m0aVar).y(1);
                                    }
                                    j59.a(c37Var, m0aVar, obj);
                                }
                                j >>= i5;
                                i7++;
                                i5 = i5;
                            }
                            if (i6 != i5) {
                                break;
                            } else if (i4 != length) {
                                break;
                            } else {
                                i4++;
                            }
                        }
                    }
                }
                Object obj2 = aVarX.f;
                c37<ny2<?>, Object> c37Var2 = xj8VarB0.g;
                if (c37Var2 == null) {
                    c37Var2 = new c37<>((Object) null);
                    xj8VarB0.g = c37Var2;
                }
                c37Var2.m(ny2Var, obj2);
            }
        }
    }

    @Override // defpackage.x02
    public final void b(ci4<? super jt1, ? super Integer, g2b> ci4Var) {
        try {
            synchronized (this.w) {
                F();
                c37<Object, Object> c37Var = this.G;
                this.G = z39.b();
                try {
                    bj4 bj4Var = this.O;
                    yn9 yn9Var = this.I;
                    if (!bj4Var.e.x.isEmpty()) {
                        pt1.a("Expected applyChanges() to have been called");
                    }
                    bj4Var.P = yn9Var;
                    try {
                        bj4Var.S(c37Var, ci4Var);
                        bj4Var.P = null;
                        g2b g2bVar = g2b.a;
                    } catch (Throwable th) {
                        bj4Var.P = null;
                        throw th;
                    }
                } catch (Throwable th2) {
                    this.G = c37Var;
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                if (!this.x.t.g()) {
                    hm8 hm8Var = this.N;
                    try {
                        hm8Var.g(this.x, this.O.d0());
                        hm8Var.b();
                    } finally {
                        hm8Var.a();
                    }
                }
                throw th3;
            } catch (Throwable th4) {
                x();
                throw th4;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.x02
    public final void c(b49 b49Var) {
        Object obj;
        while (true) {
            Object obj2 = this.v.get();
            if (obj2 == null || obj2.equals(hu1.t)) {
                obj = b49Var;
            } else if (obj2 instanceof Set) {
                obj = new Set[]{obj2, b49Var};
            } else {
                if (!(obj2 instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.v).toString());
                }
                Set[] setArr = (Set[]) obj2;
                int length = setArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(setArr, length + 1);
                objArrCopyOf[length] = b49Var;
                obj = objArrCopyOf;
            }
            AtomicReference<Object> atomicReference = this.v;
            do {
                if (atomicReference.compareAndSet(obj2, obj)) {
                    if (obj2 == null) {
                        synchronized (this.w) {
                            G();
                            g2b g2bVar = g2b.a;
                        }
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == obj2);
        }
    }

    @Override // defpackage.x02
    public final <R> R d(x02 x02Var, int i, mh4<? extends R> mh4Var) {
        if (x02Var == null || x02Var.equals(this) || i < 0) {
            return mh4Var.invoke();
        }
        this.K = (gu1) x02Var;
        this.L = i;
        try {
            return mh4Var.invoke();
        } finally {
            this.K = null;
            this.L = 0;
        }
    }

    @Override // defpackage.qv8
    public final void deactivate() {
        synchronized (this.w) {
            try {
                if (this.J != null) {
                    c78.b("Deactivate is not supported while pausable composition is in progress");
                }
                boolean z = this.y.y == 0;
                if (!z || !this.x.t.g()) {
                    Trace.beginSection("Compose:deactivate");
                    try {
                        hm8 hm8Var = this.N;
                        try {
                            hm8Var.g(this.x, this.O.d0());
                            if (!z) {
                                zr9 zr9Var = this.y;
                                hm8 hm8Var2 = this.N;
                                cs9 cs9VarM1 = zr9Var.m1();
                                try {
                                    cs9VarM1.n(cs9VarM1.t, new ej4(hm8Var2, cs9VarM1));
                                    g2b g2bVar = g2b.a;
                                    cs9VarM1.e(true);
                                    this.u.j();
                                    hm8Var.c();
                                } catch (Throwable th) {
                                    cs9VarM1.e(false);
                                    throw th;
                                }
                            }
                            hm8Var.b();
                            hm8Var.a();
                            g2b g2bVar2 = g2b.a;
                            Trace.endSection();
                        } catch (Throwable th2) {
                            hm8Var.a();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
                this.z.g();
                this.C.g();
                this.G.g();
                this.D.clear();
                this.E.clear();
                bj4 bj4Var = this.O;
                bj4Var.E.clear();
                bj4Var.s.clear();
                bj4Var.e.clear();
                bj4Var.v = null;
                this.P = 1;
                g2b g2bVar3 = g2b.a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // defpackage.xt1
    public final void dispose() {
        synchronized (this.w) {
            try {
                if (this.O.F) {
                    c78.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.P != 3) {
                    this.P = 3;
                    this.Q = nr1.b;
                    i81 i81Var = this.O.L;
                    if (i81Var != null) {
                        v(i81Var);
                    }
                    boolean z = this.y.y == 0;
                    if (!z || !this.x.t.g()) {
                        hm8 hm8Var = this.N;
                        try {
                            hm8Var.g(this.x, this.O.d0());
                            if (!z) {
                                zr9 zr9Var = this.y;
                                hm8 hm8Var2 = this.N;
                                cs9 cs9VarM1 = zr9Var.m1();
                                try {
                                    cs9VarM1.n(cs9VarM1.t, new ot1(hm8Var2));
                                    cs9VarM1.J();
                                    g2b g2bVar = g2b.a;
                                    cs9VarM1.e(true);
                                    this.u.k();
                                    this.u.j();
                                    hm8Var.c();
                                } catch (Throwable th) {
                                    cs9VarM1.e(false);
                                    throw th;
                                }
                            }
                            hm8Var.b();
                            hm8Var.a();
                        } catch (Throwable th2) {
                            hm8Var.a();
                            throw th2;
                        }
                    }
                    bj4 bj4Var = this.O;
                    bj4Var.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        bj4Var.b.w(bj4Var);
                        bj4Var.E.clear();
                        bj4Var.s.clear();
                        bj4Var.e.clear();
                        bj4Var.v = null;
                        bj4Var.a.k();
                        g2b g2bVar2 = g2b.a;
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
                g2b g2bVar3 = g2b.a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.t.x(this);
    }

    @Override // defpackage.x02
    public final yn9 e(yn9 yn9Var) {
        yn9 yn9Var2 = this.I;
        this.I = yn9Var;
        return yn9Var2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x005b A[LOOP:0: B:7:0x001c->B:21:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x007b A[SYNTHETIC] */
    @Override // defpackage.x02
    public final boolean f(Set<? extends Object> set) {
        boolean z = set instanceof b49;
        c37<Object, Object> c37Var = this.C;
        c37<Object, Object> c37Var2 = this.z;
        if (z) {
            d37 d37Var = ((b49) set).t;
            Object[] objArr = d37Var.b;
            long[] jArr = d37Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                loop0: while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                Object obj = objArr[(i << 3) + i3];
                                if (c37Var2.b(obj) || c37Var.b(obj)) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 == 8) {
                            if (i != length) {
                                i++;
                            }
                        }
                    } else if (i != length) {
                        i++;
                    }
                }
                return true;
            }
        } else {
            for (Object obj2 : set) {
                if (c37Var2.b(obj2) || c37Var.b(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.x02
    public final void g(ArrayList arrayList) {
        e37 e37Var = this.x;
        bj4 bj4Var = this.O;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!xj5.a(((mz6) ((js7) arrayList.get(i)).t).c, this)) {
                pt1.a("Check failed");
                break;
            }
        }
        try {
            bj4Var.getClass();
            Trace.beginSection("Compose:insertMovableContent");
            try {
                try {
                    bj4Var.e0(arrayList);
                    bj4Var.O();
                    g2b g2bVar = g2b.a;
                    Trace.endSection();
                } catch (Throwable th) {
                    bj4Var.N();
                    throw th;
                }
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                if (!e37Var.t.g()) {
                    hm8 hm8Var = this.N;
                    try {
                        hm8Var.g(e37Var, bj4Var.d0());
                        hm8Var.b();
                    } finally {
                        hm8Var.a();
                    }
                }
                throw th3;
            } catch (Throwable th4) {
                x();
                throw th4;
            }
        }
    }

    @Override // defpackage.yj8
    public final void h() {
        this.H = true;
        this.M.a();
    }

    @Override // defpackage.nu7
    public final pu7 i(ci4 ci4Var) {
        D();
        I();
        return E(ci4Var, true);
    }

    @Override // defpackage.x02
    public final void j() {
        synchronized (this.w) {
            try {
                if (!this.E.isEmpty()) {
                    v(this.E);
                }
                g2b g2bVar = g2b.a;
            } catch (Throwable th) {
                try {
                    if (!this.x.t.g()) {
                        hm8 hm8Var = this.N;
                        try {
                            hm8Var.g(this.x, this.O.d0());
                            hm8Var.b();
                        } finally {
                            hm8Var.a();
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    x();
                    throw th2;
                }
            }
        }
    }

    @Override // defpackage.xt1
    public final boolean k() {
        return this.P == 3;
    }

    @Override // defpackage.xt1
    public final void l(ci4<? super jt1, ? super Integer, g2b> ci4Var) {
        boolean zD = D();
        I();
        yt1 yt1Var = this.t;
        if (!zD) {
            this.Q = ci4Var;
            yt1Var.a(this, ci4Var);
            return;
        }
        bj4 bj4Var = this.O;
        bj4Var.M();
        this.Q = ci4Var;
        yt1Var.a(this, ci4Var);
        bj4Var.L();
    }

    @Override // defpackage.x02
    public final void m() {
        synchronized (this.w) {
            try {
                v(this.D);
                G();
                g2b g2bVar = g2b.a;
            } catch (Throwable th) {
                try {
                    if (!this.x.t.g()) {
                        hm8 hm8Var = this.N;
                        try {
                            hm8Var.g(this.x, this.O.d0());
                            hm8Var.b();
                        } finally {
                            hm8Var.a();
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    x();
                    throw th2;
                }
            }
        }
    }

    @Override // defpackage.x02
    public final boolean n() {
        return this.O.F;
    }

    @Override // defpackage.x02
    public final void o(fk8 fk8Var) {
        bj4 bj4Var = this.O;
        if (bj4Var.F) {
            pt1.a("Preparing a composition while composing is not supported");
        }
        bj4Var.F = true;
        try {
            fk8Var.invoke();
        } finally {
            bj4Var.F = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[Catch: all -> 0x004f, LOOP:0: B:11:0x001f->B:23:0x0059, LOOP_END, TryCatch #0 {all -> 0x004f, blocks: (B:4:0x0003, B:6:0x000e, B:8:0x0012, B:11:0x001f, B:13:0x002f, B:15:0x003b, B:17:0x0044, B:20:0x0051, B:23:0x0059, B:24:0x005c, B:25:0x0061), top: B:30:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0061 A[EDGE_INSN: B:33:0x0061->B:25:0x0061 BREAK  A[LOOP:0: B:11:0x001f->B:23:0x0059], SYNTHETIC] */
    @Override // defpackage.x02
    public final void p(Object obj) {
        synchronized (this.w) {
            try {
                K(obj);
                Object objD = this.C.d(obj);
                if (objD != null) {
                    if (objD instanceof d37) {
                        d37 d37Var = (d37) objD;
                        Object[] objArr = d37Var.b;
                        long[] jArr = d37Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                    if (i != length) {
                                        break;
                                        break;
                                    }
                                    i++;
                                } else {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        if ((255 & j) < 128) {
                                            K((ny2) objArr[(i << 3) + i3]);
                                        }
                                        j >>= 8;
                                    }
                                    if (i2 != 8) {
                                        break;
                                    } else if (i != length) {
                                        break;
                                    } else {
                                        i++;
                                    }
                                }
                            }
                        }
                    } else {
                        K((ny2) objD);
                    }
                }
                g2b g2bVar = g2b.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.x02
    public final void q(lz6 lz6Var) {
        hm8 hm8Var = this.N;
        try {
            hm8Var.g(this.x, this.O.d0());
            cs9 cs9VarM1 = lz6Var.a.m1();
            try {
                cs9VarM1.n(cs9VarM1.t, new ot1(hm8Var));
                cs9VarM1.J();
                g2b g2bVar = g2b.a;
                cs9VarM1.e(true);
                hm8Var.c();
                hm8Var.a();
            } catch (Throwable th) {
                cs9VarM1.e(false);
                throw th;
            }
        } catch (Throwable th2) {
            hm8Var.a();
            throw th2;
        }
    }

    @Override // defpackage.yj8
    public final lk5 r(xj8 xj8Var, Object obj) {
        gu1 gu1Var;
        int i = xj8Var.b;
        if ((i & 2) != 0) {
            xj8Var.b = i | 4;
        }
        vi4 vi4Var = xj8Var.c;
        if (vi4Var == null || !vi4Var.a()) {
            return lk5.t;
        }
        zr9 zr9Var = this.y;
        zr9Var.getClass();
        vi4 vi4Var2 = xj8Var.c;
        if (vi4Var2 != null && zr9Var.n1(od3.d(vi4Var2))) {
            if (xj8Var.d == null) {
                return lk5.t;
            }
            lk5 lk5VarJ = J(xj8Var, vi4Var, obj);
            if (lk5VarJ != lk5.t) {
                this.M.a();
            }
            return lk5VarJ;
        }
        synchronized (this.w) {
            gu1Var = this.K;
        }
        if (gu1Var != null) {
            bj4 bj4Var = gu1Var.O;
            if (bj4Var.F && bj4Var.z0(xj8Var, obj)) {
                return lk5.w;
            }
        }
        return lk5.t;
    }

    @Override // defpackage.xt1
    public final boolean s() {
        boolean z;
        synchronized (this.w) {
            z = this.G.e > 0;
        }
        return z;
    }

    public final void t(Object obj, boolean z) {
        Object objD = this.z.d(obj);
        if (objD == null) {
            return;
        }
        boolean z2 = objD instanceof d37;
        lk5 lk5Var = lk5.t;
        d37<xj8> d37Var = this.A;
        d37<xj8> d37Var2 = this.B;
        c37<Object, Object> c37Var = this.F;
        if (!z2) {
            xj8 xj8Var = (xj8) objD;
            if (j59.b(c37Var, obj, xj8Var) || xj8Var.b(obj) == lk5Var) {
                return;
            }
            if (xj8Var.g == null || z) {
                d37Var.a(xj8Var);
                return;
            } else {
                d37Var2.a(xj8Var);
                return;
            }
        }
        d37 d37Var3 = (d37) objD;
        Object[] objArr = d37Var3.b;
        long[] jArr = d37Var3.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        xj8 xj8Var2 = (xj8) objArr[(i << 3) + i3];
                        if (!j59.b(c37Var, obj, xj8Var2) && xj8Var2.b(obj) != lk5Var) {
                            if (xj8Var2.g == null || z) {
                                d37Var.a(xj8Var2);
                            } else {
                                d37Var2.a(xj8Var2);
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:217:0x0196 A[EDGE_INSN: B:217:0x0196->B:77:0x0196 BREAK  A[LOOP:13: B:64:0x015a->B:75:0x018e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:74:0x018c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x018e A[LOOP:13: B:64:0x015a->B:75:0x018e, LOOP_END] */
    public final void u(Set<? extends Object> set, boolean z) {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        boolean zC;
        long[] jArr3;
        long j5;
        long[] jArr4;
        long[] jArr5;
        long j6;
        boolean zG;
        long[] jArr6;
        long j7;
        long[] jArr7;
        long[] jArr8;
        char c2;
        long j8;
        int i;
        int i2;
        boolean z2 = set instanceof b49;
        c37<Object, Object> c37Var = this.C;
        Object obj = null;
        int i3 = 8;
        if (z2) {
            d37 d37Var = ((b49) set).t;
            Object[] objArr = d37Var.b;
            long[] jArr9 = d37Var.a;
            int length = jArr9.length - 2;
            if (length >= 0) {
                int i4 = 0;
                j = 128;
                j2 = 255;
                while (true) {
                    long j9 = jArr9[i4];
                    char c3 = 7;
                    j3 = -9187201950435737472L;
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j9 & 255) < 128) {
                                Object obj2 = objArr[(i4 << 3) + i6];
                                c2 = c3;
                                if (obj2 instanceof xj8) {
                                    ((xj8) obj2).b(obj);
                                    jArr8 = jArr9;
                                    j8 = j9;
                                    i = length;
                                } else {
                                    t(obj2, z);
                                    Object objD = c37Var.d(obj2);
                                    if (objD == null) {
                                        jArr8 = jArr9;
                                        j8 = j9;
                                        i = length;
                                    } else if (objD instanceof d37) {
                                        d37 d37Var2 = (d37) objD;
                                        Object[] objArr2 = d37Var2.b;
                                        long[] jArr10 = d37Var2.a;
                                        int length2 = jArr10.length - 2;
                                        if (length2 >= 0) {
                                            int i7 = i3;
                                            i = length;
                                            int i8 = 0;
                                            while (true) {
                                                long j10 = jArr10[i8];
                                                j8 = j9;
                                                long[] jArr11 = jArr10;
                                                if ((((~j10) << c2) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                                    int i10 = 0;
                                                    while (i10 < i9) {
                                                        if ((j10 & 255) < 128) {
                                                            t((ny2) objArr2[(i8 << 3) + i10], z);
                                                        }
                                                        j10 >>= i7;
                                                        i10++;
                                                        jArr9 = jArr9;
                                                    }
                                                    jArr8 = jArr9;
                                                    if (i9 != i7) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr8 = jArr9;
                                                }
                                                if (i8 == length2) {
                                                    break;
                                                }
                                                i8++;
                                                jArr10 = jArr11;
                                                j9 = j8;
                                                jArr9 = jArr8;
                                                i7 = 8;
                                            }
                                        } else {
                                            jArr8 = jArr9;
                                            j8 = j9;
                                            i = length;
                                        }
                                    } else {
                                        jArr8 = jArr9;
                                        j8 = j9;
                                        i = length;
                                        t((ny2) objD, z);
                                    }
                                    g2b g2bVar = g2b.a;
                                }
                                i2 = 8;
                            } else {
                                jArr8 = jArr9;
                                c2 = c3;
                                j8 = j9;
                                i = length;
                                i2 = i3;
                            }
                            j9 = j8 >> i2;
                            i6++;
                            length = i;
                            i3 = i2;
                            c3 = c2;
                            jArr9 = jArr8;
                            obj = null;
                        }
                        jArr7 = jArr9;
                        c = c3;
                        int i11 = length;
                        if (i5 != i3) {
                            break;
                        } else {
                            length = i11;
                        }
                    } else {
                        jArr7 = jArr9;
                        c = 7;
                    }
                    if (i4 == length) {
                        break;
                    }
                    i4++;
                    jArr9 = jArr7;
                    obj = null;
                    i3 = 8;
                }
            } else {
                j = 128;
                j2 = 255;
                j3 = -9187201950435737472L;
                c = 7;
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof xj8) {
                    ((xj8) obj3).b(null);
                } else {
                    t(obj3, z);
                    Object objD2 = c37Var.d(obj3);
                    if (objD2 != null) {
                        if (objD2 instanceof d37) {
                            d37 d37Var3 = (d37) objD2;
                            Object[] objArr3 = d37Var3.b;
                            long[] jArr12 = d37Var3.a;
                            int length3 = jArr12.length - 2;
                            if (length3 >= 0) {
                                int i12 = 0;
                                while (true) {
                                    long j11 = jArr12[i12];
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i12 != length3) {
                                            break;
                                            break;
                                        }
                                        i12++;
                                    } else {
                                        int i13 = 8 - ((~(i12 - length3)) >>> 31);
                                        for (int i14 = 0; i14 < i13; i14++) {
                                            if ((j11 & 255) < 128) {
                                                t((ny2) objArr3[(i12 << 3) + i14], z);
                                            }
                                            j11 >>= 8;
                                        }
                                        if (i13 != 8) {
                                            break;
                                        } else if (i12 != length3) {
                                            break;
                                        } else {
                                            i12++;
                                        }
                                    }
                                }
                            }
                        } else {
                            t((ny2) objD2, z);
                        }
                    }
                    g2b g2bVar2 = g2b.a;
                }
            }
        }
        c37<Object, Object> c37Var2 = this.z;
        d37<xj8> d37Var4 = this.A;
        if (z) {
            d37<xj8> d37Var5 = this.B;
            if (d37Var5.h()) {
                long[] jArr13 = c37Var2.a;
                int length4 = jArr13.length - 2;
                if (length4 >= 0) {
                    int i15 = 0;
                    while (true) {
                        long j12 = jArr13[i15];
                        if ((((~j12) << c) & j12 & j3) != j3) {
                            int i16 = 8 - ((~(i15 - length4)) >>> 31);
                            int i17 = 0;
                            while (i17 < i16) {
                                if ((j12 & j2) < j) {
                                    int i18 = (i15 << 3) + i17;
                                    Object obj4 = c37Var2.b[i18];
                                    Object obj5 = c37Var2.c[i18];
                                    if (obj5 instanceof d37) {
                                        d37 d37Var6 = (d37) obj5;
                                        Object[] objArr4 = d37Var6.b;
                                        long[] jArr14 = d37Var6.a;
                                        int length5 = jArr14.length - 2;
                                        if (length5 >= 0) {
                                            j6 = j12;
                                            int i19 = 0;
                                            while (true) {
                                                long j13 = jArr14[i19];
                                                Object[] objArr5 = objArr4;
                                                long[] jArr15 = jArr14;
                                                if ((((~j13) << c) & j13 & j3) != j3) {
                                                    int i20 = 8 - ((~(i19 - length5)) >>> 31);
                                                    int i21 = 0;
                                                    while (i21 < i20) {
                                                        if ((j13 & j2) < j) {
                                                            jArr6 = jArr13;
                                                            int i22 = (i19 << 3) + i21;
                                                            j7 = j13;
                                                            xj8 xj8Var = (xj8) objArr5[i22];
                                                            if (d37Var5.c(xj8Var) || d37Var4.c(xj8Var)) {
                                                                d37Var6.m(i22);
                                                            }
                                                        } else {
                                                            jArr6 = jArr13;
                                                            j7 = j13;
                                                        }
                                                        j13 = j7 >> 8;
                                                        i21++;
                                                        jArr13 = jArr6;
                                                    }
                                                    jArr5 = jArr13;
                                                    if (i20 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr5 = jArr13;
                                                }
                                                if (i19 == length5) {
                                                    break;
                                                }
                                                i19++;
                                                objArr4 = objArr5;
                                                jArr14 = jArr15;
                                                jArr13 = jArr5;
                                            }
                                        } else {
                                            jArr5 = jArr13;
                                            j6 = j12;
                                        }
                                        zG = d37Var6.g();
                                    } else {
                                        jArr5 = jArr13;
                                        j6 = j12;
                                        obj5.getClass();
                                        xj8 xj8Var2 = (xj8) obj5;
                                        zG = d37Var5.c(xj8Var2) || d37Var4.c(xj8Var2);
                                    }
                                    if (zG) {
                                        c37Var2.l(i18);
                                    }
                                } else {
                                    jArr5 = jArr13;
                                    j6 = j12;
                                }
                                j12 = j6 >> 8;
                                i17++;
                                jArr13 = jArr5;
                            }
                            jArr4 = jArr13;
                            if (i16 != 8) {
                                break;
                            }
                        } else {
                            jArr4 = jArr13;
                        }
                        if (i15 == length4) {
                            break;
                        }
                        i15++;
                        jArr13 = jArr4;
                    }
                }
                d37Var5.b();
                C();
                return;
            }
        }
        if (d37Var4.h()) {
            long[] jArr16 = c37Var2.a;
            int length6 = jArr16.length - 2;
            if (length6 >= 0) {
                int i23 = 0;
                while (true) {
                    long j14 = jArr16[i23];
                    if ((((~j14) << c) & j14 & j3) != j3) {
                        int i24 = 8 - ((~(i23 - length6)) >>> 31);
                        int i25 = 0;
                        while (i25 < i24) {
                            if ((j14 & j2) < j) {
                                int i26 = (i23 << 3) + i25;
                                Object obj6 = c37Var2.b[i26];
                                Object obj7 = c37Var2.c[i26];
                                if (obj7 instanceof d37) {
                                    d37 d37Var7 = (d37) obj7;
                                    Object[] objArr6 = d37Var7.b;
                                    long[] jArr17 = d37Var7.a;
                                    int length7 = jArr17.length - 2;
                                    if (length7 >= 0) {
                                        j4 = j14;
                                        int i27 = 0;
                                        while (true) {
                                            long j15 = jArr17[i27];
                                            Object[] objArr7 = objArr6;
                                            long[] jArr18 = jArr17;
                                            if ((((~j15) << c) & j15 & j3) != j3) {
                                                int i28 = 8 - ((~(i27 - length7)) >>> 31);
                                                int i29 = 0;
                                                while (i29 < i28) {
                                                    if ((j15 & j2) < j) {
                                                        jArr3 = jArr16;
                                                        int i30 = (i27 << 3) + i29;
                                                        j5 = j15;
                                                        if (d37Var4.c((xj8) objArr7[i30])) {
                                                            d37Var7.m(i30);
                                                        }
                                                    } else {
                                                        jArr3 = jArr16;
                                                        j5 = j15;
                                                    }
                                                    j15 = j5 >> 8;
                                                    i29++;
                                                    jArr16 = jArr3;
                                                }
                                                jArr2 = jArr16;
                                                if (i28 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr16;
                                            }
                                            if (i27 == length7) {
                                                break;
                                            }
                                            i27++;
                                            objArr6 = objArr7;
                                            jArr17 = jArr18;
                                            jArr16 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr16;
                                        j4 = j14;
                                    }
                                    zC = d37Var7.g();
                                } else {
                                    jArr2 = jArr16;
                                    j4 = j14;
                                    obj7.getClass();
                                    zC = d37Var4.c((xj8) obj7);
                                }
                                if (zC) {
                                    c37Var2.l(i26);
                                }
                            } else {
                                jArr2 = jArr16;
                                j4 = j14;
                            }
                            j14 = j4 >> 8;
                            i25++;
                            jArr16 = jArr2;
                        }
                        jArr = jArr16;
                        if (i24 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr16;
                    }
                    if (i23 == length6) {
                        break;
                    }
                    i23++;
                    jArr16 = jArr;
                }
            }
            C();
            d37Var4.b();
        }
    }

    /* JADX WARN: Code duplicated, block: B:164:0x013c A[EDGE_INSN: B:164:0x013c->B:82:0x013c BREAK  A[LOOP:2: B:141:0x00ef->B:80:0x0132], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0130 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x0132 A[Catch: all -> 0x0122, LOOP:2: B:141:0x00ef->B:80:0x0132, LOOP_END, TryCatch #1 {all -> 0x0122, blocks: (B:64:0x00ef, B:66:0x00fe, B:68:0x0108, B:70:0x010e, B:72:0x011e, B:76:0x0127, B:82:0x013c, B:90:0x015e, B:93:0x0171, B:80:0x0132, B:85:0x0146, B:99:0x018f, B:101:0x019b), top: B:141:0x00ef }] */
    public final void v(i81 i81Var) throws Throwable {
        p20<?> p20Var;
        hm8 hm8Var;
        hm8 hm8Var2;
        long[] jArr;
        int i;
        long[] jArr2;
        hm8 hm8Var3;
        long j;
        char c;
        long j2;
        int i2;
        boolean zG;
        long j3;
        i81 i81Var2 = this.E;
        bj4 bj4Var = this.O;
        du1 du1VarD0 = bj4Var.d0();
        hm8 hm8Var4 = this.N;
        hm8Var4.g(this.x, du1VarD0);
        try {
            if (i81Var.x.isEmpty()) {
                try {
                    if (i81Var2.x.isEmpty() && this.J == null) {
                        hm8Var4.b();
                    }
                    return;
                } finally {
                    hm8Var4.a();
                }
            }
            pu7 pu7Var = this.J;
            if (pu7Var == null || (p20Var = pu7Var.l) == null) {
                p20Var = this.u;
            }
            try {
                Trace.beginSection(p20Var.equals(pu7Var != null ? pu7Var.l : null) ? "Compose:recordChanges" : "Compose:applyChanges");
                try {
                    pu7 pu7Var2 = this.J;
                    if (pu7Var2 == null || (hm8Var = pu7Var2.k) == null) {
                        hm8Var = hm8Var4;
                    }
                    zr9 zr9Var = this.y;
                    du1 du1VarD1 = bj4Var.d0();
                    cs9 cs9VarM1 = bs9.e(zr9Var).m1();
                    int i3 = 0;
                    try {
                        i81Var.h1(p20Var, cs9VarM1, hm8Var, du1VarD1);
                        g2b g2bVar = g2b.a;
                        cs9VarM1.e(true);
                        p20Var.j();
                        Trace.endSection();
                        hm8Var4.c();
                        hm8Var4.d();
                        if (this.H) {
                            Trace.beginSection("Compose:unobserve");
                            try {
                                this.H = false;
                                c37<Object, Object> c37Var = this.z;
                                long[] jArr3 = c37Var.a;
                                int length = jArr3.length - 2;
                                if (length >= 0) {
                                    int i4 = 0;
                                    while (true) {
                                        long j4 = jArr3[i4];
                                        char c2 = 7;
                                        long j5 = -9187201950435737472L;
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i5 = 8;
                                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                                            int i7 = i3;
                                            while (i7 < i6) {
                                                if ((j4 & 255) < 128) {
                                                    c = c2;
                                                    int i8 = (i4 << 3) + i7;
                                                    j2 = j5;
                                                    Object obj = c37Var.b[i8];
                                                    Object obj2 = c37Var.c[i8];
                                                    if (obj2 instanceof d37) {
                                                        d37 d37Var = (d37) obj2;
                                                        Object[] objArr = d37Var.b;
                                                        long[] jArr4 = d37Var.a;
                                                        int i9 = i5;
                                                        int length2 = jArr4.length - 2;
                                                        i = i7;
                                                        jArr2 = jArr3;
                                                        hm8Var3 = hm8Var4;
                                                        if (length2 >= 0) {
                                                            int i10 = 0;
                                                            while (true) {
                                                                try {
                                                                    long j6 = jArr4[i10];
                                                                    j = j4;
                                                                    long[] jArr5 = jArr4;
                                                                    if ((((~j6) << c) & j6 & j2) == j2) {
                                                                        if (i10 != length2) {
                                                                            break;
                                                                            break;
                                                                        }
                                                                        i10++;
                                                                        jArr4 = jArr5;
                                                                        j4 = j;
                                                                        i9 = 8;
                                                                    } else {
                                                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                                                        for (int i12 = 0; i12 < i11; i12++) {
                                                                            if ((j6 & 255) < 128) {
                                                                                j3 = j6;
                                                                                int i13 = (i10 << 3) + i12;
                                                                                if (!((xj8) objArr[i13]).a()) {
                                                                                    d37Var.m(i13);
                                                                                }
                                                                            } else {
                                                                                j3 = j6;
                                                                            }
                                                                            j6 = j3 >> i9;
                                                                        }
                                                                        if (i11 != i9) {
                                                                            break;
                                                                        }
                                                                        if (i10 != length2) {
                                                                            break;
                                                                        }
                                                                        i10++;
                                                                        jArr4 = jArr5;
                                                                        j4 = j;
                                                                        i9 = 8;
                                                                    }
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    Trace.endSection();
                                                                    throw th;
                                                                }
                                                            }
                                                        } else {
                                                            j = j4;
                                                        }
                                                        zG = d37Var.g();
                                                    } else {
                                                        i = i7;
                                                        jArr2 = jArr3;
                                                        hm8Var3 = hm8Var4;
                                                        j = j4;
                                                        obj2.getClass();
                                                        zG = !((xj8) obj2).a();
                                                    }
                                                    if (zG) {
                                                        c37Var.l(i8);
                                                    }
                                                    i2 = 8;
                                                } else {
                                                    i = i7;
                                                    jArr2 = jArr3;
                                                    hm8Var3 = hm8Var4;
                                                    j = j4;
                                                    c = c2;
                                                    j2 = j5;
                                                    i2 = i5;
                                                }
                                                j4 = j >> i2;
                                                i7 = i + 1;
                                                i5 = i2;
                                                c2 = c;
                                                j5 = j2;
                                                hm8Var4 = hm8Var3;
                                                jArr3 = jArr2;
                                            }
                                            jArr = jArr3;
                                            hm8Var2 = hm8Var4;
                                            if (i6 != i5) {
                                                break;
                                            }
                                        } else {
                                            jArr = jArr3;
                                            hm8Var2 = hm8Var4;
                                        }
                                        if (i4 == length) {
                                            break;
                                        }
                                        i4++;
                                        hm8Var4 = hm8Var2;
                                        jArr3 = jArr;
                                        i3 = 0;
                                    }
                                } else {
                                    hm8Var2 = hm8Var4;
                                }
                                C();
                                g2b g2bVar2 = g2b.a;
                                Trace.endSection();
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else {
                            hm8Var2 = hm8Var4;
                        }
                        try {
                            if (i81Var2.x.isEmpty() && this.J == null) {
                                hm8Var2.b();
                            }
                            return;
                        } finally {
                            hm8Var2.a();
                        }
                    } catch (Throwable th3) {
                        try {
                            cs9VarM1.e(false);
                            throw th3;
                        } catch (Throwable th4) {
                            th = th4;
                            Trace.endSection();
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            th = th7;
        }
        try {
            if (i81Var2.x.isEmpty() && this.J == null) {
                hm8Var4.b();
            }
            throw th;
        } finally {
            hm8Var4.a();
        }
    }

    @Override // defpackage.nu7
    public final pu7 w(ci4 ci4Var) {
        return E(ci4Var, D());
    }

    @Override // defpackage.x02
    public final void x() {
        this.v.set(null);
        this.D.clear();
        this.E.clear();
        e37 e37Var = this.x;
        if (e37Var.t.g()) {
            return;
        }
        hm8 hm8Var = this.N;
        try {
            hm8Var.g(e37Var, this.O.d0());
            hm8Var.b();
        } finally {
            hm8Var.a();
        }
    }

    @Override // defpackage.x02
    public final void y() {
        synchronized (this.w) {
            try {
                this.O.v = null;
                if (!this.x.t.g()) {
                    hm8 hm8Var = this.N;
                    try {
                        hm8Var.g(this.x, this.O.d0());
                        hm8Var.b();
                        hm8Var.a();
                    } catch (Throwable th) {
                        hm8Var.a();
                        throw th;
                    }
                }
                g2b g2bVar = g2b.a;
            } catch (Throwable th2) {
                try {
                    if (!this.x.t.g()) {
                        hm8 hm8Var2 = this.N;
                        try {
                            hm8Var2.g(this.x, this.O.d0());
                            hm8Var2.b();
                        } finally {
                            hm8Var2.a();
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    x();
                    throw th3;
                }
            }
        }
    }

    @Override // defpackage.qv8
    public final void z(ci4<? super jt1, ? super Integer, g2b> ci4Var) {
        D();
        I();
        bj4 bj4Var = this.O;
        bj4Var.M();
        this.Q = ci4Var;
        this.t.a(this, ci4Var);
        bj4Var.L();
    }
}
