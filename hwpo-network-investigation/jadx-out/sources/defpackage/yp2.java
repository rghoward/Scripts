package defpackage;

import android.os.Looper;
import android.util.SparseArray;
import androidx.media3.exoplayer.d;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class yp2 implements ri {
    public kt4 A;
    public boolean B;
    public final vf1 t;
    public final toa.b u;
    public final toa.c v;
    public final a w;
    public final SparseArray<aj.a> x;
    public gb6<aj> y;
    public s28 z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final toa.b a;
        public k95<bq6.b> b;
        public vl8 c;
        public bq6.b d;
        public bq6.b e;
        public bq6.b f;

        public a(toa.b bVar) {
            this.a = bVar;
            k95.b bVar2 = k95.u;
            this.b = ul8.x;
            this.c = vl8.z;
        }

        public static bq6.b b(s28 s28Var, k95<bq6.b> k95Var, bq6.b bVar, toa.b bVar2) {
            toa toaVarN = s28Var.N();
            int iP = s28Var.p();
            Object objL = toaVarN.p() ? null : toaVarN.l(iP);
            int iB = (s28Var.g() || toaVarN.p()) ? -1 : toaVarN.f(iP, bVar2, false).b(n6b.N(s28Var.X()) - bVar2.e);
            for (int i = 0; i < k95Var.size(); i++) {
                bq6.b bVar3 = k95Var.get(i);
                if (c(bVar3, objL, s28Var.g(), s28Var.F(), s28Var.t(), iB)) {
                    return bVar3;
                }
            }
            if (k95Var.isEmpty() && bVar != null && c(bVar, objL, s28Var.g(), s28Var.F(), s28Var.t(), iB)) {
                return bVar;
            }
            return null;
        }

        public static boolean c(bq6.b bVar, Object obj, boolean z, int i, int i2, int i3) {
            Object obj2 = bVar.a;
            int i4 = bVar.b;
            if (!obj2.equals(obj)) {
                return false;
            }
            if (z && i4 == i && bVar.c == i2) {
                return true;
            }
            return !z && i4 == -1 && bVar.e == i3;
        }

        public final void a(m95.a<bq6.b, toa> aVar, bq6.b bVar, toa toaVar) {
            if (bVar == null) {
                return;
            }
            if (toaVar.b(bVar.a) != -1) {
                aVar.b(bVar, toaVar);
                return;
            }
            toa toaVar2 = (toa) this.c.get(bVar);
            if (toaVar2 != null) {
                aVar.b(bVar, toaVar2);
            }
        }

        public final void d(toa toaVar) {
            k95<bq6.b> k95Var;
            m95.a<bq6.b, toa> aVarA = m95.a();
            if (this.b.isEmpty()) {
                a(aVarA, this.e, toaVar);
                if (!Objects.equals(this.f, this.e)) {
                    a(aVarA, this.f, toaVar);
                }
                if (!Objects.equals(this.d, this.e) && !Objects.equals(this.d, this.f)) {
                    a(aVarA, this.d, toaVar);
                }
            } else {
                int i = 0;
                while (true) {
                    int size = this.b.size();
                    k95Var = this.b;
                    if (i >= size) {
                        break;
                    }
                    a(aVarA, k95Var.get(i), toaVar);
                    i++;
                }
                if (!k95Var.contains(this.d)) {
                    a(aVarA, this.d, toaVar);
                }
            }
            this.c = aVarA.a(true);
        }
    }

    public yp2(vf1 vf1Var) {
        vf1Var.getClass();
        this.t = vf1Var;
        String str = n6b.a;
        Looper looperMyLooper = Looper.myLooper();
        this.y = new gb6<>((looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper).getThread());
        toa.b bVar = new toa.b();
        this.u = bVar;
        this.v = new toa.c();
        this.w = new a(bVar);
        this.x = new SparseArray<>();
    }

    @Override // defpackage.ri
    public final void A() {
        if (this.B) {
            return;
        }
        aj.a aVarJ0 = j0();
        this.B = true;
        o0(aVarJ0, -1, new fh0());
    }

    @Override // defpackage.ri
    public final void B(String str) {
        o0(n0(), 1012, new up2());
    }

    @Override // s28.c
    public final void C(boolean z) {
        o0(j0(), 9, new vo2());
    }

    @Override // defpackage.jq6
    public final void D(int i, bq6.b bVar, final rb6 rb6Var, final mp6 mp6Var, final IOException iOException, final boolean z) {
        final aj.a aVarM0 = m0(i, bVar);
        o0(aVarM0, 1003, new gb6.a(aVarM0, rb6Var, mp6Var, iOException, z) { // from class: dp2
            public final /* synthetic */ mp6 t;

            {
                this.t = mp6Var;
            }

            @Override // gb6.a
            public final void invoke(Object obj) {
                ((aj) obj).i(this.t);
            }
        });
    }

    @Override // defpackage.ri
    public final void E(i90 i90Var) {
        o0(n0(), 1032, new tp2());
    }

    @Override // s28.c
    public final void F(kc2 kc2Var) {
        o0(j0(), 27, new uo2());
    }

    @Override // defpackage.ri
    public final void G(ul8 ul8Var, bq6.b bVar) {
        s28 s28Var = this.z;
        s28Var.getClass();
        a aVar = this.w;
        aVar.getClass();
        aVar.b = k95.q(ul8Var);
        if (!ul8Var.isEmpty()) {
            aVar.e = (bq6.b) ul8Var.get(0);
            bVar.getClass();
            aVar.f = bVar;
        }
        if (aVar.d == null) {
            aVar.d = a.b(s28Var, aVar.b, aVar.e, aVar.a);
        }
        aVar.d(s28Var.N());
    }

    @Override // defpackage.ri
    public final void H(long j, int i, long j2) {
        o0(n0(), 1011, new p51());
    }

    @Override // defpackage.ri
    public final void I(int i, boolean z, int i2) {
        o0(n0(), 1033, new jo2());
    }

    @Override // s28.c
    public final void J(vua vuaVar) {
        o0(j0(), 2, new ko2());
    }

    @Override // s28.c
    public final void K(h28 h28Var) {
        bq6.b bVar;
        o0((!(h28Var instanceof lo3) || (bVar = ((lo3) h28Var).A) == null) ? j0() : k0(bVar), 10, new av());
    }

    @Override // s28.c
    public final void L(int i) {
        s28 s28Var = this.z;
        s28Var.getClass();
        a aVar = this.w;
        aVar.d = a.b(s28Var, aVar.b, aVar.e, aVar.a);
        aVar.d(s28Var.N());
        o0(j0(), 0, new vp2());
    }

    @Override // defpackage.ri
    public final void M(id4 id4Var, pn2 pn2Var) {
        o0(n0(), 1009, new lp2());
    }

    @Override // defpackage.ri
    public final void N(i90 i90Var) {
        o0(n0(), 1031, new yd());
    }

    @Override // s28.c
    public final void O(np6 np6Var) {
        o0(j0(), 14, new fp2());
    }

    @Override // s28.c
    public final void P(int i) {
        o0(j0(), 8, new ro2());
    }

    @Override // s28.c
    public final void R(boolean z) {
        o0(n0(), 23, new rp2());
    }

    @Override // defpackage.ri
    public final void S(Exception exc) {
        o0(n0(), 1014, new ct1());
    }

    @Override // s28.c
    public final void T(List<ec2> list) {
        aj.a aVarJ0 = j0();
        o0(aVarJ0, 27, new lo2(aVarJ0, list));
    }

    @Override // s28.c
    public final void U(int i, boolean z) {
        o0(j0(), -1, new co2());
    }

    @Override // defpackage.ri
    public final void V(long j) {
        o0(n0(), 1010, new sp2());
    }

    @Override // defpackage.ri
    public final void W(Exception exc) {
        o0(n0(), 1029, new so2());
    }

    @Override // s28.c
    public final void X(k28 k28Var) {
        o0(j0(), 12, new ao2());
    }

    @Override // s28.c
    public final void Y(s28.a aVar) {
        o0(j0(), 13, new sk0());
    }

    @Override // s28.c
    public final void Z(su6 su6Var) {
        o0(j0(), 28, new do2());
    }

    @Override // defpackage.ri
    public final void a() {
        kt4 kt4Var = this.A;
        kt4Var.getClass();
        kt4Var.e(new Runnable() { // from class: qo2
            @Override // java.lang.Runnable
            public final void run() {
                yp2 yp2Var = this.t;
                yp2Var.o0(yp2Var.j0(), 1028, new bp2());
                yp2Var.y.d();
            }
        });
    }

    @Override // cj0.a
    public final void a0(final long j, final int i, final long j2) {
        a aVar = this.w;
        final aj.a aVarK0 = k0(aVar.b.isEmpty() ? null : (bq6.b) nr1.b(aVar.b));
        o0(aVarK0, 1006, new gb6.a(i, j, j2) { // from class: qp2
            public final /* synthetic */ int u;
            public final /* synthetic */ long v;

            @Override // gb6.a
            public final void invoke(Object obj) {
                ((aj) obj).j(this.t, this.u, this.v);
            }
        });
    }

    @Override // s28.c
    public final void b(tfb tfbVar) {
        aj.a aVarN0 = n0();
        o0(aVarN0, 25, new kp2(aVarN0, tfbVar));
    }

    @Override // s28.c
    public final void b0(co6 co6Var, int i) {
        o0(j0(), 1, new wp2());
    }

    @Override // defpackage.ri
    public final void c(final ln2 ln2Var) {
        final aj.a aVarK0 = k0(this.w.e);
        o0(aVarK0, 1020, new gb6.a(aVarK0, ln2Var) { // from class: yo2
            public final /* synthetic */ ln2 t;

            {
                this.t = ln2Var;
            }

            @Override // gb6.a
            public final void invoke(Object obj) {
                ((aj) obj).c(this.t);
            }
        });
    }

    @Override // defpackage.ri
    public final void c0(int i) {
        o0(j0(), 1034, new mo2());
    }

    @Override // defpackage.ri
    public final void d(String str) {
        o0(n0(), 1019, new ho2());
    }

    @Override // s28.c
    public final void d0(int i, int i2) {
        o0(n0(), 24, new wo2());
    }

    @Override // defpackage.ri
    public final void e(int i, long j) {
        o0(k0(this.w.e), 1021, new gp2());
    }

    @Override // defpackage.ri
    public final void e0(ln2 ln2Var) {
        o0(n0(), 1007, new cp2());
    }

    @Override // defpackage.ri
    public final void f(ln2 ln2Var) {
        o0(n0(), 1015, new mp2());
    }

    @Override // defpackage.ri
    public final void f0(sp6 sp6Var) {
        this.y.a(sp6Var);
    }

    @Override // s28.c
    public final void g(final h28 h28Var) {
        bq6.b bVar;
        final aj.a aVarJ0 = (!(h28Var instanceof lo3) || (bVar = ((lo3) h28Var).A) == null) ? j0() : k0(bVar);
        o0(aVarJ0, 10, new gb6.a(aVarJ0, h28Var) { // from class: no2
            public final /* synthetic */ h28 t;

            {
                this.t = h28Var;
            }

            @Override // gb6.a
            public final void invoke(Object obj) {
                ((aj) obj).g(this.t);
            }
        });
    }

    @Override // defpackage.jq6
    public final void g0(int i, bq6.b bVar, rb6 rb6Var, mp6 mp6Var, int i2) {
        o0(m0(i, bVar), 1000, new zo2());
    }

    @Override // defpackage.ri
    public final void h(int i, long j) {
        o0(k0(this.w.e), 1018, new ep2());
    }

    @Override // s28.c
    public final void h0(boolean z) {
        o0(j0(), 7, new eo2());
    }

    @Override // defpackage.ri
    public final void i(id4 id4Var, pn2 pn2Var) {
        o0(n0(), 1017, new xr1());
    }

    @Override // defpackage.ri
    public final void i0(long j, long j2, String str) {
        o0(n0(), 1008, new fo2());
    }

    @Override // defpackage.ri
    public final void j(Exception exc) {
        o0(n0(), 1030, new xp2());
    }

    public final aj.a j0() {
        return k0(this.w.d);
    }

    @Override // defpackage.ri
    public final void k(final long j, final Object obj) {
        final aj.a aVarN0 = n0();
        o0(aVarN0, 26, new gb6.a(aVarN0, obj, j) { // from class: op2
            public final /* synthetic */ Object t;

            {
                this.t = obj;
            }

            @Override // gb6.a
            public final void invoke(Object obj2) {
                ((aj) obj2).getClass();
            }
        });
    }

    public final aj.a k0(bq6.b bVar) {
        this.z.getClass();
        toa toaVar = bVar == null ? null : (toa) this.w.c.get(bVar);
        if (bVar != null && toaVar != null) {
            return l0(toaVar, toaVar.g(bVar.a, this.u).c, bVar);
        }
        int iG = this.z.G();
        toa toaVarN = this.z.N();
        if (iG >= toaVarN.o()) {
            toaVarN = toa.a;
        }
        return l0(toaVarN, iG, null);
    }

    @Override // defpackage.ri
    public final void l(long j, long j2, String str) {
        o0(n0(), 1016, new to2());
    }

    public final aj.a l0(toa toaVar, int i, bq6.b bVar) {
        bq6.b bVar2 = toaVar.p() ? null : bVar;
        long jC = this.t.c();
        boolean z = toaVar.equals(this.z.N()) && i == this.z.G();
        long jZ = 0;
        if (bVar2 == null || !bVar2.b()) {
            if (z) {
                jZ = this.z.z();
            } else if (!toaVar.p()) {
                jZ = n6b.Z(toaVar.m(i, this.v, 0L).l);
            }
        } else if (z && this.z.F() == bVar2.b && this.z.t() == bVar2.c) {
            jZ = this.z.X();
        }
        return new aj.a(jC, toaVar, i, bVar2, jZ, this.z.N(), this.z.G(), this.w.d, this.z.X(), this.z.i());
    }

    @Override // s28.c
    public final void m(int i) {
        o0(j0(), 6, new go2());
    }

    public final aj.a m0(int i, bq6.b bVar) {
        this.z.getClass();
        if (bVar != null) {
            return ((toa) this.w.c.get(bVar)) != null ? k0(bVar) : l0(toa.a, i, bVar);
        }
        toa toaVarN = this.z.N();
        if (i >= toaVarN.o()) {
            toaVarN = toa.a;
        }
        return l0(toaVarN, i, null);
    }

    public final aj.a n0() {
        return k0(this.w.f);
    }

    @Override // s28.c
    public final void o(final s28.d dVar, final s28.d dVar2, final int i) {
        if (i == 1) {
            this.B = false;
        }
        s28 s28Var = this.z;
        s28Var.getClass();
        a aVar = this.w;
        aVar.d = a.b(s28Var, aVar.b, aVar.e, aVar.a);
        final aj.a aVarJ0 = j0();
        o0(aVarJ0, 11, new gb6.a(aVarJ0, i, dVar, dVar2) { // from class: po2
            public final /* synthetic */ int t;

            {
                this.t = i;
            }

            @Override // gb6.a
            public final void invoke(Object obj) {
                aj ajVar = (aj) obj;
                ajVar.getClass();
                ajVar.h(this.t);
            }
        });
    }

    public final void o0(aj.a aVar, int i, gb6.a<aj> aVar2) {
        this.x.put(i, aVar);
        this.y.e(i, aVar2);
    }

    @Override // defpackage.jq6
    public final void p(int i, bq6.b bVar, final mp6 mp6Var) {
        final aj.a aVarM0 = m0(i, bVar);
        o0(aVarM0, 1004, new gb6.a() { // from class: xo2
            @Override // gb6.a
            public final void invoke(Object obj) {
                ((aj) obj).k(aVarM0, mp6Var);
            }
        });
    }

    @Override // defpackage.jq6
    public final void q(int i, bq6.b bVar, mp6 mp6Var) {
        o0(m0(i, bVar), 1005, new pp2());
    }

    @Override // s28.c
    public final void r(lsa lsaVar) {
        o0(j0(), 19, new ap2());
    }

    @Override // defpackage.ri
    public final void s(final d dVar, Looper looper) {
        xl7.r(this.z == null || this.w.b.isEmpty());
        dVar.getClass();
        this.z = dVar;
        this.A = this.t.b(looper, null);
        gb6<aj> gb6Var = this.y;
        gb6.b bVar = new gb6.b() { // from class: bo2
            @Override // gb6.b
            public final void a(Object obj, y34 y34Var) {
                ((aj) obj).l(dVar, new aj.b(y34Var, this.t.x));
            }
        };
        gb6Var.getClass();
        vf1 vf1Var = this.t;
        xl7.r(vf1Var != null);
        this.y = new gb6<>(gb6Var.e, looper, looper.getThread(), vf1Var, bVar, gb6Var.j);
    }

    @Override // s28.c
    public final void t(boolean z) {
        o0(j0(), 3, new np2());
    }

    @Override // s28.c
    public final void u(int i, boolean z) {
        o0(j0(), 5, new io2());
    }

    @Override // defpackage.jq6
    public final void v(int i, bq6.b bVar, rb6 rb6Var, mp6 mp6Var) {
        o0(m0(i, bVar), 1002, new hp2());
    }

    @Override // s28.c
    public final void w(int i) {
        o0(n0(), 21, new jp2());
    }

    @Override // s28.c
    public final void x(int i) {
        o0(j0(), 4, new oo2());
    }

    @Override // defpackage.ri
    public final void y(ln2 ln2Var) {
        o0(k0(this.w.e), 1013, new ip2());
    }

    @Override // defpackage.jq6
    public final void z(int i, bq6.b bVar, rb6 rb6Var, mp6 mp6Var) {
        o0(m0(i, bVar), 1001, new ur1());
    }

    @Override // s28.c
    public final void Q() {
    }

    @Override // s28.c
    public final void n(s28.b bVar) {
    }
}
