package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class su<S> implements ru<S> {
    public final tva<S> a;
    public di b;
    public final dt7 c = bl7.i(new kg5(0));
    public final c37<S, yz9<kg5>> d = z39.b();
    public tva.a.C0252a e;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b<S> extends vx6<c<S>> {
        public final tva<S>.a<kg5, cw> t;
        public final h37 u;
        public final su<S> v;

        public b(tva.a aVar, h37 h37Var, su suVar) {
            this.t = aVar;
            this.u = h37Var;
            this.v = suVar;
        }

        @Override // defpackage.vx6
        public final ox6.c a() {
            c cVar = new c();
            cVar.H = this.t;
            cVar.I = this.u;
            cVar.J = this.v;
            cVar.K = -9223372034707292160L;
            return cVar;
        }

        @Override // defpackage.vx6
        public final void b(ox6.c cVar) {
            c cVar2 = (c) cVar;
            cVar2.H = this.t;
            cVar2.I = this.u;
            cVar2.J = this.v;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return xj5.a(bVar.t, this.t) && xj5.a(bVar.u, this.u);
        }

        public final int hashCode() {
            int iHashCode = this.v.hashCode() * 31;
            tva<S>.a<kg5, cw> aVar = this.t;
            return this.u.hashCode() + ((iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 31);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c<S> extends or5 {
        public tva<S>.a<kg5, cw> H;
        public h37 I;
        public su<S> J;
        public long K;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class a extends wp5 implements oh4<jz7.a, g2b> {
            public final /* synthetic */ c<S> u;
            public final /* synthetic */ jz7 v;
            public final /* synthetic */ long w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c<S> cVar, jz7 jz7Var, long j) {
                super(1);
                this.u = cVar;
                this.v = jz7Var;
                this.w = j;
            }

            @Override // defpackage.oh4
            public final g2b invoke(jz7.a aVar) {
                di diVar = this.u.J.b;
                jz7 jz7Var = this.v;
                jz7.a.q(aVar, jz7Var, diVar.a((((long) jz7Var.u) & 4294967295L) | (((long) jz7Var.t) << 32), this.w, tq5.t));
                return g2b.a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class b extends wp5 implements oh4<tva.b<S>, a04<kg5>> {
            public final /* synthetic */ c<S> u;
            public final /* synthetic */ long v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(c<S> cVar, long j) {
                super(1);
                this.u = cVar;
                this.v = j;
            }

            @Override // defpackage.oh4
            public final a04<kg5> invoke(Object obj) {
                long j;
                a04<kg5> a04VarA;
                tva.b bVar = (tva.b) obj;
                Object objD = bVar.d();
                c<S> cVar = this.u;
                if (xj5.a(objD, cVar.J.d())) {
                    j = kg5.b(cVar.K, -9223372034707292160L) ? this.v : cVar.K;
                } else {
                    yz9<kg5> yz9VarD = cVar.J.d.d((S) bVar.d());
                    j = yz9VarD != null ? yz9VarD.getValue().a : 0L;
                }
                yz9<kg5> yz9VarD2 = cVar.J.d.d((S) bVar.f());
                long j2 = yz9VarD2 != null ? yz9VarD2.getValue().a : 0L;
                mr9 mr9Var = (mr9) cVar.I.getValue();
                return (mr9Var == null || (a04VarA = mr9Var.a(j, j2)) == null) ? xv.b(0.0f, 400.0f, null, 5) : a04VarA;
            }
        }

        /* JADX INFO: renamed from: su$c$c, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class C0247c extends wp5 implements oh4<S, kg5> {
            public final /* synthetic */ c<S> u;
            public final /* synthetic */ long v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0247c(c<S> cVar, long j) {
                super(1);
                this.u = cVar;
                this.v = j;
            }

            @Override // defpackage.oh4
            public final kg5 invoke(Object obj) {
                long j;
                c<S> cVar = this.u;
                if (xj5.a(obj, cVar.J.d())) {
                    j = kg5.b(cVar.K, -9223372034707292160L) ? this.v : cVar.K;
                } else {
                    yz9<kg5> yz9VarD = cVar.J.d.d(obj);
                    j = yz9VarD != null ? yz9VarD.getValue().a : 0L;
                }
                return new kg5(j);
            }
        }

        public c() {
            throw null;
        }

        @Override // ox6.c
        public final void W1() {
            this.K = -9223372034707292160L;
        }

        @Override // defpackage.lr5
        public final gl6 e(hl6 hl6Var, cl6 cl6Var, long j) {
            long j2;
            jz7 jz7VarE = cl6Var.E(j);
            if (hl6Var.P0()) {
                j2 = (((long) jz7VarE.t) << 32) | (((long) jz7VarE.u) & 4294967295L);
            } else {
                tva<S>.a<kg5, cw> aVar = this.H;
                int i = jz7VarE.t;
                if (aVar == null) {
                    j2 = (((long) i) << 32) | (((long) jz7VarE.u) & 4294967295L);
                    this.K = j2;
                } else {
                    long j3 = (((long) jz7VarE.u) & 4294967295L) | (((long) i) << 32);
                    tva.a.C0252a c0252aA = aVar.a(new b(this, j3), new C0247c(this, j3));
                    this.J.e = c0252aA;
                    j2 = ((kg5) c0252aA.getValue()).a;
                    this.K = ((kg5) c0252aA.getValue()).a;
                }
            }
            return hl6Var.y0((int) (j2 >> 32), (int) (4294967295L & j2), if3.t, new a(this, jz7VarE, j2));
        }
    }

    public su(tva<S> tvaVar, di diVar, tq5 tq5Var) {
        this.a = tvaVar;
        this.b = diVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final long g(su suVar) {
        tva.a.C0252a c0252a = suVar.e;
        return c0252a != null ? ((kg5) c0252a.getValue()).a : ((kg5) suVar.c.getValue()).a;
    }

    @Override // defpackage.ru
    public final oz1 a(oz1 oz1Var, nr9 nr9Var) {
        oz1Var.d = nr9Var;
        return oz1Var;
    }

    @Override // defpackage.ru
    public final ko3 b(xya xyaVar, oh4 oh4Var) {
        return zg3.k(xyaVar, new uu(this, oh4Var));
    }

    @Override // tva.b
    public final S d() {
        return this.a.f().d();
    }

    @Override // defpackage.ru
    public final uh3 e(xya xyaVar, oh4 oh4Var) {
        return zg3.i(xyaVar, new tu(this, oh4Var));
    }

    @Override // tva.b
    public final S f() {
        return this.a.f().f();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements ft7 {
        public final dt7 t;

        public a(boolean z) {
            this.t = bl7.i(Boolean.valueOf(z));
        }

        @Override // defpackage.ft7
        public final Object h0() {
            return this;
        }
    }
}
