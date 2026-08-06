package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class czb implements Iterator {
    public int t = 0;
    public final /* synthetic */ dzb u;

    public czb(dzb dzbVar) {
        this.u = dzbVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.t;
        dzb dzbVar = this.u;
        return i < dzbVar.e() - dzbVar.d();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.t;
        dzb dzbVar = this.u;
        if (i >= dzbVar.e() - dzbVar.d()) {
            vl.b();
            return null;
        }
        ezb ezbVar = dzbVar.u;
        Object obj = ezbVar.t[dzbVar.d() + i];
        this.t = i + 1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
