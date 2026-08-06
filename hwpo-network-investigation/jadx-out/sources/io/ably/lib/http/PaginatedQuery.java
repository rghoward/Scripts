package io.ably.lib.http;

import io.ably.lib.types.PaginatedResult;
import io.ably.lib.types.Param;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class PaginatedQuery<T> {
    private final BasePaginatedQuery<T> base;

    public PaginatedQuery(Http http, String str, Param[] paramArr, Param[] paramArr2, HttpCore.RequestBody requestBody, HttpCore.BodyHandler<T> bodyHandler) {
        this.base = new BasePaginatedQuery<>(http, str, paramArr, paramArr2, requestBody, bodyHandler);
    }

    public PaginatedResult<T> get() {
        return this.base.get().sync();
    }

    public PaginatedQuery(Http http, String str, Param[] paramArr, Param[] paramArr2, HttpCore.BodyHandler<T> bodyHandler) {
        this(http, str, paramArr, paramArr2, null, bodyHandler);
    }
}
