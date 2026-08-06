package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class la6 implements wfb {
    public final ConstraintLayout a;
    public final MaterialTextView b;

    public la6(ConstraintLayout constraintLayout, MaterialTextView materialTextView) {
        this.a = constraintLayout;
        this.b = materialTextView;
    }

    public static la6 bind(View view) {
        int i = R.id.arrow;
        if (((ImageView) nt3.b(R.id.arrow, view)) != null) {
            i = R.id.reasonName;
            MaterialTextView materialTextView = (MaterialTextView) nt3.b(R.id.reasonName, view);
            if (materialTextView != null) {
                return new la6((ConstraintLayout) view, materialTextView);
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static la6 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.list_item_report_reason, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static la6 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
