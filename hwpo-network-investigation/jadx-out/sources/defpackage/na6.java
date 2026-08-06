package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class na6 implements wfb {
    public final ConstraintLayout a;
    public final AppCompatImageButton b;
    public final View c;
    public final MaterialTextView d;
    public final View e;
    public final AppCompatImageView f;
    public final MaterialTextView g;

    public na6(ConstraintLayout constraintLayout, AppCompatImageButton appCompatImageButton, View view, MaterialTextView materialTextView, View view2, AppCompatImageView appCompatImageView, MaterialTextView materialTextView2) {
        this.a = constraintLayout;
        this.b = appCompatImageButton;
        this.c = view;
        this.d = materialTextView;
        this.e = view2;
        this.f = appCompatImageView;
        this.g = materialTextView2;
    }

    public static na6 bind(View view) {
        int i = R.id.actionBtn;
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) nt3.b(R.id.actionBtn, view);
        if (appCompatImageButton != null) {
            i = R.id.benchmarksArrowImg;
            if (((AppCompatImageView) nt3.b(R.id.benchmarksArrowImg, view)) != null) {
                i = R.id.descriptionGradient;
                View viewB = nt3.b(R.id.descriptionGradient, view);
                if (viewB != null) {
                    i = R.id.descriptionText;
                    MaterialTextView materialTextView = (MaterialTextView) nt3.b(R.id.descriptionText, view);
                    if (materialTextView != null) {
                        i = R.id.dividerLine;
                        View viewB2 = nt3.b(R.id.dividerLine, view);
                        if (viewB2 != null) {
                            i = R.id.sessionImage;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) nt3.b(R.id.sessionImage, view);
                            if (appCompatImageView != null) {
                                i = R.id.sessionTitleText;
                                MaterialTextView materialTextView2 = (MaterialTextView) nt3.b(R.id.sessionTitleText, view);
                                if (materialTextView2 != null) {
                                    return new na6((ConstraintLayout) view, appCompatImageButton, viewB, materialTextView, viewB2, appCompatImageView, materialTextView2);
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

    public static na6 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.list_item_session, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static na6 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
