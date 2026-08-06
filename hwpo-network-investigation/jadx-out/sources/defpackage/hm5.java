package defpackage;

import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class hm5 {
    public static final pc5 a = rc5.b("kotlinx.serialization.json.JsonUnquotedLiteral", o2a.a);

    public static final void a(JsonElement jsonElement, String str) {
        throw new IllegalArgumentException("Element " + ll8.a(jsonElement.getClass()) + " is not a " + str);
    }

    public static final JsonObject b(JsonElement jsonElement) {
        jsonElement.getClass();
        JsonObject jsonObject = jsonElement instanceof JsonObject ? (JsonObject) jsonElement : null;
        if (jsonObject != null) {
            return jsonObject;
        }
        a(jsonElement, "JsonObject");
        throw null;
    }

    public static final JsonPrimitive c(JsonElement jsonElement) {
        JsonPrimitive jsonPrimitive = jsonElement instanceof JsonPrimitive ? (JsonPrimitive) jsonElement : null;
        if (jsonPrimitive != null) {
            return jsonPrimitive;
        }
        a(jsonElement, "JsonPrimitive");
        throw null;
    }

    public static final long d(JsonPrimitive jsonPrimitive) {
        h2a h2aVarC = th0.c(sl5.d, jsonPrimitive.d());
        String str = h2aVarC.f;
        long jH = h2aVarC.h();
        if (h2aVarC.e() == 10) {
            return jH;
        }
        int i = h2aVarC.b;
        int i2 = i > 0 ? i - 1 : i;
        h2a.m(h2aVarC, sk0.c("Expected input to contain a single valid number, but got '", (i == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' after it"), i2, null, 4);
        throw null;
    }
}
