package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class n2c implements Iterator {
    public final Iterator t;

    public n2c(Iterator it) {
        this.t = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.t.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.t.next();
        return entry.getValue() instanceof o2c ? new m2c(entry) : entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.t.remove();
    }
}
