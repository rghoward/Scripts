package defpackage;

import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class qd3 {
    public static final void a(AppCompatEditText appCompatEditText, final int[] iArr, final oh4 oh4Var) {
        appCompatEditText.getClass();
        appCompatEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: pd3
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (!u30.u(iArr, i)) {
                    return false;
                }
                oh4Var.invoke(Integer.valueOf(i));
                return false;
            }
        });
    }

    public static final void b(EditText editText, CharSequence charSequence) {
        charSequence.getClass();
        String string = editText.getText().toString();
        if (xj5.a(string, charSequence)) {
            return;
        }
        if (string.length() == 0) {
            editText.append(charSequence);
            return;
        }
        String string2 = charSequence.toString();
        int length = (w2a.l(string, " ", BuildConfig.FLAVOR).equals(w2a.l(string2, " ", BuildConfig.FLAVOR)) && editText.getSelectionStart() + 1 < string2.length() && string2.charAt(editText.getSelectionStart()) == 160) ? (editText.length() - editText.getSelectionStart()) + 1 : editText.length() - editText.getSelectionStart();
        editText.setText(charSequence);
        int length2 = editText.length() - length;
        if (length2 < 0) {
            length2 = 0;
        }
        editText.setSelection(length2);
    }
}
