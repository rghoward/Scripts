package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zyc<TResult, TContinuationResult> implements di7<TContinuationResult>, lh7, ch7, n0d {
    public final Executor t;
    public final e5a u;
    public final q6d v;

    public zyc(Executor executor, e5a e5aVar, q6d q6dVar) {
        this.t = executor;
        this.u = e5aVar;
        this.v = q6dVar;
    }

    @Override // defpackage.n0d
    public final void a(r9a r9aVar) {
        this.t.execute(new wwc(this, r9aVar));
    }

    @Override // defpackage.ch7
    public final void b() {
        this.v.s();
    }

    @Override // defpackage.lh7
    public final void d(Exception exc) {
        this.v.r(exc);
    }

    @Override // defpackage.di7
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.v.p(tcontinuationresult);
    }
}
