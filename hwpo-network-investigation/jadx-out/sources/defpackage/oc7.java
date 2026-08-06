package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class oc7 implements KSerializer {
    public static final oc7 a = new oc7();
    public static final nc7 b = nc7.a;

    @Override // defpackage.sy2
    public final Object deserialize(Decoder decoder) {
        throw new td9("'kotlin.Nothing' does not have instances");
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, Object obj) {
        ((Void) obj).getClass();
        throw new td9("'kotlin.Nothing' cannot be serialized");
    }
}
