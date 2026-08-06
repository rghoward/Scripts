package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class w44 implements KSerializer<Float> {
    public static final w44 a = new w44();
    public static final m98 b = new m98("kotlin.Float", j98.e.a);

    @Override // defpackage.sy2
    public final Object deserialize(Decoder decoder) {
        return Float.valueOf(decoder.u0());
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, Object obj) {
        encoder.h(((Number) obj).floatValue());
    }
}
