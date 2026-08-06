package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import defpackage.ac4;
import defpackage.wfb;
import io.intercom.android.sdk.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomCarouselActionButtonTickBinding implements wfb {
    private final ImageView rootView;

    private IntercomCarouselActionButtonTickBinding(ImageView imageView) {
        this.rootView = imageView;
    }

    public static IntercomCarouselActionButtonTickBinding bind(View view) {
        if (view != null) {
            return new IntercomCarouselActionButtonTickBinding((ImageView) view);
        }
        ac4.c("rootView");
        return null;
    }

    public static IntercomCarouselActionButtonTickBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.intercom_carousel_action_button_tick, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public ImageView getRoot() {
        return this.rootView;
    }

    public static IntercomCarouselActionButtonTickBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
