package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nqc implements n0d {
    public final Executor t;
    public final Object u = new Object();
    public final lh7 v;

    public nqc(Executor executor, lh7 lh7Var) {
        this.t = executor;
        this.v = lh7Var;
    }

    @Override // defpackage.n0d
    public final void a(r9a r9aVar) {
        if (r9aVar.n() || r9aVar.l()) {
            return;
        }
        synchronized (this.u) {
            try {
                if (this.v == null) {
                    return;
                }
                this.t.execute(new qoc(this, r9aVar));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
