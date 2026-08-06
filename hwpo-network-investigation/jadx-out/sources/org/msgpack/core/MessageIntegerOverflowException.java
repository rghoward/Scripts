package org.msgpack.core;

import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class MessageIntegerOverflowException extends MessageTypeException {
    private final BigInteger bigInteger;

    public MessageIntegerOverflowException(long j) {
        this(BigInteger.valueOf(j));
    }

    public BigInteger getBigInteger() {
        return this.bigInteger;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.bigInteger.toString();
    }

    public MessageIntegerOverflowException(BigInteger bigInteger) {
        this.bigInteger = bigInteger;
    }

    public MessageIntegerOverflowException(String str, BigInteger bigInteger) {
        super(str);
        this.bigInteger = bigInteger;
    }
}
