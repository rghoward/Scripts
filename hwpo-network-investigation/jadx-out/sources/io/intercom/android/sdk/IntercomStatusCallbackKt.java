package io.intercom.android.sdk;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomStatusCallbackKt {
    private static final IntercomStatusCallback noStatusCallback = new IntercomStatusCallback() { // from class: io.intercom.android.sdk.IntercomStatusCallbackKt$noStatusCallback$1
        @Override // io.intercom.android.sdk.IntercomStatusCallback
        public void onFailure(IntercomError intercomError) {
            intercomError.getClass();
        }

        @Override // io.intercom.android.sdk.IntercomStatusCallback
        public void onSuccess() {
        }
    };

    public static final IntercomStatusCallback getNoStatusCallback() {
        return noStatusCallback;
    }
}
