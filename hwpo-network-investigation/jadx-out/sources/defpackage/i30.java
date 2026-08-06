package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class i30<T> implements Iterator<T>, zn5 {
    public final T[] t;
    public int u;

    public i30(T[] tArr) {
        tArr.getClass();
        this.t = tArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.u < this.t.length;
    }

    @Override // java.util.Iterator
    public final T next() {
        try {
            T[] tArr = this.t;
            int i = this.u;
            this.u = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.u--;
            px1.b(e.getMessage());
            return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
