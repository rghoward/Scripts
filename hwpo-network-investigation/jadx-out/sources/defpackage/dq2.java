package defpackage;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.media3.exoplayer.d;
import androidx.media3.exoplayer.k;
import androidx.media3.exoplayer.l;
import io.ably.lib.util.Crypto;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import org.msgpack.core.MessagePack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class dq2 {
    public static final AtomicInteger c0 = new AtomicInteger();
    public long A;
    public long B;
    public long C;
    public int D;
    public boolean E;
    public boolean F;
    public long G;
    public float H;
    public ByteBuffer I;
    public int J;
    public ByteBuffer K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public int Q;
    public boolean R;
    public rf0 S;
    public AudioDeviceInfo T;
    public int U;
    public boolean V;
    public long W;
    public boolean X;
    public boolean Y;
    public long Z;
    public final Context a;
    public long a0;
    public final f b;
    public Handler b0;
    public final fa1 c;
    public final fya d;
    public final lpa e;
    public final kpa f;
    public final ul8 g;
    public final ArrayDeque<g> h;
    public int i;
    public b j;
    public final h<k90> k;
    public final h<m90> l;
    public x38 m;
    public bn6.a n;
    public e o;
    public e p;
    public r80 q;
    public m80 r;
    public aq2 s;
    public l80 t;
    public q70 u;
    public g v;
    public g w;
    public k28 x;
    public boolean y;
    public long z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface a {
        k80 a(q70 q70Var, id4 id4Var);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class b implements l80.a {
        public final m80.f a;

        public b(m80.f fVar) {
            this.a = fVar;
        }

        @Override // l80.a
        public final void a(final long j) {
            bn6.a aVar;
            dq2 dq2Var = dq2.this;
            if (this == dq2Var.j && (aVar = dq2Var.n) != null) {
                bn6 bn6Var = bn6.this;
                bn6Var.n1 = true;
                final h90 h90Var = bn6Var.c1;
                Handler handler = h90Var.a;
                if (handler != null) {
                    handler.post(new Runnable() { // from class: w80
                        @Override // java.lang.Runnable
                        public final void run() {
                            d.b bVar = h90Var.b;
                            String str = n6b.a;
                            d.this.s.V(j);
                        }
                    });
                }
            }
        }

        @Override // l80.a
        public final void b() {
            bn6.a aVar;
            k.a aVar2;
            dq2 dq2Var = dq2.this;
            if (this == dq2Var.j && (aVar = dq2Var.n) != null && dq2Var.O && (aVar2 = bn6.this.b0) != null) {
                aVar2.b();
            }
        }

        @Override // l80.a
        public final void c() {
            dq2 dq2Var = dq2.this;
            if (this == dq2Var.j && dq2Var.M) {
                dq2Var.N = true;
            }
        }

        @Override // l80.a
        public final void d() {
            dq2.c0.getAndDecrement();
            bn6.a aVar = dq2.this.n;
            if (aVar != null) {
                int i = this.a.a;
                final i90 i90Var = new i90();
                final h90 h90Var = bn6.this.c1;
                Handler handler = h90Var.a;
                if (handler != null) {
                    handler.post(new Runnable() { // from class: x80
                        @Override // java.lang.Runnable
                        public final void run() {
                            d.b bVar = h90Var.b;
                            String str = n6b.a;
                            d.this.s.E(i90Var);
                        }
                    });
                }
            }
        }

        @Override // l80.a
        public final void e() {
            long jS;
            dq2 dq2Var = dq2.this;
            if (this == dq2Var.j && dq2Var.n != null) {
                e eVar = dq2Var.p;
                int i = eVar.d;
                if (i != -1) {
                    long j = eVar.e.f / i;
                    l80 l80Var = dq2Var.t;
                    l80Var.getClass();
                    jS = n6b.S(l80Var.l(), j);
                } else {
                    jS = -9223372036854775807L;
                }
                final long jElapsedRealtime = SystemClock.elapsedRealtime() - dq2Var.W;
                bn6.a aVar = dq2Var.n;
                final int i2 = dq2Var.p.e.f;
                final long jZ = n6b.Z(jS);
                final h90 h90Var = bn6.this.c1;
                Handler handler = h90Var.a;
                if (handler != null) {
                    handler.post(new Runnable() { // from class: v80
                        @Override // java.lang.Runnable
                        public final void run() {
                            d.b bVar = h90Var.b;
                            String str = n6b.a;
                            d.this.s.H(jZ, i2, jElapsedRealtime);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface c {
        public static final eq2 a = new eq2();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d {
        public final Context a;
        public final u70 b = u70.f;
        public f c;
        public boolean d;
        public eq2 e;
        public da0 f;
        public zp2 g;

        public d(Context context) {
            this.a = context;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class e {
        public final id4 a;
        public final id4 b;
        public final int c;
        public final int d;
        public final m80.f e;
        public final r80 f;

        public e(id4 id4Var, id4 id4Var2, int i, int i2, m80.f fVar, r80 r80Var) {
            this.a = id4Var;
            this.b = id4Var2;
            this.c = i;
            this.d = i2;
            this.e = fVar;
            this.f = r80Var;
        }

        public static boolean a(e eVar) {
            return Objects.equals(eVar.a.o, "audio/raw");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class f {
        public final s80[] a;
        public final ap9 b;
        public final dw9 c;

        public f(s80... s80VarArr) {
            ap9 ap9Var = new ap9();
            dw9 dw9Var = new dw9();
            dw9Var.c = 1.0f;
            dw9Var.d = 1.0f;
            s80.a aVar = s80.a.e;
            dw9Var.e = aVar;
            dw9Var.f = aVar;
            dw9Var.g = aVar;
            dw9Var.h = aVar;
            ByteBuffer byteBuffer = s80.a;
            dw9Var.k = byteBuffer;
            dw9Var.l = byteBuffer;
            dw9Var.b = -1;
            s80[] s80VarArr2 = new s80[s80VarArr.length + 2];
            this.a = s80VarArr2;
            System.arraycopy(s80VarArr, 0, s80VarArr2, 0, s80VarArr.length);
            this.b = ap9Var;
            this.c = dw9Var;
            s80VarArr2[s80VarArr.length] = ap9Var;
            s80VarArr2[s80VarArr.length + 1] = dw9Var;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class g {
        public final k28 a;
        public final long b;
        public final long c;
        public long d;

        public g(k28 k28Var, long j, long j2) {
            this.a = k28Var;
            this.b = j;
            this.c = j2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class h<T extends Exception> {
        public T a;
        public long b = -9223372036854775807L;
        public long c = -9223372036854775807L;

        /* JADX INFO: Thrown type has an unknown type hierarchy: T extends java.lang.Exception */
        public final void a(T t) throws T {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.a == null) {
                this.a = t;
            }
            if (this.b == -9223372036854775807L && dq2.c0.get() <= 0) {
                this.b = 200 + jElapsedRealtime;
            }
            long j = this.b;
            if (j == -9223372036854775807L || jElapsedRealtime < j) {
                this.c = jElapsedRealtime + 50;
                return;
            }
            T t2 = this.a;
            if (t2 != t) {
                t2.addSuppressed(t);
            }
            T t3 = this.a;
            this.a = null;
            this.b = -9223372036854775807L;
            this.c = -9223372036854775807L;
            throw t3;
        }
    }

    public dq2(d dVar) {
        int deviceId;
        Context context = dVar.a;
        this.a = context == null ? null : context.getApplicationContext();
        this.u = q70.b;
        this.b = dVar.c;
        this.i = 0;
        this.r = dVar.f;
        fa1 fa1Var = new fa1();
        this.c = fa1Var;
        fya fyaVar = new fya();
        fyaVar.m = n6b.b;
        this.d = fyaVar;
        this.e = new lpa();
        this.f = new kpa();
        this.g = k95.w(fyaVar, fa1Var);
        this.H = 1.0f;
        this.Q = 0;
        this.S = new rf0();
        k28 k28Var = k28.d;
        this.w = new g(k28Var, 0L, 0L);
        this.x = k28Var;
        this.y = false;
        this.h = new ArrayDeque<>();
        this.k = new h<>();
        this.l = new h<>();
        int i = -1;
        if (Build.VERSION.SDK_INT >= 34 && context != null && (deviceId = context.getDeviceId()) != 0 && deviceId != -1) {
            i = deviceId;
        }
        this.U = i;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00c0  */
    public static int i(int i, ByteBuffer byteBuffer) {
        int i2;
        int i3;
        byte b2;
        int i4;
        byte b3;
        int i5;
        int i6;
        int i7;
        int i8;
        if (i == 20) {
            if ((byteBuffer.get(5) & 2) == 0) {
                i2 = 0;
            } else {
                byte b4 = byteBuffer.get(26);
                int i9 = 28;
                int i10 = 28;
                for (int i11 = 0; i11 < b4; i11++) {
                    i10 += byteBuffer.get(i11 + 27);
                }
                byte b5 = byteBuffer.get(i10 + 26);
                for (int i12 = 0; i12 < b5; i12++) {
                    i9 += byteBuffer.get(i10 + 27 + i12);
                }
                i2 = i10 + i9;
            }
            int i13 = byteBuffer.get(i2 + 26) + 27 + i2;
            return (int) ((bl7.h(byteBuffer.get(i13), byteBuffer.limit() - i13 > 1 ? byteBuffer.get(i13 + 1) : (byte) 0) * 48000) / 1000000);
        }
        if (i != 30) {
            switch (i) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    break;
                case 9:
                    int iPosition = byteBuffer.position();
                    String str = n6b.a;
                    int iReverseBytes = byteBuffer.getInt(iPosition);
                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                        iReverseBytes = Integer.reverseBytes(iReverseBytes);
                    }
                    if ((iReverseBytes & (-2097152)) != -2097152 || (i6 = (iReverseBytes >>> 19) & 3) == 1 || (i7 = (iReverseBytes >>> 17) & 3) == 0) {
                        i5 = -1;
                    } else {
                        int i14 = (iReverseBytes >>> 12) & 15;
                        int i15 = (iReverseBytes >>> 10) & 3;
                        if (i14 == 0 || i14 == 15 || i15 == 3) {
                            i5 = -1;
                        } else {
                            i5 = 1152;
                            if (i7 != 1) {
                                if (i7 != 2) {
                                    if (i7 != 3) {
                                        zn3.b();
                                        return 0;
                                    }
                                    i5 = 384;
                                }
                            } else if (i6 != 3) {
                                i5 = 576;
                            }
                        }
                    }
                    if (i5 != -1) {
                        return i5;
                    }
                    zn3.b();
                    return 0;
                case 10:
                    return 1024;
                case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                case 12:
                    return AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                default:
                    switch (i) {
                        case 14:
                            int iPosition2 = byteBuffer.position();
                            int iLimit = byteBuffer.limit() - 10;
                            int i16 = iPosition2;
                            while (true) {
                                if (i16 <= iLimit) {
                                    String str2 = n6b.a;
                                    int iReverseBytes2 = byteBuffer.getInt(i16 + 4);
                                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                        iReverseBytes2 = Integer.reverseBytes(iReverseBytes2);
                                    }
                                    if ((iReverseBytes2 & (-2)) == -126718022) {
                                        i8 = i16 - iPosition2;
                                    } else {
                                        i16++;
                                    }
                                } else {
                                    i8 = -1;
                                }
                            }
                            if (i8 == -1) {
                                return 0;
                            }
                            return (40 << ((byteBuffer.get((byteBuffer.position() + i8) + (((byteBuffer.get((byteBuffer.position() + i8) + 7) & MessagePack.Code.EXT_TIMESTAMP) == 187 ? (byte) 1 : (byte) 0) != 0 ? 9 : 8)) >> 4) & 7)) * 16;
                        case h4c.e /* 15 */:
                            return 512;
                        case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                            return 1024;
                        case 17:
                            byte[] bArr = new byte[16];
                            int iPosition3 = byteBuffer.position();
                            byteBuffer.get(bArr);
                            byteBuffer.position(iPosition3);
                            return j3.b(new ot7(bArr, 16)).c;
                        case 18:
                            break;
                        default:
                            aa0.c(pp2.a(i, "Unexpected audio encoding: "));
                            return 0;
                    }
                    break;
            }
            if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
                return f3.a[((byteBuffer.get(byteBuffer.position() + 4) & MessagePack.Code.NIL) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
            }
            return 1536;
        }
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return 4096;
        }
        int iPosition4 = byteBuffer.position();
        byte b6 = byteBuffer.get(iPosition4);
        if (b6 != -2) {
            if (b6 == -1) {
                i3 = (byteBuffer.get(iPosition4 + 4) & 7) << 4;
                b3 = byteBuffer.get(iPosition4 + 7);
            } else if (b6 != 31) {
                i3 = (byteBuffer.get(iPosition4 + 4) & 1) << 6;
                b2 = byteBuffer.get(iPosition4 + 5);
            } else {
                i3 = (byteBuffer.get(iPosition4 + 5) & 7) << 4;
                b3 = byteBuffer.get(iPosition4 + 6);
            }
            i4 = b3 & 60;
            return (((i4 >> 2) | i3) + 1) * 32;
        }
        i3 = (byteBuffer.get(iPosition4 + 5) & 1) << 6;
        b2 = byteBuffer.get(iPosition4 + 4);
        i4 = b2 & 252;
        return (((i4 >> 2) | i3) + 1) * 32;
    }

    public final void a(long j) {
        k28 k28Var;
        boolean zU = u();
        boolean z = false;
        f fVar = this.b;
        if (zU) {
            k28Var = k28.d;
        } else {
            if (this.V || !e.a(this.p)) {
                k28Var = k28.d;
            } else {
                int i = this.p.a.I;
                k28Var = this.x;
                dw9 dw9Var = fVar.c;
                float f2 = k28Var.a;
                dw9Var.getClass();
                xl7.g(f2 > 0.0f);
                if (dw9Var.c != f2) {
                    dw9Var.c = f2;
                    dw9Var.i = true;
                }
                float f3 = k28Var.b;
                xl7.g(f3 > 0.0f);
                if (dw9Var.d != f3) {
                    dw9Var.d = f3;
                    dw9Var.i = true;
                }
            }
            this.x = k28Var;
        }
        k28 k28Var2 = k28Var;
        if (!this.V && e.a(this.p)) {
            int i2 = this.p.a.I;
            z = this.y;
            fVar.b.o = z;
        }
        this.y = z;
        this.h.add(new g(k28Var2, Math.max(0L, j), n6b.S(this.p.e.b, j())));
        r80 r80Var = this.p.f;
        this.q = r80Var;
        r80Var.a();
        bn6.a aVar = this.n;
        if (aVar != null) {
            final boolean z2 = this.y;
            final h90 h90Var = bn6.this.c1;
            Handler handler = h90Var.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: e90
                    @Override // java.lang.Runnable
                    public final void run() {
                        d.b bVar = h90Var.b;
                        String str = n6b.a;
                        d dVar = d.this;
                        boolean z3 = dVar.d0;
                        final boolean z4 = z2;
                        if (z3 == z4) {
                            return;
                        }
                        dVar.d0 = z4;
                        dVar.m.e(23, new gb6.a() { // from class: wp3
                            @Override // gb6.a
                            public final void invoke(Object obj) {
                                ((s28.c) obj).R(z4);
                            }
                        });
                    }
                });
            }
        }
    }

    public final l80 b(m80.f fVar) throws k90 {
        try {
            return this.r.e(fVar);
        } catch (m80.d e2) {
            k90 k90Var = new k90(fVar.b, fVar.c, fVar.a, fVar.f, this.p.a, fVar.e, e2);
            bn6.a aVar = this.n;
            if (aVar == null) {
                throw k90Var;
            }
            aVar.a(k90Var);
            throw k90Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [aq2] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void c(id4 id4Var, int[] iArr) {
        r80 r80Var;
        id4 id4Var2;
        int i;
        int iS;
        if (this.s == null && this.a != null) {
            ?? r0 = new m80.e() { // from class: aq2
                @Override // m80.e
                public final void a() {
                    l.a aVar;
                    bn6.a aVar2 = this.a.n;
                    if (aVar2 != null) {
                        bn6 bn6Var = bn6.this;
                        synchronized (bn6Var.t) {
                            aVar = bn6Var.K;
                        }
                        if (aVar != null) {
                            cv2 cv2Var = (cv2) aVar;
                            synchronized (cv2Var.c) {
                                cv2Var.f.getClass();
                            }
                        }
                    }
                }
            };
            this.s = r0;
            this.r.d(r0);
        }
        String str = id4Var.o;
        int i2 = id4Var.G;
        int i3 = id4Var.I;
        if ("audio/raw".equals(str)) {
            xl7.g(n6b.J(i3));
            int iS2 = n6b.s(i3) * i2;
            k95.a aVar = new k95.a();
            aVar.d(this.g);
            aVar.c(this.e);
            aVar.f(this.b.a);
            r80Var = new r80(aVar.g());
            if (r80Var.equals(this.q)) {
                r80Var = this.q;
            }
            int i4 = id4Var.J;
            int i5 = id4Var.K;
            fya fyaVar = this.d;
            fyaVar.i = i4;
            fyaVar.j = i5;
            this.c.i = iArr;
            s80.a aVar2 = new s80.a(id4Var.H, i2, i3);
            try {
                k95<s80> k95Var = r80Var.a;
                if (aVar2.equals(s80.a.e)) {
                    throw new s80.c(aVar2);
                }
                for (int i6 = 0; i6 < k95Var.size(); i6++) {
                    s80 s80Var = k95Var.get(i6);
                    s80.a aVarL = s80Var.l(aVar2);
                    if (s80Var.h()) {
                        xl7.r(!aVarL.equals(s80.a.e));
                        aVar2 = aVarL;
                    }
                }
                int i7 = aVar2.b;
                int i8 = aVar2.c;
                id4.a aVarA = id4Var.a();
                aVarA.H = i8;
                aVarA.G = aVar2.a;
                aVarA.F = i7;
                id4Var2 = new id4(aVarA);
                i = iS2;
                iS = n6b.s(i8) * i7;
            } catch (s80.c e2) {
                throw new j90(e2, id4Var);
            }
        } else {
            r80Var = new r80(ul8.x);
            id4Var2 = id4Var;
            i = -1;
            iS = -1;
        }
        r80 r80Var2 = r80Var;
        m80.b bVarG = g(id4Var2);
        id4 id4Var3 = bVarG.a;
        try {
            m80.f fVarC = this.r.c(bVarG);
            int i9 = fVarC.a;
            boolean z = fVarC.e;
            if (i9 == 0) {
                throw new j90(cq2.a("Invalid output encoding (isOffload=", ")", z), id4Var3);
            }
            if (fVarC.c == 0) {
                throw new j90(cq2.a("Invalid output channel config (isOffload=", ")", z), id4Var3);
            }
            this.X = false;
            e eVar = new e(id4Var, id4Var2, i, iS, fVarC, r80Var2);
            if (n()) {
                this.o = eVar;
            } else {
                this.p = eVar;
            }
        } catch (m80.a e3) {
            throw new j90(e3, id4Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: T */
    /* JADX WARN: Code duplicated, block: B:56:0x00cb  */
    public final void d(long j) throws T, m90 {
        bn6.a aVar;
        k.a aVar2;
        if (this.K == null) {
            return;
        }
        h<m90> hVar = this.l;
        if (hVar.a != 0 && (c0.get() > 0 || SystemClock.elapsedRealtime() < hVar.c)) {
            return;
        }
        int iRemaining = this.K.remaining();
        boolean z = true;
        try {
            boolean zP = this.t.p(this.J, j, this.K);
            this.W = SystemClock.elapsedRealtime();
            hVar.a = null;
            hVar.b = -9223372036854775807L;
            hVar.c = -9223372036854775807L;
            if (this.t.k()) {
                if (this.C > 0) {
                    this.Y = false;
                }
                if (this.O && (aVar = this.n) != null && !zP && !this.Y && (aVar2 = bn6.this.b0) != null) {
                    aVar2.a();
                }
            }
            if (e.a(this.p)) {
                this.B += (long) (iRemaining - this.K.remaining());
            }
            if (zP) {
                if (!e.a(this.p)) {
                    xl7.r(this.K == this.I);
                    this.C = (((long) this.D) * ((long) this.J)) + this.C;
                }
                this.K = null;
            }
        } catch (l80.b e2) {
            boolean z2 = e2.u;
            if (!z2) {
                z = false;
            } else if (j() <= 0) {
                if (!this.t.k()) {
                    z = false;
                } else if (this.p.e.e) {
                    this.X = true;
                }
            }
            m90 m90Var = new m90(e2.t, this.p.a, z);
            bn6.a aVar3 = this.n;
            if (aVar3 != null) {
                aVar3.a(m90Var);
            }
            if (z2) {
                throw m90Var;
            }
            hVar.a(m90Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: T */
    /* JADX WARN: Code duplicated, block: B:19:0x0043 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0044 A[RETURN] */
    public final boolean e() throws T, m90 {
        ByteBuffer byteBuffer;
        if (!this.q.d()) {
            d(Long.MIN_VALUE);
            if (this.K == null) {
                return true;
            }
            return false;
        }
        r80 r80Var = this.q;
        if (r80Var.d() && !r80Var.d) {
            r80Var.d = true;
            ((s80) r80Var.b.get(0)).m();
        }
        p(Long.MIN_VALUE);
        if (!this.q.c() || ((byteBuffer = this.K) != null && byteBuffer.hasRemaining())) {
            return false;
        }
        return true;
    }

    public final void f() {
        if (n()) {
            this.z = 0L;
            this.A = 0L;
            this.B = 0L;
            this.C = 0L;
            this.Y = false;
            this.D = 0;
            this.w = new g(this.x, 0L, 0L);
            this.G = 0L;
            this.v = null;
            this.h.clear();
            this.I = null;
            this.J = 0;
            this.K = null;
            this.M = false;
            this.L = false;
            this.N = false;
            this.d.o = 0L;
            r80 r80Var = this.p.f;
            this.q = r80Var;
            r80Var.a();
            this.j = null;
            e eVar = this.o;
            if (eVar != null) {
                this.p = eVar;
                this.o = null;
            }
            c0.incrementAndGet();
            this.t.a();
            this.t = null;
        }
        h<m90> hVar = this.l;
        hVar.a = null;
        hVar.b = -9223372036854775807L;
        hVar.c = -9223372036854775807L;
        h<k90> hVar2 = this.k;
        hVar2.a = null;
        hVar2.b = -9223372036854775807L;
        hVar2.c = -9223372036854775807L;
        this.Z = 0L;
        this.a0 = 0L;
        Handler handler = this.b0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final m80.b g(id4 id4Var) {
        m80.b.a aVar = new m80.b.a(id4Var);
        aVar.b = this.u;
        aVar.d = this.i != 0;
        aVar.c = this.T;
        aVar.e = this.Q;
        aVar.g = this.V;
        aVar.h = -1;
        aVar.f = this.U;
        return new m80.b(aVar);
    }

    public final int h(id4 id4Var) {
        boolean z;
        if (!n6b.J(id4Var.I) || id4Var.I == 2) {
            z = false;
        } else {
            id4.a aVarA = id4Var.a();
            aVarA.H = 2;
            id4Var = new id4(aVarA);
            z = true;
        }
        int i = this.r.b(g(id4Var)).d;
        if (i != 1) {
            if (i != 2) {
                return 0;
            }
            if (!z) {
                return 2;
            }
        }
        return 1;
    }

    public final long j() {
        if (!e.a(this.p)) {
            return this.C;
        }
        long j = this.B;
        long j2 = this.p.d;
        return ((j + j2) - 1) / j2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: T */
    /* JADX WARN: Code duplicated, block: B:102:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:103:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:105:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:107:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:109:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:111:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:114:0x0095 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x005e  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:65:0x0100  */
    /* JADX WARN: Code duplicated, block: B:67:0x0108  */
    /* JADX WARN: Code duplicated, block: B:74:0x011f  */
    /* JADX WARN: Code duplicated, block: B:77:0x0127  */
    /* JADX WARN: Code duplicated, block: B:78:0x012c  */
    /* JADX WARN: Code duplicated, block: B:80:0x0136  */
    /* JADX WARN: Code duplicated, block: B:81:0x0141  */
    /* JADX WARN: Code duplicated, block: B:84:0x0157  */
    /* JADX WARN: Code duplicated, block: B:88:0x0168  */
    /* JADX WARN: Code duplicated, block: B:92:0x0185  */
    /* JADX WARN: Code duplicated, block: B:95:0x018c  */
    /* JADX WARN: Code duplicated, block: B:97:0x019c  */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0118, code lost:
    
        if (r5 == 0) goto L71;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k(int r19, long r20, java.nio.ByteBuffer r22) throws defpackage.k90, T, defpackage.m90 {
        /*
            Method dump skipped, instruction units count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dq2.k(int, long, java.nio.ByteBuffer):boolean");
    }

    public final boolean l() {
        if (!n()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29 && this.t.k() && this.N) {
            return false;
        }
        long j = j();
        long jG = this.t.g();
        l80 l80Var = this.t;
        l80Var.getClass();
        return j > n6b.U(jG, (long) l80Var.l(), 1000000L, RoundingMode.UP);
    }

    public final boolean m() throws k90 {
        l80 l80VarB;
        jf6 jf6Var;
        h<k90> hVar = this.k;
        if (hVar.a != 0 && (c0.get() > 0 || SystemClock.elapsedRealtime() < hVar.c)) {
            return false;
        }
        try {
            l80VarB = b(this.p.e);
        } catch (k90 e2) {
            int i = this.p.e.f;
            while (true) {
                e eVar = this.p;
                if (i <= 1000000) {
                    if (!eVar.e.e) {
                        throw e2;
                    }
                    this.X = true;
                    throw e2;
                }
                int i2 = i / 2;
                int i3 = eVar.d;
                if (i3 == -1) {
                    i3 = 1;
                }
                int i4 = i2 % i3;
                int i5 = i4 != 0 ? (i3 - i4) + i2 : i2;
                m80.f.a aVarA = eVar.e.a();
                aVarA.f = i5;
                m80.f fVar = new m80.f(aVarA);
                try {
                    l80VarB = b(fVar);
                    e eVar2 = this.p;
                    this.p = new e(eVar2.a, eVar2.b, eVar2.c, eVar2.d, fVar, eVar2.f);
                    break;
                } catch (k90 e3) {
                    e2.addSuppressed(e3);
                    i = i5;
                }
            }
        }
        this.t = l80VarB;
        b bVar = new b(this.p.e);
        this.j = bVar;
        ((t90) l80VarB).j.a(bVar);
        if (this.t.k()) {
            e eVar3 = this.p;
            if (eVar3.e.k) {
                l80 l80Var = this.t;
                id4 id4Var = eVar3.a;
                l80Var.j(id4Var.J, id4Var.K);
            }
        }
        x38 x38Var = this.m;
        if (x38Var != null) {
            this.t.n(x38Var);
        }
        if (n()) {
            this.t.m(this.H);
        }
        this.S.getClass();
        AudioDeviceInfo audioDeviceInfo = this.T;
        if (audioDeviceInfo != null) {
            this.t.setPreferredDevice(audioDeviceInfo);
        }
        this.F = true;
        int iQ = this.t.q();
        boolean z = iQ != this.Q;
        this.Q = iQ;
        bn6.a aVar = this.n;
        if (aVar != null) {
            int i6 = this.p.e.a;
            final i90 i90Var = new i90();
            final h90 h90Var = bn6.this.c1;
            Handler handler = h90Var.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: b90
                    @Override // java.lang.Runnable
                    public final void run() {
                        d.b bVar2 = h90Var.b;
                        String str = n6b.a;
                        d.this.s.N(i90Var);
                    }
                });
            }
            if (z) {
                this.R = true;
                e eVar4 = this.p;
                m80.f.a aVarA2 = eVar4.e.a();
                aVarA2.h = this.Q;
                this.p = new e(eVar4.a, eVar4.b, eVar4.c, eVar4.d, new m80.f(aVarA2), eVar4.f);
                e eVar5 = this.o;
                if (eVar5 != null) {
                    m80.f.a aVarA3 = eVar5.e.a();
                    aVarA3.h = this.Q;
                    this.o = new e(eVar5.a, eVar5.b, eVar5.c, eVar5.d, new m80.f(aVarA3), eVar5.f);
                }
                bn6.a aVar2 = this.n;
                final int i7 = this.Q;
                bn6 bn6Var = bn6.this;
                if (Build.VERSION.SDK_INT >= 35 && (jf6Var = bn6Var.e1) != null) {
                    jf6Var.d(i7);
                }
                final h90 h90Var2 = bn6Var.c1;
                Handler handler2 = h90Var2.a;
                if (handler2 != null) {
                    handler2.post(new Runnable() { // from class: f90
                        @Override // java.lang.Runnable
                        public final void run() {
                            d.b bVar2 = h90Var2.b;
                            String str = n6b.a;
                            ni0<Integer> ni0Var = d.this.C;
                            int i8 = i7;
                            vp3 vp3Var = new vp3(i8);
                            ni0Var.getClass();
                            int i9 = 0;
                            xl7.r(Looper.myLooper() == ni0Var.b.n());
                            ni0Var.f++;
                            ni0Var.a(new li0(i9, ni0Var, vp3Var));
                            Integer num = ni0Var.d;
                            ni0Var.b(Integer.valueOf(i8));
                        }
                    });
                }
            }
        }
        return true;
    }

    public final boolean n() {
        return this.t != null;
    }

    public final void o() {
        this.O = true;
        if (n()) {
            this.t.h();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: T */
    public final void p(long j) throws T, m90 {
        ByteBuffer byteBuffer;
        d(j);
        if (this.K != null) {
            return;
        }
        if (!this.q.d()) {
            ByteBuffer byteBuffer2 = this.I;
            if (byteBuffer2 != null) {
                t(byteBuffer2);
                d(j);
                return;
            }
            return;
        }
        while (!this.q.c()) {
            do {
                r80 r80Var = this.q;
                if (r80Var.d()) {
                    ByteBuffer byteBuffer3 = r80Var.c[r80Var.b()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        r80Var.e(s80.a);
                        byteBuffer = r80Var.c[r80Var.b()];
                    }
                } else {
                    byteBuffer = s80.a;
                }
                if (byteBuffer.hasRemaining()) {
                    t(byteBuffer);
                    d(j);
                } else {
                    ByteBuffer byteBuffer4 = this.I;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    r80 r80Var2 = this.q;
                    ByteBuffer byteBuffer5 = this.I;
                    if (r80Var2.d() && !r80Var2.d) {
                        r80Var2.e(byteBuffer5);
                    }
                }
            } while (this.K == null);
            return;
        }
    }

    public final void q() {
        if (this.p != null) {
            e eVar = this.o;
            if (eVar != null) {
                this.p = eVar;
                this.o = null;
            }
            try {
                m80.f fVarC = this.r.c(g(this.p.b));
                e eVar2 = this.p;
                this.p = new e(eVar2.a, eVar2.b, eVar2.c, eVar2.d, fVarC, eVar2.f);
            } catch (m80.a e2) {
                throw new IllegalStateException(new j90(e2, this.p.a));
            }
        }
        f();
    }

    public final void r() {
        f();
        k95.b bVarListIterator = this.g.listIterator(0);
        while (bVarListIterator.hasNext()) {
            ((s80) bVarListIterator.next()).reset();
        }
        this.e.reset();
        this.f.reset();
        r80 r80Var = this.q;
        if (r80Var != null) {
            k95<s80> k95Var = r80Var.a;
            for (int i = 0; i < k95Var.size(); i++) {
                s80 s80Var = k95Var.get(i);
                s80Var.j(s80.b.b);
                s80Var.reset();
            }
            r80Var.b.clear();
            r80Var.c = new ByteBuffer[0];
            s80.a aVar = s80.a.e;
            r80Var.d = false;
        }
        this.O = false;
        this.X = false;
    }

    public final void s(int i) {
        xl7.r(Build.VERSION.SDK_INT >= 29);
        this.i = i;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003c  */
    /* JADX WARN: Code duplicated, block: B:54:0x016f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x0171  */
    /* JADX WARN: Code duplicated, block: B:57:0x0174  */
    /* JADX WARN: Code duplicated, block: B:59:0x0178  */
    /* JADX WARN: Code duplicated, block: B:61:0x017c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0180  */
    /* JADX WARN: Code duplicated, block: B:65:0x0184  */
    /* JADX WARN: Code duplicated, block: B:67:0x0188  */
    /* JADX WARN: Code duplicated, block: B:69:0x018c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x018e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0197  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:75:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:77:0x01db  */
    /* JADX WARN: Code duplicated, block: B:78:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:79:0x0205 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x0207  */
    /* JADX WARN: Code duplicated, block: B:81:0x020f  */
    /* JADX WARN: Code duplicated, block: B:82:0x0216  */
    /* JADX WARN: Code duplicated, block: B:83:0x021d  */
    /* JADX WARN: Code duplicated, block: B:93:0x019f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x0231 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x005d A[SYNTHETIC] */
    public final void t(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferOrder;
        int i;
        byte b2;
        int i2;
        int i3;
        int i4;
        xl7.r(this.K == null);
        if (byteBuffer.hasRemaining()) {
            if (e.a(this.p)) {
                int iU = (int) n6b.U(n6b.N(20L), this.p.e.b, 1000000L, RoundingMode.UP);
                long j = j();
                long j2 = iU;
                if (j >= j2) {
                    byteBufferOrder = byteBuffer;
                } else {
                    e eVar = this.p;
                    int i5 = eVar.e.a;
                    int i6 = eVar.d;
                    int i7 = (int) j;
                    byteBufferOrder = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int iPosition = byteBuffer.position();
                    while (byteBuffer.hasRemaining() && i7 < iU) {
                        if (i5 != 2) {
                            if (i5 == 3) {
                                i3 = (byteBuffer.get() & MessagePack.Code.EXT_TIMESTAMP) << 24;
                            } else if (i5 == 4) {
                                float fH = n6b.h(byteBuffer.getFloat(), -1.0f, 1.0f);
                                i3 = (int) (fH < 0.0f ? (-fH) * (-2.1474836E9f) : fH * 2.1474836E9f);
                            } else if (i5 == 21) {
                                i = ((byteBuffer.get() & MessagePack.Code.EXT_TIMESTAMP) << 8) | ((byteBuffer.get() & MessagePack.Code.EXT_TIMESTAMP) << 16);
                                b2 = byteBuffer.get();
                            } else if (i5 != 22) {
                                if (i5 == 268435456) {
                                    i = (byteBuffer.get() & MessagePack.Code.EXT_TIMESTAMP) << 24;
                                    i2 = (byteBuffer.get() & MessagePack.Code.EXT_TIMESTAMP) << 16;
                                } else if (i5 == 1342177280) {
                                    i = ((byteBuffer.get() & MessagePack.Code.EXT_TIMESTAMP) << 24) | ((byteBuffer.get() & MessagePack.Code.EXT_TIMESTAMP) << 16);
                                    i2 = (byteBuffer.get() & MessagePack.Code.EXT_TIMESTAMP) << 8;
                                } else if (i5 == 1610612736) {
                                    i = ((byteBuffer.get() & MessagePack.Code.EXT_TIMESTAMP) << 24) | ((byteBuffer.get() & MessagePack.Code.EXT_TIMESTAMP) << 16) | ((byteBuffer.get() & MessagePack.Code.EXT_TIMESTAMP) << 8);
                                    i2 = byteBuffer.get() & MessagePack.Code.EXT_TIMESTAMP;
                                } else if (i5 != 1879048192) {
                                    d43.c();
                                    return;
                                } else {
                                    double dMax = Math.max(-1.0d, Math.min(byteBuffer.getDouble(), 1.0d));
                                    i3 = (int) (dMax < 0.0d ? (-dMax) * (-2.147483648E9d) : dMax * 2.147483647E9d);
                                }
                                i3 = i | i2;
                            } else {
                                i = (byteBuffer.get() & MessagePack.Code.EXT_TIMESTAMP) | ((byteBuffer.get() & MessagePack.Code.EXT_TIMESTAMP) << 8) | ((byteBuffer.get() & MessagePack.Code.EXT_TIMESTAMP) << 16);
                                b2 = byteBuffer.get();
                            }
                            i4 = (int) ((((long) i3) * ((long) i7)) / j2);
                            if (i5 != 2) {
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i5 != 3) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i5 != 4) {
                                if (i5 != 21) {
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                } else if (i5 != 22) {
                                    byteBufferOrder.put((byte) i4);
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                } else if (i5 != 268435456) {
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                } else if (i5 != 1342177280) {
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                } else if (i5 != 1610612736) {
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                    byteBufferOrder.put((byte) i4);
                                } else if (i5 == 1879048192) {
                                    d43.c();
                                    return;
                                } else if (i4 < 0) {
                                    byteBufferOrder.putDouble((-i4) / (-2.147483648E9d));
                                } else {
                                    byteBufferOrder.putDouble(((double) i4) / 2.147483647E9d);
                                }
                            } else if (i4 < 0) {
                                byteBufferOrder.putFloat((-i4) / (-2.1474836E9f));
                            } else {
                                byteBufferOrder.putFloat(i4 / 2.1474836E9f);
                            }
                            if (byteBuffer.position() == iPosition + i6) {
                                i7++;
                                iPosition = byteBuffer.position();
                            }
                        } else {
                            i = (byteBuffer.get() & MessagePack.Code.EXT_TIMESTAMP) << 16;
                            b2 = byteBuffer.get();
                        }
                        i2 = (b2 & MessagePack.Code.EXT_TIMESTAMP) << 24;
                        i3 = i | i2;
                        i4 = (int) ((((long) i3) * ((long) i7)) / j2);
                        if (i5 != 2) {
                            byteBufferOrder.put((byte) (i4 >> 16));
                            byteBufferOrder.put((byte) (i4 >> 24));
                        } else if (i5 != 3) {
                            byteBufferOrder.put((byte) (i4 >> 24));
                        } else if (i5 != 4) {
                            if (i5 != 21) {
                                byteBufferOrder.put((byte) (i4 >> 8));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i5 != 22) {
                                byteBufferOrder.put((byte) i4);
                                byteBufferOrder.put((byte) (i4 >> 8));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i5 != 268435456) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                                byteBufferOrder.put((byte) (i4 >> 16));
                            } else if (i5 != 1342177280) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 8));
                            } else if (i5 != 1610612736) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 8));
                                byteBufferOrder.put((byte) i4);
                            } else if (i5 == 1879048192) {
                                d43.c();
                                return;
                            } else if (i4 < 0) {
                                byteBufferOrder.putDouble((-i4) / (-2.147483648E9d));
                            } else {
                                byteBufferOrder.putDouble(((double) i4) / 2.147483647E9d);
                            }
                        } else if (i4 < 0) {
                            byteBufferOrder.putFloat((-i4) / (-2.1474836E9f));
                        } else {
                            byteBufferOrder.putFloat(i4 / 2.1474836E9f);
                        }
                        if (byteBuffer.position() == iPosition + i6) {
                            i7++;
                            iPosition = byteBuffer.position();
                        }
                    }
                    byteBufferOrder.put(byteBuffer);
                    byteBufferOrder.flip();
                }
            } else {
                byteBufferOrder = byteBuffer;
            }
            this.K = byteBufferOrder;
        }
    }

    public final boolean u() {
        e eVar = this.p;
        return eVar != null && eVar.e.j;
    }
}
