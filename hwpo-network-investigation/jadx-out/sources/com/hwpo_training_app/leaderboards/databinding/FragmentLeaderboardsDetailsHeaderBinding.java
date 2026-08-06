package com.hwpo_training_app.leaderboards.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Space;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.SearchEditText;
import com.hwpo_training_app.core.widget.SimpleProgressBar;
import com.hwpo_training_app.core.widget.tabs.CustomTabLayout;
import defpackage.ac4;
import defpackage.nt3;
import defpackage.wfb;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class FragmentLeaderboardsDetailsHeaderBinding implements wfb {
    public final ConstraintLayout a;
    public final AppBarLayout b;
    public final ConstraintLayout c;
    public final ViewPager2 d;
    public final FrameLayout e;
    public final LinearLayoutCompat f;
    public final ImageView g;
    public final ConstraintLayout h;
    public final View i;
    public final ScrollView j;
    public final MaterialTextView k;
    public final CustomTabLayout l;
    public final MaterialTextView m;
    public final View n;
    public final ImageButton o;
    public final ImageButton p;
    public final SimpleProgressBar q;
    public final SearchEditText r;
    public final MaterialToolbar s;

    public FragmentLeaderboardsDetailsHeaderBinding(ConstraintLayout constraintLayout, AppBarLayout appBarLayout, ConstraintLayout constraintLayout2, ViewPager2 viewPager2, FrameLayout frameLayout, LinearLayoutCompat linearLayoutCompat, ImageView imageView, ConstraintLayout constraintLayout3, View view, ScrollView scrollView, MaterialTextView materialTextView, CustomTabLayout customTabLayout, MaterialTextView materialTextView2, View view2, ImageButton imageButton, ImageButton imageButton2, SimpleProgressBar simpleProgressBar, SearchEditText searchEditText, MaterialToolbar materialToolbar) {
        this.a = constraintLayout;
        this.b = appBarLayout;
        this.c = constraintLayout2;
        this.d = viewPager2;
        this.e = frameLayout;
        this.f = linearLayoutCompat;
        this.g = imageView;
        this.h = constraintLayout3;
        this.i = view;
        this.j = scrollView;
        this.k = materialTextView;
        this.l = customTabLayout;
        this.m = materialTextView2;
        this.n = view2;
        this.o = imageButton;
        this.p = imageButton2;
        this.q = simpleProgressBar;
        this.r = searchEditText;
        this.s = materialToolbar;
    }

    public static FragmentLeaderboardsDetailsHeaderBinding bind(View view) {
        int i = R.id.appBar;
        AppBarLayout appBarLayout = (AppBarLayout) nt3.b(R.id.appBar, view);
        if (appBarLayout != null) {
            i = R.id.appBarContainter;
            ConstraintLayout constraintLayout = (ConstraintLayout) nt3.b(R.id.appBarContainter, view);
            if (constraintLayout != null) {
                i = R.id.athletesListViewPager;
                ViewPager2 viewPager2 = (ViewPager2) nt3.b(R.id.athletesListViewPager, view);
                if (viewPager2 != null) {
                    i = R.id.bottomSpace;
                    if (((Space) nt3.b(R.id.bottomSpace, view)) != null) {
                        i = R.id.btnCancelSearch;
                        FrameLayout frameLayout = (FrameLayout) nt3.b(R.id.btnCancelSearch, view);
                        if (frameLayout != null) {
                            i = R.id.challengesBtnContainer;
                            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) nt3.b(R.id.challengesBtnContainer, view);
                            if (linearLayoutCompat != null) {
                                i = R.id.commentsBtn;
                                ImageView imageView = (ImageView) nt3.b(R.id.commentsBtn, view);
                                if (imageView != null) {
                                    i = R.id.descriptionContainer;
                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) nt3.b(R.id.descriptionContainer, view);
                                    if (constraintLayout2 != null) {
                                        i = R.id.descriptionGradient;
                                        View viewB = nt3.b(R.id.descriptionGradient, view);
                                        if (viewB != null) {
                                            i = R.id.descriptionScrollView;
                                            ScrollView scrollView = (ScrollView) nt3.b(R.id.descriptionScrollView, view);
                                            if (scrollView != null) {
                                                i = R.id.descriptionText;
                                                MaterialTextView materialTextView = (MaterialTextView) nt3.b(R.id.descriptionText, view);
                                                if (materialTextView != null) {
                                                    i = R.id.detailsTabLayout;
                                                    CustomTabLayout customTabLayout = (CustomTabLayout) nt3.b(R.id.detailsTabLayout, view);
                                                    if (customTabLayout != null) {
                                                        i = R.id.expandDescriptionButton;
                                                        MaterialTextView materialTextView2 = (MaterialTextView) nt3.b(R.id.expandDescriptionButton, view);
                                                        if (materialTextView2 != null) {
                                                            i = R.id.filtersBadge;
                                                            View viewB2 = nt3.b(R.id.filtersBadge, view);
                                                            if (viewB2 != null) {
                                                                i = R.id.filtersBtn;
                                                                ImageButton imageButton = (ImageButton) nt3.b(R.id.filtersBtn, view);
                                                                if (imageButton != null) {
                                                                    i = R.id.filtersBtnContainer;
                                                                    if (((FrameLayout) nt3.b(R.id.filtersBtnContainer, view)) != null) {
                                                                        i = R.id.openTracking;
                                                                        ImageButton imageButton2 = (ImageButton) nt3.b(R.id.openTracking, view);
                                                                        if (imageButton2 != null) {
                                                                            i = R.id.progress;
                                                                            SimpleProgressBar simpleProgressBar = (SimpleProgressBar) nt3.b(R.id.progress, view);
                                                                            if (simpleProgressBar != null) {
                                                                                i = R.id.searchContainer;
                                                                                if (((LinearLayout) nt3.b(R.id.searchContainer, view)) != null) {
                                                                                    i = R.id.searchFieldEditText;
                                                                                    SearchEditText searchEditText = (SearchEditText) nt3.b(R.id.searchFieldEditText, view);
                                                                                    if (searchEditText != null) {
                                                                                        i = R.id.toolbar;
                                                                                        MaterialToolbar materialToolbar = (MaterialToolbar) nt3.b(R.id.toolbar, view);
                                                                                        if (materialToolbar != null) {
                                                                                            return new FragmentLeaderboardsDetailsHeaderBinding((ConstraintLayout) view, appBarLayout, constraintLayout, viewPager2, frameLayout, linearLayoutCompat, imageView, constraintLayout2, viewB, scrollView, materialTextView, customTabLayout, materialTextView2, viewB2, imageButton, imageButton2, simpleProgressBar, searchEditText, materialToolbar);
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

    public static FragmentLeaderboardsDetailsHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_leaderboards_details_header, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static FragmentLeaderboardsDetailsHeaderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
