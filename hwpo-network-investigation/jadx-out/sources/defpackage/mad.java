package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class mad implements Iterator {
    public final d9d t;
    public int u;
    public int v;
    public final /* synthetic */ nad w;

    public /* synthetic */ mad(nad nadVar, d9d d9dVar, int i) {
        this.w = nadVar;
        this.t = d9dVar;
        int i2 = i & 31;
        this.u = i2;
        this.v = i >>> (i2 + 5);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.u >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.u;
        nad nadVar = this.w;
        ln4 ln4Var = nadVar.b;
        int iB1 = ln4Var.b1();
        Object objCast = this.t.b.cast(i >= iB1 ? nadVar.c.e1(i - iB1) : ln4Var.e1(i));
        int i2 = this.v;
        if (i2 == 0) {
            this.u = -1;
            return objCast;
        }
        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i2) + 1;
        this.v >>>= iNumberOfTrailingZeros;
        this.u += iNumberOfTrailingZeros;
        return objCast;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
