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
public final class z96 implements wfb {
    public final AspectRatioCardView a;
    public final AppCompatImageView b;
    public final AppCompatImageView c;
    public final MaterialTextView d;

    public z96(AspectRatioCardView aspectRatioCardView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, MaterialTextView materialTextView) {
        this.a = aspectRatioCardView;
        this.b = appCompatImageView;
        this.c = appCompatImageView2;
        this.d = materialTextView;
    }

    public static z96 bind(View view) {
        int i = R.id.isVideoImage;
        AppCompatImageView appCompatImageView = (AppCompatImageView) nt3.b(R.id.isVideoImage, view);
        if (appCompatImageView != null) {
            i = R.id.thumbnailImage;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) nt3.b(R.id.thumbnailImage, view);
            if (appCompatImageView2 != null) {
                i = R.id.titleText;
                MaterialTextView materialTextView = (MaterialTextView) nt3.b(R.id.titleText, view);
                if (materialTextView != null) {
                    return new z96((AspectRatioCardView) view, appCompatImageView, appCompatImageView2, materialTextView);
                }
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static z96 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.list_item_media_attachment, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static z96 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
