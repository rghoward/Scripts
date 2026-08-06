package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class m96 implements wfb {
    public final ConstraintLayout a;
    public final MaterialRadioButton b;
    public final MaterialTextView c;
    public final MaterialTextView d;

    public m96(ConstraintLayout constraintLayout, MaterialRadioButton materialRadioButton, MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        this.a = constraintLayout;
        this.b = materialRadioButton;
        this.c = materialTextView;
        this.d = materialTextView2;
    }

    public static m96 bind(View view) {
        int i = R.id.gymCheckbox;
        MaterialRadioButton materialRadioButton = (MaterialRadioButton) nt3.b(R.id.gymCheckbox, view);
        if (materialRadioButton != null) {
            i = R.id.gymLocation;
            MaterialTextView materialTextView = (MaterialTextView) nt3.b(R.id.gymLocation, view);
            if (materialTextView != null) {
                i = R.id.gymName;
                MaterialTextView materialTextView2 = (MaterialTextView) nt3.b(R.id.gymName, view);
                if (materialTextView2 != null) {
                    return new m96((ConstraintLayout) view, materialRadioButton, materialTextView, materialTextView2);
                }
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static m96 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.list_item_affiliated_gym, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static m96 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
