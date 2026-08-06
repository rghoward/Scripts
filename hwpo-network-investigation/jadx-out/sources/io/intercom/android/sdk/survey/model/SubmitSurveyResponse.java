package io.intercom.android.sdk.survey.model;

import com.google.gson.annotations.SerializedName;
import defpackage.wu0;
import defpackage.xj5;
import io.intercom.android.sdk.NotificationStatuses;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class SubmitSurveyResponse {
    public static final int $stable = 8;

    @SerializedName(NotificationStatuses.COMPLETE_STATUS)
    private final boolean complete;

    @SerializedName("next_step")
    private final SurveyData.Step nextStep;

    @SerializedName("survey_id")
    private final String surveyId;

    public SubmitSurveyResponse(boolean z, SurveyData.Step step, String str) {
        step.getClass();
        str.getClass();
        this.complete = z;
        this.nextStep = step;
        this.surveyId = str;
    }

    public static /* synthetic */ SubmitSurveyResponse copy$default(SubmitSurveyResponse submitSurveyResponse, boolean z, SurveyData.Step step, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = submitSurveyResponse.complete;
        }
        if ((i & 2) != 0) {
            step = submitSurveyResponse.nextStep;
        }
        if ((i & 4) != 0) {
            str = submitSurveyResponse.surveyId;
        }
        return submitSurveyResponse.copy(z, step, str);
    }

    public final boolean component1() {
        return this.complete;
    }

    public final SurveyData.Step component2() {
        return this.nextStep;
    }

    public final String component3() {
        return this.surveyId;
    }

    public final SubmitSurveyResponse copy(boolean z, SurveyData.Step step, String str) {
        step.getClass();
        str.getClass();
        return new SubmitSurveyResponse(z, step, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubmitSurveyResponse)) {
            return false;
        }
        SubmitSurveyResponse submitSurveyResponse = (SubmitSurveyResponse) obj;
        return this.complete == submitSurveyResponse.complete && xj5.a(this.nextStep, submitSurveyResponse.nextStep) && xj5.a(this.surveyId, submitSurveyResponse.surveyId);
    }

    public final boolean getComplete() {
        return this.complete;
    }

    public final SurveyData.Step getNextStep() {
        return this.nextStep;
    }

    public final String getSurveyId() {
        return this.surveyId;
    }

    public int hashCode() {
        return this.surveyId.hashCode() + ((this.nextStep.hashCode() + (Boolean.hashCode(this.complete) * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SubmitSurveyResponse(complete=");
        sb.append(this.complete);
        sb.append(", nextStep=");
        sb.append(this.nextStep);
        sb.append(", surveyId=");
        return wu0.a(sb, this.surveyId, ')');
    }
}
