package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class aaa implements Runnable {
    public final /* synthetic */ z9a t;

    public aaa(z9a z9aVar) {
        this.t = z9aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q9a q9aVarB;
        long jNanoTime;
        q9a q9aVarB2;
        z9a z9aVar = this.t;
        synchronized (z9aVar) {
            z9aVar.g++;
            q9aVarB = z9aVar.b();
        }
        if (q9aVarB == null) {
            return;
        }
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        while (true) {
            try {
                threadCurrentThread.setName(q9aVarB.a);
                Logger logger = this.t.b;
                y9a y9aVar = q9aVarB.c;
                y9aVar.getClass();
                boolean zIsLoggable = logger.isLoggable(Level.FINE);
                if (zIsLoggable) {
                    jNanoTime = System.nanoTime();
                    d18.a(logger, q9aVarB, y9aVar, "starting");
                } else {
                    jNanoTime = -1;
                }
                try {
                    long jA = q9aVarB.a();
                    if (zIsLoggable) {
                        d18.a(logger, q9aVarB, y9aVar, "finished run in " + d18.b(System.nanoTime() - jNanoTime));
                    }
                    z9a z9aVar2 = this.t;
                    synchronized (z9aVar2) {
                        z9a.a(z9aVar2, q9aVarB, jA, true);
                        q9aVarB2 = z9aVar2.b();
                    }
                    if (q9aVarB2 == null) {
                        threadCurrentThread.setName(name);
                        return;
                    }
                    q9aVarB = q9aVarB2;
                } catch (Throwable th) {
                    if (zIsLoggable) {
                        d18.a(logger, q9aVarB, y9aVar, "failed a run in " + d18.b(System.nanoTime() - jNanoTime));
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    z9a z9aVar3 = this.t;
                    synchronized (z9aVar3) {
                        z9a.a(z9aVar3, q9aVarB, -1L, false);
                        g2b g2bVar = g2b.a;
                        if (!(th2 instanceof InterruptedException)) {
                            throw th2;
                        }
                        Thread.currentThread().interrupt();
                        threadCurrentThread.setName(name);
                        return;
                    }
                } catch (Throwable th3) {
                    threadCurrentThread.setName(name);
                    throw th3;
                }
            }
        }
    }
}
