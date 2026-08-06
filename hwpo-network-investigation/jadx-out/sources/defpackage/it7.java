package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class it7 extends ox6.c implements txa, qb9 {
    public oh4<? super hc9, g2b> H;
    public boolean I;
    public final kt7 J = kt7.t;

    public it7(fn0 fn0Var) {
        this.H = fn0Var;
    }

    @Override // defpackage.qb9
    public final void E1(hc9 hc9Var) {
        if (this.I) {
            return;
        }
        this.H.invoke(hc9Var);
    }

    @Override // defpackage.txa
    public final Object G() {
        return this.J;
    }

    @Override // defpackage.qb9
    public final boolean G1() {
        return true;
    }
}
