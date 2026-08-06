package defpackage;

import android.os.SystemClock;
import android.util.Log;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class io8 {
    public final double a;
    public final double b;
    public final long c;
    public final long d;
    public final int e;
    public final ArrayBlockingQueue f;
    public final ThreadPoolExecutor g;
    public final bxa<u92> h;
    public final jh7 i;
    public int j;
    public long k;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class a implements Runnable {
        public final ga2 t;
        public final t9a<ga2> u;

        public a(ga2 ga2Var, t9a t9aVar) {
            this.t = ga2Var;
            this.u = t9aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            t9a<ga2> t9aVar = this.u;
            io8 io8Var = io8.this;
            ga2 ga2Var = this.t;
            io8Var.b(ga2Var, t9aVar);
            io8Var.i.b.set(0);
            double dMin = Math.min(3600000.0d, Math.pow(io8Var.b, io8Var.a()) * (60000.0d / io8Var.a));
            String str = "Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(dMin / 1000.0d)) + " s for report: " + ga2Var.c();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            try {
                Thread.sleep((long) dMin);
            } catch (InterruptedException unused) {
            }
        }
    }

    public io8(bxa<u92> bxaVar, nk9 nk9Var, jh7 jh7Var) {
        double d = nk9Var.d;
        double d2 = nk9Var.e;
        long j = ((long) nk9Var.f) * 1000;
        this.a = d;
        this.b = d2;
        this.c = j;
        this.h = bxaVar;
        this.i = jh7Var;
        this.d = SystemClock.elapsedRealtime();
        int i = (int) d;
        this.e = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.f = arrayBlockingQueue;
        this.g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.j = 0;
        this.k = 0L;
    }

    public final int a() {
        if (this.k == 0) {
            this.k = System.currentTimeMillis();
        }
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - this.k) / this.c);
        int size = this.f.size();
        int i = this.j;
        int iMin = size == this.e ? Math.min(100, i + iCurrentTimeMillis) : Math.max(0, i - iCurrentTimeMillis);
        if (this.j != iMin) {
            this.j = iMin;
            this.k = System.currentTimeMillis();
        }
        return iMin;
    }

    public final void b(final ga2 ga2Var, final t9a<ga2> t9aVar) {
        String str = "Sending report through Google DataTransport: " + ga2Var.c();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        final boolean z = SystemClock.elapsedRealtime() - this.d < 2000;
        ((hxa) this.h).a(new ae0(ga2Var.a(), o98.v, null), new rxa() { // from class: go8
            @Override // defpackage.rxa
            public final void a(Exception exc) throws Throwable {
                t9a t9aVar2 = t9aVar;
                if (exc != null) {
                    t9aVar2.c(exc);
                    return;
                }
                if (z) {
                    boolean z2 = true;
                    final CountDownLatch countDownLatch = new CountDownLatch(1);
                    final io8 io8Var = this.a;
                    new Thread(new Runnable() { // from class: ho8
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                bxa<u92> bxaVar = io8Var.h;
                                o98 o98Var = o98.v;
                                if (bxaVar instanceof hxa) {
                                    pxa.a().d.a(((hxa) bxaVar).a.d(o98Var), 1);
                                } else {
                                    String strC = be6.c("ForcedSender");
                                    if (Log.isLoggable(strC, 5)) {
                                        Log.w(strC, String.format("Expected instance of `TransportImpl`, got `%s`.", bxaVar));
                                    }
                                }
                            } catch (Exception unused) {
                            }
                            countDownLatch.countDown();
                        }
                    }).start();
                    ExecutorService executorService = p6b.a;
                    boolean z3 = false;
                    try {
                        long jNanoTime = 2000000000;
                        long jNanoTime2 = System.nanoTime() + 2000000000;
                        while (true) {
                            try {
                                try {
                                    countDownLatch.await(jNanoTime, TimeUnit.NANOSECONDS);
                                    break;
                                } catch (Throwable th) {
                                    th = th;
                                    if (z2) {
                                        Thread.currentThread().interrupt();
                                    }
                                    throw th;
                                }
                            } catch (InterruptedException unused) {
                                jNanoTime = jNanoTime2 - System.nanoTime();
                                z3 = true;
                            }
                        }
                        if (z3) {
                            Thread.currentThread().interrupt();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z2 = z3;
                    }
                }
                t9aVar2.d(ga2Var);
            }
        });
    }
}
