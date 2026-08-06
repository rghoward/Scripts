package defpackage;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class z6d implements Runnable, Closeable {
    public i7d t;
    public final boolean u = kr5.b(Thread.currentThread());
    public boolean v;
    public boolean w;
    public final boolean x;

    public z6d(i7d i7dVar, boolean z) {
        this.x = false;
        this.t = i7dVar;
        this.x = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        i7d i7dVar = this.t;
        try {
            this.t = null;
            boolean z = this.w;
            if (!z) {
                if (this.v) {
                    throw new IllegalStateException("Span was already closed!");
                }
                this.v = true;
                if (this.u && !z) {
                    kr5.b(Thread.currentThread());
                }
            }
            if (i7dVar != null) {
                i7dVar.close();
            }
            if (this.x) {
                m6d.b(m6d.c(), x6d.z);
            }
        } catch (Throwable th) {
            if (i7dVar != null) {
                try {
                    i7dVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final void h(b1 b1Var) {
        if (this.v) {
            aa0.c("Span was already closed. Did you attach it to a future after calling Tracer.endSpan()?");
        } else if (this.w) {
            aa0.c("Signal is already attached to future");
        } else {
            this.w = true;
            b1Var.Q(this, y03.t);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        if (this.v || !(z = this.w)) {
            kr5.c().post(y6d.t);
            return;
        }
        this.v = true;
        if (!this.u || z) {
            return;
        }
        kr5.b(Thread.currentThread());
    }
}
