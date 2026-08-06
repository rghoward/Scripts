package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.ChooseTimeEditText;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ls5 implements wfb {
    public final LinearLayoutCompat a;
    public final SwitchMaterial b;
    public final MaterialTextView c;
    public final ChooseTimeEditText d;
    public final ChooseTimeEditText e;
    public final TextInputLayout f;
    public final MaterialTextView g;
    public final TextInputLayout h;
    public final MaterialTextView i;
    public final TextInputLayout j;
    public final MaterialTextView k;
    public final ChooseTimeEditText l;

    public ls5(LinearLayoutCompat linearLayoutCompat, SwitchMaterial switchMaterial, MaterialTextView materialTextView, ChooseTimeEditText chooseTimeEditText, ChooseTimeEditText chooseTimeEditText2, TextInputLayout textInputLayout, MaterialTextView materialTextView2, TextInputLayout textInputLayout2, MaterialTextView materialTextView3, TextInputLayout textInputLayout3, MaterialTextView materialTextView4, ChooseTimeEditText chooseTimeEditText3) {
        this.a = linearLayoutCompat;
        this.b = switchMaterial;
        this.c = materialTextView;
        this.d = chooseTimeEditText;
        this.e = chooseTimeEditText2;
        this.f = textInputLayout;
        this.g = materialTextView2;
        this.h = textInputLayout2;
        this.i = materialTextView3;
        this.j = textInputLayout3;
        this.k = materialTextView4;
        this.l = chooseTimeEditText3;
    }

    public static ls5 bind(View view) {
        int i = R.id.isMissedSwitch;
        SwitchMaterial switchMaterial = (SwitchMaterial) nt3.b(R.id.isMissedSwitch, view);
        if (switchMaterial != null) {
            i = R.id.missedTimeCapNote;
            MaterialTextView materialTextView = (MaterialTextView) nt3.b(R.id.missedTimeCapNote, view);
            if (materialTextView != null) {
                i = R.id.repsValueEditText;
                ChooseTimeEditText chooseTimeEditText = (ChooseTimeEditText) nt3.b(R.id.repsValueEditText, view);
                if (chooseTimeEditText != null) {
                    i = R.id.roundsValueEditText;
                    ChooseTimeEditText chooseTimeEditText2 = (ChooseTimeEditText) nt3.b(R.id.roundsValueEditText, view);
                    if (chooseTimeEditText2 != null) {
                        i = R.id.timeCapRepsMissedTextInputLayout;
                        TextInputLayout textInputLayout = (TextInputLayout) nt3.b(R.id.timeCapRepsMissedTextInputLayout, view);
                        if (textInputLayout != null) {
                            i = R.id.timeCapRepsMissedTitle;
                            MaterialTextView materialTextView2 = (MaterialTextView) nt3.b(R.id.timeCapRepsMissedTitle, view);
                            if (materialTextView2 != null) {
                                i = R.id.timeCapRoundsMissedTextInputLayout;
                                TextInputLayout textInputLayout2 = (TextInputLayout) nt3.b(R.id.timeCapRoundsMissedTextInputLayout, view);
                                if (textInputLayout2 != null) {
                                    i = R.id.timeCapRoundsMissedTitle;
                                    MaterialTextView materialTextView3 = (MaterialTextView) nt3.b(R.id.timeCapRoundsMissedTitle, view);
                                    if (materialTextView3 != null) {
                                        i = R.id.timeCapTextInputLayout;
                                        TextInputLayout textInputLayout3 = (TextInputLayout) nt3.b(R.id.timeCapTextInputLayout, view);
                                        if (textInputLayout3 != null) {
                                            i = R.id.timeCapTitle;
                                            MaterialTextView materialTextView4 = (MaterialTextView) nt3.b(R.id.timeCapTitle, view);
                                            if (materialTextView4 != null) {
                                                i = R.id.timeValueEditText;
                                                ChooseTimeEditText chooseTimeEditText3 = (ChooseTimeEditText) nt3.b(R.id.timeValueEditText, view);
                                                if (chooseTimeEditText3 != null) {
                                                    return new ls5((LinearLayoutCompat) view, switchMaterial, materialTextView, chooseTimeEditText, chooseTimeEditText2, textInputLayout, materialTextView2, textInputLayout2, materialTextView3, textInputLayout3, materialTextView4, chooseTimeEditText3);
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

    public static ls5 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_score_simple_time_cap, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static ls5 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
