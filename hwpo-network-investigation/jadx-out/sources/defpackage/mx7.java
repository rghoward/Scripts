package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class mx7<T> extends n1<T> {
    public final T[] v;
    public final xxa<T> w;

    /* JADX WARN: Multi-variable type inference failed */
    public mx7(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super(i, i2);
        this.v = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.w = new xxa<>(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            vl.b();
            return null;
        }
        xxa<T> xxaVar = this.w;
        if (xxaVar.hasNext()) {
            this.t++;
            return xxaVar.next();
        }
        int i = this.t;
        this.t = i + 1;
        return this.v[i - xxaVar.u];
    }

    @Override // java.util.ListIterator
    public final T previous() {
        if (!hasPrevious()) {
            vl.b();
            return null;
        }
        int i = this.t;
        xxa<T> xxaVar = this.w;
        int i2 = xxaVar.u;
        if (i <= i2) {
            this.t = i - 1;
            return xxaVar.previous();
        }
        int i3 = i - 1;
        this.t = i3;
        return this.v[i3 - i2];
    }
}
