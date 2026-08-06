package io.intercom.android.sdk.survey;

import com.google.gson.Gson;
import defpackage.g2b;
import defpackage.qq2;
import defpackage.r02;
import defpackage.v72;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.api.MessengerApiHelper;
import io.intercom.android.sdk.api.SurveyApi;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.survey.model.FetchSurveyRequest;
import io.intercom.android.sdk.survey.model.StatsCtaRequestModel;
import io.intercom.android.sdk.survey.model.SubmitSurveyRequest;
import io.intercom.android.sdk.survey.model.SubmitSurveyResponse;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class SurveyRepository {
    public static final int $stable = 8;
    private final SurveyApi surveyApi;

    public /* synthetic */ SurveyRepository(SurveyApi surveyApi, int i, qq2 qq2Var) {
        this((i & 1) != 0 ? Injector.get().getSurveyApi() : surveyApi);
    }

    public final Object dismissSurvey(String str, String str2, r02<? super NetworkResponse<g2b>> r02Var) {
        SurveyApi surveyApi = this.surveyApi;
        MessengerApiHelper messengerApiHelper = MessengerApiHelper.INSTANCE;
        Map<String, ? extends Object> mapSingletonMap = Collections.singletonMap("survey_progress_id", str2);
        mapSingletonMap.getClass();
        return surveyApi.dismissSurvey(str, messengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release(mapSingletonMap), r02Var);
    }

    public final Object fetchSurvey(String str, r02<? super NetworkResponse<FetchSurveyRequest>> r02Var) {
        return this.surveyApi.fetchSurvey(str, MessengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release$default(MessengerApiHelper.INSTANCE, null, 1, null), r02Var);
    }

    public final Object reportFailure(String str, String str2, r02<? super NetworkResponse<g2b>> r02Var) {
        SurveyApi surveyApi = this.surveyApi;
        MessengerApiHelper messengerApiHelper = MessengerApiHelper.INSTANCE;
        Map<String, ? extends Object> mapSingletonMap = Collections.singletonMap("survey_progress_id", str2);
        mapSingletonMap.getClass();
        return surveyApi.reportFailure(str, messengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release(mapSingletonMap), r02Var);
    }

    public final Object submitCtaStat(String str, StatsCtaRequestModel statsCtaRequestModel, r02<? super g2b> r02Var) {
        Object objFromJson = new Gson().fromJson(new Gson().toJson(statsCtaRequestModel), (Class<Object>) Map.class);
        objFromJson.getClass();
        Object objSubmitCtaStat = this.surveyApi.submitCtaStat(str, MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release((Map) objFromJson), r02Var);
        return objSubmitCtaStat == v72.t ? objSubmitCtaStat : g2b.a;
    }

    public final Object submitSurvey(SubmitSurveyRequest submitSurveyRequest, String str, r02<? super NetworkResponse<SubmitSurveyResponse>> r02Var) {
        Object objFromJson = new Gson().fromJson(new Gson().toJson(submitSurveyRequest), (Class<Object>) Map.class);
        objFromJson.getClass();
        return this.surveyApi.submitSurveyStep(str, MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release((Map) objFromJson), r02Var);
    }

    public SurveyRepository(SurveyApi surveyApi) {
        surveyApi.getClass();
        this.surveyApi = surveyApi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SurveyRepository() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
