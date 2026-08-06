package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e2<K, V> extends AbstractMap<K, V> implements Map<K, V>, bo5 {
    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return new uw7((sw7) this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        return new ww7((sw7) this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return ((sw7) this).x;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        return new yw7((sw7) this);
    }
}
