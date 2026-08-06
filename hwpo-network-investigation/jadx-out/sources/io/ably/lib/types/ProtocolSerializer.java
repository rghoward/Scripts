package io.ably.lib.types;

import io.ably.lib.util.Serialisation;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import org.msgpack.core.MessagePacker;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class ProtocolSerializer {
    public static ProtocolMessage fromJSON(String str) {
        return (ProtocolMessage) Serialisation.gson.fromJson(str, ProtocolMessage.class);
    }

    public static ProtocolMessage readMsgpack(byte[] bArr) {
        try {
            return ProtocolMessage.fromMsgpack(Serialisation.msgpackUnpackerConfig.newUnpacker(bArr));
        } catch (IOException e) {
            throw AblyException.fromThrowable(e);
        }
    }

    public static byte[] writeJSON(ProtocolMessage protocolMessage) {
        return Serialisation.gson.toJson(protocolMessage).getBytes(Charset.forName("UTF-8"));
    }

    public static byte[] writeMsgpack(ProtocolMessage protocolMessage) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        MessagePacker messagePackerNewPacker = Serialisation.msgpackPackerConfig.newPacker(byteArrayOutputStream);
        try {
            protocolMessage.writeMsgpack(messagePackerNewPacker);
            messagePackerNewPacker.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw AblyException.fromThrowable(e);
        }
    }
}
