package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class q52 extends ox6.c implements qb9 {
    public boolean H;
    public final boolean I;
    public oh4<? super hc9, g2b> J;

    public q52(boolean z, boolean z2, oh4<? super hc9, g2b> oh4Var) {
        this.H = z;
        this.I = z2;
        this.J = oh4Var;
    }

    @Override // defpackage.qb9
    public final void E1(hc9 hc9Var) {
        this.J.invoke(hc9Var);
    }

    @Override // defpackage.qb9
    public final boolean G1() {
        return this.H;
    }

    @Override // defpackage.qb9
    public final boolean v0() {
        return this.I;
    }
}
