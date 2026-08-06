package defpackage;

import com.intercom.twig.BuildConfig;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import org.msgpack.core.MessagePack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class pg1 {
    public int a;
    public final int b = 100;
    public final int c = Integer.MAX_VALUE;
    public rg1 d;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends pg1 {
        public final byte[] e;
        public int f;
        public int g;
        public int h;
        public final int i;
        public int j;
        public int k = Integer.MAX_VALUE;

        public a(byte[] bArr, int i, int i2, boolean z) {
            this.e = bArr;
            this.f = i2 + i;
            this.h = i;
            this.i = i;
        }

        public final long A() throws fk5 {
            int i = this.h;
            if (this.f - i < 8) {
                throw fk5.e();
            }
            this.h = i + 8;
            byte[] bArr = this.e;
            return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
        }

        public final int B() {
            int i;
            int i2 = this.h;
            int i3 = this.f;
            if (i3 != i2) {
                int i4 = i2 + 1;
                byte[] bArr = this.e;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.h = i4;
                    return b;
                }
                if (i3 - i4 >= 9) {
                    int i5 = i2 + 2;
                    int i6 = (bArr[i4] << 7) ^ b;
                    if (i6 < 0) {
                        i = i6 ^ (-128);
                    } else {
                        int i7 = i2 + 3;
                        int i8 = (bArr[i5] << 14) ^ i6;
                        if (i8 >= 0) {
                            i = i8 ^ 16256;
                        } else {
                            int i9 = i2 + 4;
                            int i10 = i8 ^ (bArr[i7] << 21);
                            if (i10 < 0) {
                                i = (-2080896) ^ i10;
                            } else {
                                i7 = i2 + 5;
                                byte b2 = bArr[i9];
                                int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                                if (b2 < 0) {
                                    i9 = i2 + 6;
                                    if (bArr[i7] < 0) {
                                        i7 = i2 + 7;
                                        if (bArr[i9] < 0) {
                                            i9 = i2 + 8;
                                            if (bArr[i7] < 0) {
                                                i7 = i2 + 9;
                                                if (bArr[i9] < 0) {
                                                    int i12 = i2 + 10;
                                                    if (bArr[i7] >= 0) {
                                                        i5 = i12;
                                                        i = i11;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i = i11;
                                }
                                i = i11;
                            }
                            i5 = i9;
                        }
                        i5 = i7;
                    }
                    this.h = i5;
                    return i;
                }
            }
            return (int) D();
        }

        public final long C() {
            long j;
            long j2;
            long j3;
            long j4;
            int i = this.h;
            int i2 = this.f;
            if (i2 != i) {
                int i3 = i + 1;
                byte[] bArr = this.e;
                byte b = bArr[i];
                if (b >= 0) {
                    this.h = i3;
                    return b;
                }
                if (i2 - i3 >= 9) {
                    int i4 = i + 2;
                    int i5 = (bArr[i3] << 7) ^ b;
                    if (i5 < 0) {
                        j = i5 ^ (-128);
                    } else {
                        int i6 = i + 3;
                        int i7 = (bArr[i4] << 14) ^ i5;
                        if (i7 >= 0) {
                            j = i7 ^ 16256;
                            i4 = i6;
                        } else {
                            int i8 = i + 4;
                            int i9 = i7 ^ (bArr[i6] << 21);
                            if (i9 < 0) {
                                j4 = (-2080896) ^ i9;
                            } else {
                                long j5 = i9;
                                i4 = i + 5;
                                long j6 = j5 ^ (((long) bArr[i8]) << 28);
                                if (j6 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    i8 = i + 6;
                                    long j7 = j6 ^ (((long) bArr[i4]) << 35);
                                    if (j7 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i4 = i + 7;
                                        j6 = j7 ^ (((long) bArr[i8]) << 42);
                                        if (j6 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i8 = i + 8;
                                            j7 = j6 ^ (((long) bArr[i4]) << 49);
                                            if (j7 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                i4 = i + 9;
                                                long j8 = (j7 ^ (((long) bArr[i8]) << 56)) ^ 71499008037633920L;
                                                if (j8 < 0) {
                                                    int i10 = i + 10;
                                                    if (bArr[i4] >= 0) {
                                                        i4 = i10;
                                                    }
                                                }
                                                j = j8;
                                            }
                                        }
                                    }
                                    j4 = j2 ^ j7;
                                }
                                j = j3 ^ j6;
                            }
                            i4 = i8;
                            j = j4;
                        }
                    }
                    this.h = i4;
                    return j;
                }
            }
            return D();
        }

        public final long D() throws fk5 {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                int i2 = this.h;
                if (i2 == this.f) {
                    throw fk5.e();
                }
                this.h = i2 + 1;
                byte b = this.e[i2];
                j |= ((long) (b & 127)) << i;
                if ((b & 128) == 0) {
                    return j;
                }
            }
            throw fk5.c();
        }

        public final void E() {
            int i = this.f + this.g;
            this.f = i;
            int i2 = i - this.i;
            int i3 = this.k;
            if (i2 <= i3) {
                this.g = 0;
                return;
            }
            int i4 = i2 - i3;
            this.g = i4;
            this.f = i - i4;
        }

        public final void F(int i) throws fk5 {
            if (i >= 0) {
                int i2 = this.f;
                int i3 = this.h;
                if (i <= i2 - i3) {
                    this.h = i3 + i;
                    return;
                }
            }
            if (i >= 0) {
                throw fk5.e();
            }
            throw fk5.d();
        }

        @Override // defpackage.pg1
        public final void a(int i) throws fk5 {
            if (this.j != i) {
                throw new fk5("Protocol message end-group tag did not match expected tag.");
            }
        }

        @Override // defpackage.pg1
        public final int b() {
            return this.h - this.i;
        }

        @Override // defpackage.pg1
        public final boolean c() {
            return this.h == this.f;
        }

        @Override // defpackage.pg1
        public final void d(int i) {
            this.k = i;
            E();
        }

        @Override // defpackage.pg1
        public final int e(int i) throws fk5 {
            if (i < 0) {
                throw fk5.d();
            }
            int iB = b() + i;
            if (iB < 0) {
                throw new fk5("Failed to parse the message.");
            }
            int i2 = this.k;
            if (iB > i2) {
                throw fk5.e();
            }
            this.k = iB;
            E();
            return i2;
        }

        @Override // defpackage.pg1
        public final boolean f() {
            return C() != 0;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x002f A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:17:0x0033  */
        /* JADX WARN: Code duplicated, block: B:20:0x003d  */
        /* JADX WARN: Code duplicated, block: B:22:0x0042  */
        @Override // defpackage.pg1
        public final e01.f g() throws fk5 {
            byte[] bArrCopyOfRange;
            int iB = B();
            byte[] bArr = this.e;
            if (iB > 0) {
                int i = this.f;
                int i2 = this.h;
                if (iB <= i - i2) {
                    e01.f fVarF = e01.f(bArr, i2, iB);
                    this.h += iB;
                    return fVarF;
                }
            }
            if (iB == 0) {
                return e01.u;
            }
            if (iB > 0) {
                int i3 = this.f;
                int i4 = this.h;
                if (iB <= i3 - i4) {
                    int i5 = iB + i4;
                    this.h = i5;
                    bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, i5);
                } else {
                    if (iB <= 0) {
                        throw fk5.e();
                    }
                    if (iB == 0) {
                        throw fk5.d();
                    }
                    bArrCopyOfRange = xi5.b;
                }
            } else {
                if (iB <= 0) {
                    throw fk5.e();
                }
                if (iB == 0) {
                    throw fk5.d();
                }
                bArrCopyOfRange = xi5.b;
            }
            e01.f fVar = e01.u;
            return new e01.f(bArrCopyOfRange);
        }

        @Override // defpackage.pg1
        public final double h() {
            return Double.longBitsToDouble(A());
        }

        @Override // defpackage.pg1
        public final int i() {
            return B();
        }

        @Override // defpackage.pg1
        public final int j() {
            return z();
        }

        @Override // defpackage.pg1
        public final long k() {
            return A();
        }

        @Override // defpackage.pg1
        public final float l() {
            return Float.intBitsToFloat(z());
        }

        @Override // defpackage.pg1
        public final int m() {
            return B();
        }

        @Override // defpackage.pg1
        public final long n() {
            return C();
        }

        @Override // defpackage.pg1
        public final int o() {
            return z();
        }

        @Override // defpackage.pg1
        public final long p() {
            return A();
        }

        @Override // defpackage.pg1
        public final int q() {
            int iB = B();
            return (-(iB & 1)) ^ (iB >>> 1);
        }

        @Override // defpackage.pg1
        public final long r() {
            long jC = C();
            return (-(jC & 1)) ^ (jC >>> 1);
        }

        @Override // defpackage.pg1
        public final String s() throws fk5 {
            int iB = B();
            if (iB > 0) {
                int i = this.f;
                int i2 = this.h;
                if (iB <= i - i2) {
                    String str = new String(this.e, i2, iB, xi5.a);
                    this.h += iB;
                    return str;
                }
            }
            if (iB == 0) {
                return BuildConfig.FLAVOR;
            }
            if (iB < 0) {
                throw fk5.d();
            }
            throw fk5.e();
        }

        @Override // defpackage.pg1
        public final String t() throws fk5 {
            int iB = B();
            if (iB > 0) {
                int i = this.f;
                int i2 = this.h;
                if (iB <= i - i2) {
                    String strA = g6b.a.a(this.e, i2, iB);
                    this.h += iB;
                    return strA;
                }
            }
            if (iB == 0) {
                return BuildConfig.FLAVOR;
            }
            if (iB <= 0) {
                throw fk5.d();
            }
            throw fk5.e();
        }

        @Override // defpackage.pg1
        public final int u() throws fk5 {
            if (c()) {
                this.j = 0;
                return 0;
            }
            int iB = B();
            this.j = iB;
            if ((iB >>> 3) != 0) {
                return iB;
            }
            throw new fk5("Protocol message contained an invalid tag (zero).");
        }

        @Override // defpackage.pg1
        public final int v() {
            return B();
        }

        @Override // defpackage.pg1
        public final long w() {
            return C();
        }

        @Override // defpackage.pg1
        public final boolean x(int i) throws fk5 {
            int i2 = i & 7;
            int i3 = 0;
            if (i2 != 0) {
                if (i2 == 1) {
                    F(8);
                    return true;
                }
                if (i2 == 2) {
                    F(B());
                    return true;
                }
                if (i2 == 3) {
                    y();
                    a(((i >>> 3) << 3) | 4);
                    return true;
                }
                if (i2 == 4) {
                    return false;
                }
                if (i2 != 5) {
                    throw fk5.b();
                }
                F(4);
                return true;
            }
            int i4 = this.f - this.h;
            byte[] bArr = this.e;
            if (i4 >= 10) {
                while (i3 < 10) {
                    int i5 = this.h;
                    this.h = i5 + 1;
                    if (bArr[i5] < 0) {
                        i3++;
                    }
                }
                throw fk5.c();
            }
            while (i3 < 10) {
                int i6 = this.h;
                if (i6 == this.f) {
                    throw fk5.e();
                }
                this.h = i6 + 1;
                if (bArr[i6] < 0) {
                    i3++;
                }
            }
            throw fk5.c();
            return true;
        }

        public final int z() throws fk5 {
            int i = this.h;
            if (this.f - i < 4) {
                throw fk5.e();
            }
            this.h = i + 4;
            byte[] bArr = this.e;
            return ((bArr[i + 3] & MessagePack.Code.EXT_TIMESTAMP) << 24) | (bArr[i] & MessagePack.Code.EXT_TIMESTAMP) | ((bArr[i + 1] & MessagePack.Code.EXT_TIMESTAMP) << 8) | ((bArr[i + 2] & MessagePack.Code.EXT_TIMESTAMP) << 16);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends pg1 {
        public final FileInputStream e;
        public final byte[] f;
        public int g;
        public int h;
        public int i;
        public int j;
        public int k;
        public int l = Integer.MAX_VALUE;

        public b(FileInputStream fileInputStream) {
            Charset charset = xi5.a;
            this.e = fileInputStream;
            this.f = new byte[4096];
            this.g = 0;
            this.i = 0;
            this.k = 0;
        }

        public final byte[] A(int i) throws IOException {
            if (i == 0) {
                return xi5.b;
            }
            if (i < 0) {
                throw fk5.d();
            }
            int i2 = this.k;
            int i3 = this.i;
            int i4 = i2 + i3 + i;
            if (i4 - this.c > 0) {
                throw new fk5("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            int i5 = this.l;
            if (i4 > i5) {
                J((i5 - i2) - i3);
                throw fk5.e();
            }
            int i6 = this.g - i3;
            int i7 = i - i6;
            FileInputStream fileInputStream = this.e;
            if (i7 >= 4096) {
                try {
                    if (i7 > fileInputStream.available()) {
                        return null;
                    }
                } catch (fk5 e) {
                    e.t = true;
                    throw e;
                }
            }
            byte[] bArr = new byte[i];
            System.arraycopy(this.f, this.i, bArr, 0, i6);
            this.k += this.g;
            this.i = 0;
            this.g = 0;
            while (i6 < i) {
                try {
                    int i8 = fileInputStream.read(bArr, i6, i - i6);
                    if (i8 == -1) {
                        throw fk5.e();
                    }
                    this.k += i8;
                    i6 += i8;
                } catch (fk5 e2) {
                    e2.t = true;
                    throw e2;
                }
            }
            return bArr;
        }

        public final ArrayList B(int i) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i > 0) {
                int iMin = Math.min(i, 4096);
                byte[] bArr = new byte[iMin];
                int i2 = 0;
                while (i2 < iMin) {
                    int i3 = this.e.read(bArr, i2, iMin - i2);
                    if (i3 == -1) {
                        throw fk5.e();
                    }
                    this.k += i3;
                    i2 += i3;
                }
                i -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        public final int C() throws fk5 {
            int i = this.i;
            if (this.g - i < 4) {
                I(4);
                i = this.i;
            }
            this.i = i + 4;
            byte[] bArr = this.f;
            return ((bArr[i + 3] & MessagePack.Code.EXT_TIMESTAMP) << 24) | (bArr[i] & MessagePack.Code.EXT_TIMESTAMP) | ((bArr[i + 1] & MessagePack.Code.EXT_TIMESTAMP) << 8) | ((bArr[i + 2] & MessagePack.Code.EXT_TIMESTAMP) << 16);
        }

        public final long D() throws fk5 {
            int i = this.i;
            if (this.g - i < 8) {
                I(8);
                i = this.i;
            }
            this.i = i + 8;
            byte[] bArr = this.f;
            return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
        }

        public final int E() {
            int i;
            int i2 = this.i;
            int i3 = this.g;
            if (i3 != i2) {
                int i4 = i2 + 1;
                byte[] bArr = this.f;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.i = i4;
                    return b;
                }
                if (i3 - i4 >= 9) {
                    int i5 = i2 + 2;
                    int i6 = (bArr[i4] << 7) ^ b;
                    if (i6 < 0) {
                        i = i6 ^ (-128);
                    } else {
                        int i7 = i2 + 3;
                        int i8 = (bArr[i5] << 14) ^ i6;
                        if (i8 >= 0) {
                            i = i8 ^ 16256;
                        } else {
                            int i9 = i2 + 4;
                            int i10 = i8 ^ (bArr[i7] << 21);
                            if (i10 < 0) {
                                i = (-2080896) ^ i10;
                            } else {
                                i7 = i2 + 5;
                                byte b2 = bArr[i9];
                                int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                                if (b2 < 0) {
                                    i9 = i2 + 6;
                                    if (bArr[i7] < 0) {
                                        i7 = i2 + 7;
                                        if (bArr[i9] < 0) {
                                            i9 = i2 + 8;
                                            if (bArr[i7] < 0) {
                                                i7 = i2 + 9;
                                                if (bArr[i9] < 0) {
                                                    int i12 = i2 + 10;
                                                    if (bArr[i7] >= 0) {
                                                        i5 = i12;
                                                        i = i11;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i = i11;
                                }
                                i = i11;
                            }
                            i5 = i9;
                        }
                        i5 = i7;
                    }
                    this.i = i5;
                    return i;
                }
            }
            return (int) G();
        }

        public final long F() {
            long j;
            long j2;
            long j3;
            long j4;
            int i = this.i;
            int i2 = this.g;
            if (i2 != i) {
                int i3 = i + 1;
                byte[] bArr = this.f;
                byte b = bArr[i];
                if (b >= 0) {
                    this.i = i3;
                    return b;
                }
                if (i2 - i3 >= 9) {
                    int i4 = i + 2;
                    int i5 = (bArr[i3] << 7) ^ b;
                    if (i5 < 0) {
                        j = i5 ^ (-128);
                    } else {
                        int i6 = i + 3;
                        int i7 = (bArr[i4] << 14) ^ i5;
                        if (i7 >= 0) {
                            j = i7 ^ 16256;
                            i4 = i6;
                        } else {
                            int i8 = i + 4;
                            int i9 = i7 ^ (bArr[i6] << 21);
                            if (i9 < 0) {
                                j4 = (-2080896) ^ i9;
                            } else {
                                long j5 = i9;
                                i4 = i + 5;
                                long j6 = j5 ^ (((long) bArr[i8]) << 28);
                                if (j6 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    i8 = i + 6;
                                    long j7 = j6 ^ (((long) bArr[i4]) << 35);
                                    if (j7 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i4 = i + 7;
                                        j6 = j7 ^ (((long) bArr[i8]) << 42);
                                        if (j6 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i8 = i + 8;
                                            j7 = j6 ^ (((long) bArr[i4]) << 49);
                                            if (j7 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                i4 = i + 9;
                                                long j8 = (j7 ^ (((long) bArr[i8]) << 56)) ^ 71499008037633920L;
                                                if (j8 < 0) {
                                                    int i10 = i + 10;
                                                    if (bArr[i4] >= 0) {
                                                        i4 = i10;
                                                    }
                                                }
                                                j = j8;
                                            }
                                        }
                                    }
                                    j4 = j2 ^ j7;
                                }
                                j = j3 ^ j6;
                            }
                            i4 = i8;
                            j = j4;
                        }
                    }
                    this.i = i4;
                    return j;
                }
            }
            return G();
        }

        public final long G() throws fk5 {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                if (this.i == this.g) {
                    I(1);
                }
                int i2 = this.i;
                this.i = i2 + 1;
                byte b = this.f[i2];
                j |= ((long) (b & 127)) << i;
                if ((b & 128) == 0) {
                    return j;
                }
            }
            throw fk5.c();
        }

        public final void H() {
            int i = this.g + this.h;
            this.g = i;
            int i2 = this.k + i;
            int i3 = this.l;
            if (i2 <= i3) {
                this.h = 0;
                return;
            }
            int i4 = i2 - i3;
            this.h = i4;
            this.g = i - i4;
        }

        public final void I(int i) throws fk5 {
            if (K(i)) {
                return;
            }
            if (i <= (this.c - this.k) - this.i) {
                throw fk5.e();
            }
            throw new fk5("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }

        public final void J(int i) throws fk5 {
            int i2 = this.g;
            int i3 = this.i;
            int i4 = i2 - i3;
            if (i <= i4 && i >= 0) {
                this.i = i3 + i;
                return;
            }
            FileInputStream fileInputStream = this.e;
            if (i < 0) {
                throw fk5.d();
            }
            int i5 = this.k;
            int i6 = i5 + i3;
            int i7 = i6 + i;
            int i8 = this.l;
            if (i7 > i8) {
                J((i8 - i5) - i3);
                throw fk5.e();
            }
            this.k = i6;
            this.g = 0;
            this.i = 0;
            while (i4 < i) {
                long j = i - i4;
                try {
                    try {
                        long jSkip = fileInputStream.skip(j);
                        if (jSkip < 0 || jSkip > j) {
                            throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                        }
                        if (jSkip == 0) {
                            break;
                        } else {
                            i4 += (int) jSkip;
                        }
                    } catch (fk5 e) {
                        e.t = true;
                        throw e;
                    }
                } catch (Throwable th) {
                    this.k += i4;
                    H();
                    throw th;
                }
            }
            this.k += i4;
            H();
            if (i4 >= i) {
                return;
            }
            int i9 = this.g;
            int i10 = i9 - this.i;
            this.i = i9;
            I(1);
            while (true) {
                int i11 = i - i10;
                int i12 = this.g;
                if (i11 <= i12) {
                    this.i = i11;
                    return;
                } else {
                    i10 += i12;
                    this.i = i12;
                    I(1);
                }
            }
        }

        public final boolean K(int i) throws IOException {
            FileInputStream fileInputStream = this.e;
            int i2 = this.i;
            int i3 = i2 + i;
            int i4 = this.g;
            if (i3 <= i4) {
                aa0.c(pk.d(i, "refillBuffer() called when ", " bytes were already available in buffer"));
                return false;
            }
            int i5 = this.k;
            int i6 = this.c;
            if (i <= (i6 - i5) - i2 && i5 + i2 + i <= this.l) {
                byte[] bArr = this.f;
                if (i2 > 0) {
                    if (i4 > i2) {
                        System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                    }
                    this.k += i2;
                    this.g -= i2;
                    this.i = 0;
                }
                int i7 = this.g;
                try {
                    int i8 = fileInputStream.read(bArr, i7, Math.min(bArr.length - i7, (i6 - this.k) - i7));
                    if (i8 == 0 || i8 < -1 || i8 > bArr.length) {
                        throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + i8 + "\nThe InputStream implementation is buggy.");
                    }
                    if (i8 > 0) {
                        this.g += i8;
                        H();
                        if (this.g >= i) {
                            return true;
                        }
                        return K(i);
                    }
                } catch (fk5 e) {
                    e.t = true;
                    throw e;
                }
            }
            return false;
        }

        @Override // defpackage.pg1
        public final void a(int i) throws fk5 {
            if (this.j != i) {
                throw new fk5("Protocol message end-group tag did not match expected tag.");
            }
        }

        @Override // defpackage.pg1
        public final int b() {
            return this.k + this.i;
        }

        @Override // defpackage.pg1
        public final boolean c() {
            return this.i == this.g && !K(1);
        }

        @Override // defpackage.pg1
        public final void d(int i) {
            this.l = i;
            H();
        }

        @Override // defpackage.pg1
        public final int e(int i) throws fk5 {
            if (i < 0) {
                throw fk5.d();
            }
            int i2 = this.k + this.i + i;
            if (i2 < 0) {
                throw new fk5("Failed to parse the message.");
            }
            int i3 = this.l;
            if (i2 > i3) {
                throw fk5.e();
            }
            this.l = i2;
            H();
            return i3;
        }

        @Override // defpackage.pg1
        public final boolean f() {
            return F() != 0;
        }

        @Override // defpackage.pg1
        public final e01.f g() throws IOException {
            int iE = E();
            int i = this.g;
            int i2 = this.i;
            int i3 = i - i2;
            byte[] bArr = this.f;
            if (iE <= i3 && iE > 0) {
                e01.f fVarF = e01.f(bArr, i2, iE);
                this.i += iE;
                return fVarF;
            }
            if (iE == 0) {
                return e01.u;
            }
            if (iE < 0) {
                throw fk5.d();
            }
            byte[] bArrA = A(iE);
            if (bArrA != null) {
                return e01.f(bArrA, 0, bArrA.length);
            }
            int i4 = this.i;
            int i5 = this.g;
            int length = i5 - i4;
            this.k += i5;
            this.i = 0;
            this.g = 0;
            ArrayList arrayListB = B(iE - length);
            byte[] bArr2 = new byte[iE];
            System.arraycopy(bArr, i4, bArr2, 0, length);
            int size = arrayListB.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayListB.get(i6);
                i6++;
                byte[] bArr3 = (byte[]) obj;
                System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
                length += bArr3.length;
            }
            e01.f fVar = e01.u;
            return new e01.f(bArr2);
        }

        @Override // defpackage.pg1
        public final double h() {
            return Double.longBitsToDouble(D());
        }

        @Override // defpackage.pg1
        public final int i() {
            return E();
        }

        @Override // defpackage.pg1
        public final int j() {
            return C();
        }

        @Override // defpackage.pg1
        public final long k() {
            return D();
        }

        @Override // defpackage.pg1
        public final float l() {
            return Float.intBitsToFloat(C());
        }

        @Override // defpackage.pg1
        public final int m() {
            return E();
        }

        @Override // defpackage.pg1
        public final long n() {
            return F();
        }

        @Override // defpackage.pg1
        public final int o() {
            return C();
        }

        @Override // defpackage.pg1
        public final long p() {
            return D();
        }

        @Override // defpackage.pg1
        public final int q() {
            int iE = E();
            return (-(iE & 1)) ^ (iE >>> 1);
        }

        @Override // defpackage.pg1
        public final long r() {
            long jF = F();
            return (-(jF & 1)) ^ (jF >>> 1);
        }

        @Override // defpackage.pg1
        public final String s() throws fk5 {
            int iE = E();
            byte[] bArr = this.f;
            if (iE > 0) {
                int i = this.g;
                int i2 = this.i;
                if (iE <= i - i2) {
                    String str = new String(bArr, i2, iE, xi5.a);
                    this.i += iE;
                    return str;
                }
            }
            if (iE == 0) {
                return BuildConfig.FLAVOR;
            }
            if (iE < 0) {
                throw fk5.d();
            }
            if (iE > this.g) {
                return new String(z(iE), xi5.a);
            }
            I(iE);
            String str2 = new String(bArr, this.i, iE, xi5.a);
            this.i += iE;
            return str2;
        }

        @Override // defpackage.pg1
        public final String t() throws IOException {
            int iE = E();
            int i = this.i;
            int i2 = this.g;
            int i3 = i2 - i;
            byte[] bArrZ = this.f;
            if (iE <= i3 && iE > 0) {
                this.i = i + iE;
            } else {
                if (iE == 0) {
                    return BuildConfig.FLAVOR;
                }
                if (iE < 0) {
                    throw fk5.d();
                }
                i = 0;
                if (iE <= i2) {
                    I(iE);
                    this.i = iE;
                } else {
                    bArrZ = z(iE);
                }
            }
            return g6b.a.a(bArrZ, i, iE);
        }

        @Override // defpackage.pg1
        public final int u() throws fk5 {
            if (c()) {
                this.j = 0;
                return 0;
            }
            int iE = E();
            this.j = iE;
            if ((iE >>> 3) != 0) {
                return iE;
            }
            throw new fk5("Protocol message contained an invalid tag (zero).");
        }

        @Override // defpackage.pg1
        public final int v() {
            return E();
        }

        @Override // defpackage.pg1
        public final long w() {
            return F();
        }

        @Override // defpackage.pg1
        public final boolean x(int i) throws fk5 {
            int i2 = i & 7;
            int i3 = 0;
            if (i2 != 0) {
                if (i2 == 1) {
                    J(8);
                    return true;
                }
                if (i2 == 2) {
                    J(E());
                    return true;
                }
                if (i2 == 3) {
                    y();
                    a(((i >>> 3) << 3) | 4);
                    return true;
                }
                if (i2 == 4) {
                    return false;
                }
                if (i2 != 5) {
                    throw fk5.b();
                }
                J(4);
                return true;
            }
            int i4 = this.g - this.i;
            byte[] bArr = this.f;
            if (i4 >= 10) {
                while (i3 < 10) {
                    int i5 = this.i;
                    this.i = i5 + 1;
                    if (bArr[i5] < 0) {
                        i3++;
                    }
                }
                throw fk5.c();
            }
            while (i3 < 10) {
                if (this.i == this.g) {
                    I(1);
                }
                int i6 = this.i;
                this.i = i6 + 1;
                if (bArr[i6] < 0) {
                    i3++;
                }
            }
            throw fk5.c();
            return true;
        }

        public final byte[] z(int i) throws IOException {
            byte[] bArrA = A(i);
            if (bArrA != null) {
                return bArrA;
            }
            int i2 = this.i;
            int i3 = this.g;
            int length = i3 - i2;
            this.k += i3;
            this.i = 0;
            this.g = 0;
            ArrayList arrayListB = B(i - length);
            byte[] bArr = new byte[i];
            System.arraycopy(this.f, i2, bArr, 0, length);
            int size = arrayListB.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayListB.get(i4);
                i4++;
                byte[] bArr2 = (byte[]) obj;
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }
    }

    public abstract void a(int i);

    public abstract int b();

    public abstract boolean c();

    public abstract void d(int i);

    public abstract int e(int i);

    public abstract boolean f();

    public abstract e01.f g();

    public abstract double h();

    public abstract int i();

    public abstract int j();

    public abstract long k();

    public abstract float l();

    public abstract int m();

    public abstract long n();

    public abstract int o();

    public abstract long p();

    public abstract int q();

    public abstract long r();

    public abstract String s();

    public abstract String t();

    public abstract int u();

    public abstract int v();

    public abstract long w();

    public abstract boolean x(int i);

    public final void y() throws fk5 {
        boolean zX;
        do {
            int iU = u();
            if (iU == 0) {
                return;
            }
            int i = this.a;
            if (i >= this.b) {
                throw new fk5("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.a = i + 1;
            zX = x(iU);
            this.a--;
        } while (zX);
    }
}
