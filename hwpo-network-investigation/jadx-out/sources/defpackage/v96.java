package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.AspectRatioCardView;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class v96 implements wfb {
    public final AspectRatioCardView a;
    public final AppCompatImageView b;
    public final AppCompatImageView c;
    public final MaterialTextView d;
    public final MaterialTextView e;
    public final MaterialTextView f;

    public v96(AspectRatioCardView aspectRatioCardView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3) {
        this.a = aspectRatioCardView;
        this.b = appCompatImageView;
        this.c = appCompatImageView2;
        this.d = materialTextView;
        this.e = materialTextView2;
        this.f = materialTextView3;
    }

    public static v96 bind(View view) {
        int i = R.id.actionImage;
        AppCompatImageView appCompatImageView = (AppCompatImageView) nt3.b(R.id.actionImage, view);
        if (appCompatImageView != null) {
            i = R.id.attachmentImg;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) nt3.b(R.id.attachmentImg, view);
            if (appCompatImageView2 != null) {
                i = R.id.extensionText;
                MaterialTextView materialTextView = (MaterialTextView) nt3.b(R.id.extensionText, view);
                if (materialTextView != null) {
                    i = R.id.nameText;
                    MaterialTextView materialTextView2 = (MaterialTextView) nt3.b(R.id.nameText, view);
                    if (materialTextView2 != null) {
                        i = R.id.sizeText;
                        MaterialTextView materialTextView3 = (MaterialTextView) nt3.b(R.id.sizeText, view);
                        if (materialTextView3 != null) {
                            return new v96((AspectRatioCardView) view, appCompatImageView, appCompatImageView2, materialTextView, materialTextView2, materialTextView3);
                        }
                    }
                }
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static v96 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.list_item_file_attachment, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static v96 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
