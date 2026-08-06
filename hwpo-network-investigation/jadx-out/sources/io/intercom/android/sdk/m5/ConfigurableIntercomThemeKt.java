package io.intercom.android.sdk.m5;

import defpackage.bj4;
import defpackage.ci4;
import defpackage.g2b;
import defpackage.gz3;
import defpackage.jt1;
import defpackage.u;
import defpackage.uh1;
import defpackage.xj8;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.ConfigurableIntercomThemeKt;
import io.intercom.android.sdk.models.ConfigModules;
import io.intercom.android.sdk.models.CustomizationColorsModel;
import io.intercom.android.sdk.models.CustomizationModel;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomColorsKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.ThemeManager;
import io.intercom.android.sdk.ui.theme.ThemeMode;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.intercom.android.sdk.utilities.ThemeUtils;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ConfigurableIntercomThemeKt {
    /* JADX WARN: Code duplicated, block: B:32:0x0073  */
    public static final void ConfigurableIntercomTheme(final AppConfig appConfig, final ci4<? super jt1, ? super Integer, g2b> ci4Var, jt1 jt1Var, final int i) {
        int i2;
        boolean z;
        CustomizationColorsModel actionContrastDark;
        boolean z2;
        appConfig.getClass();
        ci4Var.getClass();
        bj4 bj4VarO = jt1Var.o(180143044);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.j(appConfig) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.j(ci4Var) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            ConfigModules configModules = appConfig.getConfigModules();
            IntercomColors intercomColorsM779getIntercomColorsnl4AeYM = null;
            CustomizationModel customization = configModules != null ? configModules.getCustomization() : null;
            bj4VarO.K(-1126606345);
            if (customization == null) {
                i2 = i2;
                z2 = false;
            } else {
                ThemeMode currentThemeMode = ThemeManager.INSTANCE.getCurrentThemeMode();
                bj4VarO.K(-1126607475);
                if (currentThemeMode != ThemeMode.DARK) {
                    if (currentThemeMode != ThemeMode.LIGHT) {
                        if (currentThemeMode != ThemeMode.SYSTEM) {
                            u.b();
                            return;
                        } else if (gz3.q(bj4VarO)) {
                            z = false;
                        }
                    }
                    z = true;
                } else {
                    z = false;
                }
                bj4VarO.U(false);
                ThemeUtils themeUtils = ThemeUtils.INSTANCE;
                long composeColor$default = ColorExtensionsKt.toComposeColor$default(themeUtils.selectColorForThemeCompose$intercom_sdk_base_release(customization.getAction().getBackgroundColor(), customization.getAction().getBackgroundColorDark(), bj4VarO, 384), 0.0f, 1, null);
                long composeColor$default2 = ColorExtensionsKt.toComposeColor$default(themeUtils.selectColorForThemeCompose$intercom_sdk_base_release(customization.getAction().getForegroundColor(), customization.getAction().getForegroundColorDark(), bj4VarO, 384), 0.0f, 1, null);
                if (z || (actionContrastDark = customization.getActionContrastDark()) == null) {
                    actionContrastDark = customization.getActionContrastWhite();
                }
                bj4VarO.K(-1126577992);
                uh1 uh1Var = actionContrastDark == null ? null : new uh1(ColorExtensionsKt.toComposeColor$default(themeUtils.selectColorForThemeCompose$intercom_sdk_base_release(actionContrastDark.getBackgroundColor(), actionContrastDark.getBackgroundColorDark(), bj4VarO, 384), 0.0f, 1, null));
                bj4VarO.U(false);
                long j = uh1Var != null ? uh1Var.a : composeColor$default;
                bj4VarO.K(-1126568904);
                uh1 uh1Var2 = actionContrastDark == null ? null : new uh1(ColorExtensionsKt.toComposeColor$default(themeUtils.selectColorForThemeCompose$intercom_sdk_base_release(actionContrastDark.getForegroundColor(), actionContrastDark.getForegroundColorDark(), bj4VarO, 384), 0.0f, 1, null));
                bj4VarO.U(false);
                CustomizationModel customizationModel = customization;
                intercomColorsM779getIntercomColorsnl4AeYM = IntercomColorsKt.m779getIntercomColorsnl4AeYM(composeColor$default, composeColor$default2, j, uh1Var2 != null ? uh1Var2.a : composeColor$default2, ColorExtensionsKt.toComposeColor$default(themeUtils.selectColorForThemeCompose$intercom_sdk_base_release(customization.getHeader().getBackgroundColor(), customization.getHeader().getBackgroundColorDark(), bj4VarO, 384), 0.0f, 1, null), ColorExtensionsKt.toComposeColor$default(themeUtils.selectColorForThemeCompose$intercom_sdk_base_release(customizationModel.getHeader().getForegroundColor(), customizationModel.getHeader().getForegroundColorDark(), bj4VarO, 384), 0.0f, 1, null), z);
                z2 = false;
            }
            bj4VarO.U(z2);
            bj4VarO.K(-1126607561);
            if (intercomColorsM779getIntercomColorsnl4AeYM == null) {
                intercomColorsM779getIntercomColorsnl4AeYM = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable);
            }
            bj4VarO.U(z2);
            IntercomThemeKt.IntercomTheme(intercomColorsM779getIntercomColorsnl4AeYM, null, null, ci4Var, bj4VarO, (i2 << 6) & 7168, 6);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: uv1
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return ConfigurableIntercomThemeKt.ConfigurableIntercomTheme$lambda$3(appConfig, ci4Var, i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ConfigurableIntercomTheme$lambda$3(AppConfig appConfig, ci4 ci4Var, int i, jt1 jt1Var, int i2) {
        ConfigurableIntercomTheme(appConfig, ci4Var, jt1Var, gz3.s(i | 1));
        return g2b.a;
    }
}
