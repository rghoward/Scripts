package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ad6 implements Collection<yc6>, zn5 {
    public static final ad6 v = new ad6(hf3.t);
    public final List<yc6> t;
    public final int u;

    public ad6(List<yc6> list) {
        this.t = list;
        this.u = list.size();
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(yc6 yc6Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends yc6> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof yc6)) {
            return false;
        }
        return this.t.contains((yc6) obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        return this.t.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ad6) {
            return this.t.equals(((ad6) obj).t);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.t.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.t.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<yc6> iterator() {
        return this.t.iterator();
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
    public final boolean removeIf(Predicate<? super yc6> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.u;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return mh1.b(this);
    }

    public final String toString() {
        return zc6.a(new StringBuilder("LocaleList(localeList="), this.t, ')');
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) mh1.c(this, tArr);
    }
}
