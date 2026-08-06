package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class b61 extends irb {
    public static final a Companion = new a();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    @Override // defpackage.irb
    public final void z(Canvas canvas) {
        canvas.getClass();
        hrb hrbVar = this.h;
        if (hrbVar.s && hrbVar.a) {
            RectF rectFY = y();
            rectFY.getClass();
            int iSave = canvas.save();
            canvas.clipRect(rectFY);
            try {
                if (this.j.length != this.b.m * 2) {
                    this.j = new float[hrbVar.m * 2];
                }
                int i = 1;
                int i2 = 0;
                float[] fArr = {-0.5f};
                float[] fArr2 = hrbVar.l;
                fArr2.getClass();
                ArrayList arrayList = new ArrayList(fArr2.length);
                for (float f : fArr2) {
                    arrayList.add(Float.valueOf(f + 0.5f));
                }
                float[] fArrCopyOf = Arrays.copyOf(fArr, arrayList.size() + 1);
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    fArrCopyOf[i] = ((Number) obj).floatValue();
                    i++;
                }
                int length = fArrCopyOf.length * 2;
                float[] fArr3 = new float[length];
                int i4 = length - 1;
                int iA = ie3.a(0, i4, 2);
                if (iA >= 0) {
                    int i5 = 0;
                    while (true) {
                        fArr3[i5] = fArrCopyOf[i5 / 2];
                        fArr3[i5 + 1] = fArrCopyOf[i5 / 2];
                        if (i5 == iA) {
                            break;
                        } else {
                            i5 += 2;
                        }
                    }
                }
                this.c.e(fArr3);
                Paint paint = this.d;
                paint.setColor(hrbVar.h);
                paint.setStrokeWidth(hrbVar.i);
                paint.setPathEffect(hrbVar.v);
                Path path = this.i;
                path.reset();
                int iA2 = ie3.a(0, i4, 2);
                if (iA2 >= 0) {
                    while (true) {
                        w(canvas, fArr3[i2], 0.0f, path);
                        if (i2 == iA2) {
                            break;
                        } else {
                            i2 += 2;
                        }
                    }
                }
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
    }
}
