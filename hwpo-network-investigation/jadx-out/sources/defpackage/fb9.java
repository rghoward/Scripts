package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fb9 {
    public static final sk8 a(qq5 qq5Var) {
        sk8 sk8VarB = rq5.b(qq5Var, true);
        long jF = qq5Var.F(sk8VarB.d());
        float f = sk8VarB.c;
        float f2 = sk8VarB.d;
        long jF2 = qq5Var.F((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        return new sk8(Float.intBitsToFloat((int) (jF >> 32)), Float.intBitsToFloat((int) (jF & 4294967295L)), Float.intBitsToFloat((int) (jF2 >> 32)), Float.intBitsToFloat((int) (jF2 & 4294967295L)));
    }
}
