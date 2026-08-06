package defpackage;

import defpackage.fw;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface idb<V extends fw> extends jdb<V> {
    int c();

    @Override // defpackage.edb
    default long d(V v, V v2, V v3) {
        return ((long) (c() + f())) * 1000000;
    }

    int f();
}
