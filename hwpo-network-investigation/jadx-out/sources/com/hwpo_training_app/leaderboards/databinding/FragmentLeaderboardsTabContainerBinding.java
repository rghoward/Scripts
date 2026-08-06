package com.hwpo_training_app.leaderboards.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.SearchEditText;
import com.hwpo_training_app.core.widget.tabs.CustomTabLayout;
import defpackage.ac4;
import defpackage.nt3;
import defpackage.wfb;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class FragmentLeaderboardsTabContainerBinding implements wfb {
    public final LinearLayout a;
    public final FrameLayout b;
    public final ImageButton c;
    public final View d;
    public final FrameLayout e;
    public final CustomTabLayout f;
    public final ViewPager2 g;
    public final ImageView h;
    public final ConstraintLayout i;
    public final SearchEditText j;
    public final MaterialToolbar k;

    public FragmentLeaderboardsTabContainerBinding(LinearLayout linearLayout, FrameLayout frameLayout, ImageButton imageButton, View view, FrameLayout frameLayout2, CustomTabLayout customTabLayout, ViewPager2 viewPager2, ImageView imageView, ConstraintLayout constraintLayout, SearchEditText searchEditText, MaterialToolbar materialToolbar) {
        this.a = linearLayout;
        this.b = frameLayout;
        this.c = imageButton;
        this.d = view;
        this.e = frameLayout2;
        this.f = customTabLayout;
        this.g = viewPager2;
        this.h = imageView;
        this.i = constraintLayout;
        this.j = searchEditText;
        this.k = materialToolbar;
    }

    public static FragmentLeaderboardsTabContainerBinding bind(View view) {
        int i = R.id.appBar;
        if (((AppBarLayout) nt3.b(R.id.appBar, view)) != null) {
            i = R.id.btnCancelSearch;
            FrameLayout frameLayout = (FrameLayout) nt3.b(R.id.btnCancelSearch, view);
            if (frameLayout != null) {
                i = R.id.btnFilters;
                ImageButton imageButton = (ImageButton) nt3.b(R.id.btnFilters, view);
                if (imageButton != null) {
                    i = R.id.filtersBadge;
                    View viewB = nt3.b(R.id.filtersBadge, view);
                    if (viewB != null) {
                        i = R.id.filtersBtnContainer;
                        FrameLayout frameLayout2 = (FrameLayout) nt3.b(R.id.filtersBtnContainer, view);
                        if (frameLayout2 != null) {
                            i = R.id.leaderboardsTabLayout;
                            CustomTabLayout customTabLayout = (CustomTabLayout) nt3.b(R.id.leaderboardsTabLayout, view);
                            if (customTabLayout != null) {
                                i = R.id.leaderboardsViewPager;
                                ViewPager2 viewPager2 = (ViewPager2) nt3.b(R.id.leaderboardsViewPager, view);
                                if (viewPager2 != null) {
                                    i = R.id.searchBtn;
                                    ImageView imageView = (ImageView) nt3.b(R.id.searchBtn, view);
                                    if (imageView != null) {
                                        i = R.id.searchContainer;
                                        ConstraintLayout constraintLayout = (ConstraintLayout) nt3.b(R.id.searchContainer, view);
                                        if (constraintLayout != null) {
                                            i = R.id.searchFieldEditText;
                                            SearchEditText searchEditText = (SearchEditText) nt3.b(R.id.searchFieldEditText, view);
                                            if (searchEditText != null) {
                                                i = R.id.toolbar;
                                                MaterialToolbar materialToolbar = (MaterialToolbar) nt3.b(R.id.toolbar, view);
                                                if (materialToolbar != null) {
                                                    i = R.id.toolbarContainer;
                                                    if (((FrameLayout) nt3.b(R.id.toolbarContainer, view)) != null) {
                                                        return new FragmentLeaderboardsTabContainerBinding((LinearLayout) view, frameLayout, imageButton, viewB, frameLayout2, customTabLayout, viewPager2, imageView, constraintLayout, searchEditText, materialToolbar);
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

    public static FragmentLeaderboardsTabContainerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_leaderboards_tab_container, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static FragmentLeaderboardsTabContainerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
