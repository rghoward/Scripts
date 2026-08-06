package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class s01 implements tx2 {
    public my0 t = df3.t;
    public c73 u;

    @Override // defpackage.tx2
    public final float N0() {
        return this.t.getDensity().N0();
    }

    public final c73 e(oh4<? super cz1, g2b> oh4Var) {
        c73 c73Var = new c73();
        c73Var.a = oh4Var;
        this.u = c73Var;
        return c73Var;
    }

    @Override // defpackage.tx2
    public final float getDensity() {
        return this.t.getDensity().getDensity();
    }
}
