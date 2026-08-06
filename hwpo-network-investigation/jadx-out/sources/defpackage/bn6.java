package defpackage;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.media3.exoplayer.b;
import androidx.media3.exoplayer.d;
import androidx.media3.exoplayer.l;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bn6 extends in6 implements zm6 {
    public final Context b1;
    public final h90 c1;
    public final dq2 d1;
    public final jf6 e1;
    public int f1;
    public boolean g1;
    public id4 h1;
    public id4 i1;
    public long j1;
    public boolean k1;
    public boolean l1;
    public boolean m1;
    public boolean n1;
    public int o1;
    public boolean p1;
    public long q1;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class a {
        public a() {
        }

        public final void a(final Exception exc) {
            md6.e("MediaCodecAudioRenderer", "Audio sink error", exc);
            final h90 h90Var = bn6.this.c1;
            Handler handler = h90Var.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: c90
                    @Override // java.lang.Runnable
                    public final void run() {
                        d.b bVar = h90Var.b;
                        String str = n6b.a;
                        d.this.s.S(exc);
                    }
                });
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn6(Context context, an6.b bVar, Handler handler, d.b bVar2, dq2 dq2Var) {
        super(context.getApplicationContext(), 1, bVar, 44100.0f);
        jf6 jf6Var = Build.VERSION.SDK_INT >= 35 ? new jf6() : null;
        this.b1 = context.getApplicationContext();
        this.d1 = dq2Var;
        this.e1 = jf6Var;
        this.o1 = -1000;
        this.c1 = new h90(handler, bVar2);
        this.q1 = -9223372036854775807L;
    }

    @Override // defpackage.in6
    public final void A0() throws lo3 {
        try {
            dq2 dq2Var = this.d1;
            if (!dq2Var.L && dq2Var.n() && dq2Var.e()) {
                if (!dq2Var.M) {
                    dq2Var.M = true;
                    if (dq2Var.t.k()) {
                        dq2Var.N = false;
                    }
                    dq2Var.t.stop();
                }
                dq2Var.L = true;
            }
            long j = this.R0.f;
            if (j != -9223372036854775807L) {
                this.q1 = j;
            }
        } catch (m90 e) {
            throw G(e, e.v, e.u, this.A0 ? 5003 : 5002);
        }
    }

    @Override // defpackage.in6, androidx.media3.exoplayer.a
    public final void H() {
        h90 h90Var = this.c1;
        this.l1 = true;
        this.h1 = null;
        this.q1 = -9223372036854775807L;
        this.n1 = false;
        try {
            this.d1.f();
            try {
                super.H();
            } finally {
                h90Var.a(this.Q0);
            }
        } catch (Throwable th) {
            try {
                super.H();
                throw th;
            } finally {
                h90Var.a(this.Q0);
            }
        }
    }

    @Override // androidx.media3.exoplayer.a
    public final void I(boolean z, boolean z2) {
        final ln2 ln2Var = new ln2();
        this.Q0 = ln2Var;
        final h90 h90Var = this.c1;
        Handler handler = h90Var.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: a90
                @Override // java.lang.Runnable
                public final void run() {
                    d.b bVar = h90Var.b;
                    String str = n6b.a;
                    d.this.s.e0(ln2Var);
                }
            });
        }
        mn8 mn8Var = this.w;
        mn8Var.getClass();
        boolean z3 = mn8Var.b;
        dq2 dq2Var = this.d1;
        if (z3) {
            xl7.r(dq2Var.P);
            if (!dq2Var.V) {
                dq2Var.V = true;
                dq2Var.q();
            }
        } else if (dq2Var.V) {
            dq2Var.V = false;
            dq2Var.q();
        }
        x38 x38Var = this.y;
        x38Var.getClass();
        dq2Var.m = x38Var;
        vf1 vf1Var = this.z;
        vf1Var.getClass();
        dq2Var.r.f(vf1Var);
        dq2Var.n = new a();
    }

    @Override // defpackage.in6, androidx.media3.exoplayer.a
    public final void J(long j, boolean z, boolean z2) {
        super.J(j, z, z2);
        this.d1.f();
        this.j1 = j;
        this.q1 = -9223372036854775807L;
        this.m1 = false;
        this.n1 = false;
        this.k1 = true;
    }

    @Override // androidx.media3.exoplayer.a
    public final void K() {
        jf6 jf6Var;
        this.d1.r.a();
        if (Build.VERSION.SDK_INT < 35 || (jf6Var = this.e1) == null) {
            return;
        }
        jf6Var.b();
    }

    @Override // defpackage.in6
    public final boolean K0(id4 id4Var) {
        mn8 mn8Var = this.w;
        mn8Var.getClass();
        if (mn8Var.a != 0) {
            int iP0 = P0(id4Var);
            if ((iP0 & 512) != 0) {
                mn8 mn8Var2 = this.w;
                mn8Var2.getClass();
                if (mn8Var2.a == 2 || (iP0 & 1024) != 0 || (id4Var.J == 0 && id4Var.K == 0)) {
                    return true;
                }
            }
        }
        return this.d1.h(id4Var) != 0;
    }

    @Override // androidx.media3.exoplayer.a
    public final void L() {
        dq2 dq2Var = this.d1;
        this.m1 = false;
        this.n1 = false;
        this.q1 = -9223372036854775807L;
        try {
            try {
                this.A0 = false;
                B0();
                z0();
                i83 i83Var = this.a0;
                if (i83Var != null) {
                    i83Var.c(null);
                }
                this.a0 = null;
                if (this.l1) {
                    this.l1 = false;
                    dq2Var.r();
                }
            } catch (Throwable th) {
                i83 i83Var2 = this.a0;
                if (i83Var2 != null) {
                    i83Var2.c(null);
                }
                this.a0 = null;
                throw th;
            }
        } catch (Throwable th2) {
            if (this.l1) {
                this.l1 = false;
                dq2Var.r();
            }
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    /* JADX WARN: Code duplicated, block: B:47:0x00af  */
    @Override // defpackage.in6
    public final int L0(ra raVar, id4 id4Var) {
        int iP0;
        ul8 ul8VarG;
        boolean z;
        boolean z2;
        int iR = l.r(1, 0, 0, 0);
        String str = id4Var.o;
        String str2 = id4Var.o;
        if (!fv6.i(str)) {
            return l.r(0, 0, 0, 0);
        }
        int i = id4Var.P;
        boolean z3 = i != 0;
        boolean z4 = i == 0 || i == 2;
        int i2 = 8;
        dq2 dq2Var = this.d1;
        if (z4) {
            if (z3) {
                List listE = mn6.e(false, "audio/raw", false);
                if ((listE.isEmpty() ? null : (en6) listE.get(0)) == null) {
                    iP0 = 0;
                }
            }
            iP0 = P0(id4Var);
            if (dq2Var.h(id4Var) != 0) {
                return l.r(4, 8, 32, iP0);
            }
        } else {
            iP0 = 0;
        }
        if ("audio/raw".equals(str2) && dq2Var.h(id4Var) == 0) {
            return iR;
        }
        int i3 = id4Var.G;
        int i4 = id4Var.H;
        id4.a aVar = new id4.a();
        aVar.n = fv6.n("audio/raw");
        aVar.F = i3;
        aVar.G = i4;
        aVar.H = 2;
        if (dq2Var.h(new id4(aVar)) == 0) {
            return iR;
        }
        if (str2 == null) {
            ul8VarG = ul8.x;
        } else if (dq2Var.h(id4Var) != 0) {
            List listE2 = mn6.e(false, "audio/raw", false);
            en6 en6Var = listE2.isEmpty() ? null : (en6) listE2.get(0);
            if (en6Var != null) {
                ul8VarG = k95.v(en6Var);
            } else {
                ul8VarG = mn6.g(raVar, id4Var, false, false);
            }
        } else {
            ul8VarG = mn6.g(raVar, id4Var, false, false);
        }
        if (ul8VarG.isEmpty()) {
            return iR;
        }
        if (!z4) {
            return l.r(2, 0, 0, 0);
        }
        en6 en6Var2 = (en6) ul8VarG.get(0);
        Context context = this.b1;
        boolean zE = en6Var2.e(context, id4Var);
        if (!zE) {
            int i5 = 1;
            while (true) {
                if (i5 >= ul8VarG.w) {
                    z = zE;
                    z2 = true;
                    break;
                }
                en6 en6Var3 = (en6) ul8VarG.get(i5);
                if (en6Var3.e(context, id4Var)) {
                    z2 = false;
                    en6Var2 = en6Var3;
                    z = true;
                    break;
                }
                i5++;
            }
        } else {
            z = zE;
            z2 = true;
            break;
        }
        int i6 = z ? 4 : 3;
        if (z && en6Var2.f(id4Var)) {
            i2 = 16;
        }
        return (en6Var2.g ? 64 : 0) | i6 | i2 | 32 | (z2 ? 128 : 0) | iP0;
    }

    @Override // androidx.media3.exoplayer.a
    public final void M() {
        this.d1.o();
        this.p1 = true;
    }

    @Override // androidx.media3.exoplayer.a
    public final void N() {
        Q0();
        this.p1 = false;
        dq2 dq2Var = this.d1;
        dq2Var.O = false;
        if (dq2Var.n()) {
            dq2Var.t.b();
        }
        this.n1 = false;
    }

    public final int P0(id4 id4Var) {
        k80 k80VarA;
        dq2 dq2Var = this.d1;
        if (dq2Var.X) {
            k80VarA = k80.d;
        } else {
            m80.c cVarB = dq2Var.r.b(dq2Var.g(id4Var));
            k80.a aVar = new k80.a();
            aVar.a = cVarB.a;
            aVar.b = cVarB.b;
            aVar.c = cVarB.c;
            k80VarA = aVar.a();
        }
        if (!k80VarA.a) {
            return 0;
        }
        int i = k80VarA.b ? 1536 : 512;
        return k80VarA.c ? i | AudioConstants.AUDIO_FILE_BUFFER_SIZE : i;
    }

    public final void Q0() {
        long j;
        long jMax;
        long j2;
        d();
        final dq2 dq2Var = this.d1;
        dq2.f fVar = dq2Var.b;
        if (!dq2Var.n() || dq2Var.F) {
            j = Long.MIN_VALUE;
            jMax = Long.MIN_VALUE;
        } else {
            long jMin = Math.min(dq2Var.t.g(), n6b.S(dq2Var.p.e.b, dq2Var.j()));
            ArrayDeque<dq2.g> arrayDeque = dq2Var.h;
            while (!arrayDeque.isEmpty() && jMin >= arrayDeque.getFirst().c) {
                dq2Var.w = arrayDeque.remove();
            }
            dq2.g gVar = dq2Var.w;
            long jU = jMin - gVar.c;
            long jY = n6b.y(gVar.a.a, jU);
            if (arrayDeque.isEmpty()) {
                dw9 dw9Var = fVar.c;
                if (!dw9Var.h()) {
                    j = Long.MIN_VALUE;
                } else if (dw9Var.n >= 1024) {
                    long j3 = dw9Var.m;
                    cw9 cw9Var = dw9Var.j;
                    cw9Var.getClass();
                    long jO = j3 - ((long) (cw9Var.i.o() * (cw9Var.j * cw9Var.b)));
                    int i = dw9Var.h.a;
                    int i2 = dw9Var.g.a;
                    j = Long.MIN_VALUE;
                    long j4 = dw9Var.n;
                    jU = i == i2 ? n6b.U(jU, jO, j4, RoundingMode.DOWN) : n6b.U(jU, jO * ((long) i), j4 * ((long) i2), RoundingMode.DOWN);
                } else {
                    j = Long.MIN_VALUE;
                    jU = (long) (((double) dw9Var.c) * jU);
                }
                dq2.g gVar2 = dq2Var.w;
                j2 = gVar2.b + jU;
                gVar2.d = jU - jY;
            } else {
                j = Long.MIN_VALUE;
                dq2.g gVar3 = dq2Var.w;
                j2 = gVar3.b + jY + gVar3.d;
            }
            long j5 = fVar.b.q;
            jMax = n6b.S(dq2Var.p.e.b, j5) + j2;
            long j6 = dq2Var.Z;
            if (j5 > j6) {
                long jS = n6b.S(dq2Var.p.e.b, j5 - j6);
                dq2Var.Z = j5;
                dq2Var.a0 += jS;
                if (dq2Var.b0 == null) {
                    dq2Var.b0 = new Handler(Looper.myLooper());
                }
                dq2Var.b0.removeCallbacksAndMessages(null);
                dq2Var.b0.postDelayed(new Runnable() { // from class: bq2
                    @Override // java.lang.Runnable
                    public final void run() {
                        dq2 dq2Var2 = dq2Var;
                        if (dq2Var2.a0 >= AudioConstants.MAX_RECORDING_DURATION_MS) {
                            bn6.this.m1 = true;
                            dq2Var2.a0 = 0L;
                        }
                    }
                }, 100L);
            }
        }
        if (jMax != j) {
            if (!this.k1) {
                jMax = Math.max(this.j1, jMax);
            }
            this.j1 = jMax;
            this.k1 = false;
        }
    }

    @Override // defpackage.in6
    public final pn2 T(en6 en6Var, id4 id4Var, id4 id4Var2, boolean z) {
        pn2 pn2VarB = en6Var.b(id4Var, id4Var2);
        int i = pn2VarB.e;
        if (this.a0 == null && K0(id4Var2)) {
            i |= 32768;
        }
        "OMX.google.raw.decoder".equals(en6Var.a);
        if (id4Var2.p > this.f1) {
            i |= 64;
        }
        int i2 = i;
        return new pn2(en6Var.a, id4Var, id4Var2, i2 != 0 ? 0 : pn2VarB.d, i2);
    }

    @Override // androidx.media3.exoplayer.k
    public final boolean b() {
        return this.d1.l();
    }

    @Override // defpackage.in6
    public final float b0(float f, id4 id4Var, id4[] id4VarArr) {
        int iMax = -1;
        for (id4 id4Var2 : id4VarArr) {
            int i = id4Var2.H;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f;
    }

    @Override // defpackage.zm6
    public final void c(k28 k28Var) {
        dq2 dq2Var = this.d1;
        if (dq2Var.u()) {
            dq2Var.x = k28Var;
            if (dq2Var.n()) {
                dq2Var.t.c(dq2Var.x);
                dq2Var.x = dq2Var.t.e();
                return;
            }
            return;
        }
        k28 k28Var2 = new k28(n6b.h(k28Var.a, 0.1f, 8.0f), n6b.h(k28Var.b, 0.1f, 8.0f));
        dq2Var.x = k28Var2;
        dq2.g gVar = new dq2.g(k28Var2, -9223372036854775807L, -9223372036854775807L);
        if (dq2Var.n()) {
            dq2Var.v = gVar;
        } else {
            dq2Var.w = gVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    @Override // defpackage.in6
    public final ArrayList c0(ra raVar, id4 id4Var, boolean z) {
        ul8 ul8VarG;
        if (id4Var.o == null) {
            ul8VarG = ul8.x;
        } else if (this.d1.h(id4Var) != 0) {
            List listE = mn6.e(false, "audio/raw", false);
            en6 en6Var = listE.isEmpty() ? null : (en6) listE.get(0);
            if (en6Var != null) {
                ul8VarG = k95.v(en6Var);
            } else {
                ul8VarG = mn6.g(raVar, id4Var, z, false);
            }
        } else {
            ul8VarG = mn6.g(raVar, id4Var, z, false);
        }
        HashMap<mn6.a, List<en6>> map = mn6.a;
        ArrayList arrayList = new ArrayList(ul8VarG);
        Collections.sort(arrayList, new ln6(new kn6(this.b1, id4Var)));
        return arrayList;
    }

    @Override // androidx.media3.exoplayer.a, androidx.media3.exoplayer.k
    public final boolean d() {
        if (!this.M0) {
            return false;
        }
        dq2 dq2Var = this.d1;
        if (dq2Var.n()) {
            return dq2Var.L && !dq2Var.l();
        }
        return true;
    }

    @Override // defpackage.in6
    public final long d0(long j, long j2, boolean z) {
        long jU;
        dq2 dq2Var = this.d1;
        boolean z2 = dq2Var.l() && this.q1 != -9223372036854775807L;
        if (this.p1) {
            if (!dq2Var.n()) {
                jU = -9223372036854775807L;
            } else if (dq2.e.a(dq2Var.p)) {
                jU = n6b.S(dq2Var.p.e.b, dq2Var.t.o());
            } else {
                long jO = dq2Var.t.o();
                int iB = ms3.b(dq2Var.p.e.a);
                xl7.r(iB != -2147483647);
                jU = n6b.U(jO, 1000000L, iB, RoundingMode.DOWN);
            }
            if (this.n1 && z2 && jU != -9223372036854775807L) {
                float fMin = Math.min(jU, this.q1 - j);
                k28 k28Var = dq2Var.x;
                return Math.max(10000L, (long) ((fMin / (k28Var != null ? k28Var.a : 1.0f)) / 2.0f));
            }
        } else if (z2 || this.M0) {
            return 1000000L;
        }
        return 10000L;
    }

    @Override // defpackage.zm6
    public final k28 e() {
        return this.d1.x;
    }

    @Override // defpackage.in6
    public final an6.a f0(en6 en6Var, id4 id4Var, MediaCrypto mediaCrypto, float f) {
        int iIntValue;
        int i;
        Integer num;
        id4[] id4VarArr = this.C;
        id4VarArr.getClass();
        String str = en6Var.a;
        "OMX.google.raw.decoder".equals(str);
        int iMax = id4Var.p;
        String str2 = id4Var.o;
        int i2 = id4Var.G;
        int i3 = 0;
        if (id4VarArr.length != 1) {
            for (id4 id4Var2 : id4VarArr) {
                if (en6Var.b(id4Var, id4Var2).d != 0) {
                    "OMX.google.raw.decoder".equals(str);
                    iMax = Math.max(iMax, id4Var2.p);
                }
            }
        }
        this.f1 = iMax;
        this.g1 = str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        String str3 = en6Var.c;
        int i4 = this.f1;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str3);
        mediaFormat.setInteger("channel-count", i2);
        int i5 = id4Var.H;
        mediaFormat.setInteger("sample-rate", i5);
        tn6.b(mediaFormat, id4Var.r);
        tn6.a(mediaFormat, "max-input-size", i4);
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if ("audio/ac4".equals(str2)) {
            Pair<Integer, Integer> pairB = og1.b(id4Var);
            if (pairB != null) {
                tn6.a(mediaFormat, "profile", ((Integer) pairB.first).intValue());
                tn6.a(mediaFormat, "level", ((Integer) pairB.second).intValue());
            }
            if (Build.VERSION.SDK_INT <= 28) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        id4.a aVar = new id4.a();
        aVar.n = fv6.n("audio/raw");
        aVar.F = i2;
        aVar.G = i5;
        aVar.H = 4;
        id4 id4Var3 = new id4(aVar);
        dq2 dq2Var = this.d1;
        if (dq2Var.h(id4Var3) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i6 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.o1));
        }
        id4 id4Var4 = null;
        if (Objects.equals(str2, "audio/iamf")) {
            m80 m80Var = dq2Var.r;
            u70 u70Var = m80Var instanceof da0 ? ((da0) m80Var).h : null;
            if (u70Var == null) {
                md6.g("MediaCodecAudioRenderer", "AudioCapabilities from the AudioSink are null, using default stereo output layout.");
                mediaFormat.setInteger("channel-mask", 12);
                mediaFormat.setInteger("max-output-channel-count", 2);
            } else {
                q95<Integer> q95Var = a65.a;
                k95<Integer> k95Var = u70Var.d;
                int size = k95Var.size();
                int i7 = 0;
                do {
                    if (i7 >= size) {
                        iIntValue = 0;
                        break;
                    }
                    Integer num2 = k95Var.get(i7);
                    i7++;
                    num = num2;
                    iIntValue = num.intValue();
                } while (!a65.a.contains(num));
                if (iIntValue != 0) {
                    i = iIntValue;
                } else {
                    k95<Integer> k95Var2 = u70Var.c;
                    int size2 = k95Var2.size();
                    int i8 = 0;
                    while (i8 < size2) {
                        Integer num3 = k95Var2.get(i8);
                        i8++;
                        Integer num4 = num3;
                        int iIntValue2 = num4.intValue();
                        if (a65.a.contains(num4)) {
                            i3 = iIntValue2;
                            break;
                        }
                    }
                    i = i3 != 0 ? i3 : 12;
                }
                int iBitCount = Integer.bitCount(i);
                mediaFormat.setInteger("channel-mask", i);
                mediaFormat.setInteger("max-output-channel-count", iBitCount);
            }
        }
        R(mediaFormat);
        if ("audio/raw".equals(en6Var.b) && !"audio/raw".equals(str2)) {
            id4Var4 = id4Var;
        }
        this.i1 = id4Var4;
        return new an6.a(en6Var, mediaFormat, id4Var, null, mediaCrypto, this.e1);
    }

    @Override // defpackage.zm6
    public final long g() {
        if (this.A == 2) {
            Q0();
        }
        return this.j1;
    }

    @Override // defpackage.in6
    public final void g0(nn2 nn2Var) {
        id4 id4Var;
        dq2.e eVar;
        if (Build.VERSION.SDK_INT < 29 || (id4Var = nn2Var.u) == null || !Objects.equals(id4Var.o, "audio/opus") || !this.A0) {
            return;
        }
        ByteBuffer byteBuffer = nn2Var.z;
        byteBuffer.getClass();
        id4 id4Var2 = nn2Var.u;
        id4Var2.getClass();
        int i = id4Var2.J;
        if (byteBuffer.remaining() == 8) {
            int i2 = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
            dq2 dq2Var = this.d1;
            l80 l80Var = dq2Var.t;
            if (l80Var == null || !l80Var.k() || (eVar = dq2Var.p) == null || !eVar.e.k) {
                return;
            }
            dq2Var.t.j(i, i2);
        }
    }

    @Override // androidx.media3.exoplayer.k, androidx.media3.exoplayer.l
    public final String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // defpackage.in6
    public final void m0(final Exception exc) {
        md6.e("MediaCodecAudioRenderer", "Audio codec error", exc);
        final h90 h90Var = this.c1;
        Handler handler = h90Var.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: u80
                @Override // java.lang.Runnable
                public final void run() {
                    d.b bVar = h90Var.b;
                    String str = n6b.a;
                    d.this.s.W(exc);
                }
            });
        }
    }

    @Override // defpackage.in6
    public final void n0(final long j, final long j2, final String str) {
        final h90 h90Var = this.c1;
        Handler handler = h90Var.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: y80
                @Override // java.lang.Runnable
                public final void run() {
                    d.b bVar = h90Var.b;
                    String str2 = n6b.a;
                    d.this.s.i0(j, j2, str);
                }
            });
        }
    }

    @Override // defpackage.in6
    public final void o0(final b bVar) {
        final h90 h90Var = this.c1;
        Handler handler = h90Var.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: g90
                @Override // java.lang.Runnable
                public final void run() {
                    d.b bVar2 = h90Var.b;
                    String str = n6b.a;
                    d.a.a(d.this.F, bVar);
                }
            });
        }
    }

    @Override // defpackage.in6
    public final void p0(final String str) {
        final h90 h90Var = this.c1;
        Handler handler = h90Var.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: z80
                @Override // java.lang.Runnable
                public final void run() {
                    d.b bVar = h90Var.b;
                    String str2 = n6b.a;
                    d.this.s.B(str);
                }
            });
        }
    }

    @Override // defpackage.in6
    public final pn2 q0(jd4 jd4Var) {
        final id4 id4Var = jd4Var.b;
        id4Var.getClass();
        this.h1 = id4Var;
        final pn2 pn2VarQ0 = super.q0(jd4Var);
        final h90 h90Var = this.c1;
        Handler handler = h90Var.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: d90
                @Override // java.lang.Runnable
                public final void run() {
                    d.b bVar = h90Var.b;
                    String str = n6b.a;
                    d.this.s.M(id4Var, pn2VarQ0);
                }
            });
        }
        return pn2VarQ0;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00e1 A[Catch: j90 -> 0x00df, TryCatch #0 {j90 -> 0x00df, blocks: (B:36:0x00bf, B:39:0x00c7, B:41:0x00cb, B:43:0x00d4, B:46:0x00e1, B:47:0x00e4), top: B:51:0x00bf }] */
    @Override // defpackage.in6
    public final void r0(id4 id4Var, MediaFormat mediaFormat) throws lo3 {
        int iZ;
        id4 id4Var2 = this.i1;
        int[] iArr = null;
        if (id4Var2 != null) {
            id4Var = id4Var2;
        } else if (this.g0 != null) {
            mediaFormat.getClass();
            if ("audio/raw".equals(id4Var.o)) {
                iZ = id4Var.I;
            } else if (mediaFormat.containsKey("pcm-encoding")) {
                iZ = mediaFormat.getInteger("pcm-encoding");
            } else {
                iZ = mediaFormat.containsKey("v-bits-per-sample") ? n6b.z(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN) : 2;
            }
            id4.a aVar = new id4.a();
            aVar.n = fv6.n("audio/raw");
            aVar.H = iZ;
            aVar.I = id4Var.J;
            aVar.J = id4Var.K;
            aVar.k = id4Var.l;
            aVar.a = id4Var.a;
            aVar.b = id4Var.b;
            aVar.c = k95.q(id4Var.c);
            aVar.d = id4Var.d;
            aVar.e = id4Var.e;
            aVar.f = id4Var.f;
            aVar.F = mediaFormat.getInteger("channel-count");
            aVar.G = mediaFormat.getInteger("sample-rate");
            id4Var = new id4(aVar);
            if (this.g1) {
                int i = id4Var.G;
                if (i == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
            }
        }
        try {
            int i2 = Build.VERSION.SDK_INT;
            dq2 dq2Var = this.d1;
            if (i2 >= 29) {
                if (this.A0) {
                    mn8 mn8Var = this.w;
                    mn8Var.getClass();
                    if (mn8Var.a != 0) {
                        mn8 mn8Var2 = this.w;
                        mn8Var2.getClass();
                        dq2Var.s(mn8Var2.a);
                    } else {
                        dq2Var.s(0);
                    }
                } else {
                    dq2Var.s(0);
                }
            }
            dq2Var.c(id4Var, iArr);
        } catch (j90 e) {
            throw G(e, e.t, false, 5001);
        }
    }

    @Override // defpackage.in6
    public final void s0(long j) {
        this.d1.getClass();
    }

    @Override // defpackage.in6
    public final void u0() {
        this.d1.E = true;
    }

    @Override // defpackage.zm6
    public final boolean w() {
        boolean z = this.m1;
        this.m1 = false;
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    @Override // defpackage.in6
    public final boolean x0(long j, long j2, an6 an6Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, id4 id4Var) throws lo3 {
        int i4;
        int i5;
        byteBuffer.getClass();
        this.q1 = -9223372036854775807L;
        if (this.i1 != null && (i2 & 2) != 0) {
            an6Var.getClass();
            an6Var.e(i);
            return true;
        }
        dq2 dq2Var = this.d1;
        if (z) {
            if (an6Var != null) {
                an6Var.e(i);
            }
            this.Q0.f += i3;
            dq2Var.E = true;
            return true;
        }
        try {
            if (!dq2Var.k(i3, j3, byteBuffer)) {
                this.q1 = j3;
                return false;
            }
            if (an6Var != null) {
                an6Var.e(i);
            }
            this.Q0.e += i3;
            return true;
        } catch (k90 e) {
            id4 id4Var2 = this.h1;
            if (this.A0) {
                mn8 mn8Var = this.w;
                mn8Var.getClass();
                if (mn8Var.a != 0) {
                    i5 = 5004;
                } else {
                    i5 = 5001;
                }
            } else {
                i5 = 5001;
            }
            throw G(e, id4Var2, e.t, i5);
        } catch (m90 e2) {
            if (this.A0) {
                mn8 mn8Var2 = this.w;
                mn8Var2.getClass();
                if (mn8Var2.a != 0) {
                    i4 = 5003;
                } else {
                    i4 = 5002;
                }
            } else {
                i4 = 5002;
            }
            throw G(e2, id4Var, e2.u, i4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x0085  */
    @Override // defpackage.in6, androidx.media3.exoplayer.a, androidx.media3.exoplayer.j.b
    public final void y(int i, Object obj) {
        jf6 jf6Var;
        dq2 dq2Var = this.d1;
        if (i == 2) {
            obj.getClass();
            float fFloatValue = ((Float) obj).floatValue();
            if (dq2Var.H != fFloatValue) {
                dq2Var.H = fFloatValue;
                if (dq2Var.n()) {
                    dq2Var.t.m(dq2Var.H);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 3) {
            q70 q70Var = (q70) obj;
            q70Var.getClass();
            if (dq2Var.u.equals(q70Var)) {
                return;
            }
            dq2Var.u = q70Var;
            if (dq2Var.V) {
                return;
            }
            dq2Var.q();
            return;
        }
        if (i == 6) {
            rf0 rf0Var = (rf0) obj;
            rf0Var.getClass();
            if (dq2Var.S.equals(rf0Var)) {
                return;
            }
            if (dq2Var.t != null) {
                dq2Var.S.getClass();
            }
            dq2Var.S = rf0Var;
            return;
        }
        if (i == 12) {
            AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
            dq2Var.T = audioDeviceInfo;
            l80 l80Var = dq2Var.t;
            if (l80Var != null) {
                l80Var.setPreferredDevice(audioDeviceInfo);
                return;
            }
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.o1 = ((Integer) obj).intValue();
            an6 an6Var = this.g0;
            if (an6Var != null && Build.VERSION.SDK_INT >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.o1));
                an6Var.b(bundle);
                return;
            }
            return;
        }
        if (i == 9) {
            obj.getClass();
            dq2Var.y = ((Boolean) obj).booleanValue();
            dq2.g gVar = new dq2.g(dq2Var.u() ? k28.d : dq2Var.x, -9223372036854775807L, -9223372036854775807L);
            if (dq2Var.n()) {
                dq2Var.v = gVar;
                return;
            } else {
                dq2Var.w = gVar;
                return;
            }
        }
        if (i == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (dq2Var.R) {
                if (dq2Var.Q == iIntValue) {
                    dq2Var.R = false;
                    if (dq2Var.Q != iIntValue) {
                        dq2Var.Q = iIntValue;
                        dq2Var.P = iIntValue != 0;
                        dq2Var.q();
                    }
                }
            } else if (dq2Var.Q != iIntValue) {
                dq2Var.Q = iIntValue;
                dq2Var.P = iIntValue != 0;
                dq2Var.q();
            }
            if (Build.VERSION.SDK_INT < 35 || (jf6Var = this.e1) == null) {
                return;
            }
            jf6Var.d(iIntValue);
            return;
        }
        if (i == 19) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            dq2Var.getClass();
            if (iIntValue2 == 0 || iIntValue2 == -1) {
                iIntValue2 = -1;
            }
            if (dq2Var.U == iIntValue2) {
                return;
            }
            dq2Var.U = iIntValue2;
            dq2Var.q();
            return;
        }
        if (i != 20) {
            super.y(i, obj);
            return;
        }
        obj.getClass();
        m80 m80Var = (m80) obj;
        if (m80Var.equals(dq2Var.r)) {
            return;
        }
        dq2Var.r.a();
        dq2Var.r = m80Var;
        aq2 aq2Var = dq2Var.s;
        if (aq2Var != null) {
            m80Var.d(aq2Var);
        }
        dq2Var.q();
    }

    @Override // androidx.media3.exoplayer.a, androidx.media3.exoplayer.k
    public final zm6 E() {
        return this;
    }
}
