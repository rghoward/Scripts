package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import defpackage.ac4;
import defpackage.nt3;
import defpackage.wfb;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.views.ContentAwareScrollView;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomFragmentCarouselScreenBinding implements wfb {
    public final LinearLayout intercomCarouselActionLayout;
    public final FrameLayout intercomCarouselContentContainer;
    public final LinearLayout intercomCarouselFragmentRoot;
    public final View intercomCarouselGradient;
    public final ContentAwareScrollView intercomCarouselScrollView;
    private final LinearLayout rootView;

    private IntercomFragmentCarouselScreenBinding(LinearLayout linearLayout, LinearLayout linearLayout2, FrameLayout frameLayout, LinearLayout linearLayout3, View view, ContentAwareScrollView contentAwareScrollView) {
        this.rootView = linearLayout;
        this.intercomCarouselActionLayout = linearLayout2;
        this.intercomCarouselContentContainer = frameLayout;
        this.intercomCarouselFragmentRoot = linearLayout3;
        this.intercomCarouselGradient = view;
        this.intercomCarouselScrollView = contentAwareScrollView;
    }

    public static IntercomFragmentCarouselScreenBinding bind(View view) {
        int i = R.id.intercom_carousel_action_layout;
        LinearLayout linearLayout = (LinearLayout) nt3.b(i, view);
        if (linearLayout != null) {
            i = R.id.intercom_carousel_content_container;
            FrameLayout frameLayout = (FrameLayout) nt3.b(i, view);
            if (frameLayout != null) {
                LinearLayout linearLayout2 = (LinearLayout) view;
                i = R.id.intercom_carousel_gradient;
                View viewB = nt3.b(i, view);
                if (viewB != null) {
                    i = R.id.intercom_carousel_scroll_view;
                    ContentAwareScrollView contentAwareScrollView = (ContentAwareScrollView) nt3.b(i, view);
                    if (contentAwareScrollView != null) {
                        return new IntercomFragmentCarouselScreenBinding(linearLayout2, linearLayout, frameLayout, linearLayout2, viewB, contentAwareScrollView);
                    }
                }
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static IntercomFragmentCarouselScreenBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.intercom_fragment_carousel_screen, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static IntercomFragmentCarouselScreenBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
