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
public final class se4 implements wfb {
    public final FrameLayout a;
    public final MaterialButton b;
    public final MaterialButton c;
    public final TextInputEditText d;
    public final LinearLayoutCompat e;
    public final SimpleProgressBar f;
    public final MaterialButton g;
    public final ScrollView h;

    public se4(FrameLayout frameLayout, MaterialButton materialButton, MaterialButton materialButton2, TextInputEditText textInputEditText, LinearLayoutCompat linearLayoutCompat, SimpleProgressBar simpleProgressBar, MaterialButton materialButton3, ScrollView scrollView) {
        this.a = frameLayout;
        this.b = materialButton;
        this.c = materialButton2;
        this.d = textInputEditText;
        this.e = linearLayoutCompat;
        this.f = simpleProgressBar;
        this.g = materialButton3;
        this.h = scrollView;
    }

    public static se4 bind(View view) {
        int i = R.id.backBtn;
        MaterialButton materialButton = (MaterialButton) nt3.b(R.id.backBtn, view);
        if (materialButton != null) {
            i = R.id.backToLoginBtn;
            MaterialButton materialButton2 = (MaterialButton) nt3.b(R.id.backToLoginBtn, view);
            if (materialButton2 != null) {
                i = R.id.descriptionText;
                if (((MaterialTextView) nt3.b(R.id.descriptionText, view)) != null) {
                    i = R.id.emailEditText;
                    TextInputEditText textInputEditText = (TextInputEditText) nt3.b(R.id.emailEditText, view);
                    if (textInputEditText != null) {
                        i = R.id.emailTextInputLayout;
                        if (((TextInputLayout) nt3.b(R.id.emailTextInputLayout, view)) != null) {
                            i = R.id.emailTitleText;
                            if (((MaterialTextView) nt3.b(R.id.emailTitleText, view)) != null) {
                                i = R.id.layoutContainer;
                                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) nt3.b(R.id.layoutContainer, view);
                                if (linearLayoutCompat != null) {
                                    i = R.id.logoImg;
                                    if (((AppCompatImageView) nt3.b(R.id.logoImg, view)) != null) {
                                        i = R.id.progress;
                                        SimpleProgressBar simpleProgressBar = (SimpleProgressBar) nt3.b(R.id.progress, view);
                                        if (simpleProgressBar != null) {
                                            i = R.id.restorePasswordBtn;
                                            MaterialButton materialButton3 = (MaterialButton) nt3.b(R.id.restorePasswordBtn, view);
                                            if (materialButton3 != null) {
                                                i = R.id.scrollView;
                                                ScrollView scrollView = (ScrollView) nt3.b(R.id.scrollView, view);
                                                if (scrollView != null) {
                                                    i = R.id.titleText;
                                                    if (((MaterialTextView) nt3.b(R.id.titleText, view)) != null) {
                                                        return new se4((FrameLayout) view, materialButton, materialButton2, textInputEditText, linearLayoutCompat, simpleProgressBar, materialButton3, scrollView);
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

    public static se4 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_forgot_password, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static se4 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
