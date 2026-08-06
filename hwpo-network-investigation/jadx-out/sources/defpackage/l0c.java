package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class l0c implements Iterator {
    public int t = 0;
    public final int u;
    public final /* synthetic */ p0c v;

    public l0c(p0c p0cVar) {
        this.v = p0cVar;
        this.u = p0cVar.e();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.t < this.u;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.t;
        if (i < this.u) {
            this.t = i + 1;
            return Byte.valueOf(this.v.d(i));
        }
        vl.b();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
