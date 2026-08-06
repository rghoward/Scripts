package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class q {
    public static final at2 a;

    static {
        et2 et2Var = i23.a;
        gt4 gt4VarX0 = ag6.a.x0();
        wr2 wr2Var = wr2.v;
        Bitmap.Config config = v.b;
        v01 v01Var = v01.ENABLED;
        a = new at2(gt4VarX0, wr2Var, wr2Var, wr2Var, xva.a.a, x68.v, config, true, false, null, null, null, v01Var, v01Var, v01Var);
    }

    public static final boolean a(k85 k85Var) {
        x68 x68Var = k85Var.h;
        k9a k9aVar = k85Var.c;
        lr9 lr9Var = k85Var.y;
        int iOrdinal = x68Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    u.b();
                    return false;
                }
                if (k85Var.F.a != null || !(lr9Var instanceof r23)) {
                    if ((k9aVar instanceof pib) && (lr9Var instanceof mib)) {
                        pib pibVar = (pib) k9aVar;
                        if (pibVar.a() == null || pibVar.a() != ((mib) lr9Var).a()) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static final Drawable b(k85 k85Var, Drawable drawable, Integer num, Drawable drawable2) {
        if (drawable != null) {
            return drawable;
        }
        if (num != null) {
            drawable2 = null;
            if (num.intValue() == 0) {
                return null;
            }
            Context context = k85Var.a;
            int iIntValue = num.intValue();
            Drawable drawableB = e00.b(context, iIntValue);
            if (drawableB != null) {
                return drawableB;
            }
            p.a(pp2.a(iIntValue, "Invalid resource ID: "));
        }
        return drawable2;
    }
}
