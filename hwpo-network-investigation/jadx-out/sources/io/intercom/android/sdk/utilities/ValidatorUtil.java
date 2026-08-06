package io.intercom.android.sdk.utilities;

import android.app.Application;
import com.intercom.twig.Twig;
import defpackage.sk0;
import io.intercom.android.sdk.api.ApiFactory;
import io.intercom.android.sdk.logger.LumberMill;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class ValidatorUtil {
    private static final String API_PREFIX = "android_sdk-";
    private static final Twig twig = LumberMill.getLogger();

    public static boolean apiKeyIsMissingPrefix(String str) {
        return str == null || !str.startsWith(API_PREFIX);
    }

    public static boolean apiKeyIsTooShort(String str) {
        return str == null || str.length() < 52;
    }

    private static boolean appIdIsInvalid(String str) {
        return str == null || ApiFactory.INSTANCE.removeInvalidCharacters(str).isEmpty();
    }

    public static boolean isValidAppIdParams(String str, String str2) {
        boolean z;
        if (appIdIsInvalid(str2)) {
            twig.e(sk0.c("The app ID (", str2, ") you provided is either null or empty. We need a valid app ID to enable Intercom in your app"), new Object[0]);
            z = false;
        } else {
            z = true;
        }
        if (apiKeyIsTooShort(str)) {
            twig.e(sk0.c("The API key provided (", str, ") is too short.\nPlease check that you are using an Intercom Android SDK key and have not passed the appId into the apiKey field\n"), new Object[0]);
            z = false;
        }
        if (!apiKeyIsMissingPrefix(str)) {
            return z;
        }
        twig.e(sk0.c("The API key provided (", str, ") does not begin with 'android_sdk-'.\nPlease check that you are using an Intercom Android SDK key and have not passed the appId into the apiKey field\n"), new Object[0]);
        return false;
    }

    public static boolean isValidConstructorParams(Application application, String str, String str2) {
        boolean z;
        if (application == null) {
            twig.e("The Application passed in was null.We need an Application to enable Intercom in your app", new Object[0]);
            z = false;
        } else {
            z = true;
        }
        if (appIdIsInvalid(str2)) {
            twig.e(sk0.c("The app ID (", str2, ") you provided is either null or empty. We need a valid app ID to enable Intercom in your app"), new Object[0]);
            z = false;
        }
        if (apiKeyIsTooShort(str)) {
            twig.e(sk0.c("The API key provided (", str, ") is too short.\nPlease check that you are using an Intercom Android SDK key and have not passed the appId into the apiKey field\n"), new Object[0]);
            z = false;
        }
        if (!apiKeyIsMissingPrefix(str)) {
            return z;
        }
        twig.e(sk0.c("The API key provided (", str, ") does not begin with 'android_sdk-'.\nPlease check that you are using an Intercom Android SDK key and have not passed the appId into the apiKey field\n"), new Object[0]);
        return false;
    }
}
