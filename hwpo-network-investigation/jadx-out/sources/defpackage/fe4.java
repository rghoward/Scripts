package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.PickedOptionTextView;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fe4 implements wfb {
    public final ConstraintLayout a;
    public final MaterialButton b;
    public final PickedOptionTextView c;
    public final PickedOptionTextView d;
    public final MaterialToolbar e;

    public fe4(ConstraintLayout constraintLayout, MaterialButton materialButton, PickedOptionTextView pickedOptionTextView, PickedOptionTextView pickedOptionTextView2, MaterialToolbar materialToolbar) {
        this.a = constraintLayout;
        this.b = materialButton;
        this.c = pickedOptionTextView;
        this.d = pickedOptionTextView2;
        this.e = materialToolbar;
    }

    public static fe4 bind(View view) {
        int i = R.id.applyBtn;
        MaterialButton materialButton = (MaterialButton) nt3.b(R.id.applyBtn, view);
        if (materialButton != null) {
            i = R.id.buttonBackground;
            if (((FrameLayout) nt3.b(R.id.buttonBackground, view)) != null) {
                i = R.id.cityOption;
                PickedOptionTextView pickedOptionTextView = (PickedOptionTextView) nt3.b(R.id.cityOption, view);
                if (pickedOptionTextView != null) {
                    i = R.id.countryOption;
                    PickedOptionTextView pickedOptionTextView2 = (PickedOptionTextView) nt3.b(R.id.countryOption, view);
                    if (pickedOptionTextView2 != null) {
                        i = R.id.end;
                        if (((Guideline) nt3.b(R.id.end, view)) != null) {
                            i = R.id.selectCountryCaption;
                            if (((MaterialTextView) nt3.b(R.id.selectCountryCaption, view)) != null) {
                                i = R.id.start;
                                if (((Guideline) nt3.b(R.id.start, view)) != null) {
                                    i = R.id.toolbar;
                                    MaterialToolbar materialToolbar = (MaterialToolbar) nt3.b(R.id.toolbar, view);
                                    if (materialToolbar != null) {
                                        return new fe4((ConstraintLayout) view, materialButton, pickedOptionTextView, pickedOptionTextView2, materialToolbar);
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

    public static fe4 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_affilated_gym_filter, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static fe4 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
