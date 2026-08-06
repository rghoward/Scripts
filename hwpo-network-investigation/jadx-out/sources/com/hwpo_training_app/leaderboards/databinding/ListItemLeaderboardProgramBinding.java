package com.hwpo_training_app.leaderboards.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;
import defpackage.ac4;
import defpackage.nt3;
import defpackage.wfb;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ListItemLeaderboardProgramBinding implements wfb {
    public final MaterialCardView a;
    public final View b;
    public final MaterialTextView c;
    public final MaterialTextView d;
    public final MaterialTextView e;
    public final MaterialTextView f;
    public final RecyclerView g;
    public final View h;

    public ListItemLeaderboardProgramBinding(MaterialCardView materialCardView, View view, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4, RecyclerView recyclerView, View view2) {
        this.a = materialCardView;
        this.b = view;
        this.c = materialTextView;
        this.d = materialTextView2;
        this.e = materialTextView3;
        this.f = materialTextView4;
        this.g = recyclerView;
        this.h = view2;
    }

    public static ListItemLeaderboardProgramBinding bind(View view) {
        int i = R.id.bottomDivider;
        View viewB = nt3.b(R.id.bottomDivider, view);
        if (viewB != null) {
            i = R.id.commentsCountText;
            MaterialTextView materialTextView = (MaterialTextView) nt3.b(R.id.commentsCountText, view);
            if (materialTextView != null) {
                i = R.id.lastUpdatedText;
                MaterialTextView materialTextView2 = (MaterialTextView) nt3.b(R.id.lastUpdatedText, view);
                if (materialTextView2 != null) {
                    i = R.id.subtitleText;
                    MaterialTextView materialTextView3 = (MaterialTextView) nt3.b(R.id.subtitleText, view);
                    if (materialTextView3 != null) {
                        i = R.id.titleText;
                        MaterialTextView materialTextView4 = (MaterialTextView) nt3.b(R.id.titleText, view);
                        if (materialTextView4 != null) {
                            i = R.id.topAthletesRecycler;
                            RecyclerView recyclerView = (RecyclerView) nt3.b(R.id.topAthletesRecycler, view);
                            if (recyclerView != null) {
                                i = R.id.topDivider;
                                View viewB2 = nt3.b(R.id.topDivider, view);
                                if (viewB2 != null) {
                                    return new ListItemLeaderboardProgramBinding((MaterialCardView) view, viewB, materialTextView, materialTextView2, materialTextView3, materialTextView4, recyclerView, viewB2);
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

    public static ListItemLeaderboardProgramBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.list_item_leaderboard_program, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static ListItemLeaderboardProgramBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
