package defpackage;

import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class n79 extends y53 implements so5, qb9 {
    public in7 c0;
    public g44 d0;
    public final c97 e0;
    public final fr2 f0;
    public final z79 g0;
    public final h79 h0;
    public final aa4 i0;
    public final dz1 j0;
    public i79 k0;
    public r79 l0;
    public dz6 m0;
    public rua n0;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.foundation.gestures.ScrollableNode$onDragStopped$1", f = "Scrollable.kt", l = {394}, m = "invokeSuspend", v = 1)
    public static final class a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;
        public final /* synthetic */ n53.d u;
        public final /* synthetic */ n79 v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n53.d dVar, n79 n79Var, r02<? super a> r02Var) {
            super(2, r02Var);
            this.u = dVar;
            this.v = n79Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new a(this.u, this.v, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                n53.d dVar = this.u;
                float f = dVar.b ? -1.0f : 1.0f;
                z79 z79Var = this.v.g0;
                long jF = rdb.f(f, dVar.a);
                this.t = 1;
                Object objB = z79Var.b(jF, false, this);
                v72 v72Var = v72.t;
                if (objB == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1", f = "Scrollable.kt", l = {552}, m = "invokeSuspend", v = 1)
    public static final class b extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;
        public final /* synthetic */ long v;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1$1", f = "Scrollable.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class a extends p6a implements ci4<k97, r02<? super g2b>, Object> {
            public /* synthetic */ Object t;
            public final /* synthetic */ long u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(long j, r02<? super a> r02Var) {
                super(2, r02Var);
                this.u = j;
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                a aVar = new a(this.u, r02Var);
                aVar.t = obj;
                return aVar;
            }

            @Override // defpackage.ci4
            public final Object invoke(k97 k97Var, r02<? super g2b> r02Var) {
                return ((a) create(k97Var, r02Var)).invokeSuspend(g2b.a);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                dv8.b(obj);
                ((k97) this.t).a(this.u);
                return g2b.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, r02<? super b> r02Var) {
            super(2, r02Var);
            this.v = j;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return n79.this.new b(this.v, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((b) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                z79 z79Var = n79.this.g0;
                a aVar = new a(this.v, null);
                this.t = 1;
                Object objF = z79Var.f(o37.u, aVar, this);
                v72 v72Var = v72.t;
                if (objF == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            return g2b.a;
        }
    }

    public n79(pw0 pw0Var, g44 g44Var, h27 h27Var, fl7 fl7Var, in7 in7Var, s79 s79Var, boolean z, boolean z2) {
        super(d79.a, z, h27Var, fl7Var);
        this.c0 = in7Var;
        this.d0 = g44Var;
        c97 c97Var = new c97();
        this.e0 = c97Var;
        fr2 fr2Var = new fr2(new bn2(new jy9(d79.d)));
        this.f0 = fr2Var;
        in7 in7Var2 = this.c0;
        g44 g44Var2 = this.d0;
        z79 z79Var = new z79(s79Var, in7Var2, g44Var2 == null ? fr2Var : g44Var2, fl7Var, z2, c97Var, this, new uf6(this, 1));
        this.g0 = z79Var;
        h79 h79Var = new h79(z79Var, z);
        this.h0 = h79Var;
        ba4 ba4Var = new ba4(2, null, 10);
        c2(ba4Var);
        this.i0 = ba4Var;
        dz1 dz1Var = new dz1(fl7Var, z79Var, z2, pw0Var, new vf6(this, 1));
        c2(dz1Var);
        this.j0 = dz1Var;
        c2(new h97(h79Var, c97Var));
        ow0 ow0Var = new ow0();
        ow0Var.H = dz1Var;
        c2(ow0Var);
    }

    @Override // defpackage.so5
    public final boolean C(KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [i79] */
    @Override // defpackage.qb9
    public final void E1(hc9 hc9Var) {
        if (this.L && (this.k0 == null || this.l0 == null)) {
            this.k0 = new ci4() { // from class: i79
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    float fFloatValue = ((Float) obj).floatValue();
                    float fFloatValue2 = ((Float) obj2).floatValue();
                    n79 n79Var = this.t;
                    oy0.d(n79Var.Q1(), null, null, new q79(n79Var, fFloatValue, fFloatValue2, null), 3);
                    return Boolean.TRUE;
                }
            };
            this.l0 = new r79(this, null);
        }
        i79 i79Var = this.k0;
        if (i79Var != null) {
            ho5<Object>[] ho5VarArr = ec9.a;
            hc9Var.d(kb9.d, new k3(null, i79Var));
        }
        r79 r79Var = this.l0;
        if (r79Var != null) {
            ho5<Object>[] ho5VarArr2 = ec9.a;
            hc9Var.d(kb9.e, r79Var);
        }
    }

    @Override // ox6.c
    public final boolean R1() {
        return false;
    }

    @Override // ox6.c
    public final void U1() {
        if (this.G) {
            tx2 tx2Var = ew2.f(this).R;
            fr2 fr2Var = this.f0;
            fr2Var.getClass();
            fr2Var.a = new bn2(new jy9(tx2Var));
        }
        dz6 dz6Var = this.m0;
        if (dz6Var != null) {
            dz6Var.c = ew2.f(this).R;
        }
        rua ruaVar = this.n0;
        if (ruaVar != null) {
            ruaVar.c = ew2.f(this).R;
        }
    }

    @Override // defpackage.y53, defpackage.g58
    public final void c0(r48 r48Var, s48 s48Var, long j) {
        z79 z79Var;
        int i;
        int i2;
        long j2;
        List<a58> list = r48Var.a;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (this.K.invoke(new n58(list.get(i3).i)).booleanValue()) {
                super.c0(r48Var, s48Var, j);
                break;
            }
        }
        if (this.N == null) {
            nk4 nk4Var = new nk4(this);
            c2(nk4Var);
            this.N = nk4Var;
        }
        if (this.L) {
            s48 s48Var2 = s48.t;
            z79 z79Var2 = this.g0;
            if (s48Var == s48Var2 && r48Var.f == 6) {
                if (this.m0 == null) {
                    z79Var = z79Var2;
                    i = 6;
                    this.m0 = new dz6(z79Var, new zm(ViewConfiguration.get(fw2.a(this).getContext())), new l79(2, this, n79.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4), ew2.f(this).R);
                } else {
                    z79Var = z79Var2;
                    i = 6;
                }
                dz6 dz6Var = this.m0;
                if (dz6Var != null) {
                    t72 t72VarQ1 = Q1();
                    if (dz6Var.h == null) {
                        dz6Var.h = oy0.d(t72VarQ1, null, null, new jz6(dz6Var, null), 3);
                    }
                }
            } else {
                z79Var = z79Var2;
                i = 6;
            }
            dz6 dz6Var2 = this.m0;
            s48 s48Var3 = s48.u;
            if (dz6Var2 != null && r48Var.f == i) {
                int size2 = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size2) {
                        if (s48Var == s48Var2 && dz6Var2.d) {
                            j2 = j;
                            dz6Var2.f(r48Var, j2);
                            ec7.a(r48Var);
                        } else {
                            j2 = j;
                        }
                        if (s48Var != s48Var3 || dz6Var2.d || !dz6Var2.f(r48Var, j2)) {
                            break;
                            break;
                            break;
                        } else {
                            ec7.a(r48Var);
                            break;
                        }
                    }
                    if (list.get(i4).b()) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            if (s48Var == s48Var2 && ((i2 = r48Var.f) == 10 || i2 == 11 || i2 == 12)) {
                if (this.n0 == null) {
                    this.n0 = new rua(z79Var, new m79(2, this, n79.class, "onTrackpadScrollStopped", "onTrackpadScrollStopped-TH1AsA0(J)V", 4), ew2.f(this).R);
                }
                rua ruaVar = this.n0;
                if (ruaVar != null) {
                    t72 t72VarQ2 = Q1();
                    if (ruaVar.g == null) {
                        ruaVar.g = oy0.d(t72VarQ2, null, null, new uua(ruaVar, null), 3);
                    }
                }
            }
            rua ruaVar2 = this.n0;
            if (ruaVar2 != null) {
                int i5 = r48Var.f;
                if (i5 == 10 || i5 == 11 || i5 == 12) {
                    int size3 = list.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        if (list.get(i6).b()) {
                            return;
                        }
                    }
                    if (s48Var == s48Var2 && ruaVar2.d) {
                        ruaVar2.d(r48Var);
                        ec7.a(r48Var);
                    }
                    if (s48Var == s48Var3 && !ruaVar2.d && ruaVar2.d(r48Var)) {
                        ec7.a(r48Var);
                    }
                }
            }
        }
    }

    @Override // defpackage.y53
    public final Object j2(y53.b.a aVar, y53.b bVar) {
        z79 z79Var = this.g0;
        Object objF = z79Var.f(o37.u, new k79(aVar, z79Var, null), bVar);
        return objF == v72.t ? objF : g2b.a;
    }

    @Override // defpackage.dw2
    public final void l() {
        t0();
        if (this.G) {
            tx2 tx2Var = ew2.f(this).R;
            fr2 fr2Var = this.f0;
            fr2Var.getClass();
            fr2Var.a = new bn2(new jy9(tx2Var));
        }
        dz6 dz6Var = this.m0;
        if (dz6Var != null) {
            dz6Var.c = ew2.f(this).R;
        }
        rua ruaVar = this.n0;
        if (ruaVar != null) {
            ruaVar.c = ew2.f(this).R;
        }
    }

    @Override // defpackage.so5
    public final boolean l0(KeyEvent keyEvent) {
        long jFloatToRawIntBits;
        if (!this.L || ((!lo5.a(db7.a(keyEvent), lo5.D) && !lo5.a(ds6.b(keyEvent.getKeyCode()), lo5.C)) || db7.b(keyEvent) != 2 || keyEvent.isCtrlPressed())) {
            return false;
        }
        boolean z = this.g0.d == fl7.t;
        dz1 dz1Var = this.j0;
        if (z) {
            int iD2 = (int) (dz1Var.d2() & 4294967295L);
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(lo5.a(ds6.b(keyEvent.getKeyCode()), lo5.C) ? iD2 : -iD2)));
        } else {
            int iD3 = (int) (dz1Var.d2() >> 32);
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(lo5.a(ds6.b(keyEvent.getKeyCode()), lo5.C) ? iD3 : -iD3)) << 32);
        }
        oy0.d(Q1(), null, null, new b(jFloatToRawIntBits, null), 3);
        return true;
    }

    @Override // defpackage.y53
    public final void p2(n53.d dVar) {
        oy0.d(this.e0.c(), null, null, new a(dVar, this, null), 3);
    }

    @Override // defpackage.y53
    public final boolean u2() {
        z79 z79Var = this.g0;
        if (z79Var.a.a()) {
            return true;
        }
        in7 in7Var = z79Var.b;
        return in7Var != null ? in7Var.c() : false;
    }

    public final void x2(pw0 pw0Var, g44 g44Var, h27 h27Var, fl7 fl7Var, in7 in7Var, s79 s79Var, boolean z, boolean z2) {
        boolean z3;
        boolean z4 = true;
        boolean z5 = false;
        if (this.L != z) {
            this.h0.u = z;
            z3 = true;
        } else {
            z3 = false;
        }
        g44 g44Var2 = g44Var == null ? this.f0 : g44Var;
        z79 z79Var = this.g0;
        if (!xj5.a(z79Var.a, s79Var)) {
            z79Var.a = s79Var;
            z5 = true;
        }
        z79Var.b = in7Var;
        if (z79Var.d != fl7Var) {
            z79Var.d = fl7Var;
            z5 = true;
        }
        if (z79Var.e != z2) {
            z79Var.e = z2;
        } else {
            z4 = z5;
        }
        z79Var.c = g44Var2;
        z79Var.f = this.e0;
        dz1 dz1Var = this.j0;
        dz1Var.H = fl7Var;
        dz1Var.J = z2;
        dz1Var.K = pw0Var;
        this.c0 = in7Var;
        this.d0 = g44Var;
        v4 v4Var = d79.a;
        fl7 fl7Var2 = z79Var.d;
        fl7 fl7Var3 = fl7.t;
        if (fl7Var2 != fl7Var3) {
            fl7Var3 = fl7.u;
        }
        w2(v4Var, z, h27Var, fl7Var3, z4);
        if (z3) {
            this.k0 = null;
            this.l0 = null;
            ew2.f(this).R();
        }
    }

    @Override // defpackage.y53
    public final void o2(long j) {
    }
}
