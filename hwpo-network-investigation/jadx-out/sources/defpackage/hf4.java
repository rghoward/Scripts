package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.AspectRatioImageView;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class hf4 implements wfb {
    public final RelativeLayout a;
    public final MaterialTextView b;
    public final AspectRatioImageView c;
    public final MaterialTextView d;

    public hf4(RelativeLayout relativeLayout, MaterialTextView materialTextView, AspectRatioImageView aspectRatioImageView, MaterialTextView materialTextView2) {
        this.a = relativeLayout;
        this.b = materialTextView;
        this.c = aspectRatioImageView;
        this.d = materialTextView2;
    }

    public static hf4 bind(View view) {
        int i = R.id.scrollView;
        if (((ScrollView) nt3.b(R.id.scrollView, view)) != null) {
            i = R.id.slideDescriptionText;
            MaterialTextView materialTextView = (MaterialTextView) nt3.b(R.id.slideDescriptionText, view);
            if (materialTextView != null) {
                i = R.id.slideImage;
                AspectRatioImageView aspectRatioImageView = (AspectRatioImageView) nt3.b(R.id.slideImage, view);
                if (aspectRatioImageView != null) {
                    i = R.id.slideTitleText;
                    MaterialTextView materialTextView2 = (MaterialTextView) nt3.b(R.id.slideTitleText, view);
                    if (materialTextView2 != null) {
                        return new hf4((RelativeLayout) view, materialTextView, aspectRatioImageView, materialTextView2);
                    }
                }
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static hf4 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_onboarding_tutorial_slide, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static hf4 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
