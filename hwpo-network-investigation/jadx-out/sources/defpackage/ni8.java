package defpackage;

import io.intercom.android.sdk.metrics.MetricTracker;
import j$.io.InputStreamRetargetInterface;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.msgpack.core.MessagePack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ni8 implements hy0 {
    public final kw9 t;
    public final tx0 u;
    public boolean v;

    public ni8(kw9 kw9Var) {
        kw9Var.getClass();
        this.t = kw9Var;
        this.u = new tx0();
    }

    @Override // defpackage.hy0
    public final String I(long j) throws EOFException {
        if (j < 0) {
            ca0.a(d43.b(j, "limit < 0: "));
            return null;
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jH = h((byte) 10, 0L, j2);
        tx0 tx0Var = this.u;
        if (jH != -1) {
            return c.c(tx0Var, jH);
        }
        if (j2 < Long.MAX_VALUE && request(j2) && tx0Var.u(j2 - 1) == 13 && request(j2 + 1) && tx0Var.u(j2) == 10) {
            return c.c(tx0Var, j2);
        }
        tx0 tx0Var2 = new tx0();
        tx0Var.t(tx0Var2, 0L, Math.min(32L, tx0Var.u));
        throw new EOFException("\\n not found: limit=" + Math.min(tx0Var.u, j) + " content=" + tx0Var2.r(tx0Var2.u).h() + (char) 8230);
    }

    @Override // defpackage.hy0
    public final long M(fy0 fy0Var) {
        tx0 tx0Var;
        long j = 0;
        while (true) {
            kw9 kw9Var = this.t;
            tx0Var = this.u;
            if (kw9Var.O(tx0Var, 8192L) == -1) {
                break;
            }
            long jP = tx0Var.p();
            if (jP > 0) {
                j += jP;
                fy0Var.i0(tx0Var, jP);
            }
        }
        long j2 = tx0Var.u;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        fy0Var.i0(tx0Var, j2);
        return j3;
    }

    @Override // defpackage.kw9
    public final long O(tx0 tx0Var, long j) {
        tx0Var.getClass();
        if (j < 0) {
            ca0.a(d43.b(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.v) {
            aa0.c(MetricTracker.Action.CLOSED);
            return 0L;
        }
        tx0 tx0Var2 = this.u;
        if (tx0Var2.u == 0) {
            if (j == 0) {
                return 0L;
            }
            if (this.t.O(tx0Var2, 8192L) == -1) {
                return -1L;
            }
        }
        return tx0Var2.O(tx0Var, Math.min(j, tx0Var2.u));
    }

    @Override // defpackage.hy0
    public final String S(Charset charset) {
        charset.getClass();
        kw9 kw9Var = this.t;
        tx0 tx0Var = this.u;
        tx0Var.F(kw9Var);
        tx0Var.getClass();
        return tx0Var.L(tx0Var.u, charset);
    }

    @Override // defpackage.hy0
    public final String b0() {
        return I(Long.MAX_VALUE);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.v) {
            return;
        }
        this.v = true;
        this.t.close();
        this.u.h();
    }

    public final long h(byte b, long j, long j2) {
        if (this.v) {
            aa0.c(MetricTracker.Action.CLOSED);
            return 0L;
        }
        if (0 > j2) {
            ca0.a(d43.b(j2, "fromIndex=0 toIndex="));
            return 0L;
        }
        long jMax = 0;
        while (jMax < j2) {
            byte b2 = b;
            long j3 = j2;
            long jV = this.u.v(b2, jMax, j3);
            if (jV != -1) {
                return jV;
            }
            tx0 tx0Var = this.u;
            long j4 = tx0Var.u;
            if (j4 >= j3 || this.t.O(tx0Var, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, j4);
            b = b2;
            j2 = j3;
        }
        return -1L;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.v;
    }

    @Override // defpackage.hy0
    public final tx0 j() {
        return this.u;
    }

    public final ni8 k() {
        return new ni8(new av7(this));
    }

    public final int m() throws EOFException {
        n0(4L);
        int i = this.u.readInt();
        tx0.b bVar = t.a;
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    @Override // defpackage.hy0
    public final void n0(long j) {
        if (!request(j)) {
            throw new EOFException();
        }
    }

    public final long p() throws EOFException {
        n0(8L);
        long j = this.u.readLong();
        tx0.b bVar = t.a;
        return ((j & 255) << 56) | (((-72057594037927936L) & j) >>> 56) | ((71776119061217280L & j) >>> 40) | ((280375465082880L & j) >>> 24) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << 24) | ((65280 & j) << 40);
    }

    @Override // defpackage.hy0
    public final boolean q(long j, g01 g01Var) {
        long jA;
        long j2;
        boolean z;
        boolean z2;
        long j3;
        long j4;
        g01Var.getClass();
        int iG = g01Var.g();
        if (this.v) {
            aa0.c(MetricTracker.Action.CLOSED);
            return false;
        }
        if (iG < 0 || j < 0 || iG > g01Var.g()) {
            return false;
        }
        if (iG == 0) {
            return true;
        }
        long j5 = 1;
        long j6 = j + 1;
        long j7 = iG;
        t.b(g01Var.g(), 0L, j7);
        if (this.v) {
            aa0.c(MetricTracker.Action.CLOSED);
            return false;
        }
        long jMax = j;
        loop0: while (true) {
            jA = c.a(this.u, g01Var, jMax, j6, iG);
            if (jA == -1) {
                tx0 tx0Var = this.u;
                j2 = -1;
                long j8 = tx0Var.u;
                z = false;
                z2 = true;
                long j9 = (j8 - j7) + j5;
                if (j9 < j6) {
                    if (j8 < j6) {
                        j4 = j6;
                        j3 = j5;
                    } else {
                        int iMax = (int) Math.max(j5, (j8 - j6) + j5);
                        j3 = j5;
                        int iMin = ((int) Math.min(j7, (tx0Var.u - jMax) + j3)) - 1;
                        if (iMax <= iMin) {
                            while (true) {
                                j4 = j6;
                                if (!tx0Var.B(iMin, tx0Var.u - ((long) iMin), g01Var)) {
                                    if (iMin != iMax) {
                                        iMin--;
                                        j6 = j4;
                                    }
                                }
                            }
                        }
                    }
                    if (this.t.O(tx0Var, 8192L) != -1) {
                        jMax = Math.max(jMax, j9);
                        j5 = j3;
                        j6 = j4;
                    }
                }
                jA = -1;
                break loop0;
            }
            j2 = -1;
            z = false;
            z2 = true;
            break;
        }
        return jA != j2 ? z2 : z;
    }

    @Override // defpackage.hy0
    public final long q0() {
        tx0 tx0Var;
        n0(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            boolean zRequest = request(i2);
            tx0Var = this.u;
            if (!zRequest) {
                break;
            }
            byte bU = tx0Var.u(i);
            if ((bU < 48 || bU > 57) && ((bU < 97 || bU > 102) && (bU < 65 || bU > 70))) {
                if (i != 0) {
                    break;
                }
                ta1.a(16);
                String string = Integer.toString(bU, 16);
                string.getClass();
                throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(string));
            }
            i = i2;
        }
        return tx0Var.q0();
    }

    @Override // defpackage.hy0
    public final g01 r(long j) {
        n0(j);
        return this.u.r(j);
    }

    @Override // defpackage.hy0
    public final InputStream r0() {
        return new a();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        tx0 tx0Var = this.u;
        if (tx0Var.u == 0 && this.t.O(tx0Var, 8192L) == -1) {
            return -1;
        }
        return tx0Var.read(byteBuffer);
    }

    @Override // defpackage.hy0
    public final byte readByte() {
        n0(1L);
        return this.u.readByte();
    }

    @Override // defpackage.hy0
    public final void readFully(byte[] bArr) throws EOFException {
        tx0 tx0Var = this.u;
        bArr.getClass();
        try {
            n0(bArr.length);
            tx0Var.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                long j = tx0Var.u;
                if (j <= 0) {
                    throw e;
                }
                int i2 = tx0Var.read(bArr, i, (int) j);
                if (i2 == -1) {
                    throw new AssertionError();
                }
                i += i2;
            }
        }
    }

    @Override // defpackage.hy0
    public final int readInt() {
        n0(4L);
        return this.u.readInt();
    }

    @Override // defpackage.hy0
    public final long readLong() {
        n0(8L);
        return this.u.readLong();
    }

    @Override // defpackage.hy0
    public final short readShort() {
        n0(2L);
        return this.u.readShort();
    }

    @Override // defpackage.hy0
    public final boolean request(long j) {
        tx0 tx0Var;
        if (j < 0) {
            ca0.a(d43.b(j, "byteCount < 0: "));
            return false;
        }
        if (this.v) {
            aa0.c(MetricTracker.Action.CLOSED);
            return false;
        }
        do {
            tx0Var = this.u;
            if (tx0Var.u >= j) {
                return true;
            }
        } while (this.t.O(tx0Var, 8192L) != -1);
        return false;
    }

    @Override // defpackage.hy0
    public final int s(yk7 yk7Var) throws EOFException {
        tx0 tx0Var;
        yk7Var.getClass();
        if (this.v) {
            aa0.c(MetricTracker.Action.CLOSED);
            return 0;
        }
        do {
            tx0Var = this.u;
            int iD = c.d(tx0Var, yk7Var, true);
            if (iD != -2) {
                if (iD == -1) {
                    break;
                }
                tx0Var.skip(yk7Var.t[iD].g());
                return iD;
            }
        } while (this.t.O(tx0Var, 8192L) != -1);
        return -1;
    }

    @Override // defpackage.hy0
    public final void s0(tx0 tx0Var, long j) throws EOFException {
        tx0 tx0Var2 = this.u;
        tx0Var.getClass();
        try {
            n0(j);
            tx0Var2.s0(tx0Var, j);
        } catch (EOFException e) {
            tx0Var.F(tx0Var2);
            throw e;
        }
    }

    @Override // defpackage.hy0
    public final void skip(long j) throws EOFException {
        if (this.v) {
            aa0.c(MetricTracker.Action.CLOSED);
            return;
        }
        while (j > 0) {
            tx0 tx0Var = this.u;
            if (tx0Var.u == 0 && this.t.O(tx0Var, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, tx0Var.u);
            tx0Var.skip(jMin);
            j -= jMin;
        }
    }

    public final short t() {
        n0(2L);
        return this.u.K();
    }

    @Override // defpackage.kw9
    public final voa timeout() {
        return this.t.timeout();
    }

    public final String toString() {
        return "buffer(" + this.t + ')';
    }

    public final String u(long j) {
        n0(j);
        tx0 tx0Var = this.u;
        tx0Var.getClass();
        return tx0Var.L(j, ua1.b);
    }

    @Override // defpackage.hy0
    public final byte[] x() {
        kw9 kw9Var = this.t;
        tx0 tx0Var = this.u;
        tx0Var.F(kw9Var);
        return tx0Var.H(tx0Var.u);
    }

    @Override // defpackage.hy0
    public final boolean z() {
        if (this.v) {
            aa0.c(MetricTracker.Action.CLOSED);
            return false;
        }
        tx0 tx0Var = this.u;
        return tx0Var.z() && this.t.O(tx0Var, 8192L) == -1;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends InputStream implements InputStreamRetargetInterface {
        public a() {
        }

        @Override // java.io.InputStream
        public final int available() throws IOException {
            ni8 ni8Var = ni8.this;
            if (!ni8Var.v) {
                return (int) Math.min(ni8Var.u.u, 2147483647L);
            }
            o03.a(MetricTracker.Action.CLOSED);
            return 0;
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            ni8.this.close();
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) throws IOException {
            bArr.getClass();
            ni8 ni8Var = ni8.this;
            tx0 tx0Var = ni8Var.u;
            if (ni8Var.v) {
                o03.a(MetricTracker.Action.CLOSED);
                return 0;
            }
            t.b(bArr.length, i, i2);
            if (tx0Var.u == 0 && ni8Var.t.O(tx0Var, 8192L) == -1) {
                return -1;
            }
            return tx0Var.read(bArr, i, i2);
        }

        public final String toString() {
            return ni8.this + ".inputStream()";
        }

        @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
        public final long transferTo(OutputStream outputStream) throws IOException {
            outputStream.getClass();
            ni8 ni8Var = ni8.this;
            tx0 tx0Var = ni8Var.u;
            if (ni8Var.v) {
                o03.a(MetricTracker.Action.CLOSED);
                return 0L;
            }
            long j = 0;
            while (true) {
                if (tx0Var.u == 0 && ni8Var.t.O(tx0Var, 8192L) == -1) {
                    return j;
                }
                long j2 = tx0Var.u;
                j += j2;
                t.b(j2, 0L, j2);
                f99 f99Var = tx0Var.t;
                while (j2 > 0) {
                    f99Var.getClass();
                    int iMin = (int) Math.min(j2, f99Var.c - f99Var.b);
                    outputStream.write(f99Var.a, f99Var.b, iMin);
                    int i = f99Var.b + iMin;
                    f99Var.b = i;
                    long j3 = iMin;
                    tx0Var.u -= j3;
                    j2 -= j3;
                    if (i == f99Var.c) {
                        f99 f99VarA = f99Var.a();
                        tx0Var.t = f99VarA;
                        i99.a(f99Var);
                        f99Var = f99VarA;
                    }
                }
            }
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            ni8 ni8Var = ni8.this;
            tx0 tx0Var = ni8Var.u;
            if (ni8Var.v) {
                o03.a(MetricTracker.Action.CLOSED);
                return 0;
            }
            if (tx0Var.u == 0 && ni8Var.t.O(tx0Var, 8192L) == -1) {
                return -1;
            }
            return tx0Var.readByte() & MessagePack.Code.EXT_TIMESTAMP;
        }
    }
}
