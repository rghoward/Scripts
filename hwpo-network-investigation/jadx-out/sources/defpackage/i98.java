package defpackage;

import defpackage.g98;
import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class i98<Element, Array, Builder extends g98<Array>> extends dh1<Element, Array, Builder> {
    public final h98 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i98(KSerializer<Element> kSerializer) {
        super(kSerializer);
        kSerializer.getClass();
        this.b = new h98(kSerializer.getDescriptor());
    }

    @Override // defpackage.t0
    public final Object a() {
        return g(j());
    }

    @Override // defpackage.t0
    public final int b(Object obj) {
        g98 g98Var = (g98) obj;
        g98Var.getClass();
        return g98Var.d();
    }

    @Override // defpackage.t0
    public final Iterator<Element> c(Array array) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // defpackage.t0, defpackage.sy2
    public final Array deserialize(Decoder decoder) {
        return (Array) e(decoder);
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return this.b;
    }

    @Override // defpackage.t0
    public final Object h(Object obj) {
        g98 g98Var = (g98) obj;
        g98Var.getClass();
        return g98Var.a();
    }

    @Override // defpackage.dh1
    public final void i(int i, Object obj, Object obj2) {
        ((g98) obj).getClass();
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Array j();

    public abstract void k(st1 st1Var, Array array, int i);

    @Override // defpackage.dh1, defpackage.ud9
    public final void serialize(Encoder encoder, Array array) {
        int iD = d(array);
        h98 h98Var = this.b;
        st1 st1VarW = encoder.w(h98Var);
        k(st1VarW, array, iD);
        st1VarW.i(h98Var);
    }
}
