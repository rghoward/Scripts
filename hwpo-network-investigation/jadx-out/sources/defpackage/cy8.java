package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cy8 implements eva {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final String e;

    public cy8(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (f < 0.0f || f2 < 0.0f || f3 < 0.0f || f4 < 0.0f) {
            z90.a("All radii must be >= 0.");
            throw null;
        }
        this.e = cy8.class.getName() + '-' + f + ',' + f2 + ',' + f3 + ',' + f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cy8)) {
            return false;
        }
        cy8 cy8Var = (cy8) obj;
        return this.a == cy8Var.a && this.b == cy8Var.b && this.c == cy8Var.c && this.d == cy8Var.d;
    }

    @Override // defpackage.eva
    public final String getCacheKey() {
        return this.e;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + h44.a(h44.a(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.eva
    public final Object transform(Bitmap bitmap, br9 br9Var, r02<? super Bitmap> r02Var) {
        js7 js7Var;
        Paint paint = new Paint(3);
        boolean zA = xj5.a(br9Var, br9.c);
        s39 s39Var = s39.t;
        if (zA) {
            js7Var = new js7(Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()));
        } else {
            s03 s03Var = br9Var.a;
            s03 s03Var2 = br9Var.b;
            if ((s03Var instanceof s03.a) && (s03Var2 instanceof s03.a)) {
                js7Var = new js7(Integer.valueOf(((s03.a) s03Var).a), Integer.valueOf(((s03.a) s03Var2).a));
            } else {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                s03 s03Var3 = br9Var.a;
                double dG = eo7.g(width, height, s03Var3 instanceof s03.a ? ((s03.a) s03Var3).a : Integer.MIN_VALUE, s03Var2 instanceof s03.a ? ((s03.a) s03Var2).a : Integer.MIN_VALUE, s39Var);
                js7Var = new js7(Integer.valueOf(wk6.a(((double) bitmap.getWidth()) * dG)), Integer.valueOf(wk6.a(dG * ((double) bitmap.getHeight()))));
            }
        }
        int iIntValue = ((Number) js7Var.t).intValue();
        int iIntValue2 = ((Number) js7Var.u).intValue();
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iIntValue, iIntValue2, config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        Matrix matrix = new Matrix();
        float fG = (float) eo7.g(bitmap.getWidth(), bitmap.getHeight(), iIntValue, iIntValue2, s39Var);
        matrix.setTranslate((iIntValue - (bitmap.getWidth() * fG)) / 2.0f, (iIntValue2 - (bitmap.getHeight() * fG)) / 2.0f);
        matrix.preScale(fG, fG);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        float f = this.a;
        float f2 = this.b;
        float f3 = this.d;
        float f4 = this.c;
        float[] fArr = {f, f, f2, f2, f3, f3, f4, f4};
        RectF rectF = new RectF(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        Path path = new Path();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(path, paint);
        return bitmapCreateBitmap;
    }

    public cy8() {
        this(0.0f, 0.0f, 0.0f, 0.0f);
    }
}
