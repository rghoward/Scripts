package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class gy0 implements qv9 {
    public final qv9 a;
    public final ni8 b;
    public final mi8 c;

    public gy0(qv9 qv9Var) {
        this.a = qv9Var;
        kw9 kw9VarA = qv9Var.a();
        kw9VarA.getClass();
        this.b = new ni8(kw9VarA);
        this.c = ev6.b(qv9Var.b());
    }

    @Override // defpackage.qv9
    public final kw9 a() {
        return this.b;
    }

    @Override // defpackage.qv9
    public final yq9 b() {
        return this.c;
    }

    public final fy0 c() {
        return this.c;
    }

    @Override // defpackage.qv9
    public final void cancel() {
        this.a.cancel();
    }

    public final hy0 d() {
        return this.b;
    }
}
