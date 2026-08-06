package org.msgpack.core.buffer;

import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface MessageBufferOutput extends Closeable, Flushable {
    void add(byte[] bArr, int i, int i2);

    MessageBuffer next(int i);

    void write(byte[] bArr, int i, int i2);

    void writeBuffer(int i);
}
