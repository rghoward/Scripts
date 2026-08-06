package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class kva<F, T> implements Iterator<T> {
    public final Iterator<? extends F> t;

    public kva(Iterator<? extends F> it) {
        it.getClass();
        this.t = it;
    }

    public abstract T a(F f);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.t.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return a(this.t.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.t.remove();
    }
}
