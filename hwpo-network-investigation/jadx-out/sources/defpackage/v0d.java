package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class v0d implements Runnable {
    public final /* synthetic */ lic t;
    public final /* synthetic */ ib6 u;
    public final /* synthetic */ long v;

    public v0d(x0d x0dVar, lic licVar, ib6 ib6Var, long j) {
        this.t = licVar;
        this.u = ib6Var;
        this.v = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.t.run();
        hy6.b.a aVarSchedule = this.u.schedule((Runnable) this, this.v, TimeUnit.MINUTES);
        aVarSchedule.Q(new f0d(aVarSchedule), y03.t);
    }
}
