package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class oh1<E> extends AbstractCollection<E> {
    public final Collection<E> t;
    public final f78<? super E> u;

    public oh1(Collection<E> collection, f78<? super E> f78Var) {
        this.t = collection;
        this.u = f78Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(E e) {
        xl7.g(this.u.apply(e));
        return this.t.add(e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            xl7.g(this.u.apply(it.next()));
        }
        return this.t.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        Collection<E> collection = this.t;
        boolean z = collection instanceof RandomAccess;
        f78<? super E> f78Var = this.u;
        if (!z || !(collection instanceof List)) {
            Iterator<T> it = collection.iterator();
            f78Var.getClass();
            while (it.hasNext()) {
                if (f78Var.apply((Object) it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) collection;
        f78Var.getClass();
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            a05 a05Var = (Object) list.get(i2);
            if (!f78Var.apply(a05Var)) {
                if (i2 > i) {
                    try {
                        list.set(i, a05Var);
                    } catch (IllegalArgumentException unused) {
                        nr1.e(list, f78Var, i, i2);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        nr1.e(list, f78Var, i, i2);
                        return;
                    }
                }
                i++;
            }
        }
        list.subList(i, list.size()).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        boolean zContains;
        Collection<E> collection = this.t;
        collection.getClass();
        try {
            zContains = collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            zContains = false;
        }
        if (zContains) {
            return this.u.apply(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        Iterator<T> it = this.t.iterator();
        f78<? super E> f78Var = this.u;
        xl7.n(f78Var, "predicate");
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (f78Var.apply((Object) it.next())) {
                break;
            }
            i++;
        }
        return true ^ (i != -1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        Iterator<E> it = this.t.iterator();
        it.getClass();
        f78<? super E> f78Var = this.u;
        f78Var.getClass();
        return new rk5(it, f78Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        return contains(obj) && this.t.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        Iterator<E> it = this.t.iterator();
        boolean z = false;
        while (it.hasNext()) {
            E next = it.next();
            if (this.u.apply(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        Iterator<E> it = this.t.iterator();
        boolean z = false;
        while (it.hasNext()) {
            E next = it.next();
            if (this.u.apply(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        Iterator<E> it = this.t.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.u.apply(it.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        Iterator<E> it = iterator();
        ArrayList arrayList = new ArrayList();
        sk5.a(arrayList, it);
        return arrayList.toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        Iterator<E> it = iterator();
        ArrayList arrayList = new ArrayList();
        sk5.a(arrayList, it);
        return (T[]) arrayList.toArray(tArr);
    }
}
