package io.intercom.android.sdk.models.carousel;

import defpackage.ac4;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_CarouselResponse extends CarouselResponse {
    private final Carousel.Builder carousel;

    public AutoValue_CarouselResponse(Carousel.Builder builder) {
        if (builder != null) {
            this.carousel = builder;
        } else {
            ac4.c("Null carousel");
            throw null;
        }
    }

    @Override // io.intercom.android.sdk.models.carousel.CarouselResponse
    public Carousel.Builder carousel() {
        return this.carousel;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CarouselResponse) {
            return this.carousel.equals(((CarouselResponse) obj).carousel());
        }
        return false;
    }

    public int hashCode() {
        return this.carousel.hashCode() ^ 1000003;
    }

    public String toString() {
        return "CarouselResponse{carousel=" + this.carousel + "}";
    }
}
