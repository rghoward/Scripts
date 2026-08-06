package defpackage;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class x2b extends AbstractList<String> implements h26, RandomAccess {
    public final g26 t;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements ListIterator<String> {
        public ListIterator<String> t;

        @Override // java.util.ListIterator
        public final void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.t.hasNext();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.t.hasPrevious();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            return this.t.next();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.t.nextIndex();
        }

        @Override // java.util.ListIterator
        public final String previous() {
            return this.t.previous();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.t.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        public final void set(String str) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class b implements Iterator<String> {
        public Iterator<String> t;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.t.hasNext();
        }

        @Override // java.util.Iterator
        public final String next() {
            return this.t.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public x2b(g26 g26Var) {
        this.t = g26Var;
    }

    @Override // defpackage.h26
    public final void e0(f01 f01Var) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.t.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        b bVar = new b();
        bVar.t = this.t.iterator();
        return bVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i) {
        a aVar = new a();
        aVar.t = this.t.listIterator(i);
        return aVar;
    }

    @Override // defpackage.h26
    public final List<?> m() {
        return Collections.unmodifiableList(this.t.u);
    }

    @Override // defpackage.h26
    public final Object r0(int i) {
        return this.t.u.get(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.t.u.size();
    }

    @Override // defpackage.h26
    public final h26 m0() {
        return this;
    }
}
