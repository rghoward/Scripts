package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class q0b implements KSerializer<m0b> {
    public static final q0b a = new q0b();
    public static final pc5 b = rc5.b("kotlin.UByte", zz0.a);

    @Override // defpackage.sy2
    public final Object deserialize(Decoder decoder) {
        return new m0b(decoder.n0(b).q0());
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, Object obj) {
        encoder.v(b).d(((m0b) obj).t);
    }
}
