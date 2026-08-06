package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ou8 {
    public static final Drawable a(Context context, int i, int i2) {
        Drawable drawable = context.getDrawable(i);
        if (drawable == null) {
            z90.a("Required value was null.");
            return null;
        }
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.getClass();
        drawableMutate.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
        return drawableMutate;
    }
}
