package io.ably.lib.types;

import defpackage.jl;
import io.ably.lib.http.HttpConstants;
import io.ably.lib.http.HttpCore;
import io.ably.lib.http.HttpUtils;
import io.ably.lib.util.Log;
import io.ably.lib.util.Serialisation;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.msgpack.core.MessagePacker;
import org.msgpack.core.MessageUnpacker;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class AnnotationSerializer {
    private static final String TAG = "io.ably.lib.types.AnnotationSerializer";

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class AnnotationBodyHandler implements HttpCore.BodyHandler<Annotation> {
        private final ChannelOptions channelOptions;

        public AnnotationBodyHandler(ChannelOptions channelOptions) {
            this.channelOptions = channelOptions;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.ably.lib.http.HttpCore.BodyHandler
        public Annotation[] handleResponseBody(String str, byte[] bArr) throws AblyException {
            try {
                Annotation[] messagesFromJson = HttpConstants.ContentTypes.JSON.equals(str) ? AnnotationSerializer.readMessagesFromJson(bArr) : "application/x-msgpack".equals(str) ? AnnotationSerializer.readMsgpack(bArr) : null;
                if (messagesFromJson != null) {
                    for (Annotation annotation : messagesFromJson) {
                        try {
                            if (annotation.data != null) {
                                annotation.decode(this.channelOptions);
                            }
                        } catch (MessageDecodeException e) {
                            Log.e(AnnotationSerializer.TAG, e.errorInfo.message);
                        }
                    }
                }
                return messagesFromJson;
            } catch (MessageDecodeException e2) {
                throw AblyException.fromThrowable(e2);
            }
        }
    }

    public static HttpCore.RequestBody asJsonRequest(Annotation[] annotationArr) {
        return new HttpUtils.JsonRequestBody(Serialisation.gson.toJson(annotationArr));
    }

    public static HttpCore.RequestBody asMsgpackRequest(Annotation[] annotationArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            MessagePacker messagePackerNewPacker = Serialisation.msgpackPackerConfig.newPacker(byteArrayOutputStream);
            messagePackerNewPacker.packArrayHeader(annotationArr.length);
            for (Annotation annotation : annotationArr) {
                annotation.writeMsgpack(messagePackerNewPacker);
            }
            messagePackerNewPacker.flush();
        } catch (IOException e) {
            Log.e(TAG, e.getMessage(), e);
        }
        return new HttpUtils.ByteArrayRequestBody(byteArrayOutputStream.toByteArray(), "application/x-msgpack");
    }

    public static HttpCore.BodyHandler<Annotation> getAnnotationResponseHandler(ChannelOptions channelOptions) {
        return new AnnotationBodyHandler(channelOptions);
    }

    public static Annotation[] readMessagesFromJson(byte[] bArr) {
        return (Annotation[]) Serialisation.gson.fromJson(new String(bArr), Annotation[].class);
    }

    public static Annotation[] readMsgpack(byte[] bArr) throws AblyException {
        try {
            return readMsgpackArray(Serialisation.msgpackUnpackerConfig.newUnpacker(bArr));
        } catch (IOException e) {
            throw AblyException.fromThrowable(e);
        }
    }

    public static Annotation[] readMsgpackArray(MessageUnpacker messageUnpacker) {
        int iUnpackArrayHeader = messageUnpacker.unpackArrayHeader();
        Annotation[] annotationArr = new Annotation[iUnpackArrayHeader];
        for (int i = 0; i < iUnpackArrayHeader; i++) {
            annotationArr[i] = Annotation.fromMsgpack(messageUnpacker);
        }
        return annotationArr;
    }

    public static void writeMsgpackArray(Annotation[] annotationArr, MessagePacker messagePacker) {
        try {
            messagePacker.packArrayHeader(annotationArr.length);
            for (Annotation annotation : annotationArr) {
                annotation.writeMsgpack(messagePacker);
            }
        } catch (IOException e) {
            jl.a(e.getMessage(), e);
        }
    }
}
