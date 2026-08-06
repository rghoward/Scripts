package com.hwpo_training_app.leaderboards.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;
import defpackage.ac4;
import defpackage.nt3;
import defpackage.wfb;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LayoutLeaderboardFilterDaysBinding implements wfb {
    public final LinearLayoutCompat a;
    public final AppCompatEditText b;
    public final AppCompatEditText c;

    public LayoutLeaderboardFilterDaysBinding(LinearLayoutCompat linearLayoutCompat, AppCompatEditText appCompatEditText, AppCompatEditText appCompatEditText2) {
        this.a = linearLayoutCompat;
        this.b = appCompatEditText;
        this.c = appCompatEditText2;
    }

    public static LayoutLeaderboardFilterDaysBinding bind(View view) {
        int i = R.id.dayFromContainer;
        if (((FrameLayout) nt3.b(R.id.dayFromContainer, view)) != null) {
            i = R.id.dayToContainer;
            if (((FrameLayout) nt3.b(R.id.dayToContainer, view)) != null) {
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
                int i2 = R.id.labelDayFrom;
                if (((MaterialTextView) nt3.b(R.id.labelDayFrom, view)) != null) {
                    i2 = R.id.labelDayTo;
                    if (((MaterialTextView) nt3.b(R.id.labelDayTo, view)) != null) {
                        i2 = R.id.textDayFrom;
                        AppCompatEditText appCompatEditText = (AppCompatEditText) nt3.b(R.id.textDayFrom, view);
                        if (appCompatEditText != null) {
                            i2 = R.id.textDayTo;
                            AppCompatEditText appCompatEditText2 = (AppCompatEditText) nt3.b(R.id.textDayTo, view);
                            if (appCompatEditText2 != null) {
                                return new LayoutLeaderboardFilterDaysBinding(linearLayoutCompat, appCompatEditText, appCompatEditText2);
                            }
                        }
                    }
                }
                i = i2;
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static LayoutLeaderboardFilterDaysBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_leaderboard_filter_days, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static LayoutLeaderboardFilterDaysBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
