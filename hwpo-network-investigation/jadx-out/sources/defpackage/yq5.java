package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.DisplayMetrics;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class yq5 {
    public static po a(int i, int i2, int i3) {
        Bitmap bitmapCreateBitmap;
        lw8 lw8Var = si1.e;
        Bitmap.Config configB = so.b(i3);
        if (Build.VERSION.SDK_INT >= 26) {
            bitmapCreateBitmap = bx.a(i, i2, i3, lw8Var);
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i, i2, configB);
            bitmapCreateBitmap.setHasAlpha(true);
        }
        return new po(bitmapCreateBitmap);
    }

    public static final ox6 b(ox6 ox6Var, float f) {
        return f == 1.0f ? ox6Var : po4.c(ox6Var, 0.0f, 0.0f, f, 0.0f, null, 520187);
    }

    public static final Object c(cl6 cl6Var) {
        Object objG = cl6Var.g();
        ar5 ar5Var = objG instanceof ar5 ? (ar5) objG : null;
        if (ar5Var != null) {
            return ar5Var.U();
        }
        return null;
    }

    public static final ox6 d(ox6 ox6Var, Object obj) {
        return ox6Var.H(new xq5(obj));
    }

    public static final double e(long j) {
        return ((j >>> 11) * 2048.0d) + (j & 2047);
    }

    public static final String f(int i, long j) {
        if (j >= 0) {
            ta1.a(i);
            String string = Long.toString(j, i);
            string.getClass();
            return string;
        }
        long j2 = i;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        ta1.a(i);
        String string2 = Long.toString(j3, i);
        string2.getClass();
        ta1.a(i);
        String string3 = Long.toString(j4, i);
        string3.getClass();
        return string2.concat(string3);
    }
}
