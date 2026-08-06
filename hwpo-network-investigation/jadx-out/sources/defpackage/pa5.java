package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class pa5<T> implements Iterator<T>, zn5 {
    public int t;
    public int u;
    public boolean v;

    public pa5(int i) {
        this.t = i;
    }

    public abstract T a(int i);

    public abstract void b(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.u < this.t;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            vl.b();
            return null;
        }
        T tA = a(this.u);
        this.u++;
        this.v = true;
        return tA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.v) {
            aa0.c("Call next() before removing an element.");
            return;
        }
        int i = this.u - 1;
        this.u = i;
        b(i);
        this.t--;
        this.v = false;
    }
}
