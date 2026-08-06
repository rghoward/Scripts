package defpackage;

import defpackage.fw;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface lv<T, V extends fw> {
    boolean b();

    long c();

    cza<T, V> d();

    V e(long j);

    default boolean f(long j) {
        return j >= c();
    }

    T g(long j);

    T h();
}
