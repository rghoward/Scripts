package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hn6 implements Runnable {
    public final /* synthetic */ in6 t;
    public final /* synthetic */ jd4 u;

    public /* synthetic */ hn6(in6 in6Var, jd4 jd4Var) {
        this.t = in6Var;
        this.u = jd4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        in6 in6Var = this.t;
        in6Var.W.set(in6Var.Q(this.u, in6Var.Q, 0));
    }
}
