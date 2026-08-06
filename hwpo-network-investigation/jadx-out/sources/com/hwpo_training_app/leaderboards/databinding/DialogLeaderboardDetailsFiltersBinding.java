package com.hwpo_training_app.leaderboards.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;
import defpackage.ac4;
import defpackage.nt3;
import defpackage.wfb;
import net.cachapa.expandablelayout.ExpandableLayout;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogLeaderboardDetailsFiltersBinding implements wfb {
    public final ConstraintLayout a;
    public final ExpandableLayout b;
    public final MaterialButton c;
    public final MaterialTextView d;
    public final AppCompatEditText e;
    public final AppCompatEditText f;
    public final MaterialTextView g;
    public final LinearLayoutCompat h;
    public final NestedScrollView i;
    public final MaterialTextView j;
    public final MaterialTextView k;
    public final MaterialTextView l;
    public final MaterialTextView m;
    public final MaterialTextView n;
    public final MaterialTextView o;
    public final MaterialToolbar p;

    public DialogLeaderboardDetailsFiltersBinding(ConstraintLayout constraintLayout, ExpandableLayout expandableLayout, MaterialButton materialButton, MaterialTextView materialTextView, AppCompatEditText appCompatEditText, AppCompatEditText appCompatEditText2, MaterialTextView materialTextView2, LinearLayoutCompat linearLayoutCompat, NestedScrollView nestedScrollView, MaterialTextView materialTextView3, MaterialTextView materialTextView4, MaterialTextView materialTextView5, MaterialTextView materialTextView6, MaterialTextView materialTextView7, MaterialTextView materialTextView8, MaterialToolbar materialToolbar) {
        this.a = constraintLayout;
        this.b = expandableLayout;
        this.c = materialButton;
        this.d = materialTextView;
        this.e = appCompatEditText;
        this.f = appCompatEditText2;
        this.g = materialTextView2;
        this.h = linearLayoutCompat;
        this.i = nestedScrollView;
        this.j = materialTextView3;
        this.k = materialTextView4;
        this.l = materialTextView5;
        this.m = materialTextView6;
        this.n = materialTextView7;
        this.o = materialTextView8;
        this.p = materialToolbar;
    }

    public static DialogLeaderboardDetailsFiltersBinding bind(View view) {
        int i = R.id.ageContainer;
        if (((LinearLayoutCompat) nt3.b(R.id.ageContainer, view)) != null) {
            i = R.id.ageFieldsExpandableContainer;
            ExpandableLayout expandableLayout = (ExpandableLayout) nt3.b(R.id.ageFieldsExpandableContainer, view);
            if (expandableLayout != null) {
                i = R.id.bottomContainer;
                if (((FrameLayout) nt3.b(R.id.bottomContainer, view)) != null) {
                    i = R.id.btnApplyFilters;
                    MaterialButton materialButton = (MaterialButton) nt3.b(R.id.btnApplyFilters, view);
                    if (materialButton != null) {
                        i = R.id.genderContainer;
                        if (((LinearLayoutCompat) nt3.b(R.id.genderContainer, view)) != null) {
                            i = R.id.labelAge;
                            if (((MaterialTextView) nt3.b(R.id.labelAge, view)) != null) {
                                i = R.id.labelGender;
                                if (((MaterialTextView) nt3.b(R.id.labelGender, view)) != null) {
                                    i = R.id.labelScoreStatus;
                                    MaterialTextView materialTextView = (MaterialTextView) nt3.b(R.id.labelScoreStatus, view);
                                    if (materialTextView != null) {
                                        i = R.id.maxAgeContainer;
                                        if (((FrameLayout) nt3.b(R.id.maxAgeContainer, view)) != null) {
                                            i = R.id.maxAgeEditText;
                                            AppCompatEditText appCompatEditText = (AppCompatEditText) nt3.b(R.id.maxAgeEditText, view);
                                            if (appCompatEditText != null) {
                                                i = R.id.minAgeContainer;
                                                if (((FrameLayout) nt3.b(R.id.minAgeContainer, view)) != null) {
                                                    i = R.id.minAgeEditText;
                                                    AppCompatEditText appCompatEditText2 = (AppCompatEditText) nt3.b(R.id.minAgeEditText, view);
                                                    if (appCompatEditText2 != null) {
                                                        i = R.id.resetButton;
                                                        MaterialTextView materialTextView2 = (MaterialTextView) nt3.b(R.id.resetButton, view);
                                                        if (materialTextView2 != null) {
                                                            i = R.id.scoreStatusContainer;
                                                            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) nt3.b(R.id.scoreStatusContainer, view);
                                                            if (linearLayoutCompat != null) {
                                                                i = R.id.scrollContainer;
                                                                NestedScrollView nestedScrollView = (NestedScrollView) nt3.b(R.id.scrollContainer, view);
                                                                if (nestedScrollView != null) {
                                                                    i = R.id.textFemaleGender;
                                                                    MaterialTextView materialTextView3 = (MaterialTextView) nt3.b(R.id.textFemaleGender, view);
                                                                    if (materialTextView3 != null) {
                                                                        i = R.id.textHiddenByCoach;
                                                                        MaterialTextView materialTextView4 = (MaterialTextView) nt3.b(R.id.textHiddenByCoach, view);
                                                                        if (materialTextView4 != null) {
                                                                            i = R.id.textMaleGender;
                                                                            MaterialTextView materialTextView5 = (MaterialTextView) nt3.b(R.id.textMaleGender, view);
                                                                            if (materialTextView5 != null) {
                                                                                i = R.id.textMaxAge;
                                                                                if (((MaterialTextView) nt3.b(R.id.textMaxAge, view)) != null) {
                                                                                    i = R.id.textMinAge;
                                                                                    if (((MaterialTextView) nt3.b(R.id.textMinAge, view)) != null) {
                                                                                        i = R.id.textOtherGender;
                                                                                        MaterialTextView materialTextView6 = (MaterialTextView) nt3.b(R.id.textOtherGender, view);
                                                                                        if (materialTextView6 != null) {
                                                                                            i = R.id.textSetAgeRange;
                                                                                            MaterialTextView materialTextView7 = (MaterialTextView) nt3.b(R.id.textSetAgeRange, view);
                                                                                            if (materialTextView7 != null) {
                                                                                                i = R.id.textVisibleByCoach;
                                                                                                MaterialTextView materialTextView8 = (MaterialTextView) nt3.b(R.id.textVisibleByCoach, view);
                                                                                                if (materialTextView8 != null) {
                                                                                                    i = R.id.toolbar;
                                                                                                    MaterialToolbar materialToolbar = (MaterialToolbar) nt3.b(R.id.toolbar, view);
                                                                                                    if (materialToolbar != null) {
                                                                                                        return new DialogLeaderboardDetailsFiltersBinding((ConstraintLayout) view, expandableLayout, materialButton, materialTextView, appCompatEditText, appCompatEditText2, materialTextView2, linearLayoutCompat, nestedScrollView, materialTextView3, materialTextView4, materialTextView5, materialTextView6, materialTextView7, materialTextView8, materialToolbar);
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

    public static DialogLeaderboardDetailsFiltersBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_leaderboard_details_filters, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static DialogLeaderboardDetailsFiltersBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
