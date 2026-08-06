package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class en3 extends InputStream implements InputStreamRetargetInterface {
    public static final ArrayDeque v = new ArrayDeque(0);
    public bl8 t;
    public IOException u;

    @Override // java.io.InputStream
    public final int available() {
        return this.t.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.t.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.t.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        this.t.getClass();
        return true;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        try {
            return this.t.read();
        } catch (IOException e) {
            this.u = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.t.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        try {
            return this.t.skip(j);
        } catch (IOException e) {
            this.u = e;
            throw e;
        }
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        try {
            return this.t.read(bArr);
        } catch (IOException e) {
            this.u = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.t.read(bArr, i, i2);
        } catch (IOException e) {
            this.u = e;
            throw e;
        }
    }
}
