package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class k0c extends g0c implements RandomAccess, p3c {
    public static final boolean[] w;
    public boolean[] u;
    public int v;

    static {
        boolean[] zArr = new boolean[0];
        w = zArr;
        new k0c(zArr, 0, false);
    }

    public k0c() {
        this(w, 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        d();
        if (i < 0 || i > (i2 = this.v)) {
            r.b(i0c.a(this.v, i, (byte) 13, "Index:", ", Size:"));
            return;
        }
        int i3 = i + 1;
        boolean[] zArr = this.u;
        int length = zArr.length;
        if (i2 < length) {
            System.arraycopy(zArr, i, zArr, i3, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[rh.a(length, 3, 2, 1, 10)];
            System.arraycopy(this.u, 0, zArr2, 0, i);
            System.arraycopy(this.u, i, zArr2, i3, this.v - i);
            this.u = zArr2;
        }
        this.u[i] = zBooleanValue;
        this.v++;
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.g0c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        d();
        collection.getClass();
        if (!(collection instanceof k0c)) {
            return super.addAll(collection);
        }
        k0c k0cVar = (k0c) collection;
        int i = k0cVar.v;
        if (i == 0) {
            return false;
        }
        int i2 = this.v;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.u;
        if (i3 > zArr.length) {
            this.u = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(k0cVar.u, 0, this.u, this.v, k0cVar.v);
        this.v = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(boolean z) {
        d();
        int i = this.v;
        int length = this.u.length;
        if (i == length) {
            boolean[] zArr = new boolean[rh.a(length, 3, 2, 1, 10)];
            System.arraycopy(this.u, 0, zArr, 0, this.v);
            this.u = zArr;
        }
        boolean[] zArr2 = this.u;
        int i2 = this.v;
        this.v = i2 + 1;
        zArr2[i2] = z;
    }

    @Override // defpackage.g0c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0c)) {
            return super.equals(obj);
        }
        k0c k0cVar = (k0c) obj;
        if (this.v != k0cVar.v) {
            return false;
        }
        boolean[] zArr = k0cVar.u;
        for (int i = 0; i < this.v; i++) {
            if (this.u[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i) {
        if (i < 0 || i >= this.v) {
            r.b(i0c.a(this.v, i, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        f(i);
        return Boolean.valueOf(this.u[i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.v; i2++) {
            int i3 = i * 31;
            boolean z = this.u[i2];
            byte[] bArr = g2c.a;
            i = i3 + (z ? 1231 : 1237);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i = this.v;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.u[i2] == zBooleanValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.i2c
    public final i2c p0(int i) {
        if (i >= this.v) {
            return new k0c(i == 0 ? w : Arrays.copyOf(this.u, i), this.v, true);
        }
        zn3.b();
        return null;
    }

    @Override // defpackage.g0c, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        d();
        f(i);
        boolean[] zArr = this.u;
        boolean z = zArr[i];
        int i2 = this.v;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.v--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        d();
        if (i2 < i) {
            r.b("toIndex < fromIndex");
            return;
        }
        boolean[] zArr = this.u;
        System.arraycopy(zArr, i2, zArr, i, this.v - i2);
        this.v -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        d();
        f(i);
        boolean[] zArr = this.u;
        boolean z = zArr[i];
        zArr[i] = zBooleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.v;
    }

    public k0c(boolean[] zArr, int i, boolean z) {
        super(z);
        this.u = zArr;
        this.v = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Boolean) obj).booleanValue());
        return true;
    }
}
