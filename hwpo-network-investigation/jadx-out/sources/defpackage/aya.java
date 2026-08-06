package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class aya<K, V> extends zxa<K, V, Map.Entry<? extends K, ? extends V>> {
    @Override // java.util.Iterator
    public final Object next() {
        int i = this.v;
        this.v = i + 2;
        Object[] objArr = this.t;
        return new ph6(objArr[i], objArr[i + 1]);
    }
}
