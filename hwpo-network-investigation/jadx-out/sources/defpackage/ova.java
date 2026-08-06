package defpackage;

import android.graphics.Matrix;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class ova {
    public final bib c;
    public final Matrix a = new Matrix();
    public final Matrix b = new Matrix();
    public final Matrix d = new Matrix();
    public final float[] e = new float[2];

    public ova(bib bibVar) {
        new Matrix();
        new Matrix();
        this.c = bibVar;
    }

    public final rf6 a(float f, float f2) {
        float[] fArr = this.e;
        fArr[0] = f;
        fArr[1] = f2;
        e(fArr);
        return rf6.b(fArr[0], fArr[1]);
    }

    public final rf6 b(float f, float f2) {
        rf6 rf6VarB = rf6.b(0.0d, 0.0d);
        c(f, f2, rf6VarB);
        return rf6VarB;
    }

    public final void c(float f, float f2, rf6 rf6Var) {
        float[] fArr = this.e;
        fArr[0] = f;
        fArr[1] = f2;
        d(fArr);
        rf6Var.b = fArr[0];
        rf6Var.c = fArr[1];
    }

    public final void d(float[] fArr) {
        Matrix matrix = this.d;
        matrix.reset();
        this.b.invert(matrix);
        matrix.mapPoints(fArr);
        this.c.a.invert(matrix);
        matrix.mapPoints(fArr);
        this.a.invert(matrix);
        matrix.mapPoints(fArr);
    }

    public final void e(float[] fArr) {
        this.a.mapPoints(fArr);
        this.c.a.mapPoints(fArr);
        this.b.mapPoints(fArr);
    }

    public void f() {
        Matrix matrix = this.b;
        matrix.reset();
        bib bibVar = this.c;
        matrix.postTranslate(bibVar.b.left, bibVar.d - bibVar.h());
    }

    public final void g(float f, float f2, float f3, float f4) {
        bib bibVar = this.c;
        float fWidth = bibVar.b.width() / f2;
        float fHeight = bibVar.b.height() / f3;
        if (Float.isInfinite(fWidth)) {
            fWidth = 0.0f;
        }
        if (Float.isInfinite(fHeight)) {
            fHeight = 0.0f;
        }
        Matrix matrix = this.a;
        matrix.reset();
        matrix.postTranslate(-f, -f4);
        matrix.postScale(fWidth, -fHeight);
    }
}
