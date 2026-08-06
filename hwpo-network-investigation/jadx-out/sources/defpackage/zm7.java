package defpackage;

import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zm7 implements yq9 {
    public final FileOutputStream t;
    public final voa u;

    public zm7(FileOutputStream fileOutputStream, voa voaVar) {
        this.t = fileOutputStream;
        this.u = voaVar;
    }

    @Override // defpackage.yq9, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.t.close();
    }

    @Override // defpackage.yq9, java.io.Flushable
    public final void flush() throws IOException {
        this.t.flush();
    }

    @Override // defpackage.yq9
    public final void i0(tx0 tx0Var, long j) throws IOException {
        tx0Var.getClass();
        t.b(tx0Var.u, 0L, j);
        while (j > 0) {
            this.u.f();
            f99 f99Var = tx0Var.t;
            f99Var.getClass();
            int iMin = (int) Math.min(j, f99Var.c - f99Var.b);
            this.t.write(f99Var.a, f99Var.b, iMin);
            int i = f99Var.b + iMin;
            f99Var.b = i;
            long j2 = iMin;
            j -= j2;
            tx0Var.u -= j2;
            if (i == f99Var.c) {
                tx0Var.t = f99Var.a();
                i99.a(f99Var);
            }
        }
    }

    @Override // defpackage.yq9
    public final voa timeout() {
        return this.u;
    }

    public final String toString() {
        return "sink(" + this.t + ')';
    }
}
