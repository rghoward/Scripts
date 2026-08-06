package defpackage;

import java.util.Map;
import java.util.Map.Entry;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w1<E extends Map.Entry<? extends K, ? extends V>, K, V> extends f2<E> {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        sw7<K, V> sw7Var = ((uw7) this).t;
        V v = sw7Var.get(key);
        if (v != null) {
            return v.equals(entry.getValue());
        }
        return entry.getValue() == null && sw7Var.containsKey(entry.getKey());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return ((uw7) this).t.remove(entry.getKey(), entry.getValue());
    }
}
