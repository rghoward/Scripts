package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class hn3 implements qv9 {
    public final gn3.a a;
    public final gn3.b b;
    public final /* synthetic */ gn3 c;

    public hn3(gn3 gn3Var) {
        this.c = gn3Var;
        in3 in3Var = gn3Var.d;
        this.a = new gn3.a(gn3Var, in3Var.i().b(), -1L, true);
        this.b = new gn3.b(gn3Var, in3Var.i().a(), -1L, true);
    }

    @Override // defpackage.qv9
    public final kw9 a() {
        return this.b;
    }

    @Override // defpackage.qv9
    public final yq9 b() {
        return this.a;
    }

    @Override // defpackage.qv9
    public final void cancel() {
        this.c.d.cancel();
    }
}
