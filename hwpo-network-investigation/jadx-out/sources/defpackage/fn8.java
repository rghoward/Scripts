package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fn8 implements xs3<en8> {
    public final lf8<l20> a;
    public final ve5 b;

    public fn8(ve5 ve5Var, lf8 lf8Var) {
        this.a = lf8Var;
        this.b = ve5Var;
    }

    @Override // defpackage.nf8
    public final Object get() {
        return new en8(this.a.get(), (h72) this.b.a);
    }
}
