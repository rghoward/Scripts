package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class jz2 implements wfb {
    public final LinearLayoutCompat a;
    public final MaterialTextView b;

    public jz2(LinearLayoutCompat linearLayoutCompat, MaterialTextView materialTextView) {
        this.a = linearLayoutCompat;
        this.b = materialTextView;
    }

    public static jz2 bind(View view) {
        int i = R.id.cancel_button;
        MaterialTextView materialTextView = (MaterialTextView) nt3.b(R.id.cancel_button, view);
        if (materialTextView != null) {
            i = R.id.optionsList;
            if (((LinearLayoutCompat) nt3.b(R.id.optionsList, view)) != null) {
                i = R.id.scrollView;
                if (((NestedScrollView) nt3.b(R.id.scrollView, view)) != null) {
                    return new jz2((LinearLayoutCompat) view, materialTextView);
                }
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static jz2 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_choose_plan_options, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static jz2 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
