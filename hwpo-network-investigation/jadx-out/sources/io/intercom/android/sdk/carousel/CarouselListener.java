package io.intercom.android.sdk.carousel;

import io.intercom.android.sdk.models.carousel.ScreenAction;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface CarouselListener {
    void dismissCarousel(String str);

    void openLink(String str);

    void requestPermissions(ScreenAction screenAction);

    void selectNextScreen(String str);

    void skipPermissionScreen();

    void startChat();

    void trackActionButtonTappedStats();
}
