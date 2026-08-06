package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ns0 {
    public static final ox6 a(ox6 ox6Var, float f, long j, b72 b72Var) {
        return b(ox6Var, f, new aw9(j), b72Var);
    }

    public static final ox6 b(ox6 ox6Var, float f, fx0 fx0Var, jl9 jl9Var) {
        return ox6Var.H(new us0(f, fx0Var, jl9Var));
    }

    public static final long c(float f, long j) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j >> 32)) - f);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) - f);
        return (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L);
    }
}
