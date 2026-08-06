package io.intercom.android.sdk.utilities.coil;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import defpackage.br9;
import defpackage.eva;
import defpackage.qq2;
import defpackage.r02;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class GrayscaleTransformation implements eva {
    public static final int $stable = 0;
    private static final ColorMatrixColorFilter COLOR_FILTER;
    private static final Companion Companion = new Companion(null);

    static {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        COLOR_FILTER = new ColorMatrixColorFilter(colorMatrix);
    }

    public boolean equals(Object obj) {
        return obj instanceof GrayscaleTransformation;
    }

    @Override // defpackage.eva
    public String getCacheKey() {
        return GrayscaleTransformation.class.getName();
    }

    public int hashCode() {
        return GrayscaleTransformation.class.hashCode();
    }

    public String toString() {
        return "GrayscaleTransformation()";
    }

    @Override // defpackage.eva
    public Object transform(Bitmap bitmap, br9 br9Var, r02<? super Bitmap> r02Var) {
        Paint paint = new Paint(3);
        paint.setColorFilter(COLOR_FILTER);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, config);
        bitmapCreateBitmap.getClass();
        new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        public final ColorMatrixColorFilter getCOLOR_FILTER() {
            return GrayscaleTransformation.COLOR_FILTER;
        }

        private Companion() {
        }
    }
}
