package io.intercom.android.sdk.ui.extension;

import defpackage.z2a;
import io.intercom.android.sdk.models.carousel.AppearanceType;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ContentTypeExtensionKt {
    public static final boolean isAudio(String str) {
        str.getClass();
        return z2a.o(str, "audio", false);
    }

    public static final boolean isCsv(String str) {
        str.getClass();
        return z2a.o(str, "text/csv", false);
    }

    public static final boolean isImage(String str) {
        str.getClass();
        return z2a.o(str, AppearanceType.IMAGE, false);
    }

    public static final boolean isPdf(String str) {
        str.getClass();
        return z2a.o(str, "application/pdf", false);
    }

    public static final boolean isTxt(String str) {
        str.getClass();
        return z2a.o(str, "text/plain", false);
    }

    public static final boolean isVideo(String str) {
        str.getClass();
        return z2a.o(str, "video", false);
    }

    public static final boolean isZip(String str) {
        str.getClass();
        return z2a.o(str, "application/zip", false);
    }
}
