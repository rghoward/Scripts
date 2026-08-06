package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.msgpack.core.MessagePack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pg8 implements Closeable {
    public static final Logger z = Logger.getLogger(pg8.class.getName());
    public final RandomAccessFile t;
    public int u;
    public int v;
    public b w;
    public b x;
    public final byte[] y;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements d {
        public boolean a = true;
        public final /* synthetic */ StringBuilder b;

        public a(StringBuilder sb) {
            this.b = sb;
        }

        @Override // pg8.d
        public final void a(c cVar, int i) {
            boolean z = this.a;
            StringBuilder sb = this.b;
            if (z) {
                this.a = false;
            } else {
                sb.append(", ");
            }
            sb.append(i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b {
        public static final b c = new b(0, 0);
        public final int a;
        public final int b;

        public b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(b.class.getSimpleName());
            sb.append("[position = ");
            sb.append(this.a);
            sb.append(", length = ");
            return i34.b(this.b, "]", sb);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface d {
        void a(c cVar, int i);
    }

    public pg8(File file) throws IOException {
        byte[] bArr = new byte[16];
        this.y = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i = 0;
                for (int i2 = 0; i2 < 4; i2++) {
                    K(bArr2, i, iArr[i2]);
                    i += 4;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    o03.a("Rename failed!");
                    throw null;
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.t = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int iU = u(bArr, 0);
        this.u = iU;
        if (iU <= randomAccessFile2.length()) {
            this.v = u(bArr, 4);
            int iU2 = u(bArr, 8);
            int iU3 = u(bArr, 12);
            this.w = t(iU2);
            this.x = t(iU3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.u + ", Actual length: " + randomAccessFile2.length());
    }

    public static void K(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    public static int u(byte[] bArr, int i) {
        return ((bArr[i] & MessagePack.Code.EXT_TIMESTAMP) << 24) + ((bArr[i + 1] & MessagePack.Code.EXT_TIMESTAMP) << 16) + ((bArr[i + 2] & MessagePack.Code.EXT_TIMESTAMP) << 8) + (bArr[i + 3] & MessagePack.Code.EXT_TIMESTAMP);
    }

    public final void B(byte[] bArr, int i, int i2) throws IOException {
        int iH = H(i);
        int i3 = iH + i2;
        int i4 = this.u;
        RandomAccessFile randomAccessFile = this.t;
        if (i3 <= i4) {
            randomAccessFile.seek(iH);
            randomAccessFile.write(bArr, 0, i2);
            return;
        }
        int i5 = i4 - iH;
        randomAccessFile.seek(iH);
        randomAccessFile.write(bArr, 0, i5);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, i5, i2 - i5);
    }

    public final int E() {
        if (this.v == 0) {
            return 16;
        }
        b bVar = this.x;
        int i = bVar.a;
        int i2 = this.w.a;
        return i >= i2 ? (i - i2) + 4 + bVar.b + 16 : (((i + 4) + bVar.b) + this.u) - i2;
    }

    public final int H(int i) {
        int i2 = this.u;
        return i < i2 ? i : (i + 16) - i2;
    }

    public final void J(int i, int i2, int i3, int i4) throws IOException {
        int[] iArr = {i, i2, i3, i4};
        int i5 = 0;
        int i6 = 0;
        while (true) {
            byte[] bArr = this.y;
            if (i5 >= 4) {
                RandomAccessFile randomAccessFile = this.t;
                randomAccessFile.seek(0L);
                randomAccessFile.write(bArr);
                return;
            } else {
                K(bArr, i6, iArr[i5]);
                i6 += 4;
                i5++;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.t.close();
    }

    public final void h(byte[] bArr) {
        int iH;
        int length = bArr.length;
        synchronized (this) {
            if (length >= 0) {
                if (length <= bArr.length) {
                    k(length);
                    boolean zP = p();
                    if (zP) {
                        iH = 16;
                    } else {
                        b bVar = this.x;
                        iH = H(bVar.a + 4 + bVar.b);
                    }
                    b bVar2 = new b(iH, length);
                    K(this.y, 0, length);
                    B(this.y, iH, 4);
                    B(bArr, iH + 4, length);
                    J(this.u, this.v + 1, zP ? iH : this.w.a, iH);
                    this.x = bVar2;
                    this.v++;
                    if (zP) {
                        this.w = bVar2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public final void k(int i) throws IOException {
        int i2 = i + 4;
        int iE = this.u - E();
        if (iE >= i2) {
            return;
        }
        int i3 = this.u;
        do {
            iE += i3;
            i3 <<= 1;
        } while (iE < i2);
        RandomAccessFile randomAccessFile = this.t;
        randomAccessFile.setLength(i3);
        randomAccessFile.getChannel().force(true);
        b bVar = this.x;
        int iH = H(bVar.a + 4 + bVar.b);
        if (iH < this.w.a) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.u);
            long j = iH - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                sx0.a("Copied insufficient number of bytes!");
                return;
            }
        }
        int i4 = this.x.a;
        int i5 = this.w.a;
        if (i4 < i5) {
            int i6 = (this.u + i4) - 16;
            J(i3, this.v, i5, i6);
            this.x = new b(i6, this.x.b);
        } else {
            J(i3, this.v, i5, i4);
        }
        this.u = i3;
    }

    public final synchronized void m(d dVar) {
        int iH = this.w.a;
        for (int i = 0; i < this.v; i++) {
            b bVarT = t(iH);
            dVar.a(new c(bVarT), bVarT.b);
            iH = H(bVarT.a + 4 + bVarT.b);
        }
    }

    public final synchronized boolean p() {
        return this.v == 0;
    }

    public final b t(int i) throws IOException {
        if (i == 0) {
            return b.c;
        }
        RandomAccessFile randomAccessFile = this.t;
        randomAccessFile.seek(i);
        return new b(i, randomAccessFile.readInt());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(pg8.class.getSimpleName());
        sb.append("[fileLength=");
        sb.append(this.u);
        sb.append(", size=");
        sb.append(this.v);
        sb.append(", first=");
        sb.append(this.w);
        sb.append(", last=");
        sb.append(this.x);
        sb.append(", element lengths=[");
        try {
            m(new a(sb));
        } catch (IOException e) {
            z.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb.append("]]");
        return sb.toString();
    }

    public final synchronized void v() {
        if (p()) {
            throw new NoSuchElementException();
        }
        if (this.v == 1) {
            synchronized (this) {
                J(4096, 0, 0, 0);
                this.v = 0;
                b bVar = b.c;
                this.w = bVar;
                this.x = bVar;
                if (this.u > 4096) {
                    RandomAccessFile randomAccessFile = this.t;
                    randomAccessFile.setLength(4096L);
                    randomAccessFile.getChannel().force(true);
                }
                this.u = 4096;
            }
        } else {
            b bVar2 = this.w;
            int iH = H(bVar2.a + 4 + bVar2.b);
            y(iH, this.y, 0, 4);
            int iU = u(this.y, 0);
            J(this.u, this.v - 1, iH, this.x.a);
            this.v--;
            this.w = new b(iH, iU);
        }
    }

    public final void y(int i, byte[] bArr, int i2, int i3) throws IOException {
        int iH = H(i);
        int i4 = iH + i3;
        int i5 = this.u;
        RandomAccessFile randomAccessFile = this.t;
        if (i4 <= i5) {
            randomAccessFile.seek(iH);
            randomAccessFile.readFully(bArr, i2, i3);
            return;
        }
        int i6 = i5 - iH;
        randomAccessFile.seek(iH);
        randomAccessFile.readFully(bArr, i2, i6);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i2 + i6, i3 - i6);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class c extends InputStream implements InputStreamRetargetInterface {
        public int t;
        public int u;

        public c(b bVar) {
            this.t = pg8.this.H(bVar.a + 4);
            this.u = bVar.b;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) throws IOException {
            if (bArr == null) {
                ac4.c("buffer");
                return 0;
            }
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = this.u;
            if (i3 <= 0) {
                return -1;
            }
            if (i2 > i3) {
                i2 = i3;
            }
            int i4 = this.t;
            pg8 pg8Var = pg8.this;
            pg8Var.y(i4, bArr, i, i2);
            this.t = pg8Var.H(this.t + i2);
            this.u -= i2;
            return i2;
        }

        @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
        public /* synthetic */ long transferTo(OutputStream outputStream) {
            return DesugarInputStream.transferTo(this, outputStream);
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            pg8 pg8Var = pg8.this;
            RandomAccessFile randomAccessFile = pg8Var.t;
            if (this.u == 0) {
                return -1;
            }
            randomAccessFile.seek(this.t);
            int i = randomAccessFile.read();
            this.t = pg8Var.H(this.t + 1);
            this.u--;
            return i;
        }
    }
}
