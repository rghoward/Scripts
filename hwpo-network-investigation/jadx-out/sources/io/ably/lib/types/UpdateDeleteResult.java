package io.ably.lib.types;

import io.ably.lib.http.HttpConstants;
import io.ably.lib.http.HttpCore;
import io.ably.lib.util.Serialisation;
import java.io.IOException;
import org.msgpack.core.MessageFormat;
import org.msgpack.core.MessageUnpacker;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class UpdateDeleteResult {
    private static final String VERSION_SERIAL = "versionSerial";
    public final String versionSerial;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class UpdateDeleteResultBodyHandler implements HttpCore.BodyHandler<UpdateDeleteResult> {
        private UpdateDeleteResultBodyHandler() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.ably.lib.http.HttpCore.BodyHandler
        public UpdateDeleteResult[] handleResponseBody(String str, byte[] bArr) throws AblyException {
            UpdateDeleteResult msgpack;
            try {
                if (HttpConstants.ContentTypes.JSON.equals(str)) {
                    msgpack = UpdateDeleteResult.readFromJson(bArr);
                } else {
                    msgpack = "application/x-msgpack".equals(str) ? UpdateDeleteResult.readMsgpack(bArr) : null;
                }
                return new UpdateDeleteResult[]{msgpack};
            } catch (MessageDecodeException e) {
                throw AblyException.fromThrowable(e);
            }
        }
    }

    public UpdateDeleteResult(String str) {
        this.versionSerial = str;
    }

    public static HttpCore.BodyHandler<UpdateDeleteResult> getBodyHandler() {
        return new UpdateDeleteResultBodyHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static UpdateDeleteResult readFromJson(byte[] bArr) {
        return (UpdateDeleteResult) Serialisation.gson.fromJson(new String(bArr), UpdateDeleteResult.class);
    }

    private static UpdateDeleteResult readMsgpack(MessageUnpacker messageUnpacker) {
        int iUnpackMapHeader = messageUnpacker.unpackMapHeader();
        String strUnpackString = null;
        for (int i = 0; i < iUnpackMapHeader; i++) {
            String strIntern = messageUnpacker.unpackString().intern();
            if (messageUnpacker.getNextFormat().equals(MessageFormat.NIL)) {
                messageUnpacker.unpackNil();
            } else if (strIntern.equals(VERSION_SERIAL)) {
                strUnpackString = messageUnpacker.unpackString();
            } else {
                messageUnpacker.skipValue();
            }
        }
        return new UpdateDeleteResult(strUnpackString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static UpdateDeleteResult readMsgpack(byte[] bArr) throws AblyException {
        try {
            return readMsgpack(Serialisation.msgpackUnpackerConfig.newUnpacker(bArr));
        } catch (IOException e) {
            throw AblyException.fromThrowable(e);
        }
    }
}
