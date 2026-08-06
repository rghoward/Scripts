package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class nrb extends dh0 {
    public final mrb h;
    public final Path i;
    public final RectF j;
    public float[] k;
    public final Path l;
    public final float[] m;
    public final RectF n;

    public nrb(bib bibVar, mrb mrbVar, ova ovaVar) {
        super(bibVar, ovaVar, mrbVar);
        this.i = new Path();
        this.j = new RectF();
        this.k = new float[2];
        new Path();
        new RectF();
        this.l = new Path();
        this.m = new float[2];
        this.n = new RectF();
        this.h = mrbVar;
        if (bibVar != null) {
            this.e.setColor(-16777216);
            this.e.setTextSize(t6b.c(10.0f));
            Paint paint = new Paint(1);
            paint.setColor(-7829368);
            paint.setStrokeWidth(1.0f);
            paint.setStyle(Paint.Style.STROKE);
        }
    }

    public void A(Canvas canvas) {
        bib bibVar = (bib) this.a;
        ArrayList arrayList = this.h.w;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        float[] fArr = this.m;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        Path path = this.l;
        path.reset();
        for (int i = 0; i < arrayList.size(); i++) {
            if (((z76) arrayList.get(i)).a) {
                int iSave = canvas.save();
                RectF rectF = bibVar.b;
                RectF rectF2 = bibVar.b;
                RectF rectF3 = this.n;
                rectF3.set(rectF);
                rectF3.inset(0.0f, -0.0f);
                canvas.clipRect(rectF3);
                Paint.Style style = Paint.Style.STROKE;
                Paint paint = this.g;
                paint.setStyle(style);
                paint.setColor(0);
                paint.setStrokeWidth(0.0f);
                paint.setPathEffect(null);
                fArr[1] = 0.0f;
                this.c.e(fArr);
                path.moveTo(rectF2.left, fArr[1]);
                path.lineTo(rectF2.right, fArr[1]);
                canvas.drawPath(path, paint);
                path.reset();
                canvas.restoreToCount(iSave);
            }
        }
    }

    public float[] w() {
        int length = this.k.length;
        mrb mrbVar = this.h;
        int i = mrbVar.m;
        if (length != i * 2) {
            this.k = new float[i * 2];
        }
        float[] fArr = this.k;
        for (int i2 = 0; i2 < fArr.length; i2 += 2) {
            fArr[i2 + 1] = mrbVar.l[i2 / 2];
        }
        this.c.e(fArr);
        return fArr;
    }

    public void x(Canvas canvas) {
        float f;
        float f2;
        float f3;
        bib bibVar = (bib) this.a;
        mrb mrbVar = this.h;
        if (mrbVar.a && mrbVar.u) {
            float[] fArrW = w();
            Typeface typeface = mrbVar.d;
            Paint paint = this.e;
            paint.setTypeface(typeface);
            paint.setTextSize(mrbVar.e);
            paint.setColor(mrbVar.f);
            float f4 = mrbVar.b;
            float fA = (t6b.a(paint, "A") / 2.5f) + mrbVar.c;
            mrb.a aVar = mrbVar.K;
            mrb.b bVar = mrbVar.J;
            mrb.a aVar2 = mrb.a.t;
            mrb.b bVar2 = mrb.b.t;
            if (aVar == aVar2) {
                if (bVar == bVar2) {
                    paint.setTextAlign(Paint.Align.RIGHT);
                    f = bibVar.b.left;
                    f3 = f - f4;
                } else {
                    paint.setTextAlign(Paint.Align.LEFT);
                    f2 = bibVar.b.left;
                    f3 = f2 + f4;
                }
            } else if (bVar == bVar2) {
                paint.setTextAlign(Paint.Align.LEFT);
                f2 = bibVar.b.right;
                f3 = f2 + f4;
            } else {
                paint.setTextAlign(Paint.Align.RIGHT);
                f = bibVar.b.right;
                f3 = f - f4;
            }
            boolean z = mrbVar.G;
            int i = mrbVar.m;
            if (!z) {
                i--;
            }
            for (int i2 = !mrbVar.F ? 1 : 0; i2 < i; i2++) {
                canvas.drawText(mrbVar.b(i2), f3, fArrW[(i2 * 2) + 1] + fA, paint);
            }
        }
    }

    public void y(Canvas canvas) {
        mrb mrbVar = this.h;
        if (mrbVar.a && mrbVar.t) {
            int i = mrbVar.j;
            Paint paint = this.f;
            paint.setColor(i);
            paint.setStrokeWidth(mrbVar.k);
            mrb.a aVar = mrbVar.K;
            bib bibVar = (bib) this.a;
            if (aVar == mrb.a.t) {
                RectF rectF = bibVar.b;
                float f = rectF.left;
                canvas.drawLine(f, rectF.top, f, rectF.bottom, paint);
            } else {
                RectF rectF2 = bibVar.b;
                float f2 = rectF2.right;
                canvas.drawLine(f2, rectF2.top, f2, rectF2.bottom, paint);
            }
        }
    }

    public final void z(Canvas canvas) {
        mrb mrbVar = this.h;
        if (mrbVar.a && mrbVar.s) {
            int iSave = canvas.save();
            RectF rectF = ((bib) this.a).b;
            RectF rectF2 = this.j;
            rectF2.set(rectF);
            rectF2.inset(0.0f, -this.b.i);
            canvas.clipRect(rectF2);
            float[] fArrW = w();
            int i = mrbVar.h;
            Paint paint = this.d;
            paint.setColor(i);
            paint.setStrokeWidth(mrbVar.i);
            paint.setPathEffect(mrbVar.v);
            Path path = this.i;
            path.reset();
            for (int i2 = 0; i2 < fArrW.length; i2 += 2) {
                bib bibVar = (bib) this.a;
                int i3 = i2 + 1;
                path.moveTo(bibVar.b.left, fArrW[i3]);
                path.lineTo(bibVar.b.right, fArrW[i3]);
                canvas.drawPath(path, paint);
                path.reset();
            }
            canvas.restoreToCount(iSave);
        }
    }
}
