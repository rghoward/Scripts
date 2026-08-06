package io.ably.lib.types;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class MessageDecodeException extends AblyException {
    private static final long serialVersionUID = 1;

    private MessageDecodeException(Throwable th, ErrorInfo errorInfo) {
        super(th, errorInfo);
    }

    public static MessageDecodeException fromDescription(String str) {
        return new MessageDecodeException(new Exception(str), new ErrorInfo(str, 40013));
    }

    public static MessageDecodeException fromThrowableAndErrorInfo(Throwable th, ErrorInfo errorInfo) {
        return new MessageDecodeException(th, errorInfo);
    }
}
