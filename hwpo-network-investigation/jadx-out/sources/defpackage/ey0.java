package defpackage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ey0 extends OutputStream {
    public final FileOutputStream t;
    public byte[] u;
    public final o30 v;
    public int w;

    public ey0(FileOutputStream fileOutputStream, o30 o30Var) {
        this.t = fileOutputStream;
        this.v = o30Var;
        this.u = (byte[]) o30Var.c(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileOutputStream fileOutputStream = this.t;
        try {
            flush();
            fileOutputStream.close();
            byte[] bArr = this.u;
            if (bArr != null) {
                this.v.put(bArr);
                this.u = null;
            }
        } catch (Throwable th) {
            fileOutputStream.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        int i = this.w;
        FileOutputStream fileOutputStream = this.t;
        if (i > 0) {
            fileOutputStream.write(this.u, 0, i);
            this.w = 0;
        }
        fileOutputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.w;
            FileOutputStream fileOutputStream = this.t;
            if (i6 == 0 && i4 >= this.u.length) {
                fileOutputStream.write(bArr, i5, i4);
                return;
            }
            int iMin = Math.min(i4, this.u.length - i6);
            System.arraycopy(bArr, i5, this.u, this.w, iMin);
            int i7 = this.w + iMin;
            this.w = i7;
            i3 += iMin;
            byte[] bArr2 = this.u;
            if (i7 == bArr2.length && i7 > 0) {
                fileOutputStream.write(bArr2, 0, i7);
                this.w = 0;
            }
        } while (i3 < i2);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.u;
        int i2 = this.w;
        int i3 = i2 + 1;
        this.w = i3;
        bArr[i2] = (byte) i;
        if (i3 != bArr.length || i3 <= 0) {
            return;
        }
        this.t.write(bArr, 0, i3);
        this.w = 0;
    }
}
