package com.hwpo_training_app.leaderboards.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.SimpleProgressBar;
import com.hwpo_training_app.core.widget.placeholder.PlaceHolder;
import defpackage.ac4;
import defpackage.nt3;
import defpackage.wfb;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class FragmentAthletesListBinding implements wfb {
    public final SwipeRefreshLayout a;
    public final SwipeRefreshLayout b;
    public final RecyclerView c;
    public final PlaceHolder d;
    public final SimpleProgressBar e;

    public FragmentAthletesListBinding(RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, SwipeRefreshLayout swipeRefreshLayout2, SimpleProgressBar simpleProgressBar, PlaceHolder placeHolder) {
        this.a = swipeRefreshLayout;
        this.b = swipeRefreshLayout2;
        this.c = recyclerView;
        this.d = placeHolder;
        this.e = simpleProgressBar;
    }

    public static FragmentAthletesListBinding bind(View view) {
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view;
        int i = R.id.leaderboardsAthletesList;
        RecyclerView recyclerView = (RecyclerView) nt3.b(R.id.leaderboardsAthletesList, view);
        if (recyclerView != null) {
            i = R.id.placeholder;
            PlaceHolder placeHolder = (PlaceHolder) nt3.b(R.id.placeholder, view);
            if (placeHolder != null) {
                i = R.id.progress;
                SimpleProgressBar simpleProgressBar = (SimpleProgressBar) nt3.b(R.id.progress, view);
                if (simpleProgressBar != null) {
                    i = R.id.recyclerStickyFooterContainer;
                    if (((FrameLayout) nt3.b(R.id.recyclerStickyFooterContainer, view)) != null) {
                        return new FragmentAthletesListBinding(recyclerView, swipeRefreshLayout, swipeRefreshLayout, simpleProgressBar, placeHolder);
                    }
                }
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static FragmentAthletesListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_athletes_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static FragmentAthletesListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
