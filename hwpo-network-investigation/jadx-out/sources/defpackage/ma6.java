package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ma6 implements wfb {
    public final LinearLayout a;
    public final MaterialTextView b;
    public final ImageView c;

    public ma6(LinearLayout linearLayout, MaterialTextView materialTextView, ImageView imageView) {
        this.a = linearLayout;
        this.b = materialTextView;
        this.c = imageView;
    }

    public static ma6 bind(View view) {
        int i = R.id.benchmark_title_text;
        MaterialTextView materialTextView = (MaterialTextView) nt3.b(R.id.benchmark_title_text, view);
        if (materialTextView != null) {
            i = R.id.img_checked;
            ImageView imageView = (ImageView) nt3.b(R.id.img_checked, view);
            if (imageView != null) {
                return new ma6((LinearLayout) view, materialTextView, imageView);
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static ma6 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.list_item_required_benchmark, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static ma6 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
