package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class k1<T> implements Iterator<T>, zn5 {
    public int t;
    public T u;

    public abstract void a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.t;
        if (i == 0) {
            this.t = 3;
            a();
            return this.t == 1;
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        z90.a("hasNext called when the iterator is in the FAILED state.");
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        int i = this.t;
        if (i == 1) {
            this.t = 0;
            return this.u;
        }
        if (i != 2) {
            this.t = 3;
            a();
            if (this.t == 1) {
                this.t = 0;
                return this.u;
            }
        }
        vl.b();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
