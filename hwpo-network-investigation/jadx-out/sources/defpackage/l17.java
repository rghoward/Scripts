package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class l17<K, V> extends o1<K, V> {
    public transient k17 y;

    @Override // defpackage.b2
    public final Map<K, Collection<V>> b() {
        Map<K, Collection<V>> map = this.w;
        if (map instanceof NavigableMap) {
            return new v1.d(this, (NavigableMap) map);
        }
        return map instanceof SortedMap ? new v1.g(this, (SortedMap) map) : new v1.a(map);
    }

    @Override // defpackage.b2
    public final Set<K> c() {
        Map<K, Collection<V>> map = this.w;
        if (map instanceof NavigableMap) {
            return new v1.e(this, (NavigableMap) map);
        }
        return map instanceof SortedMap ? new v1.h(this, (SortedMap) map) : new v1.c(map);
    }

    @Override // defpackage.v1
    public final Collection e() {
        return (List) this.y.get();
    }
}
