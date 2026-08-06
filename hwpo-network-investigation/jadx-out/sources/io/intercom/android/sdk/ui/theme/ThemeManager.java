package io.intercom.android.sdk.ui.theme;

import defpackage.h37;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ThemeManager {
    private static ThemeMode sessionOverride;
    public static final ThemeManager INSTANCE = new ThemeManager();
    private static ThemeMode serverTheme = ThemeMode.LIGHT;
    public static final int $stable = 8;

    private ThemeManager() {
    }

    private final void updateCurrentTheme() {
        IntercomColorsKt.getCurrentThemeMode().setValue(getCurrentThemeMode());
    }

    public final void clearSessionOverride() {
        sessionOverride = null;
        updateCurrentTheme();
    }

    public final ThemeMode getCurrentThemeMode() {
        ThemeMode themeMode = sessionOverride;
        return themeMode == null ? serverTheme : themeMode;
    }

    public final h37<ThemeMode> getThemeModeState() {
        return IntercomColorsKt.getCurrentThemeMode();
    }

    public final void initialize() {
        sessionOverride = null;
        updateCurrentTheme();
    }

    public final void setSessionOverride(ThemeMode themeMode) {
        themeMode.getClass();
        sessionOverride = themeMode;
        updateCurrentTheme();
    }

    public final void setThemeModeForTesting(ThemeMode themeMode) {
        themeMode.getClass();
        setSessionOverride(themeMode);
    }

    public final void updateServerTheme(ThemeMode themeMode) {
        themeMode.getClass();
        serverTheme = themeMode;
        updateCurrentTheme();
    }
}
