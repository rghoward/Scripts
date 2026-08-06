package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class b79 extends gw2 implements ju1, rf7 {
    public s79 J;
    public fl7 K;
    public boolean L;
    public g44 M;
    public h27 N;
    public pw0 O;
    public boolean P;
    public in7 Q;
    public n79 R;
    public dw2 S;
    public jn7 T;
    public in7 U;
    public boolean V;

    @Override // defpackage.dw2
    public final void H0() {
        boolean zG2 = g2();
        if (this.V != zG2) {
            this.V = zG2;
            s79 s79Var = this.J;
            fl7 fl7Var = this.K;
            boolean z = this.P;
            in7 in7Var = z ? this.U : this.Q;
            h2(this.O, this.M, this.N, fl7Var, in7Var, s79Var, z, this.L);
        }
    }

    @Override // ox6.c
    public final boolean R1() {
        return false;
    }

    @Override // ox6.c
    public final void U1() {
        this.V = g2();
        f2();
        if (this.R == null) {
            s79 s79Var = this.J;
            in7 in7Var = this.P ? this.U : this.Q;
            n79 n79Var = new n79(this.O, this.M, this.N, this.K, in7Var, s79Var, this.L, this.V);
            c2(n79Var);
            this.R = n79Var;
        }
    }

    @Override // ox6.c
    public final void V1() {
        dw2 dw2Var = this.S;
        if (dw2Var != null) {
            d2(dw2Var);
        }
    }

    @Override // defpackage.rf7
    public final void e1() {
        jn7 jn7Var = (jn7) ku1.a(this, kn7.a);
        if (xj5.a(jn7Var, this.T)) {
            return;
        }
        this.T = jn7Var;
        this.U = null;
        dw2 dw2Var = this.S;
        if (dw2Var != null) {
            d2(dw2Var);
        }
        this.S = null;
        f2();
        n79 n79Var = this.R;
        if (n79Var != null) {
            s79 s79Var = this.J;
            fl7 fl7Var = this.K;
            in7 in7Var = this.P ? this.U : this.Q;
            n79Var.x2(this.O, this.M, this.N, fl7Var, in7Var, s79Var, this.L, this.V);
        }
    }

    public final void f2() {
        dw2 dw2Var = this.S;
        if (dw2Var != null) {
            if (dw2Var.q().G) {
                return;
            }
            c2(dw2Var);
            return;
        }
        if (this.P) {
            sf7.a(this, new mh4() { // from class: a79
                @Override // defpackage.mh4
                public final Object invoke() {
                    uu1 uu1Var = kn7.a;
                    b79 b79Var = this.t;
                    jn7 jn7Var = (jn7) ku1.a(b79Var, uu1Var);
                    b79Var.T = jn7Var;
                    b79Var.U = jn7Var != null ? jn7Var.a() : null;
                    return g2b.a;
                }
            });
        }
        in7 in7Var = this.P ? this.U : this.Q;
        if (in7Var != null) {
            dw2 dw2VarQ = in7Var.q();
            if (dw2VarQ.q().G) {
                return;
            }
            c2(dw2VarQ);
            this.S = dw2VarQ;
        }
    }

    public final boolean g2() {
        return (this.G ? ew2.f(this).S : tq5.t) != tq5.u || this.K == fl7.t;
    }

    public final void h2(pw0 pw0Var, g44 g44Var, h27 h27Var, fl7 fl7Var, in7 in7Var, s79 s79Var, boolean z, boolean z2) {
        boolean z3;
        this.J = s79Var;
        this.K = fl7Var;
        boolean z4 = true;
        if (this.P != z) {
            this.P = z;
            z3 = true;
        } else {
            z3 = false;
        }
        if (xj5.a(this.Q, in7Var)) {
            z4 = false;
        } else {
            this.Q = in7Var;
        }
        if (z3 || (z4 && !z)) {
            dw2 dw2Var = this.S;
            if (dw2Var != null) {
                d2(dw2Var);
            }
            this.S = null;
            f2();
        }
        this.L = z2;
        this.M = g44Var;
        this.N = h27Var;
        this.O = pw0Var;
        boolean zG2 = g2();
        this.V = zG2;
        n79 n79Var = this.R;
        if (n79Var != null) {
            n79Var.x2(pw0Var, g44Var, h27Var, fl7Var, this.P ? this.U : this.Q, s79Var, z2, zG2);
        }
    }
}
