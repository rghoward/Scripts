package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class nm5 implements KSerializer<JsonElement> {
    public static final nm5 a = new nm5();
    public static final ld9 b = od9.b("kotlinx.serialization.json.JsonElement", p58.b.a, new SerialDescriptor[0], new mk0(2));

    @Override // defpackage.sy2
    public final Object deserialize(Decoder decoder) {
        return hu1.f(decoder).M();
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, Object obj) {
        JsonElement jsonElement = (JsonElement) obj;
        jsonElement.getClass();
        hu1.e(encoder);
        if (jsonElement instanceof JsonPrimitive) {
            encoder.j(en5.a, jsonElement);
            return;
        }
        if (jsonElement instanceof JsonObject) {
            encoder.j(bn5.a, jsonElement);
        } else if (jsonElement instanceof JsonArray) {
            encoder.j(ul5.a, jsonElement);
        } else {
            u.b();
        }
    }
}
