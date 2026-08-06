package io.intercom.android.sdk.models;

import io.intercom.android.sdk.models.carousel.Carousel;
import io.intercom.android.sdk.survey.model.SurveyData;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class UpdateUserResponse extends UsersResponse {
    private final Carousel carousel;
    private final SurveyData surveyData;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Builder extends UsersResponse.Builder {
        Carousel.Builder carousel;
        SurveyData survey;

        @Override // io.intercom.android.sdk.models.UsersResponse.Builder, io.intercom.android.sdk.models.BaseResponse.Builder
        public UpdateUserResponse build() {
            return new UpdateUserResponse(this);
        }
    }

    public UpdateUserResponse(Builder builder) {
        super(builder);
        Carousel.Builder builder2 = builder.carousel;
        this.carousel = (builder2 == null ? new Carousel.Builder() : builder2).build();
        SurveyData surveyData = builder.survey;
        this.surveyData = surveyData == null ? SurveyData.Companion.getNULL() : surveyData;
    }

    public Carousel getCarousel() {
        return this.carousel;
    }

    public SurveyData getSurveyData() {
        return this.surveyData;
    }
}
