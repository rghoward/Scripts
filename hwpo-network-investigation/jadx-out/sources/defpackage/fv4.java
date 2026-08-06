package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fv4 extends ox6.c implements ju1, lr5, rf7 {
    public wja H;
    public int I;
    public int J;
    public boolean K;
    public int L;
    public int M;
    public wja N;
    public yz9<? extends Object> O;

    @Override // defpackage.dw2
    public final void H0() {
        this.N = zu1.d(this.H, ew2.f(this).S);
        this.K = true;
        ew2.f(this).Q();
    }

    @Override // ox6.c
    public final boolean R1() {
        return false;
    }

    @Override // ox6.c
    public final void U1() {
        qa4.a aVar = (qa4.a) ku1.a(this, qu1.k);
        this.N = zu1.d(this.H, ew2.f(this).S);
        qa4 qa4Var = c2().a.f;
        ob4 ob4Var = c2().a.c;
        if (ob4Var == null) {
            ob4Var = ob4.y;
        }
        mb4 mb4Var = c2().a.d;
        int i = mb4Var != null ? mb4Var.a : 0;
        nb4 nb4Var = c2().a.e;
        this.O = aVar.a(qa4Var, ob4Var, i, nb4Var != null ? nb4Var.a : 65535);
        sf7.a(this, new hw0(1, this));
        this.K = true;
    }

    @Override // ox6.c
    public final void V1() {
        this.N = null;
        this.O = null;
        this.K = false;
    }

    public final wja c2() {
        wja wjaVar = this.N;
        if (wjaVar != null) {
            return wjaVar;
        }
        throw x70.a("Resolved style is not set.");
    }

    @Override // defpackage.lr5
    public final gl6 e(hl6 hl6Var, cl6 cl6Var, long j) {
        if (this.K) {
            wja wjaVarC2 = c2();
            qa4.a aVar = (qa4.a) ku1.a(this, qu1.k);
            String str = bea.a;
            int iA = (int) (bea.a(wjaVarC2, hl6Var, aVar, str, 1) & 4294967295L);
            int iA2 = ((int) (bea.a(wjaVarC2, hl6Var, aVar, str + '\n' + str, 2) & 4294967295L)) - iA;
            int i = this.I;
            this.L = i == 1 ? -1 : ((i - 1) * iA2) + iA;
            int i2 = this.J;
            this.M = i2 == Integer.MAX_VALUE ? -1 : ((i2 - 1) * iA2) + iA;
            this.K = false;
        }
        int i3 = this.L;
        int iG = i3 != -1 ? uh8.g(i3, xx1.i(j), xx1.g(j)) : xx1.i(j);
        int i4 = this.M;
        jz7 jz7VarE = cl6Var.E(xx1.a(0, 0, iG, i4 != -1 ? uh8.g(i4, xx1.i(j), xx1.g(j)) : xx1.g(j), 3, j));
        return hl6Var.y0(jz7VarE.t, jz7VarE.u, if3.t, new ev4(0, jz7VarE));
    }

    @Override // defpackage.rf7
    public final void e1() {
        if (this.O != null) {
            sf7.a(this, new dv4(0, this));
        }
        this.K = true;
        ew2.f(this).Q();
    }

    @Override // defpackage.dw2
    public final void l() {
        this.K = true;
        ew2.f(this).Q();
    }
}
