package io.intercom.android.sdk.user;

import io.intercom.android.sdk.IntercomStatusCallbackKt;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.api.UserUpdateRequest;
import io.intercom.android.sdk.api.UserUpdater;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.models.HostAppState;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class UserUpdaterHelper {
    public static final int $stable = 8;
    private final IntercomDataLayer dataLayer;
    private final Provider<UserIdentity> userIdentityProvider;
    private final Provider<UserUpdater> userUpdaterProvider;

    public UserUpdaterHelper(Provider<UserUpdater> provider, IntercomDataLayer intercomDataLayer, Provider<UserIdentity> provider2) {
        provider.getClass();
        intercomDataLayer.getClass();
        provider2.getClass();
        this.userUpdaterProvider = provider;
        this.dataLayer = intercomDataLayer;
        this.userIdentityProvider = provider2;
    }

    public final UserIdentity getUserIdentity() {
        return this.userIdentityProvider.get();
    }

    public final UserUpdater getUserUpdater() {
        return this.userUpdaterProvider.get();
    }

    public final void update(long j) {
        HostAppState value = this.dataLayer.getHostAppState().getValue();
        if (j - value.getBackgroundedTimestamp() <= this.dataLayer.getConfig().getValue().getNewSessionThresholdMs() || !getUserIdentity().identityExists() || value.getSessionStartedSinceLastBackgrounded()) {
            return;
        }
        getUserUpdater().updateUser(UserUpdateRequest.create(true, value.isBackgrounded(), true), IntercomStatusCallbackKt.getNoStatusCallback());
    }
}
