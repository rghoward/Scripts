package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
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
public final class zz2 implements wfb {
    public final ConstraintLayout a;
    public final RecyclerView b;
    public final View c;
    public final FrameLayout d;
    public final MaterialTextView e;
    public final ImageView f;
    public final MaterialButton g;
    public final MaterialTextView h;
    public final PlaceHolder i;
    public final SimpleProgressBar j;
    public final MaterialToolbar k;

    public zz2(ConstraintLayout constraintLayout, RecyclerView recyclerView, View view, FrameLayout frameLayout, MaterialTextView materialTextView, ImageView imageView, MaterialButton materialButton, MaterialTextView materialTextView2, PlaceHolder placeHolder, SimpleProgressBar simpleProgressBar, MaterialToolbar materialToolbar) {
        this.a = constraintLayout;
        this.b = recyclerView;
        this.c = view;
        this.d = frameLayout;
        this.e = materialTextView;
        this.f = imageView;
        this.g = materialButton;
        this.h = materialTextView2;
        this.i = placeHolder;
        this.j = simpleProgressBar;
        this.k = materialToolbar;
    }

    public static zz2 bind(View view) {
        int i = R.id.attachmentsRecycler;
        RecyclerView recyclerView = (RecyclerView) nt3.b(R.id.attachmentsRecycler, view);
        if (recyclerView != null) {
            i = R.id.backgroundView;
            View viewB = nt3.b(R.id.backgroundView, view);
            if (viewB != null) {
                i = R.id.bottomContainer;
                FrameLayout frameLayout = (FrameLayout) nt3.b(R.id.bottomContainer, view);
                if (frameLayout != null) {
                    i = R.id.btnClearSelection;
                    MaterialTextView materialTextView = (MaterialTextView) nt3.b(R.id.btnClearSelection, view);
                    if (materialTextView != null) {
                        i = R.id.btnFilters;
                        ImageView imageView = (ImageView) nt3.b(R.id.btnFilters, view);
                        if (imageView != null) {
                            i = R.id.btnSendFiles;
                            MaterialButton materialButton = (MaterialButton) nt3.b(R.id.btnSendFiles, view);
                            if (materialButton != null) {
                                i = R.id.chosenFilterText;
                                MaterialTextView materialTextView2 = (MaterialTextView) nt3.b(R.id.chosenFilterText, view);
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
                                                return new zz2((ConstraintLayout) view, recyclerView, viewB, frameLayout, materialTextView, imageView, materialButton, materialTextView2, placeHolder, simpleProgressBar, materialToolbar);
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

    public static zz2 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_media_library, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static zz2 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
