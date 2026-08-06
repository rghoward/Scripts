package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class iz1 extends FilterInputStream implements InputStreamRetargetInterface {
    public final long t;
    public int u;

    public iz1(InputStream inputStream, long j) {
        super(inputStream);
        this.t = j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return (int) Math.max(this.t - ((long) this.u), ((FilterInputStream) this).in.available());
    }

    public final void h(int i) throws IOException {
        int i2 = this.u;
        if (i >= 0) {
            this.u = i2 + i;
            return;
        }
        long j = this.t;
        if (j - ((long) i2) <= 0) {
            return;
        }
        StringBuilder sbB = ao3.b("Failed to read all expected data, expected: ", j, ", but read: ");
        sbB.append(this.u);
        throw new IOException(sbB.toString());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        int i;
        i = super.read();
        h(i >= 0 ? 1 : -1);
        return i;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        i3 = super.read(bArr, i, i2);
        h(i3);
        return i3;
    }
}
