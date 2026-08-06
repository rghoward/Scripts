package io.ably.lib.objects;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import io.ably.lib.util.Log;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class ObjectsJsonSerializer implements JsonSerializer<Object[]>, JsonDeserializer<Object[]> {
    private static final String TAG = "io.ably.lib.objects.ObjectsJsonSerializer";

    @Override // com.google.gson.JsonDeserializer
    public Object[] deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        ObjectsSerializer serializer = ObjectsHelper.getSerializer();
        if (serializer == null) {
            Log.w(TAG, "Skipping 'state' field json deserialization because ObjectsSerializer not found.");
            return null;
        }
        if (jsonElement.isJsonArray()) {
            return serializer.readFromJsonArray(jsonElement.getAsJsonArray());
        }
        throw new JsonParseException("Expected a JSON array for 'state' field, but got: " + jsonElement);
    }

    @Override // com.google.gson.JsonSerializer
    public JsonElement serialize(Object[] objArr, Type type, JsonSerializationContext jsonSerializationContext) {
        ObjectsSerializer serializer = ObjectsHelper.getSerializer();
        if (serializer != null) {
            return serializer.asJsonArray(objArr);
        }
        Log.w(TAG, "Skipping 'state' field json serialization because ObjectsSerializer not found.");
        return JsonNull.INSTANCE;
    }
}
