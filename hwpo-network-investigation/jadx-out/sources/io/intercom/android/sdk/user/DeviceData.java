package io.intercom.android.sdk.user;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.intercom.twig.BuildConfig;
import io.intercom.android.sdk.api.PlatformIdentifierUtilKt;
import io.intercom.android.sdk.identity.PushTokenStore;
import io.intercom.android.sdk.utilities.commons.DeviceUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class DeviceData {
    public static Map<String, Object> generateDeviceData(Context context, PushTokenStore pushTokenStore) {
        HashMap map = new HashMap();
        map.put("platform_version", Build.VERSION.RELEASE);
        map.put("sdk_type", PlatformIdentifierUtilKt.getPlatformIdentifier(context));
        map.put("platform", Build.MODEL);
        map.put("browser", "Intercom-Android-SDK");
        map.put("version", DeviceUtils.getAppVersion(context));
        map.put("application", getApplicationName(context));
        map.put("application_id", DeviceUtils.getAppName(context));
        map.put("language", Locale.getDefault().getDisplayLanguage());
        String pushToken = pushTokenStore.getPushToken();
        if (!pushToken.isEmpty()) {
            map.put("device_token", pushToken);
        }
        return map;
    }

    public static String getApplicationName(Context context) {
        CharSequence applicationLabel = BuildConfig.FLAVOR;
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getApplicationInfo().packageName, 0);
            if (applicationInfo != null) {
                applicationLabel = packageManager.getApplicationLabel(applicationInfo);
            }
            return applicationLabel.toString();
        } catch (PackageManager.NameNotFoundException unused) {
            return BuildConfig.FLAVOR;
        }
    }
}
