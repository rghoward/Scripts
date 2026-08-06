package defpackage;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface u3d extends Closeable {
    void a();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    default void close() {
    }
}
