package io.intercom.android.sdk.m5.conversation.states;

import defpackage.pi1;
import defpackage.qq2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class PushNotificationsBannerState {
    public static final int $stable = 0;
    private final boolean askUsersToAllowNotifications;

    public /* synthetic */ PushNotificationsBannerState(boolean z, int i, qq2 qq2Var) {
        this((i & 1) != 0 ? false : z);
    }

    public static /* synthetic */ PushNotificationsBannerState copy$default(PushNotificationsBannerState pushNotificationsBannerState, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = pushNotificationsBannerState.askUsersToAllowNotifications;
        }
        return pushNotificationsBannerState.copy(z);
    }

    public final boolean component1() {
        return this.askUsersToAllowNotifications;
    }

    public final PushNotificationsBannerState copy(boolean z) {
        return new PushNotificationsBannerState(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PushNotificationsBannerState) && this.askUsersToAllowNotifications == ((PushNotificationsBannerState) obj).askUsersToAllowNotifications;
    }

    public final boolean getAskUsersToAllowNotifications() {
        return this.askUsersToAllowNotifications;
    }

    public int hashCode() {
        return Boolean.hashCode(this.askUsersToAllowNotifications);
    }

    public String toString() {
        return pi1.a(new StringBuilder("PushNotificationsBannerState(askUsersToAllowNotifications="), this.askUsersToAllowNotifications, ')');
    }

    public PushNotificationsBannerState(boolean z) {
        this.askUsersToAllowNotifications = z;
    }

    public PushNotificationsBannerState() {
        this(false, 1, null);
    }
}
