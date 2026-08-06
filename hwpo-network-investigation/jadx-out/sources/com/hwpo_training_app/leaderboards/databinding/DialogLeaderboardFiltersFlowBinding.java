package com.hwpo_training_app.leaderboards.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import com.hwpo_training_app.R;
import defpackage.ac4;
import defpackage.wfb;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogLeaderboardFiltersFlowBinding implements wfb {
    public final FragmentContainerView a;

    public DialogLeaderboardFiltersFlowBinding(FragmentContainerView fragmentContainerView) {
        this.a = fragmentContainerView;
    }

    public static DialogLeaderboardFiltersFlowBinding bind(View view) {
        if (view != null) {
            return new DialogLeaderboardFiltersFlowBinding((FragmentContainerView) view);
        }
        ac4.c("rootView");
        return null;
    }

    public static DialogLeaderboardFiltersFlowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_leaderboard_filters_flow, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static DialogLeaderboardFiltersFlowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
