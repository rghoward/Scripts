package defpackage;

import defpackage.fw;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface edb<V extends fw> {
    boolean b();

    long d(V v, V v2, V v3);

    V e(long j, V v, V v2, V v3);

    V g(long j, V v, V v2, V v3);

    default V h(V v, V v2, V v3) {
        return (V) e(d(v, v2, v3), v, v2, v3);
    }
}
