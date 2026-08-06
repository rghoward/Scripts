package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.SearchEditText;
import com.hwpo_training_app.core.widget.SimpleProgressBar;
import com.hwpo_training_app.core.widget.placeholder.PlaceHolder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ge4 implements wfb {
    public final ConstraintLayout a;
    public final MaterialTextView b;
    public final ImageButton c;
    public final PlaceHolder d;
    public final SimpleProgressBar e;
    public final MaterialButton f;
    public final SearchEditText g;
    public final LinearLayoutCompat h;
    public final MaterialToolbar i;
    public final RecyclerView j;

    public ge4(ConstraintLayout constraintLayout, MaterialTextView materialTextView, ImageButton imageButton, PlaceHolder placeHolder, SimpleProgressBar simpleProgressBar, MaterialButton materialButton, SearchEditText searchEditText, LinearLayoutCompat linearLayoutCompat, MaterialToolbar materialToolbar, RecyclerView recyclerView) {
        this.a = constraintLayout;
        this.b = materialTextView;
        this.c = imageButton;
        this.d = placeHolder;
        this.e = simpleProgressBar;
        this.f = materialButton;
        this.g = searchEditText;
        this.h = linearLayoutCompat;
        this.i = materialToolbar;
        this.j = recyclerView;
    }

    public static ge4 bind(View view) {
        int i = R.id.buttonBackground;
        if (((FrameLayout) nt3.b(R.id.buttonBackground, view)) != null) {
            i = R.id.cancelSearchButton;
            MaterialTextView materialTextView = (MaterialTextView) nt3.b(R.id.cancelSearchButton, view);
            if (materialTextView != null) {
                i = R.id.end;
                if (((Guideline) nt3.b(R.id.end, view)) != null) {
                    i = R.id.filtersBtn;
                    ImageButton imageButton = (ImageButton) nt3.b(R.id.filtersBtn, view);
                    if (imageButton != null) {
                        i = R.id.placeholder;
                        PlaceHolder placeHolder = (PlaceHolder) nt3.b(R.id.placeholder, view);
                        if (placeHolder != null) {
                            i = R.id.progress;
                            SimpleProgressBar simpleProgressBar = (SimpleProgressBar) nt3.b(R.id.progress, view);
                            if (simpleProgressBar != null) {
                                i = R.id.saveBtn;
                                MaterialButton materialButton = (MaterialButton) nt3.b(R.id.saveBtn, view);
                                if (materialButton != null) {
                                    i = R.id.searchQuery;
                                    SearchEditText searchEditText = (SearchEditText) nt3.b(R.id.searchQuery, view);
                                    if (searchEditText != null) {
                                        i = R.id.searchQueryContainer;
                                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) nt3.b(R.id.searchQueryContainer, view);
                                        if (linearLayoutCompat != null) {
                                            i = R.id.start;
                                            if (((Guideline) nt3.b(R.id.start, view)) != null) {
                                                i = R.id.toolbar;
                                                MaterialToolbar materialToolbar = (MaterialToolbar) nt3.b(R.id.toolbar, view);
                                                if (materialToolbar != null) {
                                                    i = R.id.valueNameCaption;
                                                    if (((MaterialTextView) nt3.b(R.id.valueNameCaption, view)) != null) {
                                                        i = R.id.valuesList;
                                                        RecyclerView recyclerView = (RecyclerView) nt3.b(R.id.valuesList, view);
                                                        if (recyclerView != null) {
                                                            return new ge4((ConstraintLayout) view, materialTextView, imageButton, placeHolder, simpleProgressBar, materialButton, searchEditText, linearLayoutCompat, materialToolbar, recyclerView);
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

    public static ge4 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_affilated_gyms_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static ge4 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
