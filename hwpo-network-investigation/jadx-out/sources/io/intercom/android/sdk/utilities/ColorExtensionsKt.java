package io.intercom.android.sdk.utilities;

import defpackage.u7d;
import defpackage.uh1;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ColorExtensionsKt {
    private static final float BRIGHTNESS_CUTOFF = 0.6f;
    private static final float WHITENESS_CUTOFF = 0.9411765f;

    /* JADX INFO: renamed from: darken-8_81llA, reason: not valid java name */
    public static final long m832darken8_81llA(long j) {
        return u7d.c(ColorUtils.darkenColor(u7d.l(j)));
    }

    /* JADX INFO: renamed from: generateTextColor-8_81llA, reason: not valid java name */
    public static final long m833generateTextColor8_81llA(long j) {
        if (m839isDarkColor8_81llA(j)) {
            int i = uh1.l;
            return uh1.e;
        }
        int i2 = uh1.l;
        return uh1.b;
    }

    /* JADX INFO: renamed from: getAccessibleBorderColor-8_81llA, reason: not valid java name */
    public static final long m834getAccessibleBorderColor8_81llA(long j) {
        return m839isDarkColor8_81llA(j) ? m842lighten8_81llA(j) : m832darken8_81llA(j);
    }

    /* JADX INFO: renamed from: getAccessibleColorOnDarkBackground-8_81llA, reason: not valid java name */
    public static final long m835getAccessibleColorOnDarkBackground8_81llA(long j) {
        return m839isDarkColor8_81llA(j) ? m842lighten8_81llA(j) : j;
    }

    /* JADX INFO: renamed from: getAccessibleColorOnWhiteBackground-8_81llA, reason: not valid java name */
    public static final long m836getAccessibleColorOnWhiteBackground8_81llA(long j) {
        if (!m838isColorTooWhite8_81llA(j)) {
            return j;
        }
        int i = uh1.l;
        return uh1.b;
    }

    /* JADX INFO: renamed from: isBlack-8_81llA, reason: not valid java name */
    public static final boolean m837isBlack8_81llA(long j) {
        int i = uh1.l;
        return uh1.c(j, uh1.b);
    }

    /* JADX INFO: renamed from: isColorTooWhite-8_81llA, reason: not valid java name */
    private static final boolean m838isColorTooWhite8_81llA(long j) {
        return uh1.h(j) >= WHITENESS_CUTOFF && uh1.g(j) >= WHITENESS_CUTOFF && uh1.e(j) >= WHITENESS_CUTOFF;
    }

    /* JADX INFO: renamed from: isDarkColor-8_81llA, reason: not valid java name */
    public static final boolean m839isDarkColor8_81llA(long j) {
        return u7d.k(j) < BRIGHTNESS_CUTOFF;
    }

    /* JADX INFO: renamed from: isLightColor-8_81llA, reason: not valid java name */
    public static final boolean m840isLightColor8_81llA(long j) {
        return !m839isDarkColor8_81llA(j);
    }

    /* JADX INFO: renamed from: isWhite-8_81llA, reason: not valid java name */
    public static final boolean m841isWhite8_81llA(long j) {
        int i = uh1.l;
        return uh1.c(j, uh1.e);
    }

    /* JADX INFO: renamed from: lighten-8_81llA, reason: not valid java name */
    public static final long m842lighten8_81llA(long j) {
        return u7d.c(ColorUtils.lightenColor(u7d.l(j)));
    }

    public static final long toComposeColor(String str, float f) {
        str.getClass();
        return uh1.b(f, u7d.c(ColorUtils.parseColor(str)));
    }

    public static /* synthetic */ long toComposeColor$default(String str, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return toComposeColor(str, f);
    }
}
