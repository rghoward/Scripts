package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jb6 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a<T> extends b<T> implements RandomAccess {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b<T> extends AbstractList<T> {
        public final List<T> t;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class a implements ListIterator<T> {
            public boolean t;
            public final /* synthetic */ ListIterator u;
            public final /* synthetic */ b v;

            public a(b bVar, ListIterator listIterator) {
                this.u = listIterator;
                this.v = bVar;
            }

            @Override // java.util.ListIterator
            public final void add(T t) {
                ListIterator listIterator = this.u;
                listIterator.add(t);
                listIterator.previous();
                this.t = false;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final boolean hasNext() {
                return this.u.hasPrevious();
            }

            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return this.u.hasNext();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final T next() {
                ListIterator listIterator = this.u;
                if (listIterator.hasPrevious()) {
                    this.t = true;
                    return (T) listIterator.previous();
                }
                vl.b();
                return null;
            }

            @Override // java.util.ListIterator
            public final int nextIndex() {
                return this.v.d(this.u.nextIndex());
            }

            @Override // java.util.ListIterator
            public final T previous() {
                ListIterator listIterator = this.u;
                if (listIterator.hasNext()) {
                    this.t = true;
                    return (T) listIterator.next();
                }
                vl.b();
                return null;
            }

            @Override // java.util.ListIterator
            public final int previousIndex() {
                return nextIndex() - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final void remove() {
                xl7.q("no calls to next() since the last call to remove()", this.t);
                this.u.remove();
                this.t = false;
            }

            @Override // java.util.ListIterator
            public final void set(T t) {
                xl7.r(this.t);
                this.u.set(t);
            }
        }

        public b(List<T> list) {
            list.getClass();
            this.t = list;
        }

        @Override // java.util.AbstractList, java.util.List
        public final void add(int i, T t) {
            this.t.add(d(i), t);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final void clear() {
            this.t.clear();
        }

        public final int d(int i) {
            int size = this.t.size();
            xl7.o(i, size);
            return size - i;
        }

        @Override // java.util.AbstractList, java.util.List
        public final T get(int i) {
            List<T> list = this.t;
            int size = list.size();
            xl7.k(i, size);
            return list.get((size - 1) - i);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public final Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public final ListIterator<T> listIterator(int i) {
            return new a(this, this.t.listIterator(d(i)));
        }

        @Override // java.util.AbstractList, java.util.List
        public final T remove(int i) {
            List<T> list = this.t;
            int size = list.size();
            xl7.k(i, size);
            return list.remove((size - 1) - i);
        }

        @Override // java.util.AbstractList
        public final void removeRange(int i, int i2) {
            subList(i, i2).clear();
        }

        @Override // java.util.AbstractList, java.util.List
        public final T set(int i, T t) {
            List<T> list = this.t;
            int size = list.size();
            xl7.k(i, size);
            return list.set((size - 1) - i, t);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.t.size();
        }

        @Override // java.util.AbstractList, java.util.List
        public final List<T> subList(int i, int i2) {
            List<T> list = this.t;
            xl7.p(i, i2, list.size());
            return jb6.a(list.subList(d(i2), d(i)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class c<F, T> extends AbstractList<T> implements RandomAccess, Serializable {
        public final List<F> t;
        public final yh4<? super F, ? extends T> u;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class a extends lva<F, T> {
            public a(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // defpackage.kva
            public final T a(F f) {
                return c.this.u.apply(f);
            }
        }

        public c(List<F> list, yh4<? super F, ? extends T> yh4Var) {
            list.getClass();
            this.t = list;
            this.u = yh4Var;
        }

        @Override // java.util.AbstractList, java.util.List
        public final T get(int i) {
            return this.u.apply(this.t.get(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            return this.t.isEmpty();
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public final Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public final ListIterator<T> listIterator(int i) {
            return new a(this.t.listIterator(i));
        }

        @Override // java.util.AbstractList, java.util.List
        public final T remove(int i) {
            return this.u.apply(this.t.remove(i));
        }

        @Override // java.util.AbstractList
        public final void removeRange(int i, int i2) {
            this.t.subList(i, i2).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.t.size();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class d<F, T> extends AbstractSequentialList<T> implements Serializable {
        public final List<F> t;
        public final yh4<? super F, ? extends T> u;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class a extends lva<F, T> {
            public a(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // defpackage.kva
            public final T a(F f) {
                return d.this.u.apply(f);
            }
        }

        public d(List<F> list, yh4<? super F, ? extends T> yh4Var) {
            list.getClass();
            this.t = list;
            this.u = yh4Var;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            return this.t.isEmpty();
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public final ListIterator<T> listIterator(int i) {
            return new a(this.t.listIterator(i));
        }

        @Override // java.util.AbstractList
        public final void removeRange(int i, int i2) {
            this.t.subList(i, i2).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.t.size();
        }
    }

    public static <T> List<T> a(List<T> list) {
        if (list instanceof k95) {
            return ((k95) list).z();
        }
        if (list instanceof b) {
            return ((b) list).t;
        }
        return list instanceof RandomAccess ? new a(list) : new b(list);
    }

    public static AbstractList b(List list, yh4 yh4Var) {
        return list instanceof RandomAccess ? new c(list, yh4Var) : new d(list, yh4Var);
    }
}
