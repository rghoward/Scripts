package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ex7<K, V> extends s0<V> {
    public final qw7<K, V> t;

    public ex7(qw7<K, V> qw7Var) {
        this.t = qw7Var;
    }

    @Override // defpackage.s0, java.util.Collection
    public final boolean contains(Object obj) {
        return this.t.containsValue(obj);
    }

    @Override // defpackage.s0
    public final int d() {
        qw7<K, V> qw7Var = this.t;
        qw7Var.getClass();
        return qw7Var.u;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        yxa<K, V> yxaVar = this.t.t;
        zxa[] zxaVarArr = new zxa[8];
        for (int i = 0; i < 8; i++) {
            zxaVarArr[i] = new dya();
        }
        return new fx7(yxaVar, zxaVarArr);
    }
}
