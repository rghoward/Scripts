package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class eo3 extends InputStream implements InputStreamRetargetInterface {
    public final InputStream t;
    public int u = 1073741824;

    public eo3(InputStream inputStream) {
        this.t = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.u;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.t.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.t.read();
        if (i == -1) {
            this.u = 0;
        }
        return i;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        return this.t.skip(j);
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        int i = this.t.read(bArr);
        if (i == -1) {
            this.u = 0;
        }
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.t.read(bArr, i, i2);
        if (i3 == -1) {
            this.u = 0;
        }
        return i3;
    }
}
