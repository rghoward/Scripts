package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class yw7<K, V> extends c2<V> {
    public final sw7<K, V> t;

    public yw7(sw7<K, V> sw7Var) {
        this.t = sw7Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.t.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.t.containsValue(obj);
    }

    @Override // defpackage.c2
    public final int d() {
        sw7<K, V> sw7Var = this.t;
        sw7Var.getClass();
        return sw7Var.x;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        zxa[] zxaVarArr = new zxa[8];
        for (int i = 0; i < 8; i++) {
            zxaVarArr[i] = new dya();
        }
        return new zw7(this.t, zxaVarArr);
    }
}
