package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class e75 {
    public static final amb a = new amb(0.31006f, 0.31616f);
    public static final amb b = new amb(0.34567f, 0.3585f);
    public static final amb c = new amb(0.32168f, 0.33767f);
    public static final amb d = new amb(0.31271f, 0.32902f);
    public static final float[] e = {0.964212f, 1.0f, 0.825188f};
    public static final /* synthetic */ int f = 0;

    public static final el9 a(el9 el9Var, el9 el9Var2, float f2) {
        long j = u7d.j(f2, el9Var.a, el9Var2.a);
        long j2 = el9Var.b;
        long j3 = el9Var2.b;
        float fC = vk6.c(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j3 >> 32)), f2);
        float fC2 = vk6.c(Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j3 & 4294967295L)), f2);
        return new el9(vk6.c(el9Var.c, el9Var2.c, f2), j, (Float.floatToRawIntBits(fC) << 32) | (Float.floatToRawIntBits(fC2) & 4294967295L));
    }
}
