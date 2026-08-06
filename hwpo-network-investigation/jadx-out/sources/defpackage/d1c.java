package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class d1c extends g0c implements RandomAccess, p3c {
    public static final double[] w;
    public double[] u;
    public int v;

    static {
        double[] dArr = new double[0];
        w = dArr;
        new d1c(dArr, 0, false);
    }

    public d1c() {
        this(w, 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        double dDoubleValue = ((Double) obj).doubleValue();
        d();
        if (i < 0 || i > (i2 = this.v)) {
            r.b(i0c.a(this.v, i, (byte) 13, "Index:", ", Size:"));
            return;
        }
        int i3 = i + 1;
        double[] dArr = this.u;
        int length = dArr.length;
        if (i2 < length) {
            System.arraycopy(dArr, i, dArr, i3, i2 - i);
        } else {
            double[] dArr2 = new double[rh.a(length, 3, 2, 1, 10)];
            System.arraycopy(this.u, 0, dArr2, 0, i);
            System.arraycopy(this.u, i, dArr2, i3, this.v - i);
            this.u = dArr2;
        }
        this.u[i] = dDoubleValue;
        this.v++;
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.g0c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        d();
        collection.getClass();
        if (!(collection instanceof d1c)) {
            return super.addAll(collection);
        }
        d1c d1cVar = (d1c) collection;
        int i = d1cVar.v;
        if (i == 0) {
            return false;
        }
        int i2 = this.v;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.u;
        if (i3 > dArr.length) {
            this.u = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(d1cVar.u, 0, this.u, this.v, d1cVar.v);
        this.v = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(double d) {
        d();
        int i = this.v;
        int length = this.u.length;
        if (i == length) {
            double[] dArr = new double[rh.a(length, 3, 2, 1, 10)];
            System.arraycopy(this.u, 0, dArr, 0, this.v);
            this.u = dArr;
        }
        double[] dArr2 = this.u;
        int i2 = this.v;
        this.v = i2 + 1;
        dArr2[i2] = d;
    }

    @Override // defpackage.g0c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1c)) {
            return super.equals(obj);
        }
        d1c d1cVar = (d1c) obj;
        if (this.v != d1cVar.v) {
            return false;
        }
        double[] dArr = d1cVar.u;
        for (int i = 0; i < this.v; i++) {
            if (Double.doubleToLongBits(this.u[i]) != Double.doubleToLongBits(dArr[i])) {
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
        return Double.valueOf(this.u[i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.v; i2++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.u[i2]);
            byte[] bArr = g2c.a;
            i = (i * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i = this.v;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.u[i2] == dDoubleValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.i2c
    public final i2c p0(int i) {
        if (i >= this.v) {
            return new d1c(i == 0 ? w : Arrays.copyOf(this.u, i), this.v, true);
        }
        zn3.b();
        return null;
    }

    @Override // defpackage.g0c, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        d();
        f(i);
        double[] dArr = this.u;
        double d = dArr[i];
        int i2 = this.v;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.v--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        d();
        if (i2 < i) {
            r.b("toIndex < fromIndex");
            return;
        }
        double[] dArr = this.u;
        System.arraycopy(dArr, i2, dArr, i, this.v - i2);
        this.v -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        d();
        f(i);
        double[] dArr = this.u;
        double d = dArr[i];
        dArr[i] = dDoubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.v;
    }

    public d1c(double[] dArr, int i, boolean z) {
        super(z);
        this.u = dArr;
        this.v = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Double) obj).doubleValue());
        return true;
    }
}
