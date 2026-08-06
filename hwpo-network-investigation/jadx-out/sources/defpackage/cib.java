package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cib implements wfb {
    public final ConstraintLayout a;
    public final MaterialTextView b;
    public final MaterialTextView c;
    public final View d;
    public final MaterialTextView e;

    public cib(ConstraintLayout constraintLayout, MaterialTextView materialTextView, MaterialTextView materialTextView2, View view, MaterialTextView materialTextView3) {
        this.a = constraintLayout;
        this.b = materialTextView;
        this.c = materialTextView2;
        this.d = view;
        this.e = materialTextView3;
    }

    public static cib bind(View view) {
        int i = R.id.attachmentsCountText;
        MaterialTextView materialTextView = (MaterialTextView) nt3.b(R.id.attachmentsCountText, view);
        if (materialTextView != null) {
            i = R.id.programDescriptionText;
            MaterialTextView materialTextView2 = (MaterialTextView) nt3.b(R.id.programDescriptionText, view);
            if (materialTextView2 != null) {
                i = R.id.programHeaderColor;
                View viewB = nt3.b(R.id.programHeaderColor, view);
                if (viewB != null) {
                    i = R.id.programTitleText;
                    MaterialTextView materialTextView3 = (MaterialTextView) nt3.b(R.id.programTitleText, view);
                    if (materialTextView3 != null) {
                        return new cib((ConstraintLayout) view, materialTextView, materialTextView2, viewB, materialTextView3);
                    }
                }
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static cib inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.view_program_header, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static cib inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
