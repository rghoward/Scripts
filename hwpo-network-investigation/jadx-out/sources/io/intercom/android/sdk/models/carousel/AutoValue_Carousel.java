package io.intercom.android.sdk.models.carousel;

import defpackage.ac4;
import defpackage.av;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_Carousel extends Carousel {
    private final boolean dismissible;
    private final String instanceId;
    private final List<CarouselScreen> screens;

    public AutoValue_Carousel(List<CarouselScreen> list, boolean z, String str) {
        if (list == null) {
            ac4.c("Null screens");
            throw null;
        }
        this.screens = list;
        this.dismissible = z;
        if (str != null) {
            this.instanceId = str;
        } else {
            ac4.c("Null instanceId");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Carousel) {
            Carousel carousel = (Carousel) obj;
            if (this.screens.equals(carousel.getScreens()) && this.dismissible == carousel.isDismissible() && this.instanceId.equals(carousel.getInstanceId())) {
                return true;
            }
        }
        return false;
    }

    @Override // io.intercom.android.sdk.models.carousel.Carousel
    public String getInstanceId() {
        return this.instanceId;
    }

    @Override // io.intercom.android.sdk.models.carousel.Carousel
    public List<CarouselScreen> getScreens() {
        return this.screens;
    }

    public int hashCode() {
        return this.instanceId.hashCode() ^ ((((this.screens.hashCode() ^ 1000003) * 1000003) ^ (this.dismissible ? 1231 : 1237)) * 1000003);
    }

    @Override // io.intercom.android.sdk.models.carousel.Carousel
    public boolean isDismissible() {
        return this.dismissible;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Carousel{screens=");
        sb.append(this.screens);
        sb.append(", dismissible=");
        sb.append(this.dismissible);
        sb.append(", instanceId=");
        return av.a(sb, this.instanceId, "}");
    }
}
