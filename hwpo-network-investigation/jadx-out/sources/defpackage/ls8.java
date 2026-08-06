package defpackage;

import android.text.SpannableStringBuilder;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ls8 implements oh4<Integer, g2b> {
    public final /* synthetic */ gs8 t;

    public ls8(gs8 gs8Var) {
        this.t = gs8Var;
    }

    @Override // defpackage.oh4
    public final g2b invoke(Integer num) {
        int iIntValue = num.intValue();
        gs8.a aVar = gs8.Companion;
        gs8 gs8Var = this.t;
        MaterialTextView materialTextView = gs8Var.p().d;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) gs8Var.getString(R.string.choose_day_between, 1, Integer.valueOf(iIntValue)));
        Iterator it = ws0.i(String.valueOf(1), String.valueOf(iIntValue)).iterator();
        while (it.hasNext()) {
            z63.b(spannableStringBuilder, (String) it.next());
        }
        materialTextView.setText(spannableStringBuilder);
        return g2b.a;
    }
}
