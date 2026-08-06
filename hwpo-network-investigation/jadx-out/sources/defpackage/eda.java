package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class eda extends gw2 implements ju1, gca {
    public mqa J;
    public oh4<? super r02<? super g2b>, ? extends Object> K;
    public oh4<? super r02<? super g2b>, ? extends Object> L;
    public oh4<? super qq5, sk8> M;
    public dz9 N;
    public final my2 O = bl7.f(new hg6(1, this));
    public sk8 P = sk8.e;

    public eda(mqa mqaVar, jga jgaVar, kga kgaVar, hga hgaVar) {
        this.J = mqaVar;
        this.K = jgaVar;
        this.L = kgaVar;
        this.M = hgaVar;
    }

    @Override // defpackage.gca
    public final sk8 E(qq5 qq5Var) {
        if (!this.G) {
            return this.P;
        }
        sk8 sk8VarInvoke = this.M.invoke(qq5Var);
        if (sk8VarInvoke == null) {
            return this.P;
        }
        this.P = sk8VarInvoke;
        return sk8VarInvoke;
    }

    @Override // defpackage.gca
    public final fca G0() {
        return (fca) this.O.getValue();
    }

    @Override // ox6.c
    public final void U1() {
        mqa mqaVar = this.J;
        mqaVar.b = lqa.v;
        mqaVar.a = this;
    }

    @Override // ox6.c
    public final void V1() {
        mqa mqaVar = this.J;
        mqaVar.b = lqa.u;
        mqaVar.a = null;
    }

    @Override // defpackage.gca
    public final long z(qq5 qq5Var) {
        return E(qq5Var).d();
    }
}
