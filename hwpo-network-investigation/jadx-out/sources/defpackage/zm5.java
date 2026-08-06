package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonNull;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zm5 implements KSerializer<JsonNull> {
    public static final zm5 a = new zm5();
    public static final ld9 b = od9.c("kotlinx.serialization.json.JsonNull", pd9.b.a, new SerialDescriptor[0]);

    @Override // defpackage.sy2
    public final Object deserialize(Decoder decoder) {
        hu1.f(decoder);
        if (decoder.d0()) {
            throw new gm5(ha7.d("Expected 'null' literal", null, null, null, -1));
        }
        return JsonNull.INSTANCE;
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, Object obj) {
        ((JsonNull) obj).getClass();
        hu1.e(encoder);
        encoder.a();
    }
}
