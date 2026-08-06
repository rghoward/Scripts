package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ol implements n41 {
    public Canvas a = pl.a;
    public Rect b;
    public Rect c;

    @Override // defpackage.n41
    public final void a(long j, long j2, cs7 cs7Var) {
        this.a.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), op.a(cs7Var));
    }

    @Override // defpackage.n41
    public final void b(float f, float f2, float f3, float f4, float f5, float f6, cs7 cs7Var) {
        this.a.drawRoundRect(f, f2, f3, f4, f5, f6, op.a(cs7Var));
    }

    @Override // defpackage.n41
    public final void c(cu7 cu7Var, cs7 cs7Var) {
        Canvas canvas = this.a;
        if (cu7Var instanceof vp) {
            canvas.drawPath(((vp) cu7Var).a, op.a(cs7Var));
        } else {
            ru3.f("Unable to obtain android.graphics.Path");
        }
    }

    @Override // defpackage.n41
    public final void d(float f, float f2) {
        this.a.scale(f, f2);
    }

    @Override // defpackage.n41
    public final void e(float f) {
        this.a.rotate(f);
    }

    @Override // defpackage.n41
    public final void f() {
        this.a.save();
    }

    @Override // defpackage.n41
    public final void g(float f, float f2, float f3, float f4, float f5, float f6, cs7 cs7Var) {
        this.a.drawArc(f, f2, f3, f4, f5, f6, false, op.a(cs7Var));
    }

    @Override // defpackage.n41
    public final void h() {
        w41.a(this.a, false);
    }

    @Override // defpackage.n41
    public final void i(cu7 cu7Var) {
        Canvas canvas = this.a;
        if (cu7Var instanceof vp) {
            canvas.clipPath(((vp) cu7Var).a, Region.Op.INTERSECT);
        } else {
            ru3.f("Unable to obtain android.graphics.Path");
        }
    }

    @Override // defpackage.n41
    public final void j(l75 l75Var, long j, long j2, long j3, long j4, cs7 cs7Var) {
        if (this.b == null) {
            this.b = new Rect();
            this.c = new Rect();
        }
        Canvas canvas = this.a;
        Bitmap bitmapA = so.a(l75Var);
        Rect rect = this.b;
        rect.getClass();
        int i = (int) (j >> 32);
        rect.left = i;
        int i2 = (int) (j & 4294967295L);
        rect.top = i2;
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = i2 + ((int) (j2 & 4294967295L));
        g2b g2bVar = g2b.a;
        Rect rect2 = this.c;
        rect2.getClass();
        int i3 = (int) (j3 >> 32);
        rect2.left = i3;
        int i4 = (int) (j3 & 4294967295L);
        rect2.top = i4;
        rect2.right = i3 + ((int) (j4 >> 32));
        rect2.bottom = i4 + ((int) (j4 & 4294967295L));
        canvas.drawBitmap(bitmapA, rect, rect2, op.a(cs7Var));
    }

    @Override // defpackage.n41
    public final void k(float[] fArr) {
        if (z63.f(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        b23.h(matrix, fArr);
        this.a.concat(matrix);
    }

    @Override // defpackage.n41
    public final void l(sk8 sk8Var, cs7 cs7Var) {
        this.a.saveLayer(sk8Var.a, sk8Var.b, sk8Var.c, sk8Var.d, op.a(cs7Var), 31);
    }

    @Override // defpackage.n41
    public final void m(float f, float f2, float f3, float f4, int i) {
        this.a.clipRect(f, f2, f3, f4, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // defpackage.n41
    public final void n(float f, float f2) {
        this.a.translate(f, f2);
    }

    @Override // defpackage.n41
    public final void o() {
        this.a.restore();
    }

    @Override // defpackage.n41
    public final void p(float f, long j, cs7 cs7Var) {
        this.a.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, op.a(cs7Var));
    }

    @Override // defpackage.n41
    public final void q(l75 l75Var, long j, cs7 cs7Var) {
        this.a.drawBitmap(so.a(l75Var), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), op.a(cs7Var));
    }

    @Override // defpackage.n41
    public final void s(float f, float f2, float f3, float f4, cs7 cs7Var) {
        this.a.drawRect(f, f2, f3, f4, op.a(cs7Var));
    }

    @Override // defpackage.n41
    public final void t() {
        w41.a(this.a, true);
    }
}
