package com.hwpo_training_app.leaderboards.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;
import defpackage.ac4;
import defpackage.nt3;
import defpackage.wfb;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogLeaderboardFiltersBinding implements wfb {
    public final ConstraintLayout a;
    public final MaterialButton b;
    public final MaterialTextView c;
    public final SwitchMaterial d;
    public final LayoutLeaderboardFilterDatesBinding e;
    public final LayoutLeaderboardFilterDaysBinding f;
    public final SwitchMaterial g;
    public final MaterialTextView h;
    public final SwitchMaterial i;
    public final MaterialToolbar j;

    public DialogLeaderboardFiltersBinding(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialTextView materialTextView, SwitchMaterial switchMaterial, LayoutLeaderboardFilterDatesBinding layoutLeaderboardFilterDatesBinding, LayoutLeaderboardFilterDaysBinding layoutLeaderboardFilterDaysBinding, SwitchMaterial switchMaterial2, MaterialTextView materialTextView2, SwitchMaterial switchMaterial3, MaterialToolbar materialToolbar) {
        this.a = constraintLayout;
        this.b = materialButton;
        this.c = materialTextView;
        this.d = switchMaterial;
        this.e = layoutLeaderboardFilterDatesBinding;
        this.f = layoutLeaderboardFilterDaysBinding;
        this.g = switchMaterial2;
        this.h = materialTextView2;
        this.i = switchMaterial3;
        this.j = materialToolbar;
    }

    public static DialogLeaderboardFiltersBinding bind(View view) {
        int i = R.id.bottomContainer;
        if (((FrameLayout) nt3.b(R.id.bottomContainer, view)) != null) {
            i = R.id.btnApplyFilters;
            MaterialButton materialButton = (MaterialButton) nt3.b(R.id.btnApplyFilters, view);
            if (materialButton != null) {
                i = R.id.dayFilterError;
                MaterialTextView materialTextView = (MaterialTextView) nt3.b(R.id.dayFilterError, view);
                if (materialTextView != null) {
                    i = R.id.defaultToScaledSwitch;
                    SwitchMaterial switchMaterial = (SwitchMaterial) nt3.b(R.id.defaultToScaledSwitch, view);
                    if (switchMaterial != null) {
                        i = R.id.filterDates;
                        View viewB = nt3.b(R.id.filterDates, view);
                        if (viewB != null) {
                            LayoutLeaderboardFilterDatesBinding layoutLeaderboardFilterDatesBindingBind = LayoutLeaderboardFilterDatesBinding.bind(viewB);
                            i = R.id.filterDays;
                            View viewB2 = nt3.b(R.id.filterDays, view);
                            if (viewB2 != null) {
                                LayoutLeaderboardFilterDaysBinding layoutLeaderboardFilterDaysBindingBind = LayoutLeaderboardFilterDaysBinding.bind(viewB2);
                                i = R.id.hideEmptyLeaderboardsSwitch;
                                SwitchMaterial switchMaterial2 = (SwitchMaterial) nt3.b(R.id.hideEmptyLeaderboardsSwitch, view);
                                if (switchMaterial2 != null) {
                                    i = R.id.labelEmptyLeaderboards;
                                    if (((MaterialTextView) nt3.b(R.id.labelEmptyLeaderboards, view)) != null) {
                                        i = R.id.labelFilterByDate;
                                        if (((MaterialTextView) nt3.b(R.id.labelFilterByDate, view)) != null) {
                                            i = R.id.labelSummary;
                                            if (((MaterialTextView) nt3.b(R.id.labelSummary, view)) != null) {
                                                i = R.id.resetButton;
                                                MaterialTextView materialTextView2 = (MaterialTextView) nt3.b(R.id.resetButton, view);
                                                if (materialTextView2 != null) {
                                                    i = R.id.switchToDayFilter;
                                                    SwitchMaterial switchMaterial3 = (SwitchMaterial) nt3.b(R.id.switchToDayFilter, view);
                                                    if (switchMaterial3 != null) {
                                                        i = R.id.toolbar;
                                                        MaterialToolbar materialToolbar = (MaterialToolbar) nt3.b(R.id.toolbar, view);
                                                        if (materialToolbar != null) {
                                                            return new DialogLeaderboardFiltersBinding((ConstraintLayout) view, materialButton, materialTextView, switchMaterial, layoutLeaderboardFilterDatesBindingBind, layoutLeaderboardFilterDaysBindingBind, switchMaterial2, materialTextView2, switchMaterial3, materialToolbar);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
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

    public static DialogLeaderboardFiltersBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_leaderboard_filters, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static DialogLeaderboardFiltersBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
