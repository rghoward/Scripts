package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gs1 extends ClickableSpan {
    public final l86 t;

    public gs1(l86 l86Var) {
        this.t = l86Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        l86 l86Var = this.t;
        m86 m86VarA = l86Var.a();
        if (m86VarA != null) {
            m86VarA.a(l86Var);
        }
    }
}
