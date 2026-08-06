package io.ably.lib.types;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import defpackage.h5a;
import io.ably.lib.util.Log;
import io.ably.lib.util.Serialisation;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.msgpack.core.MessagePacker;
import org.msgpack.core.MessageUnpacker;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class Summary {
    private static final String CLIENT_IDS = "clientIds";
    private static final String CLIPPED = "clipped";
    private static final String TAG = "io.ably.lib.types.Summary";
    private static final String TOTAL = "total";
    private static final String TOTAL_CLIENT_IDS = "totalClientIds";
    private static final String TOTAL_UNIDENTIFIED = "totalUnidentified";
    private final Map<String, JsonObject> typeToSummaryJson;

    public Summary(Map<String, JsonObject> map) {
        this.typeToSummaryJson = map;
    }

    public static Map<String, SummaryClientIdList> asSummaryDistinctV1(JsonObject jsonObject) {
        HashMap map = new HashMap();
        for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
            map.put(entry.getKey(), asSummaryFlagV1(entry.getValue().getAsJsonObject()));
        }
        return map;
    }

    public static SummaryClientIdList asSummaryFlagV1(JsonObject jsonObject) {
        return new SummaryClientIdList(jsonObject.get(TOTAL).getAsInt(), (List) Serialisation.gson.fromJson(jsonObject.get(CLIENT_IDS), List.class), tryReadBooleanField(jsonObject, CLIPPED));
    }

    public static Map<String, SummaryClientIdCounts> asSummaryMultipleV1(JsonObject jsonObject) {
        HashMap map = new HashMap();
        for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
            String key = entry.getKey();
            JsonObject asJsonObject = entry.getValue().getAsJsonObject();
            int asInt = asJsonObject.get(TOTAL).getAsInt();
            HashMap map2 = new HashMap();
            for (Map.Entry<String, JsonElement> entry2 : asJsonObject.get(CLIENT_IDS).getAsJsonObject().entrySet()) {
                map2.put(entry2.getKey(), Integer.valueOf(entry2.getValue().getAsInt()));
            }
            Integer numTryReadIntField = tryReadIntField(asJsonObject, TOTAL_UNIDENTIFIED);
            Integer numTryReadIntField2 = tryReadIntField(asJsonObject, TOTAL_CLIENT_IDS);
            map.put(key, new SummaryClientIdCounts(asInt, map2, numTryReadIntField == null ? 0 : numTryReadIntField.intValue(), tryReadBooleanField(asJsonObject, CLIPPED), numTryReadIntField2 == null ? asInt : numTryReadIntField2.intValue()));
        }
        return map;
    }

    public static SummaryTotal asSummaryTotalV1(JsonObject jsonObject) {
        return new SummaryTotal(jsonObject.get(TOTAL).getAsInt());
    }

    public static Map<String, SummaryClientIdList> asSummaryUniqueV1(JsonObject jsonObject) {
        return asSummaryDistinctV1(jsonObject);
    }

    public static Summary read(JsonElement jsonElement) {
        if (!jsonElement.isJsonObject()) {
            h5a.a(jsonElement.getClass(), "\".", "Expected an object but got \"");
            return null;
        }
        HashMap map = new HashMap();
        for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
            if (!entry.getValue().isJsonObject()) {
                h5a.a(jsonElement.getClass(), "\".", "Expected an object but got \"");
                return null;
            }
            map.put(entry.getKey(), entry.getValue().getAsJsonObject());
        }
        return new Summary(map);
    }

    private static boolean tryReadBooleanField(JsonObject jsonObject, String str) {
        JsonElement jsonElement = jsonObject.get(str);
        if (jsonElement != null && jsonElement.isJsonPrimitive() && jsonElement.getAsJsonPrimitive().isBoolean()) {
            return jsonElement.getAsBoolean();
        }
        return false;
    }

    private static Integer tryReadIntField(JsonObject jsonObject, String str) {
        JsonElement jsonElement = jsonObject.get(str);
        if (jsonElement != null && jsonElement.isJsonPrimitive() && jsonElement.getAsJsonPrimitive().isNumber()) {
            return Integer.valueOf(jsonElement.getAsInt());
        }
        return null;
    }

    public JsonObject get(String str) {
        return this.typeToSummaryJson.get(str);
    }

    public JsonElement toJsonTree() {
        return Serialisation.gson.toJsonTree(this);
    }

    public void write(MessagePacker messagePacker) {
        Serialisation.gsonToMsgpack(toJsonTree(), messagePacker);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class Serializer implements JsonSerializer<Summary>, JsonDeserializer<Summary> {
        @Override // com.google.gson.JsonSerializer
        public JsonElement serialize(Summary summary, Type type, JsonSerializationContext jsonSerializationContext) {
            JsonObject jsonObject = new JsonObject();
            for (Map.Entry entry : summary.typeToSummaryJson.entrySet()) {
                jsonObject.add((String) entry.getKey(), (JsonElement) entry.getValue());
            }
            return jsonObject;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        public Summary deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            return Summary.read(jsonElement);
        }
    }

    public static Summary read(MessageUnpacker messageUnpacker) {
        try {
            return read(Serialisation.msgpackToGson(messageUnpacker.unpackValue()));
        } catch (Exception e) {
            Log.e(TAG, "Failed to read summary from MessagePack", e);
            return null;
        }
    }
}
