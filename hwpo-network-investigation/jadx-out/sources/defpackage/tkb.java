package defpackage;

import com.intercom.twig.BuildConfig;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class tkb implements Closeable {
    public boolean A;
    public boolean B;
    public boolean C;
    public final tx0 D;
    public final tx0 E;
    public ut6 F;
    public final byte[] G;
    public final hy0 t;
    public final a u;
    public final boolean v;
    public final boolean w;
    public boolean x;
    public int y;
    public long z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface a {
        void a(String str);

        void b(g01 g01Var);

        void c(g01 g01Var);

        void d(g01 g01Var);

        void e(int i, String str);
    }

    public tkb(hy0 hy0Var, a aVar, boolean z, boolean z2) {
        hy0Var.getClass();
        this.t = hy0Var;
        this.u = aVar;
        this.v = z;
        this.w = z2;
        this.D = new tx0();
        this.E = new tx0();
        this.G = null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ut6 ut6Var = this.F;
        if (ut6Var != null) {
            vtb.b(ut6Var);
        }
        vtb.b(this.t);
    }

    public final void h() throws IOException {
        m();
        if (this.B) {
            k();
            return;
        }
        int i = this.y;
        if (i != 1 && i != 2) {
            TimeZone timeZone = ytb.a;
            String hexString = Integer.toHexString(i);
            hexString.getClass();
            throw new ProtocolException("Unknown opcode: ".concat(hexString));
        }
        while (!this.x) {
            long j = this.z;
            tx0 tx0Var = this.E;
            if (j > 0) {
                this.t.s0(tx0Var, j);
            }
            if (this.A) {
                if (this.C) {
                    ut6 ut6Var = this.F;
                    if (ut6Var == null) {
                        ut6Var = new ut6(this.w);
                        this.F = ut6Var;
                    }
                    tx0Var.getClass();
                    tx0 tx0Var2 = ut6Var.u;
                    if (tx0Var2.u != 0) {
                        z90.a("Failed requirement.");
                        return;
                    }
                    Inflater inflater = ut6Var.v;
                    if (inflater == null) {
                        inflater = new Inflater(true);
                        ut6Var.v = inflater;
                    }
                    dc5 dc5Var = ut6Var.w;
                    if (dc5Var == null) {
                        dc5Var = new dc5(tx0Var2, inflater);
                        ut6Var.w = dc5Var;
                    }
                    if (ut6Var.t) {
                        inflater.reset();
                    }
                    tx0Var2.F(tx0Var);
                    tx0Var2.d0(65535);
                    long bytesRead = inflater.getBytesRead() + tx0Var2.u;
                    do {
                        dc5Var.h(tx0Var, Long.MAX_VALUE);
                        if (inflater.getBytesRead() >= bytesRead) {
                            break;
                        }
                    } while (!inflater.finished());
                    if (inflater.getBytesRead() < bytesRead) {
                        tx0Var2.h();
                        dc5Var.close();
                        ut6Var.w = null;
                        ut6Var.v = null;
                    }
                }
                a aVar = this.u;
                if (i == 1) {
                    aVar.a(tx0Var.N());
                    return;
                } else {
                    aVar.b(tx0Var.r(tx0Var.u));
                    return;
                }
            }
            while (!this.x) {
                m();
                if (!this.B) {
                    break;
                } else {
                    k();
                }
            }
            if (this.y != 0) {
                int i2 = this.y;
                TimeZone timeZone2 = ytb.a;
                String hexString2 = Integer.toHexString(i2);
                hexString2.getClass();
                throw new ProtocolException("Expected continuation opcode. Got: ".concat(hexString2));
            }
        }
        o03.a(MetricTracker.Action.CLOSED);
    }

    public final void k() throws ProtocolException, EOFException {
        short s;
        String strN;
        String strA;
        long j = this.z;
        tx0 tx0Var = this.D;
        if (j > 0) {
            this.t.s0(tx0Var, j);
        }
        int i = this.y;
        a aVar = this.u;
        switch (i) {
            case 8:
                long j2 = tx0Var.u;
                if (j2 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (j2 != 0) {
                    s = tx0Var.readShort();
                    strN = tx0Var.N();
                    if (s < 1000 || s >= 5000) {
                        strA = pp2.a(s, "Code must be in range [1000,5000): ");
                    } else {
                        strA = ((1004 > s || s >= 1007) && (1015 > s || s >= 3000)) ? null : pk.d(s, "Code ", " is reserved and may not be used.");
                    }
                    if (strA != null) {
                        throw new ProtocolException(strA);
                    }
                } else {
                    s = 1005;
                    strN = BuildConfig.FLAVOR;
                }
                aVar.e(s, strN);
                this.x = true;
                return;
            case 9:
                aVar.c(tx0Var.r(tx0Var.u));
                return;
            case 10:
                aVar.d(tx0Var.r(tx0Var.u));
                return;
            default:
                int i2 = this.y;
                TimeZone timeZone = ytb.a;
                String hexString = Integer.toHexString(i2);
                hexString.getClass();
                throw new ProtocolException("Unknown control opcode: ".concat(hexString));
        }
    }

    public final void m() throws IOException {
        boolean z;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (this.x) {
            o03.a(MetricTracker.Action.CLOSED);
            return;
        }
        hy0 hy0Var = this.t;
        long jH = hy0Var.timeout().h();
        hy0Var.timeout().b();
        try {
            byte b = hy0Var.readByte();
            byte[] bArr = vtb.a;
            hy0Var.timeout().g(jH, timeUnit);
            int i = b & 15;
            this.y = i;
            boolean z2 = (b & 128) != 0;
            this.A = z2;
            boolean z3 = (b & 8) != 0;
            this.B = z3;
            if (z3 && !z2) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z4 = (b & 64) != 0;
            if (i == 1 || i == 2) {
                if (!z4) {
                    z = false;
                } else {
                    if (!this.v) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z = true;
                }
                this.C = z;
            } else if (z4) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((b & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((b & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            byte b2 = hy0Var.readByte();
            boolean z5 = (b2 & 128) != 0;
            if (z5) {
                throw new ProtocolException("Server-sent frames must not be masked.");
            }
            long j = b2 & 127;
            this.z = j;
            if (j == 126) {
                this.z = hy0Var.readShort() & 65535;
            } else if (j == 127) {
                long j2 = hy0Var.readLong();
                this.z = j2;
                if (j2 < 0) {
                    long j3 = this.z;
                    TimeZone timeZone = ytb.a;
                    String hexString = Long.toHexString(j3);
                    hexString.getClass();
                    throw new ProtocolException("Frame length 0x" + hexString + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.B && this.z > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z5) {
                byte[] bArr2 = this.G;
                bArr2.getClass();
                hy0Var.readFully(bArr2);
            }
        } catch (Throwable th) {
            hy0Var.timeout().g(jH, timeUnit);
            throw th;
        }
    }
}
