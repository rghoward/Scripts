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
public final class e03 implements wfb {
    public final ConstraintLayout a;
    public final ImageView b;
    public final MaterialTextView c;
    public final MaterialTextView d;
    public final MaterialTextView e;
    public final MaterialTextView f;

    public e03(ConstraintLayout constraintLayout, ImageView imageView, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = materialTextView;
        this.d = materialTextView2;
        this.e = materialTextView3;
        this.f = materialTextView4;
    }

    public static e03 bind(View view) {
        int i = R.id.bottomSheetQuantityClose;
        ImageView imageView = (ImageView) nt3.b(R.id.bottomSheetQuantityClose, view);
        if (imageView != null) {
            i = R.id.captureVideoText;
            MaterialTextView materialTextView = (MaterialTextView) nt3.b(R.id.captureVideoText, view);
            if (materialTextView != null) {
                i = R.id.openMyLibraryTv;
                MaterialTextView materialTextView2 = (MaterialTextView) nt3.b(R.id.openMyLibraryTv, view);
                if (materialTextView2 != null) {
                    i = R.id.pickFileOrMedia;
                    MaterialTextView materialTextView3 = (MaterialTextView) nt3.b(R.id.pickFileOrMedia, view);
                    if (materialTextView3 != null) {
                        i = R.id.pickPhotoTitle;
                        if (((MaterialTextView) nt3.b(R.id.pickPhotoTitle, view)) != null) {
                            i = R.id.pickVideoTvTakePhoto;
                            MaterialTextView materialTextView4 = (MaterialTextView) nt3.b(R.id.pickVideoTvTakePhoto, view);
                            if (materialTextView4 != null) {
                                return new e03((ConstraintLayout) view, imageView, materialTextView, materialTextView2, materialTextView3, materialTextView4);
                            }
                        }
                    }
                }
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static e03 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_pick_media, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static e03 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
