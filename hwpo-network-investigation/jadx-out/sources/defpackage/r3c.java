package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class r3c<E> extends g0c<E> implements RandomAccess {
    public static final Object[] w;
    public static final r3c x;
    public Object[] u;
    public int v;

    static {
        Object[] objArr = new Object[0];
        w = objArr;
        x = new r3c(objArr, 0, false);
    }

    public r3c() {
        this(w, 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        d();
        if (i < 0 || i > (i2 = this.v)) {
            r.b(i0c.a(this.v, i, (byte) 13, "Index:", ", Size:"));
            return;
        }
        int i3 = i + 1;
        Object[] objArr = this.u;
        int length = objArr.length;
        if (i2 < length) {
            System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            Object[] objArr2 = new Object[rh.a(length, 3, 2, 1, 10)];
            System.arraycopy(this.u, 0, objArr2, 0, i);
            System.arraycopy(this.u, i, objArr2, i3, this.v - i);
            this.u = objArr2;
        }
        this.u[i] = obj;
        this.v++;
        ((AbstractList) this).modCount++;
    }

    public final void e(int i) {
        if (i < 0 || i >= this.v) {
            r.b(i0c.a(this.v, i, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // defpackage.g0c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int i = this.v;
        if (i != list.size()) {
            return false;
        }
        if (!(obj instanceof r3c)) {
            for (int i2 = 0; i2 < i; i2++) {
                if (!this.u[i2].equals(list.get(i2))) {
                    return false;
                }
            }
            return true;
        }
        r3c r3cVar = (r3c) obj;
        for (int i3 = 0; i3 < i; i3++) {
            if (!this.u[i3].equals(r3cVar.u[i3])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        e(i);
        return (E) this.u[i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = this.v;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode = (iHashCode * 31) + this.u[i2].hashCode();
        }
        return iHashCode;
    }

    @Override // defpackage.i2c
    public final /* bridge */ /* synthetic */ i2c p0(int i) {
        if (i >= this.v) {
            return new r3c(i == 0 ? w : Arrays.copyOf(this.u, i), this.v, true);
        }
        zn3.b();
        return null;
    }

    @Override // defpackage.g0c, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        d();
        e(i);
        Object[] objArr = this.u;
        Object obj = objArr[i];
        int i2 = this.v;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.v--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        d();
        e(i);
        Object[] objArr = this.u;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.v;
    }

    public r3c(Object[] objArr, int i, boolean z) {
        super(z);
        this.u = objArr;
        this.v = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        d();
        int i = this.v;
        int length = this.u.length;
        if (i == length) {
            this.u = Arrays.copyOf(this.u, rh.a(length, 3, 2, 1, 10));
        }
        Object[] objArr = this.u;
        int i2 = this.v;
        this.v = i2 + 1;
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
