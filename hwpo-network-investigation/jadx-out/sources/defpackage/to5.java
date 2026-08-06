package defpackage;

import android.view.KeyEvent;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class to5 extends ox6.c implements so5 {
    public oh4<? super no5, Boolean> H;
    public oh4<? super no5, Boolean> I;

    public to5() {
        throw null;
    }

    @Override // defpackage.so5
    public final boolean C(KeyEvent keyEvent) {
        oh4<? super no5, Boolean> oh4Var = this.I;
        if (oh4Var != null) {
            return oh4Var.invoke(new no5(keyEvent)).booleanValue();
        }
        return false;
    }

    @Override // defpackage.so5
    public final boolean l0(KeyEvent keyEvent) {
        oh4<? super no5, Boolean> oh4Var = this.H;
        if (oh4Var != null) {
            return oh4Var.invoke(new no5(keyEvent)).booleanValue();
        }
        return false;
    }
}
