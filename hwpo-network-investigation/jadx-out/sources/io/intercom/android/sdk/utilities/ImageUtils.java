package io.intercom.android.sdk.utilities;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class ImageUtils {
    public static int getAspectHeight(int i, double d) {
        return (int) (((double) i) * d);
    }

    public static double getAspectRatio(int i, int i2) {
        if (i2 == 0 || i == 0) {
            return 1.0d;
        }
        double d = (((double) i2) * 1.0d) / ((double) i);
        if (Double.isNaN(d)) {
            return 0.0d;
        }
        return d;
    }

    public static boolean isGif(String str) {
        return !TextUtils.isEmpty(str) && str.endsWith(".gif");
    }
}
