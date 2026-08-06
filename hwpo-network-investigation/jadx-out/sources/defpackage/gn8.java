package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gn8 implements xs3<cn8> {
    public final lf8<moa> a;
    public final lf8<t04> b;
    public final lf8<l20> c;
    public final lf8<ia2> d;
    public final lf8<pk9> e;

    public gn8(lf8<moa> lf8Var, lf8<t04> lf8Var2, lf8<l20> lf8Var3, lf8<ia2> lf8Var4, lf8<pk9> lf8Var5) {
        this.a = lf8Var;
        this.b = lf8Var2;
        this.c = lf8Var3;
        this.d = lf8Var4;
        this.e = lf8Var5;
    }

    @Override // defpackage.nf8
    public final Object get() {
        return new cn8(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
