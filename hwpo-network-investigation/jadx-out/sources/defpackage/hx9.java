package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hx9 implements Iterator<Object>, zn5 {
    public int t;
    public final /* synthetic */ fx9<Object> u;

    public hx9(fx9<Object> fx9Var) {
        this.u = fx9Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.t < this.u.f();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.t;
        this.t = i + 1;
        return this.u.g(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
