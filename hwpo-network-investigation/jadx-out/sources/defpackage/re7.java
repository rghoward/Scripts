package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class re7<T> implements KSerializer<T> {
    public final T a;
    public final ss5 b;

    /* JADX WARN: Multi-variable type inference failed */
    public re7(Object obj) {
        obj.getClass();
        this.a = obj;
        this.b = hv5.c(j26.t, new qe7());
    }

    @Override // defpackage.sy2
    public final T deserialize(Decoder decoder) {
        SerialDescriptor descriptor = getDescriptor();
        rt1 rt1VarN = decoder.n(descriptor);
        int iG0 = rt1VarN.g0(getDescriptor());
        if (iG0 != -1) {
            throw new td9(pp2.a(iG0, "Unexpected index "));
        }
        g2b g2bVar = g2b.a;
        rt1VarN.i(descriptor);
        return this.a;
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.b.getValue();
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, T t) {
        t.getClass();
        encoder.n(getDescriptor()).i(getDescriptor());
    }
}
