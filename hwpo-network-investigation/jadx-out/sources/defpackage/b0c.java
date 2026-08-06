package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class b0c implements Iterator {
    public final /* synthetic */ Iterator t;
    public final /* synthetic */ Iterator u;

    public b0c(a2c a2cVar, Iterator it, Iterator it2) {
        this.t = it;
        this.u = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.t.hasNext()) {
            return true;
        }
        return this.u.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Iterator it = this.t;
        if (it.hasNext()) {
            return new i8c(((Integer) it.next()).toString());
        }
        Iterator it2 = this.u;
        if (it2.hasNext()) {
            return new i8c((String) it2.next());
        }
        vl.b();
        return null;
    }
}
