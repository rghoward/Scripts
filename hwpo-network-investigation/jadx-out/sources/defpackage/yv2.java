package defpackage;

import java.io.IOException;
import java.util.zip.Deflater;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class yv2 implements yq9 {
    public final mi8 t;
    public final Deflater u;
    public boolean v;

    public yv2(tx0 tx0Var, Deflater deflater) {
        this.t = new mi8(tx0Var);
        this.u = deflater;
    }

    @Override // defpackage.yq9, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Deflater deflater = this.u;
        if (this.v) {
            return;
        }
        deflater.finish();
        h(false);
        th = null;
        try {
            deflater.end();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        try {
            this.t.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.v = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // defpackage.yq9, java.io.Flushable
    public final void flush() throws IOException {
        h(true);
        this.t.flush();
    }

    public final void h(boolean z) throws IOException {
        f99 f99VarW;
        int iDeflate;
        mi8 mi8Var = this.t;
        tx0 tx0Var = mi8Var.u;
        while (true) {
            f99VarW = tx0Var.W(1);
            byte[] bArr = f99VarW.a;
            int i = f99VarW.c;
            Deflater deflater = this.u;
            if (z) {
                try {
                    iDeflate = deflater.deflate(bArr, i, 8192 - i, 2);
                } catch (NullPointerException e) {
                    throw new IOException("Deflater already closed", e);
                }
            } else {
                iDeflate = deflater.deflate(bArr, i, 8192 - i);
            }
            if (iDeflate > 0) {
                f99VarW.c += iDeflate;
                tx0Var.u += (long) iDeflate;
                mi8Var.h();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (f99VarW.b == f99VarW.c) {
            tx0Var.t = f99VarW.a();
            i99.a(f99VarW);
        }
    }

    @Override // defpackage.yq9
    public final void i0(tx0 tx0Var, long j) throws IOException {
        tx0Var.getClass();
        t.b(tx0Var.u, 0L, j);
        while (true) {
            Deflater deflater = this.u;
            if (j <= 0) {
                deflater.setInput(fk2.G, 0, 0);
                return;
            }
            f99 f99Var = tx0Var.t;
            f99Var.getClass();
            int iMin = (int) Math.min(j, f99Var.c - f99Var.b);
            deflater.setInput(f99Var.a, f99Var.b, iMin);
            h(false);
            long j2 = iMin;
            tx0Var.u -= j2;
            int i = f99Var.b + iMin;
            f99Var.b = i;
            if (i == f99Var.c) {
                tx0Var.t = f99Var.a();
                i99.a(f99Var);
            }
            j -= j2;
        }
    }

    @Override // defpackage.yq9
    public final voa timeout() {
        return this.t.t.timeout();
    }

    public final String toString() {
        return "DeflaterSink(" + this.t + ')';
    }
}
