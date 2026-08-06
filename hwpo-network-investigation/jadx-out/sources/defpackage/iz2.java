package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
public final class iz2 implements wfb {
    public final ConstraintLayout a;
    public final MaterialButton b;
    public final MaterialButton c;
    public final TextInputEditText d;
    public final TextInputLayout e;
    public final TextInputEditText f;
    public final TextInputLayout g;
    public final TextInputEditText h;
    public final TextInputLayout i;
    public final SimpleProgressBar j;
    public final MaterialToolbar k;

    public iz2(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, TextInputEditText textInputEditText, TextInputLayout textInputLayout, TextInputEditText textInputEditText2, TextInputLayout textInputLayout2, TextInputEditText textInputEditText3, TextInputLayout textInputLayout3, SimpleProgressBar simpleProgressBar, MaterialToolbar materialToolbar) {
        this.a = constraintLayout;
        this.b = materialButton;
        this.c = materialButton2;
        this.d = textInputEditText;
        this.e = textInputLayout;
        this.f = textInputEditText2;
        this.g = textInputLayout2;
        this.h = textInputEditText3;
        this.i = textInputLayout3;
        this.j = simpleProgressBar;
        this.k = materialToolbar;
    }

    public static iz2 bind(View view) {
        int i = R.id.btn_forgot_password;
        MaterialButton materialButton = (MaterialButton) nt3.b(R.id.btn_forgot_password, view);
        if (materialButton != null) {
            i = R.id.btn_save;
            MaterialButton materialButton2 = (MaterialButton) nt3.b(R.id.btn_save, view);
            if (materialButton2 != null) {
                i = R.id.confirm_password_label;
                if (((MaterialTextView) nt3.b(R.id.confirm_password_label, view)) != null) {
                    i = R.id.current_password_edit_text;
                    TextInputEditText textInputEditText = (TextInputEditText) nt3.b(R.id.current_password_edit_text, view);
                    if (textInputEditText != null) {
                        i = R.id.current_password_label;
                        if (((MaterialTextView) nt3.b(R.id.current_password_label, view)) != null) {
                            i = R.id.current_password_text_input_layout;
                            TextInputLayout textInputLayout = (TextInputLayout) nt3.b(R.id.current_password_text_input_layout, view);
                            if (textInputLayout != null) {
                                i = R.id.new_confirmed_password_edit_text;
                                TextInputEditText textInputEditText2 = (TextInputEditText) nt3.b(R.id.new_confirmed_password_edit_text, view);
                                if (textInputEditText2 != null) {
                                    i = R.id.new_confirmed_password_text_input_layout;
                                    TextInputLayout textInputLayout2 = (TextInputLayout) nt3.b(R.id.new_confirmed_password_text_input_layout, view);
                                    if (textInputLayout2 != null) {
                                        i = R.id.new_password_edit_text;
                                        TextInputEditText textInputEditText3 = (TextInputEditText) nt3.b(R.id.new_password_edit_text, view);
                                        if (textInputEditText3 != null) {
                                            i = R.id.new_password_label;
                                            if (((MaterialTextView) nt3.b(R.id.new_password_label, view)) != null) {
                                                i = R.id.new_password_text_input_layout;
                                                TextInputLayout textInputLayout3 = (TextInputLayout) nt3.b(R.id.new_password_text_input_layout, view);
                                                if (textInputLayout3 != null) {
                                                    i = R.id.progress;
                                                    SimpleProgressBar simpleProgressBar = (SimpleProgressBar) nt3.b(R.id.progress, view);
                                                    if (simpleProgressBar != null) {
                                                        i = R.id.toolbar;
                                                        MaterialToolbar materialToolbar = (MaterialToolbar) nt3.b(R.id.toolbar, view);
                                                        if (materialToolbar != null) {
                                                            return new iz2((ConstraintLayout) view, materialButton, materialButton2, textInputEditText, textInputLayout, textInputEditText2, textInputLayout2, textInputEditText3, textInputLayout3, simpleProgressBar, materialToolbar);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
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

    public static iz2 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_change_password, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static iz2 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
