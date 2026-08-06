package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import androidx.media3.exoplayer.k;
import com.intercom.twig.BuildConfig;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import org.msgpack.core.MessagePack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class in6 extends androidx.media3.exoplayer.a {
    public static final byte[] a1 = {0, 0, 1, 103, 66, MessagePack.Code.NIL, 11, MessagePack.Code.STR16, 37, MessagePack.Code.FIXARRAY_PREFIX, 0, 0, 1, 104, MessagePack.Code.UINT32, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, MessagePack.Code.UINT32, 113, 24, MessagePack.Code.FIXSTR_PREFIX, 0, 47, -65, 28, 49, MessagePack.Code.TRUE, 39, 93, 120};
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public int E0;
    public int F0;
    public int G0;
    public boolean H0;
    public boolean I0;
    public boolean J0;
    public long K0;
    public final Context L;
    public boolean L0;
    public final an6.b M;
    public boolean M0;
    public final ra N;
    public boolean N0;
    public final float O;
    public boolean O0;
    public final nn2 P;
    public lo3 P0;
    public final nn2 Q;
    public ln2 Q0;
    public final nn2 R;
    public d R0;
    public final rn0 S;
    public long S0;
    public final MediaCodec.BufferInfo T;
    public boolean T0;
    public final ArrayDeque<d> U;
    public boolean U0;
    public final fg7 V;
    public boolean V0;
    public final AtomicInteger W;
    public long W0;
    public id4 X;
    public androidx.media3.exoplayer.b X0;
    public id4 Y;
    public androidx.media3.exoplayer.b Y0;
    public i83 Z;
    public q95<String> Z0;
    public i83 a0;
    public k.a b0;
    public MediaCrypto c0;
    public final long d0;
    public float e0;
    public float f0;
    public an6 g0;
    public id4 h0;
    public MediaFormat i0;
    public boolean j0;
    public float k0;
    public ArrayDeque<en6> l0;
    public b m0;
    public en6 n0;
    public int o0;
    public boolean p0;
    public boolean q0;
    public boolean r0;
    public boolean s0;
    public long t0;
    public boolean u0;
    public long v0;
    public int w0;
    public int x0;
    public ByteBuffer y0;
    public boolean z0;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static void a(an6.a aVar, x38 x38Var) {
            LogSessionId logSessionIdA = x38Var.a();
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            aVar.b.setString("log-session-id", logSessionIdA.getStringId());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class c {
        public c() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d {
        public static final d g = new d(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L);
        public final long a;
        public final long b;
        public final long c;
        public boolean e;
        public final soa<id4> d = new soa<>();
        public long f = -9223372036854775807L;

        public d(long j, long j2, long j3) {
            this.a = j;
            this.b = j2;
            this.c = j3;
        }
    }

    public in6(Context context, int i, an6.b bVar, float f) {
        super(i);
        this.L = context.getApplicationContext();
        this.M = bVar;
        this.N = jn6.a;
        this.O = f;
        this.W = new AtomicInteger();
        this.P = new nn2(0);
        this.Q = new nn2(0);
        this.R = new nn2(2);
        rn0 rn0Var = new rn0(2);
        rn0Var.D = 32;
        this.S = rn0Var;
        this.T = new MediaCodec.BufferInfo();
        this.e0 = 1.0f;
        this.f0 = 1.0f;
        this.d0 = -9223372036854775807L;
        this.U = new ArrayDeque<>();
        this.R0 = d.g;
        rn0Var.l(0);
        rn0Var.w.order(ByteOrder.nativeOrder());
        fg7 fg7Var = new fg7();
        fg7Var.a = s80.a;
        fg7Var.c = 0;
        fg7Var.b = 2;
        this.V = fg7Var;
        this.k0 = -1.0f;
        this.o0 = 0;
        this.E0 = 0;
        this.w0 = -1;
        this.x0 = -1;
        this.v0 = -9223372036854775807L;
        this.K0 = -9223372036854775807L;
        this.S0 = -9223372036854775807L;
        this.t0 = -9223372036854775807L;
        this.F0 = 0;
        this.G0 = 0;
        this.Q0 = new ln2();
        this.V0 = false;
        this.W0 = 0L;
        int i2 = q95.v;
        this.Z0 = wl8.C;
        androidx.media3.exoplayer.b bVar2 = androidx.media3.exoplayer.b.b;
        this.X0 = bVar2;
        this.Y0 = bVar2;
    }

    public abstract void A0();

    public final void B0() {
        this.K0 = -9223372036854775807L;
        e0().f = -9223372036854775807L;
        this.S0 = -9223372036854775807L;
        this.C0 = false;
        this.S.j();
        this.R.j();
        this.B0 = false;
        fg7 fg7Var = this.V;
        fg7Var.getClass();
        fg7Var.a = s80.a;
        fg7Var.c = 0;
        fg7Var.b = 2;
    }

    public void C0() {
        this.w0 = -1;
        this.Q.w = null;
        this.x0 = -1;
        this.y0 = null;
        this.K0 = -9223372036854775807L;
        e0().f = -9223372036854775807L;
        this.S0 = -9223372036854775807L;
        this.v0 = -9223372036854775807L;
        this.I0 = false;
        this.t0 = -9223372036854775807L;
        this.H0 = false;
        this.q0 = false;
        this.r0 = false;
        this.z0 = false;
        this.F0 = 0;
        this.G0 = 0;
        this.E0 = this.D0 ? 1 : 0;
        this.V0 = false;
        this.W0 = 0L;
    }

    public final void D0() {
        C0();
        this.P0 = null;
        this.l0 = null;
        this.n0 = null;
        this.h0 = null;
        this.i0 = null;
        this.j0 = false;
        this.J0 = false;
        this.k0 = -1.0f;
        this.o0 = 0;
        this.p0 = false;
        this.s0 = false;
        this.u0 = false;
        this.D0 = false;
        this.E0 = 0;
    }

    public final void E0(i83 i83Var) {
        i83 i83Var2 = this.Z;
        if (i83Var2 != i83Var) {
            if (i83Var != null) {
                i83Var.d(null);
            }
            if (i83Var2 != null) {
                i83Var2.c(null);
            }
        }
        this.Z = i83Var;
    }

    public final void F0(d dVar) {
        this.R0 = dVar;
        long j = dVar.c;
        if (j != -9223372036854775807L) {
            this.T0 = true;
            s0(j);
        }
    }

    public boolean G0(nn2 nn2Var) {
        return false;
    }

    @Override // androidx.media3.exoplayer.a
    public void H() {
        this.X = null;
        F0(d.g);
        this.U.clear();
        if (this.A0) {
            this.A0 = false;
            B0();
        } else {
            if (this.g0 == null) {
                return;
            }
            if (J0()) {
                z0();
            } else if (H0()) {
                Y();
            } else {
                this.V0 = true;
            }
        }
    }

    public boolean H0() {
        return true;
    }

    public boolean I0(en6 en6Var) {
        return true;
    }

    @Override // androidx.media3.exoplayer.a
    public void J(long j, boolean z, boolean z2) {
        ArrayDeque<d> arrayDeque = this.U;
        if (!arrayDeque.isEmpty()) {
            this.R0 = arrayDeque.getLast();
        }
        arrayDeque.clear();
        if (z2) {
            this.L0 = false;
            this.M0 = false;
            this.O0 = false;
            if (this.A0) {
                B0();
            } else if (this.g0 != null) {
                if (J0()) {
                    z0();
                    j0();
                } else if (H0()) {
                    Y();
                } else {
                    this.V0 = true;
                }
            }
            if (this.R0.d.h() > 0) {
                this.N0 = true;
            }
            this.R0.d.b();
            this.R0.e = false;
        }
    }

    public boolean J0() {
        int i = this.G0;
        if (i == 3 || (this.p0 && !this.J0)) {
            return true;
        }
        if (i != 2) {
            return false;
        }
        try {
            N0();
            return false;
        } catch (lo3 e) {
            md6.h("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
            return true;
        }
    }

    public boolean K0(id4 id4Var) {
        return false;
    }

    public abstract int L0(ra raVar, id4 id4Var);

    public final boolean M0(id4 id4Var) {
        if (this.g0 != null && this.G0 != 3 && this.A != 0) {
            float f = this.f0;
            id4Var.getClass();
            id4[] id4VarArr = this.C;
            id4VarArr.getClass();
            float fB0 = b0(f, id4Var, id4VarArr);
            float f2 = this.k0;
            if (f2 != fB0) {
                if (fB0 == -1.0f) {
                    if (this.H0) {
                        this.F0 = 1;
                        this.G0 = 3;
                        return false;
                    }
                    z0();
                    j0();
                    return false;
                }
                if (f2 != -1.0f || fB0 > this.O) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fB0);
                    an6 an6Var = this.g0;
                    an6Var.getClass();
                    an6Var.b(bundle);
                    this.k0 = fB0;
                }
            }
        }
        return true;
    }

    public final void N0() throws lo3 {
        i83 i83Var = this.a0;
        i83Var.getClass();
        if (i83Var.g() != null) {
            try {
                MediaCrypto mediaCrypto = this.c0;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(null);
            } catch (MediaCryptoException e) {
                throw G(e, this.X, false, 6006);
            }
        }
        E0(this.a0);
        this.F0 = 0;
        this.G0 = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    @Override // androidx.media3.exoplayer.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void O(defpackage.id4[] r12, long r13, long r15, bq6.b r17) {
        /*
            r11 = this;
            in6$d r12 = r11.R0
            long r0 = r12.c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L24
            in6$d r4 = new in6$d
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.F0(r4)
            boolean r12 = r11.U0
            if (r12 == 0) goto L56
            r11.u0()
            return
        L24:
            java.util.ArrayDeque<in6$d> r12 = r11.U
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L57
            long r0 = r11.K0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L3c
            long r4 = r11.S0
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L57
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L57
        L3c:
            in6$d r4 = new in6$d
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.F0(r4)
            in6$d r12 = r11.R0
            long r12 = r12.c
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto L56
            r11.u0()
        L56:
            return
        L57:
            in6$d r0 = new in6$d
            long r1 = r11.K0
            r3 = r13
            r5 = r15
            r0.<init>(r1, r3, r5)
            r12.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.in6.O(id4[], long, long, bq6$b):void");
    }

    public final void O0(long j) {
        id4 id4VarF = this.R0.d.f(j);
        if (id4VarF == null && this.T0 && this.i0 != null) {
            id4VarF = this.R0.d.e();
        }
        if (id4VarF != null) {
            this.Y = id4VarF;
        } else if (!this.j0 || this.Y == null) {
            return;
        }
        id4 id4Var = this.Y;
        id4Var.getClass();
        r0(id4Var, this.i0);
        this.j0 = false;
        this.T0 = false;
    }

    public final void R(MediaFormat mediaFormat) {
        if (Build.VERSION.SDK_INT >= 29) {
            for (Map.Entry<String, Object> entry : this.X0.a.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    mediaFormat.setString(key, null);
                } else if (value instanceof Integer) {
                    mediaFormat.setInteger(key, ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    mediaFormat.setLong(key, ((Long) value).longValue());
                } else if (value instanceof Float) {
                    mediaFormat.setFloat(key, ((Float) value).floatValue());
                } else if (value instanceof String) {
                    mediaFormat.setString(key, (String) value);
                } else if (value instanceof ByteBuffer) {
                    mediaFormat.setByteBuffer(key, (ByteBuffer) value);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0309  */
    /* JADX WARN: Code duplicated, block: B:117:0x0311 A[LOOP:0: B:25:0x0090->B:117:0x0311, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:136:0x030f A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v0, types: [androidx.media3.exoplayer.a, in6] */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r28v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r4v22, types: [int] */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    public final boolean S(long j, long j2) {
        rn0 rn0Var;
        ?? r4;
        ?? r28;
        xl7.r(!this.M0);
        rn0 rn0Var2 = this.S;
        if (rn0Var2.o()) {
            ByteBuffer byteBuffer = rn0Var2.w;
            int i = this.x0;
            int i2 = rn0Var2.C;
            long j3 = rn0Var2.y;
            boolean zI0 = i0(this.E, rn0Var2.B);
            boolean zI = rn0Var2.i(4);
            id4 id4Var = this.Y;
            id4Var.getClass();
            rn0Var = rn0Var2;
            if (x0(j, j2, null, byteBuffer, i, 0, i2, j3, zI0, zI, id4Var)) {
                t0(rn0Var.B);
                rn0Var.j();
            }
        }
        rn0Var = rn0Var2;
        if (this.L0) {
            this.M0 = true;
            return false;
        }
        ?? r2 = 0;
        boolean z = this.B0;
        nn2 nn2Var = this.R;
        if (z) {
            xl7.r(rn0Var.n(nn2Var));
            this.B0 = false;
        }
        if (this.C0) {
            if (rn0Var.o()) {
                return true;
            }
            this.A0 = false;
            B0();
            this.C0 = false;
            j0();
            if (!this.A0) {
                return false;
            }
        }
        xl7.r(!this.L0);
        jd4 jd4Var = this.v;
        jd4Var.a();
        nn2Var.j();
        while (true) {
            nn2Var.j();
            int iQ = Q(jd4Var, nn2Var, r2);
            if (iQ == -5) {
                q0(jd4Var);
            } else if (iQ != -4) {
                if (iQ != -3) {
                    d43.c();
                    return r2;
                }
                if (k()) {
                    e0().f = this.K0;
                }
            } else if (nn2Var.i(4)) {
                this.L0 = true;
                e0().f = this.K0;
            } else {
                this.K0 = Math.max(this.K0, nn2Var.y);
                if (k() || this.Q.i(536870912)) {
                    e0().f = this.K0;
                }
                byte[] bArr = null;
                if (this.N0) {
                    id4 id4Var2 = this.X;
                    id4Var2.getClass();
                    this.Y = id4Var2;
                    if (Objects.equals(id4Var2.o, "audio/opus") && !this.Y.r.isEmpty()) {
                        byte[] bArr2 = this.Y.r.get(r2);
                        int i3 = (bArr2[10] & MessagePack.Code.EXT_TIMESTAMP) | ((bArr2[11] & MessagePack.Code.EXT_TIMESTAMP) << 8);
                        id4.a aVarA = this.Y.a();
                        aVarA.I = i3;
                        this.Y = new id4(aVarA);
                    }
                    r0(this.Y, null);
                    this.N0 = r2;
                }
                nn2Var.m();
                id4 id4Var3 = this.Y;
                if (id4Var3 != null && Objects.equals(id4Var3.o, "audio/opus")) {
                    if (nn2Var.i(268435456)) {
                        nn2Var.u = this.Y;
                        g0(nn2Var);
                    }
                    if (this.E - nn2Var.y <= 80000) {
                        List<byte[]> list = this.Y.r;
                        fg7 fg7Var = this.V;
                        fg7Var.getClass();
                        nn2Var.w.getClass();
                        if (nn2Var.w.limit() - nn2Var.w.position() != 0) {
                            if (fg7Var.b == 2 && (list.size() == 1 || list.size() == 3)) {
                                bArr = list.get(r2);
                            }
                            ByteBuffer byteBuffer2 = nn2Var.w;
                            int iPosition = byteBuffer2.position();
                            int iLimit = byteBuffer2.limit();
                            int i4 = iLimit - iPosition;
                            int i5 = (i4 + 255) / 255;
                            int i6 = i5 + 27 + i4;
                            if (fg7Var.b == 2) {
                                int length = bArr != null ? bArr.length + 28 : 47;
                                i6 = (length == true ? 1 : 0) + 44 + i6;
                                r4 = length;
                            } else {
                                r4 = r2;
                            }
                            if (fg7Var.a.capacity() < i6) {
                                fg7Var.a = ByteBuffer.allocate(i6).order(ByteOrder.LITTLE_ENDIAN);
                            } else {
                                fg7Var.a.clear();
                            }
                            ByteBuffer byteBuffer3 = fg7Var.a;
                            if (fg7Var.b == 2) {
                                if (bArr != null) {
                                    fg7.a(byteBuffer3, 0L, 0, 1, true);
                                    byteBuffer3.put(rq5.c(bArr.length));
                                    byteBuffer3.put(bArr);
                                    byteBuffer3.putInt(22, n6b.o(byteBuffer3.arrayOffset(), byteBuffer3.array(), bArr.length + 28, 0));
                                    byteBuffer3.position(bArr.length + 28);
                                } else {
                                    byteBuffer3.put(fg7.d);
                                }
                                byteBuffer3.put(fg7.e);
                                r28 = r4;
                            } else {
                                r28 = r4 == true ? 1 : 0;
                                iLimit = iLimit;
                            }
                            int iH = fg7Var.c + ((int) ((bl7.h(byteBuffer2.get(0), byteBuffer2.limit() > 1 ? byteBuffer2.get(1) : (byte) 0) * 48000) / 1000000));
                            fg7Var.c = iH;
                            fg7.a(byteBuffer3, iH, fg7Var.b, i5, false);
                            for (int i7 = 0; i7 < i5; i7++) {
                                if (i4 >= 255) {
                                    byteBuffer3.put((byte) -1);
                                    i4 -= 255;
                                } else {
                                    byteBuffer3.put((byte) i4);
                                    i4 = 0;
                                }
                            }
                            int i8 = iLimit;
                            while (iPosition < i8) {
                                byteBuffer3.put(byteBuffer2.get(iPosition));
                                iPosition++;
                            }
                            byteBuffer2.position(byteBuffer2.limit());
                            byteBuffer3.flip();
                            if (fg7Var.b == 2) {
                                byteBuffer3.putInt(r28 + 66, n6b.o(byteBuffer3.arrayOffset() + r28 + 44, byteBuffer3.array(), byteBuffer3.limit() - byteBuffer3.position(), 0));
                            } else {
                                byteBuffer3.putInt(22, n6b.o(byteBuffer3.arrayOffset(), byteBuffer3.array(), byteBuffer3.limit() - byteBuffer3.position(), 0));
                            }
                            fg7Var.b++;
                            fg7Var.a = byteBuffer3;
                            nn2Var.j();
                            nn2Var.l(fg7Var.a.remaining());
                            nn2Var.w.put(fg7Var.a);
                            nn2Var.m();
                        }
                    }
                }
                if (rn0Var.o()) {
                    long j4 = this.E;
                    if (i0(j4, rn0Var.B) == i0(j4, nn2Var.y)) {
                        if (!rn0Var.n(nn2Var)) {
                            r2 = 0;
                        }
                    }
                } else if (!rn0Var.n(nn2Var)) {
                    r2 = 0;
                }
                this.B0 = true;
            }
            if (rn0Var.o()) {
                rn0Var.m();
            }
            return rn0Var.o() || this.L0 || this.C0;
        }
    }

    public abstract pn2 T(en6 en6Var, id4 id4Var, id4 id4Var2, boolean z);

    public dn6 U(IllegalStateException illegalStateException, en6 en6Var) {
        return new dn6(illegalStateException, en6Var);
    }

    public final boolean V() throws lo3 {
        if (!this.H0) {
            N0();
            return true;
        }
        this.F0 = 1;
        this.G0 = 2;
        return true;
    }

    public final boolean W(long j, long j2) throws lo3 {
        an6 an6Var = this.g0;
        an6Var.getClass();
        int i = this.x0;
        MediaCodec.BufferInfo bufferInfo = this.T;
        if (i < 0) {
            int iL = an6Var.l(bufferInfo);
            if (iL < 0) {
                if (iL != -2) {
                    if (this.s0 && (this.L0 || this.F0 == 2)) {
                        w0();
                    }
                    long j3 = this.t0;
                    if (j3 != -9223372036854775807L) {
                        long j4 = j3 + 100;
                        vf1 vf1Var = this.z;
                        vf1Var.getClass();
                        if (j4 < vf1Var.currentTimeMillis()) {
                            w0();
                            return false;
                        }
                    }
                    return false;
                }
                this.J0 = true;
                an6 an6Var2 = this.g0;
                an6Var2.getClass();
                MediaFormat mediaFormatH = an6Var2.h();
                if (this.o0 != 0 && mediaFormatH.getInteger("width") == 32 && mediaFormatH.getInteger("height") == 32) {
                    this.r0 = true;
                    return true;
                }
                if (Build.VERSION.SDK_INT >= 29 && !this.Z0.isEmpty()) {
                    androidx.media3.exoplayer.b bVar = new androidx.media3.exoplayer.b(androidx.media3.exoplayer.b.a(mediaFormatH, this.Z0).a);
                    if (!bVar.equals(this.Y0)) {
                        this.Y0 = bVar;
                        o0(bVar);
                    }
                }
                this.i0 = mediaFormatH;
                this.j0 = true;
                return true;
            }
            bufferInfo.presentationTimeUs -= this.W0;
            if (this.r0) {
                this.r0 = false;
                an6Var.e(iL);
                return true;
            }
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                w0();
                return false;
            }
            this.x0 = iL;
            ByteBuffer byteBufferP = an6Var.p(iL);
            this.y0 = byteBufferP;
            if (byteBufferP != null) {
                byteBufferP.position(bufferInfo.offset);
                this.y0.limit(bufferInfo.offset + bufferInfo.size);
            }
            O0(bufferInfo.presentationTimeUs);
        }
        boolean z = this.V0 || bufferInfo.presentationTimeUs < this.E;
        long j5 = this.R0.f;
        boolean z2 = j5 != -9223372036854775807L && j5 <= bufferInfo.presentationTimeUs;
        this.z0 = z2;
        ByteBuffer byteBuffer = this.y0;
        int i2 = this.x0;
        int i3 = bufferInfo.flags;
        long j6 = bufferInfo.presentationTimeUs;
        id4 id4Var = this.Y;
        id4Var.getClass();
        if (!x0(j, j2, an6Var, byteBuffer, i2, i3, 1, j6, z, z2, id4Var)) {
            return false;
        }
        t0(bufferInfo.presentationTimeUs);
        boolean z3 = (bufferInfo.flags & 4) != 0;
        if (!z3 && this.I0 && this.z0) {
            vf1 vf1Var2 = this.z;
            vf1Var2.getClass();
            this.t0 = vf1Var2.currentTimeMillis();
        }
        this.x0 = -1;
        this.y0 = null;
        if (!z3) {
            return true;
        }
        w0();
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:103:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:112:0x0091 A[EDGE_INSN: B:112:0x0091->B:33:0x0091 BREAK  A[LOOP:0: B:30:0x006f->B:32:0x007c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    /* JADX WARN: Code duplicated, block: B:20:0x0037  */
    /* JADX WARN: Code duplicated, block: B:23:0x0049  */
    /* JADX WARN: Code duplicated, block: B:25:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x006e  */
    /* JADX WARN: Code duplicated, block: B:32:0x007c A[LOOP:0: B:30:0x006f->B:32:0x007c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:63:0x0109  */
    /* JADX WARN: Code duplicated, block: B:71:0x011d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0126  */
    /* JADX WARN: Code duplicated, block: B:76:0x012e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0132  */
    /* JADX WARN: Code duplicated, block: B:79:0x0136  */
    /* JADX WARN: Code duplicated, block: B:81:0x013a  */
    /* JADX WARN: Code duplicated, block: B:85:0x014d  */
    /* JADX WARN: Code duplicated, block: B:88:0x016d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0175  */
    /* JADX WARN: Code duplicated, block: B:93:0x0188  */
    /* JADX WARN: Code duplicated, block: B:96:0x018f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0195  */
    public final boolean X() throws lo3 {
        int iPosition;
        jd4 jd4Var;
        int i;
        long j;
        boolean zI;
        int iA0;
        long j2;
        int i2;
        long j3;
        cc2 cc2Var;
        int i3;
        id4 id4Var;
        an6 an6Var = this.g0;
        if (an6Var != null && this.F0 != 2 && !this.L0) {
            int i4 = this.w0;
            nn2 nn2Var = this.Q;
            if (i4 < 0) {
                int iK = an6Var.k();
                this.w0 = iK;
                if (iK >= 0) {
                    nn2Var.w = an6Var.n(iK);
                    nn2Var.j();
                    if (this.F0 == 1) {
                        if (!this.s0) {
                            this.I0 = true;
                            an6Var.d(this.w0, 0, 4, 0L);
                            this.w0 = -1;
                            nn2Var.w = null;
                        }
                        this.F0 = 2;
                        return false;
                    }
                    if (this.q0) {
                        this.q0 = false;
                        ByteBuffer byteBuffer = nn2Var.w;
                        byteBuffer.getClass();
                        byteBuffer.put(a1);
                        an6Var.d(this.w0, 38, 0, 0L);
                        this.w0 = -1;
                        nn2Var.w = null;
                        this.H0 = true;
                        return true;
                    }
                    if (this.E0 == 1) {
                        i3 = 0;
                        while (true) {
                            id4Var = this.h0;
                            id4Var.getClass();
                            if (i3 < id4Var.r.size()) {
                                break;
                            }
                            byte[] bArr = this.h0.r.get(i3);
                            ByteBuffer byteBuffer2 = nn2Var.w;
                            byteBuffer2.getClass();
                            byteBuffer2.put(bArr);
                            i3++;
                        }
                        this.E0 = 2;
                    }
                    ByteBuffer byteBuffer3 = nn2Var.w;
                    byteBuffer3.getClass();
                    iPosition = byteBuffer3.position();
                    jd4Var = this.v;
                    jd4Var.a();
                    try {
                        an6Var.g(new hn6(this, jd4Var));
                        i = this.W.get();
                        if (i == -3) {
                            if (k()) {
                                e0().f = this.K0;
                                return false;
                            }
                        } else {
                            if (i == -5) {
                                if (this.E0 == 2) {
                                    nn2Var.j();
                                    this.E0 = 1;
                                }
                                q0(jd4Var);
                                return true;
                            }
                            if (nn2Var.i(4)) {
                                if (!this.H0 || nn2Var.i(1)) {
                                    j = nn2Var.y;
                                    if (!G0(nn2Var)) {
                                        zI = nn2Var.i(1073741824);
                                        if (zI) {
                                            cc2Var = nn2Var.v;
                                            if (iPosition == 0) {
                                                cc2Var.getClass();
                                            } else {
                                                if (cc2Var.d == null) {
                                                    int[] iArr = new int[1];
                                                    cc2Var.d = iArr;
                                                    cc2Var.i.numBytesOfClearData = iArr;
                                                }
                                                int[] iArr2 = cc2Var.d;
                                                iArr2[0] = iArr2[0] + iPosition;
                                            }
                                        }
                                        if (this.N0) {
                                            d dVarE0 = e0();
                                            soa<id4> soaVar = dVarE0.d;
                                            id4 id4Var2 = this.X;
                                            id4Var2.getClass();
                                            soaVar.a(j, id4Var2);
                                            dVarE0.e = true;
                                            this.N0 = false;
                                        }
                                        this.K0 = Math.max(this.K0, j);
                                        if (k() || nn2Var.i(536870912)) {
                                            e0().f = this.K0;
                                        }
                                        nn2Var.m();
                                        if (nn2Var.i(268435456)) {
                                            g0(nn2Var);
                                        }
                                        if (this.V0) {
                                            j3 = this.K0;
                                            if (j <= j3) {
                                                this.W0 = (j3 - j) + 1 + this.W0;
                                            }
                                            this.K0 = j;
                                            this.V0 = false;
                                        }
                                        v0(nn2Var);
                                        iA0 = a0(nn2Var);
                                        j2 = j + this.W0;
                                        i2 = this.w0;
                                        if (zI) {
                                            an6Var.c(i2, nn2Var.v, j2, iA0);
                                        } else {
                                            ByteBuffer byteBuffer4 = nn2Var.w;
                                            byteBuffer4.getClass();
                                            an6Var.d(i2, byteBuffer4.limit(), iA0, j2);
                                        }
                                        this.w0 = -1;
                                        nn2Var.w = null;
                                        this.H0 = true;
                                        this.E0 = 0;
                                        this.Q0.c++;
                                        return true;
                                    }
                                } else {
                                    nn2Var.j();
                                    if (this.E0 == 2) {
                                        this.E0 = 1;
                                        return true;
                                    }
                                }
                                return true;
                            }
                            e0().f = this.K0;
                            if (this.E0 == 2) {
                                nn2Var.j();
                                this.E0 = 1;
                            }
                            this.L0 = true;
                            if (!this.H0) {
                                w0();
                                return false;
                            }
                            if (!this.s0) {
                                this.I0 = true;
                                an6Var.d(this.w0, 0, 4, 0L);
                                this.w0 = -1;
                                nn2Var.w = null;
                                return false;
                            }
                        }
                    } catch (nn2.a e) {
                        m0(e);
                        y0(0);
                        Y();
                        return true;
                    }
                }
            } else {
                if (this.F0 == 1) {
                    if (!this.s0) {
                        this.I0 = true;
                        an6Var.d(this.w0, 0, 4, 0L);
                        this.w0 = -1;
                        nn2Var.w = null;
                    }
                    this.F0 = 2;
                    return false;
                }
                if (this.q0) {
                    this.q0 = false;
                    ByteBuffer byteBuffer5 = nn2Var.w;
                    byteBuffer5.getClass();
                    byteBuffer5.put(a1);
                    an6Var.d(this.w0, 38, 0, 0L);
                    this.w0 = -1;
                    nn2Var.w = null;
                    this.H0 = true;
                    return true;
                }
                if (this.E0 == 1) {
                    i3 = 0;
                    while (true) {
                        id4Var = this.h0;
                        id4Var.getClass();
                        if (i3 < id4Var.r.size()) {
                            break;
                            break;
                        }
                        byte[] bArr2 = this.h0.r.get(i3);
                        ByteBuffer byteBuffer6 = nn2Var.w;
                        byteBuffer6.getClass();
                        byteBuffer6.put(bArr2);
                        i3++;
                    }
                    this.E0 = 2;
                }
                ByteBuffer byteBuffer7 = nn2Var.w;
                byteBuffer7.getClass();
                iPosition = byteBuffer7.position();
                jd4Var = this.v;
                jd4Var.a();
                an6Var.g(new hn6(this, jd4Var));
                i = this.W.get();
                if (i == -3) {
                    if (k()) {
                        e0().f = this.K0;
                        return false;
                    }
                } else {
                    if (i == -5) {
                        if (this.E0 == 2) {
                            nn2Var.j();
                            this.E0 = 1;
                        }
                        q0(jd4Var);
                        return true;
                    }
                    if (nn2Var.i(4)) {
                        if (this.H0) {
                            j = nn2Var.y;
                            if (!G0(nn2Var)) {
                                zI = nn2Var.i(1073741824);
                                if (zI) {
                                    cc2Var = nn2Var.v;
                                    if (iPosition == 0) {
                                        cc2Var.getClass();
                                    } else {
                                        if (cc2Var.d == null) {
                                            int[] iArr3 = new int[1];
                                            cc2Var.d = iArr3;
                                            cc2Var.i.numBytesOfClearData = iArr3;
                                        }
                                        int[] iArr4 = cc2Var.d;
                                        iArr4[0] = iArr4[0] + iPosition;
                                    }
                                }
                                if (this.N0) {
                                    d dVarE1 = e0();
                                    soa<id4> soaVar2 = dVarE1.d;
                                    id4 id4Var3 = this.X;
                                    id4Var3.getClass();
                                    soaVar2.a(j, id4Var3);
                                    dVarE1.e = true;
                                    this.N0 = false;
                                }
                                this.K0 = Math.max(this.K0, j);
                                if (k()) {
                                    e0().f = this.K0;
                                } else {
                                    e0().f = this.K0;
                                }
                                nn2Var.m();
                                if (nn2Var.i(268435456)) {
                                    g0(nn2Var);
                                }
                                if (this.V0) {
                                    j3 = this.K0;
                                    if (j <= j3) {
                                        this.W0 = (j3 - j) + 1 + this.W0;
                                    }
                                    this.K0 = j;
                                    this.V0 = false;
                                }
                                v0(nn2Var);
                                iA0 = a0(nn2Var);
                                j2 = j + this.W0;
                                i2 = this.w0;
                                if (zI) {
                                    an6Var.c(i2, nn2Var.v, j2, iA0);
                                } else {
                                    ByteBuffer byteBuffer8 = nn2Var.w;
                                    byteBuffer8.getClass();
                                    an6Var.d(i2, byteBuffer8.limit(), iA0, j2);
                                }
                                this.w0 = -1;
                                nn2Var.w = null;
                                this.H0 = true;
                                this.E0 = 0;
                                this.Q0.c++;
                                return true;
                            }
                        } else {
                            j = nn2Var.y;
                            if (!G0(nn2Var)) {
                                zI = nn2Var.i(1073741824);
                                if (zI) {
                                    cc2Var = nn2Var.v;
                                    if (iPosition == 0) {
                                        cc2Var.getClass();
                                    } else {
                                        if (cc2Var.d == null) {
                                            int[] iArr5 = new int[1];
                                            cc2Var.d = iArr5;
                                            cc2Var.i.numBytesOfClearData = iArr5;
                                        }
                                        int[] iArr6 = cc2Var.d;
                                        iArr6[0] = iArr6[0] + iPosition;
                                    }
                                }
                                if (this.N0) {
                                    d dVarE2 = e0();
                                    soa<id4> soaVar3 = dVarE2.d;
                                    id4 id4Var4 = this.X;
                                    id4Var4.getClass();
                                    soaVar3.a(j, id4Var4);
                                    dVarE2.e = true;
                                    this.N0 = false;
                                }
                                this.K0 = Math.max(this.K0, j);
                                if (k()) {
                                    e0().f = this.K0;
                                } else {
                                    e0().f = this.K0;
                                }
                                nn2Var.m();
                                if (nn2Var.i(268435456)) {
                                    g0(nn2Var);
                                }
                                if (this.V0) {
                                    j3 = this.K0;
                                    if (j <= j3) {
                                        this.W0 = (j3 - j) + 1 + this.W0;
                                    }
                                    this.K0 = j;
                                    this.V0 = false;
                                }
                                v0(nn2Var);
                                iA0 = a0(nn2Var);
                                j2 = j + this.W0;
                                i2 = this.w0;
                                if (zI) {
                                    an6Var.c(i2, nn2Var.v, j2, iA0);
                                } else {
                                    ByteBuffer byteBuffer9 = nn2Var.w;
                                    byteBuffer9.getClass();
                                    an6Var.d(i2, byteBuffer9.limit(), iA0, j2);
                                }
                                this.w0 = -1;
                                nn2Var.w = null;
                                this.H0 = true;
                                this.E0 = 0;
                                this.Q0.c++;
                                return true;
                            }
                        }
                        return true;
                    }
                    e0().f = this.K0;
                    if (this.E0 == 2) {
                        nn2Var.j();
                        this.E0 = 1;
                    }
                    this.L0 = true;
                    if (!this.H0) {
                        w0();
                        return false;
                    }
                    if (!this.s0) {
                        this.I0 = true;
                        an6Var.d(this.w0, 0, 4, 0L);
                        this.w0 = -1;
                        nn2Var.w = null;
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public final void Y() {
        try {
            an6 an6Var = this.g0;
            an6Var.getClass();
            an6Var.flush();
        } finally {
            C0();
        }
    }

    public final List<en6> Z(boolean z) {
        id4 id4Var = this.X;
        id4Var.getClass();
        ra raVar = this.N;
        ArrayList arrayListC0 = c0(raVar, id4Var, z);
        if (!arrayListC0.isEmpty() || !z) {
            return arrayListC0;
        }
        ArrayList arrayListC1 = c0(raVar, id4Var, false);
        if (!arrayListC1.isEmpty()) {
            md6.g("MediaCodecRenderer", "Drm session requires secure decoder for " + id4Var.o + ", but no secure decoder available. Trying to proceed with " + arrayListC1 + ".");
        }
        return arrayListC1;
    }

    public int a0(nn2 nn2Var) {
        return 0;
    }

    public abstract float b0(float f, id4 id4Var, id4[] id4VarArr);

    public abstract ArrayList c0(ra raVar, id4 id4Var, boolean z);

    public long d0(long j, long j2, boolean z) {
        return super.l(j, j2);
    }

    public final d e0() {
        ArrayDeque<d> arrayDeque = this.U;
        return !arrayDeque.isEmpty() ? arrayDeque.getLast() : this.R0;
    }

    @Override // androidx.media3.exoplayer.l
    public final int f(id4 id4Var) throws lo3 {
        try {
            return L0(this.N, id4Var);
        } catch (mn6.b e) {
            throw G(e, id4Var, false, 4002);
        }
    }

    public abstract an6.a f0(en6 en6Var, id4 id4Var, MediaCrypto mediaCrypto, float f);

    public abstract void g0(nn2 nn2Var);

    @Override // androidx.media3.exoplayer.k
    public void h(long j, long j2) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (this.O0) {
            this.O0 = false;
            w0();
        }
        lo3 lo3Var = this.P0;
        if (lo3Var != null) {
            this.P0 = null;
            throw lo3Var;
        }
        try {
            if (this.M0) {
                A0();
                return;
            }
            if (this.X != null || y0(2)) {
                j0();
                if (this.A0) {
                    Trace.beginSection("bypassRender");
                    while (S(j, j2)) {
                    }
                    Trace.endSection();
                } else if (this.g0 != null) {
                    vf1 vf1Var = this.z;
                    vf1Var.getClass();
                    long jC = vf1Var.c();
                    Trace.beginSection("drainAndFeed");
                    while (W(j, j2)) {
                        long j3 = this.d0;
                        if (j3 != -9223372036854775807L) {
                            vf1 vf1Var2 = this.z;
                            vf1Var2.getClass();
                            z2 = vf1Var2.c() - jC < j3;
                        }
                        if (!z2) {
                            break;
                        }
                    }
                    while (X()) {
                        long j4 = this.d0;
                        if (j4 != -9223372036854775807L) {
                            vf1 vf1Var3 = this.z;
                            vf1Var3.getClass();
                            z = vf1Var3.c() - jC < j4;
                        }
                        if (!z) {
                            break;
                        }
                    }
                    Trace.endSection();
                } else {
                    ln2 ln2Var = this.Q0;
                    int i = ln2Var.d;
                    xz8 xz8Var = this.B;
                    xz8Var.getClass();
                    ln2Var.d = i + xz8Var.c(j - this.D);
                    y0(1);
                }
                synchronized (this.Q0) {
                }
            }
        } catch (MediaCodec.CryptoException e) {
            throw G(e, this.X, false, n6b.w(e.getErrorCode()));
        } catch (IllegalStateException e2) {
            boolean z4 = e2 instanceof MediaCodec.CodecException;
            if (!z4) {
                StackTraceElement[] stackTrace = e2.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    throw e2;
                }
            }
            m0(e2);
            if (z4 && ((MediaCodec.CodecException) e2).isRecoverable()) {
                z3 = true;
            }
            if (z3) {
                z0();
            }
            dn6 dn6VarU = U(e2, this.n0);
            throw G(dn6VarU, this.X, z3, dn6VarU.t == 1101 ? 4006 : 4003);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00ba  */
    public final void h0(en6 en6Var, MediaCrypto mediaCrypto) {
        int i;
        this.n0 = en6Var;
        id4 id4Var = this.X;
        id4Var.getClass();
        String str = en6Var.a;
        float f = this.f0;
        id4[] id4VarArr = this.C;
        id4VarArr.getClass();
        float fB0 = b0(f, id4Var, id4VarArr);
        if (fB0 <= this.O) {
            fB0 = -1.0f;
        }
        vf1 vf1Var = this.z;
        vf1Var.getClass();
        long jC = vf1Var.c();
        an6.a aVarF0 = f0(en6Var, id4Var, mediaCrypto, fB0);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            x38 x38Var = this.y;
            x38Var.getClass();
            a.a(aVarF0, x38Var);
        }
        try {
            Trace.beginSection("createCodec:" + str);
            an6 an6VarA = this.M.a(aVarF0);
            this.g0 = an6VarA;
            this.u0 = an6VarA.f(new c());
            Trace.endSection();
            vf1 vf1Var2 = this.z;
            vf1Var2.getClass();
            long jC2 = vf1Var2.c();
            if (!en6Var.e(this.L, id4Var)) {
                String strC = id4.c(id4Var);
                Locale locale = Locale.US;
                md6.g("MediaCodecRenderer", op3.a("Format exceeds selected codec's capabilities [", strC, ", ", str, "]"));
            }
            this.k0 = fB0;
            this.h0 = id4Var;
            boolean z = false;
            if (i2 > 25 || !"OMX.Exynos.avc.dec.secure".equals(str)) {
                i = 0;
            } else {
                String str2 = Build.MODEL;
                if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                    i = 2;
                } else {
                    i = 0;
                }
            }
            this.o0 = i;
            this.p0 = i2 == 29 && "c2.android.aac.decoder".equals(str);
            String str3 = en6Var.a;
            if ((i2 <= 25 && "OMX.rk.video_decoder.avc".equals(str3)) || ((i2 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str3) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str3) || "OMX.bcm.vdec.avc.tunnel".equals(str3) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str3) || "OMX.bcm.vdec.hevc.tunnel".equals(str3) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str3))) || ("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && en6Var.f))) {
                z = true;
            }
            this.s0 = z;
            this.g0.getClass();
            if (this.A == 2) {
                vf1 vf1Var3 = this.z;
                vf1Var3.getClass();
                this.v0 = vf1Var3.c() + 1000;
            }
            this.Q0.a++;
            long j = jC2 - jC;
            if (i2 >= 31 && !this.Z0.isEmpty()) {
                an6 an6Var = this.g0;
                an6Var.getClass();
                an6Var.q(new ArrayList(this.Z0));
            }
            n0(jC2, j, str);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final boolean i0(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        id4 id4Var = this.Y;
        return id4Var == null || !Objects.equals(id4Var.o, "audio/opus") || j - j2 > 80000;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0085 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0087  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a4 A[Catch: b -> 0x00b4, TryCatch #0 {b -> 0x00b4, blocks: (B:47:0x00a0, B:49:0x00a4, B:51:0x00ab, B:56:0x00b6, B:60:0x00c3), top: B:70:0x00a0 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:72:0x008e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final void j0() {
        id4 id4Var;
        i83 i83Var;
        if (this.g0 != null || this.A0 || (id4Var = this.X) == null) {
            return;
        }
        String str = id4Var.o;
        boolean z = true;
        if (this.a0 == null && K0(id4Var)) {
            this.A0 = false;
            B0();
            boolean zEquals = "audio/mp4a-latm".equals(str);
            rn0 rn0Var = this.S;
            if (zEquals || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                rn0Var.getClass();
                rn0Var.D = 32;
            } else {
                rn0Var.getClass();
                rn0Var.D = 1;
            }
            this.A0 = true;
            return;
        }
        E0(this.a0);
        if (this.Z == null) {
            try {
                i83Var = this.Z;
                if (i83Var == null && (i83Var.getState() == 3 || this.Z.getState() == 4)) {
                    i83 i83Var2 = this.Z;
                    str.getClass();
                    if (!i83Var2.e(str)) {
                        z = false;
                    }
                } else {
                    z = false;
                }
                k0(this.c0, z);
            } catch (b e) {
                throw G(e, id4Var, false, 4001);
            }
        } else {
            xl7.r(this.c0 == null);
            i83 i83Var3 = this.Z;
            ih4 ih4VarG = i83Var3.g();
            if (!ih4.a || ih4VarG == null) {
                if (ih4VarG == null) {
                    try {
                        this.c0 = new MediaCrypto(null, null);
                    } catch (MediaCryptoException e2) {
                        throw G(e2, this.X, false, 6006);
                    }
                } else if (i83Var3.f() != null) {
                }
                i83Var = this.Z;
                if (i83Var == null) {
                    z = false;
                } else {
                    z = false;
                }
                k0(this.c0, z);
            } else {
                int state = i83Var3.getState();
                if (state == 1) {
                    i83.a aVarF = i83Var3.f();
                    aVarF.getClass();
                    throw G(aVarF, this.X, false, aVarF.t);
                }
                if (state == 4) {
                    if (ih4VarG == null) {
                        this.c0 = new MediaCrypto(null, null);
                    } else if (i83Var3.f() != null) {
                    }
                    i83Var = this.Z;
                    if (i83Var == null) {
                        z = false;
                    } else {
                        z = false;
                    }
                    k0(this.c0, z);
                }
            }
        }
        MediaCrypto mediaCrypto = this.c0;
        if (mediaCrypto == null || this.g0 != null) {
            return;
        }
        mediaCrypto.release();
        this.c0 = null;
    }

    public final void k0(MediaCrypto mediaCrypto, boolean z) throws b {
        id4 id4Var = this.X;
        id4Var.getClass();
        if (this.l0 == null) {
            try {
                List<en6> listZ = Z(z);
                this.l0 = new ArrayDeque<>();
                ArrayList arrayList = (ArrayList) listZ;
                if (!arrayList.isEmpty()) {
                    this.l0.add((en6) arrayList.get(0));
                }
                this.m0 = null;
            } catch (mn6.b e) {
                throw new b(id4Var, e, z, -49998);
            }
        }
        if (this.l0.isEmpty()) {
            throw new b(id4Var, null, z, -49999);
        }
        ArrayDeque<en6> arrayDeque = this.l0;
        arrayDeque.getClass();
        while (this.g0 == null) {
            en6 en6VarPeekFirst = arrayDeque.peekFirst();
            en6VarPeekFirst.getClass();
            if (!l0(id4Var) || !I0(en6VarPeekFirst)) {
                return;
            }
            try {
                h0(en6VarPeekFirst, mediaCrypto);
            } catch (Exception e2) {
                md6.h("MediaCodecRenderer", "Failed to initialize decoder: " + en6VarPeekFirst, e2);
                arrayDeque.removeFirst();
                b bVar = new b("Decoder init failed: " + en6VarPeekFirst.a + ", " + id4Var, e2, id4Var.o, z, en6VarPeekFirst, e2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e2).getDiagnosticInfo() : null);
                m0(bVar);
                b bVar2 = this.m0;
                if (bVar2 == null) {
                    this.m0 = bVar;
                } else {
                    this.m0 = new b(bVar2.getMessage(), bVar2.getCause(), bVar2.t, bVar2.u, bVar2.v, bVar2.w);
                }
                if (arrayDeque.isEmpty()) {
                    throw this.m0;
                }
            }
        }
        this.l0 = null;
    }

    @Override // androidx.media3.exoplayer.k
    public final long l(long j, long j2) {
        return d0(j, j2, this.u0);
    }

    public boolean l0(id4 id4Var) {
        return true;
    }

    public abstract void m0(Exception exc);

    public abstract void n0(long j, long j2, String str);

    public abstract void o0(androidx.media3.exoplayer.b bVar);

    public abstract void p0(String str);

    /* JADX WARN: Code duplicated, block: B:12:0x0030  */
    /* JADX WARN: Code duplicated, block: B:32:0x0061  */
    /* JADX WARN: Code duplicated, block: B:34:0x0069  */
    /* JADX WARN: Code duplicated, block: B:78:0x010c  */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00e4, code lost:
    
        if (r8.equals(r4.a()) == false) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.pn2 q0(defpackage.jd4 r15) {
        /*
            Method dump skipped, instruction units count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.in6.q0(jd4):pn2");
    }

    public abstract void r0(id4 id4Var, MediaFormat mediaFormat);

    public void t0(long j) {
        this.S0 = j;
        while (true) {
            ArrayDeque<d> arrayDeque = this.U;
            if (arrayDeque.isEmpty() || j < arrayDeque.peek().a) {
                return;
            }
            d dVarPoll = arrayDeque.poll();
            dVarPoll.getClass();
            F0(dVarPoll);
            u0();
        }
    }

    public abstract void u0();

    @Override // androidx.media3.exoplayer.k
    public void v(float f, float f2) {
        this.e0 = f;
        this.f0 = f2;
        M0(this.h0);
    }

    public final void w0() throws lo3 {
        int i = this.G0;
        if (i == 1) {
            Y();
            return;
        }
        if (i == 2) {
            Y();
            N0();
        } else if (i != 3) {
            this.M0 = true;
            A0();
        } else {
            z0();
            j0();
        }
    }

    @Override // androidx.media3.exoplayer.a, androidx.media3.exoplayer.l
    public final int x() {
        return 8;
    }

    public abstract boolean x0(long j, long j2, an6 an6Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, id4 id4Var);

    @Override // androidx.media3.exoplayer.a, androidx.media3.exoplayer.j.b
    public void y(int i, Object obj) {
        int i2;
        if (i == 11) {
            k.a aVar = (k.a) obj;
            aVar.getClass();
            this.b0 = aVar;
            return;
        }
        if (i != 21) {
            if (i == 22 && (i2 = Build.VERSION.SDK_INT) >= 29) {
                obj.getClass();
                q95<String> q95Var = (q95) obj;
                if (this.Z0.equals(q95Var)) {
                    return;
                }
                if (i2 >= 31) {
                    HashSet hashSet = new HashSet(q95Var);
                    HashSet hashSet2 = new HashSet();
                    w2b it = this.Z0.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        if (!hashSet.remove(str)) {
                            hashSet2.add(str);
                        }
                    }
                    an6 an6Var = this.g0;
                    if (an6Var != null) {
                        if (!hashSet2.isEmpty()) {
                            an6Var.s(new ArrayList(hashSet2));
                        }
                        if (!hashSet.isEmpty()) {
                            an6Var.q(new ArrayList(hashSet));
                        }
                    }
                }
                this.Z0 = q95Var;
                return;
            }
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            obj.getClass();
            androidx.media3.exoplayer.b bVar = (androidx.media3.exoplayer.b) obj;
            this.X0 = bVar;
            an6 an6Var2 = this.g0;
            if (an6Var2 != null) {
                Bundle bundle = new Bundle();
                for (Map.Entry<String, Object> entry : bVar.a.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (value != null) {
                        if (value instanceof Integer) {
                            bundle.putInt(key, ((Integer) value).intValue());
                        } else if (value instanceof Long) {
                            bundle.putLong(key, ((Long) value).longValue());
                        } else if (value instanceof Float) {
                            bundle.putFloat(key, ((Float) value).floatValue());
                        } else if (value instanceof String) {
                            bundle.putString(key, (String) value);
                        } else if (value instanceof ByteBuffer) {
                            ByteBuffer byteBuffer = (ByteBuffer) value;
                            byte[] bArr = new byte[byteBuffer.remaining()];
                            byteBuffer.duplicate().get(bArr);
                            bundle.putByteArray(key, bArr);
                        }
                    }
                }
                an6Var2.b(bundle);
            }
        }
    }

    public final boolean y0(int i) throws lo3 {
        jd4 jd4Var = this.v;
        jd4Var.a();
        nn2 nn2Var = this.P;
        nn2Var.j();
        int iQ = Q(jd4Var, nn2Var, i | 4);
        if (iQ == -5) {
            q0(jd4Var);
            return true;
        }
        if (iQ != -4 || !nn2Var.i(4)) {
            return false;
        }
        this.L0 = true;
        w0();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z0() {
        try {
            an6 an6Var = this.g0;
            if (an6Var != null) {
                an6Var.a();
                this.Q0.b++;
                en6 en6Var = this.n0;
                en6Var.getClass();
                p0(en6Var.a);
            }
            this.g0 = null;
            try {
                MediaCrypto mediaCrypto = this.c0;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.c0 = null;
                E0(null);
                D0();
            }
        } catch (Throwable th) {
            this.g0 = null;
            try {
                MediaCrypto mediaCrypto2 = this.c0;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
                this.c0 = null;
                E0(null);
                D0();
            }
        }
    }

    public void s0(long j) {
    }

    public void v0(nn2 nn2Var) {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b extends Exception {
        public final String t;
        public final boolean u;
        public final en6 v;
        public final String w;

        public b(id4 id4Var, mn6.b bVar, boolean z, int i) {
            this("Decoder init failed: [" + i + "], " + id4Var, bVar, id4Var.o, z, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i < 0 ? "neg_" : BuildConfig.FLAVOR) + Math.abs(i));
        }

        public b(String str, Throwable th, String str2, boolean z, en6 en6Var, String str3) {
            super(str, th);
            this.t = str2;
            this.u = z;
            this.v = en6Var;
            this.w = str3;
        }
    }
}
