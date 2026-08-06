package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import defpackage.ac4;
import defpackage.nt3;
import defpackage.wfb;
import io.intercom.android.sdk.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomToolbarBinding implements wfb {
    public final FrameLayout intercomLeftItemLayout;
    public final ImageView intercomToolbarAvatar;
    public final View intercomToolbarAvatarActiveState;
    public final ImageButton intercomToolbarClose;
    public final View intercomToolbarDivider;
    public final ImageButton intercomToolbarInbox;
    public final TextView intercomToolbarSubtitle;
    public final TextView intercomToolbarTitle;
    public final LinearLayout intercomToolbarTitleContainer;
    private final FrameLayout rootView;
    public final RelativeLayout toolbarContentContainer;
    public final ProgressBar toolbarProgressBar;
    public final ImageView wallpaperImage;

    private IntercomToolbarBinding(FrameLayout frameLayout, FrameLayout frameLayout2, ImageView imageView, View view, ImageButton imageButton, View view2, ImageButton imageButton2, TextView textView, TextView textView2, LinearLayout linearLayout, RelativeLayout relativeLayout, ProgressBar progressBar, ImageView imageView2) {
        this.rootView = frameLayout;
        this.intercomLeftItemLayout = frameLayout2;
        this.intercomToolbarAvatar = imageView;
        this.intercomToolbarAvatarActiveState = view;
        this.intercomToolbarClose = imageButton;
        this.intercomToolbarDivider = view2;
        this.intercomToolbarInbox = imageButton2;
        this.intercomToolbarSubtitle = textView;
        this.intercomToolbarTitle = textView2;
        this.intercomToolbarTitleContainer = linearLayout;
        this.toolbarContentContainer = relativeLayout;
        this.toolbarProgressBar = progressBar;
        this.wallpaperImage = imageView2;
    }

    public static IntercomToolbarBinding bind(View view) {
        View viewB;
        View viewB2;
        int i = R.id.intercom_left_item_layout;
        FrameLayout frameLayout = (FrameLayout) nt3.b(i, view);
        if (frameLayout != null) {
            i = R.id.intercom_toolbar_avatar;
            ImageView imageView = (ImageView) nt3.b(i, view);
            if (imageView != null && (viewB = nt3.b((i = R.id.intercom_toolbar_avatar_active_state), view)) != null) {
                i = R.id.intercom_toolbar_close;
                ImageButton imageButton = (ImageButton) nt3.b(i, view);
                if (imageButton != null && (viewB2 = nt3.b((i = R.id.intercom_toolbar_divider), view)) != null) {
                    i = R.id.intercom_toolbar_inbox;
                    ImageButton imageButton2 = (ImageButton) nt3.b(i, view);
                    if (imageButton2 != null) {
                        i = R.id.intercom_toolbar_subtitle;
                        TextView textView = (TextView) nt3.b(i, view);
                        if (textView != null) {
                            i = R.id.intercom_toolbar_title;
                            TextView textView2 = (TextView) nt3.b(i, view);
                            if (textView2 != null) {
                                i = R.id.intercom_toolbar_title_container;
                                LinearLayout linearLayout = (LinearLayout) nt3.b(i, view);
                                if (linearLayout != null) {
                                    i = R.id.toolbar_content_container;
                                    RelativeLayout relativeLayout = (RelativeLayout) nt3.b(i, view);
                                    if (relativeLayout != null) {
                                        i = R.id.toolbar_progress_bar;
                                        ProgressBar progressBar = (ProgressBar) nt3.b(i, view);
                                        if (progressBar != null) {
                                            i = R.id.wallpaper_image;
                                            ImageView imageView2 = (ImageView) nt3.b(i, view);
                                            if (imageView2 != null) {
                                                return new IntercomToolbarBinding((FrameLayout) view, frameLayout, imageView, viewB, imageButton, viewB2, imageButton2, textView, textView2, linearLayout, relativeLayout, progressBar, imageView2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static IntercomToolbarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.intercom_toolbar, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static IntercomToolbarBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
