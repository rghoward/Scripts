package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class np8 extends qp8 {
    public final /* synthetic */ wq6 a;
    public final /* synthetic */ g01 b;

    public np8(wq6 wq6Var, g01 g01Var) {
        this.a = wq6Var;
        this.b = g01Var;
    }

    @Override // defpackage.qp8
    public final long contentLength() {
        return this.b.g();
    }

    @Override // defpackage.qp8
    public final wq6 contentType() {
        return this.a;
    }

    @Override // defpackage.qp8
    public final void writeTo(fy0 fy0Var) {
        fy0Var.getClass();
        fy0Var.k0(this.b);
    }
}
