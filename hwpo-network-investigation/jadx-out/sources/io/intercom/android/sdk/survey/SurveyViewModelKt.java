package io.intercom.android.sdk.survey;

import defpackage.u7d;
import io.intercom.android.sdk.survey.model.SurveyCustomization;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.intercom.android.sdk.utilities.ColorUtils;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class SurveyViewModelKt {
    public static final SurveyUiColors toSurveyUiColors(SurveyCustomization surveyCustomization) {
        surveyCustomization.getClass();
        long jC = u7d.c(ColorUtils.parseColor(surveyCustomization.getBackgroundColor()));
        long jC2 = u7d.c(ColorUtils.parseColor(surveyCustomization.getButtonColor()));
        return new SurveyUiColors(jC, ColorExtensionsKt.m833generateTextColor8_81llA(jC), jC2, ColorExtensionsKt.m833generateTextColor8_81llA(jC2), null, 16, null);
    }
}
