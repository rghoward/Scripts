package defpackage;

import android.app.Dialog;
import androidx.fragment.app.e;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class sz extends e {
    @Override // androidx.fragment.app.e
    public Dialog m() {
        return new rz(getContext(), l());
    }

    @Override // androidx.fragment.app.e
    public final void n(Dialog dialog, int i) {
        if (!(dialog instanceof rz)) {
            super.n(dialog, i);
            return;
        }
        rz rzVar = (rz) dialog;
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        rzVar.d().v(1);
    }
}
