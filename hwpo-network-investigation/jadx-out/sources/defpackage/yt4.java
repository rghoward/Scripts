package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yt4 implements Map<String, Object>, bo5 {
    public final /* synthetic */ ConcurrentHashMap<String, Object> t = new ConcurrentHashMap<>();

    @Override // java.util.Map
    public final void clear() {
        this.t.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.t.containsKey((String) obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.t.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, Object>> entrySet() {
        Set<Map.Entry<String, Object>> setEntrySet = this.t.entrySet();
        setEntrySet.getClass();
        return setEntrySet;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return this.t.get((String) obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.t.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        Set<String> setKeySet = this.t.keySet();
        setKeySet.getClass();
        return setKeySet;
    }

    @Override // java.util.Map
    public final Object put(String str, Object obj) {
        String str2 = str;
        str2.getClass();
        return this.t.put(str2, obj);
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends Object> map) {
        map.getClass();
        this.t.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return this.t.remove((String) obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.t.size();
    }

    @Override // java.util.Map
    public final Collection<Object> values() {
        Collection<Object> collectionValues = this.t.values();
        collectionValues.getClass();
        return collectionValues;
    }
}
