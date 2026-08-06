package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wl8<E> extends q95<E> {
    public static final Object[] B;
    public static final wl8<Object> C;
    public final transient int A;
    public final transient Object[] w;
    public final transient int x;
    public final transient Object[] y;
    public final transient int z;

    static {
        Object[] objArr = new Object[0];
        B = objArr;
        C = new wl8<>(0, 0, 0, objArr, objArr);
    }

    public wl8(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        this.w = objArr;
        this.x = i;
        this.y = objArr2;
        this.z = i2;
        this.A = i3;
    }

    @Override // defpackage.b95, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.y;
            if (objArr.length != 0) {
                int iE = su0.e(obj);
                while (true) {
                    int i = iE & this.z;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iE = i + 1;
                }
            }
        }
        return false;
    }

    @Override // defpackage.b95
    public final int e(int i, Object[] objArr) {
        Object[] objArr2 = this.w;
        int i2 = this.A;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // defpackage.b95
    public final Object[] f() {
        return this.w;
    }

    @Override // defpackage.q95, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.x;
    }

    @Override // defpackage.b95
    public final int i() {
        return this.A;
    }

    @Override // defpackage.b95
    public final int j() {
        return 0;
    }

    @Override // defpackage.b95
    public final boolean k() {
        return false;
    }

    @Override // defpackage.b95, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: l */
    public final w2b iterator() {
        return d().listIterator(0);
    }

    @Override // defpackage.q95
    public final k95<E> q() {
        return k95.n(this.A, this.w);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A;
    }
}
