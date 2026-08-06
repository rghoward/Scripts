package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.ChooseTimeEditText;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class q96 implements wfb {
    public final LinearLayoutCompat a;
    public final ChooseTimeEditText b;
    public final TextInputLayout c;
    public final ChooseTimeEditText d;

    public q96(LinearLayoutCompat linearLayoutCompat, ChooseTimeEditText chooseTimeEditText, TextInputLayout textInputLayout, ChooseTimeEditText chooseTimeEditText2) {
        this.a = linearLayoutCompat;
        this.b = chooseTimeEditText;
        this.c = textInputLayout;
        this.d = chooseTimeEditText2;
    }

    public static q96 bind(View view) {
        int i = R.id.diastolicEditText;
        ChooseTimeEditText chooseTimeEditText = (ChooseTimeEditText) nt3.b(R.id.diastolicEditText, view);
        if (chooseTimeEditText != null) {
            i = R.id.diastolicPressureCaption;
            if (((MaterialTextView) nt3.b(R.id.diastolicPressureCaption, view)) != null) {
                i = R.id.diastolicTextInputLayout;
                TextInputLayout textInputLayout = (TextInputLayout) nt3.b(R.id.diastolicTextInputLayout, view);
                if (textInputLayout != null) {
                    i = R.id.systolicEditText;
                    ChooseTimeEditText chooseTimeEditText2 = (ChooseTimeEditText) nt3.b(R.id.systolicEditText, view);
                    if (chooseTimeEditText2 != null) {
                        i = R.id.systolicPressureCaption;
                        if (((MaterialTextView) nt3.b(R.id.systolicPressureCaption, view)) != null) {
                            i = R.id.systolicTextInputLayout;
                            if (((TextInputLayout) nt3.b(R.id.systolicTextInputLayout, view)) != null) {
                                return new q96((LinearLayoutCompat) view, chooseTimeEditText, textInputLayout, chooseTimeEditText2);
                            }
                        }
                    }
                }
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static q96 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.list_item_blood_pressure, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static q96 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
