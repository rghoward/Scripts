package defpackage;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fj1 extends m0 {
    public final n27<el5> f0;
    public final n27<a> g0;
    public a58 h0;
    public dz9 i0;
    public dz9 j0;
    public boolean k0;
    public boolean l0;
    public long m0;
    public boolean n0;
    public jb5 o0;
    public dz9 p0;
    public dz9 q0;
    public boolean r0;
    public boolean s0;
    public long t0;
    public boolean u0;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    public fj1() {
        throw null;
    }

    public fj1(mh4 mh4Var, boolean z, h27 h27Var, boolean z2) {
        super(h27Var, null, false, z2, null, null, mh4Var);
        int i = ne6.a;
        this.f0 = new n27<>(6);
        this.g0 = new n27<>(6);
        this.m0 = -1L;
        this.t0 = -1L;
    }

    @Override // ox6.c
    public final void W1() {
        v2();
    }

    @Override // defpackage.nb5
    public final void X0() {
        s2(true);
    }

    @Override // defpackage.m0, defpackage.nb5
    public final void b0(to toVar, s48 s48Var) {
        ArrayList arrayList = toVar.a;
        super.b0(toVar, s48Var);
        int i = 0;
        if (s48Var != s48.u) {
            if (s48Var != s48.v || this.o0 == null || this.s0) {
                return;
            }
            int size = arrayList.size();
            while (i < size) {
                jb5 jb5Var = (jb5) arrayList.get(i);
                if (jb5Var.i && jb5Var != this.o0) {
                    s2(true);
                    return;
                }
                i++;
            }
            return;
        }
        if (this.o0 == null) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (lb5.d((jb5) arrayList.get(i2))) {
                    jb5 jb5Var2 = (jb5) arrayList.get(0);
                    jb5Var2.i = true;
                    this.o0 = jb5Var2;
                    if (this.O) {
                        dz9 dz9Var = this.q0;
                        if (dz9Var != null && dz9Var.h()) {
                            ((lgb) ku1.a(this, qu1.t)).getClass();
                            if (jb5Var2.b - this.t0 < 40) {
                                this.u0 = true;
                                return;
                            }
                            this.r0 = true;
                            dz9 dz9Var2 = this.q0;
                            if (dz9Var2 != null) {
                                dz9Var2.k(null);
                            }
                            this.q0 = null;
                        }
                        this.s0 = false;
                        l2(jb5Var2);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (this.s0) {
            int size3 = arrayList.size();
            for (int i3 = 0; i3 < size3; i3++) {
                jb5 jb5Var3 = (jb5) arrayList.get(i3);
                if (!jb5Var3.h || jb5Var3.d) {
                    int size4 = arrayList.size();
                    while (i < size4) {
                        ((jb5) arrayList.get(i)).i = true;
                        i++;
                    }
                    return;
                }
            }
            jb5 jb5Var4 = (jb5) arrayList.get(0);
            jb5Var4.i = true;
            long j = jb5Var4.b;
            jb5 jb5Var5 = this.o0;
            jb5Var5.getClass();
            t2(j, jb5Var5);
            return;
        }
        int size5 = arrayList.size();
        for (int i4 = 0; i4 < size5; i4++) {
            jb5 jb5Var6 = (jb5) arrayList.get(i4);
            if (jb5Var6.i || !jb5Var6.h || jb5Var6.d) {
                float f = ((lgb) ku1.a(this, qu1.t)).f();
                int size6 = arrayList.size();
                for (int i5 = 0; i5 < size6; i5++) {
                    jb5 jb5Var7 = (jb5) arrayList.get(i5);
                    long j2 = jb5Var7.c;
                    jb5 jb5Var8 = this.o0;
                    jb5Var8.getClass();
                    boolean z = Math.abs(vf7.c(vf7.d(j2, jb5Var8.c))) > f;
                    if (jb5Var7.i || z) {
                        s2(true);
                        return;
                    }
                }
                return;
            }
        }
        jb5 jb5Var9 = (jb5) arrayList.get(0);
        jb5Var9.i = true;
        long j3 = jb5Var9.b;
        jb5 jb5Var10 = this.o0;
        jb5Var10.getClass();
        t2(j3, jb5Var10);
    }

    @Override // defpackage.m0, defpackage.g58
    public final void c0(r48 r48Var, s48 s48Var, long j) {
        super.c0(r48Var, s48Var, j);
        if (s48Var != s48.u) {
            if (s48Var != s48.v || this.h0 == null || this.l0) {
                return;
            }
            List<a58> list = r48Var.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                a58 a58Var = list.get(i);
                if (a58Var.b() && a58Var != this.h0) {
                    s2(false);
                    return;
                }
            }
            return;
        }
        if (this.h0 == null) {
            if (o8a.e(r48Var, true)) {
                a58 a58Var2 = r48Var.a.get(0);
                a58Var2.a();
                this.h0 = a58Var2;
                if (this.O) {
                    dz9 dz9Var = this.j0;
                    if (dz9Var != null && dz9Var.h()) {
                        ((lgb) ku1.a(this, qu1.t)).getClass();
                        if (a58Var2.b - this.m0 < 40) {
                            this.n0 = true;
                            return;
                        }
                        this.k0 = true;
                        dz9 dz9Var2 = this.j0;
                        if (dz9Var2 != null) {
                            dz9Var2.k(null);
                        }
                        this.j0 = null;
                    }
                    this.l0 = false;
                    m2(a58Var2);
                    return;
                }
                return;
            }
            return;
        }
        int i2 = r48Var.c;
        List<a58> list2 = r48Var.a;
        if (this.l0) {
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                if (!z69.g(list2.get(i3))) {
                    int size3 = list2.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        list2.get(i4).a();
                    }
                    return;
                }
            }
            a58 a58Var3 = list2.get(0);
            a58Var3.a();
            long j2 = a58Var3.b;
            a58 a58Var4 = this.h0;
            a58Var4.getClass();
            u2(j2, a58Var4);
            return;
        }
        int size4 = list2.size();
        for (int i5 = 0; i5 < size4; i5++) {
            if (!z69.f(list2.get(i5))) {
                long jI2 = i2(j);
                int size5 = list2.size();
                for (int i6 = 0; i6 < size5; i6++) {
                    a58 a58Var5 = list2.get(i6);
                    if (a58Var5.b() || z69.i(a58Var5, j, jI2)) {
                        s2(false);
                        return;
                    }
                }
                return;
            }
        }
        a58 a58Var6 = list2.get(0);
        a58Var6.a();
        long j3 = a58Var6.b;
        a58 a58Var7 = this.h0;
        a58Var7.getClass();
        u2(j3, a58Var7);
    }

    @Override // defpackage.m0
    public final v6a g2() {
        return null;
    }

    @Override // defpackage.m0
    public final void o2() {
        v2();
    }

    @Override // defpackage.m0
    public final boolean p2(KeyEvent keyEvent) {
        if (((a) this.g0.d(db7.a(keyEvent))) == null) {
            return false;
        }
        throw null;
    }

    @Override // defpackage.m0
    public final void q2(KeyEvent keyEvent) {
        long jA = db7.a(keyEvent);
        n27<el5> n27Var = this.f0;
        boolean z = false;
        if (n27Var.d(jA) != null) {
            el5 el5Var = (el5) n27Var.d(jA);
            if (el5Var != null) {
                if (el5Var.h()) {
                    el5Var.k(null);
                } else {
                    z = true;
                }
            }
            n27Var.f(jA);
        }
        if (z) {
            return;
        }
        this.P.invoke();
    }

    public final void s2(boolean z) {
        if (z) {
            this.o0 = null;
            dz9 dz9Var = this.p0;
            if (dz9Var != null) {
                dz9Var.k(null);
            }
            this.p0 = null;
            dz9 dz9Var2 = this.q0;
            if (dz9Var2 != null) {
                dz9Var2.k(null);
            }
            this.q0 = null;
            this.r0 = false;
            this.s0 = false;
            this.t0 = -1L;
            this.u0 = false;
        } else {
            this.h0 = null;
            dz9 dz9Var3 = this.i0;
            if (dz9Var3 != null) {
                dz9Var3.k(null);
            }
            this.i0 = null;
            dz9 dz9Var4 = this.j0;
            if (dz9Var4 != null) {
                dz9Var4.k(null);
            }
            this.j0 = null;
            this.k0 = false;
            this.l0 = false;
            this.m0 = -1L;
            this.n0 = false;
        }
        j2(z);
    }

    @Override // defpackage.m0, defpackage.g58
    public final void t0() {
        super.t0();
        s2(false);
    }

    public final void t2(long j, jb5 jb5Var) {
        if (this.O && !this.u0) {
            k2(jb5Var.c, true);
            this.t0 = j;
            if (!this.s0 && !this.r0) {
                this.P.invoke();
            }
        }
        this.o0 = null;
        this.u0 = false;
        this.r0 = false;
        dz9 dz9Var = this.p0;
        if (dz9Var != null) {
            dz9Var.k(null);
        }
        this.p0 = null;
        this.s0 = false;
    }

    public final void u2(long j, a58 a58Var) {
        if (this.O && !this.n0) {
            k2(a58Var.c, false);
            this.m0 = j;
            if (!this.l0 && !this.k0) {
                this.P.invoke();
            }
        }
        this.h0 = null;
        this.n0 = false;
        this.k0 = false;
        dz9 dz9Var = this.i0;
        if (dz9Var != null) {
            dz9Var.k(null);
        }
        this.i0 = null;
        this.l0 = false;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x009f A[LOOP:2: B:24:0x0071->B:35:0x009f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x00a2 A[EDGE_INSN: B:44:0x00a2->B:36:0x00a2 BREAK  A[LOOP:2: B:24:0x0071->B:35:0x009f], SYNTHETIC] */
    public final void v2() {
        char c;
        long j;
        long j2;
        n27<el5> n27Var = this.f0;
        Object[] objArr = n27Var.c;
        long[] jArr = n27Var.a;
        int length = jArr.length - 2;
        char c2 = 7;
        if (length >= 0) {
            int i = 0;
            j = 128;
            while (true) {
                long j3 = jArr[i];
                j2 = 255;
                if ((((~j3) << c2) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    int i3 = 0;
                    while (i3 < i2) {
                        if ((j3 & 255) < 128) {
                            ((el5) objArr[(i << 3) + i3]).k(null);
                        }
                        j3 >>= 8;
                        i3++;
                        c2 = c2;
                    }
                    c = c2;
                    if (i2 != 8) {
                        break;
                    }
                } else {
                    c = c2;
                }
                if (i == length) {
                    break;
                }
                i++;
                c2 = c;
            }
        } else {
            c = 7;
            j = 128;
            j2 = 255;
        }
        n27Var.a();
        n27<a> n27Var2 = this.g0;
        Object[] objArr2 = n27Var2.c;
        long[] jArr2 = n27Var2.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i4 = 0;
            while (true) {
                long j4 = jArr2[i4];
                if ((((~j4) << c) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i4 != length2) {
                        break;
                        break;
                    }
                    i4++;
                } else {
                    int i5 = 8 - ((~(i4 - length2)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((j4 & j2) < j) {
                            ((a) objArr2[(i4 << 3) + i6]).getClass();
                            throw null;
                        }
                        j4 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    } else if (i4 != length2) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
        }
        n27Var2.a();
    }

    @Override // defpackage.m0
    public final void f2(hc9 hc9Var) {
    }
}
