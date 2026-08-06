package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class s81 implements TextWatcher {
    public final /* synthetic */ o81 t;

    public s81(o81 o81Var) {
        this.t = o81Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        o81.a aVar = o81.Companion;
        m91 m91VarW = this.t.w();
        m91VarW.e(new j81.d(String.valueOf(editable)));
        m91VarW.i();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
