package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class k03 implements wfb {
    public final MaterialCardView a;
    public final MaterialTextView b;
    public final MaterialTextView c;
    public final View d;
    public final View e;
    public final MaterialTextView f;
    public final MaterialTextView g;

    public k03(MaterialCardView materialCardView, MaterialTextView materialTextView, MaterialTextView materialTextView2, View view, View view2, MaterialTextView materialTextView3, MaterialTextView materialTextView4) {
        this.a = materialCardView;
        this.b = materialTextView;
        this.c = materialTextView2;
        this.d = view;
        this.e = view2;
        this.f = materialTextView3;
        this.g = materialTextView4;
    }

    public static k03 bind(View view) {
        int i = R.id.cancelText;
        MaterialTextView materialTextView = (MaterialTextView) nt3.b(R.id.cancelText, view);
        if (materialTextView != null) {
            i = R.id.descriptionText;
            MaterialTextView materialTextView2 = (MaterialTextView) nt3.b(R.id.descriptionText, view);
            if (materialTextView2 != null) {
                i = R.id.line;
                View viewB = nt3.b(R.id.line, view);
                if (viewB != null) {
                    i = R.id.lineHorizontal1;
                    View viewB2 = nt3.b(R.id.lineHorizontal1, view);
                    if (viewB2 != null) {
                        i = R.id.okText;
                        MaterialTextView materialTextView3 = (MaterialTextView) nt3.b(R.id.okText, view);
                        if (materialTextView3 != null) {
                            i = R.id.titleText;
                            MaterialTextView materialTextView4 = (MaterialTextView) nt3.b(R.id.titleText, view);
                            if (materialTextView4 != null) {
                                return new k03((MaterialCardView) view, materialTextView, materialTextView2, viewB, viewB2, materialTextView3, materialTextView4);
                            }
                        }
                    }
                }
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static k03 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_vetrical_confirm, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static k03 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
