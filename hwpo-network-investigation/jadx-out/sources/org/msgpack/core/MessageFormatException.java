package org.msgpack.core;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class MessageFormatException extends MessagePackException {
    public MessageFormatException(Throwable th) {
        super(th);
    }

    public MessageFormatException(String str) {
        super(str);
    }

    public MessageFormatException(String str, Throwable th) {
        super(str, th);
    }
}
