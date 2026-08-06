package defpackage;

import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ea3 {
    public static float a(EdgeEffect edgeEffect, float f, float f2, tx2 tx2Var) {
        float f3 = fa3.a;
        double density = tx2Var.getDensity() * 386.0878f * 160.0f * 0.84f;
        double dAbs = Math.abs(f) * 0.35f;
        double d = ((double) fa3.a) * density;
        float fExp = (float) (Math.exp((fa3.b / fa3.c) * Math.log(dAbs / d)) * d);
        int i = Build.VERSION.SDK_INT;
        if (fExp > (i >= 31 ? ix.b(edgeEffect) : 0.0f) * f2) {
            return 0.0f;
        }
        int iB = wk6.b(f);
        if (i >= 31) {
            edgeEffect.onAbsorb(iB);
            return f;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(iB);
        }
        return f;
    }
}
