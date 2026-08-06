package io.intercom.android.sdk.utilities;

import android.content.Context;
import android.net.Uri;
import defpackage.gz3;
import defpackage.h37;
import defpackage.jt1;
import defpackage.u;
import io.intercom.android.sdk.ui.theme.ThemeManager;
import io.intercom.android.sdk.ui.theme.ThemeMode;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ThemeUtils {
    public static final int $stable = 0;
    public static final ThemeUtils INSTANCE = new ThemeUtils();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ThemeMode.values().length];
            try {
                iArr[ThemeMode.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ThemeMode.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ThemeMode.SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private ThemeUtils() {
    }

    public static final String appendInterfaceStyleToUrl(Context context, String str) {
        context.getClass();
        str.getClass();
        String string = Uri.parse(str).buildUpon().appendQueryParameter("theme", isDarkMode$intercom_sdk_base_release(context) ? "dark" : "light").build().toString();
        string.getClass();
        return string;
    }

    public static final boolean isDarkMode$intercom_sdk_base_release(Context context) {
        context.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
        if (i == 1) {
            return true;
        }
        if (i != 2) {
            if (i == 3) {
                return (context.getResources().getConfiguration().uiMode & 48) == 32;
            }
            u.b();
        }
        return false;
    }

    private static final ThemeMode isDarkModeCompose$lambda$0(h37<ThemeMode> h37Var) {
        return h37Var.getValue();
    }

    public static final String selectColorForTheme(Context context, String str, String str2) {
        context.getClass();
        str.getClass();
        return (!isDarkMode$intercom_sdk_base_release(context) || str2 == null || str2.length() == 0) ? str : str2;
    }

    public static final String selectHeaderBackgroundImageUrl$intercom_sdk_base_release(Context context, String str, String str2) {
        context.getClass();
        return selectUrlForTheme(context, str, str2);
    }

    public static final String selectHeaderLogoUrl$intercom_sdk_base_release(Context context, String str, String str2) {
        context.getClass();
        return (!isDarkMode$intercom_sdk_base_release(context) || str2 == null) ? str : str2;
    }

    public static final String selectLauncherLogoUrl(Context context, String str, String str2, String str3) {
        context.getClass();
        if (!isDarkMode$intercom_sdk_base_release(context) || str2 == null || str2.length() == 0) {
            return (str == null || str.length() == 0) ? str3 : str;
        }
        return str2;
    }

    public static /* synthetic */ String selectLauncherLogoUrl$default(Context context, String str, String str2, String str3, int i, Object obj) {
        if ((i & 8) != 0) {
            str3 = null;
        }
        return selectLauncherLogoUrl(context, str, str2, str3);
    }

    public static final String selectUrlForTheme(Context context, String str, String str2) {
        context.getClass();
        return (!isDarkMode$intercom_sdk_base_release(context) || str2 == null || str2.length() == 0) ? str : str2;
    }

    public final boolean isDarkModeCompose$intercom_sdk_base_release(jt1 jt1Var, int i) {
        boolean zQ;
        jt1Var.K(121228161);
        ThemeMode themeModeIsDarkModeCompose$lambda$0 = isDarkModeCompose$lambda$0(ThemeManager.INSTANCE.getThemeModeState());
        if (themeModeIsDarkModeCompose$lambda$0 == ThemeMode.DARK) {
            zQ = true;
        } else if (themeModeIsDarkModeCompose$lambda$0 == ThemeMode.LIGHT) {
            zQ = false;
        } else {
            if (themeModeIsDarkModeCompose$lambda$0 != ThemeMode.SYSTEM) {
                u.b();
                return false;
            }
            zQ = gz3.q(jt1Var);
        }
        jt1Var.B();
        return zQ;
    }

    public final String selectColorForThemeCompose$intercom_sdk_base_release(String str, String str2, jt1 jt1Var, int i) {
        str.getClass();
        jt1Var.K(-1398327784);
        if (isDarkModeCompose$intercom_sdk_base_release(jt1Var, (i >> 6) & 14) && str2 != null && str2.length() != 0) {
            str = str2;
        }
        jt1Var.B();
        return str;
    }

    public final String selectUrlForThemeCompose$intercom_sdk_base_release(String str, String str2, jt1 jt1Var, int i) {
        jt1Var.K(1242850468);
        if (isDarkModeCompose$intercom_sdk_base_release(jt1Var, (i >> 6) & 14) && str2 != null && str2.length() != 0) {
            str = str2;
        }
        jt1Var.B();
        return str;
    }

    public static final String selectLauncherLogoUrl(Context context, String str, String str2) {
        context.getClass();
        return selectLauncherLogoUrl$default(context, str, str2, null, 8, null);
    }
}
