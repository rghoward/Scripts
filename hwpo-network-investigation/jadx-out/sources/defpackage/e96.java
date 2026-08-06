package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class e96<E> extends d2<E> implements RandomAccess, Serializable {
    public static final e96 w;
    public E[] t;
    public int u;
    public boolean v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b<E> implements ListIterator<E>, zn5 {
        public final e96<E> t;
        public int u;
        public int v = -1;
        public int w;

        public b(e96<E> e96Var, int i) {
            this.t = e96Var;
            this.u = i;
            this.w = ((AbstractList) e96Var).modCount;
        }

        public final void a() {
            if (((AbstractList) this.t).modCount == this.w) {
                return;
            }
            yk.b();
        }

        @Override // java.util.ListIterator
        public final void add(E e) {
            a();
            int i = this.u;
            this.u = i + 1;
            e96<E> e96Var = this.t;
            e96Var.add(i, e);
            this.v = -1;
            this.w = ((AbstractList) e96Var).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.u < this.t.u;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.u > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final E next() {
            a();
            int i = this.u;
            e96<E> e96Var = this.t;
            if (i >= e96Var.u) {
                vl.b();
                return null;
            }
            this.u = i + 1;
            this.v = i;
            return e96Var.t[i];
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.u;
        }

        @Override // java.util.ListIterator
        public final E previous() {
            a();
            int i = this.u;
            if (i <= 0) {
                vl.b();
                return null;
            }
            int i2 = i - 1;
            this.u = i2;
            this.v = i2;
            return this.t.t[i2];
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.u - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            a();
            int i = this.v;
            if (i == -1) {
                aa0.c("Call next() or previous() before removing element from the iterator.");
                return;
            }
            e96<E> e96Var = this.t;
            e96Var.e(i);
            this.u = this.v;
            this.v = -1;
            this.w = ((AbstractList) e96Var).modCount;
        }

        @Override // java.util.ListIterator
        public final void set(E e) {
            a();
            int i = this.v;
            if (i != -1) {
                this.t.set(i, e);
            } else {
                aa0.c("Call next() or previous() before replacing element from the iterator.");
            }
        }
    }

    static {
        e96 e96Var = new e96(0);
        e96Var.v = true;
        w = e96Var;
    }

    public e96(int i) {
        if (i >= 0) {
            this.t = (E[]) new Object[i];
        } else {
            z90.a("capacity must be non-negative.");
            throw null;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        k();
        int i2 = this.u;
        if (i < 0 || i > i2) {
            r.b(u.a(i, i2, "index: ", ", size: "));
            return;
        }
        ((AbstractList) this).modCount++;
        l(i, 1);
        this.t[i] = e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        collection.getClass();
        k();
        int i2 = this.u;
        if (i < 0 || i > i2) {
            r.b(u.a(i, i2, "index: ", ", size: "));
            return false;
        }
        int size = collection.size();
        i(i, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        k();
        p(0, this.u);
    }

    @Override // defpackage.d2
    public final int d() {
        return this.u;
    }

    @Override // defpackage.d2
    public final E e(int i) {
        k();
        int i2 = this.u;
        if (i >= 0 && i < i2) {
            return n(i);
        }
        r.b(u.a(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            E[] eArr = this.t;
            int i = this.u;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (xj5.a(eArr[i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        int i2 = this.u;
        if (i >= 0 && i < i2) {
            return this.t[i];
        }
        r.b(u.a(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        E[] eArr = this.t;
        int i = this.u;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            E e = eArr[i2];
            iHashCode = (iHashCode * 31) + (e != null ? e.hashCode() : 0);
        }
        return iHashCode;
    }

    public final void i(int i, Collection<? extends E> collection, int i2) {
        ((AbstractList) this).modCount++;
        l(i, i2);
        Iterator<? extends E> it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.t[i + i3] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.u; i++) {
            if (xj5.a(this.t[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.u == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    public final void j(int i, E e) {
        ((AbstractList) this).modCount++;
        l(i, 1);
        this.t[i] = e;
    }

    public final void k() {
        if (this.v) {
            e44.b();
        }
    }

    public final void l(int i, int i2) {
        int i3 = this.u + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        E[] eArr = this.t;
        if (i3 > eArr.length) {
            int length = eArr.length;
            int i4 = length + (length >> 1);
            if (i4 - i3 < 0) {
                i4 = i3;
            }
            if (i4 - 2147483639 > 0) {
                i4 = i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.t = (E[]) Arrays.copyOf(eArr, i4);
        }
        E[] eArr2 = this.t;
        gz3.f(i + i2, i, this.u, eArr2, eArr2);
        this.u += i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.u - 1; i >= 0; i--) {
            if (xj5.a(this.t[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator(int i) {
        int i2 = this.u;
        if (i >= 0 && i <= i2) {
            return new b(this, i);
        }
        r.b(u.a(i, i2, "index: ", ", size: "));
        return null;
    }

    public final E n(int i) {
        ((AbstractList) this).modCount++;
        E[] eArr = this.t;
        E e = eArr[i];
        gz3.f(i, i + 1, this.u, eArr, eArr);
        E[] eArr2 = this.t;
        int i2 = this.u - 1;
        eArr2.getClass();
        eArr2[i2] = null;
        this.u--;
        return e;
    }

    public final void p(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        E[] eArr = this.t;
        gz3.f(i, i + i2, this.u, eArr, eArr);
        E[] eArr2 = this.t;
        int i3 = this.u;
        s.c(i3 - i2, i3, eArr2);
        this.u -= i2;
    }

    public final int q(int i, int i2, Collection<? extends E> collection, boolean z) {
        E[] eArr;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            eArr = this.t;
            if (i3 >= i2) {
                break;
            }
            int i5 = i + i3;
            if (collection.contains(eArr[i5]) == z) {
                E[] eArr2 = this.t;
                i3++;
                eArr2[i4 + i] = eArr2[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        gz3.f(i + i4, i2 + i, this.u, eArr, eArr);
        E[] eArr3 = this.t;
        int i7 = this.u;
        s.c(i7 - i6, i7, eArr3);
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.u -= i6;
        return i6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        k();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            e(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<?> collection) {
        collection.getClass();
        k();
        return q(0, this.u, collection, false) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<?> collection) {
        collection.getClass();
        k();
        return q(0, this.u, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        k();
        int i2 = this.u;
        if (i < 0 || i >= i2) {
            r.b(u.a(i, i2, "index: ", ", size: "));
            return null;
        }
        E[] eArr = this.t;
        E e2 = eArr[i];
        eArr[i] = e;
        return e2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List<E> subList(int i, int i2) {
        m1.a.a(i, i2, this.u);
        return new a(this.t, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        int length = tArr.length;
        int i = this.u;
        E[] eArr = this.t;
        if (length < i) {
            T[] tArr2 = (T[]) Arrays.copyOfRange(eArr, 0, i, tArr.getClass());
            tArr2.getClass();
            return tArr2;
        }
        gz3.f(0, 0, i, eArr, tArr);
        int i2 = this.u;
        if (i2 < tArr.length) {
            tArr[i2] = null;
        }
        return tArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return s.a(this.t, 0, this.u, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<E> extends d2<E> implements RandomAccess, Serializable {
        public E[] t;
        public final int u;
        public int v;
        public final a<E> w;
        public final e96<E> x;

        /* JADX INFO: renamed from: e96$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class C0079a<E> implements ListIterator<E>, zn5 {
            public final a<E> t;
            public int u;
            public int v = -1;
            public int w;

            public C0079a(a<E> aVar, int i) {
                this.t = aVar;
                this.u = i;
                this.w = ((AbstractList) aVar).modCount;
            }

            public final void a() {
                if (((AbstractList) this.t.x).modCount == this.w) {
                    return;
                }
                yk.b();
            }

            @Override // java.util.ListIterator
            public final void add(E e) {
                a();
                int i = this.u;
                this.u = i + 1;
                a<E> aVar = this.t;
                aVar.add(i, e);
                this.v = -1;
                this.w = ((AbstractList) aVar).modCount;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final boolean hasNext() {
                return this.u < this.t.v;
            }

            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return this.u > 0;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final E next() {
                a();
                int i = this.u;
                a<E> aVar = this.t;
                if (i >= aVar.v) {
                    vl.b();
                    return null;
                }
                this.u = i + 1;
                this.v = i;
                return aVar.t[aVar.u + i];
            }

            @Override // java.util.ListIterator
            public final int nextIndex() {
                return this.u;
            }

            @Override // java.util.ListIterator
            public final E previous() {
                a();
                int i = this.u;
                if (i <= 0) {
                    vl.b();
                    return null;
                }
                int i2 = i - 1;
                this.u = i2;
                this.v = i2;
                a<E> aVar = this.t;
                return aVar.t[aVar.u + i2];
            }

            @Override // java.util.ListIterator
            public final int previousIndex() {
                return this.u - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final void remove() {
                a();
                int i = this.v;
                if (i == -1) {
                    aa0.c("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                a<E> aVar = this.t;
                aVar.e(i);
                this.u = this.v;
                this.v = -1;
                this.w = ((AbstractList) aVar).modCount;
            }

            @Override // java.util.ListIterator
            public final void set(E e) {
                a();
                int i = this.v;
                if (i != -1) {
                    this.t.set(i, e);
                } else {
                    aa0.c("Call next() or previous() before replacing element from the iterator.");
                }
            }
        }

        public a(E[] eArr, int i, int i2, a<E> aVar, e96<E> e96Var) {
            eArr.getClass();
            e96Var.getClass();
            this.t = eArr;
            this.u = i;
            this.v = i2;
            this.w = aVar;
            this.x = e96Var;
            ((AbstractList) this).modCount = ((AbstractList) e96Var).modCount;
        }

        @Override // java.util.AbstractList, java.util.List
        public final void add(int i, E e) {
            l();
            k();
            int i2 = this.v;
            if (i < 0 || i > i2) {
                r.b(u.a(i, i2, "index: ", ", size: "));
            } else {
                j(this.u + i, e);
            }
        }

        @Override // java.util.AbstractList, java.util.List
        public final boolean addAll(int i, Collection<? extends E> collection) {
            collection.getClass();
            l();
            k();
            int i2 = this.v;
            if (i < 0 || i > i2) {
                r.b(u.a(i, i2, "index: ", ", size: "));
                return false;
            }
            int size = collection.size();
            i(this.u + i, collection, size);
            return size > 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final void clear() {
            l();
            k();
            p(this.u, this.v);
        }

        @Override // defpackage.d2
        public final int d() {
            k();
            return this.v;
        }

        @Override // defpackage.d2
        public final E e(int i) {
            l();
            k();
            int i2 = this.v;
            if (i >= 0 && i < i2) {
                return n(this.u + i);
            }
            r.b(u.a(i, i2, "index: ", ", size: "));
            return null;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(Object obj) {
            k();
            if (obj == this) {
                return true;
            }
            if (obj instanceof List) {
                List list = (List) obj;
                E[] eArr = this.t;
                int i = this.v;
                if (i == list.size()) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (xj5.a(eArr[this.u + i2], list.get(i2))) {
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public final E get(int i) {
            k();
            int i2 = this.v;
            if (i >= 0 && i < i2) {
                return this.t[this.u + i];
            }
            r.b(u.a(i, i2, "index: ", ", size: "));
            return null;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            k();
            E[] eArr = this.t;
            int i = this.v;
            int iHashCode = 1;
            for (int i2 = 0; i2 < i; i2++) {
                E e = eArr[this.u + i2];
                iHashCode = (iHashCode * 31) + (e != null ? e.hashCode() : 0);
            }
            return iHashCode;
        }

        public final void i(int i, Collection<? extends E> collection, int i2) {
            ((AbstractList) this).modCount++;
            e96<E> e96Var = this.x;
            a<E> aVar = this.w;
            if (aVar != null) {
                aVar.i(i, collection, i2);
            } else {
                e96 e96Var2 = e96.w;
                e96Var.i(i, collection, i2);
            }
            this.t = e96Var.t;
            this.v += i2;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            k();
            for (int i = 0; i < this.v; i++) {
                if (xj5.a(this.t[this.u + i], obj)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            k();
            return this.v == 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public final Iterator<E> iterator() {
            return listIterator(0);
        }

        public final void j(int i, E e) {
            ((AbstractList) this).modCount++;
            e96<E> e96Var = this.x;
            a<E> aVar = this.w;
            if (aVar != null) {
                aVar.j(i, e);
            } else {
                e96 e96Var2 = e96.w;
                e96Var.j(i, e);
            }
            this.t = e96Var.t;
            this.v++;
        }

        public final void k() {
            if (((AbstractList) this.x).modCount == ((AbstractList) this).modCount) {
                return;
            }
            yk.b();
        }

        public final void l() {
            if (this.x.v) {
                e44.b();
            }
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(Object obj) {
            k();
            for (int i = this.v - 1; i >= 0; i--) {
                if (xj5.a(this.t[this.u + i], obj)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final ListIterator<E> listIterator(int i) {
            k();
            int i2 = this.v;
            if (i >= 0 && i <= i2) {
                return new C0079a(this, i);
            }
            r.b(u.a(i, i2, "index: ", ", size: "));
            return null;
        }

        public final E n(int i) {
            E eN;
            ((AbstractList) this).modCount++;
            a<E> aVar = this.w;
            if (aVar != null) {
                eN = aVar.n(i);
            } else {
                e96 e96Var = e96.w;
                eN = this.x.n(i);
            }
            this.v--;
            return eN;
        }

        public final void p(int i, int i2) {
            if (i2 > 0) {
                ((AbstractList) this).modCount++;
            }
            a<E> aVar = this.w;
            if (aVar != null) {
                aVar.p(i, i2);
            } else {
                e96 e96Var = e96.w;
                this.x.p(i, i2);
            }
            this.v -= i2;
        }

        public final int q(int i, int i2, Collection<? extends E> collection, boolean z) {
            int iQ;
            a<E> aVar = this.w;
            if (aVar != null) {
                iQ = aVar.q(i, i2, collection, z);
            } else {
                e96 e96Var = e96.w;
                iQ = this.x.q(i, i2, collection, z);
            }
            if (iQ > 0) {
                ((AbstractList) this).modCount++;
            }
            this.v -= iQ;
            return iQ;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean remove(Object obj) {
            l();
            k();
            int iIndexOf = indexOf(obj);
            if (iIndexOf >= 0) {
                e(iIndexOf);
            }
            return iIndexOf >= 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean removeAll(Collection<?> collection) {
            collection.getClass();
            l();
            k();
            return q(this.u, this.v, collection, false) > 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean retainAll(Collection<?> collection) {
            collection.getClass();
            l();
            k();
            return q(this.u, this.v, collection, true) > 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public final E set(int i, E e) {
            l();
            k();
            int i2 = this.v;
            if (i < 0 || i >= i2) {
                r.b(u.a(i, i2, "index: ", ", size: "));
                return null;
            }
            E[] eArr = this.t;
            int i3 = this.u;
            E e2 = eArr[i3 + i];
            eArr[i3 + i] = e;
            return e2;
        }

        @Override // java.util.AbstractList, java.util.List
        public final List<E> subList(int i, int i2) {
            m1.a.a(i, i2, this.v);
            return new a(this.t, this.u + i, i2 - i, this, this.x);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final <T> T[] toArray(T[] tArr) {
            tArr.getClass();
            k();
            int length = tArr.length;
            int i = this.v;
            E[] eArr = this.t;
            int i2 = this.u;
            if (length < i) {
                T[] tArr2 = (T[]) Arrays.copyOfRange(eArr, i2, i + i2, tArr.getClass());
                tArr2.getClass();
                return tArr2;
            }
            gz3.f(0, i2, i + i2, eArr, tArr);
            int i3 = this.v;
            if (i3 < tArr.length) {
                tArr[i3] = null;
            }
            return tArr;
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            k();
            return s.a(this.t, this.u, this.v, this);
        }

        @Override // java.util.AbstractList, java.util.List
        public final ListIterator<E> listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean add(E e) {
            l();
            k();
            j(this.u + this.v, e);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final Object[] toArray() {
            k();
            E[] eArr = this.t;
            int i = this.v;
            int i2 = this.u;
            return gz3.k(i2, i + i2, eArr);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean addAll(Collection<? extends E> collection) {
            collection.getClass();
            l();
            k();
            int size = collection.size();
            i(this.u + this.v, collection, size);
            return size > 0;
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        k();
        int i = this.u;
        ((AbstractList) this).modCount++;
        l(i, 1);
        this.t[i] = e;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return gz3.k(0, this.u, this.t);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        collection.getClass();
        k();
        int size = collection.size();
        i(this.u, collection, size);
        return size > 0;
    }
}
