package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vw7<K, V> implements Iterator<Map.Entry<K, V>>, zn5 {
    public final tw7<K, V, Map.Entry<K, V>> t;

    public vw7(sw7<K, V> sw7Var) {
        zxa[] zxaVarArr = new zxa[8];
        for (int i = 0; i < 8; i++) {
            zxaVarArr[i] = new cya(this);
        }
        this.t = new tw7<>(sw7Var, zxaVarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.t.v;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.t.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.t.remove();
    }
}
