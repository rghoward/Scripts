package io.intercom.android.sdk.utilities.coil;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import defpackage.gz7;
import defpackage.xu;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class RoundedCornersAnimatedTransformation implements xu {
    public static final int $stable = 0;
    private final float radius;

    public RoundedCornersAnimatedTransformation(float f) {
        this.radius = f;
    }

    public final float getRadius() {
        return this.radius;
    }

    @Override // defpackage.xu
    public gz7 transform(Canvas canvas) {
        canvas.getClass();
        Paint paint = new Paint(3);
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        Path path = new Path();
        path.setFillType(Path.FillType.INVERSE_EVEN_ODD);
        float width = canvas.getWidth();
        float height = canvas.getHeight();
        float f = this.radius;
        path.addRoundRect(0.0f, 0.0f, width, height, f, f, Path.Direction.CW);
        canvas.drawPath(path, paint);
        return gz7.u;
    }
}
