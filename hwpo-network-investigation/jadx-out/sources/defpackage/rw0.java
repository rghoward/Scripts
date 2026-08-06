package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rw0 {
    public static final uu1 a = new uu1(new qw0(0));
    public static final a b = new a();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements pw0 {
        @Override // defpackage.pw0
        public final float a(float f, float f2, float f3) {
            float fAbs = Math.abs((f2 + f) - f);
            float f4 = (0.3f * f3) - (0.0f * fAbs);
            float f5 = f3 - f4;
            if ((fAbs <= f3) && f5 < fAbs) {
                f4 = f3 - fAbs;
            }
            return f - f4;
        }
    }
}
