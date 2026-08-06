package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ig5 implements KSerializer<Integer> {
    public static final ig5 a = new ig5();
    public static final m98 b = new m98("kotlin.Int", j98.f.a);

    @Override // defpackage.sy2
    public final Object deserialize(Decoder decoder) {
        return Integer.valueOf(decoder.O());
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, Object obj) {
        encoder.u(((Number) obj).intValue());
    }
}
