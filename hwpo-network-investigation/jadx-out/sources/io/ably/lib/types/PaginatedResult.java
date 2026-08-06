package io.ably.lib.types;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface PaginatedResult<T> {
    PaginatedResult<T> current();

    PaginatedResult<T> first();

    boolean hasCurrent();

    boolean hasFirst();

    boolean hasNext();

    boolean isLast();

    T[] items();

    PaginatedResult<T> next();
}
