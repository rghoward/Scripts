package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;
import com.hwpo_training_app.benchmarks.presentation.widget.BenchmarksExpandableLayout;
import com.hwpo_training_app.core.widget.SimpleProgressBar;
import com.hwpo_training_app.core.widget.placeholder.PlaceHolder;
import com.hwpo_training_app.sessions.presentation.widget.PerformanceExpandableLayout;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class tf4 implements wfb {
    public final RelativeLayout a;
    public final BenchmarksExpandableLayout b;
    public final LinearLayoutCompat c;
    public final MaterialCardView d;
    public final MaterialTextView e;
    public final RecyclerView f;
    public final RecyclerView g;
    public final AppCompatImageButton h;
    public final PerformanceExpandableLayout i;
    public final PlaceHolder j;
    public final SimpleProgressBar k;
    public final MaterialToolbar l;

    public tf4(RelativeLayout relativeLayout, BenchmarksExpandableLayout benchmarksExpandableLayout, LinearLayoutCompat linearLayoutCompat, MaterialCardView materialCardView, MaterialTextView materialTextView, RecyclerView recyclerView, RecyclerView recyclerView2, AppCompatImageButton appCompatImageButton, PerformanceExpandableLayout performanceExpandableLayout, PlaceHolder placeHolder, SimpleProgressBar simpleProgressBar, MaterialToolbar materialToolbar) {
        this.a = relativeLayout;
        this.b = benchmarksExpandableLayout;
        this.c = linearLayoutCompat;
        this.d = materialCardView;
        this.e = materialTextView;
        this.f = recyclerView;
        this.g = recyclerView2;
        this.h = appCompatImageButton;
        this.i = performanceExpandableLayout;
        this.j = placeHolder;
        this.k = simpleProgressBar;
        this.l = materialToolbar;
    }

    public static tf4 bind(View view) {
        int i = R.id.benchmarksExpandableLayout;
        BenchmarksExpandableLayout benchmarksExpandableLayout = (BenchmarksExpandableLayout) nt3.b(R.id.benchmarksExpandableLayout, view);
        if (benchmarksExpandableLayout != null) {
            i = R.id.contentContainer;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) nt3.b(R.id.contentContainer, view);
            if (linearLayoutCompat != null) {
                i = R.id.descriptionBlock;
                MaterialCardView materialCardView = (MaterialCardView) nt3.b(R.id.descriptionBlock, view);
                if (materialCardView != null) {
                    i = R.id.descriptionText;
                    MaterialTextView materialTextView = (MaterialTextView) nt3.b(R.id.descriptionText, view);
                    if (materialTextView != null) {
                        i = R.id.fileAttachmentsList;
                        RecyclerView recyclerView = (RecyclerView) nt3.b(R.id.fileAttachmentsList, view);
                        if (recyclerView != null) {
                            i = R.id.mediaAttachmentsList;
                            RecyclerView recyclerView2 = (RecyclerView) nt3.b(R.id.mediaAttachmentsList, view);
                            if (recyclerView2 != null) {
                                i = R.id.openLeaderboardButton;
                                AppCompatImageButton appCompatImageButton = (AppCompatImageButton) nt3.b(R.id.openLeaderboardButton, view);
                                if (appCompatImageButton != null) {
                                    i = R.id.performanceExpandableLayout;
                                    PerformanceExpandableLayout performanceExpandableLayout = (PerformanceExpandableLayout) nt3.b(R.id.performanceExpandableLayout, view);
                                    if (performanceExpandableLayout != null) {
                                        i = R.id.placeholder;
                                        PlaceHolder placeHolder = (PlaceHolder) nt3.b(R.id.placeholder, view);
                                        if (placeHolder != null) {
                                            i = R.id.progress;
                                            SimpleProgressBar simpleProgressBar = (SimpleProgressBar) nt3.b(R.id.progress, view);
                                            if (simpleProgressBar != null) {
                                                i = R.id.toolbar;
                                                MaterialToolbar materialToolbar = (MaterialToolbar) nt3.b(R.id.toolbar, view);
                                                if (materialToolbar != null) {
                                                    return new tf4((RelativeLayout) view, benchmarksExpandableLayout, linearLayoutCompat, materialCardView, materialTextView, recyclerView, recyclerView2, appCompatImageButton, performanceExpandableLayout, placeHolder, simpleProgressBar, materialToolbar);
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

    public static tf4 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_session_details, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static tf4 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
