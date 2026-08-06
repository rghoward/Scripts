package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class j03 implements wfb {
    public final ConstraintLayout a;
    public final MaterialButton b;
    public final MaterialToolbar c;
    public final TextInputEditText d;
    public final MaterialTextView e;

    public j03(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialToolbar materialToolbar, TextInputEditText textInputEditText, MaterialTextView materialTextView) {
        this.a = constraintLayout;
        this.b = materialButton;
        this.c = materialToolbar;
        this.d = textInputEditText;
        this.e = materialTextView;
    }

    public static j03 bind(View view) {
        int i = R.id.bottomContainer;
        if (((FrameLayout) nt3.b(R.id.bottomContainer, view)) != null) {
            i = R.id.btn_save;
            MaterialButton materialButton = (MaterialButton) nt3.b(R.id.btn_save, view);
            if (materialButton != null) {
                i = R.id.toolbar;
                MaterialToolbar materialToolbar = (MaterialToolbar) nt3.b(R.id.toolbar, view);
                if (materialToolbar != null) {
                    i = R.id.valueEditText;
                    TextInputEditText textInputEditText = (TextInputEditText) nt3.b(R.id.valueEditText, view);
                    if (textInputEditText != null) {
                        i = R.id.valueTextInputLabel;
                        MaterialTextView materialTextView = (MaterialTextView) nt3.b(R.id.valueTextInputLabel, view);
                        if (materialTextView != null) {
                            i = R.id.valueTextInputLayout;
                            if (((TextInputLayout) nt3.b(R.id.valueTextInputLayout, view)) != null) {
                                return new j03((ConstraintLayout) view, materialButton, materialToolbar, textInputEditText, materialTextView);
                            }
                        }
                    }
                }
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static j03 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_value_input, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static j03 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
