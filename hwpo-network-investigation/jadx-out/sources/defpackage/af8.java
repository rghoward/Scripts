package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class af8<E> extends n2<E> implements RandomAccess {
    public static final af8<Object> w = new af8<>(new Object[0], 0, false);
    public E[] u;
    public int v;

    public af8(E[] eArr, int i, boolean z) {
        super(z);
        this.u = eArr;
        this.v = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int i2;
        d();
        if (i < 0 || i > (i2 = this.v)) {
            cp2.a(this.v, t43.b(i, "Index:", ", Size:"));
            return;
        }
        E[] eArr = this.u;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = (E[]) new Object[vr0.b(i2, 3, 2, 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.u, i, eArr2, i + 1, this.v - i);
            this.u = eArr2;
        }
        this.u[i] = e;
        this.v++;
        ((AbstractList) this).modCount++;
    }

    public final void e(int i) {
        if (i < 0 || i >= this.v) {
            cp2.a(this.v, t43.b(i, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        e(i);
        return this.u[i];
    }

    @Override // xi5.c
    public final xi5.c h(int i) {
        if (i >= this.v) {
            return new af8(Arrays.copyOf(this.u, i), this.v, true);
        }
        zn3.b();
        return null;
    }

    @Override // defpackage.n2, java.util.AbstractList, java.util.List
    public final E remove(int i) {
        d();
        e(i);
        E[] eArr = this.u;
        E e = eArr[i];
        int i2 = this.v;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.v--;
        ((AbstractList) this).modCount++;
        return e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        d();
        e(i);
        E[] eArr = this.u;
        E e2 = eArr[i];
        eArr[i] = e;
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.v;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        d();
        int i = this.v;
        E[] eArr = this.u;
        if (i == eArr.length) {
            this.u = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.u;
        int i2 = this.v;
        this.v = i2 + 1;
        eArr2[i2] = e;
        ((AbstractList) this).modCount++;
        return true;
    }
}
