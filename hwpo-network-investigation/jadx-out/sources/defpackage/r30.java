package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class r30<E> implements Collection<E>, Set<E>, ao5, do5 {
    public int[] t;
    public Object[] u;
    public int v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class a extends pa5<E> {
        public a() {
            super(r30.this.v);
        }

        @Override // defpackage.pa5
        public final E a(int i) {
            return (E) r30.this.u[i];
        }

        @Override // defpackage.pa5
        public final void b(int i) {
            r30.this.d(i);
        }
    }

    public r30(int i) {
        this.t = ty1.a;
        this.u = ty1.c;
        if (i > 0) {
            this.t = new int[i];
            this.u = new Object[i];
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(E e) {
        int i;
        int iA;
        int i2 = this.v;
        if (e == null) {
            iA = d.a(this, null, 0);
            i = 0;
        } else {
            int iHashCode = e.hashCode();
            i = iHashCode;
            iA = d.a(this, e, iHashCode);
        }
        if (iA >= 0) {
            return false;
        }
        int i3 = ~iA;
        int[] iArr = this.t;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.u;
            int[] iArr2 = new int[i4];
            this.t = iArr2;
            this.u = new Object[i4];
            if (i2 != this.v) {
                yk.b();
                return false;
            }
            if (iArr2.length != 0) {
                gz3.h(0, iArr.length, 6, iArr, iArr2);
                gz3.i(0, objArr.length, 6, objArr, this.u);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.t;
            int i5 = i3 + 1;
            gz3.e(i5, i3, i2, iArr3, iArr3);
            Object[] objArr2 = this.u;
            gz3.f(i5, i3, i2, objArr2, objArr2);
        }
        int i6 = this.v;
        if (i2 == i6) {
            int[] iArr4 = this.t;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.u[i3] = e;
                this.v = i6 + 1;
                return true;
            }
        }
        yk.b();
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> collection) {
        collection.getClass();
        int size = collection.size() + this.v;
        int i = this.v;
        int[] iArr = this.t;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.u;
            int[] iArr2 = new int[size];
            this.t = iArr2;
            this.u = new Object[size];
            if (i > 0) {
                gz3.h(0, i, 6, iArr, iArr2);
                gz3.i(0, this.v, 6, objArr, this.u);
            }
        }
        if (this.v != i) {
            yk.b();
            return false;
        }
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.v != 0) {
            this.t = ty1.a;
            this.u = ty1.c;
            this.v = 0;
        }
        if (this.v == 0) {
            return;
        }
        yk.b();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? d.a(this, null, 0) : d.a(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<? extends Object> collection) {
        collection.getClass();
        Iterator<? extends Object> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final E d(int i) {
        int i2 = this.v;
        Object[] objArr = this.u;
        E e = (E) objArr[i];
        if (i2 <= 1) {
            clear();
            return e;
        }
        int i3 = i2 - 1;
        int[] iArr = this.t;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                gz3.e(i, i4, i2, iArr, iArr);
                Object[] objArr2 = this.u;
                gz3.f(i, i4, i2, objArr2, objArr2);
            }
            this.u[i3] = null;
        } else {
            int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArr2 = new int[i5];
            this.t = iArr2;
            this.u = new Object[i5];
            if (i > 0) {
                gz3.h(0, i, 6, iArr, iArr2);
                gz3.i(0, i, 6, objArr, this.u);
            }
            if (i < i3) {
                int i6 = i + 1;
                gz3.e(i, i6, i2, iArr, this.t);
                gz3.f(i, i6, i2, objArr, this.u);
            }
        }
        if (i2 == this.v) {
            this.v = i3;
            return e;
        }
        yk.b();
        return null;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.v != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.v;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) obj).contains(this.u[i2])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.t;
        int i = this.v;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.v <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return new a();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iA = obj == null ? d.a(this, null, 0) : d.a(this, obj, obj.hashCode());
        if (iA < 0) {
            return false;
        }
        d(iA);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<? extends Object> collection) {
        collection.getClass();
        Iterator<? extends Object> it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<? extends Object> collection) {
        collection.getClass();
        boolean z = false;
        for (int i = this.v - 1; -1 < i; i--) {
            if (!th1.u(collection, this.u[i])) {
                d(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.v;
    }

    @Override // java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        int i = this.v;
        if (tArr.length < i) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
        } else if (tArr.length > i) {
            tArr[i] = null;
        }
        gz3.f(0, 0, this.v, this.u, tArr);
        return tArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.v * 14);
        sb.append('{');
        int i = this.v;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.u[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return gz3.k(0, this.v, this.u);
    }
}
