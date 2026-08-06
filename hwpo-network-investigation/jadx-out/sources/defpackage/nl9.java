package defpackage;

import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nl9 {
    public static final boolean a(cu7 cu7Var, float f, float f2) {
        float f3 = f - 0.005f;
        float f4 = f2 - 0.005f;
        float f5 = f + 0.005f;
        float f6 = f2 + 0.005f;
        vp vpVarA = xp.a();
        if (Float.isNaN(f3) || Float.isNaN(f4) || Float.isNaN(f5) || Float.isNaN(f6)) {
            xp.b("Invalid rectangle, make sure no value is NaN");
        }
        if (vpVarA.b == null) {
            vpVarA.b = new RectF();
        }
        RectF rectF = vpVarA.b;
        rectF.getClass();
        rectF.set(f3, f4, f5, f6);
        Path path = vpVarA.a;
        RectF rectF2 = vpVarA.b;
        rectF2.getClass();
        path.addRect(rectF2, Path.Direction.CCW);
        vp vpVarA2 = xp.a();
        vpVarA2.r(cu7Var, vpVarA, 1);
        boolean zIsEmpty = vpVarA2.a.isEmpty();
        vpVarA2.reset();
        vpVarA.reset();
        return !zIsEmpty;
    }

    public static final boolean b(float f, float f2, float f3, float f4, long j) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return ((f6 * f6) / (fIntBitsToFloat2 * fIntBitsToFloat2)) + ((f5 * f5) / (fIntBitsToFloat * fIntBitsToFloat)) <= 1.0f;
    }
}
