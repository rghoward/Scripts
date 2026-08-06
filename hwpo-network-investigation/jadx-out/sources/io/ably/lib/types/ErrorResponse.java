package io.ably.lib.types;

import io.ably.lib.util.Serialisation;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class ErrorResponse {
    public ErrorInfo error;

    public static ErrorResponse fromJSON(String str) {
        return (ErrorResponse) Serialisation.gson.fromJson(str, ErrorResponse.class);
    }
}
