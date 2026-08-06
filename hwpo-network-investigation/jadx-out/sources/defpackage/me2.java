package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class me2 implements Closeable {
    public nf8<Executor> t;
    public we5 u;
    public nf8 v;
    public f59 w;
    public nf8<String> x;
    public nf8<hz8> y;
    public nf8<pxa> z;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.y.get().close();
    }
}
