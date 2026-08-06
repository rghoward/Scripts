package defpackage;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class voa {
    public static final a d = new a();
    public boolean a;
    public long b;
    public long c;

    public voa a() {
        this.a = false;
        return this;
    }

    public voa b() {
        this.c = 0L;
        return this;
    }

    public long c() {
        if (this.a) {
            return this.b;
        }
        aa0.c("No deadline");
        return 0L;
    }

    public voa d(long j) {
        this.a = true;
        this.b = j;
        return this;
    }

    public boolean e() {
        return this.a;
    }

    public void f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.a && this.b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public voa g(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        if (j >= 0) {
            this.c = timeUnit.toNanos(j);
            return this;
        }
        ca0.a(d43.b(j, "timeout < 0: "));
        return null;
    }

    public long h() {
        return this.c;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends voa {
        @Override // defpackage.voa
        public final voa g(long j, TimeUnit timeUnit) {
            timeUnit.getClass();
            return this;
        }

        @Override // defpackage.voa
        public final void f() {
        }

        @Override // defpackage.voa
        public final voa d(long j) {
            return this;
        }
    }
}
