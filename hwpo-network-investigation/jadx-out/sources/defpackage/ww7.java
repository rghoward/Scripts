package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ww7<K, V> extends f2<K> {
    public final sw7<K, V> t;

    public ww7(sw7<K, V> sw7Var) {
        this.t = sw7Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(K k) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.t.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.t.containsKey(obj);
    }

    @Override // defpackage.f2
    public final int d() {
        sw7<K, V> sw7Var = this.t;
        sw7Var.getClass();
        return sw7Var.x;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<K> iterator() {
        zxa[] zxaVarArr = new zxa[8];
        for (int i = 0; i < 8; i++) {
            zxaVarArr[i] = new bya();
        }
        return new xw7(this.t, zxaVarArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        sw7<K, V> sw7Var = this.t;
        if (!sw7Var.containsKey(obj)) {
            return false;
        }
        sw7Var.remove(obj);
        return true;
    }
}
