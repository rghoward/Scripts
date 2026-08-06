package io.ably.lib.types;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface AsyncPaginatedResult<T> {
    void current(Callback<AsyncPaginatedResult<T>> callback);

    void first(Callback<AsyncPaginatedResult<T>> callback);

    boolean hasCurrent();

    boolean hasFirst();

    boolean hasNext();

    T[] items();

    void next(Callback<AsyncPaginatedResult<T>> callback);
}
