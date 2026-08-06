package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.charts.BarChart;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.SimpleProgressBar;
import com.hwpo_training_app.core.widget.placeholder.PlaceHolder;
import com.hwpo_training_app.tracking.presentation.widget.ScoreInfoExpandableLayout;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class tg4 implements wfb {
    public final ConstraintLayout a;
    public final BarChart b;
    public final ImageView c;
    public final ScoreInfoExpandableLayout d;
    public final NestedScrollView e;
    public final MaterialTextView f;
    public final FloatingActionButton g;
    public final PlaceHolder h;
    public final FloatingActionButton i;
    public final SimpleProgressBar j;
    public final MaterialToolbar k;
    public final RecyclerView l;
    public final ConstraintLayout m;

    public tg4(ConstraintLayout constraintLayout, BarChart barChart, ImageView imageView, ScoreInfoExpandableLayout scoreInfoExpandableLayout, NestedScrollView nestedScrollView, MaterialTextView materialTextView, FloatingActionButton floatingActionButton, PlaceHolder placeHolder, FloatingActionButton floatingActionButton2, SimpleProgressBar simpleProgressBar, MaterialToolbar materialToolbar, RecyclerView recyclerView, ConstraintLayout constraintLayout2) {
        this.a = constraintLayout;
        this.b = barChart;
        this.c = imageView;
        this.d = scoreInfoExpandableLayout;
        this.e = nestedScrollView;
        this.f = materialTextView;
        this.g = floatingActionButton;
        this.h = placeHolder;
        this.i = floatingActionButton2;
        this.j = simpleProgressBar;
        this.k = materialToolbar;
        this.l = recyclerView;
        this.m = constraintLayout2;
    }

    public static tg4 bind(View view) {
        int i = R.id.barChart;
        BarChart barChart = (BarChart) nt3.b(R.id.barChart, view);
        if (barChart != null) {
            i = R.id.buttonAddValue;
            ImageView imageView = (ImageView) nt3.b(R.id.buttonAddValue, view);
            if (imageView != null) {
                i = R.id.challengeExpandableLayout;
                ScoreInfoExpandableLayout scoreInfoExpandableLayout = (ScoreInfoExpandableLayout) nt3.b(R.id.challengeExpandableLayout, view);
                if (scoreInfoExpandableLayout != null) {
                    i = R.id.chartBarrier;
                    if (((Barrier) nt3.b(R.id.chartBarrier, view)) != null) {
                        i = R.id.chartContainer;
                        if (((ConstraintLayout) nt3.b(R.id.chartContainer, view)) != null) {
                            i = R.id.content;
                            NestedScrollView nestedScrollView = (NestedScrollView) nt3.b(R.id.content, view);
                            if (nestedScrollView != null) {
                                i = R.id.displayedPeriod;
                                MaterialTextView materialTextView = (MaterialTextView) nt3.b(R.id.displayedPeriod, view);
                                if (materialTextView != null) {
                                    i = R.id.nextBtn;
                                    FloatingActionButton floatingActionButton = (FloatingActionButton) nt3.b(R.id.nextBtn, view);
                                    if (floatingActionButton != null) {
                                        i = R.id.placeholder;
                                        PlaceHolder placeHolder = (PlaceHolder) nt3.b(R.id.placeholder, view);
                                        if (placeHolder != null) {
                                            i = R.id.prevBtn;
                                            FloatingActionButton floatingActionButton2 = (FloatingActionButton) nt3.b(R.id.prevBtn, view);
                                            if (floatingActionButton2 != null) {
                                                i = R.id.progress;
                                                SimpleProgressBar simpleProgressBar = (SimpleProgressBar) nt3.b(R.id.progress, view);
                                                if (simpleProgressBar != null) {
                                                    i = R.id.toolbar;
                                                    MaterialToolbar materialToolbar = (MaterialToolbar) nt3.b(R.id.toolbar, view);
                                                    if (materialToolbar != null) {
                                                        i = R.id.valueDetailRv;
                                                        RecyclerView recyclerView = (RecyclerView) nt3.b(R.id.valueDetailRv, view);
                                                        if (recyclerView != null) {
                                                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                                            return new tg4(constraintLayout, barChart, imageView, scoreInfoExpandableLayout, nestedScrollView, materialTextView, floatingActionButton, placeHolder, floatingActionButton2, simpleProgressBar, materialToolbar, recyclerView, constraintLayout);
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

    public static tg4 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_value_details, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static tg4 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
