package defpackage;

import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class q6d<TResult> extends r9a<TResult> {
    public final Object a = new Object();
    public final r1d b = new r1d();
    public boolean c;
    public volatile boolean d;
    public Object e;
    public Exception f;

    @Override // defpackage.r9a
    public final void a(Executor executor, ch7 ch7Var) {
        this.b.a(new iic(executor, ch7Var));
        u();
    }

    @Override // defpackage.r9a
    public final r9a<TResult> b(fh7<TResult> fh7Var) {
        this.b.a(new pmc(u9a.a, fh7Var));
        u();
        return this;
    }

    @Override // defpackage.r9a
    public final void c(Executor executor, fh7 fh7Var) {
        this.b.a(new pmc(executor, fh7Var));
        u();
    }

    @Override // defpackage.r9a
    public final q6d d(lh7 lh7Var) {
        e(u9a.a, lh7Var);
        return this;
    }

    @Override // defpackage.r9a
    public final q6d e(Executor executor, lh7 lh7Var) {
        this.b.a(new nqc(executor, lh7Var));
        u();
        return this;
    }

    @Override // defpackage.r9a
    public final q6d f(Executor executor, di7 di7Var) {
        this.b.a(new wuc(executor, di7Var));
        u();
        return this;
    }

    @Override // defpackage.r9a
    public final <TContinuationResult> r9a<TContinuationResult> g(Executor executor, s02<TResult, TContinuationResult> s02Var) {
        q6d q6dVar = new q6d();
        this.b.a(new fcc(executor, s02Var, q6dVar));
        u();
        return q6dVar;
    }

    @Override // defpackage.r9a
    public final <TContinuationResult> r9a<TContinuationResult> h(Executor executor, s02<TResult, r9a<TContinuationResult>> s02Var) {
        q6d q6dVar = new q6d();
        this.b.a(new uec(executor, s02Var, q6dVar));
        u();
        return q6dVar;
    }

    @Override // defpackage.r9a
    public final Exception i() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f;
        }
        return exc;
    }

    @Override // defpackage.r9a
    public final TResult j() {
        TResult tresult;
        synchronized (this.a) {
            try {
                a78.i("Task is not yet complete", this.c);
                if (this.d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f;
                if (exc != null) {
                    throw new az8(exc);
                }
                tresult = (TResult) this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return tresult;
    }

    @Override // defpackage.r9a
    public final Object k() {
        Object obj;
        synchronized (this.a) {
            try {
                a78.i("Task is not yet complete", this.c);
                if (this.d) {
                    throw new CancellationException("Task is already canceled.");
                }
                boolean zIsInstance = IOException.class.isInstance(this.f);
                Exception exc = this.f;
                if (zIsInstance) {
                    throw ((Throwable) IOException.class.cast(exc));
                }
                if (exc != null) {
                    throw new az8(exc);
                }
                obj = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // defpackage.r9a
    public final boolean l() {
        return this.d;
    }

    @Override // defpackage.r9a
    public final boolean m() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    @Override // defpackage.r9a
    public final boolean n() {
        boolean z;
        synchronized (this.a) {
            try {
                z = false;
                if (this.c && !this.d && this.f == null) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.r9a
    public final <TContinuationResult> r9a<TContinuationResult> o(Executor executor, e5a<TResult, TContinuationResult> e5aVar) {
        q6d q6dVar = new q6d();
        this.b.a(new zyc(executor, e5aVar, q6dVar));
        u();
        return q6dVar;
    }

    public final void p(Object obj) {
        synchronized (this.a) {
            t();
            this.c = true;
            this.e = obj;
        }
        this.b.b(this);
    }

    public final boolean q(Object obj) {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return false;
                }
                this.c = true;
                this.e = obj;
                this.b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void r(Exception exc) {
        a78.h(exc, "Exception must not be null");
        synchronized (this.a) {
            t();
            this.c = true;
            this.f = exc;
        }
        this.b.b(this);
    }

    public final void s() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return;
                }
                this.c = true;
                this.d = true;
                this.b.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void t() {
        String strConcat;
        if (this.c) {
            if (!m()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception excI = i();
            if (excI != null) {
                strConcat = "failure";
            } else if (n()) {
                strConcat = "result ".concat(String.valueOf(j()));
            } else {
                strConcat = this.d ? "cancellation" : "unknown issue";
            }
        }
    }

    public final void u() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    this.b.b(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
