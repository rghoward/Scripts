package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class s0b implements Collection<r0b>, zn5 {
    public final int[] t;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements Iterator<r0b>, zn5 {
        public final int[] t;
        public int u;

        public a(int[] iArr) {
            this.t = iArr;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.u < this.t.length;
        }

        @Override // java.util.Iterator
        public final r0b next() {
            int i = this.u;
            int[] iArr = this.t;
            if (i < iArr.length) {
                this.u = i + 1;
                return new r0b(iArr[i]);
            }
            px1.b(String.valueOf(i));
            return null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(r0b r0bVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends r0b> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof r0b)) {
            return false;
        }
        return u30.u(this.t, ((r0b) obj).t);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        collection.getClass();
        Collection<?> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!(obj instanceof r0b)) {
                return false;
            }
            if (!u30.u(this.t, ((r0b) obj).t)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof s0b) {
            return this.t.equals(((s0b) obj).t);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.t);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.t.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<r0b> iterator() {
        return new a(this.t);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.t.length;
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        return (T[]) mh1.c(this, tArr);
    }

    public final String toString() {
        return "UIntArray(storage=" + Arrays.toString(this.t) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return mh1.b(this);
    }
}
