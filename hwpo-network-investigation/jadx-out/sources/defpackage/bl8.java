package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.msgpack.core.MessagePack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bl8 extends FilterInputStream implements InputStreamRetargetInterface {
    public volatile byte[] t;
    public int u;
    public int v;
    public int w;
    public int x;
    public final o30 y;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a extends IOException {
    }

    public bl8(InputStream inputStream, o30 o30Var) {
        super(inputStream);
        this.w = -1;
        this.y = o30Var;
        this.t = (byte[]) o30Var.c(65536, byte[].class);
    }

    public static void m() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.t == null || inputStream == null) {
            m();
            throw null;
        }
        return (this.u - this.x) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.t != null) {
            this.y.put(this.t);
            this.t = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final int h(InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.w;
        if (i != -1) {
            int i2 = this.x - i;
            int i3 = this.v;
            if (i2 < i3) {
                if (i == 0 && i3 > bArr.length && this.u == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i3) {
                        i3 = length;
                    }
                    byte[] bArr2 = (byte[]) this.y.c(i3, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.t = bArr2;
                    this.y.put(bArr);
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i4 = this.x - this.w;
                this.x = i4;
                this.w = 0;
                this.u = 0;
                int i5 = inputStream.read(bArr, i4, bArr.length - i4);
                int i6 = this.x;
                if (i5 > 0) {
                    i6 += i5;
                }
                this.u = i6;
                return i5;
            }
        }
        int i7 = inputStream.read(bArr);
        if (i7 > 0) {
            this.w = -1;
            this.x = 0;
            this.u = i7;
        }
        return i7;
    }

    public final synchronized void k() {
        if (this.t != null) {
            this.y.put(this.t);
            this.t = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.v = Math.max(this.v, i);
        this.w = this.x;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        byte[] bArr2 = this.t;
        if (bArr2 == null) {
            m();
            throw null;
        }
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            m();
            throw null;
        }
        int i5 = this.x;
        int i6 = this.u;
        if (i5 < i6) {
            int i7 = i6 - i5;
            if (i7 >= i2) {
                i7 = i2;
            }
            System.arraycopy(bArr2, i5, bArr, i, i7);
            this.x += i7;
            if (i7 == i2 || inputStream.available() == 0) {
                return i7;
            }
            i += i7;
            i3 = i2 - i7;
        } else {
            i3 = i2;
        }
        while (true) {
            if (this.w == -1 && i3 >= bArr2.length) {
                i4 = inputStream.read(bArr, i, i3);
                if (i4 == -1) {
                    return i3 != i2 ? i2 - i3 : -1;
                }
            } else {
                if (h(inputStream, bArr2) == -1) {
                    return i3 != i2 ? i2 - i3 : -1;
                }
                if (bArr2 != this.t && (bArr2 = this.t) == null) {
                    m();
                    throw null;
                }
                int i8 = this.u;
                int i9 = this.x;
                i4 = i8 - i9;
                if (i4 >= i3) {
                    i4 = i3;
                }
                System.arraycopy(bArr2, i9, bArr, i, i4);
                this.x += i4;
            }
            i3 -= i4;
            if (i3 == 0) {
                return i2;
            }
            if (inputStream.available() == 0) {
                return i2 - i3;
            }
            i += i4;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.t == null) {
            throw new IOException("Stream is closed");
        }
        int i = this.w;
        if (-1 == i) {
            throw new a("Mark has been invalidated, pos: " + this.x + " markLimit: " + this.v);
        }
        this.x = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j) {
        if (j < 1) {
            return 0L;
        }
        byte[] bArr = this.t;
        if (bArr == null) {
            m();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            m();
            throw null;
        }
        int i = this.u;
        int i2 = this.x;
        if (i - i2 >= j) {
            this.x = (int) (((long) i2) + j);
            return j;
        }
        long j2 = ((long) i) - ((long) i2);
        this.x = i;
        if (this.w == -1 || j > this.v) {
            long jSkip = inputStream.skip(j - j2);
            if (jSkip > 0) {
                this.w = -1;
            }
            return j2 + jSkip;
        }
        if (h(inputStream, bArr) == -1) {
            return j2;
        }
        int i3 = this.u;
        int i4 = this.x;
        if (i3 - i4 >= j - j2) {
            this.x = (int) ((((long) i4) + j) - j2);
            return j;
        }
        long j3 = (j2 + ((long) i3)) - ((long) i4);
        this.x = i3;
        return j3;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.t;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr != null && inputStream != null) {
            if (this.x >= this.u && h(inputStream, bArr) == -1) {
                return -1;
            }
            if (bArr != this.t && (bArr = this.t) == null) {
                m();
                throw null;
            }
            int i = this.u;
            int i2 = this.x;
            if (i - i2 <= 0) {
                return -1;
            }
            this.x = i2 + 1;
            return bArr[i2] & MessagePack.Code.EXT_TIMESTAMP;
        }
        m();
        throw null;
    }
}
