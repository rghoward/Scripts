package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class c2a implements Closeable {
    public final FileInputStream t;
    public final Charset u;
    public byte[] v;
    public int w;
    public int x;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a extends ByteArrayOutputStream {
        public a(int i) {
            super(i);
        }

        @Override // java.io.ByteArrayOutputStream
        public final String toString() {
            int i = ((ByteArrayOutputStream) this).count;
            if (i > 0) {
                int i2 = i - 1;
                if (((ByteArrayOutputStream) this).buf[i2] == 13) {
                    i = i2;
                }
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i, c2a.this.u.name());
            } catch (UnsupportedEncodingException e) {
                sx0.a(e);
                return null;
            }
        }
    }

    public c2a(FileInputStream fileInputStream, Charset charset) {
        if (charset == null) {
            throw null;
        }
        if (!charset.equals(k6b.a)) {
            z90.a("Unsupported encoding");
            throw null;
        }
        this.t = fileInputStream;
        this.u = charset;
        this.v = new byte[8192];
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.t) {
            try {
                if (this.v != null) {
                    this.v = null;
                    this.t.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0040  */
    public final String h() {
        int i;
        synchronized (this.t) {
            try {
                byte[] bArr = this.v;
                if (bArr == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.w >= this.x) {
                    int i2 = this.t.read(bArr, 0, bArr.length);
                    if (i2 == -1) {
                        throw new EOFException();
                    }
                    this.w = 0;
                    this.x = i2;
                }
                for (int i3 = this.w; i3 != this.x; i3++) {
                    byte[] bArr2 = this.v;
                    if (bArr2[i3] == 10) {
                        int i4 = this.w;
                        if (i3 != i4) {
                            i = i3 - 1;
                            if (bArr2[i] != 13) {
                                i = i3;
                            }
                        } else {
                            i = i3;
                        }
                        String str = new String(bArr2, i4, i - i4, this.u.name());
                        this.w = i3 + 1;
                        return str;
                    }
                }
                a aVar = new a((this.x - this.w) + 80);
                while (true) {
                    byte[] bArr3 = this.v;
                    int i5 = this.w;
                    aVar.write(bArr3, i5, this.x - i5);
                    this.x = -1;
                    FileInputStream fileInputStream = this.t;
                    byte[] bArr4 = this.v;
                    int i6 = fileInputStream.read(bArr4, 0, bArr4.length);
                    if (i6 == -1) {
                        throw new EOFException();
                    }
                    this.w = 0;
                    this.x = i6;
                    for (int i7 = 0; i7 != this.x; i7++) {
                        byte[] bArr5 = this.v;
                        if (bArr5[i7] == 10) {
                            int i8 = this.w;
                            if (i7 != i8) {
                                aVar.write(bArr5, i8, i7 - i8);
                            }
                            this.w = i7 + 1;
                            return aVar.toString();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
