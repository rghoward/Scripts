package defpackage;

import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hg3 implements rg3, tg3.a {
    public static final boolean h = Log.isLoggable("Engine", 2);
    public final nl5 a;
    public final i56 b;
    public final pf6 c;
    public final b d;
    public final cu8 e;
    public final a f;
    public final a9 g;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a {
        public final c a;
        public final at3.c b = at3.a(150, new C0101a());
        public int c;

        /* JADX INFO: renamed from: hg3$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class C0101a implements at3.b<gn2<?>> {
            public C0101a() {
            }

            @Override // at3.b
            public final gn2<?> a() {
                a aVar = a.this;
                return new gn2<>(aVar.a, aVar.b);
            }
        }

        public a(c cVar) {
            this.a = cVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b {
        public final sm4 a;
        public final sm4 b;
        public final sm4 c;
        public final sm4 d;
        public final hg3 e;
        public final hg3 f;
        public final at3.c g = at3.a(150, new a());

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class a implements at3.b<qg3<?>> {
            public a() {
            }

            @Override // at3.b
            public final qg3<?> a() {
                b bVar = b.this;
                return new qg3<>(bVar.a, bVar.b, bVar.c, bVar.d, bVar.e, bVar.f, bVar.g);
            }
        }

        public b(sm4 sm4Var, sm4 sm4Var2, sm4 sm4Var3, sm4 sm4Var4, hg3 hg3Var, hg3 hg3Var2) {
            this.a = sm4Var;
            this.b = sm4Var2;
            this.c = sm4Var3;
            this.d = sm4Var4;
            this.e = hg3Var;
            this.f = hg3Var2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class c implements gn2.c {
        public final j13.a a;
        public volatile j13 b;

        public c(j13.a aVar) {
            this.a = aVar;
        }

        public final j13 a() {
            if (this.b == null) {
                synchronized (this) {
                    try {
                        if (this.b == null) {
                            File cacheDir = ((v13) this.a).a.a.getCacheDir();
                            w13 w13Var = null;
                            File file = cacheDir == null ? null : new File(cacheDir, "image_manager_disk_cache");
                            if (file != null && (file.isDirectory() || file.mkdirs())) {
                                w13Var = new w13(file);
                            }
                            this.b = w13Var;
                        }
                        if (this.b == null) {
                            this.b = new z69();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return this.b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class d {
        public final qg3<?> a;
        public final hq9 b;

        public d(hq9 hq9Var, qg3 qg3Var) {
            this.b = hq9Var;
            this.a = qg3Var;
        }
    }

    public hg3(pf6 pf6Var, j13.a aVar, sm4 sm4Var, sm4 sm4Var2, sm4 sm4Var3, sm4 sm4Var4) throws Throwable {
        this.c = pf6Var;
        c cVar = new c(aVar);
        a9 a9Var = new a9();
        this.g = a9Var;
        synchronized (this) {
            try {
                synchronized (a9Var) {
                    try {
                        try {
                            a9Var.d = this;
                        } catch (Throwable th) {
                            th = th;
                            while (true) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        throw th;
                    }
                }
                this.b = new i56();
                this.a = new nl5();
                this.d = new b(sm4Var, sm4Var2, sm4Var3, sm4Var4, this, this);
                this.f = new a(cVar);
                this.e = new cu8();
                pf6Var.d = this;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public static void d(String str, long j, sg3 sg3Var) {
        StringBuilder sbB = tn2.b(str, " in ");
        sbB.append(vd6.a(j));
        sbB.append("ms, key: ");
        sbB.append(sg3Var);
        Log.v("Engine", sbB.toString());
    }

    public static void f(kt8 kt8Var) {
        if (kt8Var instanceof tg3) {
            ((tg3) kt8Var).d();
        } else {
            z90.a("Cannot release anything but an EngineResource");
        }
    }

    @Override // tg3.a
    public final void a(ko5 ko5Var, tg3<?> tg3Var) {
        a9 a9Var = this.g;
        synchronized (a9Var) {
            a9.a aVar = (a9.a) a9Var.b.remove(ko5Var);
            if (aVar != null) {
                aVar.c = null;
                aVar.clear();
            }
        }
        if (tg3Var.t) {
            this.c.d(ko5Var, tg3Var);
        } else {
            this.e.a(tg3Var, false);
        }
    }

    public final d b(com.bumptech.glide.c cVar, Object obj, ko5 ko5Var, int i, int i2, Class cls, Class cls2, p98 p98Var, k13 k13Var, g11 g11Var, boolean z, boolean z2, xk7 xk7Var, boolean z3, boolean z4, hq9 hq9Var, sn3.a aVar) {
        long jElapsedRealtimeNanos;
        if (h) {
            int i3 = vd6.b;
            jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        } else {
            jElapsedRealtimeNanos = 0;
        }
        this.b.getClass();
        sg3 sg3Var = new sg3(obj, ko5Var, i, i2, g11Var, cls, cls2, xk7Var);
        synchronized (this) {
            try {
                tg3<?> tg3VarC = c(sg3Var, z3, jElapsedRealtimeNanos);
                if (tg3VarC == null) {
                    return g(cVar, obj, ko5Var, i, i2, cls, cls2, p98Var, k13Var, g11Var, z, z2, xk7Var, z3, z4, hq9Var, aVar, sg3Var, jElapsedRealtimeNanos);
                }
                hq9Var.l(tg3VarC, kf2.x, false);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final tg3<?> c(sg3 sg3Var, boolean z, long j) {
        tg3<?> tg3Var;
        Object obj;
        hg3 hg3Var;
        sg3 sg3Var2;
        tg3<?> tg3Var2;
        if (z) {
            a9 a9Var = this.g;
            synchronized (a9Var) {
                a9.a aVar = (a9.a) a9Var.b.get(sg3Var);
                if (aVar == null) {
                    tg3Var = null;
                } else {
                    tg3Var = aVar.get();
                    if (tg3Var == null) {
                        a9Var.b(aVar);
                    }
                }
            }
            if (tg3Var != null) {
                tg3Var.b();
            }
            if (tg3Var != null) {
                if (h) {
                    d("Loaded resource from active resources", j, sg3Var);
                }
                return tg3Var;
            }
            pf6 pf6Var = this.c;
            synchronized (pf6Var) {
                mf6.a aVar2 = (mf6.a) pf6Var.a.remove(sg3Var);
                if (aVar2 == null) {
                    obj = null;
                } else {
                    pf6Var.c -= (long) aVar2.b;
                    obj = aVar2.a;
                }
            }
            kt8 kt8Var = (kt8) obj;
            if (kt8Var == null) {
                hg3Var = this;
                sg3Var2 = sg3Var;
                tg3Var2 = null;
            } else if (kt8Var instanceof tg3) {
                tg3Var2 = (tg3) kt8Var;
                hg3Var = this;
                sg3Var2 = sg3Var;
            } else {
                hg3Var = this;
                sg3Var2 = sg3Var;
                tg3Var2 = new tg3<>(kt8Var, true, true, sg3Var2, hg3Var);
            }
            if (tg3Var2 != null) {
                tg3Var2.b();
                hg3Var.g.a(sg3Var2, tg3Var2);
            }
            if (tg3Var2 != null) {
                if (h) {
                    d("Loaded resource from cache", j, sg3Var2);
                }
                return tg3Var2;
            }
        }
        return null;
    }

    public final synchronized void e(qg3<?> qg3Var, ko5 ko5Var, tg3<?> tg3Var) {
        if (tg3Var != null) {
            try {
                if (tg3Var.t) {
                    this.g.a(ko5Var, tg3Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        nl5 nl5Var = this.a;
        nl5Var.getClass();
        qg3Var.getClass();
        HashMap map = nl5Var.a;
        if (qg3Var == map.get(ko5Var)) {
            map.remove(ko5Var);
        }
    }

    public final d g(com.bumptech.glide.c cVar, Object obj, ko5 ko5Var, int i, int i2, Class cls, Class cls2, p98 p98Var, k13 k13Var, Map map, boolean z, boolean z2, xk7 xk7Var, boolean z3, boolean z4, hq9 hq9Var, Executor executor, sg3 sg3Var, long j) {
        Executor executor2;
        qg3 qg3Var = (qg3) this.a.a.get(sg3Var);
        if (qg3Var != null) {
            qg3Var.a(hq9Var, executor);
            if (h) {
                d("Added to existing load", j, sg3Var);
            }
            return new d(hq9Var, qg3Var);
        }
        qg3 qg3Var2 = (qg3) this.d.g.b();
        synchronized (qg3Var2) {
            qg3Var2.D = sg3Var;
            qg3Var2.E = z3;
            qg3Var2.F = z4;
        }
        a aVar = this.f;
        gn2<R> gn2Var = (gn2) aVar.b.b();
        int i3 = aVar.c;
        aVar.c = i3 + 1;
        en2<R> en2Var = gn2Var.t;
        gn2.c cVar2 = gn2Var.w;
        en2Var.c = cVar;
        en2Var.d = obj;
        en2Var.n = ko5Var;
        en2Var.e = i;
        en2Var.f = i2;
        en2Var.p = k13Var;
        en2Var.g = cls;
        en2Var.h = cVar2;
        en2Var.k = cls2;
        en2Var.o = p98Var;
        en2Var.i = xk7Var;
        en2Var.j = map;
        en2Var.q = z;
        en2Var.r = z2;
        gn2Var.A = cVar;
        gn2Var.B = ko5Var;
        gn2Var.C = p98Var;
        gn2Var.D = sg3Var;
        gn2Var.E = i;
        gn2Var.F = i2;
        gn2Var.G = k13Var;
        gn2Var.H = xk7Var;
        gn2Var.I = qg3Var2;
        gn2Var.J = i3;
        gn2Var.L = gn2.e.t;
        gn2Var.N = obj;
        gn2Var.O = cVar.h;
        gn2Var.P = (Supplier) xk7Var.c(gn2.a0);
        nl5 nl5Var = this.a;
        nl5Var.getClass();
        nl5Var.a.put(sg3Var, qg3Var2);
        qg3Var2.a(hq9Var, executor);
        synchronized (qg3Var2) {
            qg3Var2.M = gn2Var;
            gn2.f fVarK = gn2Var.k(gn2.f.t);
            if (fVarK == gn2.f.u || fVarK == gn2.f.v) {
                executor2 = qg3Var2.z;
            } else {
                executor2 = qg3Var2.F ? qg3Var2.B : qg3Var2.A;
            }
            executor2.execute(gn2Var);
        }
        if (h) {
            d("Started new load", j, sg3Var);
        }
        return new d(hq9Var, qg3Var2);
    }
}
