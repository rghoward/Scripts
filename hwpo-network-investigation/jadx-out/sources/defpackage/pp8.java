package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class pp8 extends qp8 {
    public final /* synthetic */ wq6 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ int d;

    public pp8(wq6 wq6Var, byte[] bArr, int i, int i2) {
        this.a = wq6Var;
        this.b = i;
        this.c = bArr;
        this.d = i2;
    }

    @Override // defpackage.qp8
    public final long contentLength() {
        return this.b;
    }

    @Override // defpackage.qp8
    public final wq6 contentType() {
        return this.a;
    }

    @Override // defpackage.qp8
    public final void writeTo(fy0 fy0Var) {
        fy0Var.getClass();
        fy0Var.write(this.c, this.d, this.b);
    }
}
