package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class it3 implements fy8.b {
    public final fy8.a a;

    public it3(Throwable th) {
        this.a = new fy8.a(this, null, th, 2);
    }

    @Override // fy8.b
    public final boolean b() {
        return false;
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
        throw new IllegalStateException("unexpected call");
    }

    @Override // fy8.b
    public final fy8.a e() {
        return this.a;
    }

    @Override // fy8.b
    public final fy8.a g() {
        return this.a;
    }
}
