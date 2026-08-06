package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import com.hwpo_training_app.core.widget.ChooseTimeEditText;
import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qoa implements TextWatcher {
    public final /* synthetic */ el8 t;
    public final /* synthetic */ gl8<String> u;
    public final /* synthetic */ ChooseTimeEditText v;
    public final /* synthetic */ oh4<Editable, g2b> w;

    public qoa(el8 el8Var, gl8 gl8Var, ChooseTimeEditText chooseTimeEditText, oh4 oh4Var) {
        this.t = el8Var;
        this.u = gl8Var;
        this.v = chooseTimeEditText;
        this.w = oh4Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.w.invoke(editable);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.t.t = charSequence != null ? charSequence.length() : 0;
        this.u.t = String.valueOf(charSequence);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String strSubstring;
        el8 el8Var = this.t;
        boolean z = (charSequence != null ? Math.abs(charSequence.length() - el8Var.t) : 1) > 1;
        ChooseTimeEditText chooseTimeEditText = this.v;
        if (z) {
            String str = this.u.t;
            chooseTimeEditText.removeTextChangedListener(this);
            chooseTimeEditText.setText(str);
            chooseTimeEditText.addTextChangedListener(this);
            return;
        }
        if (z) {
            u.b();
            return;
        }
        String string = charSequence != null ? charSequence.toString() : null;
        boolean z2 = charSequence == null || el8Var.t > charSequence.length();
        if (string == null || z2a.w(string)) {
            return;
        }
        if (string.length() == 1) {
            strSubstring = string;
        } else if (string.length() == 2) {
            if (z2) {
                strSubstring = string;
            } else {
                if (z2) {
                    u.b();
                    return;
                }
                strSubstring = string.concat(":");
            }
        } else if (string.length() == 3) {
            if (z2) {
                strSubstring = string.substring(0, 2);
            } else if (z2a.o(string, ":", false)) {
                strSubstring = string;
            } else {
                String strU = a3a.U(2, string);
                char cT = a3a.T(string);
                Object objValueOf = Character.valueOf(cT);
                if (Character.getNumericValue(cT) > 5) {
                    objValueOf = null;
                }
                if (objValueOf == null) {
                    objValueOf = BuildConfig.FLAVOR;
                }
                strSubstring = strU + ":" + objValueOf;
            }
        } else if (string.length() == 4) {
            boolean z3 = Character.getNumericValue(a3a.T(string)) > 5;
            if (z3) {
                strSubstring = string.substring(0, 3);
            } else {
                if (z3) {
                    u.b();
                    return;
                }
                strSubstring = string;
            }
        } else if (string.length() == 5) {
            strSubstring = string;
        } else if (string.length() != 6) {
            return;
        } else {
            strSubstring = string.substring(0, 5);
        }
        String str2 = strSubstring.equals(string) ? null : strSubstring;
        if (str2 != null) {
            chooseTimeEditText.removeTextChangedListener(this);
            chooseTimeEditText.setText(str2);
            chooseTimeEditText.addTextChangedListener(this);
            g2b g2bVar = g2b.a;
        }
    }
}
