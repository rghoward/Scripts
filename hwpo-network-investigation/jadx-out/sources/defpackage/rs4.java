package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class rs4 implements kw9 {
    public byte t;
    public final ni8 u;
    public final Inflater v;
    public final dc5 w;
    public final CRC32 x;

    public rs4(hy0 hy0Var) {
        hy0Var.getClass();
        ni8 ni8Var = new ni8(hy0Var);
        this.u = ni8Var;
        Inflater inflater = new Inflater(true);
        this.v = inflater;
        this.w = new dc5(ni8Var, inflater);
        this.x = new CRC32();
    }

    public static void h(int i, int i2, String str) throws IOException {
        if (i2 == i) {
            return;
        }
        StringBuilder sbB = tn2.b(str, ": actual 0x");
        sbB.append(z2a.A(8, t.d(i2)));
        sbB.append(" != expected 0x");
        sbB.append(z2a.A(8, t.d(i)));
        throw new IOException(sbB.toString());
    }

    @Override // defpackage.kw9
    public final long O(tx0 tx0Var, long j) throws IOException {
        rs4 rs4Var = this;
        tx0Var.getClass();
        if (j < 0) {
            ca0.a(d43.b(j, "byteCount < 0: "));
            return 0L;
        }
        if (j == 0) {
            return 0L;
        }
        byte b = rs4Var.t;
        CRC32 crc32 = rs4Var.x;
        ni8 ni8Var = rs4Var.u;
        if (b == 0) {
            ni8Var.n0(10L);
            tx0 tx0Var2 = ni8Var.u;
            byte bU = tx0Var2.u(3L);
            boolean z = ((bU >> 1) & 1) == 1;
            if (z) {
                rs4Var.k(ni8Var.u, 0L, 10L);
            }
            h(8075, ni8Var.readShort(), "ID1ID2");
            ni8Var.skip(8L);
            if (((bU >> 2) & 1) == 1) {
                ni8Var.n0(2L);
                if (z) {
                    k(ni8Var.u, 0L, 2L);
                }
                long jK = tx0Var2.K() & 65535;
                ni8Var.n0(jK);
                if (z) {
                    k(ni8Var.u, 0L, jK);
                }
                ni8Var.skip(jK);
            }
            if (((bU >> 3) & 1) == 1) {
                long jH = ni8Var.h((byte) 0, 0L, Long.MAX_VALUE);
                if (jH == -1) {
                    throw new EOFException();
                }
                if (z) {
                    k(ni8Var.u, 0L, jH + 1);
                }
                ni8Var.skip(jH + 1);
            }
            if (((bU >> 4) & 1) == 1) {
                long jH2 = ni8Var.h((byte) 0, 0L, Long.MAX_VALUE);
                if (jH2 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    rs4Var = this;
                    rs4Var.k(ni8Var.u, 0L, jH2 + 1);
                } else {
                    rs4Var = this;
                }
                ni8Var.skip(jH2 + 1);
            } else {
                rs4Var = this;
            }
            if (z) {
                h(ni8Var.t(), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            rs4Var.t = (byte) 1;
        }
        if (rs4Var.t == 1) {
            long j2 = tx0Var.u;
            long jO = rs4Var.w.O(tx0Var, j);
            if (jO != -1) {
                rs4Var.k(tx0Var, j2, jO);
                return jO;
            }
            rs4Var.t = (byte) 2;
        }
        if (rs4Var.t == 2) {
            h(ni8Var.m(), (int) crc32.getValue(), "CRC");
            h(ni8Var.m(), (int) rs4Var.v.getBytesWritten(), "ISIZE");
            rs4Var.t = (byte) 3;
            if (!ni8Var.z()) {
                o03.a("gzip finished without exhausting source");
                return 0L;
            }
        }
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.w.close();
    }

    public final void k(tx0 tx0Var, long j, long j2) {
        f99 f99Var = tx0Var.t;
        f99Var.getClass();
        while (true) {
            int i = f99Var.c;
            int i2 = f99Var.b;
            if (j < i - i2) {
                break;
            }
            j -= (long) (i - i2);
            f99Var = f99Var.f;
            f99Var.getClass();
        }
        while (j2 > 0) {
            int i3 = (int) (((long) f99Var.b) + j);
            int iMin = (int) Math.min(f99Var.c - i3, j2);
            this.x.update(f99Var.a, i3, iMin);
            j2 -= (long) iMin;
            f99Var = f99Var.f;
            f99Var.getClass();
            j = 0;
        }
    }

    @Override // defpackage.kw9
    public final voa timeout() {
        return this.u.t.timeout();
    }
}
