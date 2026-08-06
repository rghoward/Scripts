package androidx.media3.exoplayer;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import androidx.media3.exoplayer.e;
import androidx.media3.exoplayer.j;
import defpackage.a89;
import defpackage.b8a;
import defpackage.ba0;
import defpackage.bd9;
import defpackage.bo9;
import defpackage.bq6;
import defpackage.bv1;
import defpackage.cj0;
import defpackage.co6;
import defpackage.cp3;
import defpackage.ds2;
import defpackage.e80;
import defpackage.ez9;
import defpackage.fq3;
import defpackage.fs2;
import defpackage.fv6;
import defpackage.g85;
import defpackage.gsa;
import defpackage.h4c;
import defpackage.hq2;
import defpackage.i28;
import defpackage.i83;
import defpackage.id4;
import defpackage.j28;
import defpackage.k28;
import defpackage.k3a;
import defpackage.k95;
import defpackage.kt4;
import defpackage.lf2;
import defpackage.lo3;
import defpackage.m48;
import defpackage.mb6;
import defpackage.md6;
import defpackage.mn8;
import defpackage.msa;
import defpackage.n48;
import defpackage.n6b;
import defpackage.nn8;
import defpackage.nsa;
import defpackage.op1;
import defpackage.q70;
import defpackage.ri;
import defpackage.sa;
import defpackage.su6;
import defpackage.toa;
import defpackage.u89;
import defpackage.ul8;
import defpackage.un0;
import defpackage.up6;
import defpackage.ut7;
import defpackage.vf1;
import defpackage.vp6;
import defpackage.wp6;
import defpackage.x38;
import defpackage.xl7;
import defpackage.xz8;
import defpackage.z7a;
import defpackage.z97;
import defpackage.zeb;
import defpackage.zm6;
import io.ably.lib.util.Crypto;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Handler.Callback, up6.a, j.a, zeb {
    public static final long A0 = n6b.Z(10000);
    public final kt4 A;
    public final j28 B;
    public final Looper C;
    public final toa.c D;
    public final toa.b E;
    public final long F;
    public final boolean G;
    public final fs2 H;
    public final ArrayList<d> I;
    public final vf1 J;
    public final ba0 K;
    public final h L;
    public final i M;
    public final mb6 N;
    public final long O;
    public final x38 P;
    public final ri Q;
    public final kt4 R;
    public final boolean S;
    public final e80 T;
    public final boolean U;
    public u89 V;
    public boolean X;
    public boolean Y;
    public g Z;
    public int a0;
    public i28 b0;
    public C0022e c0;
    public boolean d0;
    public boolean f0;
    public boolean g0;
    public boolean i0;
    public int j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public boolean n0;
    public int o0;
    public g p0;
    public long q0;
    public long r0;
    public int s0;
    public final nn8[] t;
    public boolean t0;
    public final l[] u;
    public lo3 u0;
    public final boolean[] v;
    public final msa w;
    public ExoPlayer.c w0;
    public final nsa x;
    public final androidx.media3.exoplayer.f y;
    public boolean y0;
    public final cj0 z;
    public long x0 = -9223372036854775807L;
    public boolean e0 = false;
    public float z0 = 1.0f;
    public a89 W = a89.b;
    public long v0 = -9223372036854775807L;
    public long h0 = -9223372036854775807L;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements k.a {
        public a() {
        }

        @Override // androidx.media3.exoplayer.k.a
        public final void a() {
            e.this.m0 = true;
        }

        @Override // androidx.media3.exoplayer.k.a
        public final void b() {
            e eVar = e.this;
            if (eVar.X) {
                eVar.W.getClass();
            } else if (!eVar.n0) {
                return;
            }
            eVar.A.k(2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public final ArrayList a;
        public final bo9 b;
        public final int c;
        public final long d;

        public b() {
            throw null;
        }

        public b(ArrayList arrayList, bo9 bo9Var, int i, long j) {
            this.a = arrayList;
            this.b = bo9Var;
            this.c = i;
            this.d = j;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class c {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d implements Comparable<d> {
        @Override // java.lang.Comparable
        public final int compareTo(d dVar) {
            dVar.getClass();
            return 0;
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class C0022e {
        public boolean a;
        public i28 b;
        public int c;
        public boolean d;
        public int e;

        public C0022e(i28 i28Var) {
            this.b = i28Var;
        }

        public final void a(int i) {
            this.a |= i > 0;
            this.c += i;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class f {
        public final bq6.b a;
        public final long b;
        public final long c;
        public final boolean d;
        public final boolean e;
        public final boolean f;
        public final boolean g;
        public final boolean h;
        public final int i;

        public f(bq6.b bVar, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
            this.a = bVar;
            this.b = j;
            this.c = j2;
            this.d = z;
            this.e = z2;
            this.f = z3;
            this.g = z4;
            this.h = z5;
            this.i = i;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class g {
        public final toa a;
        public final int b;
        public final long c;

        public g(toa toaVar, int i, long j) {
            this.a = toaVar;
            this.b = i;
            this.c = j;
        }
    }

    public e(Context context, k[] kVarArr, k[] kVarArr2, msa msaVar, nsa nsaVar, androidx.media3.exoplayer.f fVar, cj0 cj0Var, int i, boolean z, ri riVar, u89 u89Var, ds2 ds2Var, long j, Looper looper, z7a z7aVar, ba0 ba0Var, x38 x38Var, ExoPlayer.c cVar, final zeb zebVar, boolean z2) {
        Looper looper2;
        this.K = ba0Var;
        this.w = msaVar;
        this.x = nsaVar;
        this.y = fVar;
        this.z = cj0Var;
        this.j0 = i;
        this.k0 = z;
        this.V = u89Var;
        this.N = ds2Var;
        this.O = j;
        boolean z3 = false;
        this.J = z7aVar;
        this.P = x38Var;
        this.w0 = cVar;
        this.Q = riVar;
        this.U = z2;
        this.F = fVar.g();
        this.G = fVar.b();
        toa.a aVar = toa.a;
        i28 i28VarK = i28.k(nsaVar);
        this.b0 = i28VarK;
        this.c0 = new C0022e(i28VarK);
        this.u = new l[kVarArr.length];
        this.v = new boolean[kVarArr.length];
        l.a aVarB = msaVar.b();
        this.t = new nn8[kVarArr.length];
        boolean z4 = false;
        for (int i2 = 0; i2 < kVarArr.length; i2++) {
            kVarArr[i2].t(i2, x38Var, z7aVar);
            this.u[i2] = kVarArr[i2].u();
            if (aVarB != null) {
                androidx.media3.exoplayer.a aVar2 = (androidx.media3.exoplayer.a) this.u[i2];
                synchronized (aVar2.t) {
                    aVar2.K = aVarB;
                }
            }
            k kVar = kVarArr2[i2];
            if (kVar != null) {
                kVar.t(i2, x38Var, z7aVar);
                z4 = true;
            }
            this.t[i2] = new nn8(kVarArr[i2], kVarArr2[i2], i2);
        }
        this.S = z4;
        this.H = new fs2(this, z7aVar);
        this.I = new ArrayList<>();
        this.D = new toa.c();
        this.E = new toa.b();
        xl7.r(msaVar.a == null);
        msaVar.a = this;
        msaVar.b = cj0Var;
        this.t0 = true;
        b8a b8aVarB = z7aVar.b(looper, null);
        this.R = b8aVarB;
        this.L = new h(riVar, b8aVarB, new op1(this), cVar);
        this.M = new i(this, riVar, b8aVarB, x38Var);
        j28 j28Var = new j28();
        this.B = j28Var;
        synchronized (j28Var.a) {
            try {
                if (j28Var.b == null) {
                    if (j28Var.d == 0 && j28Var.c == null) {
                        z3 = true;
                    }
                    xl7.r(z3);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    j28Var.c = handlerThread;
                    handlerThread.start();
                    j28Var.b = j28Var.c.getLooper();
                }
                j28Var.d++;
                looper2 = j28Var.b;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.C = looper2;
        b8a b8aVarB2 = z7aVar.b(looper2, this);
        this.A = b8aVarB2;
        this.T = new e80(context, looper2, this);
        b8aVarB2.m(35, new zeb() { // from class: bq3
            @Override // defpackage.zeb
            public final void f(long j2, long j3, id4 id4Var, MediaFormat mediaFormat) {
                zebVar.f(j2, j3, id4Var, mediaFormat);
                this.t.f(j2, j3, id4Var, mediaFormat);
            }
        }).b();
        b8aVarB2.m(39, new g85() { // from class: cq3
            @Override // defpackage.g85
            public final void a() {
                e eVar = this.a;
                if (eVar.Y) {
                    eVar.A.f(37).b();
                }
            }
        }).b();
    }

    public static Pair<Object, Long> S(toa toaVar, g gVar, boolean z, int i, boolean z2, toa.c cVar, toa.b bVar) {
        int iT;
        toa toaVar2 = gVar.a;
        if (toaVar.p()) {
            return null;
        }
        toa toaVar3 = toaVar2.p() ? toaVar : toaVar2;
        try {
            Pair<Object, Long> pairI = toaVar3.i(cVar, bVar, gVar.b, gVar.c);
            if (!toaVar.equals(toaVar3)) {
                if (toaVar.b(pairI.first) == -1) {
                    if (!z || (iT = T(cVar, bVar, i, z2, pairI.first, toaVar3, toaVar)) == -1) {
                        return null;
                    }
                    return toaVar.i(cVar, bVar, iT, -9223372036854775807L);
                }
                if (toaVar3.g(pairI.first, bVar).f && toaVar3.m(bVar.c, cVar, 0L).n == toaVar3.b(pairI.first)) {
                    return toaVar.i(cVar, bVar, toaVar.g(pairI.first, bVar).c, gVar.c);
                }
            }
            return pairI;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static int T(toa.c cVar, toa.b bVar, int i, boolean z, Object obj, toa toaVar, toa toaVar2) {
        toa toaVar3 = toaVar;
        Object obj2 = toaVar3.m(toaVar3.g(obj, bVar).c, cVar, 0L).a;
        for (int i2 = 0; i2 < toaVar2.o(); i2++) {
            if (toaVar2.m(i2, cVar, 0L).a.equals(obj2)) {
                return i2;
            }
        }
        int iB = toaVar3.b(obj);
        int iH = toaVar3.h();
        int iB2 = -1;
        int i3 = 0;
        while (i3 < iH && iB2 == -1) {
            toa toaVar4 = toaVar3;
            int iD = toaVar4.d(iB, bVar, cVar, i, z);
            if (iD == -1) {
                break;
            }
            iB2 = toaVar2.b(toaVar4.l(iD));
            i3++;
            toaVar3 = toaVar4;
            iB = iD;
        }
        if (iB2 == -1) {
            return -1;
        }
        return toaVar2.f(iB2, bVar, false).c;
    }

    public static boolean z(vp6 vp6Var) {
        if (vp6Var != null) {
            try {
                up6 up6Var = vp6Var.a;
                if (vp6Var.e) {
                    for (xz8 xz8Var : vp6Var.c) {
                        if (xz8Var != null) {
                            xz8Var.a();
                        }
                    }
                } else {
                    up6Var.g();
                }
                if ((!vp6Var.e ? 0L : up6Var.e()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public final boolean A(int i, bq6.b bVar) {
        h hVar = this.L;
        vp6 vp6Var = hVar.l;
        if (vp6Var != null && vp6Var.g.a.equals(bVar)) {
            nn8 nn8Var = this.t[i];
            vp6 vp6Var2 = hVar.l;
            int i2 = nn8Var.d;
            boolean z = (i2 == 2 || i2 == 4) && nn8Var.c(vp6Var2) == nn8Var.a;
            boolean z2 = nn8Var.d == 3 && nn8Var.c(vp6Var2) == nn8Var.c;
            if (z || z2) {
                return true;
            }
        }
        return false;
    }

    public final void A0(int i, int i2, int i3, boolean z) {
        boolean z2 = z && i != -1;
        if (i == -1) {
            i3 = 2;
        } else if (i3 == 2) {
            i3 = 1;
        }
        boolean z3 = this.X;
        if (i == 0) {
            i2 = 1;
        } else if (i2 == 1) {
            i2 = z3 ? 4 : 0;
        }
        i28 i28Var = this.b0;
        if (i28Var.l == z2 && i28Var.n == i2 && i28Var.m == i3) {
            return;
        }
        this.b0 = i28Var.e(i3, z2, i2);
        D0(false, false);
        h hVar = this.L;
        for (vp6 vp6Var = hVar.j; vp6Var != null; vp6Var = vp6Var.m) {
            for (fq3 fq3Var : vp6Var.o.c) {
                if (fq3Var != null) {
                    fq3Var.n(z2);
                }
            }
        }
        if (!r0()) {
            v0();
            B0();
            i28 i28Var2 = this.b0;
            if (i28Var2.p) {
                this.b0 = i28Var2.i(false);
            }
            hVar.m(this.q0);
            return;
        }
        int i4 = this.b0.e;
        kt4 kt4Var = this.A;
        if (i4 != 3) {
            if (i4 == 2) {
                kt4Var.k(2);
                return;
            }
            return;
        }
        fs2 fs2Var = this.H;
        fs2Var.y = true;
        ez9 ez9Var = fs2Var.t;
        if (!ez9Var.u) {
            ez9Var.w = ez9Var.t.c();
            ez9Var.u = true;
        }
        t0();
        kt4Var.k(2);
    }

    public final boolean B() {
        vp6 vp6Var = this.L.j;
        long j = vp6Var.g.f;
        if (vp6Var.e) {
            return j == -9223372036854775807L || this.b0.s < j || !r0();
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00e7  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void B0() {
        long j;
        int i;
        boolean z;
        k28 k28VarE;
        float f2;
        vp6 vp6Var = this.L.j;
        if (vp6Var == null) {
            return;
        }
        long jL = vp6Var.e ? vp6Var.a.l() : -9223372036854775807L;
        if (jL != -9223372036854775807L) {
            if (!vp6Var.g()) {
                this.L.o(vp6Var);
                u(false);
                C();
            }
            Q(jL, true);
            if (jL != this.b0.s) {
                i28 i28Var = this.b0;
                j = -9223372036854775807L;
                i = 1;
                z = false;
                this.b0 = y(i28Var.b, jL, i28Var.c, jL, true, 5);
            } else {
                j = -9223372036854775807L;
                i = 1;
                z = false;
            }
        } else {
            j = -9223372036854775807L;
            i = 1;
            z = false;
            fs2 fs2Var = this.H;
            Object[] objArr = vp6Var != this.L.k;
            ez9 ez9Var = fs2Var.t;
            k kVar = fs2Var.v;
            if (kVar == null || kVar.d() || ((objArr == true && fs2Var.v.getState() != 2) || (!fs2Var.v.b() && (objArr == true || fs2Var.v.k())))) {
                fs2Var.x = true;
                if (fs2Var.y && !ez9Var.u) {
                    ez9Var.w = ez9Var.t.c();
                    ez9Var.u = true;
                }
            } else {
                zm6 zm6Var = fs2Var.w;
                zm6Var.getClass();
                long jG = zm6Var.g();
                if (!fs2Var.x) {
                    ez9Var.a(jG);
                    k28VarE = zm6Var.e();
                    if (!k28VarE.equals(ez9Var.x)) {
                        ez9Var.c(k28VarE);
                        fs2Var.u.A.m(16, k28VarE).b();
                    }
                } else if (jG >= ez9Var.g()) {
                    fs2Var.x = false;
                    if (fs2Var.y && !ez9Var.u) {
                        ez9Var.w = ez9Var.t.c();
                        ez9Var.u = true;
                    }
                    ez9Var.a(jG);
                    k28VarE = zm6Var.e();
                    if (!k28VarE.equals(ez9Var.x)) {
                        ez9Var.c(k28VarE);
                        fs2Var.u.A.m(16, k28VarE).b();
                    }
                } else if (ez9Var.u) {
                    ez9Var.a(ez9Var.g());
                    ez9Var.u = false;
                }
            }
            long jG2 = fs2Var.g();
            this.q0 = jG2;
            long j2 = jG2 - vp6Var.p;
            long j3 = this.b0.s;
            if (!this.I.isEmpty() && !this.b0.b.b()) {
                if (this.t0) {
                    j3--;
                    this.t0 = false;
                }
                i28 i28Var2 = this.b0;
                int iB = i28Var2.a.b(i28Var2.b.a);
                int iMin = Math.min(this.s0, this.I.size());
                d dVar = iMin > 0 ? this.I.get(iMin - 1) : null;
                while (dVar != null && (iB < 0 || (iB == 0 && 0 > j3))) {
                    int i2 = iMin - 1;
                    dVar = i2 > 0 ? this.I.get(iMin - 2) : null;
                    iMin = i2;
                }
                if (iMin < this.I.size()) {
                    this.I.get(iMin);
                }
                this.s0 = iMin;
            }
            if (this.H.w()) {
                boolean z2 = !this.c0.d;
                i28 i28Var3 = this.b0;
                this.b0 = y(i28Var3.b, j2, i28Var3.c, j2, z2, 6);
            } else {
                i28 i28Var4 = this.b0;
                i28Var4.s = j2;
                i28Var4.t = SystemClock.elapsedRealtime();
            }
        }
        this.b0.q = this.L.m.d();
        i28 i28Var5 = this.b0;
        i28Var5.r = p(i28Var5.q);
        i28 i28Var6 = this.b0;
        if (i28Var6.l && i28Var6.e == 3 && s0(i28Var6.a, i28Var6.b)) {
            i28 i28Var7 = this.b0;
            float f3 = 1.0f;
            if (i28Var7.o.a == 1.0f) {
                mb6 mb6Var = this.N;
                long jM = m(i28Var7.a, i28Var7.b.a, i28Var7.s);
                long j4 = this.b0.r;
                ds2 ds2Var = (ds2) mb6Var;
                int i3 = i;
                boolean z3 = z;
                if (ds2Var.c != j) {
                    long j5 = jM - j4;
                    long j6 = ds2Var.m;
                    if (j6 == j) {
                        ds2Var.m = j5;
                        ds2Var.n = 0L;
                    } else {
                        long jMax = Math.max(j5, (long) ((j5 * 9.999871E-4f) + (j6 * 0.999f)));
                        ds2Var.m = jMax;
                        ds2Var.n = (long) ((9.999871E-4f * Math.abs(j5 - jMax)) + (0.999f * ds2Var.n));
                    }
                    if (ds2Var.l == j || SystemClock.elapsedRealtime() - ds2Var.l >= 1000) {
                        ds2Var.l = SystemClock.elapsedRealtime();
                        long j7 = (ds2Var.n * 3) + ds2Var.m;
                        if (ds2Var.h > j7) {
                            float fN = n6b.N(1000L);
                            long j8 = ((long) ((ds2Var.k - 1.0f) * fN)) + ((long) ((ds2Var.i - 1.0f) * fN));
                            long j9 = ds2Var.e;
                            f2 = 1.0E-7f;
                            long j10 = ds2Var.h - j8;
                            long[] jArr = new long[3];
                            jArr[z3 ? 1 : 0] = j7;
                            jArr[i3] = j9;
                            jArr[2] = j10;
                            long j11 = jArr[z3 ? 1 : 0];
                            for (int i4 = i3; i4 < 3; i4++) {
                                long j12 = jArr[i4];
                                if (j12 > j11) {
                                    j11 = j12;
                                }
                            }
                            ds2Var.h = j11;
                        } else {
                            f2 = 1.0E-7f;
                            long j13 = n6b.j(jM - ((long) (Math.max(0.0f, ds2Var.k - 1.0f) / 1.0E-7f)), ds2Var.h, j7);
                            ds2Var.h = j13;
                            long j14 = ds2Var.g;
                            if (j14 != j && j13 > j14) {
                                ds2Var.h = j14;
                            }
                        }
                        long j15 = jM - ds2Var.h;
                        if (Math.abs(j15) < ds2Var.a) {
                            ds2Var.k = 1.0f;
                        } else {
                            ds2Var.k = n6b.h((f2 * j15) + 1.0f, ds2Var.j, ds2Var.i);
                        }
                        f3 = ds2Var.k;
                    } else {
                        f3 = ds2Var.k;
                    }
                }
                if (this.H.e().a != f3) {
                    k28 k28Var = new k28(f3, this.b0.o.b);
                    this.A.l(16);
                    this.H.c(k28Var);
                    x(this.b0.o, this.H.e().a, z3, z3);
                }
            }
        }
    }

    public final void C() {
        boolean zC;
        if (z(this.L.m)) {
            vp6 vp6Var = this.L.m;
            long jP = p(!vp6Var.e ? 0L : vp6Var.a.e());
            vp6 vp6Var2 = this.L.j;
            long j = this.q0;
            long j2 = vp6Var.p;
            if (vp6Var != vp6Var2) {
                j -= j2;
                j2 = vp6Var.g.b;
            }
            long j3 = j - j2;
            long j4 = s0(this.b0.a, vp6Var.g.a) ? ((ds2) this.N).h : -9223372036854775807L;
            x38 x38Var = this.P;
            toa toaVar = this.b0.a;
            bq6.b bVar = vp6Var.g.a;
            float f2 = this.H.e().a;
            boolean z = this.b0.l;
            androidx.media3.exoplayer.f.a aVar = new androidx.media3.exoplayer.f.a(x38Var, toaVar, bVar, j3, jP, f2, this.g0, j4);
            zC = this.y.c(aVar);
            vp6 vp6Var3 = this.L.j;
            if (!zC && vp6Var3.e && jP < 500000 && (this.F > 0 || this.G)) {
                vp6Var3.a.s(this.b0.s, false);
                zC = this.y.c(aVar);
            }
        } else {
            zC = false;
        }
        this.i0 = zC;
        if (zC) {
            vp6 vp6Var4 = this.L.m;
            vp6Var4.getClass();
            androidx.media3.exoplayer.g.a aVar2 = new androidx.media3.exoplayer.g.a();
            aVar2.a = this.q0 - vp6Var4.p;
            float f3 = this.H.e().a;
            xl7.g(f3 > 0.0f || f3 == -3.4028235E38f);
            aVar2.b = f3;
            long j5 = this.h0;
            xl7.g(j5 >= 0 || j5 == -9223372036854775807L);
            aVar2.c = j5;
            androidx.media3.exoplayer.g gVar = new androidx.media3.exoplayer.g(aVar2);
            xl7.r(vp6Var4.m == null);
            vp6Var4.a.c(gVar);
        }
        w0();
    }

    public final void C0(toa toaVar, bq6.b bVar, toa toaVar2, bq6.b bVar2, long j, boolean z) {
        boolean zS0 = s0(toaVar, bVar);
        Object obj = bVar.a;
        if (!zS0) {
            k28 k28Var = bVar.b() ? k28.d : this.b0.o;
            fs2 fs2Var = this.H;
            if (fs2Var.e().equals(k28Var)) {
                return;
            }
            this.A.l(16);
            fs2Var.c(k28Var);
            x(this.b0.o, k28Var.a, false, false);
            return;
        }
        toa.b bVar3 = this.E;
        int i = toaVar.g(obj, bVar3).c;
        toa.c cVar = this.D;
        toaVar.n(i, cVar);
        co6.e eVar = cVar.j;
        ds2 ds2Var = (ds2) this.N;
        ds2Var.getClass();
        ds2Var.c = n6b.N(eVar.a);
        ds2Var.f = n6b.N(eVar.b);
        ds2Var.g = n6b.N(eVar.c);
        float f2 = eVar.d;
        if (f2 == -3.4028235E38f) {
            f2 = 0.97f;
        }
        ds2Var.j = f2;
        float f3 = eVar.e;
        if (f3 == -3.4028235E38f) {
            f3 = 1.03f;
        }
        ds2Var.i = f3;
        if (f2 == 1.0f && f3 == 1.0f) {
            ds2Var.c = -9223372036854775807L;
        }
        ds2Var.a();
        if (j != -9223372036854775807L) {
            ds2Var.d = m(toaVar, obj, j);
            ds2Var.a();
            return;
        }
        if (!Objects.equals(!toaVar2.p() ? toaVar2.m(toaVar2.g(bVar2.a, bVar3).c, cVar, 0L).a : null, cVar.a) || z) {
            ds2Var.d = -9223372036854775807L;
            ds2Var.a();
        }
    }

    public final void D() {
        h hVar = this.L;
        hVar.k();
        vp6 vp6Var = hVar.n;
        if (vp6Var != null) {
            up6 up6Var = vp6Var.a;
            if ((!vp6Var.d || vp6Var.e) && !up6Var.j()) {
                toa toaVar = this.b0.a;
                if (vp6Var.e) {
                    up6Var.q();
                }
                if (this.y.d()) {
                    if (!vp6Var.d) {
                        long j = vp6Var.g.b;
                        vp6Var.d = true;
                        up6Var.m(this, j);
                        return;
                    }
                    androidx.media3.exoplayer.g.a aVar = new androidx.media3.exoplayer.g.a();
                    aVar.a = this.q0 - vp6Var.p;
                    float f2 = this.H.e().a;
                    xl7.g(f2 > 0.0f || f2 == -3.4028235E38f);
                    aVar.b = f2;
                    long j2 = this.h0;
                    xl7.g(j2 >= 0 || j2 == -9223372036854775807L);
                    aVar.c = j2;
                    androidx.media3.exoplayer.g gVar = new androidx.media3.exoplayer.g(aVar);
                    xl7.r(vp6Var.m == null);
                    up6Var.c(gVar);
                }
            }
        }
    }

    public final void D0(boolean z, boolean z2) {
        this.g0 = z;
        this.h0 = (!z || z2) ? -9223372036854775807L : this.J.c();
    }

    public final void E() {
        C0022e c0022e = this.c0;
        i28 i28Var = this.b0;
        int i = 0;
        boolean z = c0022e.a | (c0022e.b != i28Var);
        c0022e.a = z;
        c0022e.b = i28Var;
        if (z) {
            androidx.media3.exoplayer.d dVar = (androidx.media3.exoplayer.d) this.K.a;
            dVar.j.e(new cp3(i, dVar, c0022e));
            this.c0 = new C0022e(this.b0);
        }
    }

    public final void F(int i) {
        nn8 nn8Var = this.t[i];
        try {
            vp6 vp6Var = this.L.j;
            vp6Var.getClass();
            k kVarC = nn8Var.c(vp6Var);
            kVarC.getClass();
            kVarC.A();
        } catch (IOException | RuntimeException e) {
            int iF = nn8Var.a.F();
            if (iF != 3 && iF != 5) {
                throw e;
            }
            nsa nsaVar = this.L.j.o;
            md6.e("ExoPlayerImplInternal", "Disabling track due to error: ".concat(id4.c(nsaVar.c[i].r())), e);
            nsa nsaVar2 = new nsa((mn8[]) nsaVar.b.clone(), (fq3[]) nsaVar.c.clone(), nsaVar.d, nsaVar.e);
            nsaVar2.b[i] = null;
            nsaVar2.c[i] = null;
            i(i);
            vp6 vp6Var2 = this.L.j;
            vp6Var2.a(nsaVar2, this.b0.s, false, new boolean[vp6Var2.j.length]);
        }
    }

    public final void G(final int i, final boolean z) {
        boolean[] zArr = this.v;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.R.e(new Runnable() { // from class: aq3
                @Override // java.lang.Runnable
                public final void run() {
                    e eVar = this.t;
                    ri riVar = eVar.Q;
                    nn8[] nn8VarArr = eVar.t;
                    int i2 = i;
                    riVar.I(i2, z, nn8VarArr[i2].a.F());
                }
            });
        }
    }

    public final void H() throws Throwable {
        v(this.M.b(), true);
    }

    public final void I(c cVar) throws Throwable {
        this.c0.a(1);
        cVar.getClass();
        i iVar = this.M;
        xl7.g(iVar.b.size() >= 0);
        iVar.j = null;
        v(iVar.b(), false);
    }

    public final void J() {
        this.c0.a(1);
        O(false, false, false, true);
        this.y.h(this.P);
        n0(this.b0.a.p() ? 4 : 2);
        i28 i28Var = this.b0;
        boolean z = i28Var.l;
        A0(this.T.d(i28Var.e, z), i28Var.n, i28Var.m, z);
        hq2 hq2VarB = this.z.b();
        i iVar = this.M;
        ArrayList arrayList = iVar.b;
        xl7.r(!iVar.k);
        iVar.l = hq2VarB;
        for (int i = 0; i < arrayList.size(); i++) {
            i.c cVar = (i.c) arrayList.get(i);
            iVar.e(cVar);
            iVar.g.add(cVar);
        }
        iVar.k = true;
        this.A.k(2);
    }

    public final void K(bv1 bv1Var) {
        j28 j28Var = this.B;
        kt4 kt4Var = this.A;
        try {
            O(true, false, true, false);
            L();
            this.y.e(this.P);
            e80 e80Var = this.T;
            e80Var.c = null;
            e80Var.a();
            e80Var.c(0);
            this.w.d();
            n0(1);
        } finally {
            kt4Var.g();
            j28Var.a();
            bv1Var.c();
        }
    }

    public final void L() {
        for (int i = 0; i < this.t.length; i++) {
            androidx.media3.exoplayer.a aVar = (androidx.media3.exoplayer.a) this.u[i];
            synchronized (aVar.t) {
                aVar.K = null;
            }
            nn8 nn8Var = this.t[i];
            nn8Var.a.a();
            nn8Var.e = false;
            k kVar = nn8Var.c;
            if (kVar != null) {
                kVar.a();
                nn8Var.f = false;
            }
        }
    }

    public final void M(int i, int i2, bo9 bo9Var) throws Throwable {
        this.c0.a(1);
        i iVar = this.M;
        iVar.getClass();
        xl7.g(i >= 0 && i <= i2 && i2 <= iVar.b.size());
        iVar.j = bo9Var;
        iVar.g(i, i2);
        v(iVar.b(), false);
    }

    /* JADX WARN: Code duplicated, block: B:78:0x016c  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    public final void N() {
        int i;
        int i2;
        float f2 = this.H.e().a;
        h hVar = this.L;
        vp6 vp6Var = hVar.j;
        vp6 vp6Var2 = hVar.k;
        nsa nsaVar = null;
        vp6 vp6Var3 = vp6Var;
        boolean z = true;
        while (vp6Var3 != null && vp6Var3.e) {
            i28 i28Var = this.b0;
            nsa nsaVarJ = vp6Var3.j(f2, i28Var.a, i28Var.l);
            nsa nsaVar2 = vp6Var3 == this.L.j ? nsaVarJ : nsaVar;
            nsa nsaVar3 = vp6Var3.o;
            fq3[] fq3VarArr = nsaVarJ.c;
            if (nsaVar3 != null && nsaVar3.c.length == fq3VarArr.length) {
                int i3 = 0;
                while (true) {
                    if (i3 >= fq3VarArr.length) {
                        if (vp6Var3 == vp6Var2) {
                            z = false;
                        }
                        vp6Var3 = vp6Var3.m;
                        nsaVar = nsaVar2;
                    } else if (nsaVarJ.a(nsaVar3, i3)) {
                        i3++;
                    }
                }
            }
            h hVar2 = this.L;
            if (!z) {
                i = 4;
                hVar2.o(vp6Var3);
                if (vp6Var3.e) {
                    long jMax = Math.max(vp6Var3.g.b, this.q0 - vp6Var3.p);
                    if (this.S && e() && this.L.l == vp6Var3) {
                        h();
                    }
                    i2 = 4;
                    vp6Var3.a(nsaVarJ, jMax, false, new boolean[vp6Var3.j.length]);
                }
                u(true);
                if (this.b0.e != i2) {
                    C();
                    B0();
                    this.A.k(2);
                    return;
                }
                return;
            }
            vp6 vp6Var4 = hVar2.j;
            boolean z2 = (hVar2.o(vp6Var4) & 1) != 0;
            boolean[] zArr = new boolean[this.t.length];
            nsaVar2.getClass();
            long jA = vp6Var4.a(nsaVar2, this.b0.s, z2, zArr);
            i28 i28Var2 = this.b0;
            boolean z3 = (i28Var2.e == 4 || jA == i28Var2.s) ? false : true;
            i28 i28Var3 = this.b0;
            i = 4;
            this.b0 = y(i28Var3.b, jA, i28Var3.c, i28Var3.d, z3, 5);
            if (z3) {
                Q(jA, true);
            }
            h();
            boolean[] zArr2 = new boolean[this.t.length];
            int i4 = 0;
            while (true) {
                nn8[] nn8VarArr = this.t;
                if (i4 >= nn8VarArr.length) {
                    break;
                }
                int iB = nn8VarArr[i4].b();
                zArr2[i4] = this.t[i4].f();
                nn8 nn8Var = this.t[i4];
                xz8 xz8Var = vp6Var4.c[i4];
                fs2 fs2Var = this.H;
                long j = this.q0;
                boolean z4 = zArr[i4];
                k kVar = nn8Var.a;
                if (nn8.g(kVar)) {
                    if (xz8Var != kVar.z()) {
                        nn8Var.a(kVar, fs2Var);
                    } else if (z4) {
                        kVar.q(j, true);
                    }
                }
                k kVar2 = nn8Var.c;
                if (kVar2 != null && nn8.g(kVar2)) {
                    if (xz8Var != kVar2.z()) {
                        nn8Var.a(kVar2, fs2Var);
                    } else if (z4) {
                        kVar2.q(j, true);
                    }
                }
                if (iB - this.t[i4].b() > 0) {
                    G(i4, false);
                }
                this.o0 -= iB - this.t[i4].b();
                i4++;
            }
            l(zArr2, this.q0);
            vp6Var4.h = true;
            i2 = i;
            u(true);
            if (this.b0.e != i2) {
                C();
                B0();
                this.A.k(2);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x009d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0137  */
    /* JADX WARN: Code duplicated, block: B:64:0x013c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0141  */
    /* JADX WARN: Code duplicated, block: B:68:0x0146  */
    /* JADX WARN: Code duplicated, block: B:70:0x014b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0150  */
    /* JADX WARN: Code duplicated, block: B:74:0x0157  */
    /* JADX WARN: Code duplicated, block: B:77:0x017e  */
    /* JADX WARN: Code duplicated, block: B:79:0x0188  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a2  */
    public final void O(boolean z, boolean z2, boolean z3, boolean z4) {
        long j;
        long j2;
        long j3;
        boolean z5;
        toa n48Var;
        bq6.b bVar;
        i28 i28Var;
        gsa gsaVar;
        nsa nsaVar;
        List list;
        h hVar;
        this.A.l(2);
        this.Y = false;
        if (this.Z != null) {
            this.c0.a(1);
            this.Z = null;
        }
        this.u0 = null;
        D0(false, true);
        fs2 fs2Var = this.H;
        fs2Var.y = false;
        ez9 ez9Var = fs2Var.t;
        if (ez9Var.u) {
            ez9Var.a(ez9Var.g());
            ez9Var.u = false;
        }
        this.q0 = 1000000000000L;
        for (int i = 0; i < this.t.length; i++) {
            try {
                i(i);
            } catch (RuntimeException e) {
                e = e;
                md6.e("ExoPlayerImplInternal", "Disable failed.", e);
            } catch (lo3 e2) {
                e = e2;
                md6.e("ExoPlayerImplInternal", "Disable failed.", e);
            }
        }
        this.x0 = -9223372036854775807L;
        if (z) {
            for (nn8 nn8Var : this.t) {
                try {
                    nn8Var.j();
                } catch (RuntimeException e3) {
                    md6.e("ExoPlayerImplInternal", "Reset failed.", e3);
                }
            }
        }
        this.o0 = 0;
        i28 i28Var2 = this.b0;
        bq6.b bVar2 = i28Var2.b;
        long j4 = i28Var2.s;
        if (this.b0.b.b()) {
            j = this.b0.c;
        } else {
            i28 i28Var3 = this.b0;
            toa.b bVar3 = this.E;
            bq6.b bVar4 = i28Var3.b;
            toa toaVar = i28Var3.a;
            if (toaVar.p() || toaVar.g(bVar4.a, bVar3).f) {
                j = this.b0.c;
            } else {
                j = this.b0.s;
            }
        }
        if (z2) {
            this.p0 = null;
            Pair<bq6.b, Long> pairO = o(this.b0.a);
            bVar2 = (bq6.b) pairO.first;
            long jLongValue = ((Long) pairO.second).longValue();
            z5 = bVar2.equals(this.b0.b) ? false : true;
            j2 = jLongValue;
            j3 = -9223372036854775807L;
        } else {
            j2 = j4;
            j3 = j;
            z5 = false;
        }
        this.L.b();
        this.i0 = false;
        toa toaVar2 = this.b0.a;
        if (z3 && (toaVar2 instanceof n48)) {
            n48 n48Var2 = (n48) toaVar2;
            bo9 bo9Var = this.M.j;
            toa[] toaVarArr = n48Var2.i;
            toa[] toaVarArr2 = new toa[toaVarArr.length];
            for (int i2 = 0; i2 < toaVarArr.length; i2++) {
                toaVarArr2[i2] = new m48(toaVarArr[i2]);
            }
            n48Var = new n48(toaVarArr2, n48Var2.j, bo9Var);
            if (bVar2.b != -1) {
                n48Var.g(bVar2.a, this.E);
                int i3 = this.E.c;
                toa.c cVar = this.D;
                n48Var.m(i3, cVar, 0L);
                if (cVar.a()) {
                    bVar = new bq6.b(bVar2.d, bVar2.a);
                }
            }
            i28Var = this.b0;
            int i4 = i28Var.e;
            lo3 lo3Var = z4 ? null : i28Var.f;
            if (z5) {
                gsaVar = gsa.d;
            } else {
                gsaVar = i28Var.h;
            }
            gsa gsaVar2 = gsaVar;
            if (z5) {
                nsaVar = this.x;
            } else {
                nsaVar = i28Var.i;
            }
            nsa nsaVar2 = nsaVar;
            if (z5) {
                k95.b bVar5 = k95.u;
                list = ul8.x;
            } else {
                list = i28Var.j;
            }
            this.b0 = new i28(n48Var, bVar, j3, j2, i4, lo3Var, false, gsaVar2, nsaVar2, list, bVar, i28Var.l, i28Var.m, i28Var.n, i28Var.o, j2, 0L, j2, 0L, false);
            if (z3) {
                hVar = this.L;
                if (!hVar.r.isEmpty()) {
                    hVar.n(new ArrayList());
                }
                i iVar = this.M;
                HashMap<i.c, i.b> map = iVar.f;
                for (i.b bVar6 : map.values()) {
                    try {
                        bVar6.a.i(bVar6.b);
                    } catch (RuntimeException e4) {
                        md6.e("MediaSourceList", "Failed to release child source.", e4);
                    }
                    bq6 bq6Var = bVar6.a;
                    i.a aVar = bVar6.c;
                    bq6Var.b(aVar);
                    bVar6.a.f(aVar);
                }
                map.clear();
                iVar.g.clear();
                iVar.k = false;
            }
        }
        n48Var = toaVar2;
        bVar = bVar2;
        i28Var = this.b0;
        int i5 = i28Var.e;
        lo3 lo3Var2 = z4 ? null : i28Var.f;
        if (z5) {
            gsaVar = gsa.d;
        } else {
            gsaVar = i28Var.h;
        }
        gsa gsaVar3 = gsaVar;
        if (z5) {
            nsaVar = this.x;
        } else {
            nsaVar = i28Var.i;
        }
        nsa nsaVar3 = nsaVar;
        if (z5) {
            k95.b bVar7 = k95.u;
            list = ul8.x;
        } else {
            list = i28Var.j;
        }
        this.b0 = new i28(n48Var, bVar, j3, j2, i5, lo3Var2, false, gsaVar3, nsaVar3, list, bVar, i28Var.l, i28Var.m, i28Var.n, i28Var.o, j2, 0L, j2, 0L, false);
        if (z3) {
            hVar = this.L;
            if (!hVar.r.isEmpty()) {
                hVar.n(new ArrayList());
            }
            i iVar2 = this.M;
            HashMap<i.c, i.b> map2 = iVar2.f;
            while (r4.hasNext()) {
                bVar6.a.i(bVar6.b);
                bq6 bq6Var2 = bVar6.a;
                i.a aVar2 = bVar6.c;
                bq6Var2.b(aVar2);
                bVar6.a.f(aVar2);
            }
            map2.clear();
            iVar2.g.clear();
            iVar2.k = false;
        }
    }

    public final void P() {
        vp6 vp6Var = this.L.j;
        this.f0 = vp6Var != null && vp6Var.g.j && this.e0;
    }

    public final void Q(long j, boolean z) {
        vp6 vp6Var = this.L.j;
        long j2 = j + (vp6Var == null ? 1000000000000L : vp6Var.p);
        this.q0 = j2;
        this.H.t.a(j2);
        for (nn8 nn8Var : this.t) {
            long j3 = this.q0;
            k kVarC = nn8Var.c(vp6Var);
            if (kVarC != null) {
                kVarC.q(j3, z);
            }
        }
        for (vp6 vp6Var2 = r0.j; vp6Var2 != null; vp6Var2 = vp6Var2.m) {
            for (fq3 fq3Var : vp6Var2.o.c) {
                if (fq3Var != null) {
                    fq3Var.w();
                }
            }
        }
    }

    public final void R(toa toaVar, toa toaVar2) {
        if (toaVar.p() && toaVar2.p()) {
            return;
        }
        ArrayList<d> arrayList = this.I;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            arrayList.get(size).getClass();
            throw null;
        }
    }

    public final void U(long j) {
        boolean z;
        if (this.X) {
            this.W.getClass();
            z = true;
        } else {
            z = false;
        }
        i28 i28Var = this.b0;
        long jMin = 1000;
        long j2 = A0;
        if (z) {
            jMin = i28Var.e != 3 ? j2 : 1000L;
            for (nn8 nn8Var : this.t) {
                long j3 = this.q0;
                long j4 = this.r0;
                k kVar = nn8Var.c;
                k kVar2 = nn8Var.a;
                long jL = nn8.g(kVar2) ? kVar2.l(j3, j4) : Long.MAX_VALUE;
                if (kVar != null && kVar.getState() != 0) {
                    jL = Math.min(jL, kVar.l(j3, j4));
                }
                jMin = Math.min(jMin, n6b.Z(jL));
            }
            if (this.b0.m()) {
                vp6 vp6Var = this.L.j;
                vp6 vp6Var2 = vp6Var != null ? vp6Var.m : null;
                if (vp6Var2 != null) {
                    if ((n6b.N(jMin) * this.b0.o.a) + this.q0 >= vp6Var2.e()) {
                        jMin = Math.min(jMin, j2);
                    }
                }
            }
        } else if (i28Var.e != 3 || r0()) {
            jMin = j2;
        }
        this.A.h(j + jMin);
    }

    public final void V(boolean z) {
        bq6.b bVar = this.L.j.g.a;
        long jX = X(bVar, this.b0.s, true, false);
        if (jX != this.b0.s) {
            i28 i28Var = this.b0;
            this.b0 = y(bVar, jX, i28Var.c, i28Var.d, z, 5);
        }
    }

    public final void W(g gVar) throws Throwable {
        long jLongValue;
        long jMax;
        bq6.b bVarQ;
        long j;
        boolean z;
        long j2;
        long j3;
        long jF;
        bq6.b bVar;
        long j4;
        long j5;
        i28 i28Var;
        int i;
        int i2;
        long j6;
        e eVar = this;
        if (eVar.Y) {
            if (eVar.Z != null) {
                eVar.a0++;
                eVar.c0.a(1);
            }
            eVar.Z = gVar;
            return;
        }
        eVar.c0.a(1);
        Pair<Object, Long> pairS = S(eVar.b0.a, gVar, true, eVar.j0, eVar.k0, eVar.D, eVar.E);
        if (pairS == null) {
            Pair<bq6.b, Long> pairO = eVar.o(eVar.b0.a);
            bVarQ = (bq6.b) pairO.first;
            jLongValue = ((Long) pairO.second).longValue();
            z = !eVar.b0.a.p();
            j = 0;
            jMax = -9223372036854775807L;
        } else {
            Object obj = pairS.first;
            jLongValue = ((Long) pairS.second).longValue();
            jMax = gVar.c == -9223372036854775807L ? -9223372036854775807L : jLongValue;
            bVarQ = eVar.L.q(eVar.b0.a, obj, jLongValue);
            if (bVarQ.b()) {
                eVar.b0.a.g(bVarQ.a, eVar.E);
                if (eVar.E.e(bVarQ.b) == bVarQ.c) {
                    eVar.E.g.getClass();
                }
                eVar.E.g.a(bVarQ.b).getClass();
                jMax = Math.max(jMax, 0L);
                jLongValue = 0;
                j = 0;
            } else {
                j = 0;
                if (gVar.c != -9223372036854775807L) {
                    z = false;
                }
            }
            z = true;
        }
        try {
            try {
                if (!eVar.b0.a.p()) {
                    i28 i28Var2 = eVar.b0;
                    if (pairS == null) {
                        if (i28Var2.e != 1) {
                            eVar.n0(4);
                        }
                        eVar.O(false, true, false, true);
                    } else {
                        if (bVarQ.equals(i28Var2.b)) {
                            vp6 vp6Var = eVar.L.j;
                            if (vp6Var == null || !vp6Var.e || jLongValue == j) {
                                jF = jLongValue;
                            } else {
                                up6 up6Var = vp6Var.a;
                                long j7 = eVar.D.m;
                                if (eVar.X && j7 != -9223372036854775807L) {
                                    eVar.W.getClass();
                                }
                                jF = up6Var.f(jLongValue, eVar.V);
                            }
                            if (n6b.Z(jF) == n6b.Z(eVar.b0.s) && ((i = (i28Var = eVar.b0).e) == 2 || i == 3)) {
                                j5 = i28Var.s;
                                i2 = 2;
                                j6 = j5;
                                z = z;
                                bVar = bVarQ;
                                j4 = jMax;
                            }
                        } else {
                            jF = jLongValue;
                        }
                        try {
                            boolean z2 = eVar.b0.e == 4;
                            try {
                                h hVar = eVar.L;
                                long jX = eVar.X(bVarQ, jF, hVar.j != hVar.k, z2);
                                z |= jLongValue != jX;
                                try {
                                    i28 i28Var3 = eVar.b0;
                                    bq6.b bVar2 = bVarQ;
                                    try {
                                        toa toaVar = i28Var3.a;
                                        long j8 = jMax;
                                        try {
                                            eVar.C0(toaVar, bVar2, toaVar, i28Var3.b, j8, true);
                                            bVar = bVar2;
                                            j4 = j8;
                                            j5 = jX;
                                            i2 = 2;
                                            j6 = j5;
                                            eVar = this;
                                        } catch (Throwable th) {
                                            th = th;
                                            bVarQ = bVar2;
                                            j2 = j8;
                                            j3 = jX;
                                            eVar.b0 = eVar.y(bVarQ, j3, j2, j3, z, 2);
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        bVarQ = bVar2;
                                        j2 = jMax;
                                        j3 = jX;
                                        eVar.b0 = eVar.y(bVarQ, j3, j2, j3, z, 2);
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                j2 = jMax;
                                j3 = jLongValue;
                                eVar.b0 = eVar.y(bVarQ, j3, j2, j3, z, 2);
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    }
                    eVar.b0 = eVar.y(bVar, j5, j4, j6, z, i2);
                }
                eVar.p0 = gVar;
                z = z;
                bVar = bVarQ;
                j5 = jLongValue;
                j4 = jMax;
                i2 = 2;
                j6 = j5;
                eVar = this;
                eVar.b0 = eVar.y(bVar, j5, j4, j6, z, i2);
            } catch (Throwable th6) {
                th = th6;
                z = z;
                bVarQ = bVarQ;
                j3 = jLongValue;
                j2 = jMax;
            }
        } catch (Throwable th7) {
            th = th7;
            z = z;
            bVarQ = bVarQ;
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x011b  */
    public final long X(bq6.b bVar, long j, boolean z, boolean z2) {
        h hVar;
        v0();
        boolean z3 = true;
        D0(false, true);
        if (z2 || this.b0.e == 3) {
            n0(2);
        }
        vp6 vp6Var = this.L.j;
        vp6 vp6Var2 = vp6Var;
        while (vp6Var2 != null && !bVar.equals(vp6Var2.g.a)) {
            vp6Var2 = vp6Var2.m;
        }
        if (z || vp6Var != vp6Var2 || (vp6Var2 != null && vp6Var2.p + j < 0)) {
            for (int i = 0; i < this.t.length; i++) {
                i(i);
            }
            this.x0 = -9223372036854775807L;
            if (vp6Var2 != null) {
                while (true) {
                    hVar = this.L;
                    if (hVar.j == vp6Var2) {
                        break;
                    }
                    hVar.a();
                }
                hVar.o(vp6Var2);
                vp6Var2.p = 1000000000000L;
                l(new boolean[this.t.length], this.L.k.e());
                vp6Var2.h = true;
            }
        }
        h();
        if (this.X) {
            for (nn8 nn8Var : this.t) {
                if (nn8Var.f() && (nn8Var.a.F() == 2 || nn8Var.a.F() == 4)) {
                    this.Y = true;
                    break;
                }
            }
        }
        h hVar2 = this.L;
        if (vp6Var2 != null) {
            hVar2.o(vp6Var2);
            if (!vp6Var2.e) {
                vp6Var2.g = vp6Var2.g.b(j, -9223372036854775807L);
            } else if (vp6Var2.f) {
                if (this.X) {
                    this.W.getClass();
                    if (this.b0.a.p() || !vp6Var2.g.a.equals(this.b0.b)) {
                        j = vp6Var2.a.i(j);
                        vp6Var2.a.s(j - this.F, this.G);
                    } else {
                        long j2 = vp6Var2.p + j;
                        boolean z4 = true;
                        for (nn8 nn8Var2 : this.t) {
                            if (nn8Var2.f()) {
                                k kVarC = nn8Var2.c(vp6Var2);
                                z4 &= kVarC != null && kVarC.D(j2);
                            }
                        }
                        if (z4) {
                            up6 up6Var = vp6Var2.a;
                            long j3 = this.b0.s;
                            u89 u89Var = u89.c;
                            if (up6Var.f(j3, u89Var) == vp6Var2.a.f(j, u89Var)) {
                                z3 = false;
                            } else {
                                j = vp6Var2.a.i(j);
                                vp6Var2.a.s(j - this.F, this.G);
                            }
                        } else {
                            j = vp6Var2.a.i(j);
                            vp6Var2.a.s(j - this.F, this.G);
                        }
                    }
                } else {
                    j = vp6Var2.a.i(j);
                    vp6Var2.a.s(j - this.F, this.G);
                }
            }
            Q(j, z3);
            C();
        } else {
            hVar2.b();
            Q(j, true);
        }
        u(false);
        this.A.k(2);
        return j;
    }

    public final void Y(j jVar) {
        jVar.getClass();
        kt4 kt4Var = this.A;
        if (jVar.e != this.C) {
            kt4Var.m(15, jVar).b();
            return;
        }
        synchronized (jVar) {
        }
        try {
            jVar.a.y(jVar.c, jVar.d);
            jVar.a(true);
            int i = this.b0.e;
            if (i == 3 || i == 2) {
                kt4Var.k(2);
            }
        } catch (Throwable th) {
            jVar.a(true);
            throw th;
        }
    }

    public final void Z(final j jVar) {
        Looper looper = jVar.e;
        if (looper.getThread().isAlive()) {
            this.J.b(looper, null).e(new Runnable(this) { // from class: dq3
                @Override // java.lang.Runnable
                public final void run() {
                    j jVar2 = jVar;
                    try {
                        synchronized (jVar2) {
                        }
                        try {
                            jVar2.a.y(jVar2.c, jVar2.d);
                        } finally {
                            jVar2.a(true);
                        }
                    } catch (lo3 e) {
                        md6.e("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
                        d55.a(e);
                    }
                }
            });
        } else {
            md6.g("TAG", "Trying to send message on a dead thread.");
            jVar.a(false);
        }
    }

    @Override // up6.a
    public final void a(up6 up6Var) {
        this.A.m(8, up6Var).b();
    }

    public final void a0(q70 q70Var, boolean z) {
        this.w.f(q70Var);
        if (!z) {
            q70Var = null;
        }
        e80 e80Var = this.T;
        if (!Objects.equals(e80Var.d, q70Var)) {
            e80Var.d = q70Var;
            int i = q70Var == null ? 0 : 1;
            e80Var.f = i;
            xl7.f("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", i == 1 || i == 0);
        }
        i28 i28Var = this.b0;
        boolean z2 = i28Var.l;
        A0(e80Var.d(i28Var.e, z2), i28Var.n, i28Var.m, z2);
    }

    @Override // bd9.a
    public final void b(bd9 bd9Var) {
        this.A.m(9, (up6) bd9Var).b();
    }

    public final void b0(boolean z, bv1 bv1Var) {
        if (this.l0 != z) {
            this.l0 = z;
            if (!z) {
                for (nn8 nn8Var : this.t) {
                    nn8Var.j();
                }
            }
        }
        if (bv1Var != null) {
            bv1Var.c();
        }
    }

    public final void c(b bVar, int i) throws Throwable {
        this.c0.a(1);
        i iVar = this.M;
        if (i == -1) {
            i = iVar.b.size();
        }
        v(iVar.a(i, bVar.a, bVar.b), false);
    }

    public final void c0(g85 g85Var) {
        for (nn8 nn8Var : this.t) {
            k kVar = nn8Var.a;
            if (kVar.F() == 4) {
                kVar.y(23, g85Var);
                k kVar2 = nn8Var.c;
                if (kVar2 != null) {
                    kVar2.y(23, g85Var);
                }
            }
        }
    }

    public final void d() {
        for (nn8 nn8Var : this.t) {
            a89 a89Var = this.X ? this.W : null;
            nn8Var.a.y(18, a89Var);
            k kVar = nn8Var.c;
            if (kVar != null) {
                kVar.y(18, a89Var);
            }
        }
    }

    public final void d0(b bVar) throws Throwable {
        this.c0.a(1);
        int i = bVar.c;
        bo9 bo9Var = bVar.b;
        ArrayList arrayList = bVar.a;
        if (i != -1) {
            this.p0 = new g(new n48(arrayList, bo9Var), bVar.c, bVar.d);
        }
        i iVar = this.M;
        ArrayList arrayList2 = iVar.b;
        iVar.g(0, arrayList2.size());
        v(iVar.a(arrayList2.size(), arrayList, bo9Var), false);
    }

    public final boolean e() {
        if (!this.S) {
            return false;
        }
        for (nn8 nn8Var : this.t) {
            if (nn8Var.e()) {
                return true;
            }
        }
        return false;
    }

    public final void e0(boolean z) {
        this.e0 = z;
        P();
        if (this.f0) {
            h hVar = this.L;
            if (hVar.k != hVar.j) {
                V(true);
                u(false);
            }
        }
    }

    @Override // defpackage.zeb
    public final void f(long j, long j2, id4 id4Var, MediaFormat mediaFormat) {
        if (this.Y) {
            this.A.f(37).b();
        }
    }

    public final void f0(k28 k28Var) {
        this.A.l(16);
        fs2 fs2Var = this.H;
        fs2Var.c(k28Var);
        k28 k28VarE = fs2Var.e();
        x(k28VarE, k28VarE.a, true, true);
    }

    public final void g() {
        N();
        V(true);
    }

    public final void g0(ExoPlayer.c cVar) {
        this.w0 = cVar;
        toa toaVar = this.b0.a;
        h hVar = this.L;
        hVar.i = cVar;
        hVar.i.getClass();
        if (hVar.r.isEmpty()) {
            return;
        }
        hVar.n(new ArrayList());
    }

    public final void h() {
        k kVar;
        if (this.S && e()) {
            for (nn8 nn8Var : this.t) {
                int iB = nn8Var.b();
                fs2 fs2Var = this.H;
                if (nn8Var.e()) {
                    int i = nn8Var.d;
                    boolean z = i == 4 || i == 2;
                    int i2 = i != 4 ? 0 : 1;
                    if (z) {
                        try {
                            kVar = nn8Var.a;
                        } catch (RuntimeException e) {
                            md6.e("RendererHolder", "Disable prewarming failed.", e);
                        }
                    } else {
                        kVar = nn8Var.c;
                        kVar.getClass();
                    }
                    nn8Var.a(kVar, fs2Var);
                    try {
                        nn8Var.h(z);
                    } catch (RuntimeException e2) {
                        md6.e("RendererHolder", "Reset prewarming failed.", e2);
                    }
                    nn8Var.d = i2;
                }
                this.o0 -= iB - nn8Var.b();
            }
            this.x0 = -9223372036854775807L;
        }
    }

    public final void h0(int i) {
        this.j0 = i;
        toa toaVar = this.b0.a;
        h hVar = this.L;
        hVar.g = i;
        int iS = hVar.s(toaVar);
        if ((iS & 1) != 0) {
            V(true);
        } else if ((iS & 2) != 0) {
            h();
        }
        u(false);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        int i;
        vp6 vp6Var;
        bq6.b bVar;
        vp6 vp6Var2;
        int i2;
        int i3 = 1000;
        try {
            switch (message.what) {
                case 1:
                    boolean z = message.arg1 != 0;
                    int i4 = message.arg2;
                    this.c0.a(1);
                    A0(this.T.d(this.b0.e, z), i4 >> 4, i4 & 15, z);
                    break;
                case 2:
                    j();
                    break;
                case 3:
                    W((g) message.obj);
                    break;
                case 4:
                    f0((k28) message.obj);
                    break;
                case 5:
                    k0((u89) message.obj);
                    break;
                case 6:
                    u0(false, true);
                    break;
                case 7:
                    K((bv1) message.obj);
                    return true;
                case 8:
                    w((up6) message.obj);
                    break;
                case 9:
                    s((up6) message.obj);
                    break;
                case 10:
                    N();
                    break;
                case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    h0(message.arg1);
                    break;
                case 12:
                    l0(message.arg1 != 0);
                    break;
                case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    b0(message.arg1 != 0, (bv1) message.obj);
                    break;
                case 14:
                    Y((j) message.obj);
                    break;
                case h4c.e /* 15 */:
                    Z((j) message.obj);
                    break;
                case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                    k28 k28Var = (k28) message.obj;
                    x(k28Var, k28Var.a, true, false);
                    break;
                case 17:
                    d0((b) message.obj);
                    break;
                case 18:
                    c((b) message.obj, message.arg1);
                    break;
                case 19:
                    I((c) message.obj);
                    break;
                case InboxPagingSource.PAGE_SIZE /* 20 */:
                    M(message.arg1, message.arg2, (bo9) message.obj);
                    break;
                case 21:
                    m0((bo9) message.obj);
                    break;
                case 22:
                    H();
                    break;
                case 23:
                    e0(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    g();
                    break;
                case 26:
                    N();
                    V(true);
                    break;
                case 27:
                    y0(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    g0((ExoPlayer.c) message.obj);
                    break;
                case 29:
                    J();
                    break;
                case 30:
                    Pair pair = (Pair) message.obj;
                    p0(pair.first, (bv1) pair.second);
                    break;
                case 31:
                    a0((q70) message.obj, message.arg1 != 0);
                    break;
                case 32:
                    q0(((Float) message.obj).floatValue());
                    break;
                case 33:
                    q(message.arg1);
                    break;
                case 34:
                    r();
                    break;
                case 35:
                    o0((zeb) message.obj);
                    break;
                case 36:
                    i0(((Boolean) message.obj).booleanValue());
                    break;
                case 37:
                    this.Y = false;
                    g gVar = this.Z;
                    if (gVar != null) {
                        W(gVar);
                        this.Z = null;
                    }
                    break;
                case 38:
                    j0((a89) message.obj);
                    break;
                case 39:
                    c0((g85) message.obj);
                    break;
            }
        } catch (i83.a e) {
            t(e, e.t);
        } catch (RuntimeException e2) {
            lo3 lo3Var = new lo3(2, e2, ((e2 instanceof IllegalStateException) || (e2 instanceof IllegalArgumentException)) ? 1004 : 1000);
            md6.e("ExoPlayerImplInternal", "Playback error", lo3Var);
            u0(true, false);
            this.b0 = this.b0.f(lo3Var);
        } catch (lf2 e3) {
            t(e3, e3.t);
        } catch (un0 e4) {
            t(e4, 1002);
        } catch (ut7 e5) {
            boolean z2 = e5.t;
            int i5 = e5.u;
            if (i5 == 1) {
                i2 = z2 ? 3001 : 3003;
            } else {
                if (i5 == 4) {
                    i2 = z2 ? 3002 : 3004;
                }
                t(e5, i3);
            }
            i3 = i2;
            t(e5, i3);
        } catch (IOException e6) {
            t(e6, 2000);
        } catch (lo3 e7) {
            e = e7;
            int i6 = e.v;
            h hVar = this.L;
            if (i6 == 1 && (vp6Var2 = hVar.k) != null && e.A == null) {
                e = e.a(vp6Var2.g.a);
            }
            int i7 = e.v;
            kt4 kt4Var = this.A;
            if (i7 == 1 && (bVar = e.A) != null && A(e.x, bVar)) {
                this.y0 = true;
                h();
                vp6 vp6VarG = hVar.g();
                vp6 vp6Var3 = hVar.j;
                if (vp6Var3 != vp6VarG) {
                    while (vp6Var3 != null) {
                        vp6 vp6Var4 = vp6Var3.m;
                        if (vp6Var4 == vp6VarG) {
                            break;
                        }
                        vp6Var3 = vp6Var4;
                    }
                }
                hVar.o(vp6Var3);
                if (this.b0.e != 4) {
                    C();
                    kt4Var.k(2);
                }
            } else {
                lo3 lo3Var2 = this.u0;
                if (lo3Var2 != null) {
                    lo3Var2.addSuppressed(e);
                    e = this.u0;
                }
                if (e.v == 1 && hVar.j != hVar.k) {
                    while (true) {
                        vp6Var = hVar.j;
                        if (vp6Var == hVar.k) {
                            break;
                        }
                        hVar.a();
                    }
                    xl7.l(vp6Var);
                    E();
                    wp6 wp6Var = vp6Var.g;
                    bq6.b bVar2 = wp6Var.a;
                    long j = wp6Var.b;
                    this.b0 = y(bVar2, j, wp6Var.d, j, true, 0);
                }
                if (e.B && (this.u0 == null || (i = e.t) == 5004 || i == 5003)) {
                    md6.h("ExoPlayerImplInternal", "Recoverable renderer error", e);
                    if (this.u0 == null) {
                        this.u0 = e;
                    }
                    kt4Var.b(kt4Var.m(25, e));
                } else {
                    md6.e("ExoPlayerImplInternal", "Playback error", e);
                    u0(true, false);
                    this.b0 = this.b0.f(e);
                }
            }
        }
        E();
        return true;
    }

    public final void i(int i) {
        nn8[] nn8VarArr = this.t;
        int iB = nn8VarArr[i].b();
        nn8 nn8Var = nn8VarArr[i];
        k kVar = nn8Var.a;
        fs2 fs2Var = this.H;
        nn8Var.a(kVar, fs2Var);
        k kVar2 = nn8Var.c;
        if (kVar2 != null) {
            boolean z = (kVar2.getState() == 0 || nn8Var.d == 3) ? false : true;
            nn8Var.a(kVar2, fs2Var);
            nn8Var.h(false);
            if (z) {
                k kVar3 = nn8Var.a;
                kVar2.getClass();
                kVar2.y(17, kVar3);
            }
        }
        nn8Var.d = 0;
        G(i, false);
        this.o0 -= iB;
    }

    public final void i0(boolean z) throws Throwable {
        if (!z) {
            g gVar = this.Z;
            kt4 kt4Var = this.A;
            if (gVar != null && this.Y && !kt4Var.i(37)) {
                this.a0++;
            }
            final int i = this.a0;
            if (i > 0) {
                this.R.e(new Runnable() { // from class: zp3
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.t.Q.c0(i);
                    }
                });
            }
            this.a0 = 0;
            this.Y = false;
            kt4Var.l(37);
            g gVar2 = this.Z;
            if (gVar2 != null) {
                W(gVar2);
                this.Z = null;
                this.Y = false;
            }
        }
        this.X = z;
        d();
    }

    /* JADX WARN: Code duplicated, block: B:116:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:118:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:120:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:155:0x026d  */
    /* JADX WARN: Code duplicated, block: B:158:0x0273  */
    /* JADX WARN: Code duplicated, block: B:160:0x027b  */
    /* JADX WARN: Code duplicated, block: B:164:0x0287  */
    /* JADX WARN: Code duplicated, block: B:178:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:181:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:184:0x02df  */
    /* JADX WARN: Code duplicated, block: B:187:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:191:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:194:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:197:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:213:0x0281 A[EDGE_INSN: B:213:0x0281->B:162:0x0281 BREAK  A[LOOP:1: B:156:0x026e->B:161:0x027e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x027e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:94:0x0152  */
    public final void j() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean zA;
        ez9 ez9Var;
        boolean z4;
        i28 i28Var;
        int i;
        int i2;
        nn8[] nn8VarArr;
        i28 i28Var2;
        long jA = this.J.a();
        this.A.l(2);
        if (!this.U) {
            z0();
        }
        int i3 = this.b0.e;
        if (i3 == 1 || i3 == 4) {
            return;
        }
        if (this.U) {
            z0();
        }
        vp6 vp6Var = this.L.j;
        if (vp6Var == null) {
            U(jA);
            return;
        }
        Trace.beginSection("doSomeWork");
        B0();
        if (vp6Var.e) {
            this.r0 = n6b.N(this.J.c());
            vp6Var.a.s(this.b0.s - this.F, this.G);
            z = true;
            z2 = true;
            int i4 = 0;
            while (true) {
                nn8[] nn8VarArr2 = this.t;
                if (i4 >= nn8VarArr2.length) {
                    break;
                }
                nn8 nn8Var = nn8VarArr2[i4];
                if (nn8Var.b() == 0) {
                    G(i4, false);
                } else {
                    long j = this.q0;
                    long j2 = this.r0;
                    k kVar = nn8Var.c;
                    k kVar2 = nn8Var.a;
                    if (nn8.g(kVar2)) {
                        kVar2.h(j, j2);
                    }
                    if (kVar != null && kVar.getState() != 0) {
                        kVar.h(j, j2);
                    }
                    if (z) {
                        k kVar3 = nn8Var.c;
                        k kVar4 = nn8Var.a;
                        boolean zD = nn8.g(kVar4) ? kVar4.d() : true;
                        if (kVar3 != null && kVar3.getState() != 0) {
                            zD &= kVar3.d();
                        }
                        if (zD) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    k kVarC = nn8Var.c(vp6Var);
                    boolean z5 = kVarC == null || kVarC.k() || kVarC.b() || kVarC.d();
                    G(i4, z5);
                    z2 = z2 && z5;
                    if (!z5) {
                        F(i4);
                    }
                }
                i4++;
            }
        } else {
            vp6Var.a.g();
            z = true;
            z2 = true;
        }
        long j3 = vp6Var.g.f;
        long j4 = -9223372036854775807L;
        boolean z6 = z && vp6Var.e && (j3 == -9223372036854775807L || j3 <= this.b0.s);
        if (z6 && this.f0) {
            this.f0 = false;
            int i5 = this.b0.n;
            this.c0.a(0);
            A0(this.T.d(this.b0.e, false), i5, 5, false);
        }
        if (!z6 || !vp6Var.g.k) {
            i28 i28Var3 = this.b0;
            if (i28Var3.e == 2) {
                h hVar = this.L;
                if (this.o0 != 0) {
                    if (!z2) {
                        zA = false;
                    } else if (i28Var3.g) {
                        vp6 vp6Var2 = hVar.j;
                        long j5 = s0(i28Var3.a, vp6Var2.g.a) ? ((ds2) this.N).h : -9223372036854775807L;
                        vp6 vp6Var3 = hVar.m;
                        boolean z7 = vp6Var3.g() && vp6Var3.g.k;
                        boolean z8 = vp6Var3.g.a.b() && !vp6Var3.e;
                        if (z7 || z8) {
                            zA = true;
                        } else {
                            long jP = p(vp6Var3.d());
                            androidx.media3.exoplayer.f fVar = this.y;
                            x38 x38Var = this.P;
                            toa toaVar = this.b0.a;
                            bq6.b bVar = vp6Var2.g.a;
                            long j6 = this.q0 - vp6Var2.p;
                            float f2 = this.H.e().a;
                            boolean z9 = this.b0.l;
                            zA = fVar.a(new androidx.media3.exoplayer.f.a(x38Var, toaVar, bVar, j6, jP, f2, this.g0, j5));
                        }
                    } else {
                        zA = true;
                    }
                    if (zA) {
                        n0(3);
                        this.u0 = null;
                        if (r0()) {
                            D0(false, false);
                            fs2 fs2Var = this.H;
                            z3 = true;
                            fs2Var.y = true;
                            ez9Var = fs2Var.t;
                            if (!ez9Var.u) {
                                ez9Var.w = ez9Var.t.c();
                                ez9Var.u = true;
                            }
                            t0();
                        }
                    }
                    if (this.b0.e == 2) {
                        i2 = 0;
                        while (true) {
                            nn8VarArr = this.t;
                            if (i2 < nn8VarArr.length) {
                                break;
                            }
                            if (nn8VarArr[i2].c(vp6Var) != null) {
                                F(i2);
                            }
                            i2++;
                        }
                        i28Var2 = this.b0;
                        if (i28Var2.g && i28Var2.r < 500000 && z(this.L.m) && r0()) {
                            long j7 = this.v0;
                            vf1 vf1Var = this.J;
                            if (j7 == -9223372036854775807L) {
                                this.v0 = vf1Var.c();
                            } else if (vf1Var.c() - this.v0 >= 4000) {
                                throw new k3a(0, 4000);
                            }
                        } else {
                            this.v0 = -9223372036854775807L;
                        }
                    } else {
                        this.v0 = -9223372036854775807L;
                    }
                    if (r0() || this.b0.e != 3) {
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                    if (this.n0 || !this.m0 || !z4) {
                        z3 = false;
                    }
                    i28Var = this.b0;
                    if (i28Var.p != z3) {
                        this.b0 = i28Var.i(z3);
                    }
                    this.m0 = false;
                    if (!z3 && (i = this.b0.e) != 4 && (z4 || i == 2 || (i == 3 && this.o0 != 0))) {
                        U(jA);
                    }
                    Trace.endSection();
                }
                zA = B();
                if (zA) {
                    n0(3);
                    this.u0 = null;
                    if (r0()) {
                        D0(false, false);
                        fs2 fs2Var2 = this.H;
                        z3 = true;
                        fs2Var2.y = true;
                        ez9Var = fs2Var2.t;
                        if (!ez9Var.u) {
                            ez9Var.w = ez9Var.t.c();
                            ez9Var.u = true;
                        }
                        t0();
                    }
                }
                if (this.b0.e == 2) {
                    i2 = 0;
                    while (true) {
                        nn8VarArr = this.t;
                        if (i2 < nn8VarArr.length) {
                            break;
                            break;
                        } else {
                            if (nn8VarArr[i2].c(vp6Var) != null) {
                                F(i2);
                            }
                            i2++;
                        }
                    }
                    i28Var2 = this.b0;
                    if (i28Var2.g) {
                        this.v0 = -9223372036854775807L;
                    } else {
                        this.v0 = -9223372036854775807L;
                    }
                } else {
                    this.v0 = -9223372036854775807L;
                }
                if (r0()) {
                    z4 = false;
                } else {
                    z4 = false;
                }
                if (this.n0) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                i28Var = this.b0;
                if (i28Var.p != z3) {
                    this.b0 = i28Var.i(z3);
                }
                this.m0 = false;
                if (!z3) {
                    U(jA);
                }
                Trace.endSection();
            }
            j4 = -9223372036854775807L;
            z3 = true;
            if (this.b0.e == 3 && (this.o0 != 0 ? !z2 : !B())) {
                D0(r0(), false);
                n0(2);
                if (this.g0) {
                    for (vp6 vp6Var4 = this.L.j; vp6Var4 != null; vp6Var4 = vp6Var4.m) {
                        for (fq3 fq3Var : vp6Var4.o.c) {
                            if (fq3Var != null) {
                                fq3Var.x();
                            }
                        }
                    }
                    ds2 ds2Var = (ds2) this.N;
                    long j8 = ds2Var.h;
                    if (j8 != j4) {
                        long j9 = j8 + ds2Var.b;
                        ds2Var.h = j9;
                        long j10 = ds2Var.g;
                        if (j10 != j4 && j9 > j10) {
                            ds2Var.h = j10;
                        }
                        ds2Var.l = j4;
                    }
                }
                v0();
            }
            if (this.b0.e == 2) {
                i2 = 0;
                while (true) {
                    nn8VarArr = this.t;
                    if (i2 < nn8VarArr.length) {
                        break;
                        break;
                    } else {
                        if (nn8VarArr[i2].c(vp6Var) != null) {
                            F(i2);
                        }
                        i2++;
                    }
                }
                i28Var2 = this.b0;
                if (i28Var2.g) {
                    this.v0 = -9223372036854775807L;
                } else {
                    this.v0 = -9223372036854775807L;
                }
            } else {
                this.v0 = -9223372036854775807L;
            }
            if (r0()) {
                z4 = false;
            } else {
                z4 = false;
            }
            if (this.n0) {
                z3 = false;
            } else {
                z3 = false;
            }
            i28Var = this.b0;
            if (i28Var.p != z3) {
                this.b0 = i28Var.i(z3);
            }
            this.m0 = false;
            if (!z3) {
                U(jA);
            }
            Trace.endSection();
        }
        n0(4);
        v0();
        z3 = true;
        if (this.b0.e == 2) {
            i2 = 0;
            while (true) {
                nn8VarArr = this.t;
                if (i2 < nn8VarArr.length) {
                    break;
                    break;
                } else {
                    if (nn8VarArr[i2].c(vp6Var) != null) {
                        F(i2);
                    }
                    i2++;
                }
            }
            i28Var2 = this.b0;
            if (i28Var2.g) {
                this.v0 = -9223372036854775807L;
            } else {
                this.v0 = -9223372036854775807L;
            }
        } else {
            this.v0 = -9223372036854775807L;
        }
        if (r0()) {
            z4 = false;
        } else {
            z4 = false;
        }
        if (this.n0) {
            z3 = false;
        } else {
            z3 = false;
        }
        i28Var = this.b0;
        if (i28Var.p != z3) {
            this.b0 = i28Var.i(z3);
        }
        this.m0 = false;
        if (!z3) {
            U(jA);
        }
        Trace.endSection();
    }

    public final void j0(a89 a89Var) {
        this.W = a89Var;
        d();
    }

    public final void k(vp6 vp6Var, int i, boolean z, long j) {
        nn8 nn8Var = this.t[i];
        if (nn8Var.f()) {
            return;
        }
        boolean z2 = vp6Var == this.L.j;
        nsa nsaVar = vp6Var.o;
        mn8 mn8Var = nsaVar.b[i];
        fq3 fq3Var = nsaVar.c[i];
        boolean z3 = r0() && this.b0.e == 3;
        boolean z4 = !z && z3;
        this.o0++;
        xz8 xz8Var = vp6Var.c[i];
        long j2 = vp6Var.p;
        bq6.b bVar = vp6Var.g.a;
        k kVar = nn8Var.c;
        int length = fq3Var != null ? fq3Var.length() : 0;
        id4[] id4VarArr = new id4[length];
        for (int i2 = 0; i2 < length; i2++) {
            fq3Var.getClass();
            id4VarArr[i2] = fq3Var.b(i2);
        }
        int i3 = nn8Var.d;
        fs2 fs2Var = this.H;
        if (i3 == 0 || i3 == 2 || i3 == 4) {
            nn8Var.e = true;
            nn8Var.a.s(mn8Var, id4VarArr, xz8Var, z4, z2, j, j2, bVar);
            fs2Var.a(nn8Var.a);
        } else {
            nn8Var.f = true;
            kVar.getClass();
            kVar.s(mn8Var, id4VarArr, xz8Var, z4, z2, j, j2, bVar);
            fs2Var.a(kVar);
        }
        a aVar = new a();
        k kVarC = nn8Var.c(vp6Var);
        kVarC.getClass();
        kVarC.y(11, aVar);
        if (z3 && z2) {
            nn8Var.l();
        }
    }

    public final void k0(u89 u89Var) {
        this.V = u89Var;
    }

    public final void l(boolean[] zArr, long j) {
        nn8[] nn8VarArr;
        e eVar;
        long j2;
        vp6 vp6Var = this.L.k;
        nsa nsaVar = vp6Var.o;
        int i = 0;
        while (true) {
            nn8VarArr = this.t;
            if (i >= nn8VarArr.length) {
                break;
            }
            if (!nsaVar.b(i)) {
                nn8VarArr[i].j();
            }
            i++;
        }
        int i2 = 0;
        while (i2 < nn8VarArr.length) {
            if (nsaVar.b(i2) && nn8VarArr[i2].c(vp6Var) == null) {
                eVar = this;
                j2 = j;
                eVar.k(vp6Var, i2, zArr[i2], j2);
            } else {
                eVar = this;
                j2 = j;
            }
            i2++;
            this = eVar;
            j = j2;
        }
    }

    public final void l0(boolean z) {
        this.k0 = z;
        toa toaVar = this.b0.a;
        h hVar = this.L;
        hVar.h = z;
        int iS = hVar.s(toaVar);
        if ((iS & 1) != 0) {
            V(true);
        } else if ((iS & 2) != 0) {
            h();
        }
        u(false);
    }

    public final long m(toa toaVar, Object obj, long j) {
        toa.b bVar = this.E;
        int i = toaVar.g(obj, bVar).c;
        toa.c cVar = this.D;
        toaVar.n(i, cVar);
        if (cVar.f == -9223372036854775807L || !cVar.a() || !cVar.i) {
            return -9223372036854775807L;
        }
        long j2 = cVar.g;
        return n6b.N((j2 == -9223372036854775807L ? System.currentTimeMillis() : j2 + SystemClock.elapsedRealtime()) - cVar.f) - (j + bVar.e);
    }

    public final void m0(bo9 bo9Var) throws Throwable {
        this.c0.a(1);
        i iVar = this.M;
        int size = iVar.b.size();
        if (bo9Var.a() != size) {
            bo9Var = bo9Var.h().f(0, size);
        }
        iVar.j = bo9Var;
        v(iVar.b(), false);
    }

    public final long n(vp6 vp6Var) {
        if (vp6Var == null) {
            return 0L;
        }
        long jMax = vp6Var.p;
        if (!vp6Var.e) {
            return jMax;
        }
        int i = 0;
        while (true) {
            nn8[] nn8VarArr = this.t;
            if (i >= nn8VarArr.length) {
                return jMax;
            }
            if (nn8VarArr[i].c(vp6Var) != null) {
                k kVarC = nn8VarArr[i].c(vp6Var);
                Objects.requireNonNull(kVarC);
                long jB = kVarC.B();
                if (jB == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jMax = Math.max(jB, jMax);
            }
            i++;
        }
    }

    public final void n0(int i) {
        i28 i28Var = this.b0;
        if (i28Var.e != i) {
            if (i != 2) {
                this.v0 = -9223372036854775807L;
            }
            if (i != 3 && i28Var.p) {
                this.b0 = i28Var.i(false);
            }
            this.b0 = this.b0.h(i);
        }
    }

    public final Pair<bq6.b, Long> o(toa toaVar) {
        long j = 0;
        if (toaVar.p()) {
            return Pair.create(i28.u, 0L);
        }
        int iA = toaVar.a(this.k0);
        Pair<Object, Long> pairI = toaVar.i(this.D, this.E, iA, -9223372036854775807L);
        bq6.b bVarQ = this.L.q(toaVar, pairI.first, 0L);
        long jLongValue = ((Long) pairI.second).longValue();
        if (bVarQ.b()) {
            Object obj = bVarQ.a;
            toa.b bVar = this.E;
            toaVar.g(obj, bVar);
            if (bVarQ.c == bVar.e(bVarQ.b)) {
                bVar.g.getClass();
            }
        } else {
            j = jLongValue;
        }
        return Pair.create(bVarQ, Long.valueOf(j));
    }

    public final void o0(zeb zebVar) {
        for (nn8 nn8Var : this.t) {
            k kVar = nn8Var.a;
            if (kVar.F() == 2) {
                kVar.y(7, zebVar);
                k kVar2 = nn8Var.c;
                if (kVar2 != null) {
                    kVar2.y(7, zebVar);
                }
            }
        }
    }

    public final long p(long j) {
        vp6 vp6Var = this.L.m;
        if (vp6Var == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.q0 - vp6Var.p));
    }

    public final void p0(Object obj, bv1 bv1Var) {
        for (nn8 nn8Var : this.t) {
            k kVar = nn8Var.a;
            if (kVar.F() == 2) {
                int i = nn8Var.d;
                if (i == 4 || i == 1) {
                    k kVar2 = nn8Var.c;
                    kVar2.getClass();
                    kVar2.y(1, obj);
                } else {
                    kVar.y(1, obj);
                }
            }
        }
        int i2 = this.b0.e;
        if (i2 == 3 || i2 == 2) {
            this.A.k(2);
        }
        if (bv1Var != null) {
            bv1Var.c();
        }
    }

    public final void q(int i) {
        i28 i28Var = this.b0;
        A0(i, i28Var.n, i28Var.m, i28Var.l);
    }

    public final void q0(float f2) {
        this.z0 = f2;
        float f3 = f2 * this.T.g;
        for (nn8 nn8Var : this.t) {
            k kVar = nn8Var.a;
            if (kVar.F() == 1) {
                kVar.y(2, Float.valueOf(f3));
                k kVar2 = nn8Var.c;
                if (kVar2 != null) {
                    kVar2.y(2, Float.valueOf(f3));
                }
            }
        }
    }

    public final void r() {
        q0(this.z0);
    }

    public final boolean r0() {
        i28 i28Var = this.b0;
        return i28Var.l && i28Var.n == 0;
    }

    public final void s(up6 up6Var) {
        h hVar = this.L;
        vp6 vp6Var = hVar.m;
        if (vp6Var != null && vp6Var.a == up6Var) {
            hVar.m(this.q0);
            C();
            return;
        }
        vp6 vp6Var2 = hVar.n;
        if (vp6Var2 == null || vp6Var2.a != up6Var) {
            return;
        }
        D();
    }

    public final boolean s0(toa toaVar, bq6.b bVar) {
        if (bVar.b() || toaVar.p()) {
            return false;
        }
        int i = toaVar.g(bVar.a, this.E).c;
        toa.c cVar = this.D;
        toaVar.n(i, cVar);
        return cVar.a() && cVar.i && cVar.f != -9223372036854775807L;
    }

    public final void t(IOException iOException, int i) {
        lo3 lo3Var = new lo3(0, iOException, i);
        vp6 vp6Var = this.L.j;
        if (vp6Var != null) {
            lo3Var = lo3Var.a(vp6Var.g.a);
        }
        md6.e("ExoPlayerImplInternal", "Playback error", lo3Var);
        u0(false, false);
        this.b0 = this.b0.f(lo3Var);
    }

    public final void t0() {
        vp6 vp6Var = this.L.j;
        if (vp6Var == null) {
            return;
        }
        nsa nsaVar = vp6Var.o;
        int i = 0;
        while (true) {
            nn8[] nn8VarArr = this.t;
            if (i >= nn8VarArr.length) {
                return;
            }
            if (nsaVar.b(i)) {
                nn8VarArr[i].l();
            }
            i++;
        }
    }

    public final void u(boolean z) {
        vp6 vp6Var = this.L.m;
        bq6.b bVar = vp6Var == null ? this.b0.b : vp6Var.g.a;
        boolean zEquals = this.b0.k.equals(bVar);
        if (!zEquals) {
            this.b0 = this.b0.c(bVar);
        }
        i28 i28Var = this.b0;
        i28Var.q = vp6Var == null ? i28Var.s : vp6Var.d();
        i28 i28Var2 = this.b0;
        i28Var2.r = p(i28Var2.q);
        if ((!zEquals || z) && vp6Var != null && vp6Var.e) {
            x0(vp6Var.g.a, vp6Var.n, vp6Var.o);
        }
    }

    public final void u0(boolean z, boolean z2) {
        O(z || !this.l0, false, true, false);
        this.c0.a(z2 ? 1 : 0);
        this.y.f(this.P);
        this.T.d(1, this.b0.l);
        n0(1);
    }

    /* JADX WARN: Code duplicated, block: B:158:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:241:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:242:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:247:0x0411  */
    /* JADX WARN: Code duplicated, block: B:249:0x0417  */
    /* JADX WARN: Code duplicated, block: B:250:0x0419  */
    /* JADX WARN: Code duplicated, block: B:254:0x043f  */
    /* JADX WARN: Code duplicated, block: B:259:0x0456  */
    /* JADX WARN: Code duplicated, block: B:260:0x0458  */
    /* JADX WARN: Code duplicated, block: B:263:0x0465  */
    /* JADX WARN: Code duplicated, block: B:265:0x046f  */
    /* JADX WARN: Code duplicated, block: B:267:0x0475  */
    /* JADX WARN: Code duplicated, block: B:268:0x0477  */
    /* JADX WARN: Code duplicated, block: B:272:0x049d  */
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
    public final void v(toa toaVar, boolean z) throws Throwable {
        long j;
        toa.c cVar;
        Object obj;
        int iA;
        long j2;
        boolean z2;
        boolean z3;
        boolean z4;
        toa toaVar2;
        toa.b bVar;
        boolean z5;
        toa toaVar3;
        toa.b bVar2;
        toa toaVar4;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        int i;
        f fVar;
        int i2;
        long jLongValue;
        boolean z6;
        int iA2;
        boolean z7;
        toa toaVar5;
        toa toaVar6;
        toa toaVar7;
        bq6.b bVar3;
        long j8;
        bq6.b bVar4;
        boolean z8;
        long j9;
        boolean z9;
        toa toaVar8;
        vp6 vp6Var;
        long j10;
        bq6.b bVar5;
        boolean z10;
        long j11;
        i28 i28Var = this.b0;
        g gVar = this.p0;
        h hVar = this.L;
        int i3 = this.j0;
        boolean z11 = this.k0;
        toa.c cVar2 = this.D;
        toa.b bVar6 = this.E;
        if (toaVar.p()) {
            bq6.b bVar7 = i28.u;
            boolean z12 = (bVar7.equals(i28Var.b) && i28Var.s == 0) ? false : true;
            f fVar2 = new f(bVar7, 0L, -9223372036854775807L, false, true, false, z12, z12 && z && !i28Var.a.p() && !i28Var.a.g(i28Var.b.a, bVar6).f, 4);
            toaVar6 = toaVar;
            j5 = 0;
            fVar = fVar2;
            toaVar5 = bVar6;
        } else {
            bq6.b bVar8 = i28Var.b;
            Object obj2 = bVar8.a;
            toa toaVar9 = i28Var.a;
            boolean z13 = toaVar9.p() || toaVar9.g(bVar8.a, bVar6).f;
            long jMin = (i28Var.b.b() || z13) ? i28Var.c : i28Var.s;
            if (gVar != null) {
                boolean z14 = true;
                j = 1;
                toa toaVar10 = toaVar;
                Pair<Object, Long> pairS = S(toaVar10, gVar, true, i3, z11, cVar2, bVar6);
                if (pairS == null) {
                    iA2 = toaVar10.a(z11);
                    obj = obj2;
                    jLongValue = jMin;
                    z6 = false;
                    z7 = false;
                } else {
                    long j12 = gVar.c;
                    obj = pairS.first;
                    if (j12 == -9223372036854775807L) {
                        iA2 = toaVar10.g(obj, bVar6).c;
                        obj = obj2;
                        jLongValue = jMin;
                        z6 = false;
                    } else {
                        jLongValue = ((Long) pairS.second).longValue();
                        z6 = true;
                        iA2 = -1;
                    }
                    z7 = i28Var.e == 4;
                    z14 = false;
                }
                z4 = z6;
                z3 = z14;
                z2 = z7;
                jMin = jLongValue;
                iA = iA2;
                cVar = cVar2;
                toaVar4 = toaVar10;
                bVar2 = bVar6;
            } else {
                j = 1;
                toa toaVar11 = toaVar;
                if (i28Var.a.p()) {
                    iA = toaVar11.a(z11);
                    cVar = cVar2;
                    obj = obj2;
                } else if (toaVar11.b(obj2) == -1) {
                    int iT = T(cVar2, bVar6, i3, z11, obj, i28Var.a, toaVar11);
                    cVar = cVar2;
                    if (iT == -1) {
                        obj = obj2;
                        toaVar2 = toaVar11;
                        bVar = bVar6;
                        iT = toaVar2.a(z11);
                        z5 = true;
                    } else {
                        obj = obj2;
                        toaVar2 = toaVar11;
                        bVar = bVar6;
                        z5 = false;
                    }
                    iA = iT;
                    z3 = z5;
                    z2 = false;
                    toaVar3 = toaVar2;
                    z4 = false;
                    toaVar4 = toaVar3;
                    bVar2 = bVar;
                } else {
                    cVar = cVar2;
                    if (jMin == -9223372036854775807L) {
                        obj = obj2;
                        iA = toaVar11.g(obj, bVar6).c;
                    } else if (z13) {
                        i28Var.a.g(bVar8.a, bVar6);
                        if (i28Var.a.m(bVar6.c, cVar, 0L).n == i28Var.a.b(bVar8.a)) {
                            Pair<Object, Long> pairI = toaVar11.i(cVar, bVar6, toaVar11.g(obj, bVar6).c, jMin + bVar6.e);
                            obj = pairI.first;
                            j2 = ((Long) pairI.second).longValue();
                        } else {
                            j2 = toaVar11.g(obj, bVar6).d != -9223372036854775807L ? n6b.j(jMin, 0L, bVar6.d - 1) : jMin;
                        }
                        jMin = j2;
                        iA = -1;
                        z2 = false;
                        z3 = false;
                        z4 = true;
                        toaVar4 = toaVar11;
                        bVar2 = bVar6;
                    } else {
                        iA = -1;
                    }
                }
                z2 = false;
                z3 = false;
                toaVar3 = toaVar11;
                bVar = bVar6;
                z4 = false;
                toaVar4 = toaVar3;
                bVar2 = bVar;
            }
            if (iA != -1) {
                Pair<Object, Long> pairI2 = toaVar4.i(cVar, bVar2, iA, -9223372036854775807L);
                obj = pairI2.first;
                jMin = ((Long) pairI2.second).longValue();
                j3 = -9223372036854775807L;
            } else {
                j3 = jMin;
            }
            bq6.b bVarQ = hVar.q(toaVar4, obj, jMin);
            int i4 = bVarQ.e;
            boolean z15 = i4 == -1 || ((i2 = bVar8.e) != -1 && i4 >= i2);
            boolean zEquals = bVar8.a.equals(obj);
            boolean z16 = zEquals && !bVar8.b() && !bVarQ.b() && z15;
            toa.b bVarG = toaVar4.g(obj, bVar2);
            if (z13 || jMin != j3) {
                j4 = j3;
            } else {
                Object obj3 = bVar8.a;
                int i5 = bVar8.b;
                j4 = j3;
                if (obj3.equals(bVarQ.a)) {
                    if (bVar8.b()) {
                        bVarG.g(i5);
                    }
                    if (bVarQ.b()) {
                        bVarG.g(bVarQ.b);
                    }
                }
            }
            if (z16) {
                bVarQ = bVar8;
            }
            if (!bVarQ.b()) {
                if (zEquals && bVar8.b()) {
                    sa.a aVarA = toaVar4.g(obj, bVar2).g.a(bVar8.b);
                    aVarA.getClass();
                    long j13 = i28Var.c;
                    j5 = 0;
                    if (j13 == -9223372036854775807L || 0 > j13) {
                        int i6 = aVarA.a;
                        int i7 = bVar8.c;
                        if (i6 > i7 && aVarA.e[i7] == 2) {
                            long j14 = toaVar4.g(obj, bVar2).d;
                            if (j14 != -9223372036854775807L) {
                                jMin = Math.min(j14 - j, jMin);
                            }
                            j6 = jMin;
                            j7 = j6;
                        }
                    }
                } else {
                    j5 = 0;
                }
                j6 = jMin;
                j7 = j4;
            } else if (bVarQ.equals(bVar8)) {
                j6 = i28Var.s;
                j7 = j4;
                j5 = 0;
            } else {
                toaVar4.g(bVarQ.a, bVar2);
                if (bVarQ.c == bVar2.e(bVarQ.b)) {
                    bVar2.g.getClass();
                }
                j7 = j4;
                j5 = 0;
                j6 = 0;
            }
            boolean z17 = (bVarQ.equals(i28Var.b) && j6 == i28Var.s) ? false : true;
            int i8 = toaVar4.b(i28Var.b.a) == -1 ? 4 : 3;
            if (!bVarQ.a.equals(i28Var.b.a) || bVarQ.b == -1) {
                i = i8;
            } else {
                sa.a aVarA2 = toaVar4.g(bVarQ.a, bVar2).g.a(bVarQ.b);
                int i9 = bVarQ.c;
                int[] iArr = aVarA2.e;
                if (i9 >= iArr.length || iArr[i9] != 2) {
                    i = 0;
                } else {
                    i = i8;
                }
            }
            fVar = new f(bVarQ, j6, j7, z2, z3, z4, z17, z17 && z && !i28Var.a.p() && !i28Var.a.g(i28Var.b.a, bVar2).f, i);
            toaVar6 = toaVar4;
            toaVar5 = bVar2;
        }
        bq6.b bVar9 = fVar.a;
        long jX = fVar.b;
        try {
            if (fVar.e) {
                z9 = true;
                if (this.b0.e != 1) {
                    n0(4);
                }
                O(false, false, false, true);
            } else {
                z9 = true;
            }
            for (nn8 nn8Var : this.t) {
                nn8Var.a.j(toaVar6);
                k kVar = nn8Var.c;
                if (kVar != null) {
                    kVar.j(toaVar6);
                }
            }
            try {
                if (fVar.g) {
                    toaVar5 = toaVar6;
                    if (toaVar5.p()) {
                        bVar3 = bVar9;
                    } else {
                        for (vp6 vp6Var2 = this.L.j; vp6Var2 != null; vp6Var2 = vp6Var2.m) {
                            if (vp6Var2.g.a.equals(bVar9)) {
                                vp6Var2.g = this.L.h(toaVar5, vp6Var2.g);
                                vp6Var2.k();
                            }
                        }
                        boolean z18 = fVar.d;
                        try {
                            h hVar2 = this.L;
                            bVar3 = bVar9;
                            try {
                                jX = X(bVar3, jX, hVar2.j != hVar2.k ? z9 : false, z18);
                            } catch (Throwable th) {
                                th = th;
                                jX = jX;
                                toaVar8 = toaVar5;
                                toaVar7 = toaVar8;
                                i28 i28Var2 = this.b0;
                                toa toaVar12 = i28Var2.a;
                                bq6.b bVar10 = i28Var2.b;
                                if (fVar.f) {
                                    j8 = jX;
                                } else {
                                    j8 = -9223372036854775807L;
                                }
                                bVar4 = bVar3;
                                C0(toaVar7, bVar4, toaVar12, bVar10, j8, false);
                                if (fVar.g) {
                                    long j15 = fVar.c;
                                    z8 = fVar.h;
                                    if (z8) {
                                        j9 = jX;
                                    } else {
                                        j9 = this.b0.d;
                                    }
                                    this.b0 = y(bVar4, jX, j15, j9, z8, fVar.i);
                                } else {
                                    long j16 = fVar.c;
                                    z8 = fVar.h;
                                    if (z8) {
                                        j9 = jX;
                                    } else {
                                        j9 = this.b0.d;
                                    }
                                    this.b0 = y(bVar4, jX, j16, j9, z8, fVar.i);
                                }
                                P();
                                R(toaVar7, this.b0.a);
                                this.b0 = this.b0.j(toaVar7);
                                if (!toaVar7.p()) {
                                    this.p0 = null;
                                }
                                u(false);
                                this.A.k(2);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            bVar3 = bVar9;
                            toaVar8 = toaVar5;
                            toaVar7 = toaVar8;
                            i28 i28Var3 = this.b0;
                            toa toaVar13 = i28Var3.a;
                            bq6.b bVar11 = i28Var3.b;
                            if (fVar.f) {
                                j8 = jX;
                            } else {
                                j8 = -9223372036854775807L;
                            }
                            bVar4 = bVar3;
                            C0(toaVar7, bVar4, toaVar13, bVar11, j8, false);
                            if (fVar.g) {
                                long j17 = fVar.c;
                                z8 = fVar.h;
                                if (z8) {
                                    j9 = jX;
                                } else {
                                    j9 = this.b0.d;
                                }
                                this.b0 = y(bVar4, jX, j17, j9, z8, fVar.i);
                            } else {
                                long j18 = fVar.c;
                                z8 = fVar.h;
                                if (z8) {
                                    j9 = jX;
                                } else {
                                    j9 = this.b0.d;
                                }
                                this.b0 = y(bVar4, jX, j18, j9, z8, fVar.i);
                            }
                            P();
                            R(toaVar7, this.b0.a);
                            this.b0 = this.b0.j(toaVar7);
                            if (!toaVar7.p()) {
                                this.p0 = null;
                            }
                            u(false);
                            this.A.k(2);
                            throw th;
                        }
                    }
                    i28 i28Var4 = this.b0;
                    toa toaVar14 = i28Var4.a;
                    bq6.b bVar12 = i28Var4.b;
                    if (fVar.f) {
                        j10 = jX;
                    } else {
                        j10 = -9223372036854775807L;
                    }
                    bVar5 = bVar3;
                    C0(toaVar, bVar5, toaVar14, bVar12, j10, false);
                    if (fVar.g) {
                        long j19 = fVar.c;
                        z10 = fVar.h;
                        if (z10) {
                            j11 = jX;
                        } else {
                            j11 = this.b0.d;
                        }
                        this.b0 = y(bVar5, jX, j19, j11, z10, fVar.i);
                    } else {
                        long j110 = fVar.c;
                        z10 = fVar.h;
                        if (z10) {
                            j11 = jX;
                        } else {
                            j11 = this.b0.d;
                        }
                        this.b0 = y(bVar5, jX, j110, j11, z10, fVar.i);
                    }
                    P();
                    R(toaVar, this.b0.a);
                    this.b0 = this.b0.j(toaVar);
                    if (!toaVar.p()) {
                        this.p0 = null;
                    }
                    u(false);
                    this.A.k(2);
                    return;
                }
                try {
                    vp6 vp6Var3 = this.L.k;
                    try {
                        try {
                            int iT2 = this.L.t(toaVar, this.q0, vp6Var3 == null ? j5 : n(vp6Var3), (!e() || (vp6Var = this.L.l) == null) ? j5 : n(vp6Var));
                            if ((iT2 & 1) != 0) {
                                V(false);
                            } else if ((iT2 & 2) != 0) {
                                h();
                            }
                            bVar3 = bVar9;
                            i28 i28Var5 = this.b0;
                            toa toaVar15 = i28Var5.a;
                            bq6.b bVar13 = i28Var5.b;
                            if (fVar.f) {
                                j10 = jX;
                            } else {
                                j10 = -9223372036854775807L;
                            }
                            bVar5 = bVar3;
                            C0(toaVar, bVar5, toaVar15, bVar13, j10, false);
                            if (fVar.g || fVar.c != this.b0.c) {
                                long j111 = fVar.c;
                                z10 = fVar.h;
                                if (z10) {
                                    j11 = jX;
                                } else {
                                    j11 = this.b0.d;
                                }
                                this.b0 = y(bVar5, jX, j111, j11, z10, fVar.i);
                            }
                            P();
                            R(toaVar, this.b0.a);
                            this.b0 = this.b0.j(toaVar);
                            if (!toaVar.p()) {
                                this.p0 = null;
                            }
                            u(false);
                            this.A.k(2);
                            return;
                        } catch (Throwable th3) {
                            th = th3;
                            toaVar5 = toaVar;
                            bVar3 = bVar9;
                            toaVar8 = toaVar5;
                            toaVar7 = toaVar8;
                            i28 i28Var6 = this.b0;
                            toa toaVar16 = i28Var6.a;
                            bq6.b bVar14 = i28Var6.b;
                            if (fVar.f) {
                                j8 = jX;
                            } else {
                                j8 = -9223372036854775807L;
                            }
                            bVar4 = bVar3;
                            C0(toaVar7, bVar4, toaVar16, bVar14, j8, false);
                            if (fVar.g) {
                                long j112 = fVar.c;
                                z8 = fVar.h;
                                if (z8) {
                                    j9 = jX;
                                } else {
                                    j9 = this.b0.d;
                                }
                                this.b0 = y(bVar4, jX, j112, j9, z8, fVar.i);
                            } else {
                                long j113 = fVar.c;
                                z8 = fVar.h;
                                if (z8) {
                                    j9 = jX;
                                } else {
                                    j9 = this.b0.d;
                                }
                                this.b0 = y(bVar4, jX, j113, j9, z8, fVar.i);
                            }
                            P();
                            R(toaVar7, this.b0.a);
                            this.b0 = this.b0.j(toaVar7);
                            if (!toaVar7.p()) {
                                this.p0 = null;
                            }
                            u(false);
                            this.A.k(2);
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        toaVar5 = toaVar;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    toaVar5 = toaVar6;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            th = th7;
            toaVar7 = toaVar6;
            bVar3 = bVar9;
        }
        i28 i28Var7 = this.b0;
        toa toaVar17 = i28Var7.a;
        bq6.b bVar15 = i28Var7.b;
        if (fVar.f) {
            j8 = jX;
        } else {
            j8 = -9223372036854775807L;
        }
        bVar4 = bVar3;
        C0(toaVar7, bVar4, toaVar17, bVar15, j8, false);
        if (fVar.g || fVar.c != this.b0.c) {
            long j114 = fVar.c;
            z8 = fVar.h;
            if (z8) {
                j9 = jX;
            } else {
                j9 = this.b0.d;
            }
            this.b0 = y(bVar4, jX, j114, j9, z8, fVar.i);
        }
        P();
        R(toaVar7, this.b0.a);
        this.b0 = this.b0.j(toaVar7);
        if (!toaVar7.p()) {
            this.p0 = null;
        }
        u(false);
        this.A.k(2);
        throw th;
    }

    public final void v0() {
        fs2 fs2Var = this.H;
        fs2Var.y = false;
        ez9 ez9Var = fs2Var.t;
        if (ez9Var.u) {
            ez9Var.a(ez9Var.g());
            ez9Var.u = false;
        }
        for (nn8 nn8Var : this.t) {
            k kVar = nn8Var.c;
            k kVar2 = nn8Var.a;
            if (nn8.g(kVar2) && kVar2.getState() == 2) {
                kVar2.stop();
            }
            if (kVar != null && kVar.getState() != 0 && kVar.getState() == 2) {
                kVar.stop();
            }
        }
    }

    public final void w(up6 up6Var) {
        vp6 vp6Var;
        e eVar;
        h hVar = this.L;
        vp6 vp6Var2 = hVar.m;
        fs2 fs2Var = this.H;
        if (vp6Var2 != null && vp6Var2.a == up6Var) {
            vp6Var2.getClass();
            if (!vp6Var2.e) {
                float f2 = fs2Var.e().a;
                i28 i28Var = this.b0;
                vp6Var2.f(f2, i28Var.a, i28Var.l);
            }
            x0(vp6Var2.g.a, vp6Var2.n, vp6Var2.o);
            if (vp6Var2 == hVar.j) {
                Q(vp6Var2.g.b, true);
                l(new boolean[this.t.length], hVar.k.e());
                vp6Var2.h = true;
                i28 i28Var2 = this.b0;
                bq6.b bVar = i28Var2.b;
                long j = vp6Var2.g.b;
                eVar = this;
                eVar.b0 = y(bVar, j, i28Var2.c, j, false, 5);
            } else {
                eVar = this;
            }
            eVar.C();
            return;
        }
        int i = 0;
        while (true) {
            if (i >= hVar.r.size()) {
                vp6Var = null;
                break;
            }
            vp6Var = (vp6) hVar.r.get(i);
            if (vp6Var.a == up6Var) {
                break;
            } else {
                i++;
            }
        }
        if (vp6Var != null) {
            xl7.r(!vp6Var.e);
            float f3 = fs2Var.e().a;
            i28 i28Var3 = this.b0;
            vp6Var.f(f3, i28Var3.a, i28Var3.l);
            vp6 vp6Var3 = hVar.n;
            if (vp6Var3 == null || vp6Var3.a != up6Var) {
                return;
            }
            D();
        }
    }

    public final void w0() {
        vp6 vp6Var = this.L.m;
        boolean z = this.i0 || (vp6Var != null && vp6Var.a.j());
        i28 i28Var = this.b0;
        if (z != i28Var.g) {
            this.b0 = i28Var.b(z);
        }
    }

    public final void x(k28 k28Var, float f2, boolean z, boolean z2) {
        int i;
        if (z) {
            if (z2) {
                this.c0.a(1);
            }
            this.b0 = this.b0.g(k28Var);
        }
        float f3 = k28Var.a;
        vp6 vp6Var = this.L.j;
        while (true) {
            i = 0;
            if (vp6Var == null) {
                break;
            }
            fq3[] fq3VarArr = vp6Var.o.c;
            int length = fq3VarArr.length;
            while (i < length) {
                fq3 fq3Var = fq3VarArr[i];
                if (fq3Var != null) {
                    fq3Var.u(f3);
                }
                i++;
            }
            vp6Var = vp6Var.m;
        }
        nn8[] nn8VarArr = this.t;
        int length2 = nn8VarArr.length;
        while (i < length2) {
            nn8 nn8Var = nn8VarArr[i];
            float f4 = k28Var.a;
            nn8Var.a.v(f2, f4);
            k kVar = nn8Var.c;
            if (kVar != null) {
                kVar.v(f2, f4);
            }
            i++;
        }
    }

    public final void x0(bq6.b bVar, gsa gsaVar, nsa nsaVar) {
        h hVar = this.L;
        vp6 vp6Var = hVar.m;
        vp6Var.getClass();
        vp6 vp6Var2 = hVar.j;
        long j = this.q0;
        long j2 = vp6Var.p;
        if (vp6Var != vp6Var2) {
            j -= j2;
            j2 = vp6Var.g.b;
        }
        long j3 = j - j2;
        long jP = p(vp6Var.d());
        long j4 = s0(this.b0.a, vp6Var.g.a) ? ((ds2) this.N).h : -9223372036854775807L;
        toa toaVar = this.b0.a;
        float f2 = this.H.e().a;
        boolean z = this.b0.l;
        this.y.j(new androidx.media3.exoplayer.f.a(this.P, toaVar, bVar, j3, jP, f2, this.g0, j4), nsaVar.c);
    }

    public final i28 y(bq6.b bVar, long j, long j2, long j3, boolean z, int i) {
        ul8 ul8VarG;
        boolean z2;
        this.t0 = (!this.t0 && j == this.b0.s && bVar.equals(this.b0.b)) ? false : true;
        P();
        i28 i28Var = this.b0;
        gsa gsaVar = i28Var.h;
        nsa nsaVar = i28Var.i;
        List<su6> list = i28Var.j;
        if (this.M.k) {
            vp6 vp6Var = this.L.j;
            gsaVar = vp6Var == null ? gsa.d : vp6Var.n;
            nsaVar = vp6Var == null ? this.x : vp6Var.o;
            fq3[] fq3VarArr = nsaVar.c;
            k95.a aVar = new k95.a();
            boolean z3 = false;
            for (fq3 fq3Var : fq3VarArr) {
                if (fq3Var != null) {
                    su6 su6Var = fq3Var.b(0).l;
                    if (su6Var == null) {
                        aVar.c(new su6(new su6.a[0]));
                    } else {
                        aVar.c(su6Var);
                        z3 = true;
                    }
                }
            }
            if (z3) {
                ul8VarG = aVar.g();
            } else {
                k95.b bVar2 = k95.u;
                ul8VarG = ul8.x;
            }
            list = ul8VarG;
            if (vp6Var != null) {
                wp6 wp6Var = vp6Var.g;
                if (wp6Var.d != j2) {
                    vp6Var.g = wp6Var.a(j2);
                }
            }
            nn8[] nn8VarArr = this.t;
            h hVar = this.L;
            vp6 vp6Var2 = hVar.j;
            if (vp6Var2 == hVar.k && vp6Var2 != null) {
                nsa nsaVar2 = vp6Var2.o;
                int i2 = 0;
                boolean z4 = false;
                while (true) {
                    if (i2 >= nn8VarArr.length) {
                        z2 = true;
                        break;
                    }
                    if (nsaVar2.b(i2)) {
                        if (nn8VarArr[i2].a.F() != 1) {
                            z2 = false;
                            break;
                        }
                        if (nsaVar2.b[i2].a != 0) {
                            z4 = true;
                        }
                    }
                    i2++;
                }
                boolean z5 = z4 && z2;
                if (z5 != this.n0) {
                    this.n0 = z5;
                    if (!z5 && this.b0.p) {
                        this.A.k(2);
                    }
                }
            }
        } else if (!bVar.equals(i28Var.b)) {
            gsaVar = gsa.d;
            nsaVar = this.x;
            list = ul8.x;
        }
        nsa nsaVar3 = nsaVar;
        List<su6> list2 = list;
        gsa gsaVar2 = gsaVar;
        if (z) {
            C0022e c0022e = this.c0;
            if (!c0022e.d || c0022e.e == 5) {
                c0022e.a = true;
                c0022e.d = true;
                c0022e.e = i;
            } else {
                xl7.g(i == 5);
            }
        }
        i28 i28Var2 = this.b0;
        return i28Var2.d(bVar, j, j2, j3, p(i28Var2.q), gsaVar2, nsaVar3, list2);
    }

    public final void y0(int i, int i2, List<co6> list) throws Throwable {
        this.c0.a(1);
        i iVar = this.M;
        iVar.getClass();
        ArrayList arrayList = iVar.b;
        xl7.g(i >= 0 && i <= i2 && i2 <= arrayList.size());
        xl7.g(list.size() == i2 - i);
        for (int i3 = i; i3 < i2; i3++) {
            ((i.c) arrayList.get(i3)).a.m(list.get(i3 - i));
        }
        v(iVar.b(), false);
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0203  */
    /* JADX WARN: Code duplicated, block: B:117:0x0236 A[EDGE_INSN: B:117:0x0236->B:247:0x0433 BREAK  A[LOOP:6: B:127:0x024b->B:133:0x0260]] */
    /* JADX WARN: Code duplicated, block: B:202:0x0392  */
    /* JADX WARN: Code duplicated, block: B:204:0x0397  */
    /* JADX WARN: Code duplicated, block: B:211:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:227:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:314:0x0522  */
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
    public final void z0() {
        vp6 vp6Var;
        int i;
        int i2;
        int length;
        int i3;
        k kVar;
        boolean zB;
        k kVar2;
        byte b2;
        int i4;
        int i5;
        vp6 vp6Var2;
        vp6 vp6Var3;
        boolean z;
        boolean z2;
        vp6 vp6Var4;
        vp6 vp6Var5;
        boolean z3;
        nsa nsaVar;
        vp6 vp6Var6;
        int i6;
        if (this.b0.a.p() || !this.M.k) {
            return;
        }
        this.L.m(this.q0);
        h hVar = this.L;
        vp6 vp6Var7 = hVar.m;
        if (vp6Var7 == null || (!vp6Var7.g.k && vp6Var7.g() && hVar.m.g.f != -9223372036854775807L && hVar.o < 100)) {
            h hVar2 = this.L;
            long j = this.q0;
            i28 i28Var = this.b0;
            vp6 vp6Var8 = hVar2.m;
            wp6 wp6VarD = vp6Var8 == null ? hVar2.d(i28Var.a, i28Var.b, i28Var.c, i28Var.s, -9223372036854775807L) : hVar2.c(i28Var.a, vp6Var8, j);
            if (wp6VarD != null) {
                h hVar3 = this.L;
                vp6 vp6Var9 = hVar3.m;
                long j2 = vp6Var9 == null ? 1000000000000L : (vp6Var9.p + vp6Var9.g.f) - wp6VarD.b;
                int i7 = 0;
                while (true) {
                    if (i7 >= hVar3.r.size()) {
                        vp6Var = null;
                        break;
                    }
                    wp6 wp6Var = ((vp6) hVar3.r.get(i7)).g;
                    long j3 = wp6Var.f;
                    long j4 = wp6VarD.f;
                    if ((j3 == -9223372036854775807L || j3 == j4) && wp6Var.b == wp6VarD.b && wp6Var.a.equals(wp6VarD.a)) {
                        vp6Var = (vp6) hVar3.r.remove(i7);
                        break;
                    }
                    i7++;
                }
                if (vp6Var == null) {
                    e eVar = (e) hVar3.e.t;
                    l[] lVarArr = eVar.u;
                    msa msaVar = eVar.w;
                    androidx.media3.exoplayer.c.a aVarI = eVar.y.i(eVar.P);
                    i iVar = eVar.M;
                    nsa nsaVar2 = eVar.x;
                    eVar.w0.getClass();
                    vp6Var = new vp6(lVarArr, j2, msaVar, aVarI, iVar, wp6VarD, nsaVar2);
                } else {
                    vp6Var.g = wp6VarD;
                    vp6Var.p = j2;
                }
                vp6 vp6Var10 = hVar3.m;
                if (vp6Var10 == null) {
                    hVar3.j = vp6Var;
                    hVar3.k = vp6Var;
                    hVar3.l = vp6Var;
                } else if (vp6Var != vp6Var10.m) {
                    vp6Var10.b();
                    vp6Var10.m = vp6Var;
                    vp6Var10.c();
                }
                hVar3.p = null;
                hVar3.m = vp6Var;
                hVar3.o++;
                hVar3.l();
                if (!vp6Var.d) {
                    long j5 = wp6VarD.b;
                    vp6Var.d = true;
                    vp6Var.a.m(this, j5);
                } else if (vp6Var.e) {
                    this.A.m(8, vp6Var.a).b();
                }
                if (this.L.j == vp6Var) {
                    Q(wp6VarD.b, true);
                }
                u(false);
            }
        }
        if (this.i0) {
            this.i0 = z(this.L.m);
            w0();
        } else {
            C();
        }
        h hVar4 = this.L;
        if (!this.f0 && this.S && !this.y0 && !e() && (vp6Var4 = hVar4.l) != null && vp6Var4 == hVar4.k && (vp6Var5 = vp6Var4.m) != null && (z3 = vp6Var5.e)) {
            xl7.r(z3);
            if (((long) ((vp6Var5.e() - this.q0) / this.H.e().a)) <= 10000000) {
                vp6 vp6Var11 = hVar4.l;
                vp6Var11.getClass();
                hVar4.l = vp6Var11.m;
                hVar4.l();
                hVar4.l.getClass();
                nn8[] nn8VarArr = this.t;
                vp6 vp6Var12 = hVar4.l;
                if (vp6Var12 != null) {
                    nsa nsaVar3 = vp6Var12.o;
                    vp6 vp6Var13 = vp6Var12;
                    int i8 = 0;
                    while (i8 < nn8VarArr.length) {
                        if (nsaVar3.b(i8)) {
                            nn8 nn8Var = nn8VarArr[i8];
                            if (nn8Var.c == null || nn8Var.e()) {
                                nsaVar = nsaVar3;
                                vp6Var6 = vp6Var13;
                            } else {
                                nn8 nn8Var2 = nn8VarArr[i8];
                                xl7.r(!nn8Var2.e());
                                if (nn8.g(nn8Var2.a)) {
                                    i6 = 3;
                                } else {
                                    k kVar3 = nn8Var2.c;
                                    i6 = (kVar3 == null || kVar3.getState() == 0) ? 2 : 4;
                                }
                                nn8Var2.d = i6;
                                vp6Var6 = vp6Var13;
                                nsaVar = nsaVar3;
                                k(vp6Var6, i8, false, vp6Var6.e());
                            }
                        } else {
                            nsaVar = nsaVar3;
                            vp6Var6 = vp6Var13;
                        }
                        i8++;
                        vp6Var13 = vp6Var6;
                        nn8VarArr = nn8VarArr;
                        nsaVar3 = nsaVar;
                    }
                    vp6 vp6Var14 = vp6Var13;
                    if (e()) {
                        this.x0 = vp6Var14.a.l();
                        if (!vp6Var14.g()) {
                            hVar4.o(vp6Var14);
                            u(false);
                            C();
                        }
                    }
                }
            }
        }
        boolean z4 = this.S;
        nn8[] nn8VarArr2 = this.t;
        h hVar5 = this.L;
        vp6 vp6Var15 = hVar5.k;
        if (vp6Var15 == null) {
            i = 2;
            break;
        }
        if (vp6Var15.m != null && !this.f0) {
            if (!vp6Var15.e) {
                i = 2;
                break;
            }
            int i9 = 0;
            while (true) {
                if (i9 < nn8VarArr2.length) {
                    nn8 nn8Var3 = nn8VarArr2[i9];
                    if (nn8Var3.d(vp6Var15, nn8Var3.a) && nn8Var3.d(vp6Var15, nn8Var3.c)) {
                        i9++;
                    }
                } else if (!e() || hVar5.l != hVar5.k) {
                    vp6 vp6Var16 = vp6Var15.m;
                    if (vp6Var16.e || this.q0 >= vp6Var16.e()) {
                        vp6 vp6Var17 = vp6Var15.m;
                        boolean z5 = vp6Var17.e;
                        if (z5) {
                            xl7.r(z5);
                            if (((long) ((vp6Var17.e() - this.q0) / this.H.e().a)) > 10000000) {
                                break;
                            }
                        }
                        nsa nsaVar4 = vp6Var15.o;
                        vp6 vp6Var18 = hVar5.l;
                        vp6 vp6Var19 = hVar5.k;
                        if (vp6Var18 == vp6Var19) {
                            vp6Var19.getClass();
                            hVar5.l = vp6Var19.m;
                        }
                        vp6 vp6Var20 = hVar5.k;
                        vp6Var20.getClass();
                        hVar5.k = vp6Var20.m;
                        hVar5.l();
                        vp6 vp6Var21 = hVar5.k;
                        vp6Var21.getClass();
                        nsa nsaVar5 = vp6Var21.o;
                        toa toaVar = this.b0.a;
                        C0(toaVar, vp6Var21.g.a, toaVar, vp6Var15.g.a, -9223372036854775807L, false);
                        if (!vp6Var21.e || ((!z4 || this.x0 == -9223372036854775807L) && vp6Var21.a.l() == -9223372036854775807L)) {
                            i2 = 2;
                            length = nn8VarArr2.length;
                            i3 = 0;
                            while (i3 < length) {
                                nn8 nn8Var4 = nn8VarArr2[i3];
                                long jE = vp6Var21.e();
                                kVar = nn8Var4.a;
                                int i10 = nn8Var4.b;
                                zB = nsaVar4.b(i10);
                                boolean zB2 = nsaVar5.b(i10);
                                kVar2 = nn8Var4.c;
                                if (kVar2 != null || (i4 = nn8Var4.d) == 3 || (i4 == 0 && nn8.g(kVar))) {
                                    kVar2 = kVar;
                                }
                                if (zB || kVar2.C()) {
                                    b2 = -2;
                                } else {
                                    int iF = kVar.F();
                                    b2 = -2;
                                    boolean z6 = iF == -2;
                                    mn8 mn8Var = nsaVar4.b[i10];
                                    mn8 mn8Var2 = nsaVar5.b[i10];
                                    if (!zB2 || !Objects.equals(mn8Var2, mn8Var) || z6 || nn8Var4.e()) {
                                        nn8.k(kVar2, jE);
                                    }
                                }
                                i3++;
                                i2 = 2;
                            }
                        } else {
                            this.x0 = -9223372036854775807L;
                            boolean z7 = z4 && !this.y0;
                            if (z7) {
                                for (int i11 = 0; i11 < nn8VarArr2.length; i11++) {
                                    boolean zB3 = nsaVar5.b(i11);
                                    fq3[] fq3VarArr = nsaVar5.c;
                                    if (zB3 && nn8VarArr2[i11].a.F() != -2 && !fv6.a(fq3VarArr[i11].r().o, fq3VarArr[i11].r().k) && !nn8VarArr2[i11].e()) {
                                        z7 = false;
                                        break;
                                    }
                                }
                            }
                            if (z7) {
                                i2 = 2;
                                length = nn8VarArr2.length;
                                i3 = 0;
                                while (i3 < length) {
                                    nn8 nn8Var5 = nn8VarArr2[i3];
                                    long jE2 = vp6Var21.e();
                                    kVar = nn8Var5.a;
                                    int i12 = nn8Var5.b;
                                    zB = nsaVar4.b(i12);
                                    boolean zB4 = nsaVar5.b(i12);
                                    kVar2 = nn8Var5.c;
                                    if (kVar2 != null) {
                                        kVar2 = kVar;
                                    } else {
                                        kVar2 = kVar;
                                    }
                                    if (zB) {
                                        b2 = -2;
                                    } else {
                                        b2 = -2;
                                    }
                                    i3++;
                                    i2 = 2;
                                }
                            } else {
                                long jE3 = vp6Var21.e();
                                for (nn8 nn8Var6 : nn8VarArr2) {
                                    k kVar4 = nn8Var6.c;
                                    k kVar5 = nn8Var6.a;
                                    if (nn8.g(kVar5) && (i5 = nn8Var6.d) != 4) {
                                        if (i5 != 2) {
                                            nn8.k(kVar5, jE3);
                                        }
                                    }
                                    if (kVar4 != null && kVar4.getState() != 0 && nn8Var6.d != 3) {
                                        nn8.k(kVar4, jE3);
                                    }
                                }
                                i2 = 2;
                                if (!vp6Var21.g()) {
                                    hVar5.o(vp6Var21);
                                    u(false);
                                    C();
                                }
                            }
                        }
                        i = i2;
                        break;
                    }
                }
                i = 2;
                break;
            }
        }
        i = 2;
        if (vp6Var15.g.k || this.f0) {
            for (nn8 nn8Var7 : nn8VarArr2) {
                if (nn8Var7.c(vp6Var15) != null) {
                    k kVarC = nn8Var7.c(vp6Var15);
                    kVarC.getClass();
                    if (kVarC.k()) {
                        long j6 = vp6Var15.g.f;
                        long j7 = (j6 == -9223372036854775807L || j6 == Long.MIN_VALUE) ? -9223372036854775807L : vp6Var15.p + j6;
                        k kVarC2 = nn8Var7.c(vp6Var15);
                        kVarC2.getClass();
                        nn8.k(kVarC2, j7);
                    }
                }
            }
        }
        h hVar6 = this.L;
        vp6 vp6Var22 = hVar6.k;
        if (vp6Var22 != null && hVar6.j != vp6Var22 && !vp6Var22.h) {
            nn8[] nn8VarArr3 = this.t;
            nsa nsaVar6 = vp6Var22.o;
            boolean z8 = true;
            for (int i13 = 0; i13 < nn8VarArr3.length; i13++) {
                int iB = nn8VarArr3[i13].b();
                nn8 nn8Var8 = nn8VarArr3[i13];
                fs2 fs2Var = this.H;
                int i14 = nn8Var8.i(nn8Var8.a, vp6Var22, nsaVar6, fs2Var);
                int i15 = nn8Var8.i(nn8Var8.c, vp6Var22, nsaVar6, fs2Var);
                if (i14 == 1) {
                    i14 = i15;
                }
                if ((i14 & 2) != 0 && (z2 = this.n0) && z2) {
                    this.n0 = false;
                    if (this.b0.p) {
                        this.A.k(i);
                    }
                }
                this.o0 -= iB - nn8VarArr3[i13].b();
                z8 &= (i14 & 1) != 0;
            }
            if (z8) {
                for (int i16 = 0; i16 < nn8VarArr3.length; i16++) {
                    if (nsaVar6.b(i16) && nn8VarArr3[i16].c(vp6Var22) == null) {
                        k(vp6Var22, i16, false, vp6Var22.e());
                    }
                }
            }
            if (z8) {
                hVar6.k.h = true;
            }
        }
        nn8[] nn8VarArr4 = this.t;
        h hVar7 = this.L;
        boolean z9 = false;
        while (r0() && !this.f0 && (vp6Var2 = hVar7.j) != null && (vp6Var3 = vp6Var2.m) != null && this.q0 >= vp6Var3.e() && vp6Var3.h) {
            if (z9) {
                E();
            }
            this.y0 = false;
            vp6 vp6VarA = hVar7.a();
            vp6VarA.getClass();
            if (this.b0.b.a.equals(vp6VarA.g.a.a)) {
                bq6.b bVar = this.b0.b;
                if (bVar.b == -1) {
                    bq6.b bVar2 = vp6VarA.g.a;
                    if (bVar2.b != -1 || bVar.e == bVar2.e) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            wp6 wp6Var2 = vp6VarA.g;
            boolean z10 = z;
            bq6.b bVar3 = wp6Var2.a;
            long j8 = wp6Var2.b;
            this.b0 = y(bVar3, j8, wp6Var2.d, j8, !z10, 0);
            P();
            B0();
            if (e() && vp6VarA == hVar7.l) {
                for (nn8 nn8Var9 : nn8VarArr4) {
                    int i17 = nn8Var9.d;
                    if (i17 == 3 || i17 == 4) {
                        boolean z11 = i17 == 4;
                        k kVar6 = nn8Var9.a;
                        k kVar7 = nn8Var9.c;
                        if (z11) {
                            kVar7.getClass();
                            kVar7.y(17, kVar6);
                        } else {
                            kVar7.getClass();
                            kVar6.y(17, kVar7);
                        }
                        nn8Var9.d = nn8Var9.d == 4 ? 0 : 1;
                    } else if (i17 == i) {
                        nn8Var9.d = 0;
                    }
                }
            }
            if (this.b0.e == 3) {
                t0();
            }
            nsa nsaVar7 = hVar7.j.o;
            for (int i18 = 0; i18 < nn8VarArr4.length; i18++) {
                if (nsaVar7.b(i18)) {
                    nn8 nn8Var10 = nn8VarArr4[i18];
                    k kVar8 = nn8Var10.c;
                    k kVar9 = nn8Var10.a;
                    if (nn8.g(kVar9)) {
                        kVar9.o();
                    } else if (kVar8 != null && kVar8.getState() != 0) {
                        kVar8.o();
                    }
                }
            }
            z9 = true;
        }
        this.w0.getClass();
    }
}
