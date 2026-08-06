package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class pz8<K, V> implements Iterable<Map.Entry<K, V>> {
    public c<K, V> t;
    public c<K, V> u;
    public final WeakHashMap<f<K, V>, Boolean> v = new WeakHashMap<>();
    public int w = 0;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a<K, V> extends e<K, V> {
        @Override // pz8.e
        public final c<K, V> b(c<K, V> cVar) {
            return cVar.w;
        }

        @Override // pz8.e
        public final c<K, V> c(c<K, V> cVar) {
            return cVar.v;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b<K, V> extends e<K, V> {
        @Override // pz8.e
        public final c<K, V> b(c<K, V> cVar) {
            return cVar.v;
        }

        @Override // pz8.e
        public final c<K, V> c(c<K, V> cVar) {
            return cVar.w;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class c<K, V> implements Map.Entry<K, V> {
        public final K t;
        public final V u;
        public c<K, V> v;
        public c<K, V> w;

        public c(K k, V v) {
            this.t = k;
            this.u = v;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.t.equals(cVar.t) && this.u.equals(cVar.u);
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
            return this.u.hashCode() ^ this.t.hashCode();
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public final String toString() {
            return this.t + "=" + this.u;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class d extends f<K, V> implements Iterator<Map.Entry<K, V>> {
        public c<K, V> t;
        public boolean u = true;

        public d() {
        }

        @Override // pz8.f
        public final void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.t;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.w;
                this.t = cVar3;
                this.u = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.u) {
                return pz8.this.t != null;
            }
            c<K, V> cVar = this.t;
            return (cVar == null || cVar.v == null) ? false : true;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (this.u) {
                this.u = false;
                this.t = pz8.this.t;
            } else {
                c<K, V> cVar = this.t;
                this.t = cVar != null ? cVar.v : null;
            }
            return this.t;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class e<K, V> extends f<K, V> implements Iterator<Map.Entry<K, V>> {
        public c<K, V> t;
        public c<K, V> u;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.t = cVar2;
            this.u = cVar;
        }

        @Override // pz8.f
        public final void a(c<K, V> cVar) {
            c<K, V> cVarC = null;
            if (this.t == cVar && cVar == this.u) {
                this.u = null;
                this.t = null;
            }
            c<K, V> cVar2 = this.t;
            if (cVar2 == cVar) {
                this.t = b(cVar2);
            }
            c<K, V> cVar3 = this.u;
            if (cVar3 == cVar) {
                c<K, V> cVar4 = this.t;
                if (cVar3 != cVar4 && cVar4 != null) {
                    cVarC = c(cVar3);
                }
                this.u = cVarC;
            }
        }

        public abstract c<K, V> b(c<K, V> cVar);

        public abstract c<K, V> c(c<K, V> cVar);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.u != null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            c<K, V> cVar = this.u;
            c<K, V> cVar2 = this.t;
            this.u = (cVar == cVar2 || cVar2 == null) ? null : c(cVar);
            return cVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class f<K, V> {
        public abstract void a(c<K, V> cVar);
    }

    public c<K, V> d(K k) {
        c<K, V> cVar = this.t;
        while (cVar != null && !cVar.t.equals(k)) {
            cVar = cVar.v;
        }
        return cVar;
    }

    public V e(K k) {
        c<K, V> cVarD = d(k);
        if (cVarD == null) {
            return null;
        }
        this.w--;
        WeakHashMap<f<K, V>, Boolean> weakHashMap = this.v;
        if (!weakHashMap.isEmpty()) {
            Iterator<f<K, V>> it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(cVarD);
            }
        }
        c<K, V> cVar = cVarD.w;
        c<K, V> cVar2 = cVarD.v;
        if (cVar != null) {
            cVar.v = cVar2;
        } else {
            this.t = cVar2;
        }
        c<K, V> cVar3 = cVarD.v;
        if (cVar3 != null) {
            cVar3.w = cVar;
        } else {
            this.u = cVar;
        }
        cVarD.v = null;
        cVarD.w = null;
        return cVarD.u;
    }

    public final boolean equals(Object obj) {
        e eVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pz8)) {
            return false;
        }
        pz8 pz8Var = (pz8) obj;
        if (this.w != pz8Var.w) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = pz8Var.iterator();
        while (true) {
            eVar = (e) it;
            if (!eVar.hasNext()) {
                break;
            }
            e eVar2 = (e) it2;
            if (!eVar2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) eVar.next();
            Object next = eVar2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (eVar.hasNext() || ((e) it2).hasNext()) ? false : true;
    }

    public final int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int iHashCode = 0;
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) eVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.t, this.u);
        this.v.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) eVar.next()).toString());
            if (eVar.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
