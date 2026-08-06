package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class r2c extends g0c implements RandomAccess, h2c, p3c {
    public static final long[] w;
    public static final r2c x;
    public long[] u;
    public int v;

    static {
        long[] jArr = new long[0];
        w = jArr;
        x = new r2c(jArr, 0, false);
    }

    public r2c() {
        this(w, 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        long jLongValue = ((Long) obj).longValue();
        d();
        if (i < 0 || i > (i2 = this.v)) {
            r.b(i0c.a(this.v, i, (byte) 13, "Index:", ", Size:"));
            return;
        }
        int i3 = i + 1;
        long[] jArr = this.u;
        int length = jArr.length;
        if (i2 < length) {
            System.arraycopy(jArr, i, jArr, i3, i2 - i);
        } else {
            long[] jArr2 = new long[rh.a(length, 3, 2, 1, 10)];
            System.arraycopy(this.u, 0, jArr2, 0, i);
            System.arraycopy(this.u, i, jArr2, i3, this.v - i);
            this.u = jArr2;
        }
        this.u[i] = jLongValue;
        this.v++;
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.g0c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        d();
        collection.getClass();
        if (!(collection instanceof r2c)) {
            return super.addAll(collection);
        }
        r2c r2cVar = (r2c) collection;
        int i = r2cVar.v;
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
        System.arraycopy(r2cVar.u, 0, this.u, this.v, r2cVar.v);
        this.v = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final long e(int i) {
        j(i);
        return this.u[i];
    }

    @Override // defpackage.g0c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2c)) {
            return super.equals(obj);
        }
        r2c r2cVar = (r2c) obj;
        if (this.v != r2cVar.v) {
            return false;
        }
        long[] jArr = r2cVar.u;
        for (int i = 0; i < this.v; i++) {
            if (this.u[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.i2c
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final r2c p0(int i) {
        if (i >= this.v) {
            return new r2c(i == 0 ? w : Arrays.copyOf(this.u, i), this.v, true);
        }
        zn3.b();
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        j(i);
        return Long.valueOf(this.u[i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.v; i2++) {
            long j = this.u[i2];
            byte[] bArr = g2c.a;
            i = (i * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i;
    }

    public final void i(long j) {
        d();
        int i = this.v;
        int length = this.u.length;
        if (i == length) {
            long[] jArr = new long[rh.a(length, 3, 2, 1, 10)];
            System.arraycopy(this.u, 0, jArr, 0, this.v);
            this.u = jArr;
        }
        long[] jArr2 = this.u;
        int i2 = this.v;
        this.v = i2 + 1;
        jArr2[i2] = j;
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

    public final void j(int i) {
        if (i < 0 || i >= this.v) {
            r.b(i0c.a(this.v, i, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // defpackage.g0c, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        d();
        j(i);
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
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        d();
        j(i);
        long[] jArr = this.u;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.v;
    }

    public r2c(long[] jArr, int i, boolean z) {
        super(z);
        this.u = jArr;
        this.v = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        i(((Long) obj).longValue());
        return true;
    }
}
