package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j2<E> extends m1<E> implements j95<Object>, Collection, zn5 {
    @Override // defpackage.s0, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.s0, java.util.Collection, java.util.List
    public final boolean containsAll(Collection<?> collection) {
        Collection<?> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract j2 e(int i, Object obj);

    public abstract j2 f(Object obj);

    public j2 i(Collection<? extends E> collection) {
        lx7 lx7VarJ = j();
        lx7VarJ.addAll(collection);
        return lx7VarJ.f();
    }

    @Override // defpackage.m1, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    public abstract lx7 j();

    public abstract j2 k(i2 i2Var);

    public abstract j2 l(int i);

    @Override // defpackage.m1, java.util.List
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    public abstract j2 n(int i, Object obj);

    @Override // defpackage.m1, java.util.List
    public final List subList(int i, int i2) {
        return new j95.a(this, i, i2);
    }
}
