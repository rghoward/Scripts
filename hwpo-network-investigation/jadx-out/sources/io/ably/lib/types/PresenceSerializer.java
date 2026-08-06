package io.ably.lib.types;

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
public class PresenceSerializer {
    private static HttpCore.BodyHandler<PresenceMessage> presenceResponseHandler = new PresenceBodyHandler(null);
    private static final String TAG = PresenceSerializer.class.getName();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class PresenceBodyHandler implements HttpCore.BodyHandler<PresenceMessage> {
        private ChannelOptions opts;

        public PresenceBodyHandler(ChannelOptions channelOptions) {
            this.opts = channelOptions;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.ably.lib.http.HttpCore.BodyHandler
        public PresenceMessage[] handleResponseBody(String str, byte[] bArr) throws AblyException {
            try {
                PresenceMessage[] json = HttpConstants.ContentTypes.JSON.equals(str) ? PresenceSerializer.readJson(bArr) : "application/x-msgpack".equals(str) ? PresenceSerializer.readMsgpack(bArr) : null;
                if (json != null) {
                    for (PresenceMessage presenceMessage : json) {
                        try {
                            presenceMessage.decode(this.opts);
                        } catch (MessageDecodeException e) {
                            Log.e(PresenceSerializer.TAG, e.errorInfo.message);
                        }
                    }
                }
                return json;
            } catch (IOException e2) {
                throw AblyException.fromThrowable(e2);
            }
        }
    }

    public static HttpCore.RequestBody asJsonRequest(PresenceMessage[] presenceMessageArr) {
        return new HttpUtils.JsonRequestBody(Serialisation.gson.toJson(presenceMessageArr));
    }

    public static HttpCore.BodyHandler<PresenceMessage> getPresenceResponseHandler(ChannelOptions channelOptions) {
        return channelOptions == null ? presenceResponseHandler : new PresenceBodyHandler(channelOptions);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static PresenceMessage[] readJson(byte[] bArr) {
        return (PresenceMessage[]) Serialisation.gson.fromJson(new String(bArr), PresenceMessage[].class);
    }

    public static PresenceMessage[] readMsgpack(byte[] bArr) throws AblyException {
        try {
            return readMsgpackArray(Serialisation.msgpackUnpackerConfig.newUnpacker(bArr));
        } catch (IOException e) {
            throw AblyException.fromThrowable(e);
        }
    }

    public static PresenceMessage[] readMsgpackArray(MessageUnpacker messageUnpacker) {
        int iUnpackArrayHeader = messageUnpacker.unpackArrayHeader();
        PresenceMessage[] presenceMessageArr = new PresenceMessage[iUnpackArrayHeader];
        for (int i = 0; i < iUnpackArrayHeader; i++) {
            presenceMessageArr[i] = PresenceMessage.fromMsgpack(messageUnpacker);
        }
        return presenceMessageArr;
    }

    public static byte[] writeMsgpackArray(PresenceMessage[] presenceMessageArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            MessagePacker messagePackerNewPacker = Serialisation.msgpackPackerConfig.newPacker(byteArrayOutputStream);
            writeMsgpackArray(presenceMessageArr, messagePackerNewPacker);
            messagePackerNewPacker.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            return null;
        }
    }

    public static HttpCore.RequestBody asJsonRequest(PresenceMessage presenceMessage) {
        return asJsonRequest(new PresenceMessage[]{presenceMessage});
    }

    public static void writeMsgpackArray(PresenceMessage[] presenceMessageArr, MessagePacker messagePacker) {
        try {
            messagePacker.packArrayHeader(presenceMessageArr.length);
            for (PresenceMessage presenceMessage : presenceMessageArr) {
                presenceMessage.writeMsgpack(messagePacker);
            }
        } catch (IOException unused) {
        }
    }
}
