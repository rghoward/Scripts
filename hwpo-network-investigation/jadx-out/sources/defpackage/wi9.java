package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wi9 implements xs3<vi9> {
    public final lf8<zk9> a;
    public final lf8<zk9> b;

    public wi9(lf8<zk9> lf8Var, lf8<zk9> lf8Var2) {
        this.a = lf8Var;
        this.b = lf8Var2;
    }

    @Override // defpackage.nf8
    public final Object get() {
        return new vi9(this.a.get(), this.b.get());
    }
}
