package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ra1 implements KSerializer<Character> {
    public static final ra1 a = new ra1();
    public static final m98 b = new m98("kotlin.Char", j98.c.a);

    @Override // defpackage.sy2
    public final Object deserialize(Decoder decoder) {
        return Character.valueOf(decoder.D());
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, Object obj) {
        encoder.m(((Character) obj).charValue());
    }
}
