package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class sa6 implements wfb {
    public final ConstraintLayout a;
    public final MaterialRadioButton b;
    public final MaterialTextView c;

    public sa6(ConstraintLayout constraintLayout, MaterialRadioButton materialRadioButton, MaterialTextView materialTextView) {
        this.a = constraintLayout;
        this.b = materialRadioButton;
        this.c = materialTextView;
    }

    public static sa6 bind(View view) {
        int i = R.id.valueCheckBox;
        MaterialRadioButton materialRadioButton = (MaterialRadioButton) nt3.b(R.id.valueCheckBox, view);
        if (materialRadioButton != null) {
            i = R.id.valueTitle;
            MaterialTextView materialTextView = (MaterialTextView) nt3.b(R.id.valueTitle, view);
            if (materialTextView != null) {
                return new sa6((ConstraintLayout) view, materialRadioButton, materialTextView);
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static sa6 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.list_item_value_to_add, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static sa6 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
