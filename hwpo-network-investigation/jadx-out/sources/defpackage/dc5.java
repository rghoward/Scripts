package defpackage;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class dc5 implements kw9 {
    public final ni8 t;
    public final Inflater u;
    public int v;
    public boolean w;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public dc5(kw9 kw9Var, Inflater inflater) {
        this(new ni8(kw9Var), inflater);
        kw9Var.getClass();
    }

    @Override // defpackage.kw9
    public final long O(tx0 tx0Var, long j) {
        tx0Var.getClass();
        do {
            long jH = h(tx0Var, j);
            if (jH > 0) {
                return jH;
            }
            Inflater inflater = this.u;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.t.z());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.w) {
            return;
        }
        this.u.end();
        this.w = true;
        this.t.close();
    }

    public final long h(tx0 tx0Var, long j) throws IOException {
        Inflater inflater = this.u;
        tx0Var.getClass();
        if (j < 0) {
            ca0.a(d43.b(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.w) {
            aa0.c(MetricTracker.Action.CLOSED);
            return 0L;
        }
        if (j != 0) {
            try {
                f99 f99VarW = tx0Var.W(1);
                int iMin = (int) Math.min(j, 8192 - f99VarW.c);
                boolean zNeedsInput = inflater.needsInput();
                ni8 ni8Var = this.t;
                if (zNeedsInput && !ni8Var.z()) {
                    f99 f99Var = ni8Var.u.t;
                    f99Var.getClass();
                    int i = f99Var.c;
                    int i2 = f99Var.b;
                    int i3 = i - i2;
                    this.v = i3;
                    inflater.setInput(f99Var.a, i2, i3);
                }
                int iInflate = inflater.inflate(f99VarW.a, f99VarW.c, iMin);
                int i4 = this.v;
                if (i4 != 0) {
                    int remaining = i4 - inflater.getRemaining();
                    this.v -= remaining;
                    ni8Var.skip(remaining);
                }
                if (iInflate > 0) {
                    f99VarW.c += iInflate;
                    long j2 = iInflate;
                    tx0Var.u += j2;
                    return j2;
                }
                if (f99VarW.b == f99VarW.c) {
                    tx0Var.t = f99VarW.a();
                    i99.a(f99VarW);
                }
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
        return 0L;
    }

    @Override // defpackage.kw9
    public final voa timeout() {
        return this.t.t.timeout();
    }

    public dc5(ni8 ni8Var, Inflater inflater) {
        this.t = ni8Var;
        this.u = inflater;
    }
}
