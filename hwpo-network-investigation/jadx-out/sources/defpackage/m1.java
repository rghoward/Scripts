package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class m1<E> extends s0<E> implements List<E> {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    /* JADX INFO: loaded from: classes.dex */
    public static final class a {
        public static void a(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                cp2.a(i3, u43.b("fromIndex: ", ", toIndex: ", ", size: ", i, i2));
            } else {
                if (i <= i2) {
                    return;
                }
                z90.a(u.a(i, i2, "fromIndex: ", " > toIndex: "));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class b implements Iterator<E>, zn5 {
        public int t;

        public b() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.t < m1.this.d();
        }

        @Override // java.util.Iterator
        public final E next() {
            if (!hasNext()) {
                vl.b();
                return null;
            }
            int i = this.t;
            this.t = i + 1;
            return m1.this.get(i);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class c extends m1<E>.b implements ListIterator<E> {
        public c(int i) {
            super();
            int iD = m1.this.d();
            if (i < 0 || i > iD) {
                r.b(u.a(i, iD, "index: ", ", size: "));
                throw null;
            }
            this.t = i;
        }

        @Override // java.util.ListIterator
        public final void add(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.t > 0;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.t;
        }

        @Override // java.util.ListIterator
        public final E previous() {
            if (!hasPrevious()) {
                vl.b();
                return null;
            }
            int i = this.t - 1;
            this.t = i;
            return m1.this.get(i);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.t - 1;
        }

        @Override // java.util.ListIterator
        public final void set(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d<E> extends m1<E> implements RandomAccess {
        public final m1<E> t;
        public final int u;
        public final int v;

        /* JADX WARN: Multi-variable type inference failed */
        public d(m1<? extends E> m1Var, int i, int i2) {
            this.t = m1Var;
            this.u = i;
            a.a(i, i2, m1Var.d());
            this.v = i2 - i;
        }

        @Override // defpackage.s0
        public final int d() {
            return this.v;
        }

        @Override // java.util.List
        public final E get(int i) {
            int i2 = this.v;
            if (i < 0 || i >= i2) {
                r.b(u.a(i, i2, "index: ", ", size: "));
                return null;
            }
            return this.t.get(this.u + i);
        }

        @Override // defpackage.m1, java.util.List
        public final List<E> subList(int i, int i2) {
            a.a(i, i2, this.v);
            int i3 = this.u;
            return new d(this.t, i + i3, i3 + i2);
        }
    }

    @Override // java.util.List
    public final void add(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection collection = (Collection) obj;
        if (size() == collection.size()) {
            Iterator<E> it = collection.iterator();
            Iterator<E> it2 = iterator();
            while (it2.hasNext()) {
                if (!xj5.a(it2.next(), it.next())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        Iterator<E> it = iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            E next = it.next();
            iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
        }
        return iHashCode;
    }

    public int indexOf(Object obj) {
        Iterator<E> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            if (xj5.a(it.next(), obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new b();
    }

    public int lastIndexOf(Object obj) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (xj5.a(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator<E> listIterator() {
        return new c(0);
    }

    @Override // java.util.List
    public final E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final E set(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<E> subList(int i, int i2) {
        return new d(this, i, i2);
    }

    public ListIterator<E> listIterator(int i) {
        return new c(i);
    }
}
