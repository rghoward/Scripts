package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class iic implements n0d {
    public final Executor t;
    public final Object u = new Object();
    public final ch7 v;

    public iic(Executor executor, ch7 ch7Var) {
        this.t = executor;
        this.v = ch7Var;
    }

    @Override // defpackage.n0d
    public final void a(r9a r9aVar) {
        if (r9aVar.l()) {
            synchronized (this.u) {
                try {
                    if (this.v == null) {
                        return;
                    }
                    this.t.execute(new egc(this));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
