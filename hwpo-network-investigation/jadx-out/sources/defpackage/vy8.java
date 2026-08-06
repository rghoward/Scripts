package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vy8 {
    /* JADX WARN: Code duplicated, block: B:11:0x001d  */
    public static final float a(jz7.a aVar, boolean z, uy8[] uy8VarArr, float f) {
        float f2 = Float.NaN;
        for (uy8 uy8Var : uy8VarArr) {
            float f3 = aVar.f(uy8Var, Float.NaN);
            if (Float.isNaN(f2)) {
                f2 = f3;
            } else if (z == (f3 > f2)) {
                f2 = f3;
            }
        }
        return Float.isNaN(f2) ? f : f2;
    }
}
