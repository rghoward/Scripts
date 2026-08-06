package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tg9 implements xs3<rg9> {
    public final ve5 a;
    public final lf8<t04> b;
    public final lf8<vi9> c;
    public final lf8<jm3> d;
    public final lf8<h72> e;

    public tg9(ve5 ve5Var, lf8 lf8Var, lf8 lf8Var2, lf8 lf8Var3, lf8 lf8Var4) {
        this.a = ve5Var;
        this.b = lf8Var;
        this.c = lf8Var2;
        this.d = lf8Var3;
        this.e = lf8Var4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nf8
    public final Object get() {
        return new rg9((e04) this.a.a, this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
