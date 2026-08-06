package io.intercom.android.sdk.ui.theme;

import defpackage.jt1;
import defpackage.ul9;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomTheme {
    public static final int $stable = 0;
    public static final IntercomTheme INSTANCE = new IntercomTheme();

    private IntercomTheme() {
    }

    public final IntercomColors getColors(jt1 jt1Var, int i) {
        jt1Var.K(159743073);
        IntercomColors intercomColors = (IntercomColors) jt1Var.F(IntercomColorsKt.getLocalIntercomColors());
        jt1Var.B();
        return intercomColors;
    }

    public final ul9 getShapes(jt1 jt1Var, int i) {
        jt1Var.K(-474718694);
        ul9 ul9Var = (ul9) jt1Var.F(IntercomThemeKt.getLocalShapes());
        jt1Var.B();
        return ul9Var;
    }

    public final IntercomTypography getTypography(jt1 jt1Var, int i) {
        jt1Var.K(-989585502);
        IntercomTypography intercomTypography = (IntercomTypography) jt1Var.F(IntercomTypographyKt.getLocalIntercomTypography());
        jt1Var.B();
        return intercomTypography;
    }
}
