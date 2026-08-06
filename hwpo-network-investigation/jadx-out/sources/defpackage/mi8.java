package defpackage;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class mi8 implements fy0 {
    public final yq9 t;
    public final tx0 u;
    public boolean v;

    public mi8(yq9 yq9Var) {
        yq9Var.getClass();
        this.t = yq9Var;
        this.u = new tx0();
    }

    @Override // defpackage.fy0
    public final long F(kw9 kw9Var) {
        kw9Var.getClass();
        long j = 0;
        while (true) {
            long jO = kw9Var.O(this.u, 8192L);
            if (jO == -1) {
                return j;
            }
            j += jO;
            h();
        }
    }

    @Override // defpackage.fy0
    public final fy0 R(String str) {
        str.getClass();
        if (this.v) {
            aa0.c(MetricTracker.Action.CLOSED);
            return null;
        }
        this.u.g0(str);
        h();
        return this;
    }

    @Override // defpackage.fy0
    public final fy0 U(long j) {
        if (this.v) {
            aa0.c(MetricTracker.Action.CLOSED);
            return null;
        }
        this.u.c0(j);
        h();
        return this;
    }

    @Override // defpackage.yq9, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        yq9 yq9Var = this.t;
        if (this.v) {
            return;
        }
        tx0 tx0Var = this.u;
        long j = tx0Var.u;
        if (j > 0) {
            yq9Var.i0(tx0Var, j);
        }
        th = null;
        try {
            yq9Var.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.v = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // defpackage.fy0, defpackage.yq9, java.io.Flushable
    public final void flush() {
        if (this.v) {
            aa0.c(MetricTracker.Action.CLOSED);
            return;
        }
        tx0 tx0Var = this.u;
        long j = tx0Var.u;
        yq9 yq9Var = this.t;
        if (j > 0) {
            yq9Var.i0(tx0Var, j);
        }
        yq9Var.flush();
    }

    public final fy0 h() {
        if (this.v) {
            aa0.c(MetricTracker.Action.CLOSED);
            return null;
        }
        tx0 tx0Var = this.u;
        long jP = tx0Var.p();
        if (jP > 0) {
            this.t.i0(tx0Var, jP);
        }
        return this;
    }

    @Override // defpackage.yq9
    public final void i0(tx0 tx0Var, long j) {
        tx0Var.getClass();
        if (this.v) {
            aa0.c(MetricTracker.Action.CLOSED);
        } else {
            this.u.i0(tx0Var, j);
            h();
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.v;
    }

    @Override // defpackage.fy0
    public final tx0 j() {
        return this.u;
    }

    @Override // defpackage.fy0
    public final fy0 k0(g01 g01Var) {
        g01Var.getClass();
        if (this.v) {
            aa0.c(MetricTracker.Action.CLOSED);
            return null;
        }
        this.u.Y(g01Var);
        h();
        return this;
    }

    @Override // defpackage.fy0
    public final fy0 o0(long j) {
        if (this.v) {
            aa0.c(MetricTracker.Action.CLOSED);
            return null;
        }
        this.u.a0(j);
        h();
        return this;
    }

    @Override // defpackage.yq9
    public final voa timeout() {
        return this.t.timeout();
    }

    public final String toString() {
        return "buffer(" + this.t + ')';
    }

    @Override // defpackage.fy0
    public final fy0 write(byte[] bArr) {
        bArr.getClass();
        if (this.v) {
            aa0.c(MetricTracker.Action.CLOSED);
            return null;
        }
        tx0 tx0Var = this.u;
        tx0Var.getClass();
        tx0Var.m884write(bArr, 0, bArr.length);
        h();
        return this;
    }

    @Override // defpackage.fy0
    public final fy0 writeByte(int i) {
        if (this.v) {
            aa0.c(MetricTracker.Action.CLOSED);
            return null;
        }
        this.u.Z(i);
        h();
        return this;
    }

    @Override // defpackage.fy0
    public final fy0 writeInt(int i) {
        if (this.v) {
            aa0.c(MetricTracker.Action.CLOSED);
            return null;
        }
        this.u.d0(i);
        h();
        return this;
    }

    @Override // defpackage.fy0
    public final fy0 writeShort(int i) {
        if (this.v) {
            aa0.c(MetricTracker.Action.CLOSED);
            return null;
        }
        this.u.e0(i);
        h();
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        if (!this.v) {
            int iWrite = this.u.write(byteBuffer);
            h();
            return iWrite;
        }
        aa0.c(MetricTracker.Action.CLOSED);
        return 0;
    }

    @Override // defpackage.fy0
    public final fy0 write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        if (!this.v) {
            this.u.m884write(bArr, i, i2);
            h();
            return this;
        }
        aa0.c(MetricTracker.Action.CLOSED);
        return null;
    }
}
