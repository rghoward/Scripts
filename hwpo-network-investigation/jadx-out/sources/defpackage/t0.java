package defpackage;

import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Decoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class t0<Element, Collection, Builder> implements KSerializer<Collection> {
    public abstract Builder a();

    public abstract int b(Builder builder);

    public abstract Iterator<Element> c(Collection collection);

    public abstract int d(Collection collection);

    public Collection deserialize(Decoder decoder) {
        return (Collection) e(decoder);
    }

    public final Object e(Decoder decoder) {
        Builder builderA = a();
        int iB = b(builderA);
        rt1 rt1VarN = decoder.n(getDescriptor());
        while (true) {
            int iG0 = rt1VarN.g0(getDescriptor());
            if (iG0 == -1) {
                rt1VarN.i(getDescriptor());
                return h(builderA);
            }
            f(rt1VarN, iG0 + iB, builderA);
        }
    }

    public abstract void f(rt1 rt1Var, int i, Object obj);

    public abstract Builder g(Collection collection);

    public abstract Collection h(Builder builder);
}
