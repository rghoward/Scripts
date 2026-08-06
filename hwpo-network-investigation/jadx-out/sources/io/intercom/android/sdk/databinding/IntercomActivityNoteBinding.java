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
import io.intercom.android.sdk.conversation.ReactionInputView;
import io.intercom.android.sdk.views.ContentAwareScrollView;
import io.intercom.android.sdk.views.IntercomToolbar;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomActivityNoteBinding implements wfb {
    public final LinearLayout appBarLayout;
    public final IntercomToolbar intercomToolbar;
    public final FrameLayout noteComposerContainer;
    public final LinearLayout noteLayout;
    public final FrameLayout noteRoot;
    public final View noteTouchTarget;
    public final ContentAwareScrollView noteView;
    public final ReactionInputView reactionInputView;
    private final FrameLayout rootView;

    private IntercomActivityNoteBinding(FrameLayout frameLayout, LinearLayout linearLayout, IntercomToolbar intercomToolbar, FrameLayout frameLayout2, LinearLayout linearLayout2, FrameLayout frameLayout3, View view, ContentAwareScrollView contentAwareScrollView, ReactionInputView reactionInputView) {
        this.rootView = frameLayout;
        this.appBarLayout = linearLayout;
        this.intercomToolbar = intercomToolbar;
        this.noteComposerContainer = frameLayout2;
        this.noteLayout = linearLayout2;
        this.noteRoot = frameLayout3;
        this.noteTouchTarget = view;
        this.noteView = contentAwareScrollView;
        this.reactionInputView = reactionInputView;
    }

    public static IntercomActivityNoteBinding bind(View view) {
        int i = R.id.app_bar_layout;
        LinearLayout linearLayout = (LinearLayout) nt3.b(i, view);
        if (linearLayout != null) {
            i = R.id.intercom_toolbar;
            IntercomToolbar intercomToolbar = (IntercomToolbar) nt3.b(i, view);
            if (intercomToolbar != null) {
                i = R.id.note_composer_container;
                FrameLayout frameLayout = (FrameLayout) nt3.b(i, view);
                if (frameLayout != null) {
                    i = R.id.note_layout;
                    LinearLayout linearLayout2 = (LinearLayout) nt3.b(i, view);
                    if (linearLayout2 != null) {
                        FrameLayout frameLayout2 = (FrameLayout) view;
                        i = R.id.note_touch_target;
                        View viewB = nt3.b(i, view);
                        if (viewB != null) {
                            i = R.id.note_view;
                            ContentAwareScrollView contentAwareScrollView = (ContentAwareScrollView) nt3.b(i, view);
                            if (contentAwareScrollView != null) {
                                i = R.id.reaction_input_view;
                                ReactionInputView reactionInputView = (ReactionInputView) nt3.b(i, view);
                                if (reactionInputView != null) {
                                    return new IntercomActivityNoteBinding(frameLayout2, linearLayout, intercomToolbar, frameLayout, linearLayout2, frameLayout2, viewB, contentAwareScrollView, reactionInputView);
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

    public static IntercomActivityNoteBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.intercom_activity_note, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static IntercomActivityNoteBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
