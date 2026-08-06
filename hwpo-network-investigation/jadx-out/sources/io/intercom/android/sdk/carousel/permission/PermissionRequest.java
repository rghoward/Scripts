package io.intercom.android.sdk.carousel.permission;

import io.intercom.android.sdk.models.carousel.ScreenAction;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface PermissionRequest {
    void attach(PermissionResultListener permissionResultListener);

    void detach();

    void handleResult(String[] strArr, int[] iArr);

    void request(ScreenAction screenAction, int i);
}
