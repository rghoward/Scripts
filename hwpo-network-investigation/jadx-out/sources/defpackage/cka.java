package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cka {
    public static final long a(double d) {
        return c((float) d, 4294967296L);
    }

    public static final long b(int i) {
        return c(i, 4294967296L);
    }

    public static final long c(float f, long j) {
        long jFloatToRawIntBits = j | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
        dka[] dkaVarArr = bka.b;
        return jFloatToRawIntBits;
    }
}
