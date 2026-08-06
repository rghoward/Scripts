package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.ac4;
import defpackage.nt3;
import defpackage.wfb;
import io.intercom.android.sdk.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomActivityArticleSearchBinding implements wfb {
    public final ComposeView articleSearchComposeView;
    public final ConstraintLayout intercomSearchScreenRoot;
    private final ConstraintLayout rootView;

    private IntercomActivityArticleSearchBinding(ConstraintLayout constraintLayout, ComposeView composeView, ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.articleSearchComposeView = composeView;
        this.intercomSearchScreenRoot = constraintLayout2;
    }

    public static IntercomActivityArticleSearchBinding bind(View view) {
        int i = R.id.article_search_compose_view;
        ComposeView composeView = (ComposeView) nt3.b(i, view);
        if (composeView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            return new IntercomActivityArticleSearchBinding(constraintLayout, composeView, constraintLayout);
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static IntercomActivityArticleSearchBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.intercom_activity_article_search, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static IntercomActivityArticleSearchBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
