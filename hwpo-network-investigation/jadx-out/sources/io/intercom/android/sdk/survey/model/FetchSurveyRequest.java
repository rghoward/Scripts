package io.intercom.android.sdk.survey.model;

import com.google.gson.annotations.SerializedName;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class FetchSurveyRequest {
    public static final int $stable = 8;

    @SerializedName("survey")
    private final SurveyData survey;

    public FetchSurveyRequest(SurveyData surveyData) {
        surveyData.getClass();
        this.survey = surveyData;
    }

    public static /* synthetic */ FetchSurveyRequest copy$default(FetchSurveyRequest fetchSurveyRequest, SurveyData surveyData, int i, Object obj) {
        if ((i & 1) != 0) {
            surveyData = fetchSurveyRequest.survey;
        }
        return fetchSurveyRequest.copy(surveyData);
    }

    public final SurveyData component1() {
        return this.survey;
    }

    public final FetchSurveyRequest copy(SurveyData surveyData) {
        surveyData.getClass();
        return new FetchSurveyRequest(surveyData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FetchSurveyRequest) && xj5.a(this.survey, ((FetchSurveyRequest) obj).survey);
    }

    public final SurveyData getSurvey() {
        return this.survey;
    }

    public int hashCode() {
        return this.survey.hashCode();
    }

    public String toString() {
        return "FetchSurveyRequest(survey=" + this.survey + ')';
    }
}
