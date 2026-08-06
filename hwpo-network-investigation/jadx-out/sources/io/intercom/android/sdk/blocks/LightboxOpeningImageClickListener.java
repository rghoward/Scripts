package io.intercom.android.sdk.blocks;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.lightbox.LightBoxActivity;
import io.intercom.android.sdk.utilities.LinkOpener;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class LightboxOpeningImageClickListener implements ImageClickListener {
    private final Api api;

    public LightboxOpeningImageClickListener(Api api) {
        this.api = api;
    }

    @Override // io.intercom.android.sdk.blocks.ImageClickListener
    public void onImageClicked(String str, String str2, View view, int i, int i2) {
        Context context = view.getContext();
        if (!TextUtils.isEmpty(str2)) {
            LinkOpener.handleUrl(str2, context, this.api);
            return;
        }
        if (!(context instanceof Activity)) {
            context.startActivity(LightBoxActivity.imageIntent(context, str, false));
        } else {
            Activity activity = (Activity) context;
            activity.startActivity(LightBoxActivity.imageIntent(activity, str, (activity.getWindow().getAttributes().flags & 1024) != 0), ActivityOptions.makeSceneTransitionAnimation(activity, view, LightBoxActivity.TRANSITION_KEY).toBundle());
        }
    }
}
