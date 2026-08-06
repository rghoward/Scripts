package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b2<K, V> implements j17<K, V> {
    public transient Set<K> t;
    public transient Collection<V> u;
    public transient Map<K, Collection<V>> v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a extends AbstractCollection<V> {
        public final /* synthetic */ v1 t;

        public a(v1 v1Var) {
            this.t = v1Var;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            this.t.d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            Iterator<Collection<V>> it = this.t.a().values().iterator();
            while (it.hasNext()) {
                if (it.next().contains(obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new u1();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return this.t.x;
        }
    }

    @Override // defpackage.j17
    public Map<K, Collection<V>> a() {
        Map<K, Collection<V>> map = this.v;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> mapB = b();
        this.v = mapB;
        return mapB;
    }

    public abstract Map<K, Collection<V>> b();

    public abstract Set<K> c();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j17) {
            return a().equals(((j17) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
