package io.intercom.android.sdk.utilities;

import android.app.Activity;
import defpackage.w2a;
import io.intercom.android.sdk.Intercom;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ActivityUtils {
    public static final int $stable;
    public static final ActivityUtils INSTANCE = new ActivityUtils();
    private static final String[] INTERCOM_PACKAGES;
    private static final String PACKAGE_NAME;

    static {
        String name = Intercom.class.getPackage().getName();
        PACKAGE_NAME = name;
        INTERCOM_PACKAGES = new String[]{name};
        $stable = 8;
    }

    private ActivityUtils() {
    }

    public static final boolean isHostActivity(Activity activity) {
        return activity != null && INSTANCE.isInHostAppPackage(activity.getClass().getName());
    }

    private final boolean isInHostAppPackage(String str) {
        for (String str2 : INTERCOM_PACKAGES) {
            str2.getClass();
            if (w2a.n(str, str2, false)) {
                return false;
            }
        }
        return true;
    }
}
