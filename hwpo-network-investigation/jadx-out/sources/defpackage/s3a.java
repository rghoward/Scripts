package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class s3a<T> implements List<T>, ao5 {
    public final fv9<T> t;
    public final int u;
    public int v;
    public int w;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements ListIterator<T>, zn5 {
        public final /* synthetic */ el8 t;
        public final /* synthetic */ s3a<T> u;

        public a(el8 el8Var, s3a<T> s3aVar) {
            this.t = el8Var;
            this.u = s3aVar;
        }

        @Override // java.util.ListIterator
        public final void add(Object obj) {
            throw new IllegalStateException("Cannot modify a state list through an iterator");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.t.t < this.u.w - 1;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.t.t >= 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final T next() {
            el8 el8Var = this.t;
            int i = el8Var.t + 1;
            s3a<T> s3aVar = this.u;
            gv9.a(i, s3aVar.w);
            el8Var.t = i;
            return s3aVar.get(i);
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.t.t + 1;
        }

        @Override // java.util.ListIterator
        public final T previous() {
            el8 el8Var = this.t;
            int i = el8Var.t;
            s3a<T> s3aVar = this.u;
            gv9.a(i, s3aVar.w);
            el8Var.t = i - 1;
            return s3aVar.get(i);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.t.t;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new IllegalStateException("Cannot modify a state list through an iterator");
        }

        @Override // java.util.ListIterator
        public final void set(Object obj) {
            throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public s3a(fv9<T> fv9Var, int i, int i2) {
        this.t = fv9Var;
        this.u = i;
        this.v = gv9.d(fv9Var);
        this.w = i2 - i;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t) {
        d();
        int i = this.u + this.w;
        fv9<T> fv9Var = this.t;
        fv9Var.add(i, t);
        this.w++;
        this.v = gv9.d(fv9Var);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends T> collection) {
        d();
        int i2 = i + this.u;
        fv9<T> fv9Var = this.t;
        boolean zAddAll = fv9Var.addAll(i2, collection);
        if (zAddAll) {
            this.w = collection.size() + this.w;
            this.v = gv9.d(fv9Var);
        }
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.w > 0) {
            d();
            int i = this.w;
            int i2 = this.u;
            fv9<T> fv9Var = this.t;
            fv9Var.j(i2, i + i2);
            this.w = 0;
            this.v = gv9.d(fv9Var);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
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

    public final void d() {
        if (gv9.d(this.t) == this.v) {
            return;
        }
        yk.b();
    }

    @Override // java.util.List
    public final T get(int i) {
        d();
        gv9.a(i, this.w);
        return this.t.get(this.u + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        d();
        int i = this.w;
        int i2 = this.u;
        Iterator<Integer> it = uh8.j(i2, i + i2).iterator();
        while (((eg5) it).v) {
            int iNextInt = ((tf5) it).nextInt();
            if (xj5.a(obj, this.t.get(iNextInt))) {
                return iNextInt - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.w == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        d();
        int i = this.w;
        int i2 = this.u;
        for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
            if (xj5.a(obj, this.t.get(i3))) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator(int i) {
        d();
        el8 el8Var = new el8();
        el8Var.t = i - 1;
        return new a(el8Var, this);
    }

    @Override // java.util.List
    public final T remove(int i) {
        d();
        int i2 = this.u + i;
        fv9<T> fv9Var = this.t;
        T tRemove = fv9Var.remove(i2);
        this.w--;
        this.v = gv9.d(fv9Var);
        return tRemove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        int i;
        j2 j2Var;
        hu9 hu9VarJ;
        boolean zB;
        d();
        fv9<T> fv9Var = this.t;
        int i2 = this.u;
        int i3 = this.w + i2;
        int size = fv9Var.size();
        do {
            synchronized (gv9.a) {
                k0a k0aVar = fv9Var.t;
                k0aVar.getClass();
                k0a k0aVar2 = (k0a) qu9.h(k0aVar);
                i = k0aVar2.d;
                j2Var = k0aVar2.c;
                g2b g2bVar = g2b.a;
            }
            j2Var.getClass();
            lx7 lx7VarJ = j2Var.j();
            lx7VarJ.subList(i2, i3).retainAll(collection);
            j2 j2VarF = lx7VarJ.f();
            if (xj5.a(j2VarF, j2Var)) {
                break;
            }
            k0a k0aVar3 = fv9Var.t;
            k0aVar3.getClass();
            synchronized (qu9.c) {
                hu9VarJ = qu9.j();
                zB = gv9.b((k0a) qu9.w(k0aVar3, fv9Var, hu9VarJ), i, j2VarF, true);
            }
            qu9.n(hu9VarJ, fv9Var);
        } while (!zB);
        int size2 = size - fv9Var.size();
        if (size2 > 0) {
            this.v = gv9.d(this.t);
            this.w -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final T set(int i, T t) {
        gv9.a(i, this.w);
        d();
        int i2 = i + this.u;
        fv9<T> fv9Var = this.t;
        T t2 = fv9Var.set(i2, t);
        this.v = gv9.d(fv9Var);
        return t2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.w;
    }

    @Override // java.util.List
    public final List<T> subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.w) {
            c78.a("fromIndex or toIndex are out of bounds");
        }
        d();
        int i3 = this.u;
        return new s3a(this.t, i + i3, i2 + i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return mh1.b(this);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) mh1.c(this, tArr);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List
    public final void add(int i, T t) {
        d();
        int i2 = this.u + i;
        fv9<T> fv9Var = this.t;
        fv9Var.add(i2, t);
        this.w++;
        this.v = gv9.d(fv9Var);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        return addAll(this.w, collection);
    }
}
