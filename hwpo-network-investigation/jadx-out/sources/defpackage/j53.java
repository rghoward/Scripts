package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class j53 {
    public static final boolean a(i53 i53Var, long j) {
        if (!i53Var.t.G) {
            return false;
        }
        fd5 fd5Var = ew2.f(i53Var).Y.c;
        if (!fd5Var.n0.G) {
            return false;
        }
        long jA0 = fd5Var.a0(0L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jA0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jA0 & 4294967295L));
        long j2 = i53Var.K;
        float f = ((int) (j2 >> 32)) + fIntBitsToFloat;
        float f2 = ((int) (j2 & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        if (fIntBitsToFloat > fIntBitsToFloat3 || fIntBitsToFloat3 > f) {
            return false;
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        return fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f2;
    }
}
