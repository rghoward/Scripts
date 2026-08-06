package defpackage;

import com.google.android.material.textfield.TextInputEditText;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ri3 implements oh4<String, g2b> {
    public final /* synthetic */ fi3 t;

    public ri3(fi3 fi3Var) {
        this.t = fi3Var;
    }

    @Override // defpackage.oh4
    public final g2b invoke(String str) {
        String str2 = str;
        fi3 fi3Var = this.t;
        if (!fi3Var.H) {
            TextInputEditText textInputEditText = fi3Var.q().h;
            fi3Var.H = true;
            fi3.k kVar = fi3Var.G;
            if (kVar == null) {
                xj5.e("noteTextWatcher");
                throw null;
            }
            textInputEditText.removeTextChangedListener(kVar);
            textInputEditText.setText(str2);
            if (str2.length() > 0) {
                textInputEditText.setSelection(str2.length());
            }
            fi3.k kVar2 = fi3Var.G;
            if (kVar2 == null) {
                xj5.e("noteTextWatcher");
                throw null;
            }
            textInputEditText.addTextChangedListener(kVar2);
        }
        return g2b.a;
    }
}
