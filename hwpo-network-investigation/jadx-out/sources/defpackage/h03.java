package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class h03 implements wfb {
    public final MaterialCardView a;
    public final View b;
    public final MaterialTextView c;

    public h03(MaterialCardView materialCardView, View view, MaterialTextView materialTextView) {
        this.a = materialCardView;
        this.b = view;
        this.c = materialTextView;
    }

    public static h03 bind(View view) {
        int i = R.id.descriptionText;
        if (((MaterialTextView) nt3.b(R.id.descriptionText, view)) != null) {
            i = R.id.line;
            View viewB = nt3.b(R.id.line, view);
            if (viewB != null) {
                i = R.id.okText;
                MaterialTextView materialTextView = (MaterialTextView) nt3.b(R.id.okText, view);
                if (materialTextView != null) {
                    return new h03((MaterialCardView) view, viewB, materialTextView);
                }
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static h03 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_scaled_tooltip, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static h03 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
