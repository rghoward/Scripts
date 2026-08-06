package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class uw7<K, V> extends w1<Map.Entry<K, V>, K, V> {
    public final sw7<K, V> t;

    public uw7(sw7<K, V> sw7Var) {
        this.t = sw7Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.t.clear();
    }

    @Override // defpackage.f2
    public final int d() {
        sw7<K, V> sw7Var = this.t;
        sw7Var.getClass();
        return sw7Var.x;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new vw7(this.t);
    }
}
