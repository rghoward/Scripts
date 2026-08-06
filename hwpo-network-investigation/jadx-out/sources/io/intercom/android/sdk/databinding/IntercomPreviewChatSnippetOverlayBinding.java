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
public final class IntercomPreviewChatSnippetOverlayBinding implements wfb {
    public final FrameLayout chatAvatarContainer;
    public final FrameLayout chatFullBody;
    public final ComposeView chatSnippetComposeView;
    public final ImageView chatheadAvatar;
    public final ComposeView chatheadAvatarComposeView;
    public final FrameLayout chatheadRoot;
    public final TextView chatheadTextBody;
    public final LinearLayout chatheadTextContainer;
    public final TextView chatheadTextHeader;
    public final FrameLayout parentCard;
    private final FrameLayout rootView;
    public final ComposeView ticketHeaderComposeView;

    private IntercomPreviewChatSnippetOverlayBinding(FrameLayout frameLayout, FrameLayout frameLayout2, FrameLayout frameLayout3, ComposeView composeView, ImageView imageView, ComposeView composeView2, FrameLayout frameLayout4, TextView textView, LinearLayout linearLayout, TextView textView2, FrameLayout frameLayout5, ComposeView composeView3) {
        this.rootView = frameLayout;
        this.chatAvatarContainer = frameLayout2;
        this.chatFullBody = frameLayout3;
        this.chatSnippetComposeView = composeView;
        this.chatheadAvatar = imageView;
        this.chatheadAvatarComposeView = composeView2;
        this.chatheadRoot = frameLayout4;
        this.chatheadTextBody = textView;
        this.chatheadTextContainer = linearLayout;
        this.chatheadTextHeader = textView2;
        this.parentCard = frameLayout5;
        this.ticketHeaderComposeView = composeView3;
    }

    public static IntercomPreviewChatSnippetOverlayBinding bind(View view) {
        int i = R.id.chat_avatar_container;
        FrameLayout frameLayout = (FrameLayout) nt3.b(i, view);
        if (frameLayout != null) {
            i = R.id.chat_full_body;
            FrameLayout frameLayout2 = (FrameLayout) nt3.b(i, view);
            if (frameLayout2 != null) {
                i = R.id.chat_snippet_compose_view;
                ComposeView composeView = (ComposeView) nt3.b(i, view);
                if (composeView != null) {
                    i = R.id.chathead_avatar;
                    ImageView imageView = (ImageView) nt3.b(i, view);
                    if (imageView != null) {
                        i = R.id.chathead_avatar_compose_view;
                        ComposeView composeView2 = (ComposeView) nt3.b(i, view);
                        if (composeView2 != null) {
                            FrameLayout frameLayout3 = (FrameLayout) view;
                            i = R.id.chathead_text_body;
                            TextView textView = (TextView) nt3.b(i, view);
                            if (textView != null) {
                                i = R.id.chathead_text_container;
                                LinearLayout linearLayout = (LinearLayout) nt3.b(i, view);
                                if (linearLayout != null) {
                                    i = R.id.chathead_text_header;
                                    TextView textView2 = (TextView) nt3.b(i, view);
                                    if (textView2 != null) {
                                        i = R.id.parent_card;
                                        FrameLayout frameLayout4 = (FrameLayout) nt3.b(i, view);
                                        if (frameLayout4 != null) {
                                            i = R.id.ticket_header_compose_view;
                                            ComposeView composeView3 = (ComposeView) nt3.b(i, view);
                                            if (composeView3 != null) {
                                                return new IntercomPreviewChatSnippetOverlayBinding(frameLayout3, frameLayout, frameLayout2, composeView, imageView, composeView2, frameLayout3, textView, linearLayout, textView2, frameLayout4, composeView3);
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

    public static IntercomPreviewChatSnippetOverlayBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.intercom_preview_chat_snippet_overlay, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static IntercomPreviewChatSnippetOverlayBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
