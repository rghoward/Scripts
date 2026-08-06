package defpackage;

import android.graphics.Typeface;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class e28 implements d28 {
    public static Typeface c(String str, ob4 ob4Var, int i) {
        if (i == 0 && xj5.a(ob4Var, ob4.y) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), ob4Var.t, i == 1);
    }

    @Override // defpackage.d28
    public final Typeface a(ob4 ob4Var, int i) {
        return c(null, ob4Var, i);
    }

    @Override // defpackage.d28
    public final Typeface b(jk4 jk4Var, ob4 ob4Var, int i) {
        return c(jk4Var.w, ob4Var, i);
    }
}
