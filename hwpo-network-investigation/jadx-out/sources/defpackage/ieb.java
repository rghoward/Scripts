package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ieb extends uy8 {
    @Override // defpackage.uy8
    public final float a(float f, qq5 qq5Var, qq5 qq5Var2) {
        return Float.intBitsToFloat((int) (qq5Var2.T(qq5Var, (((long) Float.floatToRawIntBits(((int) (qq5Var.a() & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32)) >> 32));
    }
}
