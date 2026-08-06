package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r9a<TResult> {
    public void a(Executor executor, ch7 ch7Var) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public r9a<TResult> b(fh7<TResult> fh7Var) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public void c(Executor executor, fh7 fh7Var) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract q6d d(lh7 lh7Var);

    public abstract q6d e(Executor executor, lh7 lh7Var);

    public abstract q6d f(Executor executor, di7 di7Var);

    public <TContinuationResult> r9a<TContinuationResult> g(Executor executor, s02<TResult, TContinuationResult> s02Var) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> r9a<TContinuationResult> h(Executor executor, s02<TResult, r9a<TContinuationResult>> s02Var) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract Exception i();

    public abstract TResult j();

    public abstract Object k();

    public abstract boolean l();

    public abstract boolean m();

    public abstract boolean n();

    public <TContinuationResult> r9a<TContinuationResult> o(Executor executor, e5a<TResult, TContinuationResult> e5aVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
