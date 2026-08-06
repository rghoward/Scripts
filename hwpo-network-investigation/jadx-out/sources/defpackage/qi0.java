package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qi0 extends ox6.c implements lr5, a73, qb9, g58, sx6, gt7, nq5, bn4, q84, o94, s94, nn7, my0 {
    public ox6.b H;
    public boolean I;
    public pi0 J;
    public HashSet<px6<?>> K;
    public qq5 L;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends wp5 implements mh4<g2b> {
        public a() {
            super(0);
        }

        @Override // defpackage.mh4
        public final g2b invoke() {
            qi0.this.e2();
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements mn7.a {
        public b() {
        }

        @Override // mn7.a
        public final void b() {
            qi0 qi0Var = qi0.this;
            if (qi0Var.L == null) {
                qi0Var.F(ew2.d(qi0Var, 4194304));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c extends wp5 implements mh4<g2b> {
        public c() {
            super(0);
        }

        @Override // defpackage.mh4
        public final g2b invoke() {
            ox6.b bVar = qi0.this.H;
            bVar.getClass();
            ((qx6) bVar).V();
            return g2b.a;
        }
    }

    @Override // defpackage.a73
    public final void C0() {
        this.I = true;
        b73.a(this);
    }

    @Override // defpackage.g58
    public final void D0() {
        ox6.b bVar = this.H;
        bVar.getClass();
        ((f58) bVar).U().getClass();
    }

    @Override // defpackage.qb9
    public final void E1(hc9 hc9Var) {
        ox6.b bVar = this.H;
        bVar.getClass();
        lb9 lb9VarR = ((ob9) bVar).r();
        hc9Var.getClass();
        lb9 lb9Var = (lb9) hc9Var;
        c37<gc9<?>, Object> c37Var = lb9Var.t;
        if (lb9VarR.v) {
            lb9Var.v = true;
        }
        if (lb9VarR.w) {
            lb9Var.w = true;
        }
        c37<gc9<?>, Object> c37Var2 = lb9VarR.t;
        Object[] objArr = c37Var2.b;
        Object[] objArr2 = c37Var2.c;
        long[] jArr = c37Var2.a;
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
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        gc9<?> gc9Var = (gc9) obj;
                        if (!c37Var.a(gc9Var)) {
                            c37Var.m(gc9Var, obj2);
                        } else if (obj2 instanceof k3) {
                            Object objD = c37Var.d(gc9Var);
                            objD.getClass();
                            k3 k3Var = (k3) objD;
                            String str = k3Var.a;
                            if (str == null) {
                                str = ((k3) obj2).a;
                            }
                            di4 di4Var = k3Var.b;
                            if (di4Var == null) {
                                di4Var = ((k3) obj2).b;
                            }
                            c37Var.m(gc9Var, new k3(str, di4Var));
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

    @Override // defpackage.nq5
    public final void F(qq5 qq5Var) {
        this.L = qq5Var;
        ox6.b bVar = this.H;
        if (bVar instanceof th7) {
            ((th7) bVar).w();
        }
    }

    @Override // defpackage.sx6
    public final ln4 M0() {
        pi0 pi0Var = this.J;
        return pi0Var != null ? pi0Var : jf3.x;
    }

    @Override // defpackage.bn4
    public final void Q0(mb7 mb7Var) {
        ox6.b bVar = this.H;
        bVar.getClass();
        ((nh7) bVar).s0();
    }

    @Override // ox6.c
    public final void U1() {
        c2(true);
    }

    @Override // defpackage.nn7
    public final boolean V() {
        return this.G;
    }

    @Override // ox6.c
    public final void V1() {
        d2();
    }

    @Override // defpackage.gt7
    public final Object Z(tx2 tx2Var, Object obj) {
        ox6.b bVar = this.H;
        bVar.getClass();
        return ((ft7) bVar).h0();
    }

    @Override // defpackage.my0
    public final long c() {
        return c43.c(ew2.d(this, 128).v);
    }

    @Override // defpackage.g58
    public final void c0(r48 r48Var, s48 s48Var, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        ox6.b bVar = this.H;
        bVar.getClass();
        j58.b bVarU = ((f58) bVar).U();
        j58 j58Var = j58.this;
        List<a58> list = r48Var.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            }
            a58 a58Var = list.get(i);
            if (z69.e(a58Var) || z69.g(a58Var)) {
                z = false;
                break;
            }
            i++;
        }
        if (!z) {
            z2 = false;
            break;
        }
        int size2 = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size2) {
                z2 = true;
                break;
            } else {
                if (list.get(i2).b()) {
                    z2 = false;
                    break;
                }
                i2++;
            }
        }
        if (j58Var.v) {
            z3 = true;
            break;
        }
        int size3 = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size3) {
                if (!z2) {
                    z3 = false;
                    break;
                }
                break;
            } else {
                a58 a58Var2 = list.get(i3);
                if (!z69.e(a58Var2) && !z69.g(a58Var2)) {
                    i3++;
                }
            }
            z3 = true;
            break;
        }
        j58.a aVar = bVarU.b;
        j58.a aVar2 = j58.a.v;
        s48 s48Var2 = s48.v;
        if (aVar != aVar2) {
            if (s48Var == s48.t && z3) {
                bVarU.c = r48Var;
                bVarU.u(r48Var, !z || j58Var.v);
            }
            if (s48Var == s48.u && z && r48Var == bVarU.c && j58Var.v) {
                int size4 = list.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    list.get(i4).a();
                }
            }
            if (s48Var == s48Var2 && !z3 && r48Var != bVarU.c) {
                bVarU.u(r48Var, true);
            }
        }
        if (s48Var == s48Var2) {
            int size5 = list.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size5) {
                    bVarU.b = j58.a.t;
                    j58Var.v = false;
                    bVarU.c = null;
                    break;
                } else if (!z69.g(list.get(i5))) {
                    break;
                } else {
                    i5++;
                }
            }
            if (r48Var == bVarU.c && z) {
                int size6 = list.size();
                for (int i6 = 0; i6 < size6; i6++) {
                    if (list.get(i6).b()) {
                        if (j58Var.v) {
                            break;
                        }
                        bVarU.v(r48Var);
                        return;
                    }
                }
                int size7 = list.size();
                for (int i7 = 0; i7 < size7; i7++) {
                    list.get(i7).a();
                }
            }
        }
    }

    public final void c2(boolean z) {
        if (!this.G) {
            uc5.b("initializeModifier called on unattached node");
        }
        ox6.b bVar = this.H;
        if ((this.v & 32) != 0) {
            if (bVar instanceof qx6) {
                ew2.g(this).m(new a());
            }
            if (bVar instanceof tx6) {
                tx6 tx6Var = (tx6) bVar;
                pi0 pi0Var = this.J;
                if (pi0Var == null || !pi0Var.A0(tx6Var.getKey())) {
                    this.J = new pi0(16);
                    if (si0.a(this)) {
                        rx6 modifierLocalManager = ew2.g(this).getModifierLocalManager();
                        if8 key = tx6Var.getKey();
                        modifierLocalManager.b.d(this);
                        modifierLocalManager.c.d(key);
                        modifierLocalManager.a();
                    }
                } else {
                    rx6 modifierLocalManager2 = ew2.g(this).getModifierLocalManager();
                    if8 key2 = tx6Var.getKey();
                    modifierLocalManager2.b.d(this);
                    modifierLocalManager2.c.d(key2);
                    modifierLocalManager2.a();
                }
            }
        }
        if ((this.v & 4) != 0) {
            if (bVar instanceof u63) {
                this.I = true;
            }
            if (!z) {
                ew2.d(this, 2).E1();
            }
        }
        if ((this.v & 2) != 0) {
            if (si0.a(this)) {
                mb7 mb7Var = this.A;
                mb7Var.getClass();
                ((mr5) mb7Var).g2(this);
                ln7 ln7Var = mb7Var.g0;
                if (ln7Var != null) {
                    ln7Var.invalidate();
                }
            }
            if (!z) {
                ew2.d(this, 2).E1();
                ew2.f(this).Q();
            }
        }
        if (bVar instanceof gm8) {
            ((gm8) bVar).E(ew2.f(this));
        }
        if ((this.v & 128) != 0 && (bVar instanceof yh7) && si0.a(this)) {
            ew2.f(this).Q();
        }
        if ((4194304 & this.v) != 0 && (bVar instanceof th7)) {
            this.L = null;
            if (si0.a(this)) {
                ew2.g(this).i(new b());
            }
        }
        if ((this.v & 256) != 0 && (bVar instanceof nh7) && si0.a(this)) {
            ew2.f(this).Q();
        }
        if (bVar instanceof r94) {
            ((r94) bVar).T().a.d(this);
        }
        if ((this.v & 16) != 0 && (bVar instanceof f58)) {
            ((f58) bVar).U().a = this.A;
        }
        if ((this.v & 8) != 0) {
            ew2.g(this).A();
        }
    }

    public final void d2() {
        if (!this.G) {
            uc5.b("unInitializeModifier called on unattached node");
        }
        ox6.b bVar = this.H;
        if ((this.v & 32) != 0) {
            if (bVar instanceof tx6) {
                rx6 modifierLocalManager = ew2.g(this).getModifierLocalManager();
                if8 key = ((tx6) bVar).getKey();
                modifierLocalManager.d.d(ew2.f(this));
                modifierLocalManager.e.d(key);
                modifierLocalManager.a();
            }
            if (bVar instanceof qx6) {
                ((qx6) bVar).V();
            }
        }
        if ((this.v & 8) != 0) {
            ew2.g(this).A();
        }
        if (bVar instanceof r94) {
            ((r94) bVar).T().a.n(this);
        }
    }

    @Override // defpackage.lr5
    public final gl6 e(hl6 hl6Var, cl6 cl6Var, long j) {
        ox6.b bVar = this.H;
        bVar.getClass();
        return ((ir5) bVar).e(hl6Var, cl6Var, j);
    }

    public final void e2() {
        if (this.G) {
            this.K.clear();
            un7 snapshotObserver = ew2.g(this).getSnapshotObserver();
            snapshotObserver.a.d(this, si0.c.u, new c());
        }
    }

    @Override // defpackage.lr5
    public final int f(df6 df6Var, pj5 pj5Var, int i) {
        ox6.b bVar = this.H;
        bVar.getClass();
        return ((ir5) bVar).f(df6Var, pj5Var, i);
    }

    @Override // defpackage.nq5, defpackage.ml6
    public final void g(long j) {
        ox6.b bVar = this.H;
        if (bVar instanceof yh7) {
            ((yh7) bVar).k0();
        }
    }

    @Override // defpackage.my0
    public final tx2 getDensity() {
        return ew2.f(this).R;
    }

    @Override // defpackage.my0
    public final tq5 getLayoutDirection() {
        return ew2.f(this).S;
    }

    @Override // defpackage.lr5
    public final int j(df6 df6Var, pj5 pj5Var, int i) {
        ox6.b bVar = this.H;
        bVar.getClass();
        return ((ir5) bVar).j(df6Var, pj5Var, i);
    }

    @Override // defpackage.o94
    public final void k0(k94 k94Var) {
        ox6.b bVar = this.H;
        if (!(bVar instanceof e94)) {
            uc5.b("applyFocusProperties called on wrong node");
        }
        ((e94) bVar).v0();
    }

    @Override // defpackage.dw2
    public final void l() {
        if (this.H instanceof f58) {
            t0();
        }
    }

    @Override // defpackage.q84
    public final void m0(w94 w94Var) {
        ox6.b bVar = this.H;
        if (!(bVar instanceof o84)) {
            uc5.b("onFocusEvent called on wrong node");
        }
        ((o84) bVar).b0();
    }

    @Override // defpackage.a73
    public final void t(tr5 tr5Var) {
        ox6.b bVar = this.H;
        bVar.getClass();
        y63 y63Var = (y63) bVar;
        if (this.I && (bVar instanceof u63)) {
            ox6.b bVar2 = this.H;
            if (bVar2 instanceof u63) {
                un7 snapshotObserver = ew2.g(this).getSnapshotObserver();
                snapshotObserver.a.d(this, si0.b.u, new ri0(bVar2, this));
            }
            this.I = false;
        }
        y63Var.t(tr5Var);
    }

    @Override // defpackage.g58
    public final void t0() {
        ox6.b bVar = this.H;
        bVar.getClass();
        j58.b bVarU = ((f58) bVar).U();
        j58 j58Var = j58.this;
        if (bVarU.b == j58.a.u) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            motionEventObtain.setSource(0);
            ((k58) j58Var.a()).invoke(motionEventObtain);
            g2b g2bVar = g2b.a;
            motionEventObtain.recycle();
            bVarU.b = j58.a.t;
            j58Var.v = false;
            bVarU.c = null;
        }
    }

    public final String toString() {
        return this.H.toString();
    }

    @Override // defpackage.lr5
    public final int v(df6 df6Var, pj5 pj5Var, int i) {
        ox6.b bVar = this.H;
        bVar.getClass();
        return ((ir5) bVar).v(df6Var, pj5Var, i);
    }

    @Override // defpackage.g58
    public final boolean v1() {
        ox6.b bVar = this.H;
        bVar.getClass();
        ((f58) bVar).U().getClass();
        return true;
    }

    @Override // defpackage.lr5
    public final int x(df6 df6Var, pj5 pj5Var, int i) {
        ox6.b bVar = this.H;
        bVar.getClass();
        return ((ir5) bVar).x(df6Var, pj5Var, i);
    }
}
