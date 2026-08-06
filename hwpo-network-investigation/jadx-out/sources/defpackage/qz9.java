package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qz9 implements ks3 {
    public final ks3 a;
    public final long b;

    public qz9(ks3 ks3Var, long j) {
        this.a = ks3Var;
        xl7.g(ks3Var.getPosition() >= j);
        this.b = j;
    }

    @Override // defpackage.ks3
    public final long a() {
        return this.a.a() - this.b;
    }

    @Override // defpackage.ks3
    public final boolean b(byte[] bArr, int i, int i2, boolean z) {
        return this.a.b(bArr, 0, i2, z);
    }

    @Override // defpackage.ks3
    public final boolean e(int i, boolean z) {
        return this.a.e(i, true);
    }

    @Override // defpackage.ks3
    public final boolean f(byte[] bArr, int i, int i2, boolean z) {
        return this.a.f(bArr, i, i2, z);
    }

    @Override // defpackage.ks3
    public final long g() {
        return this.a.g() - this.b;
    }

    @Override // defpackage.ks3
    public final long getPosition() {
        return this.a.getPosition() - this.b;
    }

    @Override // defpackage.ks3
    public final void h(int i) {
        this.a.h(i);
    }

    @Override // defpackage.ks3
    public final int i(int i) {
        return this.a.i(i);
    }

    @Override // defpackage.ks3
    public final int j(byte[] bArr, int i, int i2) {
        return this.a.j(bArr, i, i2);
    }

    @Override // defpackage.ks3
    public final void l() {
        this.a.l();
    }

    @Override // defpackage.ks3
    public final void m(int i) {
        this.a.m(i);
    }

    @Override // defpackage.ks3
    public final void n(byte[] bArr, int i, int i2) {
        this.a.n(bArr, i, i2);
    }

    @Override // defpackage.ef2
    public final int read(byte[] bArr, int i, int i2) {
        return this.a.read(bArr, i, i2);
    }

    @Override // defpackage.ks3
    public final void readFully(byte[] bArr, int i, int i2) {
        this.a.readFully(bArr, i, i2);
    }
}
