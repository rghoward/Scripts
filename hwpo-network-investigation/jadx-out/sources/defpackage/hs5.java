package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hs5 implements wfb {
    public final ConstraintLayout a;
    public final MaterialButton b;
    public final MaterialTextView c;
    public final MaterialTextView d;

    public hs5(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        this.a = constraintLayout;
        this.b = materialButton;
        this.c = materialTextView;
        this.d = materialTextView2;
    }

    public static hs5 bind(View view) {
        int i = R.id.placeholderActionButton;
        MaterialButton materialButton = (MaterialButton) nt3.b(R.id.placeholderActionButton, view);
        if (materialButton != null) {
            i = R.id.placeholderSubTitle;
            MaterialTextView materialTextView = (MaterialTextView) nt3.b(R.id.placeholderSubTitle, view);
            if (materialTextView != null) {
                i = R.id.placeholderTitle;
                MaterialTextView materialTextView2 = (MaterialTextView) nt3.b(R.id.placeholderTitle, view);
                if (materialTextView2 != null) {
                    return new hs5((ConstraintLayout) view, materialButton, materialTextView, materialTextView2);
                }
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static hs5 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_placeholder, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static hs5 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
