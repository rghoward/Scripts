package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kz2 implements wfb {
    public final LinearLayoutCompat a;
    public final MaterialTextView b;
    public final MaterialTextView c;
    public final MaterialTextView d;

    public kz2(LinearLayoutCompat linearLayoutCompat, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3) {
        this.a = linearLayoutCompat;
        this.b = materialTextView;
        this.c = materialTextView2;
        this.d = materialTextView3;
    }

    public static kz2 bind(View view) {
        int i = R.id.textActionCancel;
        MaterialTextView materialTextView = (MaterialTextView) nt3.b(R.id.textActionCancel, view);
        if (materialTextView != null) {
            i = R.id.textActionDelete;
            MaterialTextView materialTextView2 = (MaterialTextView) nt3.b(R.id.textActionDelete, view);
            if (materialTextView2 != null) {
                i = R.id.textActionReport;
                MaterialTextView materialTextView3 = (MaterialTextView) nt3.b(R.id.textActionReport, view);
                if (materialTextView3 != null) {
                    i = R.id.textTitle;
                    if (((MaterialTextView) nt3.b(R.id.textTitle, view)) != null) {
                        return new kz2((LinearLayoutCompat) view, materialTextView, materialTextView2, materialTextView3);
                    }
                }
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static kz2 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_comment_actions, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static kz2 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
