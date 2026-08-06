package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zxa<K, V, T> implements Iterator<T>, zn5 {
    public Object[] t = yxa.e.d;
    public int u;
    public int v;

    public final void a(int i, int i2, Object[] objArr) {
        this.t = objArr;
        this.u = i;
        this.v = i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.v < this.u;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
