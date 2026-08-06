package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cya<K, V> extends zxa<K, V, Map.Entry<K, V>> {
    public final vw7<K, V> w;

    public cya(vw7<K, V> vw7Var) {
        this.w = vw7Var;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.v;
        this.v = i + 2;
        Object[] objArr = this.t;
        return new q27(this.w, objArr[i], objArr[i + 1]);
    }
}
