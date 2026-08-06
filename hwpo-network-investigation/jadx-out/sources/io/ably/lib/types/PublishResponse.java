package io.ably.lib.types;

import com.google.gson.annotations.SerializedName;
import io.ably.lib.http.HttpConstants;
import io.ably.lib.http.HttpCore;
import io.ably.lib.util.Log;
import io.ably.lib.util.Serialisation;
import java.io.IOException;
import org.msgpack.core.MessageFormat;
import org.msgpack.core.MessageUnpacker;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class PublishResponse {
    private static final String TAG = MessageSerializer.class.getName();
    private static HttpCore.BodyHandler<PublishResponse> batchErrorBodyHandler;
    private static HttpCore.BodyHandler<PublishResponse> bulkResponseBodyHandler;

    @SerializedName("channel")
    public String channelId;
    public ErrorInfo error;
    public String messageId;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class BatchErrorBodyHandler implements HttpCore.BodyHandler<PublishResponse> {
        private BatchErrorBodyHandler() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.ably.lib.http.HttpCore.BodyHandler
        public PublishResponse[] handleResponseBody(String str, byte[] bArr) throws AblyException {
            BatchErrorResponse msgpack;
            try {
                if (HttpConstants.ContentTypes.JSON.equals(str)) {
                    msgpack = BatchErrorResponse.readJSON(bArr);
                } else {
                    msgpack = "application/x-msgpack".equals(str) ? BatchErrorResponse.readMsgpack(bArr) : null;
                }
                if (msgpack == null) {
                    return null;
                }
                ErrorInfo errorInfo = msgpack.error;
                if (errorInfo != null && errorInfo.code != 40020) {
                    throw AblyException.fromErrorInfo(errorInfo);
                }
                return msgpack.batchResponse;
            } catch (IOException e) {
                throw AblyException.fromThrowable(e);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class BulkResponseBodyHandler implements HttpCore.BodyHandler<PublishResponse> {
        private BulkResponseBodyHandler() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.ably.lib.http.HttpCore.BodyHandler
        public PublishResponse[] handleResponseBody(String str, byte[] bArr) throws AblyException {
            try {
                if (HttpConstants.ContentTypes.JSON.equals(str)) {
                    return PublishResponse.fromJSONArray(bArr);
                }
                if ("application/x-msgpack".equals(str)) {
                    return PublishResponse.fromMsgpackArray(bArr);
                }
                return null;
            } catch (IOException e) {
                throw AblyException.fromThrowable(e);
            }
        }
    }

    static {
        batchErrorBodyHandler = new BatchErrorBodyHandler();
        bulkResponseBodyHandler = new BulkResponseBodyHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static PublishResponse[] fromJSONArray(byte[] bArr) {
        return (PublishResponse[]) Serialisation.gson.fromJson(new String(bArr), PublishResponse[].class);
    }

    private static PublishResponse fromMsgpack(MessageUnpacker messageUnpacker) {
        return new PublishResponse().readMsgpack(messageUnpacker);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static PublishResponse[] fromMsgpackArray(MessageUnpacker messageUnpacker) {
        int iUnpackArrayHeader = messageUnpacker.unpackArrayHeader();
        PublishResponse[] publishResponseArr = new PublishResponse[iUnpackArrayHeader];
        for (int i = 0; i < iUnpackArrayHeader; i++) {
            publishResponseArr[i] = fromMsgpack(messageUnpacker);
        }
        return publishResponseArr;
    }

    public static HttpCore.BodyHandler<PublishResponse> getBulkPublishResponseHandler(int i) {
        return i < 300 ? bulkResponseBodyHandler : batchErrorBodyHandler;
    }

    private PublishResponse readMsgpack(MessageUnpacker messageUnpacker) {
        int iUnpackMapHeader = messageUnpacker.unpackMapHeader();
        for (int i = 0; i < iUnpackMapHeader; i++) {
            String strIntern = messageUnpacker.unpackString().intern();
            if (!messageUnpacker.getNextFormat().equals(MessageFormat.NIL)) {
                strIntern.getClass();
                switch (strIntern) {
                    case "messageId":
                        this.messageId = messageUnpacker.unpackString();
                        break;
                    case "error":
                        this.error = ErrorInfo.fromMsgpack(messageUnpacker);
                        break;
                    case "channel":
                    case "channelId":
                        this.channelId = messageUnpacker.unpackString();
                        break;
                    default:
                        Log.v(TAG, "Unexpected field: ".concat(strIntern));
                        messageUnpacker.skipValue();
                        break;
                }
            } else {
                messageUnpacker.unpackNil();
            }
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static PublishResponse[] fromMsgpackArray(byte[] bArr) {
        return fromMsgpackArray(Serialisation.msgpackUnpackerConfig.newUnpacker(bArr));
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class BatchErrorResponse {
        public PublishResponse[] batchResponse;
        public ErrorInfo error;

        private BatchErrorResponse() {
        }

        public static BatchErrorResponse readJSON(byte[] bArr) {
            return (BatchErrorResponse) Serialisation.gson.fromJson(new String(bArr), BatchErrorResponse.class);
        }

        public BatchErrorResponse readMsgpack(MessageUnpacker messageUnpacker) {
            int iUnpackMapHeader = messageUnpacker.unpackMapHeader();
            for (int i = 0; i < iUnpackMapHeader; i++) {
                String strIntern = messageUnpacker.unpackString().intern();
                if (messageUnpacker.getNextFormat().equals(MessageFormat.NIL)) {
                    messageUnpacker.unpackNil();
                } else {
                    strIntern.getClass();
                    if (strIntern.equals("error")) {
                        this.error = ErrorInfo.fromMsgpack(messageUnpacker);
                    } else if (strIntern.equals("batchResponse")) {
                        this.batchResponse = PublishResponse.fromMsgpackArray(messageUnpacker);
                    } else {
                        Log.v(PublishResponse.TAG, "Unexpected field: ".concat(strIntern));
                        messageUnpacker.skipValue();
                    }
                }
            }
            return this;
        }

        public static BatchErrorResponse readMsgpack(byte[] bArr) {
            return new BatchErrorResponse().readMsgpack(Serialisation.msgpackUnpackerConfig.newUnpacker(bArr));
        }
    }
}
