package defpackage;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class szb implements Closeable {
    public static final rzb u = new rzb();
    public int t = 0;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.t;
        if (i > 0) {
            this.t = i - 1;
        } else {
            sx0.a("Mismatched calls to RecursionDepth (possible error in core library)");
        }
    }
}
