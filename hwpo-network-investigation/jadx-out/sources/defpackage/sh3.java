package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class sh3 extends or5 {
    public tva<wg3> H;
    public tva<wg3>.a<kg5, cw> I;
    public tva<wg3>.a<bg5, cw> J;
    public tva<wg3>.a<bg5, cw> K;
    public th3 L;
    public jo3 M;
    public mh4<Boolean> N;
    public lo4 O;
    public long P = -9223372034707292160L;
    public di Q;
    public final h R;
    public final i S;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends wp5 implements oh4<jz7.a, g2b> {
        public final /* synthetic */ jz7 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(jz7 jz7Var) {
            super(1);
            this.u = jz7Var;
        }

        @Override // defpackage.oh4
        public final g2b invoke(jz7.a aVar) {
            aVar.l(this.u, 0, 0, 0.0f);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends wp5 implements oh4<jz7.a, g2b> {
        public final /* synthetic */ jz7 u;
        public final /* synthetic */ long v;
        public final /* synthetic */ long w;
        public final /* synthetic */ oh4<ro4, g2b> x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(jz7 jz7Var, long j, long j2, oh4<? super ro4, g2b> oh4Var) {
            super(1);
            this.u = jz7Var;
            this.v = j;
            this.w = j2;
            this.x = oh4Var;
        }

        @Override // defpackage.oh4
        public final g2b invoke(jz7.a aVar) {
            jz7.a aVar2 = aVar;
            long j = this.v;
            long j2 = this.w;
            aVar2.getClass();
            jz7 jz7Var = this.u;
            jz7.a.e(jz7Var, aVar2);
            jz7Var.i0(bg5.d((((long) (((int) (j >> 32)) + ((int) (j2 >> 32)))) << 32) | (((long) (((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L), jz7Var.x), 0.0f, this.x);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c extends wp5 implements oh4<jz7.a, g2b> {
        public final /* synthetic */ jz7 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(jz7 jz7Var) {
            super(1);
            this.u = jz7Var;
        }

        @Override // defpackage.oh4
        public final g2b invoke(jz7.a aVar) {
            aVar.l(this.u, 0, 0, 0.0f);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d extends wp5 implements oh4<wg3, kg5> {
        public final /* synthetic */ long v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j) {
            super(1);
            this.v = j;
        }

        @Override // defpackage.oh4
        public final kg5 invoke(wg3 wg3Var) {
            int iOrdinal = wg3Var.ordinal();
            sh3 sh3Var = sh3.this;
            long j = this.v;
            if (iOrdinal == 0) {
                o91 o91Var = sh3Var.L.a().c;
                if (o91Var != null) {
                    j = o91Var.b.invoke(new kg5(j)).a;
                }
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    u.b();
                    return null;
                }
                o91 o91Var2 = sh3Var.M.a().c;
                if (o91Var2 != null) {
                    j = o91Var2.b.invoke(new kg5(j)).a;
                }
            }
            return new kg5(j);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class e extends wp5 implements oh4<tva.b<wg3>, a04<bg5>> {
        public static final e u = new e(1);

        @Override // defpackage.oh4
        public final a04<bg5> invoke(tva.b<wg3> bVar) {
            return zg3.c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class f extends wp5 implements oh4<wg3, bg5> {
        public final /* synthetic */ long v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(long j) {
            super(1);
            this.v = j;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0064  */
        @Override // defpackage.oh4
        public final bg5 invoke(wg3 wg3Var) {
            long jC;
            int iOrdinal;
            wg3 wg3Var2 = wg3Var;
            sh3 sh3Var = sh3.this;
            if (sh3Var.Q == null || sh3Var.c2() == null || xj5.a(sh3Var.Q, sh3Var.c2()) || (iOrdinal = wg3Var2.ordinal()) == 0 || iOrdinal == 1) {
                jC = 0;
            } else {
                if (iOrdinal != 2) {
                    u.b();
                    return null;
                }
                o91 o91Var = sh3Var.M.a().c;
                if (o91Var != null) {
                    oh4<kg5, kg5> oh4Var = o91Var.b;
                    long j = this.v;
                    long j2 = oh4Var.invoke(new kg5(j)).a;
                    di diVarC2 = sh3Var.c2();
                    diVarC2.getClass();
                    tq5 tq5Var = tq5.t;
                    long jA = diVarC2.a(j, j2, tq5Var);
                    di diVar = sh3Var.Q;
                    diVar.getClass();
                    jC = bg5.c(jA, diVar.a(j, j2, tq5Var));
                } else {
                    jC = 0;
                }
            }
            return new bg5(jC);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class g extends wp5 implements oh4<wg3, bg5> {
        public final /* synthetic */ long v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(long j) {
            super(1);
            this.v = j;
        }

        @Override // defpackage.oh4
        public final bg5 invoke(wg3 wg3Var) {
            wg3 wg3Var2 = wg3Var;
            sh3 sh3Var = sh3.this;
            sr9 sr9Var = sh3Var.L.a().b;
            long j = this.v;
            long j2 = 0;
            long j3 = sr9Var != null ? sr9Var.a.invoke(new kg5(j)).a : 0L;
            sr9 sr9Var2 = sh3Var.M.a().b;
            long j4 = sr9Var2 != null ? sr9Var2.a.invoke(new kg5(j)).a : 0L;
            int iOrdinal = wg3Var2.ordinal();
            if (iOrdinal == 0) {
                j2 = j3;
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    u.b();
                    return null;
                }
                j2 = j4;
            }
            return new bg5(j2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class h extends wp5 implements oh4<tva.b<wg3>, a04<kg5>> {
        public h() {
            super(1);
        }

        @Override // defpackage.oh4
        public final a04<kg5> invoke(tva.b<wg3> bVar) {
            tva.b<wg3> bVar2 = bVar;
            wg3 wg3Var = wg3.t;
            wg3 wg3Var2 = wg3.u;
            boolean zC = bVar2.c(wg3Var, wg3Var2);
            a04<kg5> a04Var = null;
            sh3 sh3Var = sh3.this;
            if (zC) {
                o91 o91Var = sh3Var.L.a().c;
                if (o91Var != null) {
                    a04Var = o91Var.c;
                }
            } else if (bVar2.c(wg3Var2, wg3.v)) {
                o91 o91Var2 = sh3Var.M.a().c;
                if (o91Var2 != null) {
                    a04Var = o91Var2.c;
                }
            } else {
                a04Var = zg3.d;
            }
            return a04Var == null ? zg3.d : a04Var;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class i extends wp5 implements oh4<tva.b<wg3>, a04<bg5>> {
        public i() {
            super(1);
        }

        @Override // defpackage.oh4
        public final a04<bg5> invoke(tva.b<wg3> bVar) {
            a04<bg5> a04Var;
            a04<bg5> a04Var2;
            tva.b<wg3> bVar2 = bVar;
            wg3 wg3Var = wg3.t;
            wg3 wg3Var2 = wg3.u;
            boolean zC = bVar2.c(wg3Var, wg3Var2);
            sh3 sh3Var = sh3.this;
            if (zC) {
                sr9 sr9Var = sh3Var.L.a().b;
                return (sr9Var == null || (a04Var2 = sr9Var.b) == null) ? zg3.c : a04Var2;
            }
            if (!bVar2.c(wg3Var2, wg3.v)) {
                return zg3.c;
            }
            sr9 sr9Var2 = sh3Var.M.a().b;
            return (sr9Var2 == null || (a04Var = sr9Var2.b) == null) ? zg3.c : a04Var;
        }
    }

    public sh3(tva<wg3> tvaVar, tva<wg3>.a<kg5, cw> aVar, tva<wg3>.a<bg5, cw> aVar2, tva<wg3>.a<bg5, cw> aVar3, th3 th3Var, jo3 jo3Var, mh4<Boolean> mh4Var, lo4 lo4Var) {
        this.H = tvaVar;
        this.I = aVar;
        this.J = aVar2;
        this.K = aVar3;
        this.L = th3Var;
        this.M = jo3Var;
        this.N = mh4Var;
        this.O = lo4Var;
        zx1.b(0, 0, 0, 0, 15);
        this.R = new h();
        this.S = new i();
    }

    @Override // ox6.c
    public final void U1() {
        this.P = -9223372034707292160L;
    }

    public final di c2() {
        di diVar;
        di diVar2;
        if (this.H.f().c(wg3.t, wg3.u)) {
            o91 o91Var = this.L.a().c;
            if (o91Var != null && (diVar2 = o91Var.a) != null) {
                return diVar2;
            }
            o91 o91Var2 = this.M.a().c;
            if (o91Var2 != null) {
                return o91Var2.a;
            }
            return null;
        }
        o91 o91Var3 = this.M.a().c;
        if (o91Var3 != null && (diVar = o91Var3.a) != null) {
            return diVar;
        }
        o91 o91Var4 = this.L.a().c;
        if (o91Var4 != null) {
            return o91Var4.a;
        }
        return null;
    }

    @Override // defpackage.lr5
    public final gl6 e(hl6 hl6Var, cl6 cl6Var, long j) {
        tva.a.C0252a c0252aA;
        long j2;
        long j3;
        if (this.H.a.b() == this.H.d.getValue()) {
            this.Q = null;
        } else if (this.Q == null) {
            di diVarC2 = c2();
            if (diVarC2 == null) {
                diVarC2 = di.a.a;
            }
            this.Q = diVarC2;
        }
        boolean zP0 = hl6Var.P0();
        if3 if3Var = if3.t;
        if (zP0) {
            jz7 jz7VarE = cl6Var.E(j);
            long j4 = (((long) jz7VarE.t) << 32) | (((long) jz7VarE.u) & 4294967295L);
            this.P = j4;
            return hl6Var.y0((int) (j4 >> 32), (int) (j4 & 4294967295L), if3Var, new a(jz7VarE));
        }
        if (!this.N.invoke().booleanValue()) {
            jz7 jz7VarE2 = cl6Var.E(j);
            return hl6Var.y0(jz7VarE2.t, jz7VarE2.u, if3Var, new c(jz7VarE2));
        }
        ch3 ch3VarA = this.O.a();
        jz7 jz7VarE3 = cl6Var.E(j);
        long j5 = (((long) jz7VarE3.t) << 32) | (((long) jz7VarE3.u) & 4294967295L);
        long j6 = !kg5.b(this.P, -9223372034707292160L) ? this.P : j5;
        tva<wg3>.a<kg5, cw> aVar = this.I;
        if (aVar != null) {
            c0252aA = aVar.a(this.R, new d(j6));
        } else {
            c0252aA = null;
        }
        if (c0252aA != null) {
            j5 = ((kg5) c0252aA.getValue()).a;
        }
        long jD = zx1.d(j, j5);
        tva<wg3>.a<bg5, cw> aVar2 = this.J;
        long jA = 0;
        if (aVar2 != null) {
            j2 = ((bg5) aVar2.a(e.u, new f(j6)).getValue()).a;
        } else {
            j2 = 0;
        }
        tva<wg3>.a<bg5, cw> aVar3 = this.K;
        if (aVar3 != null) {
            j3 = ((bg5) aVar3.a(this.S, new g(j6)).getValue()).a;
        } else {
            j3 = 0;
        }
        di diVar = this.Q;
        if (diVar != null) {
            jA = diVar.a(j6, jD, tq5.t);
        }
        return hl6Var.y0((int) (jD >> 32), (int) (jD & 4294967295L), if3Var, new b(jz7VarE3, bg5.d(jA, j3), j2, ch3VarA));
    }
}
