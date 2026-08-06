package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class js5 implements wfb {
    public final MaterialTextView a;
    public final MaterialTextView b;

    public js5(MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        this.a = materialTextView;
        this.b = materialTextView2;
    }

    public static js5 bind(View view) {
        if (view != null) {
            MaterialTextView materialTextView = (MaterialTextView) view;
            return new js5(materialTextView, materialTextView);
        }
        ac4.c("rootView");
        return null;
    }

    public static js5 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_score_multiply_interval_text, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static js5 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
