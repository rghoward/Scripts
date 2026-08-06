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
public final class r96 implements wfb {
    public final MaterialCardView a;
    public final MaterialTextView b;

    public r96(MaterialCardView materialCardView, MaterialTextView materialTextView) {
        this.a = materialCardView;
        this.b = materialTextView;
    }

    public static r96 bind(View view) {
        int i = R.id.valueDescription;
        MaterialTextView materialTextView = (MaterialTextView) nt3.b(R.id.valueDescription, view);
        if (materialTextView != null) {
            i = R.id.valuePercentage;
            if (((MaterialTextView) nt3.b(R.id.valuePercentage, view)) != null) {
                i = R.id.valuePercentageBg;
                if (((ImageView) nt3.b(R.id.valuePercentageBg, view)) != null) {
                    i = R.id.valueText;
                    if (((MaterialTextView) nt3.b(R.id.valueText, view)) != null) {
                        i = R.id.valueTitle;
                        if (((MaterialTextView) nt3.b(R.id.valueTitle, view)) != null) {
                            return new r96((MaterialCardView) view, materialTextView);
                        }
                    }
                }
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static r96 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.list_item_challenge, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static r96 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
