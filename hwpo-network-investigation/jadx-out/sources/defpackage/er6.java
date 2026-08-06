package defpackage;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class er6 {
    public static final dp f = dp.d();
    public final ScheduledExecutorService a;
    public final ConcurrentLinkedQueue<fp> b;
    public final Runtime c;
    public ScheduledFuture d;
    public long e;

    public er6() {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        Runtime runtime = Runtime.getRuntime();
        this.d = null;
        this.e = -1L;
        this.a = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        this.b = new ConcurrentLinkedQueue<>();
        this.c = runtime;
    }

    public final synchronized void a(long j, final zoa zoaVar) {
        this.e = j;
        try {
            this.d = this.a.scheduleAtFixedRate(new Runnable() { // from class: cr6
                @Override // java.lang.Runnable
                public final void run() {
                    zoa zoaVar2 = zoaVar;
                    er6 er6Var = this.t;
                    fp fpVarB = er6Var.b(zoaVar2);
                    if (fpVarB != null) {
                        er6Var.b.add(fpVarB);
                    }
                }
            }, 0L, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            f.f("Unable to start collecting Memory Metrics: " + e.getMessage());
        }
    }

    public final fp b(zoa zoaVar) {
        if (zoaVar == null) {
            return null;
        }
        long jA = zoaVar.a() + zoaVar.t;
        fp.a aVarA = fp.A();
        aVarA.n();
        fp.y((fp) aVarA.u, jA);
        Runtime runtime = this.c;
        int iB = r6b.b((runtime.totalMemory() - runtime.freeMemory()) / 1024);
        aVarA.n();
        fp.z((fp) aVarA.u, iB);
        return aVarA.l();
    }
}
