package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.ChooseTimeEditText;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ks5 implements wfb {
    public final LinearLayoutCompat a;
    public final ChooseTimeEditText b;
    public final ChooseTimeEditText c;

    public ks5(LinearLayoutCompat linearLayoutCompat, ChooseTimeEditText chooseTimeEditText, ChooseTimeEditText chooseTimeEditText2) {
        this.a = linearLayoutCompat;
        this.b = chooseTimeEditText;
        this.c = chooseTimeEditText2;
    }

    public static ks5 bind(View view) {
        int i = R.id.repsValueEditText;
        ChooseTimeEditText chooseTimeEditText = (ChooseTimeEditText) nt3.b(R.id.repsValueEditText, view);
        if (chooseTimeEditText != null) {
            i = R.id.roundsValueEditText;
            ChooseTimeEditText chooseTimeEditText2 = (ChooseTimeEditText) nt3.b(R.id.roundsValueEditText, view);
            if (chooseTimeEditText2 != null) {
                return new ks5((LinearLayoutCompat) view, chooseTimeEditText, chooseTimeEditText2);
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static ks5 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_score_simple_round_reps_value, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static ks5 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
