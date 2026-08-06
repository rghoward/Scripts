package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import defpackage.ac4;
import defpackage.nt3;
import defpackage.wfb;
import io.intercom.android.sdk.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomPreviewChatFullOverlayBinding implements wfb {
    public final FrameLayout chatAvatarContainer;
    public final FrameLayout chatFullBody;
    public final ComposeView chatFullComposeView;
    public final View chatOverlayOverflowFade;
    public final ImageView chatheadAvatar;
    public final ComposeView chatheadAvatarComposeView;
    public final FrameLayout chatheadRoot;
    public final LinearLayout chatheadTextContainer;
    public final TextView chatheadTextHeader;
    public final FrameLayout parentCard;
    private final FrameLayout rootView;

    private IntercomPreviewChatFullOverlayBinding(FrameLayout frameLayout, FrameLayout frameLayout2, FrameLayout frameLayout3, ComposeView composeView, View view, ImageView imageView, ComposeView composeView2, FrameLayout frameLayout4, LinearLayout linearLayout, TextView textView, FrameLayout frameLayout5) {
        this.rootView = frameLayout;
        this.chatAvatarContainer = frameLayout2;
        this.chatFullBody = frameLayout3;
        this.chatFullComposeView = composeView;
        this.chatOverlayOverflowFade = view;
        this.chatheadAvatar = imageView;
        this.chatheadAvatarComposeView = composeView2;
        this.chatheadRoot = frameLayout4;
        this.chatheadTextContainer = linearLayout;
        this.chatheadTextHeader = textView;
        this.parentCard = frameLayout5;
    }

    public static IntercomPreviewChatFullOverlayBinding bind(View view) {
        View viewB;
        int i = R.id.chat_avatar_container;
        FrameLayout frameLayout = (FrameLayout) nt3.b(i, view);
        if (frameLayout != null) {
            i = R.id.chat_full_body;
            FrameLayout frameLayout2 = (FrameLayout) nt3.b(i, view);
            if (frameLayout2 != null) {
                i = R.id.chat_full_compose_view;
                ComposeView composeView = (ComposeView) nt3.b(i, view);
                if (composeView != null && (viewB = nt3.b((i = R.id.chat_overlay_overflow_fade), view)) != null) {
                    i = R.id.chathead_avatar;
                    ImageView imageView = (ImageView) nt3.b(i, view);
                    if (imageView != null) {
                        i = R.id.chathead_avatar_compose_view;
                        ComposeView composeView2 = (ComposeView) nt3.b(i, view);
                        if (composeView2 != null) {
                            FrameLayout frameLayout3 = (FrameLayout) view;
                            i = R.id.chathead_text_container;
                            LinearLayout linearLayout = (LinearLayout) nt3.b(i, view);
                            if (linearLayout != null) {
                                i = R.id.chathead_text_header;
                                TextView textView = (TextView) nt3.b(i, view);
                                if (textView != null) {
                                    i = R.id.parent_card;
                                    FrameLayout frameLayout4 = (FrameLayout) nt3.b(i, view);
                                    if (frameLayout4 != null) {
                                        return new IntercomPreviewChatFullOverlayBinding(frameLayout3, frameLayout, frameLayout2, composeView, viewB, imageView, composeView2, frameLayout3, linearLayout, textView, frameLayout4);
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

    public static IntercomPreviewChatFullOverlayBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.intercom_preview_chat_full_overlay, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static IntercomPreviewChatFullOverlayBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
