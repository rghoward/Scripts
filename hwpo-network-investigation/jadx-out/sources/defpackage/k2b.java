package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class k2b implements KSerializer<g2b> {
    public static final k2b b = new k2b();
    public final /* synthetic */ re7<g2b> a = new re7<>(g2b.a);

    @Override // defpackage.sy2
    public final Object deserialize(Decoder decoder) {
        this.a.deserialize(decoder);
        return g2b.a;
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return this.a.getDescriptor();
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, Object obj) {
        g2b g2bVar = (g2b) obj;
        g2bVar.getClass();
        this.a.serialize(encoder, g2bVar);
    }
}
