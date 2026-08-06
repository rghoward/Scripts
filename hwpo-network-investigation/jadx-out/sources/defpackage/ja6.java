package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ja6 implements wfb {
    public final MaterialCardView a;
    public final ImageView b;
    public final ImageView c;
    public final ImageView d;
    public final MaterialTextView e;
    public final ImageView f;
    public final MaterialTextView g;

    public ja6(MaterialCardView materialCardView, ImageView imageView, ImageView imageView2, ImageView imageView3, MaterialTextView materialTextView, ImageView imageView4, MaterialTextView materialTextView2) {
        this.a = materialCardView;
        this.b = imageView;
        this.c = imageView2;
        this.d = imageView3;
        this.e = materialTextView;
        this.f = imageView4;
        this.g = materialTextView2;
    }

    public static ja6 bind(View view) {
        int i = R.id.checkmark;
        ImageView imageView = (ImageView) nt3.b(R.id.checkmark, view);
        if (imageView != null) {
            i = R.id.gradient;
            ImageView imageView2 = (ImageView) nt3.b(R.id.gradient, view);
            if (imageView2 != null) {
                i = R.id.hwpoPlaceholder;
                ImageView imageView3 = (ImageView) nt3.b(R.id.hwpoPlaceholder, view);
                if (imageView3 != null) {
                    i = R.id.programDateText;
                    MaterialTextView materialTextView = (MaterialTextView) nt3.b(R.id.programDateText, view);
                    if (materialTextView != null) {
                        i = R.id.programImage;
                        ImageView imageView4 = (ImageView) nt3.b(R.id.programImage, view);
                        if (imageView4 != null) {
                            i = R.id.programTitleText;
                            MaterialTextView materialTextView2 = (MaterialTextView) nt3.b(R.id.programTitleText, view);
                            if (materialTextView2 != null) {
                                return new ja6((MaterialCardView) view, imageView, imageView2, imageView3, materialTextView, imageView4, materialTextView2);
                            }
                        }
                    }
                }
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static ja6 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.list_item_program, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static ja6 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
