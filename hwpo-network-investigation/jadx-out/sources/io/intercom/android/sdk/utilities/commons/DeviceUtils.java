package io.intercom.android.sdk.utilities.commons;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class DeviceUtils {
    public static String getAppMinSdkVersionVersion(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo;
            return applicationInfo != null ? String.valueOf(applicationInfo.minSdkVersion) : BuildConfig.FLAVOR;
        } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            return BuildConfig.FLAVOR;
        }
    }

    public static String getAppName(Context context) {
        String packageName = context.getPackageName();
        return packageName == null ? BuildConfig.FLAVOR : packageName;
    }

    public static String getAppVersion(Context context) {
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            return str != null ? str : BuildConfig.FLAVOR;
        } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            return BuildConfig.FLAVOR;
        }
    }

    public static boolean hasPermission(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }
}
