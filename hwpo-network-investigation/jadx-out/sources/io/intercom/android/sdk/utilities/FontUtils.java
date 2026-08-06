package io.intercom.android.sdk.utilities;

import android.graphics.Typeface;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class FontUtils {
    public static void setRobotoLightTypeface(TextView textView) {
        textView.setTypeface(Typeface.create("sans-serif-light", 0));
    }

    public static void setRobotoMediumTypeface(TextView textView) {
        textView.setTypeface(Typeface.create("sans-serif-medium", 0));
    }
}
