package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jt5 extends rv5<ht5> implements lu5 {
    public static final it5 c = new it5();
    public final qu5 a = new qu5(this);
    public final j27<ht5> b = new j27<>();

    public jt5(oh4<? super lu5, g2b> oh4Var) {
        oh4Var.invoke(this);
    }

    @Override // defpackage.lu5
    public final void e(int i, oh4 oh4Var, fr1 fr1Var) {
        this.b.a(i, new ht5(c, oh4Var, fr1Var));
    }

    @Override // defpackage.rv5
    public final j27 g() {
        return this.b;
    }
}
