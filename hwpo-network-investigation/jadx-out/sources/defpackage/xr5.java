package defpackage;

import android.view.ViewGroup;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xr5 implements ls1 {
    public int G;
    public int H;
    public final qr5 t;
    public yt1 u;
    public h4a v;
    public int w;
    public int x;
    public final c37<qr5, b> y = z39.b();
    public final c37<Object, qr5> z = z39.b();
    public final c A = new c();
    public final a B = new a();
    public final c37<Object, qr5> C = z39.b();
    public final h4a.a D = new h4a.a(0);
    public final c37<Object, f4a.b> E = z39.b();
    public final k37<Object> F = new k37<>(new Object[16]);
    public final String I = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class a implements g4a, hl6 {
        public final /* synthetic */ c t;

        public a() {
            this.t = xr5.this.A;
        }

        @Override // defpackage.tx2
        public final long A0(float f) {
            return this.t.A0(f);
        }

        @Override // defpackage.tx2
        public final float C1(long j) {
            return this.t.C1(j);
        }

        @Override // defpackage.tx2
        public final float F0(int i) {
            return this.t.F0(i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.g4a
        public final List H(ci4 ci4Var, Object obj) {
            xr5 xr5Var = xr5.this;
            qr5 qr5Var = xr5Var.t;
            c37<Object, qr5> c37Var = xr5Var.z;
            qr5 qr5VarD = c37Var.d(obj);
            if (qr5VarD != null && ((k37.a) qr5Var.C()).t.m((T) qr5VarD) < xr5Var.w) {
                return qr5VarD.A();
            }
            c37<Object, f4a.b> c37Var2 = xr5Var.E;
            c37<Object, qr5> c37Var3 = xr5Var.C;
            k37<Object> k37Var = xr5Var.F;
            if (k37Var.v < xr5Var.x) {
                uc5.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
            }
            qr5 qr5VarD2 = c37Var.d(obj);
            int i = k37Var.v;
            int i2 = xr5Var.x;
            if (i == i2) {
                k37Var.d(obj);
            } else {
                Object[] objArr = k37Var.t;
                Object obj2 = objArr[i2];
                objArr[i2] = obj;
            }
            xr5Var.x++;
            boolean zA = c37Var3.a(obj);
            if (zA || qr5VarD2 != null) {
                if (!zA && qr5VarD2 != null) {
                    xr5Var.j(((k37.a) qr5Var.C()).t.m((T) qr5VarD2), ((k37.a) qr5Var.C()).t.v);
                    xr5Var.H++;
                    c37Var.k(obj);
                    c37Var3.m(obj, qr5VarD2);
                    c37Var2.m(obj, xr5Var.e(obj));
                    if (qr5Var.e()) {
                        xr5Var.h();
                    }
                }
                qr5 qr5VarD3 = c37Var3.d(obj);
                b bVarD = qr5VarD3 != null ? xr5Var.y.d(qr5VarD3) : null;
                if (bVarD != null && bVarD.d) {
                    xr5Var.m(qr5VarD3, obj, false, ci4Var);
                }
                if ((bVarD != null ? bVarD.f : null) != null) {
                    xr5Var.c(bVarD, true);
                }
            } else {
                xr5Var.k(obj, ci4Var, false);
                c37Var2.m(obj, xr5Var.e(obj));
            }
            qr5 qr5VarD4 = c37Var3.d(obj);
            if (qr5VarD4 == null) {
                return hf3.t;
            }
            List<el6> listN0 = qr5VarD4.Z.p.n0();
            k37.a aVar = (k37.a) listN0;
            int i3 = aVar.t.v;
            for (int i4 = 0; i4 < i3; i4++) {
                ((el6) aVar.get(i4)).y.b = true;
            }
            return listN0;
        }

        @Override // defpackage.tx2
        public final float I0(float f) {
            return f / this.t.getDensity();
        }

        @Override // defpackage.tx2
        public final float N0() {
            return this.t.v;
        }

        @Override // defpackage.tx2
        public final long O(float f) {
            return this.t.O(f);
        }

        @Override // defpackage.tx2
        public final long P(long j) {
            return this.t.P(j);
        }

        @Override // defpackage.qj5
        public final boolean P0() {
            return this.t.P0();
        }

        @Override // defpackage.tx2
        public final float U0(float f) {
            return this.t.getDensity() * f;
        }

        @Override // defpackage.tx2
        public final float d0(long j) {
            return this.t.d0(j);
        }

        @Override // defpackage.tx2
        public final float getDensity() {
            return this.t.u;
        }

        @Override // defpackage.qj5
        public final tq5 getLayoutDirection() {
            return this.t.t;
        }

        @Override // defpackage.hl6
        public final gl6 i1(int i, int i2, Map<ei, Integer> map, oh4<? super wy8, g2b> oh4Var, oh4<? super jz7.a, g2b> oh4Var2) {
            return this.t.i1(i, i2, map, oh4Var, oh4Var2);
        }

        @Override // defpackage.tx2
        public final int n1(float f) {
            return this.t.n1(f);
        }

        @Override // defpackage.tx2
        public final long w0(int i) {
            return this.t.w0(i);
        }

        @Override // defpackage.hl6
        public final gl6 y0(int i, int i2, Map<ei, Integer> map, oh4<? super jz7.a, g2b> oh4Var) {
            return this.t.i1(i, i2, map, null, oh4Var);
        }

        @Override // defpackage.tx2
        public final long z1(long j) {
            return this.t.z1(j);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public Object a;
        public ci4<? super jt1, ? super Integer, g2b> b;
        public qv8 c;
        public boolean d;
        public boolean e;
        public pu7 f;
        public dt7 g;
        public boolean h;

        public b() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class c implements g4a {
        public tq5 t = tq5.u;
        public float u;
        public float v;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class a implements gl6 {
            public final /* synthetic */ int a;
            public final /* synthetic */ int b;
            public final /* synthetic */ Map<ei, Integer> c;
            public final /* synthetic */ oh4<wy8, g2b> d;
            public final /* synthetic */ c e;
            public final /* synthetic */ xr5 f;
            public final /* synthetic */ oh4<jz7.a, g2b> g;

            /* JADX WARN: Multi-variable type inference failed */
            public a(int i, int i2, Map<ei, Integer> map, oh4<? super wy8, g2b> oh4Var, c cVar, xr5 xr5Var, oh4<? super jz7.a, g2b> oh4Var2) {
                this.a = i;
                this.b = i2;
                this.c = map;
                this.d = oh4Var;
                this.e = cVar;
                this.f = xr5Var;
                this.g = oh4Var2;
            }

            @Override // defpackage.gl6
            public final int h() {
                return this.b;
            }

            @Override // defpackage.gl6
            public final int j() {
                return this.a;
            }

            @Override // defpackage.gl6
            public final Map<ei, Integer> l() {
                return this.c;
            }

            @Override // defpackage.gl6
            public final void m() {
                fd5.a aVar;
                qr5 qr5Var = this.f.t;
                boolean zP0 = this.e.P0();
                oh4<jz7.a, g2b> oh4Var = this.g;
                if (!zP0 || (aVar = qr5Var.Y.c.o0) == null) {
                    oh4Var.invoke(qr5Var.Y.c.E);
                } else {
                    oh4Var.invoke(aVar.E);
                }
            }

            @Override // defpackage.gl6
            public final oh4<wy8, g2b> n() {
                return this.d;
            }
        }

        public c() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.g4a
        public final List H(ci4 ci4Var, Object obj) {
            xr5 xr5Var = xr5.this;
            xr5Var.h();
            qr5 qr5Var = xr5Var.t;
            qr5.d dVar = qr5Var.Z.d;
            qr5.d dVar2 = qr5.d.v;
            qr5.d dVar3 = qr5.d.t;
            if (dVar != dVar3 && dVar != dVar2 && dVar != qr5.d.u && dVar != qr5.d.w) {
                uc5.b("subcompose can only be used inside the measure or layout blocks");
            }
            c37<Object, qr5> c37Var = xr5Var.z;
            qr5 qr5VarD = c37Var.d(obj);
            if (qr5VarD == null) {
                qr5VarD = xr5Var.C.k(obj);
                if (qr5VarD != null) {
                    xr5Var.y.d(qr5VarD);
                    if (xr5Var.H <= 0) {
                        uc5.b("Check failed.");
                    }
                    xr5Var.H--;
                } else {
                    qr5VarD = xr5Var.n(obj);
                    if (qr5VarD == null) {
                        int i = xr5Var.w;
                        qr5 qr5Var2 = new qr5(2);
                        qr5Var.J = true;
                        qr5Var.N(i, qr5Var2);
                        g2b g2bVar = g2b.a;
                        qr5Var.J = false;
                        qr5VarD = qr5Var2;
                    }
                }
                c37Var.m(obj, qr5VarD);
            }
            qr5 qr5Var3 = qr5VarD;
            if (th1.B(xr5Var.w, qr5Var.C()) != qr5Var3) {
                int iM = ((k37.a) qr5Var.C()).t.m((T) qr5Var3);
                if (iM < xr5Var.w) {
                    uc5.a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
                }
                int i2 = xr5Var.w;
                if (i2 != iM) {
                    xr5Var.j(iM, i2);
                }
            }
            xr5Var.w++;
            xr5Var.m(qr5Var3, obj, false, ci4Var);
            return (dVar == dVar3 || dVar == dVar2) ? qr5Var3.A() : qr5Var3.z();
        }

        @Override // defpackage.tx2
        public final float N0() {
            return this.v;
        }

        @Override // defpackage.qj5
        public final boolean P0() {
            qr5.d dVar = xr5.this.t.Z.d;
            return dVar == qr5.d.w || dVar == qr5.d.u;
        }

        @Override // defpackage.tx2
        public final float getDensity() {
            return this.u;
        }

        @Override // defpackage.qj5
        public final tq5 getLayoutDirection() {
            return this.t;
        }

        @Override // defpackage.hl6
        public final gl6 i1(int i, int i2, Map<ei, Integer> map, oh4<? super wy8, g2b> oh4Var, oh4<? super jz7.a, g2b> oh4Var2) {
            if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
                uc5.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
            }
            return new a(i, i2, map, oh4Var, this, xr5.this, oh4Var2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class e implements f4a.b {
        public final f27 a = jg5.a();
        public final /* synthetic */ Object c;

        public e(Object obj) {
            this.c = obj;
        }

        @Override // f4a.b
        public final long a(int i) {
            qr5 qr5VarD = xr5.this.C.d(this.c);
            if (qr5VarD == null || !qr5VarD.e()) {
                return 0L;
            }
            int i2 = ((k37.a) qr5VarD.B()).t.v;
            if (i < 0 || i >= i2) {
                uc5.d("Index (" + i + ") is out of bound of [0, " + i2 + ')');
            }
            if (!this.a.c(i)) {
                return 0L;
            }
            int i3 = ((qr5) ((k37.a) qr5VarD.B()).get(i)).Z.p.t;
            return (((long) ((qr5) ((k37.a) qr5VarD.B()).get(i)).Z.p.u) & 4294967295L) | (((long) i3) << 32);
        }

        @Override // f4a.b
        public final int b() {
            qr5 qr5VarD = xr5.this.C.d(this.c);
            if (qr5VarD != null) {
                return ((k37.a) qr5VarD.B()).t.v;
            }
            return 0;
        }

        @Override // f4a.b
        public final void c(int i, long j) {
            xr5 xr5Var = xr5.this;
            qr5 qr5VarD = xr5Var.C.d(this.c);
            if (qr5VarD == null || !qr5VarD.e()) {
                return;
            }
            int i2 = ((k37.a) qr5VarD.B()).t.v;
            if (i < 0 || i >= i2) {
                uc5.d("Index (" + i + ") is out of bound of [0, " + i2 + ')');
            }
            if (qr5VarD.j()) {
                uc5.a("Pre-measure called on node that is not placed");
            }
            qr5 qr5Var = xr5Var.t;
            qr5Var.J = true;
            ur5.a(qr5VarD).c((qr5) ((k37.a) qr5VarD.B()).get(i), j);
            g2b g2bVar = g2b.a;
            qr5Var.J = false;
            this.a.a(i);
        }

        @Override // f4a.b
        public final void d(a88 a88Var) {
            kb7 kb7Var;
            qr5 qr5VarD = xr5.this.C.d(this.c);
            ox6.c cVar = (qr5VarD == null || (kb7Var = qr5VarD.Y) == null) ? null : kb7Var.f;
            if (cVar == null || !cVar.G) {
                return;
            }
            yx.g(cVar, "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", a88Var);
        }

        @Override // f4a.b
        public final void dispose() {
            xr5.b(xr5.this, this.c);
        }
    }

    public xr5(qr5 qr5Var, h4a h4aVar) {
        this.t = qr5Var;
        this.v = h4aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final void b(xr5 xr5Var, Object obj) {
        qr5 qr5Var = xr5Var.t;
        xr5Var.h();
        qr5 qr5VarK = xr5Var.C.k(obj);
        if (qr5VarK != null) {
            if (xr5Var.H <= 0) {
                uc5.b("No pre-composed items to dispose");
            }
            int iM = ((k37.a) qr5Var.C()).t.m((T) qr5VarK);
            if (iM < ((k37.a) qr5Var.C()).t.v - xr5Var.H) {
                uc5.b("Item is not in pre-composed item range");
            }
            xr5Var.G++;
            xr5Var.H--;
            b bVarD = xr5Var.y.d(qr5VarK);
            if (bVarD != null) {
                d(bVarD);
            }
            int i = (((k37.a) qr5Var.C()).t.v - xr5Var.H) - xr5Var.G;
            xr5Var.j(iM, i);
            xr5Var.f(i);
        }
        if (xr5Var.F.l(obj)) {
            qr5.g0(qr5Var, true, 6);
        }
    }

    public static void d(b bVar) {
        d37<jm8> d37Var;
        pu7 pu7Var = bVar.f;
        if (pu7Var != null) {
            pu7Var.h.set(ru7.u);
            hm8 hm8Var = pu7Var.k;
            if (hm8Var.d.h()) {
                d37Var = hm8Var.d;
                hm8Var.d = a49.a();
                hm8Var.c.k();
            } else {
                d37Var = null;
            }
            hm8Var.b();
            gu1 gu1Var = pu7Var.a;
            gu1Var.J = null;
            if (d37Var != null) {
                gu1Var.N.k = d37Var;
                gu1Var.P = 2;
            }
            bVar.f = null;
            qv8 qv8Var = bVar.c;
            if (qv8Var != null) {
                qv8Var.dispose();
            }
            bVar.c = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x004f A[LOOP:0: B:5:0x0014->B:17:0x004f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0052 A[EDGE_INSN: B:21:0x0052->B:18:0x0052 BREAK  A[LOOP:0: B:5:0x0014->B:17:0x004f], SYNTHETIC] */
    @Override // defpackage.ls1
    public final void a() {
        qv8 qv8Var;
        qr5 qr5Var = this.t;
        qr5Var.J = true;
        c37<qr5, b> c37Var = this.y;
        Object[] objArr = c37Var.c;
        long[] jArr = c37Var.a;
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
                        if ((255 & j) < 128 && (qv8Var = ((b) objArr[(i << 3) + i3]).c) != null) {
                            qv8Var.dispose();
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
        qr5Var.a0();
        g2b g2bVar = g2b.a;
        qr5Var.J = false;
        c37Var.g();
        this.z.g();
        this.H = 0;
        this.G = 0;
        this.C.g();
        h();
    }

    public final void c(b bVar, boolean z) {
        pu7 pu7Var = bVar.f;
        if (pu7Var != null) {
            hu9 hu9VarA = hu9.a.a();
            oh4<Object, g2b> oh4VarE = hu9VarA != null ? hu9VarA.e() : null;
            hu9 hu9VarB = hu9.a.b(hu9VarA);
            try {
                qr5 qr5Var = this.t;
                qr5Var.J = true;
                if (z) {
                    while (!pu7Var.c()) {
                        try {
                            pu7Var.e(new wr5());
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                pu7Var.a();
                bVar.f = null;
                g2b g2bVar = g2b.a;
                qr5Var.J = false;
                hu9.a.d(hu9VarA, hu9VarB, oh4VarE);
            } catch (Throwable th2) {
                hu9.a.d(hu9VarA, hu9VarB, oh4VarE);
                throw th2;
            }
        }
    }

    public final f4a.b e(Object obj) {
        return !this.t.e() ? new d() : new e(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(int i) {
        boolean z;
        boolean z2 = false;
        this.G = 0;
        List<qr5> listC = this.t.C();
        k37.a aVar = (k37.a) listC;
        int i2 = (aVar.t.v - this.H) - 1;
        if (i <= i2) {
            this.D.clear();
            if (i <= i2) {
                int i3 = i;
                while (true) {
                    b bVarD = this.y.d((qr5) aVar.get(i3));
                    bVarD.getClass();
                    this.D.t.a(bVarD.a);
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.v.a(this.D);
            hu9 hu9VarA = hu9.a.a();
            oh4<Object, g2b> oh4VarE = hu9VarA != null ? hu9VarA.e() : null;
            hu9 hu9VarB = hu9.a.b(hu9VarA);
            z = false;
            while (i2 >= i) {
                try {
                    qr5 qr5Var = (qr5) ((k37.a) listC).get(i2);
                    b bVarD2 = this.y.d(qr5Var);
                    bVarD2.getClass();
                    b bVar = bVarD2;
                    Object obj = bVar.a;
                    if (this.D.t.c(obj)) {
                        this.G++;
                        if (((Boolean) bVar.g.getValue()).booleanValue()) {
                            vr5 vr5Var = qr5Var.Z;
                            el6 el6Var = vr5Var.p;
                            qr5.f fVar = qr5.f.v;
                            el6Var.E = fVar;
                            hf6 hf6Var = vr5Var.q;
                            if (hf6Var != null) {
                                hf6Var.C = fVar;
                            }
                            l(bVar, false);
                            if (bVar.h) {
                                z = true;
                            }
                        }
                    } else {
                        qr5 qr5Var2 = this.t;
                        qr5Var2.J = true;
                        this.y.k(qr5Var);
                        qv8 qv8Var = bVar.c;
                        if (qv8Var != null) {
                            qv8Var.dispose();
                        }
                        this.t.b0(i2, 1);
                        g2b g2bVar = g2b.a;
                        qr5Var2.J = false;
                    }
                    this.z.k(obj);
                    i2--;
                } catch (Throwable th) {
                    hu9.a.d(hu9VarA, hu9VarB, oh4VarE);
                    throw th;
                }
            }
            g2b g2bVar2 = g2b.a;
            hu9.a.d(hu9VarA, hu9VarB, oh4VarE);
        } else {
            z = false;
        }
        if (z) {
            synchronized (qu9.c) {
                d37<m0a> d37Var = qu9.j.h;
                if (d37Var != null && d37Var.h()) {
                    z2 = true;
                }
            }
            if (z2) {
                qu9.a();
            }
        }
        h();
    }

    @Override // defpackage.ls1
    public final void g() {
        i(true);
    }

    public final void h() {
        int i = ((k37.a) this.t.C()).t.v;
        c37<qr5, b> c37Var = this.y;
        if (c37Var.e != i) {
            uc5.a("Inconsistency between the count of nodes tracked by the state (" + c37Var.e + ") and the children count on the SubcomposeLayout (" + i + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((i - this.G) - this.H < 0) {
            StringBuilder sbB = t43.b(i, "Incorrect state. Total children ", ". Reusable children ");
            sbB.append(this.G);
            sbB.append(". Precomposed children ");
            sbB.append(this.H);
            uc5.a(sbB.toString());
        }
        c37<Object, qr5> c37Var2 = this.C;
        if (c37Var2.e == this.H) {
            return;
        }
        uc5.a("Incorrect state. Precomposed children " + this.H + ". Map size " + c37Var2.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(boolean z) {
        this.H = 0;
        this.C.g();
        List<qr5> listC = this.t.C();
        int i = ((k37.a) listC).t.v;
        if (this.G != i) {
            this.G = i;
            hu9 hu9VarA = hu9.a.a();
            oh4<Object, g2b> oh4VarE = hu9VarA != null ? hu9VarA.e() : null;
            hu9 hu9VarB = hu9.a.b(hu9VarA);
            for (int i2 = 0; i2 < i; i2++) {
                try {
                    qr5 qr5Var = (qr5) ((k37.a) listC).get(i2);
                    b bVarD = this.y.d(qr5Var);
                    if (bVarD != null && ((Boolean) bVarD.g.getValue()).booleanValue()) {
                        vr5 vr5Var = qr5Var.Z;
                        el6 el6Var = vr5Var.p;
                        qr5.f fVar = qr5.f.v;
                        el6Var.E = fVar;
                        hf6 hf6Var = vr5Var.q;
                        if (hf6Var != null) {
                            hf6Var.C = fVar;
                        }
                        l(bVarD, z);
                        bVarD.a = c4a.a;
                    }
                } catch (Throwable th) {
                    hu9.a.d(hu9VarA, hu9VarB, oh4VarE);
                    throw th;
                }
            }
            g2b g2bVar = g2b.a;
            hu9.a.d(hu9VarA, hu9VarB, oh4VarE);
            this.z.g();
        }
        h();
    }

    public final void j(int i, int i2) {
        qr5 qr5Var = this.t;
        qr5Var.J = true;
        qr5Var.W(i, i2, 1);
        g2b g2bVar = g2b.a;
        qr5Var.J = false;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void k(Object obj, ci4<? super jt1, ? super Integer, g2b> ci4Var, boolean z) {
        qr5 qr5Var = this.t;
        if (qr5Var.e()) {
            h();
            if (this.z.b(obj)) {
                return;
            }
            this.E.k(obj);
            c37<Object, qr5> c37Var = this.C;
            Object objD = c37Var.d(obj);
            if (objD == null) {
                objD = n(obj);
                if (objD != null) {
                    j(((k37.a) qr5Var.C()).t.m((T) objD), ((k37.a) qr5Var.C()).t.v);
                    this.H++;
                } else {
                    int i = ((k37.a) qr5Var.C()).t.v;
                    qr5 qr5Var2 = new qr5(2);
                    qr5Var.J = true;
                    qr5Var.N(i, qr5Var2);
                    g2b g2bVar = g2b.a;
                    qr5Var.J = false;
                    this.H++;
                    objD = qr5Var2;
                }
                c37Var.m(obj, objD);
            }
            m((qr5) objD, obj, z, ci4Var);
        }
    }

    public final void l(b bVar, boolean z) {
        qv8 qv8Var;
        if (z || !bVar.h) {
            bVar.g = bl7.i(Boolean.FALSE);
        } else {
            bVar.g.setValue(Boolean.FALSE);
        }
        if (bVar.f != null) {
            d(bVar);
            return;
        }
        if (z) {
            qv8 qv8Var2 = bVar.c;
            if (qv8Var2 != null) {
                qv8Var2.deactivate();
                return;
            }
            return;
        }
        bm7 outOfFrameExecutor = ur5.a(this.t).getOutOfFrameExecutor();
        if (outOfFrameExecutor != null) {
            outOfFrameExecutor.z(new zr5(bVar));
        } else {
            if (bVar.h || (qv8Var = bVar.c) == null) {
                return;
            }
            qv8Var.deactivate();
        }
    }

    public final void m(qr5 qr5Var, Object obj, boolean z, ci4<? super jt1, ? super Integer, g2b> ci4Var) {
        gu1 gu1Var;
        qr5 qr5Var2 = this.t;
        c37<qr5, b> c37Var = this.y;
        b bVarD = c37Var.d(qr5Var);
        if (bVarD == null) {
            fr1 fr1Var = bs1.a;
            bVarD = new b();
            bVarD.a = obj;
            bVarD.b = fr1Var;
            bVarD.c = null;
            bVarD.g = bl7.i(Boolean.TRUE);
            c37Var.m(qr5Var, bVarD);
        }
        b bVar = bVarD;
        boolean z2 = bVar.b != ci4Var;
        if (bVar.f != null) {
            if (z2) {
                d(bVar);
            } else if (z) {
                return;
            } else {
                c(bVar, true);
            }
        }
        qv8 qv8Var = bVar.c;
        boolean zS = qv8Var != null ? qv8Var.s() : true;
        if (z2 || zS || bVar.d) {
            bVar.b = ci4Var;
            if (bVar.f != null) {
                uc5.a("new subcompose call while paused composition is still active");
            }
            hu9 hu9VarA = hu9.a.a();
            oh4<Object, g2b> oh4VarE = hu9VarA != null ? hu9VarA.e() : null;
            hu9 hu9VarB = hu9.a.b(hu9VarA);
            try {
                qr5Var2.J = true;
                qv8 qv8Var2 = bVar.c;
                yt1 yt1Var = this.u;
                if (yt1Var == null) {
                    uc5.c("parent composition reference not set");
                    throw new qp5();
                }
                if (qv8Var2 == null || qv8Var2.k()) {
                    if (z) {
                        ViewGroup.LayoutParams layoutParams = vqb.a;
                        gu1Var = new gu1(yt1Var, new j1b(qr5Var));
                    } else {
                        ViewGroup.LayoutParams layoutParams2 = vqb.a;
                        gu1Var = new gu1(yt1Var, new j1b(qr5Var));
                    }
                    qv8Var2 = gu1Var;
                }
                bVar.c = qv8Var2;
                ci4<? super jt1, ? super Integer, g2b> fr1Var2 = bVar.b;
                if (ur5.a(qr5Var2).getOutOfFrameExecutor() != null) {
                    bVar.h = false;
                } else {
                    bVar.h = true;
                    fr1Var2 = new fr1(true, 1524156494, new cs5(bVar, fr1Var2));
                }
                if (z) {
                    if (bVar.e) {
                        bVar.f = ((nu7) qv8Var2).i(fr1Var2);
                    } else {
                        bVar.f = ((nu7) qv8Var2).w(fr1Var2);
                    }
                } else if (bVar.e) {
                    qv8Var2.z(fr1Var2);
                } else {
                    qv8Var2.l(fr1Var2);
                }
                bVar.e = false;
                g2b g2bVar = g2b.a;
                qr5Var2.J = false;
                hu9.a.d(hu9VarA, hu9VarB, oh4VarE);
                bVar.d = false;
            } catch (Throwable th) {
                hu9.a.d(hu9VarA, hu9VarB, oh4VarE);
                throw th;
            }
        }
    }

    public final qr5 n(Object obj) {
        c37<qr5, b> c37Var;
        int i;
        if (this.G == 0) {
            return null;
        }
        k37.a aVar = (k37.a) this.t.C();
        int i2 = aVar.t.v - this.H;
        int i3 = i2 - this.G;
        int i4 = i2 - 1;
        int i5 = i4;
        while (true) {
            c37Var = this.y;
            if (i5 < i3) {
                i = -1;
                break;
            }
            b bVarD = c37Var.d((qr5) aVar.get(i5));
            bVarD.getClass();
            if (xj5.a(bVarD.a, obj)) {
                i = i5;
                break;
            }
            i5--;
        }
        if (i == -1) {
            while (true) {
                if (i4 < i3) {
                    i5 = i4;
                    break;
                }
                b bVarD2 = c37Var.d((qr5) aVar.get(i4));
                bVarD2.getClass();
                b bVar = bVarD2;
                Object obj2 = bVar.a;
                if (obj2 == c4a.a || this.v.b(obj, obj2)) {
                    bVar.a = obj;
                    i5 = i4;
                    i = i5;
                    break;
                }
                i4--;
            }
        }
        if (i == -1) {
            return null;
        }
        if (i5 != i3) {
            j(i5, i3);
        }
        this.G--;
        qr5 qr5Var = (qr5) aVar.get(i3);
        b bVarD3 = c37Var.d(qr5Var);
        bVarD3.getClass();
        b bVar2 = bVarD3;
        bVar2.g = bl7.i(Boolean.TRUE);
        bVar2.e = true;
        bVar2.d = true;
        return qr5Var;
    }

    @Override // defpackage.ls1
    public final void p() {
        i(false);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d implements f4a.b {
        @Override // f4a.b
        public final void dispose() {
        }
    }
}
