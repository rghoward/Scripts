package io.intercom.android.sdk.helpcenter.api;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface SearchRequestCallback {
    void onComplete(List<HelpCenterArticleSearchResult> list);

    void onError(int i);

    void onFailure();
}
