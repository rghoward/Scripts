package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class er9 extends or5 {
    public wv<kg5> H;
    public di I;
    public boolean L;
    public long J = -9223372034707292160L;
    public long K = zx1.b(0, 0, 0, 0, 15);
    public final dt7 M = bl7.i(null);

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final qt<kg5, cw> a;
        public long b;

        public a() {
            throw null;
        }

        public a(qt qtVar, long j) {
            this.a = qtVar;
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return xj5.a(this.a, aVar.a) && kg5.b(this.b, aVar.b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "AnimData(anim=" + this.a + ", startSize=" + ((Object) kg5.c(this.b)) + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends wp5 implements oh4<jz7.a, g2b> {
        public final /* synthetic */ long v;
        public final /* synthetic */ int w;
        public final /* synthetic */ int x;
        public final /* synthetic */ hl6 y;
        public final /* synthetic */ jz7 z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, int i, int i2, hl6 hl6Var, jz7 jz7Var) {
            super(1);
            this.v = j;
            this.w = i;
            this.x = i2;
            this.y = hl6Var;
            this.z = jz7Var;
        }

        @Override // defpackage.oh4
        public final g2b invoke(jz7.a aVar) {
            jz7.a.q(aVar, this.z, er9.this.I.a(this.v, (((long) this.x) & 4294967295L) | (((long) this.w) << 32), this.y.getLayoutDirection()));
            return g2b.a;
        }
    }

    public er9(xya xyaVar, sp0 sp0Var) {
        this.H = xyaVar;
        this.I = sp0Var;
    }

    @Override // ox6.c
    public final void U1() {
        this.J = -9223372034707292160L;
        this.L = false;
    }

    @Override // ox6.c
    public final void W1() {
        this.M.setValue(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lr5
    public final gl6 e(hl6 hl6Var, cl6 cl6Var, long j) {
        jz7 jz7VarE;
        a aVar;
        long jD;
        a aVar2;
        if (hl6Var.P0()) {
            this.K = j;
            this.L = true;
            jz7VarE = cl6Var.E(j);
        } else {
            jz7VarE = cl6Var.E(this.L ? this.K : j);
        }
        jz7 jz7Var = jz7VarE;
        char c = ' ';
        long j2 = (((long) jz7Var.u) & 4294967295L) | (((long) jz7Var.t) << 32);
        if (hl6Var.P0()) {
            this.J = j2;
            c = ' ';
            jD = j2;
            j2 = jD;
        } else {
            long j3 = !kg5.b(this.J, -9223372034707292160L) ? this.J : j2;
            dt7 dt7Var = this.M;
            a aVar3 = (a) dt7Var.getValue();
            if (aVar3 != null) {
                qt<kg5, cw> qtVar = aVar3.a;
                boolean z = (kg5.b(j3, qtVar.d().a) || ((Boolean) qtVar.d.getValue()).booleanValue()) ? false : true;
                if (!kg5.b(j3, ((kg5) qtVar.e.getValue()).a) || z) {
                    aVar3.b = qtVar.d().a;
                    aVar2 = aVar3;
                    oy0.d(Q1(), null, null, new fr9(aVar2, j3, this, null), 3);
                } else {
                    aVar2 = aVar3;
                }
                aVar = aVar2;
            } else {
                long j4 = j3;
                aVar = new a(new qt(new kg5(j4), b0a.C, new kg5(4294967297L), 8), j4);
            }
            dt7Var.setValue(aVar);
            jD = zx1.d(j, aVar.a.d().a);
        }
        int i = (int) (jD >> c);
        int i2 = (int) (jD & 4294967295L);
        return hl6Var.y0(i, i2, if3.t, new b(j2, i, i2, hl6Var, jz7Var));
    }
}
