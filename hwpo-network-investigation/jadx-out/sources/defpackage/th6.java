package defpackage;

import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class th6<K, V> extends yo5<K, V, Map.Entry<? extends K, ? extends V>> {
    public final ld9 c;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<K, V> implements Map.Entry<K, V>, zn5 {
        public final K t;
        public final V u;

        public a(K k, V v) {
            this.t = k;
            this.u = v;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return xj5.a(this.t, aVar.t) && xj5.a(this.u, aVar.u);
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.t;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.u;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k = this.t;
            int iHashCode = (k == null ? 0 : k.hashCode()) * 31;
            V v = this.u;
            return iHashCode + (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final String toString() {
            return "MapEntry(key=" + this.t + ", value=" + this.u + ')';
        }
    }

    public th6(KSerializer<K> kSerializer, KSerializer<V> kSerializer2) {
        super(kSerializer, kSerializer2);
        this.c = od9.b("kotlin.collections.Map.Entry", g3a.c.a, new SerialDescriptor[0], new dw0(1, kSerializer, kSerializer2));
    }

    @Override // defpackage.yo5
    public final Object a(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        return entry.getKey();
    }

    @Override // defpackage.yo5
    public final Object b(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        return entry.getValue();
    }

    @Override // defpackage.yo5
    public final Object c(Object obj, Object obj2) {
        return new a(obj, obj2);
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return this.c;
    }
}
