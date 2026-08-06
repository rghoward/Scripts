package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zs5 extends ct5 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a<K> implements Map.Entry<K, Object> {
        public Map.Entry<K, zs5> t;

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.t.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            zs5 value = this.t.getValue();
            if (value == null) {
                return null;
            }
            return value.a(null);
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (!(obj instanceof au6)) {
                z90.a("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
                return null;
            }
            zs5 value = this.t.getValue();
            au6 au6Var = value.a;
            value.b = null;
            value.a = (au6) obj;
            return au6Var;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b<K> implements Iterator<Map.Entry<K, Object>> {
        public Iterator<Map.Entry<K, Object>> t;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.t.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            Map.Entry<K, Object> next = this.t.next();
            if (!(next.getValue() instanceof zs5)) {
                return next;
            }
            a aVar = new a();
            aVar.t = next;
            return aVar;
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.t.remove();
        }
    }

    public final boolean equals(Object obj) {
        return a(null).equals(obj);
    }

    public final int hashCode() {
        return a(null).hashCode();
    }

    public final String toString() {
        return a(null).toString();
    }
}
