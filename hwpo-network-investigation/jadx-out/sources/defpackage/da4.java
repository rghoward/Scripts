package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class da4 extends ox6.c implements o94 {
    @Override // defpackage.o94
    public final void k0(k94 k94Var) {
        View viewA = s84.a(this);
        k94Var.c(this.t.G && s84.a(this).hasFocusable());
        View viewFindFocus = viewA.findFocus();
        if (viewFindFocus != null) {
            k94Var.d(z84.a(viewFindFocus, viewA));
        }
    }
}
