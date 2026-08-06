package io.intercom.android.sdk.survey;

import defpackage.a83;
import defpackage.al;
import defpackage.qq2;
import defpackage.uh1;
import defpackage.xj5;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class SurveyUiColors {
    public static final int $stable = 0;
    private final long background;
    private final long button;
    private final uh1 dropDownSelectedColor;
    private final long onBackground;
    private final long onButton;

    public /* synthetic */ SurveyUiColors(long j, long j2, long j3, long j4, uh1 uh1Var, int i, qq2 qq2Var) {
        this(j, j2, j3, j4, (i & 16) != 0 ? null : uh1Var, null);
    }

    /* JADX INFO: renamed from: copy-qa9m3tE$default, reason: not valid java name */
    public static /* synthetic */ SurveyUiColors m396copyqa9m3tE$default(SurveyUiColors surveyUiColors, long j, long j2, long j3, long j4, uh1 uh1Var, int i, Object obj) {
        if ((i & 1) != 0) {
            j = surveyUiColors.background;
        }
        long j5 = j;
        if ((i & 2) != 0) {
            j2 = surveyUiColors.onBackground;
        }
        return surveyUiColors.m402copyqa9m3tE(j5, j2, (i & 4) != 0 ? surveyUiColors.button : j3, (i & 8) != 0 ? surveyUiColors.onButton : j4, (i & 16) != 0 ? surveyUiColors.dropDownSelectedColor : uh1Var);
    }

    /* JADX INFO: renamed from: component1-0d7_KjU, reason: not valid java name */
    public final long m397component10d7_KjU() {
        return this.background;
    }

    /* JADX INFO: renamed from: component2-0d7_KjU, reason: not valid java name */
    public final long m398component20d7_KjU() {
        return this.onBackground;
    }

    /* JADX INFO: renamed from: component3-0d7_KjU, reason: not valid java name */
    public final long m399component30d7_KjU() {
        return this.button;
    }

    /* JADX INFO: renamed from: component4-0d7_KjU, reason: not valid java name */
    public final long m400component40d7_KjU() {
        return this.onButton;
    }

    /* JADX INFO: renamed from: component5-QN2ZGVo, reason: not valid java name */
    public final uh1 m401component5QN2ZGVo() {
        return this.dropDownSelectedColor;
    }

    /* JADX INFO: renamed from: copy-qa9m3tE, reason: not valid java name */
    public final SurveyUiColors m402copyqa9m3tE(long j, long j2, long j3, long j4, uh1 uh1Var) {
        return new SurveyUiColors(j, j2, j3, j4, uh1Var, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SurveyUiColors)) {
            return false;
        }
        SurveyUiColors surveyUiColors = (SurveyUiColors) obj;
        return uh1.c(this.background, surveyUiColors.background) && uh1.c(this.onBackground, surveyUiColors.onBackground) && uh1.c(this.button, surveyUiColors.button) && uh1.c(this.onButton, surveyUiColors.onButton) && xj5.a(this.dropDownSelectedColor, surveyUiColors.dropDownSelectedColor);
    }

    /* JADX INFO: renamed from: getBackground-0d7_KjU, reason: not valid java name */
    public final long m403getBackground0d7_KjU() {
        return this.background;
    }

    /* JADX INFO: renamed from: getButton-0d7_KjU, reason: not valid java name */
    public final long m404getButton0d7_KjU() {
        return this.button;
    }

    /* JADX INFO: renamed from: getButtonBorder-0d7_KjU, reason: not valid java name */
    public final long m405getButtonBorder0d7_KjU() {
        boolean zM839isDarkColor8_81llA = ColorExtensionsKt.m839isDarkColor8_81llA(this.button);
        long j = this.button;
        return zM839isDarkColor8_81llA ? ColorExtensionsKt.m842lighten8_81llA(j) : ColorExtensionsKt.m832darken8_81llA(j);
    }

    /* JADX INFO: renamed from: getDropDownSelectedColor-QN2ZGVo, reason: not valid java name */
    public final uh1 m406getDropDownSelectedColorQN2ZGVo() {
        return this.dropDownSelectedColor;
    }

    /* JADX INFO: renamed from: getOnBackground-0d7_KjU, reason: not valid java name */
    public final long m407getOnBackground0d7_KjU() {
        return this.onBackground;
    }

    /* JADX INFO: renamed from: getOnButton-0d7_KjU, reason: not valid java name */
    public final long m408getOnButton0d7_KjU() {
        return this.onButton;
    }

    public int hashCode() {
        long j = this.background;
        int i = uh1.l;
        int iC = al.c(this.onButton, al.c(this.button, al.c(this.onBackground, Long.hashCode(j) * 31, 31), 31), 31);
        uh1 uh1Var = this.dropDownSelectedColor;
        return iC + (uh1Var == null ? 0 : Long.hashCode(uh1Var.a));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SurveyUiColors(background=");
        a83.b(this.background, ", onBackground=", sb);
        a83.b(this.onBackground, ", button=", sb);
        a83.b(this.button, ", onButton=", sb);
        a83.b(this.onButton, ", dropDownSelectedColor=", sb);
        sb.append(this.dropDownSelectedColor);
        sb.append(')');
        return sb.toString();
    }

    private SurveyUiColors(long j, long j2, long j3, long j4, uh1 uh1Var) {
        this.background = j;
        this.onBackground = j2;
        this.button = j3;
        this.onButton = j4;
        this.dropDownSelectedColor = uh1Var;
    }

    public /* synthetic */ SurveyUiColors(long j, long j2, long j3, long j4, uh1 uh1Var, qq2 qq2Var) {
        this(j, j2, j3, j4, uh1Var);
    }
}
