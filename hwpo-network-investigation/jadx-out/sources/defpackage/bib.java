package defpackage;

import android.graphics.Matrix;
import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class bib {
    public final Matrix a = new Matrix();
    public final RectF b = new RectF();
    public float c = 0.0f;
    public float d = 0.0f;
    public final float e = 1.0f;
    public final float f = Float.MAX_VALUE;
    public float g = 1.0f;
    public float h = Float.MAX_VALUE;
    public float i = 1.0f;
    public float j = 1.0f;
    public float k = 0.0f;
    public float l = 0.0f;
    public float m = 0.0f;
    public final Matrix n = new Matrix();
    public final float[] o = new float[9];

    public final boolean a() {
        float f = this.i;
        float f2 = this.g;
        return f <= f2 && f2 <= 1.0f;
    }

    public final boolean b() {
        float f = this.j;
        float f2 = this.e;
        return f <= f2 && f2 <= 1.0f;
    }

    public final boolean c(float f) {
        return this.b.left <= f + 1.0f;
    }

    public final boolean d(float f) {
        return this.b.right >= (((float) ((int) (f * 100.0f))) / 100.0f) - 1.0f;
    }

    public final boolean e(float f) {
        return c(f) && d(f);
    }

    public final boolean f(float f) {
        if (this.b.top <= f) {
            return (this.b.bottom > (((float) ((int) (f * 100.0f))) / 100.0f) ? 1 : (this.b.bottom == (((float) ((int) (f * 100.0f))) / 100.0f) ? 0 : -1)) >= 0;
        }
        return false;
    }

    public final void g(Matrix matrix, RectF rectF) {
        float fWidth;
        float fHeight;
        float[] fArr = this.o;
        matrix.getValues(fArr);
        float f = fArr[2];
        float f2 = fArr[0];
        float f3 = fArr[5];
        float f4 = fArr[4];
        this.i = Math.min(Math.max(this.g, f2), this.h);
        this.j = Math.min(Math.max(this.e, f4), this.f);
        if (rectF != null) {
            fWidth = rectF.width();
            fHeight = rectF.height();
        } else {
            fWidth = 0.0f;
            fHeight = 0.0f;
        }
        this.k = Math.min(Math.max(f, ((this.i - 1.0f) * (-fWidth)) - this.l), this.l);
        float fMax = Math.max(Math.min(f3, ((this.j - 1.0f) * fHeight) + this.m), -this.m);
        fArr[2] = this.k;
        fArr[0] = this.i;
        fArr[5] = fMax;
        fArr[4] = this.j;
        matrix.setValues(fArr);
    }

    public final float h() {
        return this.d - this.b.bottom;
    }

    public final void i(Matrix matrix, mj0 mj0Var, boolean z) {
        Matrix matrix2 = this.a;
        matrix2.set(matrix);
        g(matrix2, this.b);
        if (z) {
            mj0Var.invalidate();
        }
        matrix.set(matrix2);
    }
}
