package defpackage;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class j66 extends l4c {
    public Paint b;
    public Paint c;
    public h66 d;
    public ArrayList e;
    public Paint.FontMetrics f;
    public Path g;

    /* JADX WARN: Code duplicated, block: B:30:0x0076  */
    public final void u(Canvas canvas, float f, float f2, i66 i66Var, h66 h66Var) {
        Canvas canvas2;
        Path path = this.g;
        Paint paint = this.c;
        int i = i66Var.f;
        float f3 = i66Var.d;
        float f4 = i66Var.c;
        if (i == 1122868 || i == 1122867 || i == 0) {
            return;
        }
        int iSave = canvas.save();
        h66.b bVar = i66Var.b;
        if (bVar == h66.b.u) {
            bVar = h66Var.l;
        }
        paint.setColor(i);
        if (Float.isNaN(f4)) {
            f4 = h66Var.m;
        }
        float fC = t6b.c(f4);
        float f5 = fC / 2.0f;
        int iOrdinal = bVar.ordinal();
        if (iOrdinal == 2) {
            canvas2 = canvas;
            paint.setStyle(Paint.Style.FILL);
            canvas2.drawCircle(f + f5, f2, f5, paint);
        } else if (iOrdinal == 3) {
            paint.setStyle(Paint.Style.FILL);
            canvas2 = canvas;
            canvas2.drawRect(f, f2 - f5, f + fC, f2 + f5, paint);
        } else if (iOrdinal != 4) {
            if (iOrdinal == 5) {
                if (Float.isNaN(f3)) {
                    f3 = h66Var.n;
                }
                float fC2 = t6b.c(f3);
                DashPathEffect dashPathEffect = i66Var.e;
                if (dashPathEffect == null) {
                    h66Var.getClass();
                    dashPathEffect = null;
                }
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(fC2);
                paint.setPathEffect(dashPathEffect);
                path.reset();
                path.moveTo(f, f2);
                path.lineTo(f + fC, f2);
                canvas.drawPath(path, paint);
            }
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            paint.setStyle(Paint.Style.FILL);
            canvas2.drawCircle(f + f5, f2, f5, paint);
        }
        canvas2.restoreToCount(iSave);
    }
}
