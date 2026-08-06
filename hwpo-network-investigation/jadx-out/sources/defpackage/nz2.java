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
import com.hwpo_training_app.core.widget.SimpleProgressBar;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nz2 implements wfb {
    public final ConstraintLayout a;
    public final MaterialButton b;
    public final TextInputEditText c;
    public final SimpleProgressBar d;
    public final MaterialToolbar e;

    public nz2(ConstraintLayout constraintLayout, MaterialButton materialButton, TextInputEditText textInputEditText, SimpleProgressBar simpleProgressBar, MaterialToolbar materialToolbar) {
        this.a = constraintLayout;
        this.b = materialButton;
        this.c = textInputEditText;
        this.d = simpleProgressBar;
        this.e = materialToolbar;
    }

    public static nz2 bind(View view) {
        int i = R.id.bottomContainer;
        if (((FrameLayout) nt3.b(R.id.bottomContainer, view)) != null) {
            i = R.id.btn_restore_password;
            MaterialButton materialButton = (MaterialButton) nt3.b(R.id.btn_restore_password, view);
            if (materialButton != null) {
                i = R.id.emailEditText;
                TextInputEditText textInputEditText = (TextInputEditText) nt3.b(R.id.emailEditText, view);
                if (textInputEditText != null) {
                    i = R.id.emailTextInputLabel;
                    if (((MaterialTextView) nt3.b(R.id.emailTextInputLabel, view)) != null) {
                        i = R.id.emailTextInputLayout;
                        if (((TextInputLayout) nt3.b(R.id.emailTextInputLayout, view)) != null) {
                            i = R.id.progress;
                            SimpleProgressBar simpleProgressBar = (SimpleProgressBar) nt3.b(R.id.progress, view);
                            if (simpleProgressBar != null) {
                                i = R.id.toolbar;
                                MaterialToolbar materialToolbar = (MaterialToolbar) nt3.b(R.id.toolbar, view);
                                if (materialToolbar != null) {
                                    return new nz2((ConstraintLayout) view, materialButton, textInputEditText, simpleProgressBar, materialToolbar);
                                }
                            }
                        }
                    }
                }
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static nz2 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_forgot_password, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static nz2 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
