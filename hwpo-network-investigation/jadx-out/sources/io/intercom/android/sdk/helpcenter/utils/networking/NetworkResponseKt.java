package io.intercom.android.sdk.helpcenter.utils.networking;

import defpackage.u;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class NetworkResponseKt {
    public static final boolean isRetryable(NetworkResponse<?> networkResponse) {
        networkResponse.getClass();
        if (networkResponse instanceof NetworkResponse.Success) {
            return false;
        }
        if (networkResponse instanceof NetworkResponse.NetworkError) {
            return true;
        }
        if (networkResponse instanceof NetworkResponse.ClientError) {
            return false;
        }
        if (networkResponse instanceof NetworkResponse.ServerError) {
            return ((NetworkResponse.ServerError) networkResponse).getCode() >= 500;
        }
        u.b();
        return false;
    }
}
