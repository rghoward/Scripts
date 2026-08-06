package io.intercom.android.sdk.api;

import defpackage.eu7;
import defpackage.g2b;
import defpackage.pr0;
import defpackage.qp8;
import defpackage.r02;
import defpackage.wn7;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.survey.model.FetchSurveyRequest;
import io.intercom.android.sdk.survey.model.SubmitSurveyResponse;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface SurveyApi {
    @wn7("surveys/{surveyId}/dismiss")
    Object dismissSurvey(@eu7("surveyId") String str, @pr0 qp8 qp8Var, r02<? super NetworkResponse<g2b>> r02Var);

    @wn7("surveys/{surveyId}/fetch")
    Object fetchSurvey(@eu7("surveyId") String str, @pr0 qp8 qp8Var, r02<? super NetworkResponse<FetchSurveyRequest>> r02Var);

    @wn7("surveys/{survey_id}/failure")
    Object reportFailure(@eu7("survey_id") String str, @pr0 qp8 qp8Var, r02<? super NetworkResponse<g2b>> r02Var);

    @wn7("surveys/{surveyId}/action_button_clicked")
    Object submitCtaStat(@eu7("surveyId") String str, @pr0 qp8 qp8Var, r02<? super NetworkResponse<g2b>> r02Var);

    @wn7("surveys/{surveyId}/submit")
    Object submitSurveyStep(@eu7("surveyId") String str, @pr0 qp8 qp8Var, r02<? super NetworkResponse<SubmitSurveyResponse>> r02Var);
}
