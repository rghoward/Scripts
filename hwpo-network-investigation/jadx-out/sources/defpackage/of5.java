package defpackage;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class of5 extends n2<Integer> implements RandomAccess, l98 {
    public int[] u;
    public int v;

    static {
        new of5(new int[0], 0, false);
    }

    public of5() {
        this(new int[10], 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        d();
        if (i < 0 || i > (i2 = this.v)) {
            cp2.a(this.v, t43.b(i, "Index:", ", Size:"));
            return;
        }
        int[] iArr = this.u;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[vr0.b(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.u, i, iArr2, i + 1, this.v - i);
            this.u = iArr2;
        }
        this.u[i] = iIntValue;
        this.v++;
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.n2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        d();
        Charset charset = xi5.a;
        collection.getClass();
        if (!(collection instanceof of5)) {
            return super.addAll(collection);
        }
        of5 of5Var = (of5) collection;
        int i = of5Var.v;
        if (i == 0) {
            return false;
        }
        int i2 = this.v;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.u;
        if (i3 > iArr.length) {
            this.u = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(of5Var.u, 0, this.u, this.v, of5Var.v);
        this.v = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(int i) {
        d();
        int i2 = this.v;
        int[] iArr = this.u;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[vr0.b(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.u = iArr2;
        }
        int[] iArr3 = this.u;
        int i3 = this.v;
        this.v = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // defpackage.n2, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof of5)) {
            return super.equals(obj);
        }
        of5 of5Var = (of5) obj;
        if (this.v != of5Var.v) {
            return false;
        }
        int[] iArr = of5Var.u;
        for (int i = 0; i < this.v; i++) {
            if (this.u[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i) {
        if (i < 0 || i >= this.v) {
            cp2.a(this.v, t43.b(i, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Integer.valueOf(i(i));
    }

    @Override // xi5.c
    public final xi5.c h(int i) {
        if (i >= this.v) {
            return new of5(Arrays.copyOf(this.u, i), this.v, true);
        }
        zn3.b();
        return null;
    }

    @Override // defpackage.n2, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.v; i2++) {
            i = (i * 31) + this.u[i2];
        }
        return i;
    }

    public final int i(int i) {
        f(i);
        return this.u[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.v;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.u[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.n2, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        d();
        f(i);
        int[] iArr = this.u;
        int i2 = iArr[i];
        int i3 = this.v;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.v--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        d();
        if (i2 < i) {
            r.b("toIndex < fromIndex");
            return;
        }
        int[] iArr = this.u;
        System.arraycopy(iArr, i2, iArr, i, this.v - i2);
        this.v -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        d();
        f(i);
        int[] iArr = this.u;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.v;
    }

    public of5(int[] iArr, int i, boolean z) {
        super(z);
        this.u = iArr;
        this.v = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        e(((Integer) obj).intValue());
        return true;
    }
}
