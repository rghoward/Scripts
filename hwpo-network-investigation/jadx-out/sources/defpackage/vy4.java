package defpackage;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vy4 implements List<ox6.c>, zn5 {
    public final t27<Object> t = new t27<>(16);
    public final m27 u = new m27(16);
    public int v = -1;

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, ox6.c cVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends ox6.c> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.v = -1;
        this.t.j();
        this.u.b = 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof ox6.c) && indexOf((ox6.c) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((ox6.c) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final long d() {
        long jA = j84.a(Float.POSITIVE_INFINITY, false, false);
        int i = this.v + 1;
        int i2 = this.t.b - 1;
        if (i > i2) {
            return jA;
        }
        while (true) {
            m27 m27Var = this.u;
            if (i < 0) {
                m27Var.getClass();
                break;
            }
            if (i >= m27Var.b) {
                break;
            }
            long j = m27Var.a[i];
            if (m33.b(j, jA) < 0) {
                jA = j;
            }
            if ((m33.c(jA) < 0.0f && m33.e(jA)) || i == i2) {
                return jA;
            }
            i++;
        }
        r.b("Index must be between 0 and size");
        return 0L;
    }

    public final void e(int i, int i2) {
        if (i >= i2) {
            return;
        }
        this.t.m(i, i2);
        m27 m27Var = this.u;
        if (i >= 0) {
            int i3 = m27Var.b;
            if (i <= i3 && i2 >= 0 && i2 <= i3) {
                if (i2 < i) {
                    z90.a("The end index must be < start index");
                    return;
                } else {
                    if (i2 != i) {
                        if (i2 < i3) {
                            long[] jArr = m27Var.a;
                            gz3.g(jArr, jArr, i, i2, i3);
                        }
                        m27Var.b -= i2 - i;
                        return;
                    }
                    return;
                }
            }
        } else {
            m27Var.getClass();
        }
        r.b("Index must be between 0 and size");
    }

    @Override // java.util.List
    public final ox6.c get(int i) {
        Object objB = this.t.b(i);
        objB.getClass();
        return (ox6.c) objB;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof ox6.c)) {
            return -1;
        }
        ox6.c cVar = (ox6.c) obj;
        int size = size() - 1;
        if (size >= 0) {
            int i = 0;
            while (!xj5.a(this.t.b(i), cVar)) {
                if (i != size) {
                    i++;
                }
            }
            return i;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.t.d();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<ox6.c> iterator() {
        return new a(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof ox6.c)) {
            return -1;
        }
        ox6.c cVar = (ox6.c) obj;
        for (int size = size() - 1; -1 < size; size--) {
            if (xj5.a(this.t.b(size), cVar)) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator<ox6.c> listIterator() {
        return new a(this, 0, 7);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ ox6.c remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<ox6.c> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ ox6.c set(int i, ox6.c cVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.t.b;
    }

    @Override // java.util.List
    public final void sort(Comparator<? super ox6.c> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<ox6.c> subList(int i, int i2) {
        return new b(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return mh1.b(this);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class b implements List<ox6.c>, zn5 {
        public final int t;
        public final int u;

        public b(int i, int i2) {
            this.t = i;
            this.u = i2;
        }

        @Override // java.util.List
        public final /* bridge */ /* synthetic */ void add(int i, ox6.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final boolean addAll(int i, Collection<? extends ox6.c> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ /* synthetic */ void addLast(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            return (obj instanceof ox6.c) && indexOf((ox6.c) obj) != -1;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains((ox6.c) it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final ox6.c get(int i) {
            Object objB = vy4.this.t.b(i + this.t);
            objB.getClass();
            return (ox6.c) objB;
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            if (!(obj instanceof ox6.c)) {
                return -1;
            }
            ox6.c cVar = (ox6.c) obj;
            int i = this.t;
            int i2 = this.u;
            if (i > i2) {
                return -1;
            }
            int i3 = i;
            while (!xj5.a(vy4.this.t.b(i3), cVar)) {
                if (i3 == i2) {
                    return -1;
                }
                i3++;
            }
            return i3 - i;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return size() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator<ox6.c> iterator() {
            int i = this.t;
            return vy4.this.new a(i, i, this.u);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            if (!(obj instanceof ox6.c)) {
                return -1;
            }
            ox6.c cVar = (ox6.c) obj;
            int i = this.u;
            int i2 = this.t;
            if (i2 > i) {
                return -1;
            }
            while (!xj5.a(vy4.this.t.b(i), cVar)) {
                if (i == i2) {
                    return -1;
                }
                i--;
            }
            return i - i2;
        }

        @Override // java.util.List
        public final ListIterator<ox6.c> listIterator(int i) {
            int i2 = this.t;
            int i3 = this.u;
            return vy4.this.new a(i + i2, i2, i3);
        }

        @Override // java.util.List
        public final /* bridge */ /* synthetic */ ox6.c remove(int i) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ /* synthetic */ Object removeFirst() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ /* synthetic */ Object removeLast() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final void replaceAll(UnaryOperator<ox6.c> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final /* bridge */ /* synthetic */ ox6.c set(int i, ox6.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.u - this.t;
        }

        @Override // java.util.List
        public final void sort(Comparator<? super ox6.c> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final List<ox6.c> subList(int i, int i2) {
            int i3 = this.t;
            return vy4.this.new b(i + i3, i3 + i2);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return mh1.b(this);
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) mh1.c(this, tArr);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends ox6.c> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final ListIterator<ox6.c> listIterator() {
            int i = this.t;
            return vy4.this.new a(i, i, this.u);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) mh1.c(this, tArr);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends ox6.c> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator<ox6.c> listIterator(int i) {
        return new a(this, i, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class a implements ListIterator<ox6.c>, zn5 {
        public int t;
        public final int u;
        public final int v;

        public a(vy4 vy4Var, int i, int i2) {
            this((i2 & 1) != 0 ? 0 : i, 0, vy4Var.t.b);
        }

        @Override // java.util.ListIterator
        public final /* bridge */ /* synthetic */ void add(ox6.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.t < this.v;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.t > this.u;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            t27<Object> t27Var = vy4.this.t;
            int i = this.t;
            this.t = i + 1;
            Object objB = t27Var.b(i);
            objB.getClass();
            return (ox6.c) objB;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.t - this.u;
        }

        @Override // java.util.ListIterator
        public final ox6.c previous() {
            t27<Object> t27Var = vy4.this.t;
            int i = this.t - 1;
            this.t = i;
            Object objB = t27Var.b(i);
            objB.getClass();
            return (ox6.c) objB;
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return (this.t - this.u) - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final /* bridge */ /* synthetic */ void set(ox6.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public a(int i, int i2, int i3) {
            this.t = i;
            this.u = i2;
            this.v = i3;
        }
    }
}
