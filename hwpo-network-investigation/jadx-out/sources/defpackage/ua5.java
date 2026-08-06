package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ua5<T> implements Iterator<sa5<? extends T>>, zn5 {
    public final Iterator<T> t;
    public int u;

    /* JADX WARN: Multi-variable type inference failed */
    public ua5(Iterator<? extends T> it) {
        it.getClass();
        this.t = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.t.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.u;
        this.u = i + 1;
        if (i >= 0) {
            return new sa5(i, this.t.next());
        }
        ws0.m();
        throw null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
