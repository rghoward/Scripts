package io.intercom.android.sdk.utilities;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.widget.ImageView;
import android.widget.TextView;
import defpackage.vi1;
import defpackage.y24;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.identity.AppConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class ColorUtils {
    private static final double ACCESSIBILITY_CONTRAST_RATIO = 4.5d;
    private static final float BRIGHTNESS_CUTOFF = 0.7f;
    private static final char COLOR_PREFIX = '#';
    private static final String SHORT_COLOR_REGEX = "#([0-9a-fA-F])([0-9a-fA-F])([0-9a-fA-F])";
    private static final int SHORT_COLOR_WITH_PREFIX_LENGTH = 4;

    public static int buttonBackgroundColorVariant(int i) {
        float[] fArr = new float[3];
        vi1.d(i, fArr);
        float f = fArr[2];
        float f2 = 0.95f - f;
        float f3 = f - 0.85f;
        double d = f;
        if (d > 0.9d) {
            return darkenColor(i, f3);
        }
        return d < 0.35d ? lightenColor(i, f2) : lightenColor(i, f2);
    }

    public static int buttonTextColorVariant(int i) {
        float[] fArr = new float[3];
        vi1.d(i, fArr);
        float f = fArr[2];
        float f2 = f - 0.3f;
        double d = f;
        if (d > 0.9d) {
            return darkenColor(i, f2);
        }
        return d < 0.35d ? i : darkenColor(i, f2);
    }

    private static int darkColorRes() {
        return R.color.intercom_accessibility_black;
    }

    public static int darkenColor(int i, float f) {
        float[] fArr = {0.0f, 0.0f, f};
        vi1.d(i, fArr);
        float f2 = fArr[2] - f;
        fArr[2] = Math.max(0.0f, Math.min(f2, 1.0f));
        return vi1.a(fArr);
    }

    public static int desaturateColor(int i, float f) {
        float[] fArr = {0.0f, f, 0.0f};
        vi1.d(i, fArr);
        float f2 = fArr[1] - f;
        fArr[1] = Math.max(0.0f, Math.min(f2, 1.0f));
        return vi1.a(fArr);
    }

    public static boolean isColorLight(int i) {
        return 1.05d / (vi1.c(i) + 0.05d) < ACCESSIBILITY_CONTRAST_RATIO;
    }

    public static boolean isComparedColorsLowerThanAccessibilityContrastRatio(int i, int i2) {
        ThreadLocal<double[]> threadLocal = vi1.a;
        if (Color.alpha(i2) != 255) {
            y24.b(Integer.toHexString(i2), "background can not be translucent: #");
            return false;
        }
        if (Color.alpha(i) < 255) {
            i = vi1.e(i, i2);
        }
        double dC = vi1.c(i) + 0.05d;
        double dC2 = vi1.c(i2) + 0.05d;
        return Math.max(dC, dC2) / Math.min(dC, dC2) < ACCESSIBILITY_CONTRAST_RATIO;
    }

    public static int lightenColor(int i) {
        return Color.argb(Color.alpha(i), (Color.red(i) + 255) / 2, (Color.green(i) + 255) / 2, (Color.blue(i) + 255) / 2);
    }

    public static ColorFilter newGreyscaleFilter() {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        return new ColorMatrixColorFilter(colorMatrix);
    }

    public static int parseColor(String str) {
        if (str.length() == 4 && str.charAt(0) == '#') {
            str = str.replaceAll(SHORT_COLOR_REGEX, "#$1$1$2$2$3$3");
        }
        return Color.parseColor(str);
    }

    public static int primaryOrBlackAccessibility(Context context, AppConfig appConfig) {
        return isColorLight(appConfig.getPrimaryColor()) ? context.getColor(R.color.intercom_accessibility_black) : appConfig.getPrimaryColor();
    }

    private static int primaryOrBlackColor(Context context, AppConfig appConfig) {
        return appConfig.isPrimaryColorRenderDarkText() ? context.getColor(R.color.intercom_black) : appConfig.getPrimaryColor();
    }

    public static int primaryOrDarkColor(Context context, AppConfig appConfig) {
        return appConfig.isPrimaryColorRenderDarkText() ? context.getColor(darkColorRes()) : appConfig.getPrimaryColor();
    }

    public static void setImageColorWhiteOrBlack(ImageView imageView, boolean z) {
        imageView.setColorFilter(whiteOrBlackColor(imageView.getContext(), z));
    }

    public static void setTextColorPrimaryOrBlack(TextView textView, AppConfig appConfig) {
        int iPrimaryOrBlackColor = primaryOrBlackColor(textView.getContext(), appConfig);
        textView.setTextColor(iPrimaryOrBlackColor);
        textView.setLinkTextColor(iPrimaryOrBlackColor);
    }

    public static void setTextColorPrimaryOrDark(TextView textView, AppConfig appConfig) {
        int iPrimaryOrDarkColor = primaryOrDarkColor(textView.getContext(), appConfig);
        textView.setTextColor(iPrimaryOrDarkColor);
        textView.setLinkTextColor(iPrimaryOrDarkColor);
    }

    public static void setTextColorWhiteOrBlack(TextView textView, boolean z) {
        int iWhiteOrBlackColor = whiteOrBlackColor(textView.getContext(), z);
        textView.setTextColor(iWhiteOrBlackColor);
        textView.setLinkTextColor(iWhiteOrBlackColor);
    }

    public static void setTextColorWhiteOrDark(TextView textView, boolean z) {
        int iWhiteOrDarkColor = whiteOrDarkColor(textView.getContext(), z);
        textView.setTextColor(iWhiteOrDarkColor);
        textView.setLinkTextColor(iWhiteOrDarkColor);
    }

    public static int whiteOrBlackAccessibility(Context context, AppConfig appConfig) {
        return isColorLight(appConfig.getPrimaryColor()) ? context.getColor(R.color.intercom_accessibility_black) : context.getColor(R.color.intercom_white);
    }

    public static int whiteOrBlackColor(Context context, boolean z) {
        return context.getColor(z ? R.color.intercom_accessibility_black : R.color.intercom_white);
    }

    public static int whiteOrDarkColor(Context context, boolean z) {
        return z ? context.getColor(darkColorRes()) : context.getColor(R.color.intercom_white);
    }

    public static boolean isColorLight(String str) {
        return vi1.c(Color.parseColor(str)) > 0.699999988079071d;
    }

    public static int darkenColor(int i) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        fArr[2] = fArr[2] * 0.79f;
        return Color.HSVToColor(fArr);
    }

    public static int lightenColor(int i, float f) {
        float[] fArr = {0.0f, 0.0f, f};
        vi1.d(i, fArr);
        float f2 = fArr[2] + f;
        fArr[2] = Math.max(0.0f, Math.min(f2, 1.0f));
        return vi1.a(fArr);
    }
}
