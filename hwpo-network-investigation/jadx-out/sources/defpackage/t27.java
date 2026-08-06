package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class t27<E> extends le7<E> {
    public b<E> c;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<T> implements ListIterator<T>, zn5 {
        public final List<T> t;
        public int u;

        public a(int i, List list) {
            this.t = list;
            this.u = i - 1;
        }

        @Override // java.util.ListIterator
        public final void add(T t) {
            int i = this.u + 1;
            this.u = i;
            this.t.add(i, t);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.u < this.t.size() - 1;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.u >= 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final T next() {
            int i = this.u + 1;
            this.u = i;
            return this.t.get(i);
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.u + 1;
        }

        @Override // java.util.ListIterator
        public final T previous() {
            int i = this.u;
            this.u = i - 1;
            return this.t.get(i);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.u;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            this.t.remove(this.u);
            this.u--;
        }

        @Override // java.util.ListIterator
        public final void set(T t) {
            this.t.set(this.u, t);
        }
    }

    public t27(int i) {
        this.a = i == 0 ? me7.a : new Object[i];
    }

    public final void g(Object obj) {
        int i = this.b + 1;
        Object[] objArr = this.a;
        if (objArr.length < i) {
            n(i, objArr);
        }
        Object[] objArr2 = this.a;
        int i2 = this.b;
        objArr2[i2] = obj;
        this.b = i2 + 1;
    }

    public final void h(le7 le7Var) {
        le7Var.getClass();
        if (le7Var.d()) {
            return;
        }
        int i = this.b + le7Var.b;
        Object[] objArr = this.a;
        if (objArr.length < i) {
            n(i, objArr);
        }
        gz3.f(this.b, 0, le7Var.b, le7Var.a, this.a);
        this.b += le7Var.b;
    }

    public final void i(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return;
        }
        int i = this.b;
        int size = list.size() + i;
        Object[] objArr = this.a;
        if (objArr.length < size) {
            n(size, objArr);
        }
        Object[] objArr2 = this.a;
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            objArr2[i2 + i] = list.get(i2);
        }
        this.b = list.size() + this.b;
    }

    public final void j() {
        gz3.m(0, this.b, null, this.a);
        this.b = 0;
    }

    public final boolean k(E e) {
        int iC = c(e);
        if (iC < 0) {
            return false;
        }
        l(iC);
        return true;
    }

    public final E l(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.b)) {
            f(i);
            throw null;
        }
        Object[] objArr = this.a;
        E e = (E) objArr[i];
        if (i != i2 - 1) {
            gz3.f(i, i + 1, i2, objArr, objArr);
        }
        int i3 = this.b - 1;
        this.b = i3;
        objArr[i3] = null;
        return e;
    }

    public final void m(int i, int i2) {
        int i3;
        if (i < 0 || i > (i3 = this.b) || i2 < 0 || i2 > i3) {
            cp2.a(this.b, u43.b("Start (", ") and end (", ") must be in 0..", i, i2));
            return;
        }
        if (i2 < i) {
            throw new IllegalArgumentException("Start (" + i + ") is more than end (" + i2 + ')');
        }
        if (i2 != i) {
            if (i2 < i3) {
                Object[] objArr = this.a;
                gz3.f(i, i2, i3, objArr, objArr);
            }
            int i4 = this.b;
            int i5 = i4 - (i2 - i);
            gz3.m(i5, i4, null, this.a);
            this.b = i5;
        }
    }

    public final void n(int i, Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, (length * 3) / 2)];
        gz3.f(0, 0, length, objArr, objArr2);
        this.a = objArr2;
    }

    public final E o(int i, E e) {
        if (i < 0 || i >= this.b) {
            f(i);
            throw null;
        }
        Object[] objArr = this.a;
        E e2 = (E) objArr[i];
        objArr[i] = e;
        return e2;
    }

    public final void p(int i) {
        StringBuilder sbB = t43.b(i, "Index ", " must be in 0..");
        sbB.append(this.b);
        throw new IndexOutOfBoundsException(sbB.toString());
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b<T> implements List<T>, ao5 {
        public final t27<T> t;

        public b(t27<T> t27Var) {
            this.t = t27Var;
        }

        @Override // java.util.List
        public final void add(int i, T t) {
            int i2;
            t27<T> t27Var = this.t;
            if (i < 0 || i > (i2 = t27Var.b)) {
                t27Var.p(i);
                throw null;
            }
            int i3 = i2 + 1;
            Object[] objArr = t27Var.a;
            if (objArr.length < i3) {
                t27Var.n(i3, objArr);
            }
            Object[] objArr2 = t27Var.a;
            int i4 = t27Var.b;
            if (i != i4) {
                gz3.f(i + 1, i, i4, objArr2, objArr2);
            }
            objArr2[i] = t;
            t27Var.b++;
        }

        @Override // java.util.List
        public final boolean addAll(int i, Collection<? extends T> collection) {
            collection.getClass();
            t27<T> t27Var = this.t;
            if (i < 0 || i > t27Var.b) {
                t27Var.p(i);
                throw null;
            }
            int i2 = 0;
            if (collection.isEmpty()) {
                return false;
            }
            int size = collection.size() + t27Var.b;
            Object[] objArr = t27Var.a;
            if (objArr.length < size) {
                t27Var.n(size, objArr);
            }
            Object[] objArr2 = t27Var.a;
            if (i != t27Var.b) {
                gz3.f(collection.size() + i, i, t27Var.b, objArr2, objArr2);
            }
            for (T t : collection) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    ws0.m();
                    throw null;
                }
                objArr2[i2 + i] = t;
                i2 = i3;
            }
            t27Var.b = collection.size() + t27Var.b;
            return true;
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            this.t.j();
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            return this.t.c(obj) >= 0;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection<? extends Object> collection) {
            collection.getClass();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (this.t.c(it.next()) < 0) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final T get(int i) {
            me7.a(i, this);
            return this.t.b(i);
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            return this.t.c(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.t.d();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator<T> iterator() {
            return new a(0, this);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            t27<T> t27Var = this.t;
            Object[] objArr = t27Var.a;
            int i = t27Var.b;
            if (obj == null) {
                for (int i2 = i - 1; -1 < i2; i2--) {
                    if (objArr[i2] == null) {
                        return i2;
                    }
                }
            } else {
                for (int i3 = i - 1; -1 < i3; i3--) {
                    if (obj.equals(objArr[i3])) {
                        return i3;
                    }
                }
            }
            return -1;
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator() {
            return new a(0, this);
        }

        @Override // java.util.List
        public final T remove(int i) {
            me7.a(i, this);
            return this.t.l(i);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection<? extends Object> collection) {
            collection.getClass();
            t27<T> t27Var = this.t;
            int i = t27Var.b;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                t27Var.k(it.next());
            }
            return i != t27Var.b;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<? extends Object> collection) {
            collection.getClass();
            t27<T> t27Var = this.t;
            int i = t27Var.b;
            Object[] objArr = t27Var.a;
            for (int i2 = i - 1; -1 < i2; i2--) {
                if (!collection.contains(objArr[i2])) {
                    t27Var.l(i2);
                }
            }
            return i != t27Var.b;
        }

        @Override // java.util.List
        public final T set(int i, T t) {
            me7.a(i, this);
            return this.t.o(i, t);
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.t.b;
        }

        @Override // java.util.List
        public final List<T> subList(int i, int i2) {
            me7.b(i, i2, this);
            return new c(i, i2, this);
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            tArr.getClass();
            return (T[]) mh1.c(this, tArr);
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator(int i) {
            return new a(i, this);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return mh1.b(this);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            return this.t.k(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean add(T t) {
            this.t.g(t);
            return true;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends T> collection) {
            collection.getClass();
            t27<T> t27Var = this.t;
            int i = t27Var.b;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                t27Var.g(it.next());
            }
            return i != t27Var.b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c<T> implements List<T>, ao5 {
        public final List<T> t;
        public final int u;
        public int v;

        public c(int i, int i2, List list) {
            this.t = list;
            this.u = i;
            this.v = i2;
        }

        @Override // java.util.List
        public final void add(int i, T t) {
            this.t.add(i + this.u, t);
            this.v++;
        }

        @Override // java.util.List
        public final boolean addAll(int i, Collection<? extends T> collection) {
            collection.getClass();
            this.t.addAll(i + this.u, collection);
            this.v = collection.size() + this.v;
            return collection.size() > 0;
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            int i = this.v - 1;
            int i2 = this.u;
            if (i2 <= i) {
                while (true) {
                    this.t.remove(i);
                    if (i == i2) {
                        break;
                    } else {
                        i--;
                    }
                }
            }
            this.v = i2;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            int i = this.v;
            for (int i2 = this.u; i2 < i; i2++) {
                if (xj5.a(this.t.get(i2), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection<? extends Object> collection) {
            collection.getClass();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final T get(int i) {
            me7.a(i, this);
            return this.t.get(i + this.u);
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            int i = this.v;
            int i2 = this.u;
            for (int i3 = i2; i3 < i; i3++) {
                if (xj5.a(this.t.get(i3), obj)) {
                    return i3 - i2;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.v == this.u;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator<T> iterator() {
            return new a(0, this);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            int i = this.v - 1;
            int i2 = this.u;
            if (i2 > i) {
                return -1;
            }
            while (!xj5.a(this.t.get(i), obj)) {
                if (i == i2) {
                    return -1;
                }
                i--;
            }
            return i - i2;
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator() {
            return new a(0, this);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            int i = this.v;
            for (int i2 = this.u; i2 < i; i2++) {
                List<T> list = this.t;
                if (xj5.a(list.get(i2), obj)) {
                    list.remove(i2);
                    this.v--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection<? extends Object> collection) {
            collection.getClass();
            int i = this.v;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i != this.v;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<? extends Object> collection) {
            collection.getClass();
            int i = this.v;
            int i2 = i - 1;
            int i3 = this.u;
            if (i3 <= i2) {
                while (true) {
                    List<T> list = this.t;
                    if (!collection.contains(list.get(i2))) {
                        list.remove(i2);
                        this.v--;
                    }
                    if (i2 == i3) {
                        break;
                    }
                    i2--;
                }
            }
            return i != this.v;
        }

        @Override // java.util.List
        public final T set(int i, T t) {
            me7.a(i, this);
            return this.t.set(i + this.u, t);
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.v - this.u;
        }

        @Override // java.util.List
        public final List<T> subList(int i, int i2) {
            me7.b(i, i2, this);
            return new c(i, i2, this);
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            tArr.getClass();
            return (T[]) mh1.c(this, tArr);
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator(int i) {
            return new a(i, this);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return mh1.b(this);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean add(T t) {
            int i = this.v;
            this.v = i + 1;
            this.t.add(i, t);
            return true;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends T> collection) {
            collection.getClass();
            this.t.addAll(this.v, collection);
            this.v = collection.size() + this.v;
            return collection.size() > 0;
        }

        @Override // java.util.List
        public final T remove(int i) {
            me7.a(i, this);
            T tRemove = this.t.remove(i + this.u);
            this.v--;
            return tRemove;
        }
    }

    public t27() {
        this((Object) null);
    }

    public /* synthetic */ t27(Object obj) {
        this(16);
    }
}
