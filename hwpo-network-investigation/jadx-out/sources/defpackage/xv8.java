package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class xv8<T> extends m1<T> {
    public final List<T> t;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements ListIterator<T>, zn5 {
        public final ListIterator<T> t;
        public final /* synthetic */ xv8<T> u;

        /* JADX WARN: Multi-variable type inference failed */
        public a(xv8<? extends T> xv8Var, int i) {
            this.u = xv8Var;
            List<T> list = xv8Var.t;
            if (i >= 0 && i <= xv8Var.d()) {
                this.t = list.listIterator(xv8Var.d() - i);
                return;
            }
            StringBuilder sbB = t43.b(i, "Position index ", " must be in range [");
            sbB.append(new fg5(0, xv8Var.d(), 1));
            sbB.append("].");
            throw new IndexOutOfBoundsException(sbB.toString());
        }

        @Override // java.util.ListIterator
        public final void add(T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.t.hasPrevious();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.t.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final T next() {
            return this.t.previous();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return (this.u.size() - 1) - this.t.previousIndex();
        }

        @Override // java.util.ListIterator
        public final T previous() {
            return this.t.next();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return (this.u.size() - 1) - this.t.nextIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final void set(T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public xv8(List<? extends T> list) {
        list.getClass();
        this.t = list;
    }

    @Override // defpackage.s0
    public final int d() {
        return this.t.size();
    }

    @Override // java.util.List
    public final T get(int i) {
        if (i >= 0 && i <= ws0.g(this)) {
            return this.t.get(ws0.g(this) - i);
        }
        StringBuilder sbB = t43.b(i, "Element index ", " must be in range [");
        sbB.append(new fg5(0, ws0.g(this), 1));
        sbB.append("].");
        throw new IndexOutOfBoundsException(sbB.toString());
    }

    @Override // defpackage.m1, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<T> iterator() {
        return new a(this, 0);
    }

    @Override // defpackage.m1, java.util.List
    public final ListIterator<T> listIterator() {
        return new a(this, 0);
    }

    @Override // defpackage.m1, java.util.List
    public final ListIterator<T> listIterator(int i) {
        return new a(this, i);
    }
}
