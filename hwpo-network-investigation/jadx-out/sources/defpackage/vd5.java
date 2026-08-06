package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class vd5 implements kw9 {
    public final InputStream t;
    public final voa u;

    public vd5(InputStream inputStream, voa voaVar) {
        inputStream.getClass();
        voaVar.getClass();
        this.t = inputStream;
        this.u = voaVar;
    }

    @Override // defpackage.kw9
    public final long O(tx0 tx0Var, long j) throws IOException {
        tx0Var.getClass();
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            ca0.a(d43.b(j, "byteCount < 0: "));
            return 0L;
        }
        try {
            this.u.f();
            f99 f99VarW = tx0Var.W(1);
            int i = this.t.read(f99VarW.a, f99VarW.c, (int) Math.min(j, 8192 - f99VarW.c));
            if (i != -1) {
                f99VarW.c += i;
                long j2 = i;
                tx0Var.u += j2;
                return j2;
            }
            if (f99VarW.b != f99VarW.c) {
                return -1L;
            }
            tx0Var.t = f99VarW.a();
            i99.a(f99VarW);
            return -1L;
        } catch (AssertionError e) {
            if (ttb.a(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.t.close();
    }

    @Override // defpackage.kw9
    public final voa timeout() {
        return this.u;
    }

    public final String toString() {
        return "source(" + this.t + ')';
    }
}
