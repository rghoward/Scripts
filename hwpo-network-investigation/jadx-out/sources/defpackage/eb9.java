package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class eb9 {
    public static final cw a = new cw(Float.NaN, Float.NaN);
    public static final dza b = new dza(new v7(1), new w7(2));
    public static final long c;
    public static final ty9<vf7> d;

    static {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.01f)) << 32) | (((long) Float.floatToRawIntBits(0.01f)) & 4294967295L);
        c = jFloatToRawIntBits;
        d = new ty9<>(3, new vf7(jFloatToRawIntBits));
    }
}
