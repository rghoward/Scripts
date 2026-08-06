package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pmc implements n0d {
    public final Executor t;
    public final Object u = new Object();
    public final fh7 v;

    public pmc(Executor executor, fh7 fh7Var) {
        this.t = executor;
        this.v = fh7Var;
    }

    @Override // defpackage.n0d
    public final void a(r9a r9aVar) {
        synchronized (this.u) {
        }
        this.t.execute(new lkc(this, r9aVar));
    }
}
