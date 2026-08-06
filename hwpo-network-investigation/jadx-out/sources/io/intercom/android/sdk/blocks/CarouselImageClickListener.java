package io.intercom.android.sdk.blocks;

import android.text.TextUtils;
import android.view.View;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.utilities.LinkOpener;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class CarouselImageClickListener implements ImageClickListener {
    public static final int $stable = 8;
    private final Api api;

    public CarouselImageClickListener(Api api) {
        api.getClass();
        this.api = api;
    }

    @Override // io.intercom.android.sdk.blocks.ImageClickListener
    public void onImageClicked(String str, String str2, View view, int i, int i2) {
        str.getClass();
        str2.getClass();
        view.getClass();
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        LinkOpener.handleUrl(str2, view.getContext(), this.api);
    }
}
