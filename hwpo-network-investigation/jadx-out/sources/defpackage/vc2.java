package defpackage;

import android.view.inputmethod.CursorAnchorInfo;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vc2 {
    public static final void a(CursorAnchorInfo.Builder builder, ria riaVar, sk8 sk8Var) {
        if (sk8Var.f()) {
            return;
        }
        l07 l07Var = riaVar.b;
        int i = l07Var.f - 1;
        if (i < 0) {
            i = 0;
        }
        int iG = uh8.g(l07Var.e(sk8Var.b), 0, i);
        int iG2 = uh8.g(l07Var.e(sk8Var.d), 0, i);
        if (iG > iG2) {
            return;
        }
        while (true) {
            builder.addVisibleLineBounds(riaVar.e(iG), l07Var.f(iG), riaVar.f(iG), l07Var.b(iG));
            if (iG == iG2) {
                return;
            } else {
                iG++;
            }
        }
    }
}
