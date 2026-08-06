package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class wd7<T> implements KSerializer<T> {
    public final KSerializer<T> a;
    public final jd9 b;

    public wd7(KSerializer<T> kSerializer) {
        kSerializer.getClass();
        this.a = kSerializer;
        this.b = new jd9(kSerializer.getDescriptor());
    }

    @Override // defpackage.sy2
    public final T deserialize(Decoder decoder) {
        if (decoder.d0()) {
            return (T) decoder.C(this.a);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && wd7.class == obj.getClass() && xj5.a(this.a, ((wd7) obj).a);
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, T t) {
        if (t != null) {
            encoder.j(this.a, t);
        } else {
            encoder.a();
        }
    }
}
