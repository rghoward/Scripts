package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import com.google.android.material.button.MaterialButton;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.AspectRatioImageView;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class oe4 implements wfb {
    public final RelativeLayout a;
    public final MaterialButton b;
    public final MaterialButton c;
    public final MaterialButton d;

    public oe4(RelativeLayout relativeLayout, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3) {
        this.a = relativeLayout;
        this.b = materialButton;
        this.c = materialButton2;
        this.d = materialButton3;
    }

    public static oe4 bind(View view) {
        int i = R.id.backBtn;
        MaterialButton materialButton = (MaterialButton) nt3.b(R.id.backBtn, view);
        if (materialButton != null) {
            i = R.id.backToLoginBtn;
            MaterialButton materialButton2 = (MaterialButton) nt3.b(R.id.backToLoginBtn, view);
            if (materialButton2 != null) {
                i = R.id.image;
                if (((AspectRatioImageView) nt3.b(R.id.image, view)) != null) {
                    i = R.id.learnMoreBtn;
                    MaterialButton materialButton3 = (MaterialButton) nt3.b(R.id.learnMoreBtn, view);
                    if (materialButton3 != null) {
                        i = R.id.scrollView;
                        if (((ScrollView) nt3.b(R.id.scrollView, view)) != null) {
                            return new oe4((RelativeLayout) view, materialButton, materialButton2, materialButton3);
                        }
                    }
                }
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static oe4 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_do_not_have_account, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static oe4 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
