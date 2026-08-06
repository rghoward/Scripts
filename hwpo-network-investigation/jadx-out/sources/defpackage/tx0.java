package defpackage;

import com.intercom.twig.BuildConfig;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.util.Arrays;
import org.msgpack.core.MessagePack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class tx0 implements hy0, fy0, Cloneable, ByteChannel {
    public f99 t;
    public long u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements Closeable {
        public tx0 t;
        public boolean u;
        public f99 v;
        public byte[] x;
        public long w = -1;
        public int y = -1;
        public int z = -1;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.t == null) {
                aa0.c("not attached to a buffer");
                return;
            }
            this.t = null;
            this.v = null;
            this.w = -1L;
            this.x = null;
            this.y = -1;
            this.z = -1;
        }

        public final void h(long j) {
            tx0 tx0Var = this.t;
            if (tx0Var == null) {
                aa0.c("not attached to a buffer");
                return;
            }
            if (!this.u) {
                aa0.c("resizeBuffer() only permitted for read/write buffers");
                return;
            }
            long j2 = tx0Var.u;
            if (j <= j2) {
                if (j < 0) {
                    ca0.a(d43.b(j, "newSize < 0: "));
                    return;
                }
                long j3 = j2 - j;
                while (j3 > 0) {
                    f99 f99Var = tx0Var.t;
                    f99Var.getClass();
                    f99 f99Var2 = f99Var.g;
                    f99Var2.getClass();
                    int i = f99Var2.c;
                    long j4 = i - f99Var2.b;
                    if (j4 > j3) {
                        f99Var2.c = i - ((int) j3);
                        break;
                    } else {
                        tx0Var.t = f99Var2.a();
                        i99.a(f99Var2);
                        j3 -= j4;
                    }
                }
                this.v = null;
                this.w = j;
                this.x = null;
                this.y = -1;
                this.z = -1;
            } else if (j > j2) {
                long j5 = j - j2;
                int i2 = 1;
                boolean z = true;
                for (long j6 = 0; j5 > j6; j6 = 0) {
                    f99 f99VarW = tx0Var.W(i2);
                    int iMin = (int) Math.min(j5, 8192 - f99VarW.c);
                    int i3 = f99VarW.c + iMin;
                    f99VarW.c = i3;
                    j5 -= (long) iMin;
                    if (z) {
                        this.v = f99VarW;
                        this.w = j2;
                        this.x = f99VarW.a;
                        this.y = i3 - iMin;
                        this.z = i3;
                        z = false;
                    }
                    i2 = 1;
                }
            }
            tx0Var.u = j;
        }

        public final int k(long j) {
            tx0 tx0Var = this.t;
            if (tx0Var == null) {
                aa0.c("not attached to a buffer");
                return 0;
            }
            if (j >= -1) {
                long j2 = tx0Var.u;
                if (j <= j2) {
                    if (j == -1 || j == j2) {
                        this.v = null;
                        this.w = j;
                        this.x = null;
                        this.y = -1;
                        this.z = -1;
                        return -1;
                    }
                    f99 f99Var = tx0Var.t;
                    f99 f99Var2 = this.v;
                    long j3 = 0;
                    if (f99Var2 != null) {
                        long j4 = this.w - ((long) (this.y - f99Var2.b));
                        if (j4 > j) {
                            f99Var2 = f99Var;
                            f99Var = f99Var2;
                            j2 = j4;
                        } else {
                            j3 = j4;
                        }
                    } else {
                        f99Var2 = f99Var;
                    }
                    if (j2 - j > j - j3) {
                        while (true) {
                            f99Var2.getClass();
                            long j5 = ((long) (f99Var2.c - f99Var2.b)) + j3;
                            if (j < j5) {
                                break;
                            }
                            f99Var2 = f99Var2.f;
                            j3 = j5;
                        }
                    } else {
                        while (j2 > j) {
                            f99Var.getClass();
                            f99Var = f99Var.g;
                            f99Var.getClass();
                            j2 -= (long) (f99Var.c - f99Var.b);
                        }
                        f99Var2 = f99Var;
                        j3 = j2;
                    }
                    if (this.u) {
                        f99Var2.getClass();
                        if (f99Var2.d) {
                            byte[] bArr = f99Var2.a;
                            f99 f99Var3 = new f99(Arrays.copyOf(bArr, bArr.length), f99Var2.b, f99Var2.c, false, true);
                            if (tx0Var.t == f99Var2) {
                                tx0Var.t = f99Var3;
                            }
                            f99Var2.b(f99Var3);
                            f99 f99Var4 = f99Var3.g;
                            f99Var4.getClass();
                            f99Var4.a();
                            f99Var2 = f99Var3;
                        }
                    }
                    this.v = f99Var2;
                    this.w = j;
                    f99Var2.getClass();
                    this.x = f99Var2.a;
                    int i = f99Var2.b + ((int) (j - j3));
                    this.y = i;
                    int i2 = f99Var2.c;
                    this.z = i2;
                    return i2 - i;
                }
            }
            StringBuilder sbB = ao3.b("offset=", j, " > size=");
            sbB.append(tx0Var.u);
            throw new ArrayIndexOutOfBoundsException(sbB.toString());
        }
    }

    public final boolean B(int i, long j, g01 g01Var) {
        g01Var.getClass();
        if (i >= 0 && j >= 0 && ((long) i) + j <= this.u && i <= g01Var.g()) {
            return i == 0 || c.a(this, g01Var, j, j + 1, i) != -1;
        }
        return false;
    }

    public final b E(b bVar) {
        bVar.getClass();
        byte[] bArr = c.a;
        if (bVar == t.a) {
            bVar = new b();
        }
        if (bVar.t != null) {
            aa0.c("already attached to a buffer");
            return null;
        }
        bVar.t = this;
        bVar.u = true;
        return bVar;
    }

    @Override // defpackage.fy0
    public final long F(kw9 kw9Var) {
        kw9Var.getClass();
        long j = 0;
        while (true) {
            long jO = kw9Var.O(this, 8192L);
            if (jO == -1) {
                return j;
            }
            j += jO;
        }
    }

    public final byte[] H(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            ca0.a(d43.b(j, "byteCount: "));
            return null;
        }
        if (this.u < j) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j];
        readFully(bArr);
        return bArr;
    }

    @Override // defpackage.hy0
    public final String I(long j) throws EOFException {
        if (j < 0) {
            ca0.a(d43.b(j, "limit < 0: "));
            return null;
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long jV = v((byte) 10, 0L, j2);
        if (jV != -1) {
            return c.c(this, jV);
        }
        if (j2 < this.u && u(j2 - 1) == 13 && u(j2) == 10) {
            return c.c(this, j2);
        }
        tx0 tx0Var = new tx0();
        t(tx0Var, 0L, Math.min(32L, this.u));
        throw new EOFException("\\n not found: limit=" + Math.min(this.u, j) + " content=" + tx0Var.r(tx0Var.u).h() + (char) 8230);
    }

    public final long J() throws EOFException {
        long j;
        byte b2;
        long j2 = 0;
        if (this.u == 0) {
            throw new EOFException();
        }
        int i = 0;
        boolean z = false;
        long j3 = 0;
        long j4 = -7;
        boolean z2 = false;
        loop0: while (true) {
            f99 f99Var = this.t;
            f99Var.getClass();
            byte[] bArr = f99Var.a;
            int i2 = f99Var.b;
            int i3 = f99Var.c;
            while (true) {
                if (i2 >= i3) {
                    j = j2;
                    break;
                }
                b2 = bArr[i2];
                if (b2 >= 48 && b2 <= 57) {
                    int i4 = 48 - b2;
                    if (j3 < -922337203685477580L) {
                        break loop0;
                    }
                    j = j2;
                    if (j3 == -922337203685477580L && i4 < j4) {
                        break loop0;
                    }
                    j3 = (j3 * 10) + ((long) i4);
                } else {
                    j = j2;
                    if (b2 != 45 || i != 0) {
                        z2 = true;
                        break;
                    }
                    j4--;
                    z = true;
                }
                i2++;
                i++;
                j2 = j;
            }
            if (i2 == i3) {
                this.t = f99Var.a();
                i99.a(f99Var);
            } else {
                f99Var.b = i2;
            }
            if (z2 || this.t == null) {
                long j5 = this.u - ((long) i);
                this.u = j5;
                if (i >= (z ? 2 : 1)) {
                    return z ? j3 : -j3;
                }
                if (j5 == j) {
                    throw new EOFException();
                }
                StringBuilder sbB = tn2.b(z ? "Expected a digit" : "Expected a digit or '-'", " but was 0x");
                sbB.append(t.c(u(j)));
                throw new NumberFormatException(sbB.toString());
            }
            j2 = j;
        }
        tx0 tx0Var = new tx0();
        tx0Var.a0(j3);
        tx0Var.Z(b2);
        if (!z) {
            tx0Var.readByte();
        }
        throw new NumberFormatException("Number too large: ".concat(tx0Var.N()));
    }

    public final short K() throws EOFException {
        short s = readShort();
        b bVar = t.a;
        return (short) (((s & 255) << 8) | ((65280 & s) >>> 8));
    }

    public final String L(long j, Charset charset) throws EOFException {
        charset.getClass();
        if (j < 0 || j > 2147483647L) {
            ca0.a(d43.b(j, "byteCount: "));
            return null;
        }
        if (this.u < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return BuildConfig.FLAVOR;
        }
        f99 f99Var = this.t;
        f99Var.getClass();
        int i = f99Var.b;
        if (((long) i) + j > f99Var.c) {
            return new String(H(j), charset);
        }
        int i2 = (int) j;
        String str = new String(f99Var.a, i, i2, charset);
        int i3 = f99Var.b + i2;
        f99Var.b = i3;
        this.u -= j;
        if (i3 == f99Var.c) {
            this.t = f99Var.a();
            i99.a(f99Var);
        }
        return str;
    }

    @Override // defpackage.hy0
    public final long M(fy0 fy0Var) {
        long j = this.u;
        if (j > 0) {
            fy0Var.i0(this, j);
        }
        return j;
    }

    public final String N() {
        return L(this.u, ua1.b);
    }

    @Override // defpackage.kw9
    public final long O(tx0 tx0Var, long j) {
        tx0Var.getClass();
        if (j < 0) {
            ca0.a(d43.b(j, "byteCount < 0: "));
            return 0L;
        }
        long j2 = this.u;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        tx0Var.i0(this, j);
        return j;
    }

    public final int P() throws EOFException {
        int i;
        int i2;
        int i3;
        if (this.u == 0) {
            throw new EOFException();
        }
        byte bU = u(0L);
        if ((bU & 128) == 0) {
            i = bU & 127;
            i3 = 0;
            i2 = 1;
        } else if ((bU & MessagePack.Code.NEGFIXINT_PREFIX) == 192) {
            i = bU & 31;
            i2 = 2;
            i3 = 128;
        } else if ((bU & 240) == 224) {
            i = bU & 15;
            i2 = 3;
            i3 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
        } else {
            if ((bU & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i = bU & 7;
            i2 = 4;
            i3 = 65536;
        }
        long j = i2;
        if (this.u < j) {
            StringBuilder sbB = t43.b(i2, "size < ", ": ");
            sbB.append(this.u);
            sbB.append(" (to read code point prefixed 0x");
            sbB.append(t.c(bU));
            sbB.append(')');
            throw new EOFException(sbB.toString());
        }
        for (int i4 = 1; i4 < i2; i4++) {
            long j2 = i4;
            byte bU2 = u(j2);
            if ((bU2 & MessagePack.Code.NIL) != 128) {
                skip(j2);
                return 65533;
            }
            i = (i << 6) | (bU2 & 63);
        }
        skip(j);
        if (i > 1114111) {
            return 65533;
        }
        if ((55296 > i || i >= 57344) && i >= i3) {
            return i;
        }
        return 65533;
    }

    @Override // defpackage.fy0
    public final /* bridge */ /* synthetic */ fy0 R(String str) {
        g0(str);
        return this;
    }

    @Override // defpackage.hy0
    public final String S(Charset charset) {
        charset.getClass();
        return L(this.u, charset);
    }

    public final g01 T(int i) {
        if (i == 0) {
            return g01.w;
        }
        t.b(this.u, 0L, i);
        f99 f99Var = this.t;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            f99Var.getClass();
            int i5 = f99Var.c;
            int i6 = f99Var.b;
            if (i5 == i6) {
                sx0.a("s.limit == s.pos");
                return null;
            }
            i3 += i5 - i6;
            i4++;
            f99Var = f99Var.f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        f99 f99Var2 = this.t;
        int i7 = 0;
        while (i2 < i) {
            f99Var2.getClass();
            bArr[i7] = f99Var2.a;
            i2 += f99Var2.c - f99Var2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = f99Var2.b;
            f99Var2.d = true;
            i7++;
            f99Var2 = f99Var2.f;
        }
        return new j99(bArr, iArr);
    }

    @Override // defpackage.fy0
    public final /* bridge */ /* synthetic */ fy0 U(long j) {
        c0(j);
        return this;
    }

    public final f99 W(int i) {
        if (i < 1 || i > 8192) {
            z90.a("unexpected capacity");
            return null;
        }
        f99 f99Var = this.t;
        if (f99Var == null) {
            f99 f99VarB = i99.b();
            this.t = f99VarB;
            f99VarB.g = f99VarB;
            f99VarB.f = f99VarB;
            return f99VarB;
        }
        f99 f99Var2 = f99Var.g;
        f99Var2.getClass();
        if (f99Var2.c + i <= 8192 && f99Var2.e) {
            return f99Var2;
        }
        f99 f99VarB2 = i99.b();
        f99Var2.b(f99VarB2);
        return f99VarB2;
    }

    public final void Y(g01 g01Var) {
        g01Var.getClass();
        g01Var.x(this, g01Var.g());
    }

    public final void Z(int i) {
        f99 f99VarW = W(1);
        byte[] bArr = f99VarW.a;
        int i2 = f99VarW.c;
        f99VarW.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.u++;
    }

    public final void a0(long j) {
        boolean z;
        if (j == 0) {
            Z(48);
            return;
        }
        if (j < 0) {
            j = -j;
            if (j < 0) {
                g0("-9223372036854775808");
                return;
            }
            z = true;
        } else {
            z = false;
        }
        byte[] bArr = c.a;
        int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j)) * 10) >>> 5;
        int i = iNumberOfLeadingZeros + (j > c.b[iNumberOfLeadingZeros] ? 1 : 0);
        if (z) {
            i++;
        }
        f99 f99VarW = W(i);
        byte[] bArr2 = f99VarW.a;
        int i2 = f99VarW.c + i;
        while (j != 0) {
            i2--;
            bArr2[i2] = c.a[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr2[i2 - 1] = 45;
        }
        f99VarW.c += i;
        this.u += (long) i;
    }

    @Override // defpackage.hy0
    public final String b0() {
        return I(Long.MAX_VALUE);
    }

    public final void c0(long j) {
        if (j == 0) {
            Z(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        f99 f99VarW = W(i);
        byte[] bArr = f99VarW.a;
        int i2 = f99VarW.c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = c.a[(int) (15 & j)];
            j >>>= 4;
        }
        f99VarW.c += i;
        this.u += (long) i;
    }

    public final void d0(int i) {
        f99 f99VarW = W(4);
        byte[] bArr = f99VarW.a;
        int i2 = f99VarW.c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        f99VarW.c = i2 + 4;
        this.u += 4;
    }

    public final void e0(int i) {
        f99 f99VarW = W(2);
        byte[] bArr = f99VarW.a;
        int i2 = f99VarW.c;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        f99VarW.c = i2 + 2;
        this.u += 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tx0)) {
            return false;
        }
        long j = this.u;
        tx0 tx0Var = (tx0) obj;
        if (j != tx0Var.u) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        f99 f99Var = this.t;
        f99Var.getClass();
        f99 f99Var2 = tx0Var.t;
        f99Var2.getClass();
        int i = f99Var.b;
        int i2 = f99Var2.b;
        long j2 = 0;
        while (j2 < this.u) {
            long jMin = Math.min(f99Var.c - i, f99Var2.c - i2);
            long j3 = 0;
            while (j3 < jMin) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (f99Var.a[i] != f99Var2.a[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == f99Var.c) {
                f99Var = f99Var.f;
                f99Var.getClass();
                i = f99Var.b;
            }
            if (i2 == f99Var2.c) {
                f99Var2 = f99Var2.f;
                f99Var2.getClass();
                i2 = f99Var2.b;
            }
            j2 += jMin;
        }
        return true;
    }

    public final void f0(int i, int i2, String str) {
        char cCharAt;
        str.getClass();
        if (i < 0) {
            ca0.a(pp2.a(i, "beginIndex < 0: "));
            return;
        }
        if (i2 < i) {
            ca0.a(u.a(i2, i, "endIndex < beginIndex: ", " < "));
            return;
        }
        if (i2 > str.length()) {
            rx0.a(str.length(), t43.b(i2, "endIndex > string.length: ", " > "));
            return;
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                f99 f99VarW = W(1);
                byte[] bArr = f99VarW.a;
                int i3 = f99VarW.c - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = f99VarW.c;
                int i6 = (i3 + i) - i5;
                f99VarW.c = i5 + i6;
                this.u += (long) i6;
            } else {
                if (cCharAt2 < 2048) {
                    f99 f99VarW2 = W(2);
                    byte[] bArr2 = f99VarW2.a;
                    int i7 = f99VarW2.c;
                    bArr2[i7] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    f99VarW2.c = i7 + 2;
                    this.u += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    f99 f99VarW3 = W(3);
                    byte[] bArr3 = f99VarW3.a;
                    int i8 = f99VarW3.c;
                    bArr3[i8] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    f99VarW3.c = i8 + 3;
                    this.u += 3;
                } else {
                    int i9 = i + 1;
                    char cCharAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        Z(63);
                        i = i9;
                    } else {
                        int i10 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        f99 f99VarW4 = W(4);
                        byte[] bArr4 = f99VarW4.a;
                        int i11 = f99VarW4.c;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        f99VarW4.c = i11 + 4;
                        this.u += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    public final void g0(String str) {
        str.getClass();
        f0(0, str.length(), str);
    }

    public final void h() throws EOFException {
        skip(this.u);
    }

    public final int hashCode() {
        f99 f99Var = this.t;
        if (f99Var == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = f99Var.c;
            for (int i3 = f99Var.b; i3 < i2; i3++) {
                i = (i * 31) + f99Var.a[i3];
            }
            f99Var = f99Var.f;
            f99Var.getClass();
        } while (f99Var != this.t);
        return i;
    }

    @Override // defpackage.yq9
    public final void i0(tx0 tx0Var, long j) {
        f99 f99VarB;
        tx0Var.getClass();
        if (tx0Var == this) {
            z90.a("source == this");
            return;
        }
        t.b(tx0Var.u, 0L, j);
        while (j > 0) {
            f99 f99Var = tx0Var.t;
            f99Var.getClass();
            int i = f99Var.c;
            f99 f99Var2 = tx0Var.t;
            f99Var2.getClass();
            long j2 = i - f99Var2.b;
            int i2 = 0;
            if (j < j2) {
                f99 f99Var3 = this.t;
                f99 f99Var4 = f99Var3 != null ? f99Var3.g : null;
                if (f99Var4 != null && f99Var4.e) {
                    if ((((long) f99Var4.c) + j) - ((long) (f99Var4.d ? 0 : f99Var4.b)) <= 8192) {
                        f99 f99Var5 = tx0Var.t;
                        f99Var5.getClass();
                        f99Var5.d(f99Var4, (int) j);
                        tx0Var.u -= j;
                        this.u += j;
                        return;
                    }
                }
                f99 f99Var6 = tx0Var.t;
                f99Var6.getClass();
                int i3 = (int) j;
                if (i3 <= 0 || i3 > f99Var6.c - f99Var6.b) {
                    z90.a("byteCount out of range");
                    return;
                }
                if (i3 >= 1024) {
                    f99VarB = f99Var6.c();
                } else {
                    f99VarB = i99.b();
                    byte[] bArr = f99Var6.a;
                    byte[] bArr2 = f99VarB.a;
                    int i4 = f99Var6.b;
                    gz3.d(0, i4, i4 + i3, bArr, bArr2);
                }
                f99VarB.c = f99VarB.b + i3;
                f99Var6.b += i3;
                f99 f99Var7 = f99Var6.g;
                f99Var7.getClass();
                f99Var7.b(f99VarB);
                tx0Var.t = f99VarB;
            }
            f99 f99Var8 = tx0Var.t;
            f99Var8.getClass();
            long j3 = f99Var8.c - f99Var8.b;
            tx0Var.t = f99Var8.a();
            f99 f99Var9 = this.t;
            if (f99Var9 == null) {
                this.t = f99Var8;
                f99Var8.g = f99Var8;
                f99Var8.f = f99Var8;
            } else {
                f99 f99Var10 = f99Var9.g;
                f99Var10.getClass();
                f99Var10.b(f99Var8);
                f99 f99Var11 = f99Var8.g;
                if (f99Var11 == f99Var8) {
                    aa0.c("cannot compact");
                    return;
                }
                f99Var11.getClass();
                if (f99Var11.e) {
                    int i5 = f99Var8.c - f99Var8.b;
                    f99 f99Var12 = f99Var8.g;
                    f99Var12.getClass();
                    int i6 = 8192 - f99Var12.c;
                    f99 f99Var13 = f99Var8.g;
                    f99Var13.getClass();
                    if (!f99Var13.d) {
                        f99 f99Var14 = f99Var8.g;
                        f99Var14.getClass();
                        i2 = f99Var14.b;
                    }
                    if (i5 <= i6 + i2) {
                        f99 f99Var15 = f99Var8.g;
                        f99Var15.getClass();
                        f99Var8.d(f99Var15, i5);
                        f99Var8.a();
                        i99.a(f99Var8);
                    }
                }
            }
            tx0Var.u -= j3;
            this.u += j3;
            j -= j3;
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final void j0(int i) {
        if (i < 128) {
            Z(i);
            return;
        }
        if (i < 2048) {
            f99 f99VarW = W(2);
            byte[] bArr = f99VarW.a;
            int i2 = f99VarW.c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            f99VarW.c = i2 + 2;
            this.u += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            Z(63);
            return;
        }
        if (i < 65536) {
            f99 f99VarW2 = W(3);
            byte[] bArr2 = f99VarW2.a;
            int i3 = f99VarW2.c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            f99VarW2.c = i3 + 3;
            this.u += 3;
            return;
        }
        if (i > 1114111) {
            z90.a("Unexpected code point: 0x".concat(t.d(i)));
            return;
        }
        f99 f99VarW3 = W(4);
        byte[] bArr3 = f99VarW3.a;
        int i4 = f99VarW3.c;
        bArr3[i4] = (byte) ((i >> 18) | 240);
        bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
        bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
        bArr3[i4 + 3] = (byte) ((i & 63) | 128);
        f99VarW3.c = i4 + 4;
        this.u += 4;
    }

    @Override // defpackage.fy0
    public final /* bridge */ /* synthetic */ fy0 k0(g01 g01Var) {
        Y(g01Var);
        return this;
    }

    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final tx0 clone() {
        tx0 tx0Var = new tx0();
        if (this.u == 0) {
            return tx0Var;
        }
        f99 f99Var = this.t;
        f99Var.getClass();
        f99 f99VarC = f99Var.c();
        tx0Var.t = f99VarC;
        f99VarC.g = f99VarC;
        f99VarC.f = f99VarC;
        for (f99 f99Var2 = f99Var.f; f99Var2 != f99Var; f99Var2 = f99Var2.f) {
            f99 f99Var3 = f99VarC.g;
            f99Var3.getClass();
            f99Var2.getClass();
            f99Var3.b(f99Var2.c());
        }
        tx0Var.u = this.u;
        return tx0Var;
    }

    @Override // defpackage.hy0
    public final void n0(long j) throws EOFException {
        if (this.u < j) {
            throw new EOFException();
        }
    }

    @Override // defpackage.fy0
    public final /* bridge */ /* synthetic */ fy0 o0(long j) {
        a0(j);
        return this;
    }

    public final long p() {
        long j = this.u;
        if (j == 0) {
            return 0L;
        }
        f99 f99Var = this.t;
        f99Var.getClass();
        f99 f99Var2 = f99Var.g;
        f99Var2.getClass();
        int i = f99Var2.c;
        return (i >= 8192 || !f99Var2.e) ? j : j - ((long) (i - f99Var2.b));
    }

    @Override // defpackage.hy0
    public final boolean q(long j, g01 g01Var) {
        g01Var.getClass();
        return B(g01Var.g(), j, g01Var);
    }

    @Override // defpackage.hy0
    public final long q0() throws EOFException {
        int i;
        if (this.u == 0) {
            throw new EOFException();
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            f99 f99Var = this.t;
            f99Var.getClass();
            byte[] bArr = f99Var.a;
            int i3 = f99Var.b;
            int i4 = f99Var.c;
            while (i3 < i4) {
                byte b2 = bArr[i3];
                if (b2 >= 48 && b2 <= 57) {
                    i = b2 + MessagePack.Code.INT8;
                } else if (b2 >= 97 && b2 <= 102) {
                    i = b2 - 87;
                } else {
                    if (b2 < 65 || b2 > 70) {
                        if (i2 == 0) {
                            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(t.c(b2)));
                        }
                        z = true;
                        break;
                    }
                    i = b2 + MessagePack.Code.EXT32;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    tx0 tx0Var = new tx0();
                    tx0Var.c0(j);
                    tx0Var.Z(b2);
                    throw new NumberFormatException("Number too large: ".concat(tx0Var.N()));
                }
                j = (j << 4) | ((long) i);
                i3++;
                i2++;
            }
            if (i3 == i4) {
                this.t = f99Var.a();
                i99.a(f99Var);
            } else {
                f99Var.b = i3;
            }
            if (z) {
                break;
            }
        } while (this.t != null);
        this.u -= (long) i2;
        return j;
    }

    @Override // defpackage.hy0
    public final g01 r(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            ca0.a(d43.b(j, "byteCount: "));
            return null;
        }
        if (this.u < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new g01(H(j));
        }
        g01 g01VarT = T((int) j);
        skip(j);
        return g01VarT;
    }

    @Override // defpackage.hy0
    public final InputStream r0() {
        return new a();
    }

    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        t.b(bArr.length, i, i2);
        f99 f99Var = this.t;
        if (f99Var == null) {
            return -1;
        }
        int iMin = Math.min(i2, f99Var.c - f99Var.b);
        byte[] bArr2 = f99Var.a;
        int i3 = f99Var.b;
        gz3.d(i, i3, i3 + iMin, bArr2, bArr);
        int i4 = f99Var.b + iMin;
        f99Var.b = i4;
        this.u -= (long) iMin;
        if (i4 == f99Var.c) {
            this.t = f99Var.a();
            i99.a(f99Var);
        }
        return iMin;
    }

    @Override // defpackage.hy0
    public final byte readByte() throws EOFException {
        if (this.u == 0) {
            throw new EOFException();
        }
        f99 f99Var = this.t;
        f99Var.getClass();
        int i = f99Var.b;
        int i2 = f99Var.c;
        int i3 = i + 1;
        byte b2 = f99Var.a[i];
        this.u--;
        if (i3 != i2) {
            f99Var.b = i3;
            return b2;
        }
        this.t = f99Var.a();
        i99.a(f99Var);
        return b2;
    }

    @Override // defpackage.hy0
    public final void readFully(byte[] bArr) throws EOFException {
        bArr.getClass();
        int i = 0;
        while (i < bArr.length) {
            int i2 = read(bArr, i, bArr.length - i);
            if (i2 == -1) {
                throw new EOFException();
            }
            i += i2;
        }
    }

    @Override // defpackage.hy0
    public final int readInt() throws EOFException {
        if (this.u < 4) {
            throw new EOFException();
        }
        f99 f99Var = this.t;
        f99Var.getClass();
        int i = f99Var.b;
        int i2 = f99Var.c;
        if (i2 - i < 4) {
            return (readByte() & MessagePack.Code.EXT_TIMESTAMP) | ((readByte() & MessagePack.Code.EXT_TIMESTAMP) << 24) | ((readByte() & MessagePack.Code.EXT_TIMESTAMP) << 16) | ((readByte() & MessagePack.Code.EXT_TIMESTAMP) << 8);
        }
        byte[] bArr = f99Var.a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & MessagePack.Code.EXT_TIMESTAMP) << 16) | ((bArr[i] & MessagePack.Code.EXT_TIMESTAMP) << 24) | ((bArr[i + 2] & MessagePack.Code.EXT_TIMESTAMP) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & MessagePack.Code.EXT_TIMESTAMP) | i4;
        this.u -= 4;
        if (i5 != i2) {
            f99Var.b = i5;
            return i6;
        }
        this.t = f99Var.a();
        i99.a(f99Var);
        return i6;
    }

    @Override // defpackage.hy0
    public final long readLong() throws EOFException {
        if (this.u < 8) {
            throw new EOFException();
        }
        f99 f99Var = this.t;
        f99Var.getClass();
        int i = f99Var.b;
        int i2 = f99Var.c;
        if (i2 - i < 8) {
            return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
        }
        byte[] bArr = f99Var.a;
        int i3 = i + 7;
        long j = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8);
        int i4 = i + 8;
        long j2 = j | (((long) bArr[i3]) & 255);
        this.u -= 8;
        if (i4 != i2) {
            f99Var.b = i4;
            return j2;
        }
        this.t = f99Var.a();
        i99.a(f99Var);
        return j2;
    }

    @Override // defpackage.hy0
    public final short readShort() throws EOFException {
        if (this.u < 2) {
            throw new EOFException();
        }
        f99 f99Var = this.t;
        f99Var.getClass();
        int i = f99Var.b;
        int i2 = f99Var.c;
        if (i2 - i < 2) {
            return (short) ((readByte() & MessagePack.Code.EXT_TIMESTAMP) | ((readByte() & MessagePack.Code.EXT_TIMESTAMP) << 8));
        }
        byte[] bArr = f99Var.a;
        int i3 = i + 1;
        int i4 = (bArr[i] & MessagePack.Code.EXT_TIMESTAMP) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & MessagePack.Code.EXT_TIMESTAMP) | i4;
        this.u -= 2;
        if (i5 == i2) {
            this.t = f99Var.a();
            i99.a(f99Var);
        } else {
            f99Var.b = i5;
        }
        return (short) i6;
    }

    @Override // defpackage.hy0
    public final boolean request(long j) {
        return this.u >= j;
    }

    @Override // defpackage.hy0
    public final int s(yk7 yk7Var) throws EOFException {
        yk7Var.getClass();
        int iD = c.d(this, yk7Var, false);
        if (iD == -1) {
            return -1;
        }
        skip(yk7Var.t[iD].g());
        return iD;
    }

    @Override // defpackage.hy0
    public final void s0(tx0 tx0Var, long j) throws EOFException {
        tx0Var.getClass();
        long j2 = this.u;
        if (j2 >= j) {
            tx0Var.i0(this, j);
        } else {
            tx0Var.i0(this, j2);
            throw new EOFException();
        }
    }

    @Override // defpackage.hy0
    public final void skip(long j) throws EOFException {
        while (j > 0) {
            f99 f99Var = this.t;
            if (f99Var == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, f99Var.c - f99Var.b);
            long j2 = iMin;
            this.u -= j2;
            j -= j2;
            int i = f99Var.b + iMin;
            f99Var.b = i;
            if (i == f99Var.c) {
                this.t = f99Var.a();
                i99.a(f99Var);
            }
        }
    }

    public final void t(tx0 tx0Var, long j, long j2) {
        tx0Var.getClass();
        long j3 = j;
        t.b(this.u, j3, j2);
        if (j2 == 0) {
            return;
        }
        tx0Var.u += j2;
        f99 f99Var = this.t;
        while (true) {
            f99Var.getClass();
            long j4 = f99Var.c - f99Var.b;
            if (j3 < j4) {
                break;
            }
            j3 -= j4;
            f99Var = f99Var.f;
        }
        long j5 = j2;
        while (j5 > 0) {
            f99Var.getClass();
            f99 f99VarC = f99Var.c();
            int i = f99VarC.b + ((int) j3);
            f99VarC.b = i;
            f99VarC.c = Math.min(i + ((int) j5), f99VarC.c);
            f99 f99Var2 = tx0Var.t;
            if (f99Var2 == null) {
                f99VarC.g = f99VarC;
                f99VarC.f = f99VarC;
                tx0Var.t = f99VarC;
            } else {
                f99 f99Var3 = f99Var2.g;
                f99Var3.getClass();
                f99Var3.b(f99VarC);
            }
            j5 -= (long) (f99VarC.c - f99VarC.b);
            f99Var = f99Var.f;
            j3 = 0;
        }
    }

    @Override // defpackage.kw9
    public final voa timeout() {
        return voa.d;
    }

    public final String toString() {
        long j = this.u;
        if (j <= 2147483647L) {
            return T((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.u).toString());
    }

    public final byte u(long j) {
        t.b(this.u, j, 1L);
        f99 f99Var = this.t;
        f99Var.getClass();
        long j2 = this.u;
        if (j2 - j < j) {
            while (j2 > j) {
                f99Var = f99Var.g;
                f99Var.getClass();
                j2 -= (long) (f99Var.c - f99Var.b);
            }
            return f99Var.a[(int) ((((long) f99Var.b) + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = f99Var.c;
            int i2 = f99Var.b;
            long j4 = ((long) (i - i2)) + j3;
            if (j4 > j) {
                return f99Var.a[(int) ((((long) i2) + j) - j3)];
            }
            f99Var = f99Var.f;
            f99Var.getClass();
            j3 = j4;
        }
    }

    public final long v(byte b2, long j, long j2) {
        f99 f99Var;
        long j3 = j;
        long j4 = j2;
        long j5 = 0;
        if (0 > j3 || j3 > j4) {
            throw new IllegalArgumentException(("size=" + this.u + " fromIndex=" + j3 + " toIndex=" + j4).toString());
        }
        long j6 = this.u;
        if (j4 > j6) {
            j4 = j6;
        }
        long j7 = -1;
        if (j3 == j4 || (f99Var = this.t) == null) {
            return -1L;
        }
        if (j6 - j3 < j3) {
            while (j6 > j3) {
                f99Var = f99Var.g;
                f99Var.getClass();
                j6 -= (long) (f99Var.c - f99Var.b);
            }
            while (j6 < j4) {
                byte[] bArr = f99Var.a;
                long j8 = j7;
                int iMin = (int) Math.min(f99Var.c, (((long) f99Var.b) + j4) - j6);
                for (int i = (int) ((((long) f99Var.b) + j3) - j6); i < iMin; i++) {
                    if (bArr[i] == b2) {
                        return ((long) (i - f99Var.b)) + j6;
                    }
                }
                j6 += (long) (f99Var.c - f99Var.b);
                f99Var = f99Var.f;
                f99Var.getClass();
                j7 = j8;
                j3 = j6;
            }
            return j7;
        }
        while (true) {
            long j9 = ((long) (f99Var.c - f99Var.b)) + j5;
            if (j9 > j3) {
                break;
            }
            f99Var = f99Var.f;
            f99Var.getClass();
            j5 = j9;
        }
        while (j5 < j4) {
            byte[] bArr2 = f99Var.a;
            int iMin2 = (int) Math.min(f99Var.c, (((long) f99Var.b) + j4) - j5);
            for (int i2 = (int) ((((long) f99Var.b) + j3) - j5); i2 < iMin2; i2++) {
                if (bArr2[i2] == b2) {
                    return ((long) (i2 - f99Var.b)) + j5;
                }
            }
            j5 += (long) (f99Var.c - f99Var.b);
            f99Var = f99Var.f;
            f99Var.getClass();
            j3 = j5;
        }
        return -1L;
    }

    /* JADX INFO: renamed from: write, reason: collision with other method in class */
    public final void m884write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        long j = i2;
        t.b(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            f99 f99VarW = W(1);
            int iMin = Math.min(i3 - i, 8192 - f99VarW.c);
            int i4 = i + iMin;
            gz3.d(f99VarW.c, i, i4, bArr, f99VarW.a);
            f99VarW.c += iMin;
            i = i4;
        }
        this.u += j;
    }

    @Override // defpackage.fy0
    public final /* bridge */ /* synthetic */ fy0 writeByte(int i) {
        Z(i);
        return this;
    }

    @Override // defpackage.fy0
    public final /* bridge */ /* synthetic */ fy0 writeInt(int i) {
        d0(i);
        return this;
    }

    @Override // defpackage.fy0
    public final /* bridge */ /* synthetic */ fy0 writeShort(int i) {
        e0(i);
        return this;
    }

    @Override // defpackage.hy0
    public final byte[] x() {
        return H(this.u);
    }

    public final long y(g01 g01Var) {
        int i;
        int i2;
        g01Var.getClass();
        f99 f99Var = this.t;
        if (f99Var == null) {
            return -1L;
        }
        long j = this.u;
        long j2 = 0;
        if (j < 0) {
            while (j > 0) {
                f99Var = f99Var.g;
                f99Var.getClass();
                j -= (long) (f99Var.c - f99Var.b);
            }
            if (g01Var.g() == 2) {
                byte bL = g01Var.l(0);
                byte bL2 = g01Var.l(1);
                while (j < this.u) {
                    byte[] bArr = f99Var.a;
                    i = (int) ((((long) f99Var.b) + j2) - j);
                    int i3 = f99Var.c;
                    while (true) {
                        if (i >= i3) {
                            j2 = ((long) (f99Var.c - f99Var.b)) + j;
                            f99Var = f99Var.f;
                            f99Var.getClass();
                            j = j2;
                        } else {
                            byte b2 = bArr[i];
                            if (b2 == bL || b2 == bL2) {
                                i2 = f99Var.b;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                return -1L;
            }
            byte[] bArrK = g01Var.k();
            while (j < this.u) {
                byte[] bArr2 = f99Var.a;
                i = (int) ((((long) f99Var.b) + j2) - j);
                int i4 = f99Var.c;
                while (true) {
                    if (i < i4) {
                        byte b3 = bArr2[i];
                        int length = bArrK.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length) {
                                i++;
                            } else if (b3 == bArrK[i5]) {
                                i2 = f99Var.b;
                            } else {
                                i5++;
                            }
                        }
                    } else {
                        j2 = ((long) (f99Var.c - f99Var.b)) + j;
                        f99Var = f99Var.f;
                        f99Var.getClass();
                        j = j2;
                    }
                }
            }
            return -1L;
        }
        j = 0;
        while (true) {
            long j3 = ((long) (f99Var.c - f99Var.b)) + j;
            if (j3 > 0) {
                break;
            }
            f99Var = f99Var.f;
            f99Var.getClass();
            j = j3;
        }
        if (g01Var.g() == 2) {
            byte bL3 = g01Var.l(0);
            byte bL4 = g01Var.l(1);
            while (j < this.u) {
                byte[] bArr3 = f99Var.a;
                i = (int) ((((long) f99Var.b) + j2) - j);
                int i6 = f99Var.c;
                while (true) {
                    if (i >= i6) {
                        j2 = ((long) (f99Var.c - f99Var.b)) + j;
                        f99Var = f99Var.f;
                        f99Var.getClass();
                        j = j2;
                    } else {
                        byte b4 = bArr3[i];
                        if (b4 == bL3 || b4 == bL4) {
                            i2 = f99Var.b;
                        } else {
                            i++;
                        }
                    }
                }
            }
            return -1L;
        }
        byte[] bArrK2 = g01Var.k();
        while (j < this.u) {
            byte[] bArr4 = f99Var.a;
            i = (int) ((((long) f99Var.b) + j2) - j);
            int i7 = f99Var.c;
            while (true) {
                if (i < i7) {
                    byte b5 = bArr4[i];
                    int length2 = bArrK2.length;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= length2) {
                            i++;
                        } else if (b5 == bArrK2[i8]) {
                            i2 = f99Var.b;
                        } else {
                            i8++;
                        }
                    }
                } else {
                    j2 = ((long) (f99Var.c - f99Var.b)) + j;
                    f99Var = f99Var.f;
                    f99Var.getClass();
                    j = j2;
                }
            }
        }
        return -1L;
        return ((long) (i - i2)) + j;
    }

    @Override // defpackage.hy0
    public final boolean z() {
        return this.u == 0;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends InputStream implements InputStreamRetargetInterface {
        public a() {
        }

        @Override // java.io.InputStream
        public final int available() {
            return (int) Math.min(tx0.this.u, 2147483647L);
        }

        @Override // java.io.InputStream
        public final int read() {
            tx0 tx0Var = tx0.this;
            if (tx0Var.u > 0) {
                return tx0Var.readByte() & MessagePack.Code.EXT_TIMESTAMP;
            }
            return -1;
        }

        public final String toString() {
            return tx0.this + ".inputStream()";
        }

        @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
        public /* synthetic */ long transferTo(OutputStream outputStream) {
            return DesugarInputStream.transferTo(this, outputStream);
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) {
            bArr.getClass();
            return tx0.this.read(bArr, i, i2);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, defpackage.yq9
    public final void close() {
    }

    @Override // defpackage.fy0, defpackage.yq9, java.io.Flushable
    public final void flush() {
    }

    @Override // defpackage.hy0
    public final tx0 j() {
        return this;
    }

    @Override // defpackage.fy0
    public final /* bridge */ /* synthetic */ fy0 write(byte[] bArr, int i, int i2) {
        m884write(bArr, i, i2);
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            f99 f99VarW = W(1);
            int iMin = Math.min(i, 8192 - f99VarW.c);
            byteBuffer.get(f99VarW.a, f99VarW.c, iMin);
            i -= iMin;
            f99VarW.c += iMin;
        }
        this.u += (long) iRemaining;
        return iRemaining;
    }

    @Override // defpackage.fy0
    public final fy0 write(byte[] bArr) {
        bArr.getClass();
        m884write(bArr, 0, bArr.length);
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        f99 f99Var = this.t;
        if (f99Var == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), f99Var.c - f99Var.b);
        byteBuffer.put(f99Var.a, f99Var.b, iMin);
        int i = f99Var.b + iMin;
        f99Var.b = i;
        this.u -= (long) iMin;
        if (i == f99Var.c) {
            this.t = f99Var.a();
            i99.a(f99Var);
        }
        return iMin;
    }
}
