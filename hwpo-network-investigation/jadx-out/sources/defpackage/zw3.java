package defpackage;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.Closeable;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zw3 implements Closeable {
    public boolean t;
    public int u;
    public final ReentrantLock v = new ReentrantLock();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements kw9 {
        public final zw3 t;
        public long u;
        public boolean v;

        public a(zw3 zw3Var, long j) {
            this.t = zw3Var;
            this.u = j;
        }

        @Override // defpackage.kw9
        public final long O(tx0 tx0Var, long j) {
            long j2;
            long j3;
            tx0Var.getClass();
            if (this.v) {
                aa0.c(MetricTracker.Action.CLOSED);
                return 0L;
            }
            long j4 = this.u;
            if (j < 0) {
                ca0.a(d43.b(j, "byteCount < 0: "));
                return 0L;
            }
            long j5 = j + j4;
            long j6 = j4;
            while (true) {
                if (j6 < j5) {
                    f99 f99VarW = tx0Var.W(1);
                    byte[] bArr = f99VarW.a;
                    int i = f99VarW.c;
                    j2 = -1;
                    int iK = this.t.k(j6, bArr, i, (int) Math.min(j5 - j6, 8192 - i));
                    if (iK == -1) {
                        if (f99VarW.b == f99VarW.c) {
                            tx0Var.t = f99VarW.a();
                            i99.a(f99VarW);
                        }
                        if (j4 == j6) {
                            j3 = -1;
                            break;
                        }
                    } else {
                        f99VarW.c += iK;
                        long j7 = iK;
                        j6 += j7;
                        tx0Var.u += j7;
                    }
                } else {
                    j2 = -1;
                }
                j3 = j6 - j4;
                break;
            }
            if (j3 != j2) {
                this.u += j3;
            }
            return j3;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.v) {
                return;
            }
            this.v = true;
            zw3 zw3Var = this.t;
            ReentrantLock reentrantLock = zw3Var.v;
            reentrantLock.lock();
            try {
                int i = zw3Var.u - 1;
                zw3Var.u = i;
                if (i == 0 && zw3Var.t) {
                    g2b g2bVar = g2b.a;
                    reentrantLock.unlock();
                    zw3Var.h();
                    return;
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }

        @Override // defpackage.kw9
        public final voa timeout() {
            return voa.d;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.v;
        reentrantLock.lock();
        try {
            if (this.t) {
                reentrantLock.unlock();
                return;
            }
            this.t = true;
            if (this.u != 0) {
                reentrantLock.unlock();
                return;
            }
            g2b g2bVar = g2b.a;
            reentrantLock.unlock();
            h();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public abstract void h();

    public abstract int k(long j, byte[] bArr, int i, int i2);

    public abstract long m();

    public final a p(long j) {
        ReentrantLock reentrantLock = this.v;
        reentrantLock.lock();
        try {
            if (this.t) {
                throw new IllegalStateException(MetricTracker.Action.CLOSED);
            }
            this.u++;
            reentrantLock.unlock();
            return new a(this, j);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long size() {
        ReentrantLock reentrantLock = this.v;
        reentrantLock.lock();
        try {
            if (this.t) {
                throw new IllegalStateException(MetricTracker.Action.CLOSED);
            }
            g2b g2bVar = g2b.a;
            reentrantLock.unlock();
            return m();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
