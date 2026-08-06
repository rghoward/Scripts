package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bdb extends es7 {
    public final ocb A;
    public final dt7 B;
    public float C;
    public wh1 D;
    public final dt7 y;
    public final dt7 z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends wp5 implements mh4<g2b> {
        public a() {
            super(0);
        }

        @Override // defpackage.mh4
        public final g2b invoke() {
            g2b g2bVar = g2b.a;
            bdb.this.B.setValue(g2bVar);
            return g2bVar;
        }
    }

    public bdb(ap4 ap4Var) {
        this.y = bl7.i(new cr9(0L));
        this.z = bl7.i(Boolean.FALSE);
        ocb ocbVar = new ocb(ap4Var);
        ocbVar.f = new a();
        this.A = ocbVar;
        this.B = new dt7(g2b.a, ha7.u);
        this.C = 1.0f;
    }

    @Override // defpackage.es7
    public final boolean a(float f) {
        this.C = f;
        return true;
    }

    @Override // defpackage.es7
    public final boolean e(wh1 wh1Var) {
        this.D = wh1Var;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.es7
    public final long h() {
        return ((cr9) this.y.getValue()).a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.es7
    public final void i(d73 d73Var) {
        wh1 wh1Var = this.D;
        ocb ocbVar = this.A;
        if (wh1Var == null) {
            wh1Var = (wh1) ocbVar.g.getValue();
        }
        if (((Boolean) this.z.getValue()).booleanValue() && d73Var.getLayoutDirection() == tq5.u) {
            long jU1 = d73Var.u1();
            s41.b bVarY0 = d73Var.Y0();
            long jD = bVarY0.d();
            bVarY0.a().f();
            try {
                bVarY0.a.e(-1.0f, 1.0f, jU1);
                ocbVar.e(d73Var, this.C, wh1Var);
                x3.b(bVarY0, jD);
            } catch (Throwable th) {
                x3.b(bVarY0, jD);
                throw th;
            }
        } else {
            ocbVar.e(d73Var, this.C, wh1Var);
        }
        this.B.getValue();
        g2b g2bVar = g2b.a;
    }

    public bdb() {
        this(new ap4());
    }
}
