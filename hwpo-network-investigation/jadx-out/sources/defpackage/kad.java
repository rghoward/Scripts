package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kad implements Iterator {
    public int t = 0;
    public final /* synthetic */ lad u;

    public kad(lad ladVar) {
        this.u = ladVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.t < this.u.t.e;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        int i = this.t;
        this.t = i + 1;
        nad nadVar = this.u.t;
        return nadVar.d(nadVar.d[i] & 31);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
