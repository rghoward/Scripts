package io.intercom.android.sdk;

import android.app.Application;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.fcm.IntercomFcmMessengerService;
import io.intercom.android.sdk.logger.LumberMill;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class IntercomPushManager {
    private static final Twig TWIG = LumberMill.getLogger();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public enum IntercomPushIntegrationType {
        FCM,
        NONE
    }

    private static boolean fcmModuleInstalled() {
        return getFcmServiceClass() != null;
    }

    private static Class getFcmServiceClass() {
        try {
            int i = IntercomFcmMessengerService.t;
            return IntercomFcmMessengerService.class;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static IntercomPushIntegrationType getInstalledModuleType() {
        IntercomPushIntegrationType intercomPushIntegrationType = IntercomPushIntegrationType.NONE;
        if (!fcmModuleInstalled()) {
            return intercomPushIntegrationType;
        }
        TWIG.internal("FCM is installed");
        return IntercomPushIntegrationType.FCM;
    }

    public static void initializeFcmService(Application application) {
        Class fcmServiceClass = getFcmServiceClass();
        if (fcmServiceClass != null) {
            try {
                fcmServiceClass.getDeclaredMethod("initialize", Application.class).invoke(null, application);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                TWIG.internal("FCM is installed but initialize method was not found");
            }
        }
    }
}
