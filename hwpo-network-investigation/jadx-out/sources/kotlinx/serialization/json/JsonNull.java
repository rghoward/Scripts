package kotlinx.serialization.json;

import defpackage.rd9;
import defpackage.zm5;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@rd9(with = zm5.class)
public final class JsonNull extends JsonPrimitive {
    public static final JsonNull INSTANCE = new JsonNull();
    public static final String t = "null";

    @Override // kotlinx.serialization.json.JsonPrimitive
    public final String d() {
        return t;
    }

    public final KSerializer<JsonNull> serializer() {
        return zm5.a;
    }
}
