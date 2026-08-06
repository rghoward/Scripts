package defpackage;

import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class z1c extends w2b implements ListIterator {
    public final int u;
    public int v;
    public final c5c w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1c(c5c c5cVar, int i) {
        super(1);
        int size = c5cVar.size();
        if (i < 0 || i > size) {
            r.b(p1d.c(i, size, "index"));
            throw null;
        }
        this.u = size;
        this.v = i;
        this.w = c5cVar;
    }

    public final Object a(int i) {
        return this.w.get(i);
    }

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
    public final Object next() {
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
    public final Object previous() {
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
