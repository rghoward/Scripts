package defpackage;

import android.graphics.Typeface;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ue2 implements d28 {
    public static Typeface c(String str, ob4 ob4Var, int i) {
        if (i == 0 && xj5.a(ob4Var, ob4.y) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iC = lo.c(ob4Var, i);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(iC) : Typeface.create(str, iC);
    }

    @Override // defpackage.d28
    public Typeface a(ob4 ob4Var, int i) {
        return c(null, ob4Var, i);
    }

    @Override // defpackage.d28
    public Typeface b(jk4 jk4Var, ob4 ob4Var, int i) {
        String strD = jk4Var.w;
        int i2 = ob4Var.t / 100;
        if (i2 >= 0 && i2 < 2) {
            strD = al.d(strD, "-thin");
        } else if (2 <= i2 && i2 < 4) {
            strD = al.d(strD, "-light");
        } else if (i2 != 4) {
            if (i2 == 5) {
                strD = al.d(strD, "-medium");
            } else if ((6 > i2 || i2 >= 8) && 8 <= i2 && i2 < 11) {
                strD = al.d(strD, "-black");
            }
        }
        Typeface typeface = null;
        if (strD.length() != 0) {
            Typeface typefaceC = c(strD, ob4Var, i);
            if (!xj5.a(typefaceC, Typeface.create(Typeface.DEFAULT, lo.c(ob4Var, i))) && !xj5.a(typefaceC, c(null, ob4Var, i))) {
                typeface = typefaceC;
            }
        }
        return typeface == null ? c(jk4Var.w, ob4Var, i) : typeface;
    }
}
