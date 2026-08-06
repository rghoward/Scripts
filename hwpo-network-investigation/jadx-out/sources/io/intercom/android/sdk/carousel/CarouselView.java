package io.intercom.android.sdk.carousel;

import io.intercom.android.sdk.models.carousel.Carousel;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface CarouselView {
    void logEmptyCarouselError();

    void logUserNotRegisteredError();

    void showGenericError();

    void showLoading();

    void showNotFoundError();

    void showSuccess(Carousel carousel);
}
