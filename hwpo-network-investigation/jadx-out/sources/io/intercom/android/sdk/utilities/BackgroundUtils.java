package io.intercom.android.sdk.utilities;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class BackgroundUtils {
    public static void setBackground(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static void setButtonColor(TextView textView, int i) {
        int iButtonTextColorVariant = ColorUtils.buttonTextColorVariant(i);
        int iButtonBackgroundColorVariant = ColorUtils.buttonBackgroundColorVariant(i);
        textView.setTextColor(iButtonTextColorVariant);
        textView.getBackground().setColorFilter(iButtonBackgroundColorVariant, PorterDuff.Mode.SRC_ATOP);
    }
}
