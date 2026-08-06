package defpackage;

import java.io.Closeable;
import java.util.zip.Deflater;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ot6 implements Closeable {
    public final boolean t;
    public final tx0 u;
    public final Deflater v;
    public final yv2 w;

    public ot6(boolean z) {
        this.t = z;
        tx0 tx0Var = new tx0();
        this.u = tx0Var;
        Deflater deflater = new Deflater(-1, true);
        this.v = deflater;
        this.w = new yv2(tx0Var, deflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        this.w.close();
    }
}
