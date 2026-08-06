package io.intercom.android.sdk.api;

import io.intercom.android.sdk.IntercomStatusCallback;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class UserUpdater {
    private final Provider<Api> apiProvider;
    private final IntercomDataLayer dataLayer;
    private OpsMetricTracker opsMetricTracker;

    public UserUpdater(Provider<Api> provider, OpsMetricTracker opsMetricTracker, IntercomDataLayer intercomDataLayer) {
        this.apiProvider = provider;
        this.opsMetricTracker = opsMetricTracker;
        this.dataLayer = intercomDataLayer;
    }

    public synchronized void updateUser(UserUpdateRequest userUpdateRequest, IntercomStatusCallback intercomStatusCallback) {
        try {
            this.opsMetricTracker.trackEvent(OpsMetricTracker.START, OpsMetricTracker.TIME_TO_COMPLETE_PING);
            if (userUpdateRequest.isValidUpdate()) {
                if (userUpdateRequest.isNewSession()) {
                    this.dataLayer.updateSessionStarted();
                    this.dataLayer.generateSessionId();
                }
                this.apiProvider.get().updateUser(userUpdateRequest, intercomStatusCallback);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
