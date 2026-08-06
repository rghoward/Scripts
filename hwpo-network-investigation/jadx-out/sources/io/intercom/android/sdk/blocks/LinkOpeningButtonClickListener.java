package io.intercom.android.sdk.blocks;

import android.view.View;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.utilities.LinkOpener;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class LinkOpeningButtonClickListener implements ButtonClickListener {
    private final Api api;

    public LinkOpeningButtonClickListener(Api api) {
        this.api = api;
    }

    @Override // io.intercom.android.sdk.blocks.ButtonClickListener
    public void onButtonClicked(View view, String str) {
        LinkOpener.handleUrl(str, view.getContext(), this.api);
    }

    @Override // io.intercom.android.sdk.blocks.ButtonClickListener
    public boolean shouldHandleClicks() {
        return true;
    }
}
