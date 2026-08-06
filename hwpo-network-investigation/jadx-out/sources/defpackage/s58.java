package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class s58<T> extends l2<T> {
    public final sd1 a;
    public final hf3 b = hf3.t;
    public final ss5 c = hv5.c(j26.t, new j32(2, this));

    public s58(sd1 sd1Var) {
        this.a = sd1Var;
    }

    @Override // defpackage.l2
    public final wn5<T> c() {
        return this.a;
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.c.getValue();
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.a + ')';
    }
}
