package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ax7<K, V> extends r2<Map.Entry<? extends K, ? extends V>> {
    public final qw7<K, V> t;

    public ax7(qw7<K, V> qw7Var) {
        this.t = qw7Var;
    }

    @Override // defpackage.s0, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        qw7<K, V> qw7Var = this.t;
        V v = qw7Var.get(key);
        if (v != null) {
            return v.equals(entry.getValue());
        }
        return entry.getValue() == null && qw7Var.containsKey(entry.getKey());
    }

    @Override // defpackage.s0
    public final int d() {
        qw7<K, V> qw7Var = this.t;
        qw7Var.getClass();
        return qw7Var.u;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        yxa<K, V> yxaVar = this.t.t;
        zxa[] zxaVarArr = new zxa[8];
        for (int i = 0; i < 8; i++) {
            zxaVarArr[i] = new aya();
        }
        return new bx7(yxaVar, zxaVarArr);
    }
}
