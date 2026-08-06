package io.intercom.android.sdk.survey.model;

import com.google.gson.annotations.SerializedName;
import defpackage.ru3;
import defpackage.xj5;
import defpackage.zc6;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class SubmitSurveyRequest {
    public static final int $stable = 8;

    @SerializedName("current_step_id")
    private final String currentStepId;

    @SerializedName("responses")
    private final List<SubmitSurveyRequestItem> responses;

    @SerializedName("survey_progress_id")
    private final String surveyProgressId;

    public SubmitSurveyRequest(String str, String str2, List<SubmitSurveyRequestItem> list) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.surveyProgressId = str;
        this.currentStepId = str2;
        this.responses = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SubmitSurveyRequest copy$default(SubmitSurveyRequest submitSurveyRequest, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = submitSurveyRequest.surveyProgressId;
        }
        if ((i & 2) != 0) {
            str2 = submitSurveyRequest.currentStepId;
        }
        if ((i & 4) != 0) {
            list = submitSurveyRequest.responses;
        }
        return submitSurveyRequest.copy(str, str2, list);
    }

    public final String component1() {
        return this.surveyProgressId;
    }

    public final String component2() {
        return this.currentStepId;
    }

    public final List<SubmitSurveyRequestItem> component3() {
        return this.responses;
    }

    public final SubmitSurveyRequest copy(String str, String str2, List<SubmitSurveyRequestItem> list) {
        str.getClass();
        str2.getClass();
        list.getClass();
        return new SubmitSurveyRequest(str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubmitSurveyRequest)) {
            return false;
        }
        SubmitSurveyRequest submitSurveyRequest = (SubmitSurveyRequest) obj;
        return xj5.a(this.surveyProgressId, submitSurveyRequest.surveyProgressId) && xj5.a(this.currentStepId, submitSurveyRequest.currentStepId) && xj5.a(this.responses, submitSurveyRequest.responses);
    }

    public final String getCurrentStepId() {
        return this.currentStepId;
    }

    public final List<SubmitSurveyRequestItem> getResponses() {
        return this.responses;
    }

    public final String getSurveyProgressId() {
        return this.surveyProgressId;
    }

    public int hashCode() {
        return this.responses.hashCode() + ru3.c(this.surveyProgressId.hashCode() * 31, 31, this.currentStepId);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SubmitSurveyRequest(surveyProgressId=");
        sb.append(this.surveyProgressId);
        sb.append(", currentStepId=");
        sb.append(this.currentStepId);
        sb.append(", responses=");
        return zc6.a(sb, this.responses, ')');
    }
}
