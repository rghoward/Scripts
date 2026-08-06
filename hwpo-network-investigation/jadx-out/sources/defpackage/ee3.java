package defpackage;

import android.content.Context;
import android.graphics.Color;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ee3 {
    public static final int f = (int) Math.round(5.1000000000000005d);
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public ee3(Context context) {
        boolean zB = bj6.b(context, R.attr.elevationOverlayEnabled, false);
        Integer numB = g53.b(context, R.attr.elevationOverlayColor);
        int iIntValue = numB != null ? numB.intValue() : 0;
        Integer numB2 = g53.b(context, R.attr.elevationOverlayAccentColor);
        int iIntValue2 = numB2 != null ? numB2.intValue() : 0;
        Integer numB3 = g53.b(context, R.attr.colorSurface);
        int iIntValue3 = numB3 != null ? numB3.intValue() : 0;
        float f2 = context.getResources().getDisplayMetrics().density;
        this.a = zB;
        this.b = iIntValue;
        this.c = iIntValue2;
        this.d = iIntValue3;
        this.e = f2;
    }

    public final int a(float f2, int i) {
        int i2;
        if (!this.a || vi1.h(i, 255) != this.d) {
            return i;
        }
        float f3 = this.e;
        float fMin = (f3 <= 0.0f || f2 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f2 / f3)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int iD = g53.d(vi1.h(i, 255), fMin, this.b);
        if (fMin > 0.0f && (i2 = this.c) != 0) {
            iD = vi1.e(vi1.h(i2, f), iD);
        }
        return vi1.h(iD, iAlpha);
    }
}
