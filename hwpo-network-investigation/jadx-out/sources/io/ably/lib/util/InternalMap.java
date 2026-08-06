package io.ably.lib.util;

import io.ably.lib.types.ReadOnlyMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class InternalMap<K, V> implements ReadOnlyMap<K, V> {
    protected final ConcurrentMap<K, V> map = new ConcurrentHashMap();

    @Override // io.ably.lib.types.ReadOnlyMap
    public final boolean containsKey(Object obj) {
        return this.map.containsKey(obj);
    }

    @Override // io.ably.lib.types.ReadOnlyMap
    public final boolean containsValue(Object obj) {
        return this.map.containsValue(obj);
    }

    @Override // io.ably.lib.types.ReadOnlyMap
    public final Iterable<Map.Entry<K, V>> entrySet() {
        return this.map.entrySet();
    }

    @Override // io.ably.lib.types.ReadOnlyMap
    public final V get(Object obj) {
        return this.map.get(obj);
    }

    @Override // io.ably.lib.types.ReadOnlyMap
    public final boolean isEmpty() {
        return this.map.isEmpty();
    }

    @Override // io.ably.lib.types.ReadOnlyMap
    public final Iterable<K> keySet() {
        return this.map.keySet();
    }

    @Override // io.ably.lib.types.ReadOnlyMap
    public final int size() {
        return this.map.size();
    }

    @Override // io.ably.lib.types.ReadOnlyMap
    public final Iterable<V> values() {
        return this.map.values();
    }
}
