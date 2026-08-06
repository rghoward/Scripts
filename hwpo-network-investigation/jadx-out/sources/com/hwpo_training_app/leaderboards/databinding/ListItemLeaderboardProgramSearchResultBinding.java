package com.hwpo_training_app.leaderboards.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;
import defpackage.ac4;
import defpackage.nt3;
import defpackage.wfb;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ListItemLeaderboardProgramSearchResultBinding implements wfb {
    public final LinearLayout a;
    public final MaterialTextView b;
    public final MaterialTextView c;

    public ListItemLeaderboardProgramSearchResultBinding(LinearLayout linearLayout, MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        this.a = linearLayout;
        this.b = materialTextView;
        this.c = materialTextView2;
    }

    public static ListItemLeaderboardProgramSearchResultBinding bind(View view) {
        int i = R.id.subtitleText;
        MaterialTextView materialTextView = (MaterialTextView) nt3.b(R.id.subtitleText, view);
        if (materialTextView != null) {
            i = R.id.titleText;
            MaterialTextView materialTextView2 = (MaterialTextView) nt3.b(R.id.titleText, view);
            if (materialTextView2 != null) {
                return new ListItemLeaderboardProgramSearchResultBinding((LinearLayout) view, materialTextView, materialTextView2);
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static ListItemLeaderboardProgramSearchResultBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.list_item_leaderboard_program_search_result, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static ListItemLeaderboardProgramSearchResultBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
