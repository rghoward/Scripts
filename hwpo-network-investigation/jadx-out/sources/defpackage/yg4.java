package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.SimpleProgressBar;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class yg4 implements wfb {
    public final ConstraintLayout a;
    public final MaterialButton b;
    public final MaterialRadioButton c;
    public final MaterialTextView d;
    public final MaterialTextView e;
    public final MaterialRadioButton f;
    public final MaterialTextView g;
    public final SimpleProgressBar h;
    public final MaterialToolbar i;
    public final MaterialRadioButton j;
    public final MaterialTextView k;

    public yg4(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialRadioButton materialRadioButton, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialRadioButton materialRadioButton2, MaterialTextView materialTextView3, SimpleProgressBar simpleProgressBar, MaterialToolbar materialToolbar, MaterialRadioButton materialRadioButton3, MaterialTextView materialTextView4) {
        this.a = constraintLayout;
        this.b = materialButton;
        this.c = materialRadioButton;
        this.d = materialTextView;
        this.e = materialTextView2;
        this.f = materialRadioButton2;
        this.g = materialTextView3;
        this.h = simpleProgressBar;
        this.i = materialToolbar;
        this.j = materialRadioButton3;
        this.k = materialTextView4;
    }

    public static yg4 bind(View view) {
        int i = R.id.actionBtn;
        MaterialButton materialButton = (MaterialButton) nt3.b(R.id.actionBtn, view);
        if (materialButton != null) {
            i = R.id.affiliatedGym;
            MaterialRadioButton materialRadioButton = (MaterialRadioButton) nt3.b(R.id.affiliatedGym, view);
            if (materialRadioButton != null) {
                i = R.id.affiliatedGymText;
                MaterialTextView materialTextView = (MaterialTextView) nt3.b(R.id.affiliatedGymText, view);
                if (materialTextView != null) {
                    i = R.id.buttonBackground;
                    if (((FrameLayout) nt3.b(R.id.buttonBackground, view)) != null) {
                        i = R.id.buttonsContainer;
                        if (((LinearLayoutCompat) nt3.b(R.id.buttonsContainer, view)) != null) {
                            i = R.id.clearBtn;
                            MaterialTextView materialTextView2 = (MaterialTextView) nt3.b(R.id.clearBtn, view);
                            if (materialTextView2 != null) {
                                i = R.id.homeGym;
                                MaterialRadioButton materialRadioButton2 = (MaterialRadioButton) nt3.b(R.id.homeGym, view);
                                if (materialRadioButton2 != null) {
                                    i = R.id.homeGymText;
                                    MaterialTextView materialTextView3 = (MaterialTextView) nt3.b(R.id.homeGymText, view);
                                    if (materialTextView3 != null) {
                                        i = R.id.progress;
                                        SimpleProgressBar simpleProgressBar = (SimpleProgressBar) nt3.b(R.id.progress, view);
                                        if (simpleProgressBar != null) {
                                            i = R.id.selectGymLabel;
                                            if (((MaterialTextView) nt3.b(R.id.selectGymLabel, view)) != null) {
                                                i = R.id.toolbar;
                                                MaterialToolbar materialToolbar = (MaterialToolbar) nt3.b(R.id.toolbar, view);
                                                if (materialToolbar != null) {
                                                    i = R.id.unaffiliatedGym;
                                                    MaterialRadioButton materialRadioButton3 = (MaterialRadioButton) nt3.b(R.id.unaffiliatedGym, view);
                                                    if (materialRadioButton3 != null) {
                                                        i = R.id.unaffiliatedGymText;
                                                        MaterialTextView materialTextView4 = (MaterialTextView) nt3.b(R.id.unaffiliatedGymText, view);
                                                        if (materialTextView4 != null) {
                                                            return new yg4((ConstraintLayout) view, materialButton, materialRadioButton, materialTextView, materialTextView2, materialRadioButton2, materialTextView3, simpleProgressBar, materialToolbar, materialRadioButton3, materialTextView4);
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

    public static yg4 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_your_gym, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static yg4 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
