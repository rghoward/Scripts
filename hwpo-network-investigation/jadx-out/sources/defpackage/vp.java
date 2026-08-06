package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vp implements cu7 {
    public final Path a;
    public RectF b;
    public float[] c;
    public Matrix d;

    public vp(Path path) {
        this.a = path;
    }

    @Override // defpackage.cu7
    public final void a(float f, float f2, float f3, float f4) {
        this.a.rQuadTo(f, f2, f3, f4);
    }

    @Override // defpackage.cu7
    public final void b(float f, float f2) {
        this.a.rMoveTo(f, f2);
    }

    @Override // defpackage.cu7
    public final void c(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.rCubicTo(f, f2, f3, f4, f5, f6);
    }

    @Override // defpackage.cu7
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.cu7
    public final void d(float f, float f2, float f3, float f4) {
        this.a.quadTo(f, f2, f3, f4);
    }

    @Override // defpackage.cu7
    public final void e(float f, float f2, float f3, float f4) {
        this.a.rQuadTo(f, f2, f3, f4);
    }

    @Override // defpackage.cu7
    public final void f(int i) {
        this.a.setFillType(i == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    @Override // defpackage.cu7
    public final void g(float f, float f2, float f3, float f4) {
        this.a.quadTo(f, f2, f3, f4);
    }

    @Override // defpackage.cu7
    public final sk8 getBounds() {
        if (this.b == null) {
            this.b = new RectF();
        }
        RectF rectF = this.b;
        rectF.getClass();
        this.a.computeBounds(rectF, true);
        return new sk8(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // defpackage.cu7
    public final int h() {
        return this.a.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
    }

    @Override // defpackage.cu7
    public final void i(float f, float f2) {
        this.a.moveTo(f, f2);
    }

    @Override // defpackage.cu7
    public final void j(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.cubicTo(f, f2, f3, f4, f5, f6);
    }

    @Override // defpackage.cu7
    public final void k() {
        this.a.rewind();
    }

    @Override // defpackage.cu7
    public final void m(float f, float f2) {
        this.a.rLineTo(f, f2);
    }

    @Override // defpackage.cu7
    public final void n(float f, float f2) {
        this.a.lineTo(f, f2);
    }

    public final void o(cu7 cu7Var, long j) {
        if (!(cu7Var instanceof vp)) {
            ru3.f("Unable to obtain android.graphics.Path");
            return;
        }
        this.a.addPath(((vp) cu7Var).a, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public final void p(sk8 sk8Var) {
        float f = sk8Var.a;
        float f2 = sk8Var.d;
        float f3 = sk8Var.c;
        float f4 = sk8Var.b;
        if (Float.isNaN(f) || Float.isNaN(f4) || Float.isNaN(f3) || Float.isNaN(f2)) {
            xp.b("Invalid rectangle, make sure no value is NaN");
        }
        if (this.b == null) {
            this.b = new RectF();
        }
        RectF rectF = this.b;
        rectF.getClass();
        rectF.set(sk8Var.a, f4, f3, f2);
        RectF rectF2 = this.b;
        rectF2.getClass();
        this.a.addRect(rectF2, Path.Direction.CCW);
    }

    public final void q(vx8 vx8Var) {
        if (this.b == null) {
            this.b = new RectF();
        }
        RectF rectF = this.b;
        rectF.getClass();
        float f = vx8Var.a;
        long j = vx8Var.h;
        long j2 = vx8Var.g;
        long j3 = vx8Var.f;
        long j4 = vx8Var.e;
        rectF.set(f, vx8Var.b, vx8Var.c, vx8Var.d);
        if (this.c == null) {
            this.c = new float[8];
        }
        float[] fArr = this.c;
        fArr.getClass();
        fArr[0] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        RectF rectF2 = this.b;
        rectF2.getClass();
        float[] fArr2 = this.c;
        fArr2.getClass();
        this.a.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    public final boolean r(cu7 cu7Var, cu7 cu7Var2, int i) {
        Path.Op op;
        if (i == 0) {
            op = Path.Op.DIFFERENCE;
        } else if (i == 1) {
            op = Path.Op.INTERSECT;
        } else if (i == 4) {
            op = Path.Op.REVERSE_DIFFERENCE;
        } else {
            op = i == 2 ? Path.Op.UNION : Path.Op.XOR;
        }
        if (!(cu7Var instanceof vp)) {
            ru3.f("Unable to obtain android.graphics.Path");
            return false;
        }
        Path path = ((vp) cu7Var).a;
        if (cu7Var2 instanceof vp) {
            return this.a.op(path, ((vp) cu7Var2).a, op);
        }
        ru3.f("Unable to obtain android.graphics.Path");
        return false;
    }

    @Override // defpackage.cu7
    public final void reset() {
        this.a.reset();
    }

    public final void s(long j) {
        Matrix matrix = this.d;
        if (matrix == null) {
            this.d = new Matrix();
        } else {
            matrix.getClass();
            matrix.reset();
        }
        Matrix matrix2 = this.d;
        matrix2.getClass();
        matrix2.setTranslate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        Matrix matrix3 = this.d;
        matrix3.getClass();
        this.a.transform(matrix3);
    }
}
