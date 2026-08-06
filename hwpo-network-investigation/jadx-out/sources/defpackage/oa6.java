package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class oa6 implements wfb {
    public final ConstraintLayout a;
    public final AppCompatImageView b;
    public final MaterialTextView c;
    public final ShapeableImageView d;
    public final MaterialTextView e;
    public final MaterialTextView f;
    public final MaterialTextView g;

    public oa6(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, MaterialTextView materialTextView, ShapeableImageView shapeableImageView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4) {
        this.a = constraintLayout;
        this.b = appCompatImageView;
        this.c = materialTextView;
        this.d = shapeableImageView;
        this.e = materialTextView2;
        this.f = materialTextView3;
        this.g = materialTextView4;
    }

    public static oa6 bind(View view) {
        int i = R.id.actionImage;
        AppCompatImageView appCompatImageView = (AppCompatImageView) nt3.b(R.id.actionImage, view);
        if (appCompatImageView != null) {
            i = R.id.authorNameText;
            MaterialTextView materialTextView = (MaterialTextView) nt3.b(R.id.authorNameText, view);
            if (materialTextView != null) {
                i = R.id.avatarContainer;
                if (((FrameLayout) nt3.b(R.id.avatarContainer, view)) != null) {
                    i = R.id.avatarImg;
                    ShapeableImageView shapeableImageView = (ShapeableImageView) nt3.b(R.id.avatarImg, view);
                    if (shapeableImageView != null) {
                        i = R.id.commentSentTimeText;
                        MaterialTextView materialTextView2 = (MaterialTextView) nt3.b(R.id.commentSentTimeText, view);
                        if (materialTextView2 != null) {
                            i = R.id.commentText;
                            MaterialTextView materialTextView3 = (MaterialTextView) nt3.b(R.id.commentText, view);
                            if (materialTextView3 != null) {
                                i = R.id.userNameFirstLetter;
                                MaterialTextView materialTextView4 = (MaterialTextView) nt3.b(R.id.userNameFirstLetter, view);
                                if (materialTextView4 != null) {
                                    return new oa6((ConstraintLayout) view, appCompatImageView, materialTextView, shapeableImageView, materialTextView2, materialTextView3, materialTextView4);
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

    public static oa6 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.list_item_text_comment, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static oa6 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
