package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class b94 {
    public final h94 a;
    public final cm b;
    public final d37<ba4> c = a49.a();
    public final d37<q84> d = a49.a();
    public boolean e;

    public b94(h94 h94Var, cm cmVar) {
        this.a = h94Var;
        this.b = cmVar;
    }

    public final void a() {
        if (this.e) {
            return;
        }
        this.b.m(new a94(0, this, b94.class, "invalidateNodes", "invalidateNodes()V", 0));
        this.e = true;
    }
}
