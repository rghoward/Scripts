package io.ably.lib.types;

import com.google.gson.JsonElement;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class HttpPaginatedResponse {
    public int errorCode;
    public String errorMessage;
    public Param[] headers;
    public int statusCode;
    public boolean success;

    public abstract HttpPaginatedResponse current();

    public abstract HttpPaginatedResponse first();

    public abstract boolean hasCurrent();

    public abstract boolean hasFirst();

    public abstract boolean hasNext();

    public abstract boolean isLast();

    public abstract JsonElement[] items();

    public abstract HttpPaginatedResponse next();
}
