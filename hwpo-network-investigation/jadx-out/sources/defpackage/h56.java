package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class h56 extends ox6.c implements u18, ju1, bn4, n56.a {
    public n56 H;
    public u56 I;
    public qga J;
    public final dt7 K = bl7.i(null);

    public h56(n56 n56Var, u56 u56Var, qga qgaVar) {
        this.H = n56Var;
        this.I = u56Var;
        this.J = qgaVar;
    }

    @Override // n56.a
    public final dz9 B(yo yoVar) {
        if (!this.G) {
            return null;
        }
        return oy0.d(Q1(), null, x72.w, new g56(this, yoVar, null), 1);
    }

    @Override // n56.a
    public final u56 D1() {
        return this.I;
    }

    @Override // defpackage.bn4
    public final void Q0(mb7 mb7Var) {
        this.K.setValue(mb7Var);
    }

    @Override // n56.a
    public final qq5 S() {
        return (qq5) this.K.getValue();
    }

    @Override // ox6.c
    public final void U1() {
        n56 n56Var = this.H;
        if (n56Var.a != null) {
            xc5.c("Expected textInputModifierNode to be null");
        }
        n56Var.a = this;
    }

    @Override // ox6.c
    public final void V1() {
        this.H.j(this);
    }

    @Override // n56.a
    public final xv9 getSoftwareKeyboardController() {
        return (xv9) ku1.a(this, qu1.q);
    }

    @Override // n56.a
    public final lgb getViewConfiguration() {
        return (lgb) ku1.a(this, qu1.t);
    }

    @Override // n56.a
    public final qga r0() {
        return this.J;
    }
}
