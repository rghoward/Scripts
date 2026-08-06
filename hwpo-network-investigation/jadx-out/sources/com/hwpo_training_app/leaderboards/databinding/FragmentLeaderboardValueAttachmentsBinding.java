package com.hwpo_training_app.leaderboards.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.SimpleProgressBar;
import com.hwpo_training_app.core.widget.placeholder.PlaceHolder;
import defpackage.ac4;
import defpackage.nt3;
import defpackage.wfb;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class FragmentLeaderboardValueAttachmentsBinding implements wfb {
    public final ConstraintLayout a;
    public final RecyclerView b;
    public final PlaceHolder c;
    public final SimpleProgressBar d;
    public final MaterialToolbar e;

    public FragmentLeaderboardValueAttachmentsBinding(ConstraintLayout constraintLayout, RecyclerView recyclerView, PlaceHolder placeHolder, SimpleProgressBar simpleProgressBar, MaterialToolbar materialToolbar) {
        this.a = constraintLayout;
        this.b = recyclerView;
        this.c = placeHolder;
        this.d = simpleProgressBar;
        this.e = materialToolbar;
    }

    public static FragmentLeaderboardValueAttachmentsBinding bind(View view) {
        int i = R.id.appBar;
        if (((AppBarLayout) nt3.b(R.id.appBar, view)) != null) {
            i = R.id.commentsList;
            RecyclerView recyclerView = (RecyclerView) nt3.b(R.id.commentsList, view);
            if (recyclerView != null) {
                i = R.id.placeholder;
                PlaceHolder placeHolder = (PlaceHolder) nt3.b(R.id.placeholder, view);
                if (placeHolder != null) {
                    i = R.id.progress;
                    SimpleProgressBar simpleProgressBar = (SimpleProgressBar) nt3.b(R.id.progress, view);
                    if (simpleProgressBar != null) {
                        i = R.id.toolbar;
                        MaterialToolbar materialToolbar = (MaterialToolbar) nt3.b(R.id.toolbar, view);
                        if (materialToolbar != null) {
                            return new FragmentLeaderboardValueAttachmentsBinding((ConstraintLayout) view, recyclerView, placeHolder, simpleProgressBar, materialToolbar);
                        }
                    }
                }
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static FragmentLeaderboardValueAttachmentsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_leaderboard_value_attachments, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static FragmentLeaderboardValueAttachmentsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
