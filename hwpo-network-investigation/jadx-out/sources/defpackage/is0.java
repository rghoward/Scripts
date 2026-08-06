package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class is0 implements KSerializer<Boolean> {
    public static final is0 a = new is0();
    public static final m98 b = new m98("kotlin.Boolean", j98.a.a);

    @Override // defpackage.sy2
    public final Object deserialize(Decoder decoder) {
        return Boolean.valueOf(decoder.z());
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, Object obj) {
        encoder.e(((Boolean) obj).booleanValue());
    }
}
