package defpackage;

import android.graphics.Paint;
import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dh0 extends l4c {
    public final bh0 b;
    public final ova c;
    public final Paint d;
    public final Paint e;
    public final Paint f;
    public final Paint g;

    public dh0(bib bibVar, ova ovaVar, bh0 bh0Var) {
        super(bibVar);
        this.c = ovaVar;
        this.b = bh0Var;
        if (bibVar != null) {
            this.e = new Paint(1);
            Paint paint = new Paint();
            this.d = paint;
            paint.setColor(-7829368);
            paint.setStrokeWidth(1.0f);
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            paint.setAlpha(90);
            Paint paint2 = new Paint();
            this.f = paint2;
            paint2.setColor(-16777216);
            paint2.setStrokeWidth(1.0f);
            paint2.setStyle(style);
            Paint paint3 = new Paint(1);
            this.g = paint3;
            paint3.setStyle(style);
        }
    }

    public void u(float f, float f2) {
        bib bibVar = (bib) this.a;
        if (bibVar != null) {
            RectF rectF = bibVar.b;
            if (rectF.width() > 10.0f && !bibVar.b()) {
                float f3 = rectF.left;
                float f4 = rectF.top;
                ova ovaVar = this.c;
                rf6 rf6VarB = ovaVar.b(f3, f4);
                rf6 rf6VarB2 = ovaVar.b(rectF.left, rectF.bottom);
                float f5 = (float) rf6VarB2.c;
                float f6 = (float) rf6VarB.c;
                rf6.c(rf6VarB);
                rf6.c(rf6VarB2);
                f = f5;
                f2 = f6;
            }
        }
        v(f, f2);
    }

    public void v(float f, float f2) {
        double dFloor;
        int i;
        float f3 = f;
        bh0 bh0Var = this.b;
        int i2 = bh0Var.o;
        double dAbs = Math.abs(f2 - f3);
        if (i2 == 0 || dAbs <= 0.0d || Double.isInfinite(dAbs)) {
            bh0Var.l = new float[0];
            bh0Var.m = 0;
            return;
        }
        double d = t6b.d(dAbs / ((double) i2));
        if (bh0Var.q) {
            double d2 = bh0Var.p;
            if (d < d2) {
                d = d2;
            }
        }
        double d3 = t6b.d(Math.pow(10.0d, (int) Math.log10(d)));
        if (((int) (d / d3)) > 5) {
            d = Math.floor(d3 * 10.0d);
        }
        if (bh0Var.r) {
            d = ((float) dAbs) / (i2 - 1);
            bh0Var.m = i2;
            if (bh0Var.l.length < i2) {
                bh0Var.l = new float[i2];
            }
            for (int i3 = 0; i3 < i2; i3++) {
                bh0Var.l[i3] = f3;
                f3 = (float) (((double) f3) + d);
            }
        } else {
            double dCeil = d == 0.0d ? 0.0d : Math.ceil(((double) f3) / d) * d;
            if (d == 0.0d) {
                dFloor = 0.0d;
            } else {
                dFloor = Math.floor(((double) f2) / d) * d;
                if (dFloor != Double.POSITIVE_INFINITY) {
                    double d4 = dFloor + 0.0d;
                    dFloor = Double.longBitsToDouble(Double.doubleToRawLongBits(d4) + (d4 >= 0.0d ? 1L : -1L));
                }
            }
            if (d != 0.0d) {
                i = 0;
                for (double d5 = dCeil; d5 <= dFloor; d5 += d) {
                    i++;
                }
            } else {
                i = 0;
            }
            bh0Var.m = i;
            if (bh0Var.l.length < i) {
                bh0Var.l = new float[i];
            }
            for (int i4 = 0; i4 < i; i4++) {
                if (dCeil == 0.0d) {
                    dCeil = 0.0d;
                }
                bh0Var.l[i4] = (float) dCeil;
                dCeil += d;
            }
        }
        if (d < 1.0d) {
            bh0Var.n = (int) Math.ceil(-Math.log10(d));
        } else {
            bh0Var.n = 0;
        }
    }
}
