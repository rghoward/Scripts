package defpackage;

import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rs2 implements ig7 {
    public final hg7 a;
    public final long b;
    public final long c;
    public final u1a d;
    public int e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class a implements t89 {
        public a() {
        }

        @Override // defpackage.t89
        public final boolean b() {
            return true;
        }

        @Override // defpackage.t89
        public final t89.a e(long j) {
            rs2 rs2Var = rs2.this;
            long j2 = (((long) rs2Var.d.i) * j) / 1000000;
            long j3 = rs2Var.b;
            BigInteger bigIntegerValueOf = BigInteger.valueOf(j2);
            long j4 = rs2Var.c;
            v89 v89Var = new v89(j, n6b.j((bigIntegerValueOf.multiply(BigInteger.valueOf(j4 - j3)).divide(BigInteger.valueOf(rs2Var.f)).longValue() + j3) - AudioConstants.TRANSCRIPTION_TIMEOUT_MS, rs2Var.b, j4 - 1));
            return new t89.a(v89Var, v89Var);
        }

        @Override // defpackage.t89
        public final long g() {
            rs2 rs2Var = rs2.this;
            return (rs2Var.f * 1000000) / ((long) rs2Var.d.i);
        }
    }

    public rs2(u1a u1aVar, long j, long j2, long j3, long j4, boolean z) {
        xl7.g(j >= 0 && j2 > j);
        this.d = u1aVar;
        this.b = j;
        this.c = j2;
        if (j3 == j2 - j || z) {
            this.f = j4;
            this.e = 4;
        } else {
            this.e = 0;
        }
        this.a = new hg7();
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00c1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c2  */
    @Override // defpackage.ig7
    public final long a(ks3 ks3Var) throws IOException {
        long j;
        long j2;
        int i = this.e;
        long j3 = this.c;
        hg7 hg7Var = this.a;
        if (i == 0) {
            long position = ks3Var.getPosition();
            this.g = position;
            this.e = 1;
            long j4 = j3 - 65307;
            if (j4 > position) {
                return j4;
            }
        } else if (i != 1) {
            if (i == 2) {
                if (this.i == this.j) {
                    j2 = -1;
                } else {
                    long position2 = ks3Var.getPosition();
                    if (hg7Var.b(ks3Var, this.j)) {
                        hg7Var.a(ks3Var, false);
                        ks3Var.l();
                        long j5 = this.h;
                        long j6 = hg7Var.b;
                        long j7 = j5 - j6;
                        j = 2;
                        int i2 = hg7Var.d + hg7Var.e;
                        if (0 > j7 || j7 >= 72000) {
                            if (j7 < 0) {
                                this.j = position2;
                                this.l = j6;
                            } else {
                                this.i = ks3Var.getPosition() + ((long) i2);
                                this.k = hg7Var.b;
                            }
                            long j8 = this.j;
                            long j9 = this.i;
                            if (j8 - j9 < 100000) {
                                this.j = j9;
                                j2 = j9;
                            } else {
                                long position3 = ks3Var.getPosition() - (((long) i2) * (j7 <= 0 ? 2L : 1L));
                                long j10 = this.j;
                                long j11 = this.i;
                                j2 = n6b.j((((j10 - j11) * j7) / (this.l - this.k)) + position3, j11, j10 - 1);
                            }
                        } else {
                            j2 = -1;
                        }
                    } else {
                        j2 = this.i;
                        if (j2 == position2) {
                            o03.a("No ogg page can be found.");
                            return 0L;
                        }
                    }
                    if (j2 != -1) {
                        return j2;
                    }
                    this.e = 3;
                }
                j = 2;
                if (j2 != -1) {
                    return j2;
                }
                this.e = 3;
            } else {
                if (i != 3) {
                    if (i == 4) {
                        return -1L;
                    }
                    d43.c();
                    return 0L;
                }
                j = 2;
            }
            while (true) {
                hg7Var.b(ks3Var, -1L);
                hg7Var.a(ks3Var, false);
                if (hg7Var.b > this.h) {
                    ks3Var.l();
                    this.e = 4;
                    return -(this.k + j);
                }
                ks3Var.m(hg7Var.d + hg7Var.e);
                this.i = ks3Var.getPosition();
                this.k = hg7Var.b;
            }
        }
        hg7Var.a = 0;
        hg7Var.b = 0L;
        hg7Var.c = 0;
        hg7Var.d = 0;
        hg7Var.e = 0;
        if (!hg7Var.b(ks3Var, -1L)) {
            throw new EOFException();
        }
        hg7Var.a(ks3Var, false);
        ks3Var.m(hg7Var.d + hg7Var.e);
        long j12 = hg7Var.b;
        while ((hg7Var.a & 4) != 4 && hg7Var.b(ks3Var, -1L) && ks3Var.getPosition() < j3 && hg7Var.a(ks3Var, true)) {
            try {
                ks3Var.m(hg7Var.d + hg7Var.e);
                j12 = hg7Var.b;
            } catch (EOFException unused) {
            }
        }
        this.f = j12;
        this.e = 4;
        return this.g;
    }

    @Override // defpackage.ig7
    public final t89 b() {
        if (this.f != 0) {
            return new a();
        }
        return null;
    }

    @Override // defpackage.ig7
    public final void c(long j) {
        this.h = n6b.j(j, 0L, this.f - 1);
        this.e = 2;
        this.i = this.b;
        this.j = this.c;
        this.k = 0L;
        this.l = this.f;
    }
}
