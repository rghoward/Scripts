package io.intercom.android.sdk.survey.model;

import com.google.gson.annotations.SerializedName;
import defpackage.xj5;
import defpackage.zc6;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class SubmitSurveyRequestItem {
    public static final int $stable = 8;

    @SerializedName("question_id")
    private final String questionId;

    @SerializedName("response")
    private final List<String> response;

    public SubmitSurveyRequestItem(String str, List<String> list) {
        str.getClass();
        list.getClass();
        this.questionId = str;
        this.response = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SubmitSurveyRequestItem copy$default(SubmitSurveyRequestItem submitSurveyRequestItem, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = submitSurveyRequestItem.questionId;
        }
        if ((i & 2) != 0) {
            list = submitSurveyRequestItem.response;
        }
        return submitSurveyRequestItem.copy(str, list);
    }

    public final String component1() {
        return this.questionId;
    }

    public final List<String> component2() {
        return this.response;
    }

    public final SubmitSurveyRequestItem copy(String str, List<String> list) {
        str.getClass();
        list.getClass();
        return new SubmitSurveyRequestItem(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubmitSurveyRequestItem)) {
            return false;
        }
        SubmitSurveyRequestItem submitSurveyRequestItem = (SubmitSurveyRequestItem) obj;
        return xj5.a(this.questionId, submitSurveyRequestItem.questionId) && xj5.a(this.response, submitSurveyRequestItem.response);
    }

    public final String getQuestionId() {
        return this.questionId;
    }

    public final List<String> getResponse() {
        return this.response;
    }

    public int hashCode() {
        return this.response.hashCode() + (this.questionId.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SubmitSurveyRequestItem(questionId=");
        sb.append(this.questionId);
        sb.append(", response=");
        return zc6.a(sb, this.response, ')');
    }
}
