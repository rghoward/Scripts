package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ha6 implements wfb {
    public final FrameLayout a;
    public final MaterialTextView b;

    public ha6(FrameLayout frameLayout, MaterialTextView materialTextView) {
        this.a = frameLayout;
        this.b = materialTextView;
    }

    public static ha6 bind(View view) {
        MaterialTextView materialTextView = (MaterialTextView) nt3.b(R.id.programOption, view);
        if (materialTextView != null) {
            return new ha6((FrameLayout) view, materialTextView);
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.programOption)));
        return null;
    }

    public static ha6 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.list_item_option_selector, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static ha6 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
