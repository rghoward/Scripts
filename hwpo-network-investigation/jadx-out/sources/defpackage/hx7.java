package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hx7<E> implements Iterator<E>, zn5 {
    public Object t;
    public final Map<E, z86> u;
    public int v;

    public hx7(Object obj, Map<E, z86> map) {
        this.t = obj;
        this.u = map;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.v < this.u.size();
    }

    @Override // java.util.Iterator
    public final E next() {
        if (!hasNext()) {
            vl.b();
            return null;
        }
        E e = (E) this.t;
        this.v++;
        z86 z86Var = this.u.get(e);
        if (z86Var != null) {
            this.t = z86Var.b;
            return e;
        }
        throw new ConcurrentModificationException("Hash code of an element (" + e + ") has changed after it was added to the persistent set.");
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
