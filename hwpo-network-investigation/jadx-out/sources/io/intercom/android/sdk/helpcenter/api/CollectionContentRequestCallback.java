package io.intercom.android.sdk.helpcenter.api;

import io.intercom.android.sdk.helpcenter.sections.HelpCenterCollectionContent;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface CollectionContentRequestCallback {
    void onComplete(HelpCenterCollectionContent helpCenterCollectionContent);

    void onError(int i);

    void onFailure();
}
