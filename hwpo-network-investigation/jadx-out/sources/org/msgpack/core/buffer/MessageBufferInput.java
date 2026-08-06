package org.msgpack.core.buffer;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface MessageBufferInput extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    MessageBuffer next();
}
