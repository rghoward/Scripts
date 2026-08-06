package org.msgpack.core;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class MessageSizeException extends MessagePackException {
    private final long size;

    public MessageSizeException(long j) {
        this.size = j;
    }

    public long getSize() {
        return this.size;
    }

    public MessageSizeException(String str, long j) {
        super(str);
        this.size = j;
    }
}
