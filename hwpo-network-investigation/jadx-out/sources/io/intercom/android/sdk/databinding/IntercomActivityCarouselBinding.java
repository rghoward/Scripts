package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;
import defpackage.ac4;
import defpackage.nt3;
import defpackage.wfb;
import io.intercom.android.sdk.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomActivityCarouselBinding implements wfb {
    public final ConstraintLayout intercomCarouselCloseContainer;
    public final ConstraintLayout intercomCarouselRoot;
    public final ImageButton intercomClose;
    public final View intercomCloseBackground;
    public final LinearLayout intercomPageNavigationLayout;
    public final FrameLayout intercomStateContainer;
    public final ViewPager intercomViewPager;
    private final ConstraintLayout rootView;

    private IntercomActivityCarouselBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ImageButton imageButton, View view, LinearLayout linearLayout, FrameLayout frameLayout, ViewPager viewPager) {
        this.rootView = constraintLayout;
        this.intercomCarouselCloseContainer = constraintLayout2;
        this.intercomCarouselRoot = constraintLayout3;
        this.intercomClose = imageButton;
        this.intercomCloseBackground = view;
        this.intercomPageNavigationLayout = linearLayout;
        this.intercomStateContainer = frameLayout;
        this.intercomViewPager = viewPager;
    }

    public static IntercomActivityCarouselBinding bind(View view) {
        View viewB;
        int i = R.id.intercom_carousel_close_container;
        ConstraintLayout constraintLayout = (ConstraintLayout) nt3.b(i, view);
        if (constraintLayout != null) {
            ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
            i = R.id.intercom_close;
            ImageButton imageButton = (ImageButton) nt3.b(i, view);
            if (imageButton != null && (viewB = nt3.b((i = R.id.intercom_close_background), view)) != null) {
                i = R.id.intercom_page_navigation_layout;
                LinearLayout linearLayout = (LinearLayout) nt3.b(i, view);
                if (linearLayout != null) {
                    i = R.id.intercom_state_container;
                    FrameLayout frameLayout = (FrameLayout) nt3.b(i, view);
                    if (frameLayout != null) {
                        i = R.id.intercom_view_pager;
                        ViewPager viewPager = (ViewPager) nt3.b(i, view);
                        if (viewPager != null) {
                            return new IntercomActivityCarouselBinding(constraintLayout2, constraintLayout, constraintLayout2, imageButton, viewB, linearLayout, frameLayout, viewPager);
                        }
                    }
                }
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static IntercomActivityCarouselBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.intercom_activity_carousel, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static IntercomActivityCarouselBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
