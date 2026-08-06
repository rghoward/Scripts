package io.intercom.android.sdk.survey.model;

import com.google.gson.annotations.SerializedName;
import defpackage.qq2;
import defpackage.wu0;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class SurveyCustomization {
    public static final int $stable = 0;

    @SerializedName("background_color")
    private final String backgroundColor;

    @SerializedName("button_color")
    private final String buttonColor;

    public /* synthetic */ SurveyCustomization(String str, String str2, int i, qq2 qq2Var) {
        this((i & 1) != 0 ? "#FFFFFF" : str, (i & 2) != 0 ? "#000000" : str2);
    }

    public static /* synthetic */ SurveyCustomization copy$default(SurveyCustomization surveyCustomization, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = surveyCustomization.backgroundColor;
        }
        if ((i & 2) != 0) {
            str2 = surveyCustomization.buttonColor;
        }
        return surveyCustomization.copy(str, str2);
    }

    public final String component1() {
        return this.backgroundColor;
    }

    public final String component2() {
        return this.buttonColor;
    }

    public final SurveyCustomization copy(String str, String str2) {
        str.getClass();
        str2.getClass();
        return new SurveyCustomization(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SurveyCustomization)) {
            return false;
        }
        SurveyCustomization surveyCustomization = (SurveyCustomization) obj;
        return xj5.a(this.backgroundColor, surveyCustomization.backgroundColor) && xj5.a(this.buttonColor, surveyCustomization.buttonColor);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getButtonColor() {
        return this.buttonColor;
    }

    public int hashCode() {
        return this.buttonColor.hashCode() + (this.backgroundColor.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SurveyCustomization(backgroundColor=");
        sb.append(this.backgroundColor);
        sb.append(", buttonColor=");
        return wu0.a(sb, this.buttonColor, ')');
    }

    public SurveyCustomization(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.backgroundColor = str;
        this.buttonColor = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SurveyCustomization() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
