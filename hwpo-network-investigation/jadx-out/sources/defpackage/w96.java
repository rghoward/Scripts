package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class w96 implements wfb {
    public final ConstraintLayout a;
    public final AppCompatImageButton b;
    public final AppCompatImageView c;

    public w96(ConstraintLayout constraintLayout, AppCompatImageButton appCompatImageButton, AppCompatImageView appCompatImageView) {
        this.a = constraintLayout;
        this.b = appCompatImageButton;
        this.c = appCompatImageView;
    }

    public static w96 bind(View view) {
        int i = R.id.completeBtn;
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) nt3.b(R.id.completeBtn, view);
        if (appCompatImageButton != null) {
            i = R.id.sectionImage;
            AppCompatImageView appCompatImageView = (AppCompatImageView) nt3.b(R.id.sectionImage, view);
            if (appCompatImageView != null) {
                return new w96((ConstraintLayout) view, appCompatImageButton, appCompatImageView);
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static w96 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.list_item_gowod, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static w96 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
