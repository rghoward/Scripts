package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qg3<R> implements at3.d {
    public static final c P = new c();
    public final sm4 A;
    public final sm4 B;
    public final AtomicInteger C;
    public sg3 D;
    public boolean E;
    public boolean F;
    public kt8<?> G;
    public kf2 H;
    public boolean I;
    public rm4 J;
    public boolean K;
    public tg3<?> L;
    public gn2<R> M;
    public volatile boolean N;
    public boolean O;
    public final e t;
    public final p0a.a u;
    public final tg3.a v;
    public final w58<qg3<?>> w;
    public final c x;
    public final rg3 y;
    public final sm4 z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements Runnable {
        public final hq9 t;

        public a(hq9 hq9Var) {
            this.t = hq9Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            hq9 hq9Var = this.t;
            hq9Var.b.a();
            synchronized (hq9Var.c) {
                synchronized (qg3.this) {
                    try {
                        if (qg3.this.t.t.contains(new d(this.t, sn3.b))) {
                            qg3 qg3Var = qg3.this;
                            hq9 hq9Var2 = this.t;
                            qg3Var.getClass();
                            try {
                                hq9Var2.i(qg3Var.J, 5);
                            } catch (Throwable th) {
                                throw new w21(th);
                            }
                        }
                        qg3.this.c();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class b implements Runnable {
        public final hq9 t;

        public b(hq9 hq9Var) {
            this.t = hq9Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            hq9 hq9Var = this.t;
            hq9Var.b.a();
            synchronized (hq9Var.c) {
                synchronized (qg3.this) {
                    try {
                        if (qg3.this.t.t.contains(new d(this.t, sn3.b))) {
                            qg3.this.L.b();
                            qg3 qg3Var = qg3.this;
                            hq9 hq9Var2 = this.t;
                            qg3Var.getClass();
                            try {
                                hq9Var2.l(qg3Var.L, qg3Var.H, qg3Var.O);
                                qg3.this.h(this.t);
                            } catch (Throwable th) {
                                throw new w21(th);
                            }
                        }
                        qg3.this.c();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class c {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d {
        public final hq9 a;
        public final Executor b;

        public d(hq9 hq9Var, Executor executor) {
            this.a = hq9Var;
            this.b = executor;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof d) && this.a == ((d) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class e implements Iterable<d> {
        public final ArrayList t;

        public e(ArrayList arrayList) {
            this.t = arrayList;
        }

        @Override // java.lang.Iterable
        public final Iterator<d> iterator() {
            return this.t.iterator();
        }
    }

    public qg3() {
        throw null;
    }

    public qg3(sm4 sm4Var, sm4 sm4Var2, sm4 sm4Var3, sm4 sm4Var4, hg3 hg3Var, hg3 hg3Var2, at3.c cVar) {
        this.t = new e(new ArrayList(2));
        this.u = new p0a.a();
        this.C = new AtomicInteger();
        this.z = sm4Var;
        this.A = sm4Var2;
        this.B = sm4Var4;
        this.y = hg3Var;
        this.v = hg3Var2;
        this.w = cVar;
        this.x = P;
    }

    public final synchronized void a(hq9 hq9Var, Executor executor) {
        try {
            this.u.a();
            this.t.t.add(new d(hq9Var, executor));
            if (this.I) {
                d(1);
                executor.execute(new b(hq9Var));
            } else if (this.K) {
                d(1);
                executor.execute(new a(hq9Var));
            } else {
                ov9.b("Cannot add callbacks to a cancelled EngineJob", !this.N);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b() {
        if (e()) {
            return;
        }
        this.N = true;
        gn2<R> gn2Var = this.M;
        gn2Var.Y = true;
        ye2 ye2Var = gn2Var.W;
        if (ye2Var != null) {
            ye2Var.cancel();
        }
        rg3 rg3Var = this.y;
        sg3 sg3Var = this.D;
        hg3 hg3Var = (hg3) rg3Var;
        synchronized (hg3Var) {
            nl5 nl5Var = hg3Var.a;
            nl5Var.getClass();
            HashMap map = nl5Var.a;
            if (this == map.get(sg3Var)) {
                map.remove(sg3Var);
            }
        }
    }

    public final void c() {
        tg3<?> tg3Var;
        synchronized (this) {
            try {
                this.u.a();
                ov9.b("Not yet complete!", e());
                int iDecrementAndGet = this.C.decrementAndGet();
                ov9.b("Can't decrement below 0", iDecrementAndGet >= 0);
                if (iDecrementAndGet == 0) {
                    tg3Var = this.L;
                    f();
                } else {
                    tg3Var = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (tg3Var != null) {
            tg3Var.d();
        }
    }

    public final synchronized void d(int i) {
        tg3<?> tg3Var;
        ov9.b("Not yet complete!", e());
        if (this.C.getAndAdd(i) == 0 && (tg3Var = this.L) != null) {
            tg3Var.b();
        }
    }

    public final boolean e() {
        return this.K || this.I || this.N;
    }

    public final synchronized void f() {
        boolean zA;
        if (this.D == null) {
            throw new IllegalArgumentException();
        }
        this.t.t.clear();
        this.D = null;
        this.L = null;
        this.G = null;
        this.K = false;
        this.N = false;
        this.I = false;
        this.O = false;
        gn2<R> gn2Var = this.M;
        gn2.d dVar = gn2Var.z;
        synchronized (dVar) {
            dVar.a = true;
            zA = dVar.a();
        }
        if (zA) {
            gn2Var.n();
        }
        this.M = null;
        this.J = null;
        this.H = null;
        this.w.a(this);
    }

    @Override // at3.d
    public final p0a.a g() {
        return this.u;
    }

    public final synchronized void h(hq9 hq9Var) {
        try {
            this.u.a();
            this.t.t.remove(new d(hq9Var, sn3.b));
            if (this.t.t.isEmpty()) {
                b();
                if (this.I || this.K) {
                    if (this.C.get() == 0) {
                        f();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
