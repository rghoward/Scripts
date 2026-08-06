package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import defpackage.ac4;
import defpackage.nt3;
import defpackage.wfb;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.lightbox.LightBoxImageView;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomActivityLightboxBinding implements wfb {
    public final LightBoxImageView fullImage;
    public final RelativeLayout rootView;
    private final RelativeLayout rootView_;

    private IntercomActivityLightboxBinding(RelativeLayout relativeLayout, LightBoxImageView lightBoxImageView, RelativeLayout relativeLayout2) {
        this.rootView_ = relativeLayout;
        this.fullImage = lightBoxImageView;
        this.rootView = relativeLayout2;
    }

    public static IntercomActivityLightboxBinding bind(View view) {
        int i = R.id.full_image;
        LightBoxImageView lightBoxImageView = (LightBoxImageView) nt3.b(i, view);
        if (lightBoxImageView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            return new IntercomActivityLightboxBinding(relativeLayout, lightBoxImageView, relativeLayout);
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static IntercomActivityLightboxBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.intercom_activity_lightbox, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public RelativeLayout getRoot() {
        return this.rootView_;
    }

    public static IntercomActivityLightboxBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
