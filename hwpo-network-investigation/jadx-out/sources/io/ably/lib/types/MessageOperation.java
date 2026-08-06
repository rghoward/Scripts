package io.ably.lib.types;

import com.google.gson.JsonObject;
import io.ably.lib.util.Serialisation;
import java.util.Map;
import org.msgpack.core.MessagePacker;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class MessageOperation {
    private static final String CLIENT_ID = "clientId";
    private static final String DESCRIPTION = "description";
    private static final String METADATA = "metadata";
    public String clientId;
    public String description;
    public Map<String, String> metadata;

    public MessageOperation(String str, String str2, Map<String, String> map) {
        this.clientId = str;
        this.description = str2;
        this.metadata = map;
    }

    public JsonObject asJsonObject() {
        JsonObject jsonObject = new JsonObject();
        String str = this.clientId;
        if (str != null) {
            jsonObject.addProperty("clientId", str);
        }
        String str2 = this.description;
        if (str2 != null) {
            jsonObject.addProperty(DESCRIPTION, str2);
        }
        Map<String, String> map = this.metadata;
        if (map != null) {
            jsonObject.add(METADATA, Serialisation.gson.toJsonTree(map));
        }
        return jsonObject;
    }

    public void writeMsgpack(MessagePacker messagePacker) {
        int i = this.clientId != null ? 1 : 0;
        if (this.description != null) {
            i++;
        }
        if (this.metadata != null) {
            i++;
        }
        messagePacker.packMapHeader(i);
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
            MessageSerializer.write(this.metadata, messagePacker);
        }
    }

    public MessageOperation() {
    }
}
