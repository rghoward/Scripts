package com.hwpo_training_app.leaderboards.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;
import defpackage.ac4;
import defpackage.nt3;
import defpackage.wfb;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LayoutLeaderboardFilterDatesBinding implements wfb {
    public final LinearLayoutCompat a;
    public final FrameLayout b;
    public final FrameLayout c;
    public final MaterialTextView d;
    public final MaterialTextView e;

    public LayoutLeaderboardFilterDatesBinding(LinearLayoutCompat linearLayoutCompat, FrameLayout frameLayout, FrameLayout frameLayout2, MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        this.a = linearLayoutCompat;
        this.b = frameLayout;
        this.c = frameLayout2;
        this.d = materialTextView;
        this.e = materialTextView2;
    }

    public static LayoutLeaderboardFilterDatesBinding bind(View view) {
        int i = R.id.dateFromContainer;
        FrameLayout frameLayout = (FrameLayout) nt3.b(R.id.dateFromContainer, view);
        if (frameLayout != null) {
            i = R.id.dateToContainer;
            FrameLayout frameLayout2 = (FrameLayout) nt3.b(R.id.dateToContainer, view);
            if (frameLayout2 != null) {
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
                i = R.id.labelDateFrom;
                if (((MaterialTextView) nt3.b(R.id.labelDateFrom, view)) != null) {
                    i = R.id.labelDateTo;
                    if (((MaterialTextView) nt3.b(R.id.labelDateTo, view)) != null) {
                        i = R.id.textDateFrom;
                        MaterialTextView materialTextView = (MaterialTextView) nt3.b(R.id.textDateFrom, view);
                        if (materialTextView != null) {
                            i = R.id.textDateTo;
                            MaterialTextView materialTextView2 = (MaterialTextView) nt3.b(R.id.textDateTo, view);
                            if (materialTextView2 != null) {
                                return new LayoutLeaderboardFilterDatesBinding(linearLayoutCompat, frameLayout, frameLayout2, materialTextView, materialTextView2);
                            }
                        }
                    }
                }
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static LayoutLeaderboardFilterDatesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_leaderboard_filter_dates, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static LayoutLeaderboardFilterDatesBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
