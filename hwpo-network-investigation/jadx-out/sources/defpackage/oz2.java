package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.SimpleProgressBar;
import com.hwpo_training_app.core.widget.placeholder.PlaceHolder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class oz2 implements wfb {
    public final ConstraintLayout a;
    public final MaterialButton b;
    public final MaterialTextView c;
    public final RecyclerView d;
    public final MaterialTextView e;
    public final PlaceHolder f;
    public final SimpleProgressBar g;
    public final MaterialToolbar h;

    public oz2(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialTextView materialTextView, RecyclerView recyclerView, MaterialTextView materialTextView2, PlaceHolder placeHolder, SimpleProgressBar simpleProgressBar, MaterialToolbar materialToolbar) {
        this.a = constraintLayout;
        this.b = materialButton;
        this.c = materialTextView;
        this.d = recyclerView;
        this.e = materialTextView2;
        this.f = placeHolder;
        this.g = simpleProgressBar;
        this.h = materialToolbar;
    }

    public static oz2 bind(View view) {
        int i = R.id.bottomContainer;
        if (((FrameLayout) nt3.b(R.id.bottomContainer, view)) != null) {
            i = R.id.btn_save;
            MaterialButton materialButton = (MaterialButton) nt3.b(R.id.btn_save, view);
            if (materialButton != null) {
                i = R.id.clearBtn;
                MaterialTextView materialTextView = (MaterialTextView) nt3.b(R.id.clearBtn, view);
                if (materialTextView != null) {
                    i = R.id.itemsList;
                    RecyclerView recyclerView = (RecyclerView) nt3.b(R.id.itemsList, view);
                    if (recyclerView != null) {
                        i = R.id.pickItemLabel;
                        MaterialTextView materialTextView2 = (MaterialTextView) nt3.b(R.id.pickItemLabel, view);
                        if (materialTextView2 != null) {
                            i = R.id.placeholder;
                            PlaceHolder placeHolder = (PlaceHolder) nt3.b(R.id.placeholder, view);
                            if (placeHolder != null) {
                                i = R.id.progress;
                                SimpleProgressBar simpleProgressBar = (SimpleProgressBar) nt3.b(R.id.progress, view);
                                if (simpleProgressBar != null) {
                                    i = R.id.toolbar;
                                    MaterialToolbar materialToolbar = (MaterialToolbar) nt3.b(R.id.toolbar, view);
                                    if (materialToolbar != null) {
                                        return new oz2((ConstraintLayout) view, materialButton, materialTextView, recyclerView, materialTextView2, placeHolder, simpleProgressBar, materialToolbar);
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

    public static oz2 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_gym_location_filter, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static oz2 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
