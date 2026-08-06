package defpackage;

import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ux0 extends OutputStream {
    public final /* synthetic */ tx0 t;

    public ux0(tx0 tx0Var) {
        this.t = tx0Var;
    }

    public final String toString() {
        return this.t + ".outputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        this.t.m884write(bArr, i, i2);
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.t.Z(i);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
    }
}
