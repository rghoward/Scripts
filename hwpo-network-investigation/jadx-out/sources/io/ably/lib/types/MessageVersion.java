package io.ably.lib.types;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import defpackage.jp2;
import io.ably.lib.util.Log;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import org.msgpack.core.MessageFormat;
import org.msgpack.core.MessagePacker;
import org.msgpack.core.MessageUnpacker;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class MessageVersion {
    private static final String CLIENT_ID = "clientId";
    private static final String DESCRIPTION = "description";
    private static final String METADATA = "metadata";
    private static final String SERIAL = "serial";
    private static final String TAG = "io.ably.lib.types.MessageVersion";
    private static final String TIMESTAMP = "timestamp";
    public String clientId;
    public String description;
    public Map<String, String> metadata;
    public String serial;
    public long timestamp;

    public MessageVersion(String str, Long l) {
        this.serial = str;
        this.timestamp = l.longValue();
    }

    public static MessageVersion read(MessageUnpacker messageUnpacker) {
        MessageVersion messageVersion = new MessageVersion();
        int iUnpackMapHeader = messageUnpacker.unpackMapHeader();
        for (int i = 0; i < iUnpackMapHeader; i++) {
            String strIntern = messageUnpacker.unpackString().intern();
            if (!messageUnpacker.getNextFormat().equals(MessageFormat.NIL)) {
                strIntern.getClass();
                switch (strIntern) {
                    case "description":
                        messageVersion.description = messageUnpacker.unpackString();
                        break;
                    case "serial":
                        messageVersion.serial = messageUnpacker.unpackString();
                        break;
                    case "metadata":
                        int iUnpackMapHeader2 = messageUnpacker.unpackMapHeader();
                        messageVersion.metadata = new HashMap(iUnpackMapHeader2);
                        for (int i2 = 0; i2 < iUnpackMapHeader2; i2++) {
                            messageVersion.metadata.put(messageUnpacker.unpackString(), messageUnpacker.unpackString());
                        }
                        break;
                    case "timestamp":
                        messageVersion.timestamp = messageUnpacker.unpackLong();
                        break;
                    case "clientId":
                        messageVersion.clientId = messageUnpacker.unpackString();
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
        return messageVersion;
    }

    private static long readLong(JsonObject jsonObject, String str) {
        JsonElement jsonElement = jsonObject.get(str);
        if (jsonElement == null || jsonElement.isJsonNull()) {
            return 0L;
        }
        return jsonElement.getAsLong();
    }

    private static String readString(JsonObject jsonObject, String str) {
        JsonElement jsonElement = jsonObject.get(str);
        if (jsonElement == null || jsonElement.isJsonNull()) {
            return null;
        }
        return jsonElement.getAsString();
    }

    public JsonElement toJsonTree() {
        JsonObject jsonObject = new JsonObject();
        String str = this.serial;
        if (str != null) {
            jsonObject.addProperty(SERIAL, str);
        }
        long j = this.timestamp;
        if (j != 0) {
            jsonObject.addProperty(TIMESTAMP, Long.valueOf(j));
        }
        String str2 = this.clientId;
        if (str2 != null) {
            jsonObject.addProperty("clientId", str2);
        }
        String str3 = this.description;
        if (str3 != null) {
            jsonObject.addProperty(DESCRIPTION, str3);
        }
        if (this.metadata != null) {
            JsonObject jsonObject2 = new JsonObject();
            for (Map.Entry<String, String> entry : this.metadata.entrySet()) {
                jsonObject2.addProperty(entry.getKey(), entry.getValue());
            }
            jsonObject.add(METADATA, jsonObject2);
        }
        return jsonObject;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{MessageVersion serial=");
        sb.append(this.serial);
        sb.append(", timestamp=");
        return jp2.a(this.timestamp, "}", sb);
    }

    public void writeMsgpack(MessagePacker messagePacker) {
        int i = this.serial != null ? 1 : 0;
        if (this.timestamp != 0) {
            i++;
        }
        if (this.clientId != null) {
            i++;
        }
        if (this.description != null) {
            i++;
        }
        if (this.metadata != null) {
            i++;
        }
        messagePacker.packMapHeader(i);
        if (this.serial != null) {
            messagePacker.packString(SERIAL);
            messagePacker.packString(this.serial);
        }
        if (this.timestamp != 0) {
            messagePacker.packString(TIMESTAMP);
            messagePacker.packLong(this.timestamp);
        }
        if (this.clientId != null) {
            messagePacker.packString("clientId");
            messagePacker.packString(this.clientId);
        }
        if (this.description != null) {
            messagePacker.packString(DESCRIPTION);
            messagePacker.packString(this.description);
        }
        if (this.metadata != null) {
            messagePacker.packString(METADATA);
            messagePacker.packMapHeader(this.metadata.size());
            for (Map.Entry<String, String> entry : this.metadata.entrySet()) {
                messagePacker.packString(entry.getKey());
                messagePacker.packString(entry.getValue());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class Serializer implements JsonSerializer<MessageVersion>, JsonDeserializer<MessageVersion> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        public MessageVersion deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            try {
                return MessageVersion.read(jsonElement);
            } catch (MessageDecodeException e) {
                Log.e(MessageVersion.TAG, e.getMessage(), e);
                throw new JsonParseException("Failed to deserialize MessageVersion from JSON.", e);
            }
        }

        @Override // com.google.gson.JsonSerializer
        public JsonElement serialize(MessageVersion messageVersion, Type type, JsonSerializationContext jsonSerializationContext) {
            return messageVersion.toJsonTree();
        }
    }

    public MessageVersion() {
    }

    public static MessageVersion read(JsonElement jsonElement) throws MessageDecodeException {
        if (jsonElement.isJsonObject()) {
            MessageVersion messageVersion = new MessageVersion();
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            messageVersion.serial = readString(asJsonObject, SERIAL);
            messageVersion.timestamp = readLong(asJsonObject, TIMESTAMP);
            messageVersion.clientId = readString(asJsonObject, "clientId");
            messageVersion.description = readString(asJsonObject, DESCRIPTION);
            if (asJsonObject.has(METADATA)) {
                JsonObject asJsonObject2 = asJsonObject.getAsJsonObject(METADATA);
                messageVersion.metadata = new HashMap();
                for (Map.Entry<String, JsonElement> entry : asJsonObject2.entrySet()) {
                    messageVersion.metadata.put(entry.getKey(), entry.getValue().getAsString());
                }
            }
            return messageVersion;
        }
        throw MessageDecodeException.fromDescription("Expected an object but got \"" + jsonElement.getClass() + "\".");
    }
}
