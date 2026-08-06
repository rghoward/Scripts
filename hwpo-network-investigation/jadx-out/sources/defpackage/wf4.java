package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.SimpleProgressBar;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class wf4 implements wfb {
    public final FrameLayout a;
    public final TextInputEditText b;
    public final MaterialButton c;
    public final LinearLayoutCompat d;
    public final MaterialButton e;
    public final TextInputEditText f;
    public final SimpleProgressBar g;
    public final ScrollView h;
    public final MaterialButton i;

    public wf4(FrameLayout frameLayout, TextInputEditText textInputEditText, MaterialButton materialButton, LinearLayoutCompat linearLayoutCompat, MaterialButton materialButton2, TextInputEditText textInputEditText2, SimpleProgressBar simpleProgressBar, ScrollView scrollView, MaterialButton materialButton3) {
        this.a = frameLayout;
        this.b = textInputEditText;
        this.c = materialButton;
        this.d = linearLayoutCompat;
        this.e = materialButton2;
        this.f = textInputEditText2;
        this.g = simpleProgressBar;
        this.h = scrollView;
        this.i = materialButton3;
    }

    public static wf4 bind(View view) {
        int i = R.id.descriptionText;
        if (((MaterialTextView) nt3.b(R.id.descriptionText, view)) != null) {
            i = R.id.emailEditText;
            TextInputEditText textInputEditText = (TextInputEditText) nt3.b(R.id.emailEditText, view);
            if (textInputEditText != null) {
                i = R.id.emailTextInputLayout;
                if (((TextInputLayout) nt3.b(R.id.emailTextInputLayout, view)) != null) {
                    i = R.id.emailTitleText;
                    if (((MaterialTextView) nt3.b(R.id.emailTitleText, view)) != null) {
                        i = R.id.fieldsContainer;
                        if (((LinearLayoutCompat) nt3.b(R.id.fieldsContainer, view)) != null) {
                            i = R.id.forgotPasswordBtn;
                            MaterialButton materialButton = (MaterialButton) nt3.b(R.id.forgotPasswordBtn, view);
                            if (materialButton != null) {
                                i = R.id.layoutContainer;
                                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) nt3.b(R.id.layoutContainer, view);
                                if (linearLayoutCompat != null) {
                                    i = R.id.logoImg;
                                    if (((AppCompatImageView) nt3.b(R.id.logoImg, view)) != null) {
                                        i = R.id.notHaveAccountBtn;
                                        MaterialButton materialButton2 = (MaterialButton) nt3.b(R.id.notHaveAccountBtn, view);
                                        if (materialButton2 != null) {
                                            i = R.id.passwordEditText;
                                            TextInputEditText textInputEditText2 = (TextInputEditText) nt3.b(R.id.passwordEditText, view);
                                            if (textInputEditText2 != null) {
                                                i = R.id.passwordTextInputLayout;
                                                if (((TextInputLayout) nt3.b(R.id.passwordTextInputLayout, view)) != null) {
                                                    i = R.id.passwordTitleText;
                                                    if (((MaterialTextView) nt3.b(R.id.passwordTitleText, view)) != null) {
                                                        i = R.id.progress;
                                                        SimpleProgressBar simpleProgressBar = (SimpleProgressBar) nt3.b(R.id.progress, view);
                                                        if (simpleProgressBar != null) {
                                                            i = R.id.scrollView;
                                                            ScrollView scrollView = (ScrollView) nt3.b(R.id.scrollView, view);
                                                            if (scrollView != null) {
                                                                i = R.id.signInBtn;
                                                                MaterialButton materialButton3 = (MaterialButton) nt3.b(R.id.signInBtn, view);
                                                                if (materialButton3 != null) {
                                                                    i = R.id.titleText;
                                                                    if (((MaterialTextView) nt3.b(R.id.titleText, view)) != null) {
                                                                        return new wf4((FrameLayout) view, textInputEditText, materialButton, linearLayoutCompat, materialButton2, textInputEditText2, simpleProgressBar, scrollView, materialButton3);
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
                }
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static wf4 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_sign_in, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static wf4 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
