package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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
/* JADX INFO: loaded from: classes3.dex */
public final class ee4 implements wfb {
    public final ConstraintLayout a;
    public final SearchEditText b;
    public final MaterialButton c;
    public final PlaceHolder d;
    public final SimpleProgressBar e;
    public final MaterialToolbar f;
    public final MaterialTextView g;
    public final RecyclerView h;

    public ee4(ConstraintLayout constraintLayout, SearchEditText searchEditText, MaterialButton materialButton, PlaceHolder placeHolder, SimpleProgressBar simpleProgressBar, MaterialToolbar materialToolbar, MaterialTextView materialTextView, RecyclerView recyclerView) {
        this.a = constraintLayout;
        this.b = searchEditText;
        this.c = materialButton;
        this.d = placeHolder;
        this.e = simpleProgressBar;
        this.f = materialToolbar;
        this.g = materialTextView;
        this.h = recyclerView;
    }

    public static ee4 bind(View view) {
        int i = R.id.addValueSearch;
        SearchEditText searchEditText = (SearchEditText) nt3.b(R.id.addValueSearch, view);
        if (searchEditText != null) {
            i = R.id.bottomContainer;
            if (((FrameLayout) nt3.b(R.id.bottomContainer, view)) != null) {
                i = R.id.btnSave;
                MaterialButton materialButton = (MaterialButton) nt3.b(R.id.btnSave, view);
                if (materialButton != null) {
                    i = R.id.end;
                    if (((Guideline) nt3.b(R.id.end, view)) != null) {
                        i = R.id.placeholder;
                        PlaceHolder placeHolder = (PlaceHolder) nt3.b(R.id.placeholder, view);
                        if (placeHolder != null) {
                            i = R.id.progress;
                            SimpleProgressBar simpleProgressBar = (SimpleProgressBar) nt3.b(R.id.progress, view);
                            if (simpleProgressBar != null) {
                                i = R.id.start;
                                if (((Guideline) nt3.b(R.id.start, view)) != null) {
                                    i = R.id.toolbar;
                                    MaterialToolbar materialToolbar = (MaterialToolbar) nt3.b(R.id.toolbar, view);
                                    if (materialToolbar != null) {
                                        i = R.id.valueNameCaption;
                                        MaterialTextView materialTextView = (MaterialTextView) nt3.b(R.id.valueNameCaption, view);
                                        if (materialTextView != null) {
                                            i = R.id.valuesList;
                                            RecyclerView recyclerView = (RecyclerView) nt3.b(R.id.valuesList, view);
                                            if (recyclerView != null) {
                                                return new ee4((ConstraintLayout) view, searchEditText, materialButton, placeHolder, simpleProgressBar, materialToolbar, materialTextView, recyclerView);
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

    public static ee4 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_add_value, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static ee4 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
