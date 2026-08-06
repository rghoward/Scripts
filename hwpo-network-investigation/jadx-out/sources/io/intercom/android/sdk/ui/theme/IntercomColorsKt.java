package io.intercom.android.sdk.ui.theme;

import defpackage.bl7;
import defpackage.fi1;
import defpackage.h37;
import defpackage.hf8;
import defpackage.hi1;
import defpackage.qh5;
import defpackage.u7d;
import defpackage.uh1;
import defpackage.vh1;
import defpackage.y0a;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomColorsKt {
    private static final hf8<IntercomColors> LocalIntercomColors = new y0a(new qh5(0));
    private static h37<ThemeMode> currentThemeMode = bl7.i(ThemeMode.LIGHT);

    public static final h37<ThemeMode> getCurrentThemeMode() {
        return currentThemeMode;
    }

    /* JADX INFO: renamed from: getIntercomColors-nl4AeYM, reason: not valid java name */
    public static final IntercomColors m779getIntercomColorsnl4AeYM(long j, long j2, long j3, long j4, long j5, long j6, boolean z) {
        return z ? IntercomColors.m721copyTALst2k$default(intercomLightColors(), j, j2, j3, j4, j5, j6, null, null, null, null, null, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, false, -64, 7, null) : IntercomColors.m721copyTALst2k$default(intercomDarkColors(), j, j2, j3, j4, j5, j6, null, null, null, null, null, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, false, -64, 7, null);
    }

    public static final hf8<IntercomColors> getLocalIntercomColors() {
        return LocalIntercomColors;
    }

    public static final IntercomColors intercomDarkColors() {
        BaseColors baseColors = BaseColors.INSTANCE;
        long jM608getFallback0d7_KjU = baseColors.m608getFallback0d7_KjU();
        BaseColors.NewColorScheme newColorScheme = BaseColors.NewColorScheme.INSTANCE;
        return new IntercomColors(jM608getFallback0d7_KjU, newColorScheme.m623getGray250d7_KjU(), newColorScheme.m623getGray250d7_KjU(), newColorScheme.m632getGray9000d7_KjU(), newColorScheme.m632getGray9000d7_KjU(), newColorScheme.m623getGray250d7_KjU(), new IntercomBaseColors(newColorScheme.m632getGray9000d7_KjU(), newColorScheme.m631getGray8500d7_KjU(), newColorScheme.m632getGray9000d7_KjU(), null), new IntercomTextColors(newColorScheme.m626getGray500d7_KjU(), newColorScheme.m625getGray4000d7_KjU(), newColorScheme.m627getGray5000d7_KjU(), newColorScheme.m627getGray5000d7_KjU(), newColorScheme.m632getGray9000d7_KjU(), newColorScheme.m646getRed1000d7_KjU(), newColorScheme.m636getGreen500d7_KjU(), newColorScheme.m658getYellow500d7_KjU(), null), new IntercomIconColors(newColorScheme.m623getGray250d7_KjU(), newColorScheme.m625getGray4000d7_KjU(), newColorScheme.m627getGray5000d7_KjU(), newColorScheme.m627getGray5000d7_KjU(), newColorScheme.m632getGray9000d7_KjU(), newColorScheme.m646getRed1000d7_KjU(), newColorScheme.m634getGreen1000d7_KjU(), newColorScheme.m658getYellow500d7_KjU(), null), new IntercomContainerColors(newColorScheme.m631getGray8500d7_KjU(), newColorScheme.m629getGray7000d7_KjU(), newColorScheme.m631getGray8500d7_KjU(), newColorScheme.m646getRed1000d7_KjU(), newColorScheme.m611getBlue1000d7_KjU(), newColorScheme.m634getGreen1000d7_KjU(), newColorScheme.m623getGray250d7_KjU(), null), new IntercomBorderColors(newColorScheme.m631getGray8500d7_KjU(), newColorScheme.m629getGray7000d7_KjU(), null), new IntercomAlphaColors(uh1.b(0.1f, newColorScheme.m655getWhite0d7_KjU()), uh1.b(0.2f, newColorScheme.m655getWhite0d7_KjU()), uh1.b(0.3f, newColorScheme.m655getWhite0d7_KjU()), uh1.b(0.4f, newColorScheme.m655getWhite0d7_KjU()), uh1.b(0.5f, newColorScheme.m655getWhite0d7_KjU()), uh1.b(0.6f, newColorScheme.m655getWhite0d7_KjU()), uh1.b(0.7f, newColorScheme.m655getWhite0d7_KjU()), uh1.b(0.8f, newColorScheme.m655getWhite0d7_KjU()), uh1.b(0.9f, newColorScheme.m655getWhite0d7_KjU()), uh1.b(1.0f, newColorScheme.m655getWhite0d7_KjU()), uh1.b(0.1f, newColorScheme.m633getGray9500d7_KjU()), uh1.b(0.2f, newColorScheme.m633getGray9500d7_KjU()), uh1.b(0.3f, newColorScheme.m633getGray9500d7_KjU()), uh1.b(0.4f, newColorScheme.m633getGray9500d7_KjU()), uh1.b(0.5f, newColorScheme.m633getGray9500d7_KjU()), uh1.b(0.6f, newColorScheme.m633getGray9500d7_KjU()), uh1.b(0.7f, newColorScheme.m633getGray9500d7_KjU()), uh1.b(0.8f, newColorScheme.m633getGray9500d7_KjU()), uh1.b(0.9f, newColorScheme.m633getGray9500d7_KjU()), uh1.b(1.0f, newColorScheme.m633getGray9500d7_KjU()), null), baseColors.m603getBlack100d7_KjU(), newColorScheme.m631getGray8500d7_KjU(), baseColors.m603getBlack100d7_KjU(), u7d.d(4293256677L), u7d.d(4281216558L), baseColors.m603getBlack100d7_KjU(), baseColors.m605getBlack900d7_KjU(), newColorScheme.m621getGray1000d7_KjU(), uh1.b(0.5f, newColorScheme.m633getGray9500d7_KjU()), newColorScheme.m655getWhite0d7_KjU(), uh1.b(0.6f, newColorScheme.m633getGray9500d7_KjU()), baseColors.m604getBlack700d7_KjU(), uh1.b(0.02f, newColorScheme.m631getGray8500d7_KjU()), newColorScheme.m631getGray8500d7_KjU(), baseColors.m603getBlack100d7_KjU(), uh1.b(0.9f, newColorScheme.m631getGray8500d7_KjU()), uh1.b(0.7f, newColorScheme.m631getGray8500d7_KjU()), baseColors.m610getRed0d7_KjU(), baseColors.m607getBlue0d7_KjU(), baseColors.m609getGreenLighter200d7_KjU(), baseColors.m610getRed0d7_KjU(), u7d.d(4279176975L), false, null);
    }

    public static final IntercomColors intercomLightColors() {
        BaseColors baseColors = BaseColors.INSTANCE;
        long jM608getFallback0d7_KjU = baseColors.m608getFallback0d7_KjU();
        BaseColors.NewColorScheme newColorScheme = BaseColors.NewColorScheme.INSTANCE;
        return new IntercomColors(jM608getFallback0d7_KjU, newColorScheme.m655getWhite0d7_KjU(), baseColors.m602getBlack0d7_KjU(), newColorScheme.m655getWhite0d7_KjU(), newColorScheme.m655getWhite0d7_KjU(), baseColors.m602getBlack0d7_KjU(), new IntercomBaseColors(newColorScheme.m655getWhite0d7_KjU(), newColorScheme.m621getGray1000d7_KjU(), newColorScheme.m655getWhite0d7_KjU(), null), new IntercomTextColors(newColorScheme.m632getGray9000d7_KjU(), newColorScheme.m627getGray5000d7_KjU(), newColorScheme.m625getGray4000d7_KjU(), newColorScheme.m625getGray4000d7_KjU(), newColorScheme.m623getGray250d7_KjU(), newColorScheme.m651getRed6000d7_KjU(), newColorScheme.m639getGreen7000d7_KjU(), newColorScheme.m662getYellow8000d7_KjU(), null), new IntercomIconColors(newColorScheme.m632getGray9000d7_KjU(), newColorScheme.m627getGray5000d7_KjU(), newColorScheme.m625getGray4000d7_KjU(), newColorScheme.m625getGray4000d7_KjU(), newColorScheme.m623getGray250d7_KjU(), newColorScheme.m651getRed6000d7_KjU(), newColorScheme.m637getGreen5000d7_KjU(), newColorScheme.m662getYellow8000d7_KjU(), null), new IntercomContainerColors(newColorScheme.m621getGray1000d7_KjU(), newColorScheme.m622getGray2000d7_KjU(), newColorScheme.m655getWhite0d7_KjU(), newColorScheme.m650getRed5000d7_KjU(), newColorScheme.m615getBlue5000d7_KjU(), newColorScheme.m638getGreen6000d7_KjU(), newColorScheme.m632getGray9000d7_KjU(), null), new IntercomBorderColors(newColorScheme.m621getGray1000d7_KjU(), newColorScheme.m622getGray2000d7_KjU(), null), new IntercomAlphaColors(uh1.b(0.1f, newColorScheme.m633getGray9500d7_KjU()), uh1.b(0.2f, newColorScheme.m633getGray9500d7_KjU()), uh1.b(0.3f, newColorScheme.m633getGray9500d7_KjU()), uh1.b(0.4f, newColorScheme.m633getGray9500d7_KjU()), uh1.b(0.5f, newColorScheme.m633getGray9500d7_KjU()), uh1.b(0.6f, newColorScheme.m633getGray9500d7_KjU()), uh1.b(0.7f, newColorScheme.m633getGray9500d7_KjU()), uh1.b(0.8f, newColorScheme.m633getGray9500d7_KjU()), uh1.b(0.9f, newColorScheme.m633getGray9500d7_KjU()), uh1.b(1.0f, newColorScheme.m633getGray9500d7_KjU()), uh1.b(0.1f, newColorScheme.m655getWhite0d7_KjU()), uh1.b(0.2f, newColorScheme.m655getWhite0d7_KjU()), uh1.b(0.3f, newColorScheme.m655getWhite0d7_KjU()), uh1.b(0.4f, newColorScheme.m655getWhite0d7_KjU()), uh1.b(0.5f, newColorScheme.m655getWhite0d7_KjU()), uh1.b(0.6f, newColorScheme.m655getWhite0d7_KjU()), uh1.b(0.7f, newColorScheme.m655getWhite0d7_KjU()), uh1.b(0.8f, newColorScheme.m655getWhite0d7_KjU()), uh1.b(0.9f, newColorScheme.m655getWhite0d7_KjU()), uh1.b(1.0f, newColorScheme.m655getWhite0d7_KjU()), null), baseColors.m606getBlack950d7_KjU(), uh1.b(0.04f, baseColors.m602getBlack0d7_KjU()), baseColors.m606getBlack950d7_KjU(), u7d.d(4293256677L), newColorScheme.m655getWhite0d7_KjU(), u7d.d(4294440951L), baseColors.m605getBlack900d7_KjU(), newColorScheme.m621getGray1000d7_KjU(), uh1.b(0.5f, newColorScheme.m633getGray9500d7_KjU()), newColorScheme.m655getWhite0d7_KjU(), uh1.b(0.6f, newColorScheme.m633getGray9500d7_KjU()), baseColors.m604getBlack700d7_KjU(), uh1.b(0.02f, baseColors.m602getBlack0d7_KjU()), u7d.d(4292993505L), baseColors.m606getBlack950d7_KjU(), uh1.b(0.05f, baseColors.m602getBlack0d7_KjU()), u7d.d(4294375158L), baseColors.m610getRed0d7_KjU(), baseColors.m607getBlue0d7_KjU(), baseColors.m609getGreenLighter200d7_KjU(), baseColors.m610getRed0d7_KjU(), u7d.d(4279176975L), true, null);
    }

    public static final void setCurrentThemeMode(h37<ThemeMode> h37Var) {
        h37Var.getClass();
        currentThemeMode = h37Var;
    }

    public static final fi1 toMaterialColors(IntercomColors intercomColors) {
        intercomColors.getClass();
        if (intercomColors.isLight()) {
            return hi1.e(intercomColors.m751getAction0d7_KjU(), intercomColors.m769getOnAction0d7_KjU(), intercomColors.getBase().m712getBase0d7_KjU(), intercomColors.getText().m824getDefault0d7_KjU(), intercomColors.getBase().m712getBase0d7_KjU(), intercomColors.getText().m824getDefault0d7_KjU(), intercomColors.getBase().m712getBase0d7_KjU(), intercomColors.getText().m824getDefault0d7_KjU(), intercomColors.getBase().m712getBase0d7_KjU(), intercomColors.m766getError0d7_KjU(), -5234692);
        }
        long jM751getAction0d7_KjU = intercomColors.m751getAction0d7_KjU();
        long jM769getOnAction0d7_KjU = intercomColors.m769getOnAction0d7_KjU();
        long jM712getBase0d7_KjU = intercomColors.getBase().m712getBase0d7_KjU();
        long jM824getDefault0d7_KjU = intercomColors.getText().m824getDefault0d7_KjU();
        long jM712getBase0d7_KjU2 = intercomColors.getBase().m712getBase0d7_KjU();
        long jM824getDefault0d7_KjU2 = intercomColors.getText().m824getDefault0d7_KjU();
        long jM712getBase0d7_KjU3 = intercomColors.getBase().m712getBase0d7_KjU();
        long jM712getBase0d7_KjU4 = intercomColors.getBase().m712getBase0d7_KjU();
        long jM824getDefault0d7_KjU3 = intercomColors.getText().m824getDefault0d7_KjU();
        long jM766getError0d7_KjU = intercomColors.m766getError0d7_KjU();
        y0a y0aVar = hi1.a;
        return new fi1(jM751getAction0d7_KjU, jM769getOnAction0d7_KjU, vh1.t, vh1.g, vh1.c, vh1.x, vh1.j, vh1.y, vh1.k, vh1.I, vh1.n, vh1.J, vh1.o, jM712getBase0d7_KjU4, jM824getDefault0d7_KjU3, jM712getBase0d7_KjU, jM824getDefault0d7_KjU, jM712getBase0d7_KjU2, jM824getDefault0d7_KjU2, jM712getBase0d7_KjU3, vh1.d, vh1.b, jM766getError0d7_KjU, vh1.e, vh1.a, vh1.f, vh1.r, vh1.s, vh1.w, vh1.B, vh1.H, vh1.C, vh1.D, vh1.E, vh1.F, vh1.G, vh1.u, vh1.v, vh1.h, vh1.i, vh1.z, vh1.A, vh1.l, vh1.m, vh1.K, vh1.L, vh1.p, vh1.q);
    }
}
