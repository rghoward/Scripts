package io.intercom.android.sdk.api;

import defpackage.nl3;
import defpackage.ol3;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public enum Platform {
    Cordova(PlatformIdentifierUtilKt.CORDOVA_HEADER),
    ReactNative(PlatformIdentifierUtilKt.REACT_NATIVE_HEADER),
    Flutter(PlatformIdentifierUtilKt.FLUTTER_HEADER),
    Native(PlatformIdentifierUtilKt.NATIVE_SDK);

    private static final /* synthetic */ nl3 $ENTRIES = ol3.b(values());
    private final String identifier;

    Platform(String str) {
        this.identifier = str;
    }

    public static nl3<Platform> getEntries() {
        return $ENTRIES;
    }

    public final String getIdentifier() {
        return this.identifier;
    }
}
