package io.intercom.android.sdk.survey.model;

import com.google.gson.annotations.SerializedName;
import defpackage.wu0;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class StatsCtaRequestModel {
    public static final int $stable = 0;

    @SerializedName("step_id")
    private final String stepId;

    @SerializedName("survey_progress_id")
    private final String surveyProgressId;

    public StatsCtaRequestModel(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.surveyProgressId = str;
        this.stepId = str2;
    }

    public static /* synthetic */ StatsCtaRequestModel copy$default(StatsCtaRequestModel statsCtaRequestModel, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = statsCtaRequestModel.surveyProgressId;
        }
        if ((i & 2) != 0) {
            str2 = statsCtaRequestModel.stepId;
        }
        return statsCtaRequestModel.copy(str, str2);
    }

    public final String component1() {
        return this.surveyProgressId;
    }

    public final String component2() {
        return this.stepId;
    }

    public final StatsCtaRequestModel copy(String str, String str2) {
        str.getClass();
        str2.getClass();
        return new StatsCtaRequestModel(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatsCtaRequestModel)) {
            return false;
        }
        StatsCtaRequestModel statsCtaRequestModel = (StatsCtaRequestModel) obj;
        return xj5.a(this.surveyProgressId, statsCtaRequestModel.surveyProgressId) && xj5.a(this.stepId, statsCtaRequestModel.stepId);
    }

    public final String getStepId() {
        return this.stepId;
    }

    public final String getSurveyProgressId() {
        return this.surveyProgressId;
    }

    public int hashCode() {
        return this.stepId.hashCode() + (this.surveyProgressId.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StatsCtaRequestModel(surveyProgressId=");
        sb.append(this.surveyProgressId);
        sb.append(", stepId=");
        return wu0.a(sb, this.stepId, ')');
    }
}
