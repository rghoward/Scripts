package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class h1b implements KSerializer<d1b> {
    public static final h1b a = new h1b();
    public static final pc5 b = rc5.b("kotlin.UShort", pn9.a);

    @Override // defpackage.sy2
    public final Object deserialize(Decoder decoder) {
        return new d1b(decoder.n0(b).t0());
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, Object obj) {
        encoder.v(b).c(((d1b) obj).t);
    }
}
