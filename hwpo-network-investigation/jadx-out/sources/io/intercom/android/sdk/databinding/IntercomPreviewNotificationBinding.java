package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import defpackage.ac4;
import defpackage.nt3;
import defpackage.wfb;
import io.intercom.android.sdk.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomPreviewNotificationBinding implements wfb {
    public final ComposeView chatSnippetComposeView;
    public final TextView inAppNotificationMessageSummary;
    public final FrameLayout notificationRoot;
    public final FrameLayout parentCard;
    public final ImageView previewAvatar;
    public final ComposeView previewAvatarComposeView;
    public final TextView replyFromTextview;
    private final FrameLayout rootView;
    public final ComposeView ticketHeaderComposeView;

    private IntercomPreviewNotificationBinding(FrameLayout frameLayout, ComposeView composeView, TextView textView, FrameLayout frameLayout2, FrameLayout frameLayout3, ImageView imageView, ComposeView composeView2, TextView textView2, ComposeView composeView3) {
        this.rootView = frameLayout;
        this.chatSnippetComposeView = composeView;
        this.inAppNotificationMessageSummary = textView;
        this.notificationRoot = frameLayout2;
        this.parentCard = frameLayout3;
        this.previewAvatar = imageView;
        this.previewAvatarComposeView = composeView2;
        this.replyFromTextview = textView2;
        this.ticketHeaderComposeView = composeView3;
    }

    public static IntercomPreviewNotificationBinding bind(View view) {
        int i = R.id.chat_snippet_compose_view;
        ComposeView composeView = (ComposeView) nt3.b(i, view);
        if (composeView != null) {
            i = R.id.in_app_notification_message_summary;
            TextView textView = (TextView) nt3.b(i, view);
            if (textView != null) {
                FrameLayout frameLayout = (FrameLayout) view;
                i = R.id.parent_card;
                FrameLayout frameLayout2 = (FrameLayout) nt3.b(i, view);
                if (frameLayout2 != null) {
                    i = R.id.preview_avatar;
                    ImageView imageView = (ImageView) nt3.b(i, view);
                    if (imageView != null) {
                        i = R.id.preview_avatar_compose_view;
                        ComposeView composeView2 = (ComposeView) nt3.b(i, view);
                        if (composeView2 != null) {
                            i = R.id.reply_from_textview;
                            TextView textView2 = (TextView) nt3.b(i, view);
                            if (textView2 != null) {
                                i = R.id.ticket_header_compose_view;
                                ComposeView composeView3 = (ComposeView) nt3.b(i, view);
                                if (composeView3 != null) {
                                    return new IntercomPreviewNotificationBinding(frameLayout, composeView, textView, frameLayout, frameLayout2, imageView, composeView2, textView2, composeView3);
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

    public static IntercomPreviewNotificationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.intercom_preview_notification, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static IntercomPreviewNotificationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
