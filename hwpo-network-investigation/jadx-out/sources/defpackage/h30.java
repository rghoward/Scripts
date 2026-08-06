package defpackage;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class h30<E> extends d2<E> {
    public static final Object[] w = new Object[0];
    public int t;
    public Object[] u;
    public int v;

    public h30(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = w;
        } else {
            if (i <= 0) {
                z90.a(pp2.a(i, "Illegal Capacity: "));
                throw null;
            }
            objArr = new Object[i];
        }
        this.u = objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int length;
        int i2 = this.v;
        if (i < 0 || i > i2) {
            r.b(u.a(i, i2, "index: ", ", size: "));
            return;
        }
        if (i == i2) {
            addLast(e);
            return;
        }
        if (i == 0) {
            addFirst(e);
            return;
        }
        r();
        i(this.v + 1);
        int iQ = q(this.t + i);
        int i3 = this.v;
        if (i < ((i3 + 1) >> 1)) {
            if (iQ == 0) {
                Object[] objArr = this.u;
                objArr.getClass();
                length = objArr.length - 1;
            } else {
                length = iQ - 1;
            }
            int length2 = this.t;
            if (length2 == 0) {
                Object[] objArr2 = this.u;
                objArr2.getClass();
                length2 = objArr2.length;
            }
            int i4 = length2 - 1;
            int i5 = this.t;
            Object[] objArr3 = this.u;
            if (length >= i5) {
                objArr3[i4] = objArr3[i5];
                gz3.f(i5, i5 + 1, length + 1, objArr3, objArr3);
            } else {
                gz3.f(i5 - 1, i5, objArr3.length, objArr3, objArr3);
                Object[] objArr4 = this.u;
                objArr4[objArr4.length - 1] = objArr4[0];
                gz3.f(0, 1, length + 1, objArr4, objArr4);
            }
            this.u[length] = e;
            this.t = i4;
        } else {
            int iQ2 = q(i3 + this.t);
            Object[] objArr5 = this.u;
            if (iQ < iQ2) {
                gz3.f(iQ + 1, iQ, iQ2, objArr5, objArr5);
            } else {
                gz3.f(1, 0, iQ2, objArr5, objArr5);
                Object[] objArr6 = this.u;
                objArr6[0] = objArr6[objArr6.length - 1];
                gz3.f(iQ + 1, iQ, objArr6.length - 1, objArr6, objArr6);
            }
            this.u[iQ] = e;
        }
        this.v++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        collection.getClass();
        int i2 = this.v;
        if (i < 0 || i > i2) {
            r.b(u.a(i, i2, "index: ", ", size: "));
            return false;
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.v) {
            return addAll(collection);
        }
        r();
        i(collection.size() + this.v);
        int iQ = q(this.v + this.t);
        int iQ2 = q(this.t + i);
        int size = collection.size();
        if (i >= ((this.v + 1) >> 1)) {
            int i3 = iQ2 + size;
            Object[] objArr = this.u;
            if (iQ2 < iQ) {
                int i4 = size + iQ;
                if (i4 <= objArr.length) {
                    gz3.f(i3, iQ2, iQ, objArr, objArr);
                } else if (i3 >= objArr.length) {
                    gz3.f(i3 - objArr.length, iQ2, iQ, objArr, objArr);
                } else {
                    int length = iQ - (i4 - objArr.length);
                    gz3.f(0, length, iQ, objArr, objArr);
                    Object[] objArr2 = this.u;
                    gz3.f(i3, iQ2, length, objArr2, objArr2);
                }
            } else {
                gz3.f(size, 0, iQ, objArr, objArr);
                Object[] objArr3 = this.u;
                if (i3 >= objArr3.length) {
                    gz3.f(i3 - objArr3.length, iQ2, objArr3.length, objArr3, objArr3);
                } else {
                    gz3.f(0, objArr3.length - size, objArr3.length, objArr3, objArr3);
                    Object[] objArr4 = this.u;
                    gz3.f(i3, iQ2, objArr4.length - size, objArr4, objArr4);
                }
            }
            f(iQ2, collection);
            return true;
        }
        int i5 = this.t;
        int length2 = i5 - size;
        Object[] objArr5 = this.u;
        if (iQ2 < i5) {
            gz3.f(length2, i5, objArr5.length, objArr5, objArr5);
            Object[] objArr6 = this.u;
            if (size >= iQ2) {
                gz3.f(objArr6.length - size, 0, iQ2, objArr6, objArr6);
            } else {
                gz3.f(objArr6.length - size, 0, size, objArr6, objArr6);
                Object[] objArr7 = this.u;
                gz3.f(0, size, iQ2, objArr7, objArr7);
            }
        } else if (length2 >= 0) {
            gz3.f(length2, i5, iQ2, objArr5, objArr5);
        } else {
            length2 += objArr5.length;
            int i6 = iQ2 - i5;
            int length3 = objArr5.length - length2;
            if (length3 >= i6) {
                gz3.f(length2, i5, iQ2, objArr5, objArr5);
            } else {
                gz3.f(length2, i5, i5 + length3, objArr5, objArr5);
                Object[] objArr8 = this.u;
                gz3.f(0, this.t + length3, iQ2, objArr8, objArr8);
            }
        }
        this.t = length2;
        f(n(iQ2 - size), collection);
        return true;
    }

    public final void addFirst(E e) {
        r();
        i(this.v + 1);
        int length = this.t;
        if (length == 0) {
            Object[] objArr = this.u;
            objArr.getClass();
            length = objArr.length;
        }
        int i = length - 1;
        this.t = i;
        this.u[i] = e;
        this.v++;
    }

    public final void addLast(E e) {
        r();
        i(d() + 1);
        this.u[q(d() + this.t)] = e;
        this.v = d() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            r();
            p(this.t, q(d() + this.t));
        }
        this.t = 0;
        this.v = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.d2
    public final int d() {
        return this.v;
    }

    @Override // defpackage.d2
    public final E e(int i) {
        int i2 = this.v;
        if (i < 0 || i >= i2) {
            r.b(u.a(i, i2, "index: ", ", size: "));
            return null;
        }
        if (i == d() - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        r();
        int iQ = q(this.t + i);
        Object[] objArr = this.u;
        E e = (E) objArr[iQ];
        int i3 = this.v >> 1;
        int i4 = this.t;
        if (i < i3) {
            if (iQ >= i4) {
                gz3.f(i4 + 1, i4, iQ, objArr, objArr);
            } else {
                gz3.f(1, 0, iQ, objArr, objArr);
                Object[] objArr2 = this.u;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i5 = this.t;
                gz3.f(i5 + 1, i5, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.u;
            int i6 = this.t;
            objArr3[i6] = null;
            this.t = k(i6);
        } else {
            int iQ2 = q((d() - 1) + i4);
            Object[] objArr4 = this.u;
            if (iQ <= iQ2) {
                gz3.f(iQ, iQ + 1, iQ2 + 1, objArr4, objArr4);
            } else {
                gz3.f(iQ, iQ + 1, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.u;
                objArr5[objArr5.length - 1] = objArr5[0];
                gz3.f(0, 1, iQ2 + 1, objArr5, objArr5);
            }
            this.u[iQ2] = null;
        }
        this.v--;
        return e;
    }

    public final void f(int i, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.u.length;
        while (i < length && it.hasNext()) {
            this.u[i] = it.next();
            i++;
        }
        int i2 = this.t;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.u[i3] = it.next();
        }
        this.v = collection.size() + this.v;
    }

    public final E first() {
        if (!isEmpty()) {
            return (E) this.u[this.t];
        }
        px1.b("ArrayDeque is empty.");
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        int iD = d();
        if (i >= 0 && i < iD) {
            return (E) this.u[q(this.t + i)];
        }
        r.b(u.a(i, iD, "index: ", ", size: "));
        return null;
    }

    public final void i(int i) {
        if (i < 0) {
            aa0.c("Deque is too big.");
            return;
        }
        Object[] objArr = this.u;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == w) {
            if (i < 10) {
                i = 10;
            }
            this.u = new Object[i];
            return;
        }
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i2];
        gz3.f(0, this.t, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.u;
        int length2 = objArr3.length;
        int i3 = this.t;
        gz3.f(length2 - i3, 0, i3, objArr3, objArr2);
        this.t = 0;
        this.u = objArr2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iQ = q(d() + this.t);
        int length = this.t;
        if (length < iQ) {
            while (length < iQ) {
                if (xj5.a(obj, this.u[length])) {
                    i = this.t;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (isEmpty() || (length = this.t) < iQ) {
            return -1;
        }
        int length2 = this.u.length;
        while (length < length2) {
            if (xj5.a(obj, this.u[length])) {
                i = this.t;
            } else {
                length++;
            }
        }
        for (int i2 = 0; i2 < iQ; i2++) {
            if (xj5.a(obj, this.u[i2])) {
                length = i2 + this.u.length;
                i = this.t;
            }
        }
        return -1;
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return d() == 0;
    }

    public final E j() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.u[this.t];
    }

    public final int k(int i) {
        Object[] objArr = this.u;
        objArr.getClass();
        if (i == objArr.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final E l() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.u[q((size() - 1) + this.t)];
    }

    public final E last() {
        if (isEmpty()) {
            px1.b("ArrayDeque is empty.");
            return null;
        }
        return (E) this.u[q((size() - 1) + this.t)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr;
        int length;
        int i;
        int iQ = q(this.v + this.t);
        int i2 = this.t;
        if (i2 < iQ) {
            length = iQ - 1;
            if (i2 <= length) {
                while (!xj5.a(obj, this.u[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.t;
                return length - i;
            }
            return -1;
        }
        if (!isEmpty() && this.t >= iQ) {
            do {
                iQ--;
                objArr = this.u;
                if (-1 >= iQ) {
                    objArr.getClass();
                    length = objArr.length - 1;
                    int i3 = this.t;
                    if (i3 <= length) {
                        while (!xj5.a(obj, this.u[length])) {
                            if (length != i3) {
                                length--;
                            }
                        }
                        i = this.t;
                    }
                }
                return length - i;
            } while (!xj5.a(obj, objArr[iQ]));
            length = iQ + this.u.length;
            i = this.t;
            return length - i;
        }
        return -1;
    }

    public final int n(int i) {
        return i < 0 ? i + this.u.length : i;
    }

    public final void p(int i, int i2) {
        Object[] objArr = this.u;
        if (i < i2) {
            gz3.m(i, i2, null, objArr);
        } else {
            gz3.m(i, objArr.length, null, objArr);
            gz3.m(0, i2, null, this.u);
        }
    }

    public final int q(int i) {
        Object[] objArr = this.u;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final void r() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        e(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<?> collection) {
        int iQ;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.u.length != 0) {
            int iQ2 = q(d() + this.t);
            int i = this.t;
            if (i < iQ2) {
                iQ = i;
                while (true) {
                    objArr = this.u;
                    if (i >= iQ2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.u[iQ] = obj;
                        iQ++;
                    }
                    i++;
                }
                gz3.m(iQ, iQ2, null, objArr);
            } else {
                int length = this.u.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.u;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.u[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iQ = q(i2);
                for (int i3 = 0; i3 < iQ2; i3++) {
                    Object[] objArr3 = this.u;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.u[iQ] = obj3;
                        iQ = k(iQ);
                    }
                }
                z = z2;
            }
            if (z) {
                r();
                this.v = n(iQ - this.t);
            }
        }
        return z;
    }

    public final E removeFirst() {
        if (isEmpty()) {
            px1.b("ArrayDeque is empty.");
            return null;
        }
        r();
        Object[] objArr = this.u;
        int i = this.t;
        E e = (E) objArr[i];
        objArr[i] = null;
        this.t = k(i);
        this.v = d() - 1;
        return e;
    }

    public final E removeLast() {
        if (isEmpty()) {
            px1.b("ArrayDeque is empty.");
            return null;
        }
        r();
        int iQ = q((size() - 1) + this.t);
        Object[] objArr = this.u;
        E e = (E) objArr[iQ];
        objArr[iQ] = null;
        this.v = d() - 1;
        return e;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m1.a.a(i, i2, this.v);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.v) {
            clear();
            return;
        }
        if (i3 == 1) {
            e(i);
            return;
        }
        r();
        int i4 = this.v - i2;
        int i5 = this.t;
        if (i < i4) {
            int iQ = q((i - 1) + i5);
            int iQ2 = q(this.t + (i2 - 1));
            while (i > 0) {
                int i6 = iQ + 1;
                int iMin = Math.min(i, Math.min(i6, iQ2 + 1));
                Object[] objArr = this.u;
                int i7 = iQ2 - iMin;
                int i8 = iQ - iMin;
                gz3.f(i7 + 1, i8 + 1, i6, objArr, objArr);
                iQ = n(i8);
                iQ2 = n(i7);
                i -= iMin;
            }
            int iQ3 = q(this.t + i3);
            p(this.t, iQ3);
            this.t = iQ3;
        } else {
            int iQ4 = q(i5 + i2);
            int iQ5 = q(this.t + i);
            int i9 = this.v;
            while (true) {
                i9 -= i2;
                if (i9 <= 0) {
                    break;
                }
                Object[] objArr2 = this.u;
                i2 = Math.min(i9, Math.min(objArr2.length - iQ4, objArr2.length - iQ5));
                Object[] objArr3 = this.u;
                int i10 = iQ4 + i2;
                gz3.f(iQ5, iQ4, i10, objArr3, objArr3);
                iQ4 = q(i10);
                iQ5 = q(iQ5 + i2);
            }
            int iQ6 = q(this.v + this.t);
            p(n(iQ6 - i3), iQ6);
        }
        this.v -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<?> collection) {
        int iQ;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.u.length != 0) {
            int iQ2 = q(d() + this.t);
            int i = this.t;
            if (i < iQ2) {
                iQ = i;
                while (true) {
                    objArr = this.u;
                    if (i >= iQ2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        this.u[iQ] = obj;
                        iQ++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                gz3.m(iQ, iQ2, null, objArr);
            } else {
                int length = this.u.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.u;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.u[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iQ = q(i2);
                for (int i3 = 0; i3 < iQ2; i3++) {
                    Object[] objArr3 = this.u;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.u[iQ] = obj3;
                        iQ = k(iQ);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                r();
                this.v = n(iQ - this.t);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        int iD = d();
        if (i < 0 || i >= iD) {
            r.b(u.a(i, iD, "index: ", ", size: "));
            return null;
        }
        int iQ = q(this.t + i);
        Object[] objArr = this.u;
        E e2 = (E) objArr[iQ];
        objArr[iQ] = e;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        int length = tArr.length;
        int i = this.v;
        if (length < i) {
            Object objNewInstance = Array.newInstance(tArr.getClass().getComponentType(), i);
            objNewInstance.getClass();
            tArr = (T[]) ((Object[]) objNewInstance);
        }
        int iQ = q(this.v + this.t);
        int i2 = this.t;
        if (i2 < iQ) {
            gz3.i(i2, iQ, 2, this.u, tArr);
        } else if (!isEmpty()) {
            Object[] objArr = this.u;
            gz3.f(0, this.t, objArr.length, objArr, tArr);
            Object[] objArr2 = this.u;
            gz3.f(objArr2.length - this.t, 0, iQ, objArr2, tArr);
        }
        int i3 = this.v;
        if (i3 < tArr.length) {
            tArr[i3] = null;
        }
        return tArr;
    }

    public h30() {
        this.u = w;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[d()]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        addLast(e);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        r();
        i(collection.size() + d());
        f(q(d() + this.t), collection);
        return true;
    }
}
