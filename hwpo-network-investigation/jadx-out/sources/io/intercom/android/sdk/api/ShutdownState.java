package io.intercom.android.sdk.api;

import android.content.Context;
import io.intercom.android.sdk.identity.AppIdentity;
import io.intercom.android.sdk.utilities.commons.DeviceUtils;
import io.intercom.android.sdk.utilities.commons.TimeProvider;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class ShutdownState {
    private final AppIdentity appIdentity;
    private final Context context;
    long shutdownExpiry;
    String shutdownFingerprint;
    private String shutdownReason;
    private final ShutdownStore shutdownStore;
    private final TimeProvider timeProvider;

    public ShutdownState(ShutdownStore shutdownStore, Context context, AppIdentity appIdentity, TimeProvider timeProvider) {
        this.shutdownStore = shutdownStore;
        this.context = context;
        this.appIdentity = appIdentity;
        this.timeProvider = timeProvider;
        this.shutdownExpiry = shutdownStore.getShutdownExpiry(timeProvider.currentTimeMillis());
        this.shutdownReason = shutdownStore.getShutdownReason();
        this.shutdownFingerprint = shutdownStore.getShutdownFingerprint(generateAppFingerprint(context, appIdentity));
    }

    private static String generateAppFingerprint(Context context, AppIdentity appIdentity) {
        return context.getPackageName() + "-" + DeviceUtils.getAppVersion(context) + "-" + appIdentity.appId() + "-18.2.0";
    }

    private void persistCachedAttributes() {
        this.shutdownStore.save(this.shutdownFingerprint, this.shutdownExpiry, this.shutdownReason);
    }

    public boolean canSendNetworkRequests() {
        return ((this.shutdownExpiry > this.timeProvider.currentTimeMillis() ? 1 : (this.shutdownExpiry == this.timeProvider.currentTimeMillis() ? 0 : -1)) <= 0) || !this.shutdownFingerprint.equals(generateAppFingerprint(this.context, this.appIdentity));
    }

    public String getShutdownReason() {
        return this.shutdownReason;
    }

    public void updateShutdownState(long j, String str) {
        this.shutdownExpiry = this.timeProvider.currentTimeMillis() + j;
        this.shutdownReason = str;
        this.shutdownFingerprint = generateAppFingerprint(this.context, this.appIdentity);
        persistCachedAttributes();
    }
}
