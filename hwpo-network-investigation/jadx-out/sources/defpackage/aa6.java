package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class aa6 implements wfb {
    public final LinearLayout a;
    public final MaterialTextView b;
    public final View c;
    public final ImageView d;

    public aa6(LinearLayout linearLayout, MaterialTextView materialTextView, View view, ImageView imageView) {
        this.a = linearLayout;
        this.b = materialTextView;
        this.c = view;
        this.d = imageView;
    }

    public static aa6 bind(View view) {
        int i = R.id.fileIconImg;
        if (((AppCompatImageView) nt3.b(R.id.fileIconImg, view)) != null) {
            i = R.id.fileNameText;
            MaterialTextView materialTextView = (MaterialTextView) nt3.b(R.id.fileNameText, view);
            if (materialTextView != null) {
                i = R.id.selectedBg;
                View viewB = nt3.b(R.id.selectedBg, view);
                if (viewB != null) {
                    i = R.id.selectedImage;
                    ImageView imageView = (ImageView) nt3.b(R.id.selectedImage, view);
                    if (imageView != null) {
                        return new aa6((LinearLayout) view, materialTextView, viewB, imageView);
                    }
                }
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static aa6 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.list_item_media_file_attachment, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static aa6 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
