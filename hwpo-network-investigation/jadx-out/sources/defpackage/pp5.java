package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class pp5 implements Runnable {
    public final /* synthetic */ op5 t;
    public final /* synthetic */ Throwable u;

    public pp5(op5 op5Var, Throwable th) {
        this.t = op5Var;
        this.u = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        th0.e(this.t).resumeWith(dv8.a(this.u));
    }
}
