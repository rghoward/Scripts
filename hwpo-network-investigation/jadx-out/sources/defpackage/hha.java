package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hha extends ox6.c implements ju1, lr5 {
    public final wja H;
    public yz9<? extends Object> I;
    public fha J;

    public hha(wja wjaVar) {
        this.H = wjaVar;
    }

    @Override // defpackage.dw2
    public final void H0() {
        fha fhaVar = this.J;
        if (fhaVar != null) {
            fha.a(fhaVar, ew2.f(this).S, null, null, 30);
        }
        ew2.f(this).Q();
    }

    @Override // ox6.c
    public final boolean R1() {
        return false;
    }

    @Override // ox6.c
    public final void U1() {
        wja wjaVarD = zu1.d(this.H, ew2.f(this).S);
        qa4.a aVar = (qa4.a) ku1.a(this, qu1.k);
        c2(wjaVarD, aVar);
        tq5 tq5Var = ew2.f(this).S;
        tx2 tx2Var = ew2.f(this).R;
        yz9<? extends Object> yz9Var = this.I;
        if (yz9Var == null) {
            throw x70.a("Font resolution state is not set.");
        }
        this.J = new fha(tq5Var, tx2Var, aVar, wjaVarD, yz9Var.getValue());
    }

    @Override // ox6.c
    public final void V1() {
        this.I = null;
        this.J = null;
    }

    public final void c2(wja wjaVar, qa4.a aVar) {
        ww9 ww9Var = wjaVar.a;
        qa4 qa4Var = ww9Var.f;
        ob4 ob4Var = ww9Var.c;
        if (ob4Var == null) {
            ob4Var = ob4.y;
        }
        mb4 mb4Var = ww9Var.d;
        int i = mb4Var != null ? mb4Var.a : 0;
        nb4 nb4Var = ww9Var.e;
        this.I = aVar.a(qa4Var, ob4Var, i, nb4Var != null ? nb4Var.a : 65535);
        ew2.f(this).Q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lr5
    public final gl6 e(hl6 hl6Var, cl6 cl6Var, long j) {
        fha fhaVar = this.J;
        if (fhaVar == null) {
            throw x70.a("Min size state is not set.");
        }
        dt7 dt7Var = fhaVar.f;
        yz9<? extends Object> yz9Var = this.I;
        if (yz9Var == null) {
            throw x70.a("Font resolution state is not set.");
        }
        Object value = yz9Var.getValue();
        if (!xj5.a(value, fhaVar.e)) {
            fhaVar.e = value;
            dt7Var.setValue(Boolean.TRUE);
        }
        if (((Boolean) dt7Var.getValue()).booleanValue()) {
            fhaVar.g = bea.a(fhaVar.d, fhaVar.b, fhaVar.c, bea.a, 1);
            dt7Var.setValue(Boolean.FALSE);
        }
        long j2 = fhaVar.g;
        jz7 jz7VarE = cl6Var.E(zx1.e(j, zx1.b((int) (j2 >> 32), 0, (int) (j2 & 4294967295L), 0, 10)));
        return hl6Var.y0(jz7VarE.t, jz7VarE.u, if3.t, new i05(1, jz7VarE));
    }

    @Override // defpackage.dw2
    public final void l() {
        fha fhaVar = this.J;
        if (fhaVar != null) {
            fha.a(fhaVar, null, ew2.f(this).R, null, 29);
        }
        ew2.f(this).Q();
    }
}
