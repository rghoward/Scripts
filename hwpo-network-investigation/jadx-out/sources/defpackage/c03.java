package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class c03 implements wfb {
    public final ConstraintLayout a;
    public final ImageView b;
    public final MaterialTextView c;
    public final MaterialTextView d;

    public c03(ConstraintLayout constraintLayout, ImageView imageView, MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = materialTextView;
        this.d = materialTextView2;
    }

    public static c03 bind(View view) {
        int i = R.id.bottomSheetQuantityClose;
        ImageView imageView = (ImageView) nt3.b(R.id.bottomSheetQuantityClose, view);
        if (imageView != null) {
            i = R.id.btn_pick_from_gallery;
            MaterialTextView materialTextView = (MaterialTextView) nt3.b(R.id.btn_pick_from_gallery, view);
            if (materialTextView != null) {
                i = R.id.btn_take_photo;
                MaterialTextView materialTextView2 = (MaterialTextView) nt3.b(R.id.btn_take_photo, view);
                if (materialTextView2 != null) {
                    i = R.id.pickPhotoTitle;
                    if (((MaterialTextView) nt3.b(R.id.pickPhotoTitle, view)) != null) {
                        return new c03((ConstraintLayout) view, imageView, materialTextView, materialTextView2);
                    }
                }
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static c03 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_pick_avatar_options, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static c03 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
