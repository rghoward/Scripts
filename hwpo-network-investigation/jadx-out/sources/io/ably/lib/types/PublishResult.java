package io.ably.lib.types;

import defpackage.jl;
import io.ably.lib.http.HttpConstants;
import io.ably.lib.http.HttpCore;
import io.ably.lib.util.Serialisation;
import java.io.IOException;
import org.msgpack.core.MessageFormat;
import org.msgpack.core.MessagePacker;
import org.msgpack.core.MessageUnpacker;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class PublishResult {
    private static final String SERIALS = "serials";
    public final String[] serials;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class PublishResultBodyHandler implements HttpCore.BodyHandler<String> {
        private PublishResultBodyHandler() {
        }

        @Override // io.ably.lib.http.HttpCore.BodyHandler
        public String[] handleResponseBody(String str, byte[] bArr) throws AblyException {
            PublishResult msgpack;
            try {
                if (HttpConstants.ContentTypes.JSON.equals(str)) {
                    msgpack = PublishResult.readFromJson(bArr);
                } else {
                    msgpack = "application/x-msgpack".equals(str) ? PublishResult.readMsgpack(bArr) : null;
                }
                return msgpack != null ? msgpack.serials : new String[0];
            } catch (MessageDecodeException e) {
                throw AblyException.fromThrowable(e);
            }
        }
    }

    public PublishResult(String[] strArr) {
        this.serials = strArr;
    }

    public static HttpCore.BodyHandler<String> getBodyHandler() {
        return new PublishResultBodyHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static PublishResult readFromJson(byte[] bArr) {
        return (PublishResult) Serialisation.gson.fromJson(new String(bArr), PublishResult.class);
    }

    private static PublishResult readMsgpack(MessageUnpacker messageUnpacker) {
        int iUnpackMapHeader = messageUnpacker.unpackMapHeader();
        for (int i = 0; i < iUnpackMapHeader; i++) {
            String strUnpackString = messageUnpacker.unpackString();
            if (messageUnpacker.getNextFormat().equals(MessageFormat.NIL)) {
                messageUnpacker.unpackNil();
            } else {
                if (strUnpackString.equals(SERIALS)) {
                    int iUnpackArrayHeader = messageUnpacker.unpackArrayHeader();
                    String[] strArr = new String[iUnpackArrayHeader];
                    for (int i2 = 0; i2 < iUnpackArrayHeader; i2++) {
                        if (messageUnpacker.getNextFormat().equals(MessageFormat.NIL)) {
                            messageUnpacker.unpackNil();
                            strArr[i2] = null;
                        } else {
                            strArr[i2] = messageUnpacker.unpackString();
                        }
                    }
                    return new PublishResult(strArr);
                }
                messageUnpacker.skipValue();
            }
        }
        return new PublishResult(new String[0]);
    }

    public static PublishResult[] readMsgpackArray(MessageUnpacker messageUnpacker) {
        int iUnpackArrayHeader = messageUnpacker.unpackArrayHeader();
        PublishResult[] publishResultArr = new PublishResult[iUnpackArrayHeader];
        for (int i = 0; i < iUnpackArrayHeader; i++) {
            publishResultArr[i] = readMsgpack(messageUnpacker);
        }
        return publishResultArr;
    }

    private void writeMsgpack(MessagePacker messagePacker) {
        messagePacker.packMapHeader(this.serials != null ? 1 : 0);
        if (this.serials != null) {
            messagePacker.packString(SERIALS);
            messagePacker.packArrayHeader(this.serials.length);
            for (String str : this.serials) {
                if (str == null) {
                    messagePacker.packNil();
                } else {
                    messagePacker.packString(str);
                }
            }
        }
    }

    public static void writeMsgpackArray(PublishResult[] publishResultArr, MessagePacker messagePacker) {
        try {
            messagePacker.packArrayHeader(publishResultArr.length);
            for (PublishResult publishResult : publishResultArr) {
                if (publishResult != null) {
                    publishResult.writeMsgpack(messagePacker);
                } else {
                    messagePacker.packNil();
                }
            }
        } catch (IOException e) {
            jl.a(e.getMessage(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static PublishResult readMsgpack(byte[] bArr) throws AblyException {
        try {
            return readMsgpack(Serialisation.msgpackUnpackerConfig.newUnpacker(bArr));
        } catch (IOException e) {
            throw AblyException.fromThrowable(e);
        }
    }
}
