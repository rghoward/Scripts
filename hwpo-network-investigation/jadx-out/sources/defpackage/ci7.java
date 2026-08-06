package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ci7 extends ox6.c implements ml6 {
    public oh4<? super kg5, g2b> H;
    public final boolean I = true;
    public long J = -9223372034707292160L;

    public ci7(oh4<? super kg5, g2b> oh4Var) {
        this.H = oh4Var;
    }

    @Override // ox6.c
    public final boolean R1() {
        return this.I;
    }

    @Override // defpackage.ml6
    public final void g(long j) {
        if (kg5.b(this.J, j)) {
            return;
        }
        this.H.invoke(new kg5(j));
        this.J = j;
    }
}
