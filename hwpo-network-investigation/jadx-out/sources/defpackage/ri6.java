package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ri6 extends FilterInputStream implements InputStreamRetargetInterface {
    public int t;

    public ri6(en3 en3Var) {
        super(en3Var);
        this.t = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        int i = this.t;
        return i == Integer.MIN_VALUE ? super.available() : Math.min(i, super.available());
    }

    public final long h(long j) {
        int i = this.t;
        if (i == 0) {
            return -1L;
        }
        return (i == Integer.MIN_VALUE || j <= ((long) i)) ? j : i;
    }

    public final void k(long j) {
        int i = this.t;
        if (i == Integer.MIN_VALUE || j == -1) {
            return;
        }
        this.t = (int) (((long) i) - j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        super.mark(i);
        this.t = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (h(1L) == -1) {
            return -1;
        }
        int i = super.read();
        k(1L);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        super.reset();
        this.t = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jH = h(j);
        if (jH == -1) {
            return 0L;
        }
        long jSkip = super.skip(jH);
        k(jSkip);
        return jSkip;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int iH = (int) h(i2);
        if (iH == -1) {
            return -1;
        }
        int i3 = super.read(bArr, i, iH);
        k(i3);
        return i3;
    }
}
