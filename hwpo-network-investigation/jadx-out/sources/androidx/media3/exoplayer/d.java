package androidx.media3.exoplayer;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.exoplayer.d;
import androidx.media3.exoplayer.image.ImageOutput;
import defpackage.a89;
import defpackage.aa0;
import defpackage.ar9;
import defpackage.az2;
import defpackage.ba0;
import defpackage.bo9;
import defpackage.bq6;
import defpackage.bv1;
import defpackage.cj0;
import defpackage.co6;
import defpackage.cp3;
import defpackage.cp6;
import defpackage.cv2;
import defpackage.d43;
import defpackage.d75;
import defpackage.ekb;
import defpackage.emb;
import defpackage.eq3;
import defpackage.fq3;
import defpackage.gb6;
import defpackage.gsa;
import defpackage.hp3;
import defpackage.i28;
import defpackage.id4;
import defpackage.j3a;
import defpackage.k28;
import defpackage.k95;
import defpackage.kc2;
import defpackage.kp3;
import defpackage.kq6;
import defpackage.kt4;
import defpackage.ln2;
import defpackage.lo3;
import defpackage.lsa;
import defpackage.m52;
import defpackage.md6;
import defpackage.mn8;
import defpackage.msa;
import defpackage.n48;
import defpackage.n6b;
import defpackage.ng1;
import defpackage.ni0;
import defpackage.np6;
import defpackage.nsa;
import defpackage.o31;
import defpackage.on8;
import defpackage.op3;
import defpackage.pn2;
import defpackage.q70;
import defpackage.q95;
import defpackage.qx9;
import defpackage.rfb;
import defpackage.ri;
import defpackage.rx0;
import defpackage.s28;
import defpackage.su6;
import defpackage.t70;
import defpackage.tfb;
import defpackage.tk0;
import defpackage.toa;
import defpackage.u89;
import defpackage.ul1;
import defpackage.ul8;
import defpackage.up3;
import defpackage.veb;
import defpackage.vua;
import defpackage.w2b;
import defpackage.w8;
import defpackage.wi6;
import defpackage.wl1;
import defpackage.x38;
import defpackage.xl7;
import defpackage.xp3;
import defpackage.y34;
import defpackage.yp2;
import defpackage.yp3;
import defpackage.z7a;
import defpackage.zeb;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.function.IntConsumer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends tk0 implements ExoPlayer {
    public final emb A;
    public final long B;
    public final ni0<Integer> C;
    public final j3a D;
    public final e E;
    public final a F;
    public final a G;
    public int H;
    public boolean I;
    public int J;
    public int K;
    public boolean L;
    public boolean M;
    public q95<Integer> N;
    public final a89 O;
    public final u89 P;
    public bo9 Q;
    public final ExoPlayer.c R;
    public s28.a S;
    public np6 T;
    public Object U;
    public Surface V;
    public SurfaceHolder W;
    public qx9 X;
    public boolean Y;
    public TextureView Z;
    public final int a0;
    public final nsa b;
    public ar9 b0;
    public final s28.a c;
    public final q70 c0;
    public final bv1 d = new bv1();
    public boolean d0;
    public final Context e;
    public kc2 e0;
    public final d f;
    public final boolean f0;
    public final k[] g;
    public boolean g0;
    public final k[] h;
    public final int h0;
    public final msa i;
    public boolean i0;
    public final kt4 j;
    public tfb j0;
    public final ba0 k;
    public final long k0;
    public final androidx.media3.exoplayer.e l;
    public final long l0;
    public final gb6<s28.c> m;
    public final long m0;
    public final CopyOnWriteArraySet<ExoPlayer.a> n;
    public np6 n0;
    public final toa.b o;
    public i28 o0;
    public final ArrayList p;
    public int p0;
    public final boolean q;
    public long q0;
    public final bq6.a r;
    public final ri s;
    public final Looper t;
    public final cj0 u;
    public final z7a v;
    public final b w;
    public final c x;
    public final t70 y;
    public final ekb z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class a {
        public final HashMap a = new HashMap();
        public androidx.media3.exoplayer.b b = androidx.media3.exoplayer.b.b;

        public static void a(a aVar, androidx.media3.exoplayer.b bVar) {
            aVar.getClass();
            for (Map.Entry entry : new HashMap(aVar.a).entrySet()) {
                ng1 ng1Var = (ng1) entry.getKey();
                List list = (List) entry.getValue();
                if (!b(bVar, list).equals(b(aVar.b, list))) {
                    ng1Var.a();
                }
            }
            aVar.b = bVar;
        }

        public static androidx.media3.exoplayer.b b(androidx.media3.exoplayer.b bVar, List list) {
            bVar.getClass();
            Map<String, Object> map = bVar.a;
            HashMap map2 = new HashMap(map);
            HashSet hashSet = new HashSet(list);
            for (String str : map.keySet()) {
                if (!hashSet.contains(str)) {
                    map2.remove(str);
                }
            }
            return new androidx.media3.exoplayer.b(map2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c implements zeb, o31, j.b {
        public zeb t;
        public o31 u;
        public zeb v;
        public o31 w;

        @Override // defpackage.o31
        public final void c(long j, float[] fArr) {
            o31 o31Var = this.w;
            if (o31Var != null) {
                o31Var.c(j, fArr);
            }
            o31 o31Var2 = this.u;
            if (o31Var2 != null) {
                o31Var2.c(j, fArr);
            }
        }

        @Override // defpackage.o31
        public final void e() {
            o31 o31Var = this.w;
            if (o31Var != null) {
                o31Var.e();
            }
            o31 o31Var2 = this.u;
            if (o31Var2 != null) {
                o31Var2.e();
            }
        }

        @Override // defpackage.zeb
        public final void f(long j, long j2, id4 id4Var, MediaFormat mediaFormat) {
            zeb zebVar = this.v;
            if (zebVar != null) {
                zebVar.f(j, j2, id4Var, mediaFormat);
            }
            zeb zebVar2 = this.t;
            if (zebVar2 != null) {
                zebVar2.f(j, j2, id4Var, mediaFormat);
            }
        }

        @Override // androidx.media3.exoplayer.j.b
        public final void y(int i, Object obj) {
            if (i == 7) {
                this.t = (zeb) obj;
                return;
            }
            if (i == 8) {
                this.u = (o31) obj;
                return;
            }
            if (i != 10000) {
                return;
            }
            qx9 qx9Var = (qx9) obj;
            if (qx9Var == null) {
                this.v = null;
                this.w = null;
            } else {
                this.v = qx9Var.getVideoFrameMetadataListener();
                this.w = qx9Var.getCameraMotionListener();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class C0021d implements kq6 {
        public final Object a;
        public toa b;

        public C0021d(Object obj, wi6 wi6Var) {
            this.a = obj;
            this.b = wi6Var.o;
        }

        @Override // defpackage.kq6
        public final Object a() {
            return this.a;
        }

        @Override // defpackage.kq6
        public final toa b() {
            return this.b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class e {
        public final WeakReference<Context> a;
        public final xp3 b;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.function.IntConsumer, xp3] */
        public e(Context context) {
            this.a = new WeakReference<>(context);
            ?? r0 = new IntConsumer() { // from class: xp3
                @Override // java.util.function.IntConsumer
                public final void accept(int i) {
                    d dVar = d.this;
                    if (dVar.i0) {
                        return;
                    }
                    dVar.v0(1, 19, Integer.valueOf(i));
                }
            };
            this.b = r0;
            context.registerDeviceIdChangeListener(new yp3(d.this.v.b(d.this.t, null)), r0);
        }

        public static void a(e eVar) {
            Context context = eVar.a.get();
            if (context == null) {
                return;
            }
            context.unregisterDeviceIdChangeListener(eVar.b);
        }
    }

    static {
        cp6.a("media3.exoplayer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(ExoPlayer.b bVar) {
        Handler.Callback callback;
        try {
            md6.f("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + n6b.a + "]");
            Context context = bVar.a;
            Looper looper = bVar.i;
            z7a z7aVar = bVar.b;
            this.e = context.getApplicationContext();
            bVar.h.getClass();
            this.s = new yp2(z7aVar);
            this.h0 = bVar.j;
            this.c0 = bVar.k;
            this.a0 = bVar.l;
            this.d0 = false;
            this.B = bVar.u;
            b bVar2 = new b();
            this.w = bVar2;
            this.x = new c();
            Handler handler = new Handler(looper);
            on8 on8Var = (on8) bVar.c.get();
            k[] kVarArrA = on8Var.a(handler, bVar2, bVar2, bVar2, bVar2);
            this.g = kVarArrA;
            xl7.r(kVarArrA.length > 0);
            this.h = new k[kVarArrA.length];
            int i = 0;
            while (true) {
                k[] kVarArr = this.h;
                if (i >= kVarArr.length) {
                    break;
                }
                on8Var.b(this.g[i]);
                kVarArr[i] = null;
                i++;
            }
            this.i = bVar.e.get();
            this.r = bVar.d.get();
            this.u = (cj0) bVar.g.get();
            this.q = bVar.m;
            this.P = bVar.n;
            this.k0 = bVar.p;
            this.l0 = bVar.q;
            this.m0 = bVar.r;
            this.O = bVar.o;
            this.t = looper;
            this.v = z7aVar;
            this.f = this;
            this.m = new gb6<>(new CopyOnWriteArraySet(), looper, looper.getThread(), z7aVar, new aa0(), true);
            this.n = new CopyOnWriteArraySet<>();
            this.p = new ArrayList();
            this.Q = new bo9.a();
            this.R = ExoPlayer.c.a;
            k[] kVarArr2 = this.g;
            this.b = new nsa(new mn8[kVarArr2.length], new fq3[kVarArr2.length], vua.b, null);
            this.o = new toa.b();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            for (int i2 = 0; i2 < 20; i2++) {
                int i3 = iArr[i2];
                xl7.r(!false);
                sparseBooleanArray.append(i3, true);
            }
            msa msaVar = this.i;
            msaVar.getClass();
            if (msaVar instanceof cv2) {
                xl7.r(!false);
                sparseBooleanArray.append(29, true);
            }
            xl7.r(!false);
            y34 y34Var = new y34(sparseBooleanArray);
            SparseBooleanArray sparseBooleanArray2 = y34Var.a;
            this.c = new s28.a(y34Var);
            SparseBooleanArray sparseBooleanArray3 = new SparseBooleanArray();
            for (int i4 = 0; i4 < sparseBooleanArray2.size(); i4++) {
                xl7.k(i4, sparseBooleanArray2.size());
                int iKeyAt = sparseBooleanArray2.keyAt(i4);
                xl7.r(!false);
                sparseBooleanArray3.append(iKeyAt, true);
            }
            xl7.r(!false);
            sparseBooleanArray3.append(4, true);
            xl7.r(!false);
            sparseBooleanArray3.append(10, true);
            xl7.r(!false);
            this.S = new s28.a(new y34(sparseBooleanArray3));
            this.j = this.v.b(this.t, null);
            ba0 ba0Var = new ba0(this);
            this.k = ba0Var;
            this.o0 = i28.k(this.b);
            this.s.s(this.f, this.t);
            final x38 x38Var = new x38(bVar.B);
            Context context2 = this.e;
            k[] kVarArr3 = this.g;
            k[] kVarArr4 = this.h;
            msa msaVar2 = this.i;
            nsa nsaVar = this.b;
            bVar.f.getClass();
            androidx.media3.exoplayer.e eVar = new androidx.media3.exoplayer.e(context2, kVarArr3, kVarArr4, msaVar2, nsaVar, new androidx.media3.exoplayer.c(), this.u, this.H, this.I, this.s, this.P, bVar.s, bVar.t, this.t, this.v, ba0Var, x38Var, this.R, this.x, bVar.C);
            kt4 kt4Var = eVar.A;
            this.l = eVar;
            Looper looper2 = eVar.C;
            this.H = 0;
            np6 np6Var = np6.B;
            this.T = np6Var;
            this.n0 = np6Var;
            this.p0 = -1;
            this.e0 = kc2.c;
            this.f0 = true;
            n(this.s);
            this.u.a(new Handler(this.t), this.s);
            this.n.add(this.w);
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 31) {
                final Context context3 = this.e;
                final boolean z = bVar.z;
                z7a z7aVar2 = this.v;
                Looper looper3 = eVar.C;
                callback = null;
                z7aVar2.b(looper3, null).e(new Runnable() { // from class: pp3
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context4 = context3;
                        boolean z2 = z;
                        d dVar = this;
                        x38 x38Var2 = x38Var;
                        sp6 sp6VarO = sp6.o(context4);
                        if (sp6VarO == null) {
                            md6.g("ExoPlayerImpl", "MediaMetricsService unavailable.");
                            return;
                        }
                        if (z2) {
                            dVar.s.f0(sp6VarO);
                        }
                        LogSessionId logSessionIdQ = sp6VarO.q();
                        synchronized (x38Var2) {
                            x38.a aVar = x38Var2.b;
                            aVar.getClass();
                            aVar.a(logSessionIdQ);
                        }
                    }
                });
            } else {
                callback = null;
            }
            Handler.Callback callback2 = callback;
            ni0<Integer> ni0Var = new ni0<>(0, looper2, this.t, this.v, new ni0.a() { // from class: ap3
                @Override // ni0.a
                public final void a(Object obj, Object obj2) {
                    ((Integer) obj).getClass();
                    Integer num = (Integer) obj2;
                    final int iIntValue = num.intValue();
                    d dVar = this.a;
                    dVar.E0();
                    dVar.v0(1, 10, num);
                    dVar.v0(2, 10, num);
                    dVar.m.e(21, new gb6.a() { // from class: fp3
                        @Override // gb6.a
                        public final void invoke(Object obj3) {
                            ((s28.c) obj3).w(iIntValue);
                        }
                    });
                }
            });
            this.C = ni0Var;
            ni0Var.a(new Runnable() { // from class: bp3
                /* JADX WARN: Type inference failed for: r2v7, types: [T, java.lang.Integer, java.lang.Object] */
                @Override // java.lang.Runnable
                public final void run() {
                    Integer num;
                    d dVar = this.t;
                    final ni0<Integer> ni0Var2 = dVar.C;
                    Context context4 = dVar.e;
                    String str = n6b.a;
                    int iGenerateAudioSessionId = j80.b(context4).generateAudioSessionId();
                    if (iGenerateAudioSessionId == -1) {
                        iGenerateAudioSessionId = 0;
                    }
                    ni0Var2.getClass();
                    Looper looperMyLooper = Looper.myLooper();
                    if (looperMyLooper == ni0Var2.b.n()) {
                        num = ni0Var2.d;
                    } else {
                        xl7.r(looperMyLooper == ni0Var2.a.n());
                        num = ni0Var2.e;
                    }
                    if (num.intValue() != iGenerateAudioSessionId) {
                        final ?? ValueOf = Integer.valueOf(iGenerateAudioSessionId);
                        ni0Var2.e = ValueOf;
                        Runnable runnable = new Runnable() { // from class: ki0
                            @Override // java.lang.Runnable
                            public final void run() {
                                ni0 ni0Var3 = ni0Var2;
                                if (ni0Var3.f == 0) {
                                    ni0Var3.b(ValueOf);
                                }
                            }
                        };
                        kt4 kt4Var2 = ni0Var2.b;
                        if (kt4Var2.n().getThread().isAlive()) {
                            kt4Var2.e(runnable);
                        }
                        dVar.v0(1, 10, Integer.valueOf(iGenerateAudioSessionId));
                        dVar.v0(2, 10, Integer.valueOf(iGenerateAudioSessionId));
                    }
                }
            });
            t70 t70Var = new t70(bVar.a, looper2, bVar.i, this.w, this.v);
            this.y = t70Var;
            t70Var.a();
            boolean z2 = (bVar.v == Integer.MAX_VALUE || bVar.w == Integer.MAX_VALUE || bVar.x == Integer.MAX_VALUE || bVar.y == Integer.MAX_VALUE) ? false : true;
            ekb ekbVar = new ekb(context, looper2, this.v);
            this.z = ekbVar;
            if (ekbVar.d != z2) {
                ekbVar.d = z2;
                ekbVar.a(z2, ekbVar.e);
            }
            z7a z7aVar3 = this.v;
            emb embVar = new emb();
            context.getApplicationContext();
            z7aVar3.b(looper2, callback2);
            z7aVar3.b(Looper.getMainLooper(), callback2);
            this.A = embVar;
            int i6 = az2.c;
            this.j0 = tfb.d;
            this.b0 = ar9.c;
            this.E = i5 >= 34 ? new e(context) : callback2;
            this.F = new a();
            this.G = new a();
            this.D = new j3a(this, this.w, this.v, bVar.v, bVar.w, bVar.x, bVar.y);
            kt4Var.m(38, this.O).b();
            kt4Var.c(31, 0, this.c0).b();
            v0(1, 3, this.c0);
            v0(2, 4, Integer.valueOf(this.a0));
            v0(2, 5, 0);
            v0(1, 9, Boolean.valueOf(this.d0));
            v0(6, 8, this.x);
            v0(-1, 16, Integer.valueOf(this.h0));
        } finally {
            this.d.c();
        }
    }

    public static long p0(i28 i28Var) {
        toa.c cVar = new toa.c();
        toa.b bVar = new toa.b();
        i28Var.a.g(i28Var.b.a, bVar);
        long j = i28Var.c;
        return j == -9223372036854775807L ? i28Var.a.m(bVar.c, cVar, 0L).l : bVar.e + j;
    }

    public static i28 q0(i28 i28Var, int i) {
        i28 i28VarH = i28Var.h(i);
        return (i == 1 || i == 4) ? i28VarH.b(false) : i28VarH;
    }

    @Override // defpackage.s28
    public final int A() {
        E0();
        return this.o0.e;
    }

    public final void A0() {
        s28.a aVar = this.S;
        String str = n6b.a;
        d dVar = this.f;
        boolean zG = dVar.g();
        boolean zE0 = dVar.e0();
        boolean zA0 = dVar.a0();
        boolean Z = dVar.Z();
        boolean zD0 = dVar.d0();
        boolean zC0 = dVar.c0();
        boolean zP = dVar.N().p();
        s28.a.C0238a c0238a = new s28.a.C0238a();
        SparseBooleanArray sparseBooleanArray = this.c.a.a;
        y34.a aVar2 = c0238a.a;
        aVar2.getClass();
        boolean z = false;
        for (int i = 0; i < sparseBooleanArray.size(); i++) {
            xl7.k(i, sparseBooleanArray.size());
            aVar2.a(sparseBooleanArray.keyAt(i));
        }
        boolean z2 = !zG;
        c0238a.a(4, z2);
        c0238a.a(5, zE0 && !zG);
        c0238a.a(6, zA0 && !zG);
        c0238a.a(7, !zP && (zA0 || !zD0 || zE0) && !zG);
        c0238a.a(8, Z && !zG);
        c0238a.a(9, !zP && (Z || (zD0 && zC0)) && !zG);
        c0238a.a(10, z2);
        c0238a.a(11, zE0 && !zG);
        if (zE0 && !zG) {
            z = true;
        }
        c0238a.a(12, z);
        s28.a aVar3 = new s28.a(aVar2.b());
        this.S = aVar3;
        if (aVar3.equals(aVar)) {
            return;
        }
        this.m.c(13, new gb6.a() { // from class: ep3
            @Override // gb6.a
            public final void invoke(Object obj) {
                ((s28.c) obj).Y(this.t.S);
            }
        });
    }

    @Override // defpackage.s28
    public final vua B() {
        E0();
        return this.o0.i.d;
    }

    public final void B0(int i, boolean z) {
        int i2;
        if (this.M) {
            i2 = 4;
        } else {
            i2 = (this.o0.n != 1 || z) ? 0 : 1;
        }
        i28 i28VarA = this.o0;
        if (i28VarA.l == z && i28VarA.n == i2 && i28VarA.m == i) {
            return;
        }
        this.J++;
        if (i28VarA.p) {
            i28VarA = i28VarA.a();
        }
        i28 i28VarE = i28VarA.e(i, z, i2);
        this.l.A.a(1, z ? 1 : 0, i | (i2 << 4)).b();
        C0(i28VarE, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void C0(final i28 i28Var, final int i, boolean z, int i2, long j, int i3, boolean z2) {
        Pair pair;
        int i4;
        final co6 co6Var;
        int i5;
        int i6;
        Object obj;
        co6 co6Var2;
        Object obj2;
        long j2;
        long j3;
        long jP0;
        long jP1;
        Object obj3;
        co6 co6Var3;
        Object obj4;
        i28 i28Var2 = this.o0;
        this.o0 = i28Var;
        boolean zEquals = i28Var2.a.equals(i28Var.a);
        toa.c cVar = this.a;
        toa.b bVar = this.o;
        toa toaVar = i28Var2.a;
        bq6.b bVar2 = i28Var2.b;
        toa toaVar2 = i28Var.a;
        bq6.b bVar3 = i28Var.b;
        if (toaVar2.p() && toaVar.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (toaVar2.p() != toaVar.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (!toaVar.m(toaVar.g(bVar2.a, bVar).c, cVar, 0L).a.equals(toaVar2.m(toaVar2.g(bVar3.a, bVar).c, cVar, 0L).a)) {
            if (z && i2 == 0) {
                i4 = 1;
            } else if (z && i2 == 1) {
                i4 = 2;
            } else {
                if (zEquals) {
                    d43.c();
                    return;
                }
                i4 = 3;
            }
            pair = new Pair(Boolean.TRUE, Integer.valueOf(i4));
        } else if (z && i2 == 0 && bVar2.d < bVar3.d) {
            pair = new Pair(Boolean.TRUE, 0);
        } else {
            pair = (z && i2 == 1 && z2) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
        }
        boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
        final int iIntValue = ((Integer) pair.second).intValue();
        if (zBooleanValue) {
            co6Var = i28Var.a.p() ? null : i28Var.a.m(i28Var.a.g(i28Var.b.a, this.o).c, this.a, 0L).c;
            this.n0 = np6.B;
        } else {
            co6Var = null;
        }
        if (zBooleanValue || !i28Var2.j.equals(i28Var.j)) {
            np6.a aVarA = this.n0.a();
            List<su6> list = i28Var.j;
            for (int i7 = 0; i7 < list.size(); i7++) {
                su6 su6Var = list.get(i7);
                int i8 = 0;
                while (true) {
                    su6.a[] aVarArr = su6Var.a;
                    if (i8 < aVarArr.length) {
                        aVarArr[i8].b(aVarA);
                        i8++;
                    }
                }
            }
            this.n0 = new np6(aVarA);
        }
        np6 np6VarI0 = i0();
        boolean zEquals2 = np6VarI0.equals(this.T);
        this.T = np6VarI0;
        boolean z3 = i28Var2.l != i28Var.l;
        boolean z4 = i28Var2.e != i28Var.e;
        if (z4 || z3) {
            D0();
        }
        boolean z5 = i28Var2.g != i28Var.g;
        if (!zEquals) {
            this.m.c(0, new gb6.a() { // from class: zo3
                @Override // gb6.a
                public final void invoke(Object obj5) {
                    toa toaVar3 = i28Var.a;
                    ((s28.c) obj5).L(i);
                }
            });
        }
        if (z) {
            toa.b bVar4 = new toa.b();
            if (i28Var2.a.p()) {
                i5 = i3;
                i6 = i5;
                obj = null;
                co6Var2 = null;
                obj2 = null;
            } else {
                Object obj5 = i28Var2.b.a;
                i28Var2.a.g(obj5, bVar4);
                int i9 = bVar4.c;
                int iB = i28Var2.a.b(obj5);
                obj = i28Var2.a.m(i9, this.a, 0L).a;
                co6Var2 = this.a.c;
                obj2 = obj5;
                i5 = i9;
                i6 = iB;
            }
            bq6.b bVar5 = i28Var2.b;
            if (i2 == 0) {
                boolean zB = bVar5.b();
                bq6.b bVar6 = i28Var2.b;
                if (zB) {
                    jP0 = bVar4.a(bVar6.b, bVar6.c);
                    jP1 = p0(i28Var2);
                } else {
                    if (bVar6.e != -1) {
                        jP0 = p0(this.o0);
                    } else {
                        j2 = bVar4.e;
                        j3 = bVar4.d;
                        jP0 = j2 + j3;
                    }
                    jP1 = jP0;
                }
            } else if (bVar5.b()) {
                jP0 = i28Var2.s;
                jP1 = p0(i28Var2);
            } else {
                j2 = bVar4.e;
                j3 = i28Var2.s;
                jP0 = j2 + j3;
                jP1 = jP0;
            }
            long jZ = n6b.Z(jP0);
            long jZ2 = n6b.Z(jP1);
            bq6.b bVar7 = i28Var2.b;
            s28.d dVar = new s28.d(obj, i5, co6Var2, obj2, i6, jZ, jZ2, bVar7.b, bVar7.c);
            toa.c cVar2 = this.a;
            int iG = G();
            int iP = p();
            if (this.o0.a.p()) {
                obj3 = null;
                co6Var3 = null;
                obj4 = null;
            } else {
                i28 i28Var3 = this.o0;
                Object obj6 = i28Var3.b.a;
                i28Var3.a.g(obj6, this.o);
                iP = this.o0.a.b(obj6);
                Object obj7 = this.o0.a.m(iG, cVar2, 0L).a;
                co6Var3 = cVar2.c;
                obj4 = obj6;
                obj3 = obj7;
            }
            int i10 = iP;
            long jZ3 = n6b.Z(j);
            long jZ4 = this.o0.b.b() ? n6b.Z(p0(this.o0)) : jZ3;
            bq6.b bVar8 = this.o0.b;
            this.m.c(11, new kp3(i2, dVar, new s28.d(obj3, iG, co6Var3, obj4, i10, jZ3, jZ4, bVar8.b, bVar8.c)));
        } else {
            zBooleanValue = zBooleanValue;
            zEquals2 = zEquals2;
            z4 = z4;
        }
        if (zBooleanValue) {
            this.m.c(1, new gb6.a() { // from class: lp3
                @Override // gb6.a
                public final void invoke(Object obj8) {
                    ((s28.c) obj8).b0(co6Var, iIntValue);
                }
            });
        }
        if (i28Var2.f != i28Var.f) {
            this.m.c(10, new gb6.a() { // from class: mp3
                @Override // gb6.a
                public final void invoke(Object obj8) {
                    ((s28.c) obj8).K(i28Var.f);
                }
            });
            if (i28Var.f != null) {
                this.m.c(10, new gb6.a() { // from class: np3
                    @Override // gb6.a
                    public final void invoke(Object obj8) {
                        ((s28.c) obj8).g(i28Var.f);
                    }
                });
            }
        }
        nsa nsaVar = i28Var2.i;
        nsa nsaVar2 = i28Var.i;
        if (nsaVar != nsaVar2) {
            this.i.c(nsaVar2.e);
            this.m.c(2, new gb6.a() { // from class: uo3
                @Override // gb6.a
                public final void invoke(Object obj8) {
                    ((s28.c) obj8).J(i28Var.i.d);
                }
            });
        }
        if (!zEquals2) {
            final np6 np6Var = this.T;
            this.m.c(14, new gb6.a() { // from class: vo3
                @Override // gb6.a
                public final void invoke(Object obj8) {
                    ((s28.c) obj8).O(np6Var);
                }
            });
        }
        if (z5) {
            this.m.c(3, new ul1(i28Var));
        }
        if (z4 || z3) {
            this.m.c(-1, new gb6.a() { // from class: wo3
                @Override // gb6.a
                public final void invoke(Object obj8) {
                    i28 i28Var4 = i28Var;
                    ((s28.c) obj8).U(i28Var4.e, i28Var4.l);
                }
            });
        }
        if (z4) {
            this.m.c(4, new wl1(i28Var));
        }
        if (z3 || i28Var2.m != i28Var.m) {
            this.m.c(5, new w8(i28Var));
        }
        if (i28Var2.n != i28Var.n) {
            this.m.c(6, new hp3(i28Var));
        }
        if (i28Var2.m() != i28Var.m()) {
            this.m.c(7, new gb6.a() { // from class: ip3
                @Override // gb6.a
                public final void invoke(Object obj8) {
                    ((s28.c) obj8).h0(i28Var.m());
                }
            });
        }
        if (!i28Var2.o.equals(i28Var.o)) {
            this.m.c(12, new gb6.a() { // from class: jp3
                @Override // gb6.a
                public final void invoke(Object obj8) {
                    ((s28.c) obj8).X(i28Var.o);
                }
            });
        }
        A0();
        this.m.b();
        if (i28Var2.p != i28Var.p) {
            Iterator<ExoPlayer.a> it = this.n.iterator();
            while (it.hasNext()) {
                it.next().g();
            }
        }
    }

    @Override // defpackage.s28
    public final kc2 D() {
        E0();
        return this.e0;
    }

    public final void D0() {
        int iA = A();
        emb embVar = this.A;
        ekb ekbVar = this.z;
        boolean z = false;
        if (iA != 1) {
            if (iA == 2 || iA == 3) {
                E0();
                boolean z2 = this.o0.p;
                if (k() && !z2) {
                    z = true;
                }
                ekbVar.b(z);
                embVar.a(k());
                return;
            }
            if (iA != 4) {
                d43.c();
                return;
            }
        }
        ekbVar.b(false);
        embVar.a(false);
    }

    @Override // defpackage.s28
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public final lo3 f() {
        E0();
        return this.o0.f;
    }

    public final void E0() {
        this.d.a();
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.t;
        if (threadCurrentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = n6b.a;
            Locale locale = Locale.US;
            String strA = op3.a("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.f0) {
                aa0.c(strA);
            } else {
                md6.h("ExoPlayerImpl", strA, this.g0 ? null : new IllegalStateException());
                this.g0 = true;
            }
        }
    }

    @Override // defpackage.s28
    public final int F() {
        E0();
        if (g()) {
            return this.o0.b.b;
        }
        return -1;
    }

    @Override // defpackage.s28
    public final int G() {
        E0();
        int iN0 = n0(this.o0);
        if (iN0 == -1) {
            return 0;
        }
        return iN0;
    }

    @Override // defpackage.s28
    public final void I(final int i) {
        E0();
        if (this.H != i) {
            this.H = i;
            this.l.A.a(11, i, 0).b();
            gb6.a<s28.c> aVar = new gb6.a() { // from class: yo3
                @Override // gb6.a
                public final void invoke(Object obj) {
                    ((s28.c) obj).P(i);
                }
            };
            gb6<s28.c> gb6Var = this.m;
            gb6Var.c(8, aVar);
            A0();
            gb6Var.b();
        }
    }

    @Override // defpackage.s28
    public final void J(s28.c cVar) {
        E0();
        cVar.getClass();
        gb6<s28.c> gb6Var = this.m;
        if (gb6Var.j) {
            xl7.r(Thread.currentThread() == gb6Var.b);
        }
        CopyOnWriteArraySet<gb6.c<s28.c>> copyOnWriteArraySet = gb6Var.e;
        for (gb6.c<s28.c> cVar2 : copyOnWriteArraySet) {
            if (cVar2.a.equals(cVar)) {
                gb6.b<s28.c> bVar = gb6Var.d;
                cVar2.d = true;
                if (bVar != null && cVar2.c) {
                    cVar2.c = false;
                    bVar.a(cVar2.a, cVar2.b.b());
                }
                copyOnWriteArraySet.remove(cVar2);
            }
        }
    }

    @Override // defpackage.s28
    public final void K(SurfaceView surfaceView) {
        E0();
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        E0();
        if (holder == null || holder != this.W) {
            return;
        }
        j0();
    }

    @Override // defpackage.s28
    public final int L() {
        E0();
        return this.o0.n;
    }

    @Override // defpackage.s28
    public final int M() {
        E0();
        return this.H;
    }

    @Override // defpackage.s28
    public final toa N() {
        E0();
        return this.o0.a;
    }

    @Override // defpackage.s28
    public final Looper O() {
        return this.t;
    }

    @Override // defpackage.s28
    public final boolean P() {
        E0();
        return this.I;
    }

    @Override // defpackage.s28
    public final lsa Q() {
        E0();
        lsa lsaVarA = this.i.a();
        return this.M ? lsaVarA.a().d(this.N).a() : lsaVarA;
    }

    @Override // defpackage.s28
    public final long R() {
        E0();
        if (this.o0.a.p()) {
            return this.q0;
        }
        i28 i28Var = this.o0;
        long j = 0;
        if (i28Var.k.d != i28Var.b.d) {
            return n6b.Z(i28Var.a.m(G(), this.a, 0L).m);
        }
        long j2 = i28Var.q;
        if (this.o0.k.b()) {
            i28 i28Var2 = this.o0;
            i28Var2.a.g(i28Var2.k.a, this.o).d(this.o0.k.b);
        } else {
            j = j2;
        }
        i28 i28Var3 = this.o0;
        toa toaVar = i28Var3.a;
        Object obj = i28Var3.k.a;
        toa.b bVar = this.o;
        toaVar.g(obj, bVar);
        return n6b.Z(j + bVar.e);
    }

    @Override // defpackage.s28
    public final void U(TextureView textureView) {
        E0();
        if (textureView == null) {
            j0();
            return;
        }
        u0();
        this.Z = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            md6.g("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.w);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            y0(null);
            t0(0, 0);
        } else {
            Surface surface = new Surface(surfaceTexture);
            y0(surface);
            this.V = surface;
            t0(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // defpackage.s28
    public final np6 W() {
        E0();
        return this.T;
    }

    @Override // defpackage.s28
    public final long X() {
        E0();
        return n6b.Z(m0(this.o0));
    }

    @Override // defpackage.s28
    public final long Y() {
        E0();
        return this.k0;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void a() {
        String str;
        boolean zB;
        StringBuilder sb = new StringBuilder("Release ");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" [AndroidXMedia3/1.10.1] [");
        sb.append(n6b.a);
        sb.append("] [");
        HashSet<String> hashSet = cp6.a;
        synchronized (cp6.class) {
            str = cp6.b;
        }
        sb.append(str);
        sb.append("]");
        md6.f("ExoPlayerImpl", sb.toString());
        E0();
        this.y.a();
        this.z.b(false);
        this.A.a(false);
        e eVar = this.E;
        if (eVar != null && Build.VERSION.SDK_INT >= 34) {
            e.a(eVar);
        }
        j3a j3aVar = this.D;
        j3aVar.f.g();
        j3aVar.a.J(j3aVar.b);
        androidx.media3.exoplayer.e eVar2 = this.l;
        if (eVar2.d0 || !eVar2.C.getThread().isAlive()) {
            zB = true;
        } else {
            eVar2.d0 = true;
            bv1 bv1Var = new bv1(eVar2.J);
            eVar2.A.m(7, bv1Var).b();
            zB = bv1Var.b(eVar2.O);
        }
        if (!zB) {
            this.m.e(10, new rx0());
        }
        this.m.d();
        this.j.g();
        this.u.d(this.s);
        i28 i28Var = this.o0;
        if (i28Var.p) {
            this.o0 = i28Var.a();
        }
        i28 i28VarQ0 = q0(this.o0, 1);
        this.o0 = i28VarQ0;
        i28 i28VarC = i28VarQ0.c(i28VarQ0.b);
        this.o0 = i28VarC;
        i28VarC.q = i28VarC.s;
        this.o0.r = 0L;
        this.s.a();
        u0();
        Surface surface = this.V;
        if (surface != null) {
            surface.release();
            this.V = null;
        }
        this.e0 = kc2.c;
        this.i0 = true;
    }

    @Override // defpackage.s28
    public final void c(k28 k28Var) {
        E0();
        if (this.o0.o.equals(k28Var)) {
            return;
        }
        i28 i28VarG = this.o0.g(k28Var);
        this.J++;
        this.l.A.m(4, k28Var).b();
        C0(i28VarG, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // defpackage.s28
    public final void d() {
        E0();
        i28 i28Var = this.o0;
        if (i28Var.e != 1) {
            return;
        }
        i28 i28VarF = i28Var.f(null);
        i28 i28VarQ0 = q0(i28VarF, i28VarF.a.p() ? 4 : 2);
        this.J++;
        this.l.A.f(29).b();
        C0(i28VarQ0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // defpackage.s28
    public final k28 e() {
        E0();
        return this.o0.o;
    }

    @Override // defpackage.tk0
    public final void f0(int i, long j, boolean z) {
        E0();
        if (i == -1) {
            return;
        }
        int i2 = 0;
        xl7.g(i >= 0);
        toa toaVar = this.o0.a;
        if (toaVar.p() || i < toaVar.o()) {
            this.s.A();
            this.J++;
            if (g()) {
                md6.g("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                androidx.media3.exoplayer.e.C0022e c0022e = new androidx.media3.exoplayer.e.C0022e(this.o0);
                c0022e.a(1);
                d dVar = (d) this.k.a;
                dVar.j.e(new cp3(i2, dVar, c0022e));
                return;
            }
            i28 i28VarH = this.o0;
            int i3 = i28VarH.e;
            if (i3 == 3 || (i3 == 4 && !toaVar.p())) {
                i28VarH = this.o0.h(2);
            }
            int iG = G();
            i28 i28VarR0 = r0(i28VarH, toaVar, s0(toaVar, i, j));
            this.l.A.m(3, new androidx.media3.exoplayer.e.g(toaVar, i, n6b.N(j))).b();
            C0(i28VarR0, 0, true, 1, m0(i28VarR0), iG, z);
        }
    }

    @Override // defpackage.s28
    public final boolean g() {
        E0();
        return this.o0.b.b();
    }

    @Override // defpackage.s28
    public final long i() {
        E0();
        return n6b.Z(this.o0.r);
    }

    public final np6 i0() {
        toa toaVarN = N();
        if (toaVarN.p()) {
            return this.n0;
        }
        co6 co6Var = toaVarN.m(G(), this.a, 0L).c;
        np6.a aVarA = this.n0.a();
        np6 np6Var = co6Var.d;
        if (np6Var != null) {
            k95<String> k95Var = np6Var.A;
            byte[] bArr = np6Var.f;
            CharSequence charSequence = np6Var.a;
            if (charSequence != null) {
                aVarA.a = charSequence;
            }
            CharSequence charSequence2 = np6Var.b;
            if (charSequence2 != null) {
                aVarA.b = charSequence2;
            }
            CharSequence charSequence3 = np6Var.c;
            if (charSequence3 != null) {
                aVarA.c = charSequence3;
            }
            CharSequence charSequence4 = np6Var.d;
            if (charSequence4 != null) {
                aVarA.d = charSequence4;
            }
            CharSequence charSequence5 = np6Var.e;
            if (charSequence5 != null) {
                aVarA.e = charSequence5;
            }
            if (bArr != null) {
                Integer num = np6Var.g;
                aVarA.f = bArr == null ? null : (byte[]) bArr.clone();
                aVarA.g = num;
                np6 np6Var2 = np6.B;
            }
            Integer num2 = np6Var.h;
            if (num2 != null) {
                aVarA.h = num2;
            }
            Integer num3 = np6Var.i;
            if (num3 != null) {
                aVarA.i = num3;
            }
            Integer num4 = np6Var.j;
            if (num4 != null) {
                aVarA.j = num4;
            }
            Boolean bool = np6Var.k;
            if (bool != null) {
                aVarA.k = bool;
            }
            Integer num5 = np6Var.l;
            if (num5 != null) {
                aVarA.l = num5;
            }
            Integer num6 = np6Var.m;
            if (num6 != null) {
                aVarA.l = num6;
            }
            Integer num7 = np6Var.n;
            if (num7 != null) {
                aVarA.m = num7;
            }
            Integer num8 = np6Var.o;
            if (num8 != null) {
                aVarA.n = num8;
            }
            Integer num9 = np6Var.p;
            if (num9 != null) {
                aVarA.o = num9;
            }
            Integer num10 = np6Var.q;
            if (num10 != null) {
                aVarA.p = num10;
            }
            Integer num11 = np6Var.r;
            if (num11 != null) {
                aVarA.q = num11;
            }
            CharSequence charSequence6 = np6Var.s;
            if (charSequence6 != null) {
                aVarA.r = charSequence6;
            }
            CharSequence charSequence7 = np6Var.t;
            if (charSequence7 != null) {
                aVarA.s = charSequence7;
            }
            CharSequence charSequence8 = np6Var.u;
            if (charSequence8 != null) {
                aVarA.t = charSequence8;
            }
            Integer num12 = np6Var.v;
            if (num12 != null) {
                aVarA.u = num12;
            }
            Integer num13 = np6Var.w;
            if (num13 != null) {
                aVarA.v = num13;
            }
            CharSequence charSequence9 = np6Var.x;
            if (charSequence9 != null) {
                aVarA.w = charSequence9;
            }
            CharSequence charSequence10 = np6Var.y;
            if (charSequence10 != null) {
                aVarA.x = charSequence10;
            }
            Integer num14 = np6Var.z;
            if (num14 != null) {
                aVarA.y = num14;
            }
            if (!k95Var.isEmpty()) {
                aVarA.z = k95.q(k95Var);
            }
        }
        return new np6(aVarA);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final boolean isScrubbingModeEnabled() {
        E0();
        return this.M;
    }

    public final void j0() {
        E0();
        u0();
        y0(null);
        t0(0, 0);
    }

    @Override // defpackage.s28
    public final boolean k() {
        E0();
        return this.o0.l;
    }

    public final j k0(j.b bVar) {
        int iN0 = n0(this.o0);
        toa toaVar = this.o0.a;
        if (iN0 == -1) {
            iN0 = 0;
        }
        z7a z7aVar = this.v;
        androidx.media3.exoplayer.e eVar = this.l;
        return new j(eVar, bVar, toaVar, iN0, z7aVar, eVar.C);
    }

    public final long l0(i28 i28Var) {
        bq6.b bVar = i28Var.b;
        long j = i28Var.c;
        toa toaVar = i28Var.a;
        if (!bVar.b()) {
            return n6b.Z(m0(i28Var));
        }
        Object obj = i28Var.b.a;
        toa.b bVar2 = this.o;
        toaVar.g(obj, bVar2);
        if (j == -9223372036854775807L) {
            return n6b.Z(toaVar.m(n0(i28Var), this.a, 0L).l);
        }
        return n6b.Z(j) + n6b.Z(bVar2.e);
    }

    @Override // defpackage.s28
    public final void m(final boolean z) {
        E0();
        if (this.I != z) {
            this.I = z;
            this.l.A.a(12, z ? 1 : 0, 0).b();
            gb6.a<s28.c> aVar = new gb6.a() { // from class: dp3
                @Override // gb6.a
                public final void invoke(Object obj) {
                    ((s28.c) obj).C(z);
                }
            };
            gb6<s28.c> gb6Var = this.m;
            gb6Var.c(9, aVar);
            A0();
            gb6Var.b();
        }
    }

    public final long m0(i28 i28Var) {
        if (i28Var.a.p()) {
            return n6b.N(this.q0);
        }
        long jL = i28Var.p ? i28Var.l() : i28Var.s;
        if (i28Var.b.b()) {
            return jL;
        }
        toa toaVar = i28Var.a;
        Object obj = i28Var.b.a;
        toa.b bVar = this.o;
        toaVar.g(obj, bVar);
        return jL + bVar.e;
    }

    @Override // defpackage.s28
    public final void n(s28.c cVar) {
        cVar.getClass();
        this.m.a(cVar);
    }

    public final int n0(i28 i28Var) {
        return i28Var.a.p() ? this.p0 : i28Var.a.g(i28Var.b.a, this.o).c;
    }

    public final long o0() {
        E0();
        if (!g()) {
            return o();
        }
        i28 i28Var = this.o0;
        bq6.b bVar = i28Var.b;
        toa toaVar = i28Var.a;
        Object obj = bVar.a;
        toa.b bVar2 = this.o;
        toaVar.g(obj, bVar2);
        return n6b.Z(bVar2.a(bVar.b, bVar.c));
    }

    @Override // defpackage.s28
    public final int p() {
        E0();
        if (!this.o0.a.p()) {
            i28 i28Var = this.o0;
            return i28Var.a.b(i28Var.b.a);
        }
        int i = this.p0;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    @Override // defpackage.s28
    public final void q(TextureView textureView) {
        E0();
        if (textureView == null || textureView != this.Z) {
            return;
        }
        j0();
    }

    @Override // defpackage.s28
    public final tfb r() {
        E0();
        return this.j0;
    }

    public final i28 r0(i28 i28Var, toa toaVar, Pair<Object, Long> pair) {
        List<su6> list;
        xl7.g(toaVar.p() || pair != null);
        toa toaVar2 = i28Var.a;
        long jL0 = l0(i28Var);
        i28 i28VarJ = i28Var.j(toaVar);
        if (toaVar.p()) {
            bq6.b bVar = i28.u;
            long jN = n6b.N(this.q0);
            i28 i28VarC = i28VarJ.d(bVar, jN, jN, jN, 0L, gsa.d, this.b, ul8.x).c(bVar);
            i28VarC.q = i28VarC.s;
            return i28VarC;
        }
        Object obj = i28VarJ.b.a;
        boolean zEquals = obj.equals(pair.first);
        bq6.b bVar2 = !zEquals ? new bq6.b(pair.first) : i28VarJ.b;
        long jLongValue = ((Long) pair.second).longValue();
        long jN2 = n6b.N(jL0);
        if (!toaVar2.p()) {
            jN2 -= toaVar2.g(obj, this.o).e;
            if (zEquals && jN2 - jLongValue == 1 && jN2 == toaVar2.g(obj, this.o).d) {
                jN2--;
            }
        }
        if (!zEquals || jLongValue < jN2) {
            bq6.b bVar3 = bVar2;
            xl7.r(!bVar3.b());
            gsa gsaVar = !zEquals ? gsa.d : i28VarJ.h;
            nsa nsaVar = !zEquals ? this.b : i28VarJ.i;
            if (zEquals) {
                list = i28VarJ.j;
            } else {
                k95.b bVar4 = k95.u;
                list = ul8.x;
            }
            i28 i28VarC2 = i28VarJ.d(bVar3, jLongValue, jLongValue, jLongValue, 0L, gsaVar, nsaVar, list).c(bVar3);
            i28VarC2.q = jLongValue;
            return i28VarC2;
        }
        if (jLongValue != jN2) {
            bq6.b bVar5 = bVar2;
            xl7.r(!bVar5.b());
            long jMax = Math.max(0L, i28VarJ.r - (jLongValue - jN2));
            long j = i28VarJ.q;
            if (i28VarJ.k.equals(i28VarJ.b)) {
                j = jLongValue + jMax;
            }
            i28 i28VarD = i28VarJ.d(bVar5, jLongValue, jLongValue, jLongValue, jMax, i28VarJ.h, i28VarJ.i, i28VarJ.j);
            i28VarD.q = j;
            return i28VarD;
        }
        int iB = toaVar.b(i28VarJ.k.a);
        if (iB != -1 && toaVar.f(iB, this.o, false).c == toaVar.g(bVar2.a, this.o).c) {
            return i28VarJ;
        }
        toaVar.g(bVar2.a, this.o);
        boolean zB = bVar2.b();
        toa.b bVar6 = this.o;
        long jA = zB ? bVar6.a(bVar2.b, bVar2.c) : bVar6.d;
        bq6.b bVar7 = bVar2;
        i28 i28VarC3 = i28VarJ.d(bVar7, i28VarJ.s, i28VarJ.s, i28VarJ.d, jA - i28VarJ.s, i28VarJ.h, i28VarJ.i, i28VarJ.j).c(bVar7);
        i28VarC3.q = jA;
        return i28VarC3;
    }

    public final Pair<Object, Long> s0(toa toaVar, int i, long j) {
        if (toaVar.p()) {
            this.p0 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.q0 = j;
            return null;
        }
        if (i == -1 || i >= toaVar.o()) {
            i = toaVar.a(this.I);
            j = n6b.Z(toaVar.m(i, this.a, 0L).l);
        }
        return toaVar.i(this.a, this.o, i, n6b.N(j));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setImageOutput(ImageOutput imageOutput) {
        E0();
        v0(4, 15, imageOutput);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setScrubbingModeEnabled(boolean z) {
        lsa lsaVarA;
        E0();
        if (z == this.M) {
            return;
        }
        this.M = z;
        a89 a89Var = this.O;
        if (!a89Var.a.isEmpty()) {
            msa msaVar = this.i;
            msaVar.getClass();
            if (msaVar instanceof cv2) {
                lsa lsaVarA2 = msaVar.a();
                if (z) {
                    this.N = lsaVarA2.w;
                    q95<Integer> q95Var = a89Var.a;
                    lsa.b bVarA = lsaVarA2.a();
                    w2b it = q95Var.iterator();
                    while (it.hasNext()) {
                        bVarA.j(((Integer) it.next()).intValue(), true);
                    }
                    lsaVarA = bVarA.a();
                } else {
                    lsaVarA = lsaVarA2.a().d(this.N).a();
                    this.N = null;
                }
                if (!lsaVarA.equals(lsaVarA2)) {
                    msaVar.g(lsaVarA);
                }
            }
        }
        this.l.A.m(36, Boolean.valueOf(z)).b();
        i28 i28Var = this.o0;
        B0(i28Var.m, i28Var.l);
    }

    @Override // defpackage.s28
    public final int t() {
        E0();
        if (g()) {
            return this.o0.b.c;
        }
        return -1;
    }

    public final void t0(final int i, final int i2) {
        ar9 ar9Var = this.b0;
        if (i == ar9Var.a && i2 == ar9Var.b) {
            return;
        }
        this.b0 = new ar9(i, i2);
        this.m.e(24, new gb6.a() { // from class: xo3
            @Override // gb6.a
            public final void invoke(Object obj) {
                ((s28.c) obj).d0(i, i2);
            }
        });
        v0(2, 14, new ar9(i, i2));
    }

    @Override // defpackage.s28
    public final void u(SurfaceView surfaceView) {
        E0();
        if (surfaceView instanceof veb) {
            u0();
            y0(surfaceView);
            x0(surfaceView.getHolder());
            return;
        }
        boolean z = surfaceView instanceof qx9;
        b bVar = this.w;
        if (z) {
            u0();
            this.X = (qx9) surfaceView;
            j jVarK0 = k0(this.x);
            xl7.r(!jVarK0.f);
            jVarK0.c = 10000;
            qx9 qx9Var = this.X;
            xl7.r(true ^ jVarK0.f);
            jVarK0.d = qx9Var;
            jVarK0.b();
            this.X.t.add(bVar);
            y0(this.X.getVideoSurface());
            x0(surfaceView.getHolder());
            return;
        }
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        E0();
        if (holder == null) {
            j0();
            return;
        }
        u0();
        this.Y = true;
        this.W = holder;
        holder.addCallback(bVar);
        Surface surface = holder.getSurface();
        if (surface == null || !surface.isValid()) {
            y0(null);
            t0(0, 0);
        } else {
            y0(surface);
            Rect surfaceFrame = holder.getSurfaceFrame();
            t0(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    public final void u0() {
        qx9 qx9Var = this.X;
        b bVar = this.w;
        if (qx9Var != null) {
            j jVarK0 = k0(this.x);
            xl7.r(!jVarK0.f);
            jVarK0.c = 10000;
            xl7.r(!jVarK0.f);
            jVarK0.d = null;
            jVarK0.b();
            this.X.t.remove(bVar);
            this.X = null;
        }
        TextureView textureView = this.Z;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != bVar) {
                md6.g("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.Z.setSurfaceTextureListener(null);
            }
            this.Z = null;
        }
        SurfaceHolder surfaceHolder = this.W;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(bVar);
            this.W = null;
        }
    }

    @Override // defpackage.s28
    public final void v(final lsa lsaVar) {
        lsa lsaVarA;
        E0();
        msa msaVar = this.i;
        msaVar.getClass();
        if (msaVar instanceof cv2) {
            lsa lsaVarQ = Q();
            if (this.M) {
                this.N = lsaVar.w;
                q95<Integer> q95Var = this.O.a;
                lsa.b bVarA = lsaVar.a();
                w2b it = q95Var.iterator();
                while (it.hasNext()) {
                    bVarA.j(((Integer) it.next()).intValue(), true);
                }
                lsaVarA = bVarA.a();
            } else {
                lsaVarA = lsaVar;
            }
            if (!lsaVarA.equals(msaVar.a())) {
                msaVar.g(lsaVarA);
            }
            if (lsaVarQ.equals(lsaVar)) {
                return;
            }
            this.m.e(19, new gb6.a() { // from class: gp3
                @Override // gb6.a
                public final void invoke(Object obj) {
                    ((s28.c) obj).r(lsaVar);
                }
            });
        }
    }

    public final void v0(int i, int i2, Object obj) {
        for (k kVar : this.g) {
            if (i == -1 || kVar.F() == i) {
                j jVarK0 = k0(kVar);
                xl7.r(!jVarK0.f);
                jVarK0.c = i2;
                xl7.r(!jVarK0.f);
                jVarK0.d = obj;
                jVarK0.b();
            }
        }
        for (k kVar2 : this.h) {
            if (kVar2 != null && (i == -1 || kVar2.F() == i)) {
                j jVarK1 = k0(kVar2);
                xl7.r(!jVarK1.f);
                jVarK1.c = i2;
                xl7.r(!jVarK1.f);
                jVarK1.d = obj;
                jVarK1.b();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x008d  */
    public final void w0(List<bq6> list, boolean z) {
        E0();
        int iN0 = n0(this.o0);
        long jX = X();
        this.J++;
        ArrayList arrayList = this.p;
        arrayList.clear();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            i.c cVar = new i.c(list.get(i), this.q);
            arrayList2.add(cVar);
            arrayList.add(i, new C0021d(cVar.b, cVar.a));
        }
        this.Q = this.Q.c(arrayList2.size());
        n48 n48Var = new n48(arrayList, this.Q);
        boolean zP = n48Var.p();
        int i2 = n48Var.e;
        if (!zP && -1 >= i2) {
            throw new d75();
        }
        if (z) {
            iN0 = n48Var.a(this.I);
            jX = -9223372036854775807L;
        }
        i28 i28VarR0 = r0(this.o0, n48Var, s0(n48Var, iN0, jX));
        int i3 = i28VarR0.e;
        if (i3 == 1) {
            i3 = 1;
        } else if (n48Var.p()) {
            i3 = 4;
        } else if (iN0 != -1) {
            if (iN0 >= i2) {
                i3 = 4;
            } else {
                i3 = 2;
            }
        }
        i28 i28VarQ0 = q0(i28VarR0, i3);
        this.l.A.m(17, new androidx.media3.exoplayer.e.b(arrayList2, this.Q, iN0, n6b.N(jX))).b();
        C0(i28VarQ0, 0, (this.o0.b.a.equals(i28VarQ0.b.a) || this.o0.a.p()) ? false : true, 4, m0(i28VarQ0), -1, false);
    }

    public final void x0(SurfaceHolder surfaceHolder) {
        this.Y = false;
        this.W = surfaceHolder;
        surfaceHolder.addCallback(this.w);
        Surface surface = this.W.getSurface();
        if (surface == null || !surface.isValid()) {
            t0(0, 0);
        } else {
            Rect surfaceFrame = this.W.getSurfaceFrame();
            t0(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // defpackage.s28
    public final long y() {
        E0();
        return this.l0;
    }

    public final void y0(Object obj) {
        Object obj2 = this.U;
        boolean zB = true;
        boolean z = (obj2 == null || obj2 == obj) ? false : true;
        long j = z ? this.B : -9223372036854775807L;
        androidx.media3.exoplayer.e eVar = this.l;
        if (!eVar.d0 && eVar.C.getThread().isAlive()) {
            bv1 bv1Var = new bv1(eVar.J);
            eVar.A.m(30, new Pair(obj, bv1Var)).b();
            if (j != -9223372036854775807L) {
                zB = bv1Var.b(j);
            }
        }
        if (z) {
            Object obj3 = this.U;
            Surface surface = this.V;
            if (obj3 == surface) {
                surface.release();
                this.V = null;
            }
        }
        this.U = obj;
        if (zB) {
            return;
        }
        z0(new lo3(2, new eq3("Detaching surface timed out."), 1003));
    }

    @Override // defpackage.s28
    public final long z() {
        E0();
        return l0(this.o0);
    }

    public final void z0(lo3 lo3Var) {
        i28 i28Var = this.o0;
        i28 i28VarC = i28Var.c(i28Var.b);
        i28VarC.q = i28VarC.s;
        i28VarC.r = 0L;
        i28 i28VarQ0 = q0(i28VarC, 1);
        if (lo3Var != null) {
            i28VarQ0 = i28VarQ0.f(lo3Var);
        }
        this.J++;
        this.l.A.f(6).b();
        C0(i28VarQ0, 0, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class b implements rfb, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, qx9.b, t70.b, ExoPlayer.a, j3a.a {
        public b() {
        }

        @Override // defpackage.rfb
        public final void a(androidx.media3.exoplayer.b bVar) {
            a.a(d.this.G, bVar);
        }

        @Override // defpackage.rfb
        public final void b(tfb tfbVar) {
            d dVar = d.this;
            dVar.j0 = tfbVar;
            dVar.m.e(25, new up3(tfbVar));
        }

        @Override // defpackage.rfb
        public final void c(ln2 ln2Var) {
            d.this.s.c(ln2Var);
        }

        @Override // defpackage.rfb
        public final void d(String str) {
            d.this.s.d(str);
        }

        @Override // defpackage.rfb
        public final void e(int i, long j) {
            d.this.s.e(i, j);
        }

        @Override // defpackage.rfb
        public final void f(ln2 ln2Var) {
            d.this.s.f(ln2Var);
        }

        @Override // androidx.media3.exoplayer.ExoPlayer.a
        public final void g() {
            d.this.D0();
        }

        @Override // defpackage.rfb
        public final void h(int i, long j) {
            d.this.s.h(i, j);
        }

        @Override // defpackage.rfb
        public final void i(id4 id4Var, pn2 pn2Var) {
            d.this.s.i(id4Var, pn2Var);
        }

        @Override // defpackage.rfb
        public final void j(Exception exc) {
            d.this.s.j(exc);
        }

        @Override // defpackage.rfb
        public final void k(long j, Object obj) {
            d dVar = d.this;
            dVar.s.k(j, obj);
            if (dVar.U == obj) {
                dVar.m.e(26, new m52());
            }
        }

        @Override // defpackage.rfb
        public final void l(long j, long j2, String str) {
            d.this.s.l(j, j2, str);
        }

        @Override // qx9.b
        public final void m() {
            d.this.y0(null);
        }

        @Override // qx9.b
        public final void n(Surface surface) {
            d.this.y0(surface);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            Surface surface = new Surface(surfaceTexture);
            d dVar = d.this;
            dVar.y0(surface);
            dVar.V = surface;
            dVar.t0(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            d dVar = d.this;
            dVar.y0(null);
            dVar.t0(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            d.this.t0(i, i2);
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            d.this.t0(i2, i3);
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            d dVar = d.this;
            if (dVar.Y) {
                dVar.y0(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            d dVar = d.this;
            if (dVar.Y) {
                dVar.y0(null);
            }
            dVar.t0(0, 0);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }
}
