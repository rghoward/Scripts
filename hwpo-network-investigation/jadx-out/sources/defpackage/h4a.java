package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface h4a {
    void a(a aVar);

    boolean b(Object obj, Object obj2);

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements Collection<Object>, zn5 {
        public final u27<Object> t;

        public a(int i) {
            int i2 = cl7.a;
            this.t = new u27<>(6);
        }

        @Override // java.util.Collection
        public final boolean add(Object obj) {
            return this.t.a(obj);
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final void clear() {
            this.t.b();
        }

        @Override // java.util.Collection
        public final boolean contains(Object obj) {
            return this.t.c(obj);
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!this.t.c(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return this.t.g == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<Object> iterator() {
            u27<Object> u27Var = this.t;
            u27Var.getClass();
            return new v27.a(new v27(u27Var));
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            return this.t.g(obj);
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            return this.t.g(collection);
        }

        @Override // java.util.Collection
        public final boolean removeIf(Predicate<? super Object> predicate) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            return this.t.i(collection);
        }

        @Override // java.util.Collection
        public final int size() {
            return this.t.g;
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            return mh1.b(this);
        }

        @Override // java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) mh1.c(this, tArr);
        }
    }
}
