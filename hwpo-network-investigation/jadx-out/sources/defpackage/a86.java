package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class a86 extends n72 implements zv2 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater A = AtomicIntegerFieldUpdater.newUpdater(a86.class, "runningWorkers$volatile");
    private volatile /* synthetic */ int runningWorkers$volatile;
    public final /* synthetic */ zv2 v;
    public final n72 w;
    public final int x;
    public final id6<Runnable> y;
    public final Object z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class a implements Runnable {
        public Runnable t;

        public a(Runnable runnable) {
            this.t = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = 0;
            while (true) {
                try {
                    this.t.run();
                } catch (Throwable th) {
                    q72.a(ff3.t, th);
                }
                try {
                    Runnable runnableX0 = a86.this.x0();
                    if (runnableX0 == null) {
                        return;
                    }
                    this.t = runnableX0;
                    i++;
                    if (i >= 16) {
                        a86 a86Var = a86.this;
                        if (b23.g(a86Var.w, a86Var)) {
                            a86 a86Var2 = a86.this;
                            b23.f(a86Var2.w, a86Var2, this);
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    a86 a86Var3 = a86.this;
                    synchronized (a86Var3.z) {
                        a86.A.decrementAndGet(a86Var3);
                        throw th2;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a86(n72 n72Var, int i) {
        zv2 zv2Var = n72Var instanceof zv2 ? (zv2) n72Var : null;
        this.v = zv2Var == null ? yq2.a : zv2Var;
        this.w = n72Var;
        this.x = i;
        this.y = new id6<>();
        this.z = new Object();
    }

    @Override // defpackage.zv2
    public final e33 K(long j, Runnable runnable, h72 h72Var) {
        return this.v.K(j, runnable, h72Var);
    }

    @Override // defpackage.zv2
    public final void Y(long j, e41 e41Var) {
        this.v.Y(j, e41Var);
    }

    @Override // defpackage.n72
    public final void t0(h72 h72Var, Runnable runnable) {
        Runnable runnableX0;
        this.y.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A;
        if (atomicIntegerFieldUpdater.get(this) >= this.x || !y0() || (runnableX0 = x0()) == null) {
            return;
        }
        try {
            b23.f(this.w, this, new a(runnableX0));
        } catch (Throwable th) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th;
        }
    }

    @Override // defpackage.n72
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.w);
        sb.append(".limitedParallelism(");
        return e44.a(sb, this.x, ')');
    }

    @Override // defpackage.n72
    public final void u0(h72 h72Var, Runnable runnable) {
        Runnable runnableX0;
        this.y.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A;
        if (atomicIntegerFieldUpdater.get(this) >= this.x || !y0() || (runnableX0 = x0()) == null) {
            return;
        }
        try {
            this.w.u0(this, new a(runnableX0));
        } catch (Throwable th) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th;
        }
    }

    @Override // defpackage.n72
    public final n72 w0(int i) {
        pp0.c(1);
        return 1 >= this.x ? this : super.w0(1);
    }

    public final Runnable x0() {
        while (true) {
            Runnable runnableD = this.y.d();
            if (runnableD != null) {
                return runnableD;
            }
            synchronized (this.z) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.y.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean y0() {
        synchronized (this.z) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A;
            if (atomicIntegerFieldUpdater.get(this) >= this.x) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }
}
