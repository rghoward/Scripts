package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class x0d implements z0d {
    public static boolean d;
    public final l5a a;
    public final int b = Math.max(5, 10);
    public final w0d c = w0d.t;

    public x0d(l5a l5aVar) {
        this.a = l5aVar;
    }

    @Override // defpackage.z0d
    public final void a() {
        synchronized (x0d.class) {
            try {
                if (!d) {
                    lic licVar = new lic(this);
                    long j = this.b;
                    TimeUnit timeUnit = TimeUnit.MINUTES;
                    ib6 ib6Var = (ib6) this.a.get();
                    hy6.b.a aVarSchedule = ib6Var.schedule((Runnable) new v0d(this, licVar, ib6Var, j), j, timeUnit);
                    aVarSchedule.Q(new f0d(aVarSchedule), y03.t);
                    d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
