package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class v1c extends g0c implements RandomAccess, d2c, p3c {
    public static final int[] w;
    public static final v1c x;
    public int[] u;
    public int v;

    static {
        int[] iArr = new int[0];
        w = iArr;
        x = new v1c(iArr, 0, false);
    }

    public v1c() {
        this(w, 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        d();
        if (i < 0 || i > (i2 = this.v)) {
            r.b(i0c.a(this.v, i, (byte) 13, "Index:", ", Size:"));
            return;
        }
        int i3 = i + 1;
        int[] iArr = this.u;
        int length = iArr.length;
        if (i2 < length) {
            System.arraycopy(iArr, i, iArr, i3, i2 - i);
        } else {
            int[] iArr2 = new int[rh.a(length, 3, 2, 1, 10)];
            System.arraycopy(this.u, 0, iArr2, 0, i);
            System.arraycopy(this.u, i, iArr2, i3, this.v - i);
            this.u = iArr2;
        }
        this.u[i] = iIntValue;
        this.v++;
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.g0c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        d();
        collection.getClass();
        if (!(collection instanceof v1c)) {
            return super.addAll(collection);
        }
        v1c v1cVar = (v1c) collection;
        int i = v1cVar.v;
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
        System.arraycopy(v1cVar.u, 0, this.u, this.v, v1cVar.v);
        this.v = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.i2c
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final v1c p0(int i) {
        if (i >= this.v) {
            return new v1c(i == 0 ? w : Arrays.copyOf(this.u, i), this.v, true);
        }
        zn3.b();
        return null;
    }

    @Override // defpackage.g0c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1c)) {
            return super.equals(obj);
        }
        v1c v1cVar = (v1c) obj;
        if (this.v != v1cVar.v) {
            return false;
        }
        int[] iArr = v1cVar.u;
        for (int i = 0; i < this.v; i++) {
            if (this.u[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int f(int i) {
        j(i);
        return this.u[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        j(i);
        return Integer.valueOf(this.u[i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.v; i2++) {
            i = (i * 31) + this.u[i2];
        }
        return i;
    }

    public final void i(int i) {
        d();
        int i2 = this.v;
        int length = this.u.length;
        if (i2 == length) {
            int[] iArr = new int[rh.a(length, 3, 2, 1, 10)];
            System.arraycopy(this.u, 0, iArr, 0, this.v);
            this.u = iArr;
        }
        int[] iArr2 = this.u;
        int i3 = this.v;
        this.v = i3 + 1;
        iArr2[i3] = i;
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

    public final void j(int i) {
        if (i < 0 || i >= this.v) {
            r.b(i0c.a(this.v, i, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // defpackage.g0c, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        d();
        j(i);
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
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        d();
        j(i);
        int[] iArr = this.u;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.v;
    }

    public v1c(int[] iArr, int i, boolean z) {
        super(z);
        this.u = iArr;
        this.v = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        i(((Integer) obj).intValue());
        return true;
    }
}
