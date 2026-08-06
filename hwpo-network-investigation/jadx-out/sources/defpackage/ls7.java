package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ls7<K, V> extends yo5<K, V, js7<? extends K, ? extends V>> {
    public final ld9 c;

    public ls7(KSerializer<K> kSerializer, KSerializer<V> kSerializer2) {
        super(kSerializer, kSerializer2);
        SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[0];
        if (z2a.w("kotlin.Pair")) {
            z90.a("Blank serial names are prohibited");
            throw null;
        }
        td1 td1Var = new td1("kotlin.Pair");
        td1.a(td1Var, "first", kSerializer.getDescriptor());
        td1.a(td1Var, "second", kSerializer2.getDescriptor());
        g2b g2bVar = g2b.a;
        this.c = new ld9("kotlin.Pair", g3a.a.a, td1Var.c.size(), u30.E(serialDescriptorArr), td1Var);
    }

    @Override // defpackage.yo5
    public final Object a(Object obj) {
        js7 js7Var = (js7) obj;
        js7Var.getClass();
        return js7Var.t;
    }

    @Override // defpackage.yo5
    public final Object b(Object obj) {
        js7 js7Var = (js7) obj;
        js7Var.getClass();
        return js7Var.u;
    }

    @Override // defpackage.yo5
    public final Object c(Object obj, Object obj2) {
        return new js7(obj, obj2);
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return this.c;
    }
}
