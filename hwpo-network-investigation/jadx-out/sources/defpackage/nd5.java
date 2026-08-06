package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nd5 {
    public final View a;
    public final ss5 b = hv5.c(j26.u, new y22(1, this));

    public nd5(View view) {
        this.a = view;
    }

    public final InputMethodManager a() {
        return (InputMethodManager) this.b.getValue();
    }

    public final void b(int i, int i2, int i3, int i4) {
        a().updateSelection(this.a, i, i2, i3, i4);
    }
}
