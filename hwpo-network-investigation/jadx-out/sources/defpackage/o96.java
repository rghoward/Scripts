package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class o96 implements wfb {
    public final LinearLayoutCompat a;
    public final MaterialTextView b;
    public final TextInputEditText c;
    public final TextInputLayout d;

    public o96(LinearLayoutCompat linearLayoutCompat, MaterialTextView materialTextView, TextInputEditText textInputEditText, TextInputLayout textInputLayout) {
        this.a = linearLayoutCompat;
        this.b = materialTextView;
        this.c = textInputEditText;
        this.d = textInputLayout;
    }

    public static o96 bind(View view) {
        int i = R.id.benchmarkNameText;
        MaterialTextView materialTextView = (MaterialTextView) nt3.b(R.id.benchmarkNameText, view);
        if (materialTextView != null) {
            i = R.id.benchmarkValueEditText;
            TextInputEditText textInputEditText = (TextInputEditText) nt3.b(R.id.benchmarkValueEditText, view);
            if (textInputEditText != null) {
                i = R.id.benchmarkValueTextInputLayout;
                TextInputLayout textInputLayout = (TextInputLayout) nt3.b(R.id.benchmarkValueTextInputLayout, view);
                if (textInputLayout != null) {
                    return new o96((LinearLayoutCompat) view, materialTextView, textInputEditText, textInputLayout);
                }
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static o96 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.list_item_benchmark_edit_text, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static o96 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
