package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ba6 implements wfb {
    public final LinearLayout a;
    public final MaterialTextView b;
    public final hr5 c;

    public ba6(LinearLayout linearLayout, MaterialTextView materialTextView, hr5 hr5Var) {
        this.a = linearLayout;
        this.b = materialTextView;
        this.c = hr5Var;
    }

    public static ba6 bind(View view) {
        int i = R.id.fileNameText;
        MaterialTextView materialTextView = (MaterialTextView) nt3.b(R.id.fileNameText, view);
        if (materialTextView != null) {
            i = R.id.mediaPreview;
            View viewB = nt3.b(R.id.mediaPreview, view);
            if (viewB != null) {
                return new ba6((LinearLayout) view, materialTextView, hr5.bind(viewB));
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static ba6 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.list_item_media_image_attachment, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static ba6 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
