package defpackage;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ge6 extends n2<Long> implements RandomAccess, l98 {
    public long[] u;
    public int v;

    static {
        new ge6(new long[0], 0, false);
    }

    public ge6() {
        this(new long[10], 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        long jLongValue = ((Long) obj).longValue();
        d();
        if (i < 0 || i > (i2 = this.v)) {
            cp2.a(this.v, t43.b(i, "Index:", ", Size:"));
            return;
        }
        long[] jArr = this.u;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[vr0.b(i2, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.u, i, jArr2, i + 1, this.v - i);
            this.u = jArr2;
        }
        this.u[i] = jLongValue;
        this.v++;
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.n2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        d();
        Charset charset = xi5.a;
        collection.getClass();
        if (!(collection instanceof ge6)) {
            return super.addAll(collection);
        }
        ge6 ge6Var = (ge6) collection;
        int i = ge6Var.v;
        if (i == 0) {
            return false;
        }
        int i2 = this.v;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.u;
        if (i3 > jArr.length) {
            this.u = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(ge6Var.u, 0, this.u, this.v, ge6Var.v);
        this.v = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(long j) {
        d();
        int i = this.v;
        long[] jArr = this.u;
        if (i == jArr.length) {
            long[] jArr2 = new long[vr0.b(i, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.u = jArr2;
        }
        long[] jArr3 = this.u;
        int i2 = this.v;
        this.v = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // defpackage.n2, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ge6)) {
            return super.equals(obj);
        }
        ge6 ge6Var = (ge6) obj;
        if (this.v != ge6Var.v) {
            return false;
        }
        long[] jArr = ge6Var.u;
        for (int i = 0; i < this.v; i++) {
            if (this.u[i] != jArr[i]) {
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
        return Long.valueOf(i(i));
    }

    @Override // xi5.c
    public final xi5.c h(int i) {
        if (i >= this.v) {
            return new ge6(Arrays.copyOf(this.u, i), this.v, true);
        }
        zn3.b();
        return null;
    }

    @Override // defpackage.n2, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iB = 1;
        for (int i = 0; i < this.v; i++) {
            iB = (iB * 31) + xi5.b(this.u[i]);
        }
        return iB;
    }

    public final long i(int i) {
        f(i);
        return this.u[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i = this.v;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.u[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.n2, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        d();
        f(i);
        long[] jArr = this.u;
        long j = jArr[i];
        int i2 = this.v;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.v--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        d();
        if (i2 < i) {
            r.b("toIndex < fromIndex");
            return;
        }
        long[] jArr = this.u;
        System.arraycopy(jArr, i2, jArr, i, this.v - i2);
        this.v -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        d();
        f(i);
        long[] jArr = this.u;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.v;
    }

    public ge6(long[] jArr, int i, boolean z) {
        super(z);
        this.u = jArr;
        this.v = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        e(((Long) obj).longValue());
        return true;
    }
}
