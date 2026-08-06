package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class uk9 implements xs3<rk9> {
    public final lf8<h72> a;
    public final lf8<moa> b;
    public final lf8<pf2<ee9>> c;

    public uk9(lf8<h72> lf8Var, lf8<moa> lf8Var2, lf8<pf2<ee9>> lf8Var3) {
        this.a = lf8Var;
        this.b = lf8Var2;
        this.c = lf8Var3;
    }

    @Override // defpackage.nf8
    public final Object get() {
        return new rk9(this.a.get(), this.b.get(), this.c.get());
    }
}
