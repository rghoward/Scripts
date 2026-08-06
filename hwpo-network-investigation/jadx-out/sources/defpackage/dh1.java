package defpackage;

import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class dh1<Element, Collection, Builder> extends t0<Element, Collection, Builder> {
    public final KSerializer<Element> a;

    public dh1(KSerializer kSerializer) {
        this.a = kSerializer;
    }

    @Override // defpackage.t0
    public void f(rt1 rt1Var, int i, Object obj) {
        i(i, obj, rt1Var.J(getDescriptor(), i, this.a, null));
    }

    public abstract void i(int i, Object obj, Object obj2);

    @Override // defpackage.ud9
    public void serialize(Encoder encoder, Collection collection) {
        int iD = d(collection);
        SerialDescriptor descriptor = getDescriptor();
        st1 st1VarW = encoder.w(descriptor);
        Iterator<Element> itC = c(collection);
        for (int i = 0; i < iD; i++) {
            st1VarW.q(getDescriptor(), i, this.a, itC.next());
        }
        st1VarW.i(descriptor);
    }
}
