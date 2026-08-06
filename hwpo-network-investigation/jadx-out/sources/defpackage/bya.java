package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bya<K, V> extends zxa<K, V, K> {
    @Override // java.util.Iterator
    public final K next() {
        int i = this.v;
        this.v = i + 2;
        return (K) this.t[i];
    }
}
