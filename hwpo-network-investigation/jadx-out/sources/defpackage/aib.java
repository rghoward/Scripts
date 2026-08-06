package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class aib implements wfb {
    public final LinearLayout a;
    public final MaterialTextView b;
    public final MaterialTextView c;

    public aib(LinearLayout linearLayout, MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        this.a = linearLayout;
        this.b = materialTextView;
        this.c = materialTextView2;
    }

    public static aib bind(View view) {
        int i = R.id.picked_option_text;
        MaterialTextView materialTextView = (MaterialTextView) nt3.b(R.id.picked_option_text, view);
        if (materialTextView != null) {
            i = R.id.title_text;
            MaterialTextView materialTextView2 = (MaterialTextView) nt3.b(R.id.title_text, view);
            if (materialTextView2 != null) {
                return new aib((LinearLayout) view, materialTextView, materialTextView2);
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static aib inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.view_picked_option, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static aib inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
