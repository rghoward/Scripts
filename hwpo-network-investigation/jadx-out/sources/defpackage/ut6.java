package defpackage;

import java.io.Closeable;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ut6 implements Closeable {
    public final boolean t;
    public final tx0 u = new tx0();
    public Inflater v;
    public dc5 w;

    public ut6(boolean z) {
        this.t = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        dc5 dc5Var = this.w;
        if (dc5Var != null) {
            dc5Var.close();
        }
        this.w = null;
        this.v = null;
    }
}
