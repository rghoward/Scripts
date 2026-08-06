package io.intercom.android.sdk.push;

import android.app.Application;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.os.Bundle;
import com.intercom.twig.Twig;
import defpackage.z2a;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.PushTokenStore;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.push.IntercomPushClientHandler;
import io.intercom.android.sdk.utilities.ContextLocaliser;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomPushClient {
    public static final int $stable = 8;
    private final IntercomPushClientHandler pushHandler;
    private final Twig twig;

    /* JADX WARN: Illegal instructions before constructor call */
    public IntercomPushClient() {
        Twig logger = LumberMill.getLogger();
        logger.getClass();
        this(logger, new IntercomPushClientHandler());
    }

    private final Bundle convertMessageMapToBundle(Map<String, String> map) {
        Bundle bundle = new Bundle(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        return bundle;
    }

    public final void handlePush(Application application, Bundle bundle) throws Throwable {
        application.getClass();
        bundle.getClass();
        if (!isIntercomPush(bundle)) {
            this.twig.i("The message passed to handlePush() was not an Intercom push message.", new Object[0]);
            return;
        }
        Injector.initIfCachedCredentials(application);
        if (Injector.isNotInitialised()) {
            this.twig.w("Push not handled because Intercom is not initialised", new Object[0]);
            return;
        }
        Injector injector = Injector.get();
        Context contextCreateLocalisedContext = new ContextLocaliser(injector.getAppConfigProvider()).createLocalisedContext(application);
        IntercomPushClientHandler.Companion companion = IntercomPushClientHandler.Companion;
        contextCreateLocalisedContext.getClass();
        companion.setUpNotificationChannels(contextCreateLocalisedContext);
        IntercomPushClientHandler intercomPushClientHandler = this.pushHandler;
        UserIdentity userIdentity = injector.getUserIdentity();
        userIdentity.getClass();
        IntercomPushClientHandler.handlePush$default(intercomPushClientHandler, bundle, contextCreateLocalisedContext, userIdentity, null, 8, null);
    }

    public final void handlePushWithCustomStack(Application application, Bundle bundle, TaskStackBuilder taskStackBuilder) throws Throwable {
        application.getClass();
        bundle.getClass();
        taskStackBuilder.getClass();
        if (!isIntercomPush(bundle)) {
            this.twig.i("The message passed to handlePush() was not an Intercom push message.", new Object[0]);
            return;
        }
        Injector.initIfCachedCredentials(application);
        if (Injector.isNotInitialised()) {
            this.twig.w("Push not handled because Intercom is not initialised", new Object[0]);
            return;
        }
        Injector injector = Injector.get();
        Context contextCreateLocalisedContext = new ContextLocaliser(injector.getAppConfigProvider()).createLocalisedContext(application);
        IntercomPushClientHandler.Companion companion = IntercomPushClientHandler.Companion;
        contextCreateLocalisedContext.getClass();
        companion.setUpNotificationChannels(contextCreateLocalisedContext);
        IntercomPushClientHandler intercomPushClientHandler = this.pushHandler;
        UserIdentity userIdentity = injector.getUserIdentity();
        userIdentity.getClass();
        intercomPushClientHandler.handlePush(bundle, contextCreateLocalisedContext, userIdentity, taskStackBuilder);
    }

    public final boolean isIntercomPush(Map<String, String> map) {
        map.getClass();
        return isIntercomPush(convertMessageMapToBundle(map));
    }

    public final void sendTokenToIntercom(Application application, String str) {
        application.getClass();
        str.getClass();
        if (z2a.w(str)) {
            this.twig.e("sendTokenToIntercom() was called with a null or empty token. This user will not receive push notifications until a valid device token is sent.", new Object[0]);
            return;
        }
        Injector.initIfCachedCredentials(application);
        if (Injector.isNotInitialised()) {
            this.twig.w("Token not sent because Intercom is not initialised", new Object[0]);
            return;
        }
        Injector injector = Injector.get();
        IntercomPushClientHandler intercomPushClientHandler = this.pushHandler;
        PushTokenStore pushTokenStore = injector.getPushTokenStore();
        pushTokenStore.getClass();
        if (intercomPushClientHandler.shouldSendDeviceToken(pushTokenStore, str)) {
            IntercomPushClientHandler intercomPushClientHandler2 = this.pushHandler;
            Api api = injector.getApi();
            api.getClass();
            UserIdentity userIdentity = injector.getUserIdentity();
            userIdentity.getClass();
            Provider<AppConfig> appConfigProvider = injector.getAppConfigProvider();
            appConfigProvider.getClass();
            PushTokenStore pushTokenStore2 = injector.getPushTokenStore();
            pushTokenStore2.getClass();
            intercomPushClientHandler2.sendTokenToIntercom(str, api, userIdentity, appConfigProvider, pushTokenStore2);
        }
    }

    public final boolean isIntercomPush(Bundle bundle) {
        bundle.getClass();
        return this.pushHandler.isIntercomPush(bundle);
    }

    public IntercomPushClient(Twig twig, IntercomPushClientHandler intercomPushClientHandler) {
        twig.getClass();
        intercomPushClientHandler.getClass();
        this.twig = twig;
        this.pushHandler = intercomPushClientHandler;
    }

    public final void handlePushWithCustomStack(Application application, Map<String, String> map, TaskStackBuilder taskStackBuilder) throws Throwable {
        application.getClass();
        map.getClass();
        taskStackBuilder.getClass();
        handlePushWithCustomStack(application, convertMessageMapToBundle(map), taskStackBuilder);
    }

    public final void handlePush(Application application, Map<String, String> map) throws Throwable {
        application.getClass();
        map.getClass();
        handlePush(application, convertMessageMapToBundle(map));
    }
}
