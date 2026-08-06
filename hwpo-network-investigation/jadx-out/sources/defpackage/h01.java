package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class h01 implements kt8<byte[]> {
    public final byte[] t;

    public h01(byte[] bArr) {
        ov9.d(bArr, "Argument must not be null");
        this.t = bArr;
    }

    @Override // defpackage.kt8
    public final Class<byte[]> c() {
        return byte[].class;
    }

    @Override // defpackage.kt8
    public final byte[] get() {
        return this.t;
    }

    @Override // defpackage.kt8
    public final int getSize() {
        return this.t.length;
    }

    @Override // defpackage.kt8
    public final void a() {
    }
}
