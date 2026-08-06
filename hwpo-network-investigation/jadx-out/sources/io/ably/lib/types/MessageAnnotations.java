package io.ably.lib.types;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import io.ably.lib.util.Log;
import java.lang.reflect.Type;
import java.util.HashMap;
import org.msgpack.core.MessageFormat;
import org.msgpack.core.MessagePacker;
import org.msgpack.core.MessageUnpacker;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class MessageAnnotations {
    private static final String SUMMARY = "summary";
    private static final String TAG = "io.ably.lib.types.MessageAnnotations";
    public Summary summary;

    public MessageAnnotations(Summary summary) {
        this.summary = summary == null ? new Summary(new HashMap()) : summary;
    }

    public static MessageAnnotations read(JsonElement jsonElement) throws MessageDecodeException {
        if (!jsonElement.isJsonObject()) {
            throw MessageDecodeException.fromDescription("Message annotations is of type \"" + jsonElement.getClass() + "\" when expected a JSON object.");
        }
        MessageAnnotations messageAnnotations = new MessageAnnotations();
        JsonElement jsonElement2 = jsonElement.getAsJsonObject().get(SUMMARY);
        if (jsonElement2 == null) {
            return messageAnnotations;
        }
        if (jsonElement2.isJsonObject()) {
            messageAnnotations.summary = Summary.read(jsonElement2.getAsJsonObject());
            return messageAnnotations;
        }
        throw MessageDecodeException.fromDescription("MessageAnnotations summary is of type \"" + jsonElement2.getClass() + "\" when expected a JSON object.");
    }

    public JsonElement toJsonTree() {
        JsonObject jsonObject = new JsonObject();
        Summary summary = this.summary;
        if (summary != null) {
            jsonObject.add(SUMMARY, summary.toJsonTree());
        }
        return jsonObject;
    }

    public String toString() {
        return "{MessageAnnotations summary=" + this.summary + "}";
    }

    public void writeMsgpack(MessagePacker messagePacker) {
        messagePacker.packMapHeader(this.summary != null ? 1 : 0);
        if (this.summary != null) {
            messagePacker.packString(SUMMARY);
            this.summary.write(messagePacker);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class Serializer implements JsonSerializer<MessageAnnotations>, JsonDeserializer<MessageAnnotations> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        public MessageAnnotations deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            try {
                return MessageAnnotations.read(jsonElement);
            } catch (MessageDecodeException e) {
                Log.e(MessageAnnotations.TAG, e.getMessage(), e);
                throw new JsonParseException("Failed to deserialize MessageAnnotations from JSON.", e);
            }
        }

        @Override // com.google.gson.JsonSerializer
        public JsonElement serialize(MessageAnnotations messageAnnotations, Type type, JsonSerializationContext jsonSerializationContext) {
            return messageAnnotations.toJsonTree();
        }
    }

    public MessageAnnotations() {
        this.summary = new Summary(new HashMap());
    }

    public static MessageAnnotations read(MessageUnpacker messageUnpacker) {
        MessageAnnotations messageAnnotations = new MessageAnnotations();
        int iUnpackMapHeader = messageUnpacker.unpackMapHeader();
        for (int i = 0; i < iUnpackMapHeader; i++) {
            String strIntern = messageUnpacker.unpackString().intern();
            if (messageUnpacker.getNextFormat().equals(MessageFormat.NIL)) {
                messageUnpacker.unpackNil();
            } else if (strIntern.equals(SUMMARY)) {
                messageAnnotations.summary = Summary.read(messageUnpacker);
            } else {
                Log.v(TAG, "Unexpected field: ".concat(strIntern));
                messageUnpacker.skipValue();
            }
        }
        return messageAnnotations;
    }
}
