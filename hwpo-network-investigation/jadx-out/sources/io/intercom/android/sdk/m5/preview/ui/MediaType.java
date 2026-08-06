package io.intercom.android.sdk.m5.preview.ui;

import defpackage.nl3;
import defpackage.ol3;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public enum MediaType {
    ImageOnly,
    VideOnly,
    DocumentOnly,
    ImageAndVideo,
    All;

    private static final /* synthetic */ nl3 $ENTRIES = ol3.b(values());

    public static nl3<MediaType> getEntries() {
        return $ENTRIES;
    }
}
