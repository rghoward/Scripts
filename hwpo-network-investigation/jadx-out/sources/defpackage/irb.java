package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class irb extends dh0 {
    public final hrb h;
    public final Path i;
    public float[] j;
    public final RectF k;
    public final float[] l;
    public final RectF m;
    public final float[] n;
    public final Path o;

    public irb(bib bibVar, hrb hrbVar, ova ovaVar) {
        super(bibVar, ovaVar, hrbVar);
        this.i = new Path();
        this.j = new float[2];
        this.k = new RectF();
        this.l = new float[2];
        this.m = new RectF();
        this.n = new float[4];
        this.o = new Path();
        this.h = hrbVar;
        this.e.setColor(-16777216);
        this.e.setTextAlign(Paint.Align.CENTER);
        this.e.setTextSize(t6b.c(10.0f));
    }

    @Override // defpackage.dh0
    public void u(float f, float f2) {
        bib bibVar = (bib) this.a;
        RectF rectF = bibVar.b;
        RectF rectF2 = bibVar.b;
        if (rectF.width() > 10.0f && !bibVar.a()) {
            float f3 = rectF2.left;
            float f4 = rectF2.top;
            ova ovaVar = this.c;
            rf6 rf6VarB = ovaVar.b(f3, f4);
            rf6 rf6VarB2 = ovaVar.b(rectF2.right, rectF2.top);
            float f5 = (float) rf6VarB.b;
            float f6 = (float) rf6VarB2.b;
            rf6.c(rf6VarB);
            rf6.c(rf6VarB2);
            f = f5;
            f2 = f6;
        }
        v(f, f2);
    }

    @Override // defpackage.dh0
    public final void v(float f, float f2) {
        super.v(f, f2);
        hrb hrbVar = this.h;
        String strC = hrbVar.c();
        Typeface typeface = hrbVar.d;
        Paint paint = this.e;
        paint.setTypeface(typeface);
        paint.setTextSize(hrbVar.e);
        ts3 ts3VarB = t6b.b(paint, strC);
        float f3 = ts3VarB.b;
        float fA = t6b.a(paint, "Q");
        float fAbs = Math.abs(((float) Math.sin(0.0d)) * fA) + Math.abs(((float) Math.cos(0.0d)) * f3);
        float fAbs2 = Math.abs(((float) Math.cos(0.0d)) * fA) + Math.abs(((float) Math.sin(0.0d)) * f3);
        ts3 ts3Var = (ts3) ts3.d.b();
        ts3Var.b = fAbs;
        ts3Var.c = fAbs2;
        Math.round(f3);
        Math.round(fA);
        Math.round(ts3Var.b);
        hrbVar.F = Math.round(ts3Var.c);
        oe7<ts3> oe7Var = ts3.d;
        oe7Var.c(ts3Var);
        oe7Var.c(ts3VarB);
    }

    public void w(Canvas canvas, float f, float f2, Path path) {
        bib bibVar = (bib) this.a;
        path.moveTo(f, bibVar.b.bottom);
        path.lineTo(f, bibVar.b.top);
        canvas.drawPath(path, this.d);
        path.reset();
    }

    public void x(Canvas canvas, float f, sf6 sf6Var) {
        hrb hrbVar = this.h;
        hrbVar.getClass();
        int i = hrbVar.m * 2;
        float[] fArr = new float[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3 += 2) {
            fArr[i3] = hrbVar.l[i3 / 2];
        }
        this.c.e(fArr);
        int i4 = 0;
        while (i4 < i) {
            float f2 = fArr[i4];
            if (((bib) this.a).e(f2)) {
                String strA = hrbVar.d().a(hrbVar.l[i4 / 2]);
                Paint.FontMetrics fontMetrics = t6b.i;
                Paint paint = this.e;
                float fontMetrics2 = paint.getFontMetrics(fontMetrics);
                int length = strA.length();
                Rect rect = t6b.h;
                paint.getTextBounds(strA, i2, length, rect);
                float fWidth = 0.0f - rect.left;
                float f3 = (-fontMetrics.ascent) + 0.0f;
                Paint.Align textAlign = paint.getTextAlign();
                paint.setTextAlign(Paint.Align.LEFT);
                if (sf6Var.b != 0.0f || sf6Var.c != 0.0f) {
                    fWidth -= rect.width() * sf6Var.b;
                    f3 -= fontMetrics2 * sf6Var.c;
                }
                canvas.drawText(strA, fWidth + f2, f3 + f, paint);
                paint.setTextAlign(textAlign);
            }
            i4 += 2;
            i2 = 0;
        }
    }

    public RectF y() {
        RectF rectF = ((bib) this.a).b;
        RectF rectF2 = this.k;
        rectF2.set(rectF);
        rectF2.inset(-this.b.i, 0.0f);
        return rectF2;
    }

    public void z(Canvas canvas) {
        hrb hrbVar = this.h;
        if (hrbVar.s && hrbVar.a) {
            int iSave = canvas.save();
            canvas.clipRect(y());
            if (this.j.length != this.b.m * 2) {
                this.j = new float[hrbVar.m * 2];
            }
            float[] fArr = this.j;
            for (int i = 0; i < fArr.length; i += 2) {
                float[] fArr2 = hrbVar.l;
                int i2 = i / 2;
                fArr[i] = fArr2[i2];
                fArr[i + 1] = fArr2[i2];
            }
            this.c.e(fArr);
            int i3 = hrbVar.h;
            Paint paint = this.d;
            paint.setColor(i3);
            paint.setStrokeWidth(hrbVar.i);
            paint.setPathEffect(hrbVar.v);
            Path path = this.i;
            path.reset();
            for (int i4 = 0; i4 < fArr.length; i4 += 2) {
                w(canvas, fArr[i4], fArr[i4 + 1], path);
            }
            canvas.restoreToCount(iSave);
        }
    }
}
