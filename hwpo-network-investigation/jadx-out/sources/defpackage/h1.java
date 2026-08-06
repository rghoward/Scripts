package defpackage;

import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h1<E> extends w2b implements ListIterator<Object> {
    public final int u;
    public int v;

    public h1(int i, int i2) {
        super(0);
        xl7.o(i2, i);
        this.u = i;
        this.v = i2;
    }

    public abstract E a(int i);

    @Override // java.util.ListIterator
    @Deprecated
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.v < this.u;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.v > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (!hasNext()) {
            vl.b();
            return null;
        }
        int i = this.v;
        this.v = i + 1;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.v;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            vl.b();
            return null;
        }
        int i = this.v - 1;
        this.v = i;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.v - 1;
    }

    @Override // java.util.ListIterator
    @Deprecated
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
