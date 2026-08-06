package defpackage;

import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class vq0 implements yq9 {
    @Override // defpackage.yq9
    public final void i0(tx0 tx0Var, long j) throws EOFException {
        tx0Var.getClass();
        tx0Var.skip(j);
    }

    @Override // defpackage.yq9
    public final voa timeout() {
        return voa.d;
    }

    @Override // defpackage.yq9, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.yq9, java.io.Flushable
    public final void flush() {
    }
}
