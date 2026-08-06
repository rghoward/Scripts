package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class pa6 implements wfb {
    public final ConstraintLayout a;
    public final ImageView b;
    public final ShapeableImageView c;
    public final View d;
    public final MaterialTextView e;
    public final View f;
    public final MaterialTextView g;

    public pa6(ConstraintLayout constraintLayout, ImageView imageView, ShapeableImageView shapeableImageView, View view, MaterialTextView materialTextView, View view2, MaterialTextView materialTextView2) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = shapeableImageView;
        this.d = view;
        this.e = materialTextView;
        this.f = view2;
        this.g = materialTextView2;
    }

    public static pa6 bind(View view) {
        int i = R.id.attachmentPlayBtn;
        ImageView imageView = (ImageView) nt3.b(R.id.attachmentPlayBtn, view);
        if (imageView != null) {
            i = R.id.attachmentPreview;
            ShapeableImageView shapeableImageView = (ShapeableImageView) nt3.b(R.id.attachmentPreview, view);
            if (shapeableImageView != null) {
                i = R.id.descriptionGradient;
                View viewB = nt3.b(R.id.descriptionGradient, view);
                if (viewB != null) {
                    i = R.id.descriptionText;
                    MaterialTextView materialTextView = (MaterialTextView) nt3.b(R.id.descriptionText, view);
                    if (materialTextView != null) {
                        i = R.id.dividerLine;
                        View viewB2 = nt3.b(R.id.dividerLine, view);
                        if (viewB2 != null) {
                            i = R.id.tipsTitleText;
                            MaterialTextView materialTextView2 = (MaterialTextView) nt3.b(R.id.tipsTitleText, view);
                            if (materialTextView2 != null) {
                                return new pa6((ConstraintLayout) view, imageView, shapeableImageView, viewB, materialTextView, viewB2, materialTextView2);
                            }
                        }
                    }
                }
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static pa6 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.list_item_today_tips, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static pa6 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
