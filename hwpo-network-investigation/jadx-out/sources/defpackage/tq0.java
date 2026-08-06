package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.a;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class tq0 implements dva<Bitmap> {
    @Override // defpackage.dva
    public final kt8<Bitmap> a(Context context, kt8<Bitmap> kt8Var, int i, int i2) {
        if (!l6b.i(i, i2)) {
            z90.a(a30.b("Cannot apply transformation on width: ", " or height: ", " less than or equal to zero and not Target.SIZE_ORIGINAL", i, i2));
            return null;
        }
        qq0 qq0Var = a.a(context).t;
        Bitmap bitmap = kt8Var.get();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        Bitmap bitmapC = c(qq0Var, bitmap, i, i2);
        return bitmap.equals(bitmapC) ? kt8Var : sq0.d(qq0Var, bitmapC);
    }

    public abstract Bitmap c(qq0 qq0Var, Bitmap bitmap, int i, int i2);
}
