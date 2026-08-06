package io.intercom.android.sdk.carousel.permission;

import io.intercom.android.sdk.carousel.PermissionManager;
import io.intercom.android.sdk.models.carousel.ScreenAction;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
class PermissionRequestBefore30 implements PermissionRequest {
    private final PermissionResultListener nullListener = new NullPermissionResultListener();
    protected final PermissionManager permissionManager;
    private PermissionResultListener permissionResultListener;

    public PermissionRequestBefore30(PermissionManager permissionManager) {
        this.permissionManager = permissionManager;
    }

    private void handleRequestResult(String[] strArr, int[] iArr) {
        if (this.permissionManager.anyPermissionPermanentlyDeniedInResult(strArr, iArr)) {
            getListener().showDeniedPermanently();
        } else if (this.permissionManager.permissionsGranted(Arrays.asList(strArr))) {
            handleGranted(strArr);
        } else {
            getListener().showDeniedTemporarily();
        }
    }

    @Override // io.intercom.android.sdk.carousel.permission.PermissionRequest
    public void attach(PermissionResultListener permissionResultListener) {
        this.permissionResultListener = permissionResultListener;
    }

    @Override // io.intercom.android.sdk.carousel.permission.PermissionRequest
    public void detach() {
        this.permissionResultListener = null;
    }

    public PermissionResultListener getListener() {
        PermissionResultListener permissionResultListener = this.permissionResultListener;
        return permissionResultListener == null ? this.nullListener : permissionResultListener;
    }

    public void handleGranted(String[] strArr) {
        getListener().showGranted();
    }

    public void handleRequest(List<String> list, int i) {
        this.permissionManager.requestPermissions((String[]) list.toArray(new String[0]), i);
    }

    @Override // io.intercom.android.sdk.carousel.permission.PermissionRequest
    public void handleResult(String[] strArr, int[] iArr) {
        handleRequestResult(strArr, iArr);
    }

    @Override // io.intercom.android.sdk.carousel.permission.PermissionRequest
    public void request(ScreenAction screenAction, int i) {
        List<String> validPermissions = screenAction.getValidPermissions(this.permissionManager);
        if (validPermissions.isEmpty()) {
            return;
        }
        handleRequest(validPermissions, i);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class NullPermissionResultListener implements PermissionResultListener {
        private NullPermissionResultListener() {
        }

        @Override // io.intercom.android.sdk.carousel.permission.PermissionResultListener
        public void requestBackgroundLocationPermission() {
        }

        @Override // io.intercom.android.sdk.carousel.permission.PermissionResultListener
        public void showDeniedPermanently() {
        }

        @Override // io.intercom.android.sdk.carousel.permission.PermissionResultListener
        public void showDeniedTemporarily() {
        }

        @Override // io.intercom.android.sdk.carousel.permission.PermissionResultListener
        public void showGranted() {
        }
    }
}
