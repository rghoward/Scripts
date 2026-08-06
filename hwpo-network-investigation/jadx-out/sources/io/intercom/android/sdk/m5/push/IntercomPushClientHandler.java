package io.intercom.android.sdk.m5.push;

import android.app.TaskStackBuilder;
import android.content.Context;
import android.os.Bundle;
import com.intercom.twig.Twig;
import defpackage.qq2;
import defpackage.z2a;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.PushTokenStore;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomPushClientHandler {
    private final Twig twig = LumberMill.getLogger();
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ void handlePush$default(IntercomPushClientHandler intercomPushClientHandler, Bundle bundle, Context context, UserIdentity userIdentity, TaskStackBuilder taskStackBuilder, int i, Object obj) throws Throwable {
        if ((i & 8) != 0) {
            taskStackBuilder = null;
        }
        intercomPushClientHandler.handlePush(bundle, context, userIdentity, taskStackBuilder);
    }

    private final boolean hasUserHashIfNeeded(UserIdentity userIdentity, AppConfig appConfig) {
        if (!appConfig.isReceivedFromServer()) {
            return false;
        }
        if (!appConfig.isIdentityVerificationEnabled()) {
            return true;
        }
        if (!appConfig.isIdentityVerificationEnabled()) {
            return false;
        }
        String hmac = userIdentity.getHmac();
        hmac.getClass();
        return !z2a.w(hmac);
    }

    public final void handlePush(Bundle bundle, Context context, UserIdentity userIdentity, TaskStackBuilder taskStackBuilder) throws Throwable {
        bundle.getClass();
        context.getClass();
        userIdentity.getClass();
        IntercomPushData intercomPushDataCreateFrom = IntercomPushData.Companion.createFrom(context, bundle);
        if (intercomPushDataCreateFrom == null) {
            this.twig.i("This is not an Intercom push message", new Object[0]);
        } else if (userIdentity.identityExists()) {
            IntercomNotificationHandler.processIntercomPushNotification$intercom_sdk_base_release$default(IntercomNotificationHandler.INSTANCE, context, intercomPushDataCreateFrom, taskStackBuilder, null, 8, null);
        } else {
            this.twig.i("Can't create push message as we have no user identity. This can be caused by messages being sent to a logged out user.", new Object[0]);
            IntercomNotificationHandler.INSTANCE.clear(context);
        }
    }

    public final boolean isIntercomPush(Bundle bundle) {
        bundle.getClass();
        return IntercomPushData.Companion.isIntercomPush(bundle);
    }

    public final void sendTokenToIntercom(String str, Api api, UserIdentity userIdentity, Provider<AppConfig> provider, PushTokenStore pushTokenStore) {
        str.getClass();
        api.getClass();
        userIdentity.getClass();
        provider.getClass();
        pushTokenStore.getClass();
        pushTokenStore.savePushToken(str);
        if (userIdentity.identityExists()) {
            AppConfig appConfig = provider.get();
            appConfig.getClass();
            if (hasUserHashIfNeeded(userIdentity, appConfig)) {
                api.setDeviceToken(str);
            }
        }
    }

    public final boolean shouldSendDeviceToken(PushTokenStore pushTokenStore, String str) {
        pushTokenStore.getClass();
        str.getClass();
        return (pushTokenStore.hasCachedToken(str) && pushTokenStore.isDeviceTokenSubmitted()) ? false : true;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        public final void clear(Context context) {
            context.getClass();
            IntercomNotificationHandler.INSTANCE.clear(context);
        }

        public final void setUpNotificationChannels(Context context) {
            context.getClass();
            IntercomNotificationHandler.INSTANCE.setUpNotificationChannels$intercom_sdk_base_release(context);
        }

        private Companion() {
        }
    }
}
