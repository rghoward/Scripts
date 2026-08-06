package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class yo5<K, V, R> implements KSerializer<R> {
    public final KSerializer<K> a;
    public final KSerializer<V> b;

    public yo5(KSerializer kSerializer, KSerializer kSerializer2) {
        this.a = kSerializer;
        this.b = kSerializer2;
    }

    public abstract K a(R r);

    public abstract V b(R r);

    public abstract R c(K k, V v);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.sy2
    public final R deserialize(Decoder decoder) {
        SerialDescriptor descriptor = getDescriptor();
        rt1 rt1VarN = decoder.n(descriptor);
        Object obj = wya.a;
        Object objJ = obj;
        Object objJ2 = objJ;
        while (true) {
            int iG0 = rt1VarN.g0(getDescriptor());
            if (iG0 == -1) {
                if (objJ == obj) {
                    throw new td9("Element 'key' is missing");
                }
                if (objJ2 == obj) {
                    throw new td9("Element 'value' is missing");
                }
                R r = (R) c(objJ, objJ2);
                rt1VarN.i(descriptor);
                return r;
            }
            if (iG0 == 0) {
                objJ = rt1VarN.J(getDescriptor(), 0, this.a, null);
            } else {
                if (iG0 != 1) {
                    throw new td9(pp2.a(iG0, "Invalid index: "));
                }
                objJ2 = rt1VarN.J(getDescriptor(), 1, this.b, null);
            }
        }
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, R r) {
        st1 st1VarN = encoder.n(getDescriptor());
        st1VarN.q(getDescriptor(), 0, this.a, a(r));
        st1VarN.q(getDescriptor(), 1, this.b, b(r));
        st1VarN.i(getDescriptor());
    }
}
