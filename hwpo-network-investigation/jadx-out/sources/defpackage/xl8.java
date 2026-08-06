package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xl8<E> extends r95<E> {
    public static final xl8<Comparable> A;
    public final transient k95<E> z;

    static {
        k95.b bVar = k95.u;
        A = new xl8<>(ul8.x, n47.t);
    }

    public xl8(k95<E> k95Var, Comparator<? super E> comparator) {
        super(comparator);
        this.z = k95Var;
    }

    @Override // java.util.NavigableSet
    public final E ceiling(E e) {
        int iX = x(e, true);
        k95<E> k95Var = this.z;
        if (iX == k95Var.size()) {
            return null;
        }
        return k95Var.get(iX);
    }

    @Override // defpackage.b95, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.z, obj, this.w) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        if (collection instanceof v17) {
            collection = ((v17) collection).A();
        }
        Comparator<? super E> comparator = this.w;
        if (!b78.e(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        w2b it = iterator();
        Iterator<?> it2 = collection.iterator();
        h1 h1Var = (h1) it;
        if (!h1Var.hasNext()) {
            return false;
        }
        a05 a05Var = (Object) it2.next();
        a05 a05Var2 = (Object) h1Var.next();
        while (true) {
            try {
                int iCompare = comparator.compare(a05Var2, a05Var);
                if (iCompare < 0) {
                    if (!h1Var.hasNext()) {
                        return false;
                    }
                    a05Var2 = (Object) h1Var.next();
                } else if (iCompare == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    a05Var = (Object) it2.next();
                } else if (iCompare > 0) {
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }
    }

    @Override // defpackage.q95, defpackage.b95
    public final k95<E> d() {
        return this.z;
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return this.z.z().listIterator(0);
    }

    @Override // defpackage.b95
    public final int e(int i, Object[] objArr) {
        return this.z.e(i, objArr);
    }

    @Override // defpackage.q95, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        a05 a05Var;
        E next;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (this.z.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        Comparator<? super E> comparator = this.w;
        if (!b78.e(comparator, set)) {
            return containsAll(set);
        }
        Iterator<E> it = set.iterator();
        try {
            w2b it2 = iterator();
            do {
                h1 h1Var = (h1) it2;
                if (!h1Var.hasNext()) {
                    return true;
                }
                a05Var = (Object) h1Var.next();
                next = it.next();
                if (next == null) {
                    return false;
                }
            } while (comparator.compare(a05Var, next) == 0);
            return false;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // defpackage.b95
    public final Object[] f() {
        return this.z.f();
    }

    @Override // java.util.SortedSet
    public final E first() {
        if (!isEmpty()) {
            return this.z.get(0);
        }
        vl.b();
        return null;
    }

    @Override // java.util.NavigableSet
    public final E floor(E e) {
        int iW = w(e, true) - 1;
        if (iW == -1) {
            return null;
        }
        return this.z.get(iW);
    }

    @Override // java.util.NavigableSet
    public final E higher(E e) {
        int iX = x(e, false);
        k95<E> k95Var = this.z;
        if (iX == k95Var.size()) {
            return null;
        }
        return k95Var.get(iX);
    }

    @Override // defpackage.b95
    public final int i() {
        return this.z.i();
    }

    @Override // defpackage.b95
    public final int j() {
        return this.z.j();
    }

    @Override // defpackage.b95
    public final boolean k() {
        return this.z.k();
    }

    @Override // defpackage.b95, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: l */
    public final w2b iterator() {
        return this.z.listIterator(0);
    }

    @Override // java.util.SortedSet
    public final E last() {
        if (isEmpty()) {
            vl.b();
            return null;
        }
        k95<E> k95Var = this.z;
        return k95Var.get(k95Var.size() - 1);
    }

    @Override // java.util.NavigableSet
    public final E lower(E e) {
        int iW = w(e, false) - 1;
        if (iW == -1) {
            return null;
        }
        return this.z.get(iW);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.z.size();
    }

    public final xl8<E> v(int i, int i2) {
        k95<E> k95Var = this.z;
        if (i == 0 && i2 == k95Var.size()) {
            return this;
        }
        Comparator<? super E> comparator = this.w;
        return i < i2 ? new xl8<>(k95Var.subList(i, i2), comparator) : r95.t(comparator);
    }

    public final int w(E e, boolean z) {
        e.getClass();
        int iBinarySearch = Collections.binarySearch(this.z, e, this.w);
        if (iBinarySearch >= 0) {
            return z ? iBinarySearch + 1 : iBinarySearch;
        }
        return ~iBinarySearch;
    }

    public final int x(E e, boolean z) {
        e.getClass();
        int iBinarySearch = Collections.binarySearch(this.z, e, this.w);
        if (iBinarySearch >= 0) {
            return z ? iBinarySearch : iBinarySearch + 1;
        }
        return ~iBinarySearch;
    }
}
