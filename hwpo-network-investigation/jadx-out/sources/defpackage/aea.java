package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class aea {
    public static void a(kha khaVar, hda hdaVar, ria riaVar, qq5 qq5Var, gia giaVar, boolean z, ag7 ag7Var) {
        sk8 sk8VarB;
        if (z) {
            int iB = ag7Var.b(lja.e(khaVar.b));
            String str = bea.a;
            if (iB < riaVar.a.a.u.length()) {
                sk8VarB = riaVar.b(iB);
            } else {
                sk8VarB = iB != 0 ? riaVar.b(iB - 1) : new sk8(0.0f, 0.0f, 1.0f, (int) (bea.a(hdaVar.b, hdaVar.g, hdaVar.h, bea.a, 1) & 4294967295L));
            }
            float f = sk8VarB.b;
            float f2 = sk8VarB.a;
            long jA0 = qq5Var.a0((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
            sk8 sk8VarA = tk8.a((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jA0 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jA0 >> 32)))) << 32), (((long) Float.floatToRawIntBits(sk8VarB.c - f2)) << 32) | (((long) Float.floatToRawIntBits(sk8VarB.d - f)) & 4294967295L));
            if (xj5.a(giaVar.a.b.get(), giaVar)) {
                giaVar.b.h(sk8VarA);
            }
        }
    }
}
