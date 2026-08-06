package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class en5 implements KSerializer<JsonPrimitive> {
    public static final en5 a = new en5();
    public static final ld9 b = od9.c("kotlinx.serialization.json.JsonPrimitive", j98.i.a, new SerialDescriptor[0]);

    @Override // defpackage.sy2
    public final Object deserialize(Decoder decoder) {
        em5 em5VarF = hu1.f(decoder);
        JsonElement jsonElementM = em5VarF.M();
        if (jsonElementM instanceof JsonPrimitive) {
            return (JsonPrimitive) jsonElementM;
        }
        throw new gm5(ha7.d("Unexpected JSON element, expected JsonPrimitive, had " + ll8.a(jsonElementM.getClass()), null, null, em5VarF.l0().a.i ? ha7.h(jsonElementM.toString(), -1).toString() : null, -1));
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, Object obj) {
        JsonPrimitive jsonPrimitive = (JsonPrimitive) obj;
        jsonPrimitive.getClass();
        hu1.e(encoder);
        if (jsonPrimitive instanceof JsonNull) {
            encoder.j(zm5.a, JsonNull.INSTANCE);
        } else {
            encoder.j(vm5.a, (um5) jsonPrimitive);
        }
    }
}
