package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class tv8 implements fy8.b {
    public final pi8 a;

    public tv8(pi8 pi8Var) {
        pi8Var.getClass();
        this.a = pi8Var;
    }

    @Override // fy8.b
    public final boolean b() {
        return true;
    }

    @Override // fy8.b
    public final fy8.b c() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // fy8.b
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // fy8.b
    public final pi8 d() {
        return this.a;
    }

    @Override // fy8.b
    public final fy8.a e() {
        throw new IllegalStateException("already connected");
    }

    @Override // fy8.b
    public final fy8.a g() {
        throw new IllegalStateException("already connected");
    }
}
