package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.ChooseTimeEditText;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ns5 implements wfb {
    public final LinearLayoutCompat a;
    public final ChooseTimeEditText b;

    public ns5(LinearLayoutCompat linearLayoutCompat, ChooseTimeEditText chooseTimeEditText) {
        this.a = linearLayoutCompat;
        this.b = chooseTimeEditText;
    }

    public static ns5 bind(View view) {
        int i = R.id.scoreValueEditText;
        ChooseTimeEditText chooseTimeEditText = (ChooseTimeEditText) nt3.b(R.id.scoreValueEditText, view);
        if (chooseTimeEditText != null) {
            i = R.id.scoreValueTextInputLayout;
            if (((TextInputLayout) nt3.b(R.id.scoreValueTextInputLayout, view)) != null) {
                i = R.id.scoreValueTitleText;
                if (((MaterialTextView) nt3.b(R.id.scoreValueTitleText, view)) != null) {
                    return new ns5((LinearLayoutCompat) view, chooseTimeEditText);
                }
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static ns5 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_score_simple_value, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static ns5 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
