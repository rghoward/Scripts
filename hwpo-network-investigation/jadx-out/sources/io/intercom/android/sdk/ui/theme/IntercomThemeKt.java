package io.intercom.android.sdk.ui.theme;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.bj4;
import defpackage.ci4;
import defpackage.g2b;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.hf8;
import defpackage.jt1;
import defpackage.kf8;
import defpackage.nu1;
import defpackage.oi5;
import defpackage.tk6;
import defpackage.u;
import defpackage.uh1;
import defpackage.ul9;
import defpackage.xj8;
import defpackage.y0a;
import defpackage.zy1;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomThemeKt {
    private static final hf8<ul9> LocalShapes = new y0a(new oi5());

    public static final void IntercomTheme(IntercomColors intercomColors, final IntercomTypography intercomTypography, final ul9 ul9Var, final ci4<? super jt1, ? super Integer, g2b> ci4Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        final IntercomColors intercomColorsIntercomDarkColors;
        ThemeMode currentThemeMode;
        ci4Var.getClass();
        bj4 bj4VarO = jt1Var.o(163228735);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.J(intercomColors) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && bj4VarO.J(intercomTypography)) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ((i2 & 4) == 0 && bj4VarO.J(ul9Var)) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= bj4VarO.j(ci4Var) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((i3 & 1171) == 1170 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            bj4VarO.v0();
            if ((i & 1) == 0 || bj4VarO.c0()) {
                if (i4 != 0) {
                    intercomColors = null;
                }
                if ((i2 & 2) != 0) {
                    intercomTypography = IntercomTheme.INSTANCE.getTypography(bj4VarO, 6);
                }
                if ((i2 & 4) != 0) {
                    ul9Var = IntercomTheme.INSTANCE.getShapes(bj4VarO, 6);
                }
            } else {
                bj4VarO.u();
            }
            bj4VarO.V();
            bj4VarO.K(-541037209);
            if (intercomColors != null) {
                intercomColorsIntercomDarkColors = intercomColors;
            } else if (isDarkThemeInEditMode(bj4VarO, 0) || (currentThemeMode = ThemeManager.INSTANCE.getCurrentThemeMode()) == ThemeMode.DARK) {
                intercomColorsIntercomDarkColors = IntercomColorsKt.intercomDarkColors();
            } else if (currentThemeMode == ThemeMode.LIGHT) {
                intercomColorsIntercomDarkColors = IntercomColorsKt.intercomLightColors();
            } else {
                if (currentThemeMode != ThemeMode.SYSTEM) {
                    u.b();
                    return;
                }
                intercomColorsIntercomDarkColors = gz3.q(bj4VarO) ? IntercomColorsKt.intercomDarkColors() : IntercomColorsKt.intercomLightColors();
            }
            bj4VarO.U(false);
            nu1.b(new kf8[]{IntercomColorsKt.getLocalIntercomColors().a(intercomColorsIntercomDarkColors), IntercomTypographyKt.getLocalIntercomTypography().a(intercomTypography), zy1.a.a(new uh1(intercomColorsIntercomDarkColors.getText().m824getDefault0d7_KjU()))}, gr1.b(1689661311, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.theme.IntercomThemeKt.IntercomTheme.1
                public final void invoke(jt1 jt1Var2, int i5) {
                    if ((i5 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    tk6.b(IntercomColorsKt.toMaterialColors(intercomColorsIntercomDarkColors), ul9Var, IntercomTypographyKt.toMaterialTypography(intercomTypography), ci4Var, jt1Var2, 0);
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                    invoke(jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), bj4VarO, 56);
        }
        final IntercomColors intercomColors2 = intercomColors;
        final IntercomTypography intercomTypography2 = intercomTypography;
        final ul9 ul9Var2 = ul9Var;
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: pi5
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return IntercomThemeKt.IntercomTheme$lambda$0(intercomColors2, intercomTypography2, ul9Var2, ci4Var, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b IntercomTheme$lambda$0(IntercomColors intercomColors, IntercomTypography intercomTypography, ul9 ul9Var, ci4 ci4Var, int i, int i2, jt1 jt1Var, int i3) {
        IntercomTheme(intercomColors, intercomTypography, ul9Var, ci4Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ul9 LocalShapes$lambda$1() {
        return new ul9(0);
    }

    public static final hf8<ul9> getLocalShapes() {
        return LocalShapes;
    }

    private static final boolean isDarkThemeInEditMode(jt1 jt1Var, int i) {
        jt1Var.K(-320047698);
        boolean z = gz3.q(jt1Var) && ((View) jt1Var.F(AndroidCompositionLocals_androidKt.f)).isInEditMode();
        jt1Var.B();
        return z;
    }
}
