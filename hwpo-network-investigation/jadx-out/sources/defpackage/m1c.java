package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class m1c extends g0c implements RandomAccess, p3c {
    public static final float[] w;
    public float[] u;
    public int v;

    static {
        float[] fArr = new float[0];
        w = fArr;
        new m1c(fArr, 0, false);
    }

    public m1c() {
        this(w, 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        float fFloatValue = ((Float) obj).floatValue();
        d();
        if (i < 0 || i > (i2 = this.v)) {
            r.b(i0c.a(this.v, i, (byte) 13, "Index:", ", Size:"));
            return;
        }
        int i3 = i + 1;
        float[] fArr = this.u;
        int length = fArr.length;
        if (i2 < length) {
            System.arraycopy(fArr, i, fArr, i3, i2 - i);
        } else {
            float[] fArr2 = new float[rh.a(length, 3, 2, 1, 10)];
            System.arraycopy(this.u, 0, fArr2, 0, i);
            System.arraycopy(this.u, i, fArr2, i3, this.v - i);
            this.u = fArr2;
        }
        this.u[i] = fFloatValue;
        this.v++;
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.g0c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        d();
        collection.getClass();
        if (!(collection instanceof m1c)) {
            return super.addAll(collection);
        }
        m1c m1cVar = (m1c) collection;
        int i = m1cVar.v;
        if (i == 0) {
            return false;
        }
        int i2 = this.v;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.u;
        if (i3 > fArr.length) {
            this.u = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(m1cVar.u, 0, this.u, this.v, m1cVar.v);
        this.v = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(float f) {
        d();
        int i = this.v;
        int length = this.u.length;
        if (i == length) {
            float[] fArr = new float[rh.a(length, 3, 2, 1, 10)];
            System.arraycopy(this.u, 0, fArr, 0, this.v);
            this.u = fArr;
        }
        float[] fArr2 = this.u;
        int i2 = this.v;
        this.v = i2 + 1;
        fArr2[i2] = f;
    }

    @Override // defpackage.g0c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1c)) {
            return super.equals(obj);
        }
        m1c m1cVar = (m1c) obj;
        if (this.v != m1cVar.v) {
            return false;
        }
        float[] fArr = m1cVar.u;
        for (int i = 0; i < this.v; i++) {
            if (Float.floatToIntBits(this.u[i]) != Float.floatToIntBits(fArr[i])) {
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
        return Float.valueOf(this.u[i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.v; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.u[i]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i = this.v;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.u[i2] == fFloatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.i2c
    public final i2c p0(int i) {
        if (i >= this.v) {
            return new m1c(i == 0 ? w : Arrays.copyOf(this.u, i), this.v, true);
        }
        zn3.b();
        return null;
    }

    @Override // defpackage.g0c, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        d();
        f(i);
        float[] fArr = this.u;
        float f = fArr[i];
        int i2 = this.v;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.v--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        d();
        if (i2 < i) {
            r.b("toIndex < fromIndex");
            return;
        }
        float[] fArr = this.u;
        System.arraycopy(fArr, i2, fArr, i, this.v - i2);
        this.v -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        d();
        f(i);
        float[] fArr = this.u;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.v;
    }

    public m1c(float[] fArr, int i, boolean z) {
        super(z);
        this.u = fArr;
        this.v = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Float) obj).floatValue());
        return true;
    }
}
