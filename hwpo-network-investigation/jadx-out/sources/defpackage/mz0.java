package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class mz0 implements e30<byte[]> {
    @Override // defpackage.e30
    public final int a() {
        return 1;
    }

    @Override // defpackage.e30
    public final String b() {
        return "ByteArrayPool";
    }

    @Override // defpackage.e30
    public final int c(byte[] bArr) {
        return bArr.length;
    }

    @Override // defpackage.e30
    public final byte[] newArray(int i) {
        return new byte[i];
    }
}
