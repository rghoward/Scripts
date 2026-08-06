package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class k37<T> implements RandomAccess {
    public T[] t;
    public a u;
    public int v = 0;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c<T> implements ListIterator<T>, zn5 {
        public final List<T> t;
        public int u;

        public c(int i, List list) {
            this.t = list;
            this.u = i;
        }

        @Override // java.util.ListIterator
        public final void add(T t) {
            this.t.add(this.u, t);
            this.u++;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.u < this.t.size();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.u > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final T next() {
            int i = this.u;
            this.u = i + 1;
            return this.t.get(i);
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.u;
        }

        @Override // java.util.ListIterator
        public final T previous() {
            int i = this.u - 1;
            this.u = i;
            return this.t.get(i);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.u - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            int i = this.u - 1;
            this.u = i;
            this.t.remove(i);
        }

        @Override // java.util.ListIterator
        public final void set(T t) {
            this.t.set(this.u, t);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k37(Object[] objArr) {
        this.t = objArr;
    }

    public final void c(int i, T t) {
        int i2 = this.v + 1;
        if (this.t.length < i2) {
            q(i2);
        }
        T[] tArr = this.t;
        int i3 = this.v;
        if (i != i3) {
            System.arraycopy(tArr, i, tArr, i + 1, i3 - i);
        }
        tArr[i] = t;
        this.v++;
    }

    public final void d(Object obj) {
        int i = this.v + 1;
        if (this.t.length < i) {
            q(i);
        }
        Object[] objArr = (T[]) this.t;
        int i2 = this.v;
        objArr[i2] = obj;
        this.v = i2 + 1;
    }

    public final void e(int i, k37 k37Var) {
        int i2 = k37Var.v;
        if (i2 == 0) {
            return;
        }
        int i3 = this.v + i2;
        if (this.t.length < i3) {
            q(i3);
        }
        T[] tArr = this.t;
        int i4 = this.v;
        if (i != i4) {
            System.arraycopy(tArr, i, tArr, i + i2, i4 - i);
        }
        System.arraycopy(k37Var.t, 0, tArr, i, i2);
        this.v += i2;
    }

    public final void f(int i, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i2 = this.v + size;
        if (this.t.length < i2) {
            q(i2);
        }
        Object[] objArr = (T[]) this.t;
        int i3 = this.v;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + size, i3 - i);
        }
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            objArr[i + i4] = list.get(i4);
        }
        this.v += size;
    }

    public final boolean i(int i, Collection<? extends T> collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i3 = this.v + size;
        if (this.t.length < i3) {
            q(i3);
        }
        T[] tArr = this.t;
        int i4 = this.v;
        if (i != i4) {
            System.arraycopy(tArr, i, tArr, i + size, i4 - i);
        }
        for (T t : collection) {
            int i5 = i2 + 1;
            if (i2 < 0) {
                ws0.m();
                throw null;
            }
            tArr[i2 + i] = t;
            i2 = i5;
        }
        this.v += size;
        return true;
    }

    public final List<T> j() {
        a aVar = this.u;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(this);
        this.u = aVar2;
        return aVar2;
    }

    public final void k() {
        T[] tArr = this.t;
        int i = this.v;
        for (int i2 = 0; i2 < i; i2++) {
            tArr[i2] = null;
        }
        this.v = 0;
    }

    public final boolean l(T t) {
        int i = this.v - 1;
        if (i >= 0) {
            for (int i2 = 0; !xj5.a(this.t[i2], t); i2++) {
                if (i2 != i) {
                }
            }
            return true;
        }
        return false;
    }

    public final int m(T t) {
        T[] tArr = this.t;
        int i = this.v;
        for (int i2 = 0; i2 < i; i2++) {
            if (xj5.a(t, tArr[i2])) {
                return i2;
            }
        }
        return -1;
    }

    public final boolean n(T t) {
        int iM = m(t);
        if (iM < 0) {
            return false;
        }
        o(iM);
        return true;
    }

    public final T o(int i) {
        T[] tArr = this.t;
        T t = tArr[i];
        int i2 = this.v;
        if (i != i2 - 1) {
            int i3 = i + 1;
            System.arraycopy(tArr, i3, tArr, i, i2 - i3);
        }
        int i4 = this.v - 1;
        this.v = i4;
        tArr[i4] = null;
        return t;
    }

    public final void p(int i, int i2) {
        if (i2 > i) {
            int i3 = this.v;
            if (i2 < i3) {
                T[] tArr = this.t;
                System.arraycopy(tArr, i2, tArr, i, i3 - i2);
            }
            int i4 = this.v;
            int i5 = i4 - (i2 - i);
            int i6 = i4 - 1;
            if (i5 <= i6) {
                int i7 = i5;
                while (true) {
                    this.t[i7] = null;
                    if (i7 == i6) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.v = i5;
        }
    }

    public final void q(int i) {
        T[] tArr = this.t;
        int length = tArr.length;
        T[] tArr2 = (T[]) new Object[Math.max(i, length * 2)];
        System.arraycopy(tArr, 0, tArr2, 0, length);
        this.t = tArr2;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<T> implements List<T>, ao5 {
        public final k37<T> t;

        public a(k37<T> k37Var) {
            this.t = k37Var;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean add(T t) {
            this.t.d(t);
            return true;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends T> collection) {
            k37<T> k37Var = this.t;
            return k37Var.i(k37Var.v, collection);
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            this.t.k();
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            return this.t.l(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!this.t.l(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final T get(int i) {
            l37.a(i, this);
            return this.t.t[i];
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            return this.t.m(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.t.v == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator<T> iterator() {
            return new c(0, this);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            k37<T> k37Var = this.t;
            T[] tArr = k37Var.t;
            for (int i = k37Var.v - 1; i >= 0; i--) {
                if (xj5.a(obj, tArr[i])) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator() {
            return new c(0, this);
        }

        @Override // java.util.List
        public final T remove(int i) {
            l37.a(i, this);
            return this.t.o(i);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            k37<T> k37Var = this.t;
            int i = k37Var.v;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                k37Var.n(it.next());
            }
            return i != k37Var.v;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            k37<T> k37Var = this.t;
            int i = k37Var.v;
            for (int i2 = i - 1; -1 < i2; i2--) {
                if (!collection.contains(k37Var.t[i2])) {
                    k37Var.o(i2);
                }
            }
            return i != k37Var.v;
        }

        @Override // java.util.List
        public final T set(int i, T t) {
            l37.a(i, this);
            T[] tArr = this.t.t;
            T t2 = tArr[i];
            tArr[i] = t;
            return t2;
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.t.v;
        }

        @Override // java.util.List
        public final List<T> subList(int i, int i2) {
            l37.b(i, i2, this);
            return new b(i, i2, this);
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
        public final void add(int i, T t) {
            this.t.c(i, t);
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator(int i) {
            return new c(i, this);
        }

        @Override // java.util.List
        public final boolean addAll(int i, Collection<? extends T> collection) {
            return this.t.i(i, collection);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            return this.t.n(obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b<T> implements List<T>, ao5 {
        public final List<T> t;
        public final int u;
        public int v;

        public b(int i, int i2, List list) {
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
            this.t.addAll(i + this.u, collection);
            int size = collection.size();
            this.v += size;
            return size > 0;
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
        public final boolean containsAll(Collection<?> collection) {
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
            l37.a(i, this);
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
            return new c(0, this);
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
            return new c(0, this);
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
        public final boolean removeAll(Collection<?> collection) {
            int i = this.v;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i != this.v;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
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
            l37.a(i, this);
            return this.t.set(i + this.u, t);
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.v - this.u;
        }

        @Override // java.util.List
        public final List<T> subList(int i, int i2) {
            l37.b(i, i2, this);
            return new b(i, i2, this);
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
        public final ListIterator<T> listIterator(int i) {
            return new c(i, this);
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
            this.t.addAll(this.v, collection);
            int size = collection.size();
            this.v += size;
            return size > 0;
        }

        @Override // java.util.List
        public final T remove(int i) {
            l37.a(i, this);
            T tRemove = this.t.remove(i + this.u);
            this.v--;
            return tRemove;
        }
    }
}
