package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class t9c implements Iterator {
    public final Iterator t;

    public t9c(v9c v9cVar) {
        this.t = v9cVar.t.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.t.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.t.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
