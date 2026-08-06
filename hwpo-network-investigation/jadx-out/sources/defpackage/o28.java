package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class o28 implements ffb.b {
    public static final kv2 u = new kv2();
    public final Context a;
    public final f b;
    public final SparseArray<c> c;
    public final boolean d;
    public final qv2 e;
    public final vf1 f;
    public final CopyOnWriteArraySet<d> g;
    public final long h;
    public final cfb i;
    public soa<g> j = new soa<>();
    public final id4 k;
    public kt4 l;
    public zeb m;
    public Pair<Surface, ar9> n;
    public int o;
    public int p;
    public long q;
    public boolean r;
    public int s;
    public int t;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final Context a;
        public final bfb b;
        public f c;
        public boolean d;
        public boolean f;
        public long g = 15000;
        public final cfb h = new cfb();
        public vf1 e = vf1.a;

        public a(Context context, bfb bfbVar) {
            this.a = context.getApplicationContext();
            this.b = bfbVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class b implements sfb.a {
        public b() {
        }

        @Override // sfb.a
        public final void b(tfb tfbVar) {
            Iterator<d> it = o28.this.g.iterator();
            while (it.hasNext()) {
                it.next().b(tfbVar);
            }
        }

        @Override // sfb.a
        public final void e() {
            Iterator<d> it = o28.this.g.iterator();
            while (it.hasNext()) {
                it.next().e();
            }
        }

        @Override // sfb.a
        public final void f() {
            Iterator<d> it = o28.this.g.iterator();
            while (it.hasNext()) {
                it.next().f();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class c implements sfb, d {
        public final int a;
        public k95<Object> b;
        public id4 c;
        public long d;
        public long e;
        public int f;
        public sfb.a g;
        public Executor h;
        public boolean i;

        public c(Context context) {
            this.a = n6b.K(context) ? 1 : 5;
            k95.b bVar = k95.u;
            this.b = ul8.x;
            this.e = -9223372036854775807L;
            this.g = sfb.a.a;
            this.h = o28.u;
        }

        @Override // defpackage.sfb
        public final void A() {
            o28 o28Var = o28.this;
            qv2 qv2Var = o28Var.e;
            if (o28Var.j.h() == 0) {
                qv2Var.A();
                return;
            }
            soa<g> soaVar = new soa<>();
            boolean z = true;
            while (o28Var.j.h() > 0) {
                g gVarE = o28Var.j.e();
                gVarE.getClass();
                if (z) {
                    int i = gVarE.b;
                    if (i == 0 || i == 1) {
                        gVarE = new g(gVarE.a, 0, gVarE.c);
                    } else {
                        qv2Var.A();
                    }
                    z = false;
                }
                soaVar.a(gVarE.c, gVarE);
            }
            o28Var.j = soaVar;
        }

        public final void B(id4 id4Var) {
            id4.a aVarA = id4Var.a();
            xh1 xh1Var = id4Var.E;
            if (xh1Var == null || !xh1Var.d()) {
                xh1Var = xh1.h;
            }
            aVarA.D = xh1Var;
            new id4(aVarA);
            throw null;
        }

        @Override // defpackage.sfb
        public final void a() {
            o28 o28Var = o28.this;
            if (o28Var.p == 2) {
                return;
            }
            kt4 kt4Var = o28Var.l;
            if (kt4Var != null) {
                kt4Var.g();
            }
            o28Var.n = null;
            o28Var.p = 2;
        }

        @Override // o28.d
        public final void b(tfb tfbVar) {
            this.h.execute(new jw2(1, this.g, tfbVar));
        }

        @Override // defpackage.sfb
        public final Surface c() {
            xl7.r(this.i);
            throw null;
        }

        @Override // defpackage.sfb
        public final boolean d() {
            if (!this.i) {
                return false;
            }
            o28 o28Var = o28.this;
            return o28Var.o == 0 && o28Var.r && o28Var.e.d();
        }

        @Override // o28.d
        public final void e() {
            sfb.a aVar = this.g;
            Executor executor = this.h;
            Objects.requireNonNull(aVar);
            executor.execute(new q28(0, aVar));
        }

        @Override // o28.d
        public final void f() {
            final sfb.a aVar = this.g;
            Executor executor = this.h;
            Objects.requireNonNull(aVar);
            executor.execute(new Runnable() { // from class: p28
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.f();
                }
            });
        }

        @Override // defpackage.sfb
        public final void g() {
            if (this.i) {
                o28.a(o28.this, false);
                throw null;
            }
        }

        @Override // defpackage.sfb
        public final void h(long j, long j2) throws sfb.c {
            o28.this.e.h(j + this.d, j2);
        }

        @Override // defpackage.sfb
        public final void i() {
            o28 o28Var = o28.this;
            if (o28Var.d) {
                o28Var.e.i();
            }
        }

        @Override // defpackage.sfb
        public final void j() {
            o28 o28Var = o28.this;
            if (o28Var.d) {
                o28Var.e.j();
            }
        }

        @Override // defpackage.sfb
        public final void k(id4 id4Var, long j, int i, List list) {
            xl7.r(this.i);
            this.b = k95.q(list);
            this.c = id4Var;
            o28 o28Var = o28.this;
            o28Var.r = false;
            B(id4Var);
            long j2 = this.e;
            boolean z = j2 == -9223372036854775807L;
            if (o28Var.d || z) {
                long j3 = z ? -4611686018427387904L : j2 + 1;
                o28Var.j.a(j3, new g(j + this.d, i, j3));
            }
        }

        @Override // defpackage.sfb
        public final void l(long j) {
            this.d = j;
        }

        @Override // defpackage.sfb
        public final void m() {
            long j = this.e;
            o28 o28Var = o28.this;
            if (o28Var.q >= j) {
                o28Var.e.m();
                o28Var.r = true;
            }
        }

        @Override // defpackage.sfb
        public final void n(int i) {
            o28.this.e.n(i);
        }

        @Override // defpackage.sfb
        public final void o(float f) {
            o28 o28Var = o28.this;
            o28Var.i.c(f);
            o28Var.e.o(f);
        }

        @Override // defpackage.sfb
        public final void p() {
            ar9 ar9Var = ar9.c;
            int i = ar9Var.a;
            int i2 = ar9Var.b;
            o28 o28Var = o28.this;
            o28Var.b(null, i, i2);
            o28Var.n = null;
        }

        @Override // defpackage.sfb
        public final void q(on6 on6Var) {
            this.g = on6Var;
            this.h = y03.t;
        }

        @Override // defpackage.sfb
        public final boolean r(long j, pn6.a aVar) {
            int i;
            xl7.r(this.i);
            long j2 = j + this.d;
            o28 o28Var = o28.this;
            cfb cfbVar = o28Var.i;
            long j3 = cfbVar.a;
            long j4 = j3 == -9223372036854775807L ? -9223372036854775807L : (long) (((j2 - j3) * cfbVar.c) + cfbVar.b);
            if (j4 != -9223372036854775807L) {
                long j5 = o28Var.h;
                if (j5 != -9223372036854775807L && j4 < j5 && (i = this.f) < 2) {
                    this.f = i + 1;
                    aVar.b();
                    return true;
                }
            }
            int i2 = o28Var.s;
            if (i2 == -1 || i2 != o28Var.t) {
                return false;
            }
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:26:0x005d  */
        /* JADX WARN: Code duplicated, block: B:28:0x0060 A[Catch: a -> 0x0040, TryCatch #0 {a -> 0x0040, blocks: (B:14:0x0030, B:17:0x0038, B:25:0x0047, B:28:0x0060, B:30:0x0064, B:37:0x0077, B:40:0x007e, B:45:0x00a0, B:35:0x006f), top: B:50:0x0030 }] */
        /* JADX WARN: Code duplicated, block: B:30:0x0064 A[Catch: a -> 0x0040, TryCatch #0 {a -> 0x0040, blocks: (B:14:0x0030, B:17:0x0038, B:25:0x0047, B:28:0x0060, B:30:0x0064, B:37:0x0077, B:40:0x007e, B:45:0x00a0, B:35:0x006f), top: B:50:0x0030 }] */
        /* JADX WARN: Code duplicated, block: B:33:0x006b  */
        /* JADX WARN: Code duplicated, block: B:34:0x006d A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:35:0x006f A[Catch: a -> 0x0040, TryCatch #0 {a -> 0x0040, blocks: (B:14:0x0030, B:17:0x0038, B:25:0x0047, B:28:0x0060, B:30:0x0064, B:37:0x0077, B:40:0x007e, B:45:0x00a0, B:35:0x006f), top: B:50:0x0030 }] */
        /* JADX WARN: Code duplicated, block: B:37:0x0077 A[Catch: a -> 0x0040, TryCatch #0 {a -> 0x0040, blocks: (B:14:0x0030, B:17:0x0038, B:25:0x0047, B:28:0x0060, B:30:0x0064, B:37:0x0077, B:40:0x007e, B:45:0x00a0, B:35:0x006f), top: B:50:0x0030 }] */
        /* JADX WARN: Code duplicated, block: B:41:0x0099  */
        /* JADX WARN: Code duplicated, block: B:43:0x009c  */
        /* JADX WARN: Code duplicated, block: B:45:0x00a0 A[Catch: a -> 0x0040, TRY_LEAVE, TryCatch #0 {a -> 0x0040, blocks: (B:14:0x0030, B:17:0x0038, B:25:0x0047, B:28:0x0060, B:30:0x0064, B:37:0x0077, B:40:0x007e, B:45:0x00a0, B:35:0x006f), top: B:50:0x0030 }] */
        @Override // defpackage.sfb
        public final boolean s(id4 id4Var) throws sfb.c {
            boolean zE = true;
            xl7.r(!this.i);
            o28 o28Var = o28.this;
            xl7.r(o28Var.p == 0);
            xh1 xh1Var = id4Var.E;
            if (xh1Var == null || !xh1Var.d()) {
                xh1Var = xh1.h;
            }
            int i = xh1Var.c;
            if (i == 7) {
                try {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 34) {
                        if (i == 6) {
                            if (Build.VERSION.SDK_INT >= 33 || !om4.e("EGL_EXT_gl_colorspace_bt2020_pq")) {
                                zE = false;
                            }
                        } else if (i == 7) {
                            zE = om4.e("EGL_EXT_gl_colorspace_bt2020_hlg");
                        }
                        if (zE && Build.VERSION.SDK_INT >= 29) {
                            Locale locale = Locale.US;
                            md6.g("PlaybackVidGraphWrapper", "Color transfer " + i + " is not supported. Falling back to OpenGl tone mapping.");
                            xh1Var = xh1.h;
                        } else if (i != 2 || i == 10) {
                            xh1Var = xh1.h;
                        }
                    } else {
                        if (i2 >= 33 && om4.e("EGL_EXT_gl_colorspace_bt2020_pq")) {
                            xh1Var = new xh1(xh1Var.a, xh1Var.b, 6, xh1Var.e, xh1Var.f, xh1Var.d);
                        } else {
                            if (i == 6) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    zE = false;
                                } else {
                                    zE = false;
                                }
                            } else if (i == 7) {
                                zE = om4.e("EGL_EXT_gl_colorspace_bt2020_hlg");
                            }
                            if (zE) {
                                if (i != 2) {
                                    xh1Var = xh1.h;
                                } else {
                                    xh1Var = xh1.h;
                                }
                            } else if (i != 2) {
                                xh1Var = xh1.h;
                            } else {
                                xh1Var = xh1.h;
                            }
                        }
                    }
                } catch (om4.a e) {
                    throw new sfb.c(e, id4Var);
                }
            } else {
                if (i == 6) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        zE = false;
                    } else {
                        zE = false;
                    }
                } else if (i == 7) {
                    zE = om4.e("EGL_EXT_gl_colorspace_bt2020_hlg");
                }
                if (zE) {
                    if (i != 2) {
                        xh1Var = xh1.h;
                    } else {
                        xh1Var = xh1.h;
                    }
                } else if (i != 2) {
                    xh1Var = xh1.h;
                } else {
                    xh1Var = xh1.h;
                }
            }
            vf1 vf1Var = o28Var.f;
            Looper looperMyLooper = Looper.myLooper();
            looperMyLooper.getClass();
            b8a b8aVarB = vf1Var.b(looperMyLooper, null);
            o28Var.l = b8aVarB;
            o28Var.b.a(o28Var.a, xh1Var, o28Var, new yp3(b8aVarB)).j();
            throw null;
        }

        @Override // defpackage.sfb
        public final void t(boolean z) {
            if (this.i) {
                throw null;
            }
            this.e = -9223372036854775807L;
            o28.a(o28.this, z);
        }

        @Override // defpackage.sfb
        public final void u(List<Object> list) {
            if (this.b.equals(list)) {
                return;
            }
            this.b = k95.q(list);
            id4 id4Var = this.c;
            if (id4Var != null) {
                B(id4Var);
            }
        }

        @Override // defpackage.sfb
        public final void v(boolean z) {
            o28 o28Var = o28.this;
            if (o28Var.d) {
                o28Var.e.v(z);
            }
        }

        @Override // defpackage.sfb
        public final boolean w(boolean z) {
            boolean z2 = false;
            boolean z3 = z && this.i;
            o28 o28Var = o28.this;
            qv2 qv2Var = o28Var.e;
            if (z3 && o28Var.o == 0) {
                z2 = true;
            }
            return qv2Var.a.b(z2);
        }

        @Override // defpackage.sfb
        public final void x(zeb zebVar) {
            o28 o28Var = o28.this;
            o28Var.m = zebVar;
            o28Var.e.j = zebVar;
        }

        @Override // defpackage.sfb
        public final void y(Surface surface, ar9 ar9Var) {
            o28 o28Var = o28.this;
            Pair<Surface, ar9> pair = o28Var.n;
            if (pair != null && ((Surface) pair.first).equals(surface) && ((ar9) o28Var.n.second).equals(ar9Var)) {
                return;
            }
            o28Var.n = Pair.create(surface, ar9Var);
            o28Var.b(surface, ar9Var.a, ar9Var.b);
        }

        @Override // defpackage.sfb
        public final boolean z() {
            return this.i;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class e implements afb.b {
        public static final l5a<Class<?>> a = m5a.a(new r28());
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class f implements ffb.a {
        public final e a = new e();

        @Override // ffb.a
        public final ffb a(Context context, xh1 xh1Var, ffb.b bVar, yp3 yp3Var) {
            try {
                return ((ffb.a) Class.forName("androidx.media3.effect.SingleInputVideoGraph$Factory").getConstructor(afb.b.class).newInstance(this.a)).a(context, xh1Var, bVar, yp3Var);
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class g {
        public final long a;
        public final int b;
        public final long c;

        public g(long j, int i, long j2) {
            this.a = j;
            this.b = i;
            this.c = j2;
        }
    }

    public o28(a aVar) {
        this.a = aVar.a;
        f fVar = aVar.c;
        fVar.getClass();
        this.b = fVar;
        this.c = new SparseArray<>();
        k95.b bVar = k95.u;
        ul8 ul8Var = ul8.x;
        this.d = aVar.d;
        vf1 vf1Var = aVar.e;
        this.f = vf1Var;
        long j = aVar.g;
        this.h = j != -9223372036854775807L ? -j : -9223372036854775807L;
        cfb cfbVar = aVar.h;
        this.i = cfbVar;
        this.e = new qv2(aVar.b, cfbVar, vf1Var);
        this.g = new CopyOnWriteArraySet<>();
        this.k = new id4(new id4.a());
        this.q = -9223372036854775807L;
        this.s = -1;
        this.p = 0;
    }

    public static void a(final o28 o28Var, boolean z) {
        soa<g> soaVar;
        qv2 qv2Var = o28Var.e;
        if (o28Var.p == 1) {
            o28Var.o++;
            qv2Var.t(z);
            while (true) {
                int iH = o28Var.j.h();
                soaVar = o28Var.j;
                if (iH <= 1) {
                    break;
                } else {
                    soaVar.e();
                }
            }
            if (soaVar.h() == 1) {
                g gVarE = o28Var.j.e();
                gVarE.getClass();
                long j = gVarE.a;
                int i = gVarE.b;
                id4 id4Var = o28Var.k;
                k95.b bVar = k95.u;
                qv2Var.k(id4Var, j, i, ul8.x);
            }
            o28Var.q = -9223372036854775807L;
            if (z) {
                o28Var.r = false;
            }
            kt4 kt4Var = o28Var.l;
            kt4Var.getClass();
            kt4Var.e(new Runnable() { // from class: m28
                @Override // java.lang.Runnable
                public final void run() {
                    this.t.o--;
                }
            });
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface d {
        default void e() {
        }

        default void f() {
        }

        default void b(tfb tfbVar) {
        }
    }

    public final void b(Surface surface, int i, int i2) {
    }
}
