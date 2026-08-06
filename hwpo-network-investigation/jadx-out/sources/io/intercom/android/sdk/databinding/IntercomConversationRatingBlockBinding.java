package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.ac4;
import defpackage.nt3;
import defpackage.wfb;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.IntercomPrimaryButton;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomConversationRatingBlockBinding implements wfb {
    public final LinearLayout intercomRatingOptionsLayout;
    public final IntercomPrimaryButton intercomRatingTellUsMoreButton;
    public final ImageView intercomYouRatedImageView;
    public final LinearLayout intercomYouRatedLayout;
    public final TextView rateYourConversationTextView;
    private final LinearLayout rootView;

    private IntercomConversationRatingBlockBinding(LinearLayout linearLayout, LinearLayout linearLayout2, IntercomPrimaryButton intercomPrimaryButton, ImageView imageView, LinearLayout linearLayout3, TextView textView) {
        this.rootView = linearLayout;
        this.intercomRatingOptionsLayout = linearLayout2;
        this.intercomRatingTellUsMoreButton = intercomPrimaryButton;
        this.intercomYouRatedImageView = imageView;
        this.intercomYouRatedLayout = linearLayout3;
        this.rateYourConversationTextView = textView;
    }

    public static IntercomConversationRatingBlockBinding bind(View view) {
        int i = R.id.intercom_rating_options_layout;
        LinearLayout linearLayout = (LinearLayout) nt3.b(i, view);
        if (linearLayout != null) {
            i = R.id.intercom_rating_tell_us_more_button;
            IntercomPrimaryButton intercomPrimaryButton = (IntercomPrimaryButton) nt3.b(i, view);
            if (intercomPrimaryButton != null) {
                i = R.id.intercom_you_rated_image_view;
                ImageView imageView = (ImageView) nt3.b(i, view);
                if (imageView != null) {
                    i = R.id.intercom_you_rated_layout;
                    LinearLayout linearLayout2 = (LinearLayout) nt3.b(i, view);
                    if (linearLayout2 != null) {
                        i = R.id.rate_your_conversation_text_view;
                        TextView textView = (TextView) nt3.b(i, view);
                        if (textView != null) {
                            return new IntercomConversationRatingBlockBinding((LinearLayout) view, linearLayout, intercomPrimaryButton, imageView, linearLayout2, textView);
                        }
                    }
                }
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static IntercomConversationRatingBlockBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.intercom_conversation_rating_block, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static IntercomConversationRatingBlockBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
