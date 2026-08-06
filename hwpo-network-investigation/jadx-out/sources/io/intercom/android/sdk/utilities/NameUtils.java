package io.intercom.android.sdk.utilities;

import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class NameUtils {
    public static String getInitial(String str) {
        String strTrim = str.trim();
        return strTrim.isEmpty() ? BuildConfig.FLAVOR : String.valueOf(strTrim.charAt(0));
    }
}
