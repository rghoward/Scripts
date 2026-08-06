package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wx0<T> extends n1<T> {
    public final T[] v;

    /* JADX WARN: Multi-variable type inference failed */
    public wx0(int i, int i2, Object[] objArr) {
        super(i, i2);
        this.v = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            vl.b();
            return null;
        }
        int i = this.t;
        this.t = i + 1;
        return this.v[i];
    }

    @Override // java.util.ListIterator
    public final T previous() {
        if (!hasPrevious()) {
            vl.b();
            return null;
        }
        int i = this.t - 1;
        this.t = i;
        return this.v[i];
    }
}
