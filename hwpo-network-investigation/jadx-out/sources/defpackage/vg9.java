package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vg9 implements xs3<ug9> {
    public final lf8<moa> a;
    public final lf8<z6b> b;

    public vg9(lf8<moa> lf8Var, lf8<z6b> lf8Var2) {
        this.a = lf8Var;
        this.b = lf8Var2;
    }

    @Override // defpackage.nf8
    public final Object get() {
        return new ug9(this.a.get(), this.b.get());
    }
}
